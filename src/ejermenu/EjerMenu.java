
package ejermenu;

import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javafx.scene.control.ComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class EjerMenu extends JFrame{
    private JLabel JLabelIngredientes, JLabelEligeBebida, JLabelEligePostre;
    private JCheckBox JCheckBoxCebolla,JCheckBoxQueso,JCheckBoxLechuga,JCheckBoxTomate;
    private JComboBox ComboBoxBebida;
    private JRadioButton JRadioButtonPastel;
    private JRadioButton JRadioButtonCafe;
    private ButtonGroup ButtonGroupGrupo;
    private JButton JButtonMenu;
    private TextArea TextAreaPrintar;

    public EjerMenu() {
        //CARACTERISTICAS
        setTitle("Menu");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        
        JLabelIngredientes=new JLabel();
        JLabelIngredientes.setText("Ingredientes:");
        JLabelIngredientes.setBounds(20, 20, 100, 20);
        add(JLabelIngredientes);
        
        JLabelEligeBebida=new JLabel();
        JLabelEligeBebida.setText("Elige la bebida:");
        JLabelEligeBebida.setBounds(20, 100, 100, 20);
        add(JLabelEligeBebida);
        
        JLabelEligePostre=new JLabel();
        JLabelEligePostre.setText("Elige tu postre:");
        JLabelEligePostre.setBounds(20, 170, 100, 20);
        add(JLabelEligePostre);
        
        JCheckBoxCebolla=new JCheckBox("Cebolla");
        JCheckBoxCebolla.setBounds(10, 50, 82, 20);
        add(JCheckBoxCebolla);
        JCheckBoxQueso=new JCheckBox("Queso");
        JCheckBoxQueso.setBounds(90, 50, 82, 20);
        add(JCheckBoxQueso);
        JCheckBoxLechuga=new JCheckBox("Lechuga");
        JCheckBoxLechuga.setBounds(170, 50, 82, 20);
        add(JCheckBoxLechuga);
        JCheckBoxTomate=new JCheckBox("Tomate");
        JCheckBoxTomate.setBounds(250, 50, 82, 20);
        add(JCheckBoxTomate);
        
        ComboBoxBebida=new JComboBox();
        ComboBoxBebida.setBounds(20, 130, 100, 20);
        ComboBoxBebida.addItem("Agua");
        ComboBoxBebida.addItem("Refresco");
        ComboBoxBebida.addItem("Cerveza");
        add(ComboBoxBebida);
        
        JRadioButtonPastel=new JRadioButton("Pastel");
        JRadioButtonPastel.setBounds(20, 200, 82, 20);
        add(JRadioButtonPastel);
        
        JRadioButtonCafe=new JRadioButton("Cafe");
        JRadioButtonCafe.setBounds(100, 200, 82, 20);
        add(JRadioButtonCafe);
        
        ButtonGroupGrupo=new ButtonGroup();
        ButtonGroupGrupo.add(JRadioButtonPastel);
        ButtonGroupGrupo.add(JRadioButtonCafe);
        
        JButtonMenu=new JButton("MENU");
        JButtonMenu.setBounds(60, 240, 100, 30);
        JButtonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String texto = "Hamburguesa de\n";
                if(JCheckBoxCebolla.isSelected())
                    texto+="- Cebolla\n";
                if(JCheckBoxQueso.isSelected())
                    texto+="- Queso\n";
                if(JCheckBoxLechuga.isSelected())
                    texto+="- Lechuga\n";
                if(JCheckBoxTomate.isSelected())
                    texto+="- Tomate\n";
                
                texto+="\nBebida:";
                
                  if(ComboBoxBebida.getSelectedItem().equals("Agua")){
                      texto+=" Agua";
                  }
                  else if(ComboBoxBebida.getSelectedItem().equals("Refresco")){
                      texto+=" Refresco";
                  }
                  else if(ComboBoxBebida.getSelectedItem().equals("Cerveza")){
                      texto+=" Cerveza";
                  }
                  
                  texto+="\nPostre:";
                  
                  if(JRadioButtonPastel.isSelected())
                      texto+=" Pastel";
                  else if(JRadioButtonCafe.isSelected())
                      texto+=" Cafe";
                 TextAreaPrintar.setText(texto);
            }
           
        });
        add(JButtonMenu);
        
        TextAreaPrintar=new TextArea();
        TextAreaPrintar.setBounds(20, 280, 200, 150);
        add(TextAreaPrintar);
 
    }
    
    public static void main(String[] args) {
        EjerMenu v=new EjerMenu();
        v.setVisible(true);
    }
    
}
