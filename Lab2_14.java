/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fun;
import java.applet.Applet;
import java.awt.*;
/**
 *
 * @author 2
 */
public class Lab2_14 extends Applet{
    public void paint (Graphics page){
    
    final int MID=75;
    final int TOP=100;
    
    setBackground(Color.white);
    page.setColor(Color.BLACK);
    
    page.drawOval(MID, TOP-60, 150, 150); //face shape
    
    page.drawOval(MID+35, TOP-30, 20, 20); //eyes
    page.drawOval(MID+85, TOP-30, 20, 20); //eyes
    
    page.fillOval(MID+43, TOP-25, 7, 7);//pupils
    page.fillOval(MID+93, TOP-25, 7, 7);//pupils

    page.drawOval(MID+150, TOP, 20, 25); //ears
    page.drawOval(MID-20, TOP, 20, 25); //ears

   page.drawLine(MID+70,75,MID+70,125);//nose
   page.drawLine(MID+60,125, MID+80, 125);//nose
   
   page.drawArc(MID+50, TOP+40, 40, 10, 190, 160);//smile

    }
}
