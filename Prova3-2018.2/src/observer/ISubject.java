/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public abstract class ISubject {
    
    public ISubject(){
        this.observers = new ArrayList<>();
    }
    
    public void addSubscriber(IObserver o){
        this.observers.add(o);
    }
    
    public void removeSubscriber(IObserver o){
        this.observers.remove(o);
    }
    
    public void collectNewValue(){
        System.out.println("Colentando novos valores de " + this.getClass().getName().split("\\.")[1]);
        notifyObserver();
    }
    
    private void notifyObserver(){
        for(IObserver observer : this.observers)
            observer.update(this);
    }
    
    public abstract void atualizar();
    
    protected List<IObserver> observers;
}
