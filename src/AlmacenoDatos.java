import java.sql.*;
public class AlmacenoDatos {
    private int codigo;
    private String nombre;
    private String domicilio;
    private Boolean esPrincipiante;
    private String horario;

    private  String driver="com.mysql.jbc.driver";
        private  String bbdd="jbdc:mysql//localhost/alumnos";
    private  String usuario = "root";
    private  String password="";

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Boolean getEsPrincipiante() {
        return esPrincipiante;
    }

    public void setEsPrincipiante(Boolean esPrincipiante) {
        this.esPrincipiante = esPrincipiante;
    }

    public AlmacenoDatos(int codigo,String nombre, String domicilio, String horario, Boolean esPrincipiante){
        this.codigo=codigo;
        this.nombre=nombre;
        this.domicilio=domicilio;
        this.esPrincipiante=esPrincipiante;
        this.horario=horario;

        System.out.println(codigo);
        System.out.println(nombre);
        System.out.println(domicilio);
        System.out.println(esPrincipiante);
        System.out.println(horario);




    }

    @Override
    public String toString() {
        return "AlmacenoDatos{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", esPrincipiante=" + esPrincipiante +
                ", horario='" + horario + '\'' +
                '}';
    }
    Connection miconexion;
    public Connection miconexion(){
        Connection conec=null;

        try {
            String micodigo=String.valueOf(getCodigo());
            String minombre="";
            String midomicilio="";
            String miesprincipiante="";
            String mihorario="";

            miconexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnos","root","");











        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }return conec;
    }public void cerrarconexion(Connection miconexion){
        try {
            miconexion.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }PreparedStatement psInsertar=null;
    public void metodoinserto(){

            if(null==psInsertar){
                try {
                    psInsertar= miconexion.prepareStatement("INSERT INTO misalumnos(codigo,nombre,domicilio,esprincipiante,horario)VALUES(?,?,?,?,?)");
                    psInsertar.setInt(1,getCodigo());
                    psInsertar.setString(2,getNombre());
                    psInsertar.setString(3,getDomicilio());
                    psInsertar.setBoolean(4,getEsPrincipiante());
                    psInsertar.setString(5,getHorario());
                    psInsertar.executeUpdate();
                    System.out.println("un nuevo alumno fue ingresado");
                    miconexion.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }





    }
}
