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
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IObserver uber = new UberApp();
        IObserver waze = new WazeApp();
        ISubject gps = new GPS();
        ISubject acelerometro = new Acelerometro();

        acelerometro.addSubscriber(uber);
        acelerometro.addSubscriber(waze);
        acelerometro.collectNewValue();

        System.out.println("---------------------------------------");

        gps.addSubscriber(uber);
        gps.addSubscriber(waze);
        gps.collectNewValue();

    }

}
