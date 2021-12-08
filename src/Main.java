import javax.swing.*;

public class Main {
    public static void main(String[]args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame inicio=new PantallaPrincipal();
                inicio.setTitle("Alumnos David Martin");
                inicio.setSize(400,300);
                inicio.setVisible(true);
                inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

    }
}
