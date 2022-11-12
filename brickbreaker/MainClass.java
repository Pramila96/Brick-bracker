/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brickbreaker;
import javax.swing.JFrame;
/**
 *
 * @author SAI
 */
public class MainClass {
 public static void main(String[] args)
 {
     JFrame obj=new JFrame();
     GamePlay gameplay=new GamePlay();
     
    // obj.setSize(700,600);
     obj.setBounds(10,10,700,600);
     obj.setTitle("BrickBreaker");
    // obj.setLocationRelativeTo(null);
     obj.setResizable(false);
     obj.setVisible(true);
     obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     obj.add(gameplay);
     
     
 }
}
