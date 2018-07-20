/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mizar
 */
public class ContactView extends JPanel{
    
    private AddressView addressPanel = new AddressView();
    private BirthdayView birthdayPanel = new BirthdayView();
    private EmailView emailPanel = new EmailView();
    private FormattedNameView formattedNamePanel = new FormattedNameView();
    private NameView namePanel = new NameView();
    private PhotoView photoPanel = new PhotoView();
    private TelephoneView telephonePanel = new TelephoneView();
    private JLabel headerLabel = new JLabel("Contacto");
    private JButton bottomButton = new JButton("Guardar cambios");
    private JButton returnButton = new JButton("Regresar");
    private JPanel bottomPanel = new JPanel(new GridLayout(1,2));
    public ContactView(){
        
        addressPanel  = new AddressView();
        birthdayPanel = new BirthdayView();
        emailPanel = new EmailView();
        formattedNamePanel = new FormattedNameView();
        namePanel = new NameView();
        photoPanel = new PhotoView();
        telephonePanel = new TelephoneView();
      
        JPanel headerPanel = new JPanel(new FlowLayout());
        headerPanel.add(headerLabel);
        this.add(headerPanel);
        this.add(photoPanel);
        this.add(formattedNamePanel);
        this.add(namePanel);
        this.add(birthdayPanel);
        this.add(telephonePanel);
        this.add(addressPanel);
        this.add(emailPanel);
        
        
        
        JPanel firstButtonPanel = new JPanel(new FlowLayout());
        firstButtonPanel.add(bottomButton);
        JPanel secondButtonPanel = new JPanel(new FlowLayout());
        secondButtonPanel.add(returnButton);
        bottomPanel.add(firstButtonPanel);
        bottomPanel.add(secondButtonPanel);
        bottomPanel.setVisible(false);
        this.add(bottomPanel);
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));       
    }
    
    public void makeStatic(boolean b){
        addressPanel.makeStatic(b);
        //birthdayPanel.makeStatic(b);
        emailPanel.makeStatic(b);
        formattedNamePanel.makeStatic(b);
        namePanel.makeStatic(b);
        //photoPanel.makeStatic(b);
        telephonePanel.makeStatic(b);
        bottomPanel.setVisible(!b);
        //revalidate();
        //repaint();
    }
    
    public JButton getReturnButton(){
        return this.returnButton;
    }
}