
package com.projectindividu;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Ular extends JFrame {

    public Ular() 
    {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Frame());
               
        setResizable(false);
        pack();
        
        setTitle("Game Ular");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new Ular();
            ex.setVisible(true);
        });
    }
}
