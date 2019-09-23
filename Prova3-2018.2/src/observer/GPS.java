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
public class GPS extends ISubject{
    
    @Override
    public void atualizar() {
        System.out.println(" atualizando dados do GPS para <latitude> e <longitude>.");
    }
    
    private double latitude;
    private double longitude;
}
