/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fun;
import java.awt.*;
import java.applet.Applet;

/**
 * Aadi Jain
 * @author 2
 */
public class Lab2_13 extends Applet{
      public void paint (Graphics page){

    final int MID=170;
    final int TOP=50;
    
    setBackground(Color.cyan);
    
    page.setColor (Color.blue);  //ground
    page.fillRect(0, 175, 400, 50);
    
    page.setColor(Color.yellow); 
    page.fillOval(300,-40,80,80);//sun
    
    page.setColor(Color.white);
    page.fillOval(MID-20, TOP, 40, 40); //head
    page.fillOval(MID-35, TOP+35, 70, 50); // upper torso
    page.fillOval(MID-50, TOP+80, 100, 60); //lower torso
    
    page.setColor(Color.red);
    page.fillRect(MID-5, TOP+40, 7,7); //buttons to torso
    page.fillRect(MID-5, TOP+57, 7,7); //buttons to torso
    
    page.drawString("Aadi Jain", 15, 15);//name
    
    page.setColor(Color.black); //head
    page.fillOval(MID-10, TOP+10, 5, 5); //left eye
    page.fillOval(MID+5, TOP+10, 5,5); //right eye
    
    page.drawArc(MID-10, TOP+20, 20, 35, 60, 80); //smile
    
    page.drawLine(MID-25, TOP+60, MID-50, TOP+40); // left arm
    page.drawLine(MID+25, TOP+60, MID+55, TOP+60); // right arm
    
    page.drawLine(MID-20, TOP+5, MID+20, TOP+5); // brim of hat
    page.fillRect(MID-15, TOP-20, 30, 25); //top of hat
}
}
