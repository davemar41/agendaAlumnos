public class Alumno {
    private int codigo;
    private String nombre;
    private String domicilio;
    private String horario;
    private Boolean esPrincipiante;

    public Alumno(int codigo,String nombre,String domicilio,String horario,Boolean esPrincipiante ){
            this.codigo=codigo;
            this.nombre=nombre;
            this.domicilio=domicilio;
            this.esPrincipiante=esPrincipiante;
            this.horario=horario;
        System.out.println(codigo);

        System.out.println(nombre);
        setNombre(nombre);
        System.out.println(domicilio);
        setNombre(domicilio);
        System.out.println(horario);
        setNombre(horario);
        System.out.println(esPrincipiante);
        setEsPrincipiante(esPrincipiante);
    }

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


    @Override
    public String toString() {
        return "Alumno{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", horario='" + horario + '\'' +
                ", esPrincipiante=" + esPrincipiante +
                '}';
    }

    public AlmacenoDatos envio(){
        setCodigo(codigo);
        setNombre(nombre);
        setDomicilio(domicilio);
        setHorario(horario);
        setEsPrincipiante(esPrincipiante);
        return new AlmacenoDatos(codigo,nombre,domicilio,horario,esPrincipiante);

    }
}
