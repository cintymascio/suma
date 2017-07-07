/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import controlador.ControladorSumaMouse;
import controlador.ControladorSuma2Mouse;
import controlador.ControladorWindows;

import java.awt.*;
import javax.swing.*;

 

public class Menu extends frame {
    
    ControladorSumaMouse controladorSumaMouse = new ControladorSumaMouse();
    ControladorSuma2Mouse controladorSuma2Mouse = new ControladorSuma2Mouse();
    ControladorWindows controladorWindows = new ControladorWindows();
    GridLayout contenedor = new GridLayout(0,2);
    
     public Menu() {
        this.setSize(300, 300);
        this.setTitle("Menu");
        this.setLocation(100, 100);
        this.addWindowListener(ControladorWindows);
        this.setLayout(contenedor);
        this.AgregarComponente();
    }
    public void AgregarComponente() {
        JButton aceptar = new JButton();
        aceptar.setName("suma 1");
        aceptar.setText("suma 1");
        aceptar.setVisible(true);
        
        aceptar.addMouseListener(controladorSumaMouse);
        
        
        
        JButton salir = new JButton();
        salir.setName("suma2");
        salir.setText("Suma2");
        salir.setVisible(true);
        
        this.add(aceptar);
        this.add(salir);
        this.setVisible(true);
    }
    
    
}

    
    
    
}
