/*
  * Código creado para calcular Fibonacci Y Factorial
  * Creado el 22/08/2017
  * http://coatl.cecyt9.ipn.mx/eoropezaWEB/home.html
*/
// Encontramos la carpeta en donde se localiza fibonaccifactorial

package binomiocuadrado;
 
// Importamos todos los elementos necesarios
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.*;
import javax.swing.JTextField;

// Creamos la clase Menú implementando los importes.

public class Inter extends JFrame implements ActionListener {

    // Creamos Botones y Cajas de Texto

    private JLabel titulo;
    private JLabel instruccion;
    private JTextField numero1;
    private JTextField numero2;
    private JTextField resultado;
    private JButton cuadrado;

    //Configuramso la ventana
    public Inter() {
        configurarVentana();
        iniciarComponentes();
    }

    // Aquí comienza la configuración de la ventana
    private void configurarVentana() {
        setTitle("BINOMIO AL CUADRADO");
        setSize(650, 510);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setIconImage(new ImageIcon(getClass().getResource("PICS/rascacielos.jpg")).getImage());
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon IMG = new ImageIcon(this.getClass().getResource("PICS/rascacielos.jpg"));
        JLabel PIC = new JLabel();
        PIC.setIcon(IMG);
        getLayeredPane().add(PIC, JLayeredPane.FRAME_CONTENT_LAYER);
        PIC.setBounds(0, 0, 800, 600);
    }

    // Inicializamos los botones y cajas de textos, ademas de darles propiedades.
    private void iniciarComponentes() {
        titulo = new JLabel(" ¡ HOLA BIENVENIDO !");
        titulo.setBounds(230, 40, 200, 40);
        titulo.setFont(new Font("TimesRoman", Font.BOLD, 18));
        add(titulo);

        instruccion = new JLabel("Inserta los numeros");
        instruccion.setBounds(250, 85, 450, 40);
        instruccion.setFont(new Font("TimesRoman", Font.BOLD, 12));
        add(instruccion);

        numero1 = new JTextField();
        numero1.setBounds(100, 150, 150, 30);
        numero1.setFont(new Font("TimesRoman", Font.BOLD, 12));
        numero1.addKeyListener(new KeyAdapter() {
           
       // Validamos para que no se puedan escribir letras o signos.
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume(); // ignorar el evento de teclado
                }
            }
        });
        add(numero1);
        
        numero2 = new JTextField();
        numero2.setBounds(350, 150, 150, 30);
        numero2.setFont(new Font("TimesRoman", Font.BOLD, 12));
        numero2.addKeyListener(new KeyAdapter() {
           
       // Validamos para que no se puedan escribir letras o signos.
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume(); // ignorar el evento de teclado
                }
            }
        });
        add(numero2);

        cuadrado = new JButton();
        cuadrado.setBounds (230, 250, 150, 30);
        cuadrado.setText("Calcular");
        cuadrado.addActionListener(this);
        add(cuadrado);

        
        resultado = new JTextField();
        resultado.setBounds(230, 350, 150, 30);
        resultado.setFont(new Font("TimesRoman", Font.BOLD, 12));
        add(resultado);
        
    }
    // Cierre de la creación de botones y cajas de texto
    // Comenzamos a calcular el fibonacci
    // Opcion uno fibonacci
    // Opcion dos factorial
    @Override
    public void actionPerformed(ActionEvent e) {
        int num1, num2, num3;
        String res1, res2, res3;
        if(e.getActionCommand().equals(cuadrado))
        {
            num1 = Integer.parseInt(numero1.getText());
            num3 = Integer.parseInt(numero2.getText());
            
            num1 = num1*num1;
            num2 = 2*num1*num3;
            num3 = num3*num3;
            res1 = String.valueOf(num1);
            res2 = String.valueOf(num2);
            res3 = String.valueOf(num3);
           
            resultado.setText("GGG");
        } 
    }
    // Cierre del actionPerformed

}
//Cierre de la clase
