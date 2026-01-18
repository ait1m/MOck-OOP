/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Pigeous extends Animal{
    public Pigeous(){
        super("",150, 0);

    }
    
    public Pigeous(String name, int age){
        super(name, 150, age);
        
    }
    
    public void wingAttack(Animal a, int times){
        a.setPower(a.getPower() - (5 * times));
    }
    
    @Override
    public void eat(Food f){
        this.setPower(this.getPower() + (f.getPower()*2));
    }
    
    public void fly(){
        System.out.println(this.getName() + " fly fly ....");
    }
    
    public void wingAttack(Animal a){
        a.setPower(a.getPower() - 5);
    }
    
}
