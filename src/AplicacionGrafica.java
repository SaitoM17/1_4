/**
 *
 * @author Said Mariano
 */
import javax.swing.*;

public class AplicacionGrafica extends JFrame{
    private JPanel contentPane;
    public AplicacionGrafica(){
        setTitle("Titulo de la ventana");
        
        setBounds(400, 200, 607, 448);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setVisible(true);
        
        contentPane =new JPanel();
        
        contentPane.setLayout(null);
        
        setContentPane(contentPane);
        
        //creacion de componentes
        
        //Etiqueta_1
        JLabel etiqueta = new JLabel("Hola mundo");
        etiqueta.setBounds(60, 20, 100, 20);
        contentPane.add(etiqueta);
        
        //Campo de texto_2 
        JTextField textField = new JTextField();
        textField.setBounds(43, 67, 86, 26);
        contentPane.add(textField); 

        //Boton_3
        JButton btnPulsame = new JButton("Pulsame");
        btnPulsame.setBounds(43, 133, 89, 23);
        contentPane.add(btnPulsame); 
        
        //Boton radio_4
        JRadioButton rdbtnOpcion= new JRadioButton("Opcion1", true);
        rdbtnOpcion.setBounds(43, 194, 109, 23);
        contentPane.add(rdbtnOpcion);

        JRadioButton rdbtnOpcion_1 = new JRadioButton("Opcion 2", false);
        rdbtnOpcion_1.setBounds(43, 220, 109, 23);
        contentPane.add(rdbtnOpcion_1);

        JRadioButton rdbtnOpcion_2 = new JRadioButton("Opcion 3", false);
        rdbtnOpcion_2.setBounds(43, 246, 109, 23);
        contentPane.add(rdbtnOpcion_2);

        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(rdbtnOpcion);
        bgroup.add(rdbtnOpcion_1);
        bgroup.add(rdbtnOpcion_2);
        
        //Boton checkbox_5
        JCheckBox chchxOpcion = new JCheckBox(" Opcion 1", true);
        chchxOpcion.setBounds(43, 305, 97, 23);
        contentPane.add(chchxOpcion);

        JCheckBox chckbxNewCheckBox = new JCheckBox(" Opcion 2", true);
        chckbxNewCheckBox.setBounds(43, 325, 97, 23);
        contentPane.add(chckbxNewCheckBox);

        JCheckBox chckbxOpcion_1 = new JCheckBox(" Opcion 3", false);
        chckbxOpcion_1.setBounds(43, 346, 97, 23);
        contentPane.add(chckbxOpcion_1);

        //Texto de Area_6
        JTextArea textArea = new JTextArea("prueva");
        textArea.setBounds(189, 18, 141, 117);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        contentPane.add(textArea);
        
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setBounds(189, 18, 141, 117);
        contentPane.add(scroll);
        
        //campo de password_7
        JPasswordField pwd = new JPasswordField("fernando");
        pwd.setBounds(189, 171, 139, 20);
        contentPane.add(pwd);
        
        //Menu de selecion_8
        JComboBox comboBox = new JComboBox<>();
        comboBox.setBounds(189, 221, 141, 22);
        contentPane.add(comboBox);

        comboBox.addItem("Fernando");
        comboBox.addItem("Alberto");
        comboBox.addItem("Arturo");
        
        //Interruptor_9
        JToggleButton tglbtnNewToggleButton = new JToggleButton("Interruptor", true);
        tglbtnNewToggleButton.setBounds(189, 291, 121, 23);
        contentPane.add(tglbtnNewToggleButton);
        
        //JSpinner
        JSpinner spinner = new JSpinner();
        spinner.setBounds(371, 20, 29, 20);
        contentPane.add(spinner);
        
    }
    
    public static void main(String[] args){
        AplicacionGrafica ventana = new AplicacionGrafica();
    }
}