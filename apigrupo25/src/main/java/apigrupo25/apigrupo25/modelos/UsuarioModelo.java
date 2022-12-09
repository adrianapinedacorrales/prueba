package apigrupo25.apigrupo25.modelos;

import org.springframework.data.annotation.Id;

public class UsuarioModelo {
    @Id
    private Long documento;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private Long Telefono;
    private String Genero;



    public Long getDocumento() {
        return documento;
    }
    public void setDocumento(Long documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getCorreo() {
        return Correo;
    }
    public void setCorreo(String correo) {
        Correo = correo;
    }
    public Long getTelefono() {
        return Telefono;
    }
    public void setTelefono(Long telefono) {
        Telefono = telefono;
    }
    public String getGenero() {
        return Genero;
    }
    public void setGenero(String genero) {
        Genero = genero;
    }

   
}
