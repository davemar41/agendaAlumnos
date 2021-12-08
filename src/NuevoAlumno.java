import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NuevoAlumno extends JFrame{
    private JPanel Frame2;
    private JTextField nombretext;
    private JTextField domiciliotext;
    private JTextField horariotext;
    private JCheckBox esPrincipianteCheckBox;
    private JLabel AgregarTarea;
    private JButton AgregarTareabutton;
    private JLabel VerTarea;
    private JButton vertareabutton;
    private JLabel nombrelabel;
    private JLabel domiciliolabel;
    private JLabel horariolabel;
    private JLabel esprincipiantelabel;
    private JButton botonqueguarda;
    private JTextField CodigoAlumno;
    private JLabel CodigoAlumnolabel;
    private int codigo;
    private String nombre;
    private String domicilio;
    private String horario;
    private Boolean esPrincipiante;


    public Alumno RecogidaDatos(){
        String micodigo=CodigoAlumno.getText();
        codigo=Integer.parseInt(micodigo);
        nombre=nombretext.getText();
        domicilio=domiciliotext.getText();
        horario=horariotext.getText();
        esPrincipiante=esPrincipianteCheckBox.isSelected();
        return new Alumno(codigo,nombre,domicilio,horario,esPrincipiante);

    }


    public NuevoAlumno(){
        setContentPane(Frame2);


        botonqueguarda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(RecogidaDatos().toString());
                AlmacenoDatos misdatos=new AlmacenoDatos(codigo,nombre,domicilio,horario,esPrincipiante);
                System.out.println( new AlmacenoDatos(codigo,nombre,domicilio,horario,esPrincipiante).toString());
                misdatos.miconexion();
                misdatos.metodoinserto();
                //misdatos.cerrarconexion();







            }
        });
    }
}
