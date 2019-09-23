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
public class Acelerometro extends ISubject{

    @Override
    public void atualizar() {
        System.out.println(" atualizando dados do Acelerômetro para <x>, <y> e <z>.");
    }
    
    private int x;
    private int y;
    private int z;
}
