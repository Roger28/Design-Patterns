/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author aluno
 */
public class UberApp implements IObserver{

    @Override
    public void update(ISubject subject) {
        System.out.print("UberApp");
        subject.atualizar();
    }
   
}
