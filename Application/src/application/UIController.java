/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import interfaces.ICore;
import interfaces.IDocumentFactory;
import interfaces.IUIController;

/**
 *
 * @author aluno
 */
public class UIController implements IUIController {

	@Override
	public boolean initialize(ICore core) {
		mainWindow = new MainWindow();
		mainWindow.setVisible(true);
		initializeFileNew(core);
		return true;
	}

	@Override
	public JMenuItem addMenuItem(String menuName, String menuItemName) {
		JMenu myMenu = null;
		JMenuBar myMenuBar = mainWindow.getJMenuBar();
		for (int i = 0; i < myMenuBar.getMenuCount(); ++i) {
			if (myMenuBar.getMenu(i).getText().equals(menuName))
				myMenu = myMenuBar.getMenu(i);
		}

		if (myMenu == null) {
			myMenu = new JMenu(menuName);
			myMenuBar.add(myMenu);
		} else {
			for (int i = 0; i < myMenu.getItemCount(); ++i)
				if (myMenu.getItem(i).getText().equals(menuItemName))
					return null;
		}

		JMenuItem myMenuItem = new JMenuItem(menuItemName);
		myMenu.add(myMenuItem);

		mainWindow.pack();

		return myMenuItem;
	}

	private void initializeFileNew(ICore core) {
		JMenuItem fileNewItem = addMenuItem("File", "New");
		fileNewItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				JFileChooser jFileChooser = new JFileChooser();
				int returnDialog = jFileChooser.showDialog(jFileChooser, "Open");

				if (returnDialog == JFileChooser.APPROVE_OPTION) {
					String fileExtension = jFileChooser.getSelectedFile().getName().split("\\.")[1];
					List<IDocumentFactory> listDocumentFactories = core.getPluginController()
							.getLoadedPluginsByType(IDocumentFactory.class);

					if (!listDocumentFactories.isEmpty()) {
						for (IDocumentFactory documentFactory : listDocumentFactories) {
							String[] supportedExtensions = documentFactory.getSupportedExtensions().split("\\|");

							if (isSupportedByDocumentFactory(fileExtension, supportedExtensions, documentFactory)) {
								initializeProducts(documentFactory);
								return;
							}
						}
					}

					JOptionPane.showMessageDialog(null, UIController.MESSAGE);
				}
			}
		});
	}

	private boolean isSupportedByDocumentFactory(String fileExtensionOpened, String[] supportedExtensions,
			IDocumentFactory documentFactory) {
		for (String extension : supportedExtensions)
			if (extension.equals(fileExtensionOpened))
				return true;

		return false;
	}

	private void initializeProducts(IDocumentFactory documentFactory) {
		documentFactory.getDocumentEditor().open();
		documentFactory.getDocumentSerializer().load();
		documentFactory.getDocumentSerializer().save();
		documentFactory.getDocumentValidator().validate();
	}

	private MainWindow mainWindow;
	private static String MESSAGE = "The DocumentFactories can't open the document...";
}
