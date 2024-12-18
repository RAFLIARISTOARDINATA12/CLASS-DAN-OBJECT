/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class CarDemo {
public static void main(String [] args) {
   Car car1 = new Car();
   Car car2 = new Car();
   
car1.changeCadence(50);
car1.speedup(20);

car1.changeGear (2);
car1.printInfo();

car2.changeCadence(30);
car2.speedup(10);
car2.changeGear (1);
car1.printInfo();
}  
}
