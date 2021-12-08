import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaPrincipal extends JFrame{
    private JPanel Frame;
    private JLabel AgregarLabel;
    private JButton AgregarAlumno;
    private JButton Lista;
    private JLabel ListaAlumnos;
    private JLabel AgregarTarea;
    private JButton TareaAlumno;


    public PantallaPrincipal(){

        setContentPane(Frame);


        AgregarAlumno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JFrame otroalumno=new NuevoAlumno();
                        otroalumno.setSize(500,400);
                        otroalumno.setVisible(true);

                    }
                });
            }
        });
    }
}
