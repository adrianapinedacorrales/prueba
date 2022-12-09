package apigrupo25.apigrupo25.controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apigrupo25.apigrupo25.modelos.UsuarioModelo;
import apigrupo25.apigrupo25.servicios.Usuarioservicio;
@RestController
//http://localhost:8080/usuario
@RequestMapping ("/usuario")
@CrossOrigin("*")
public class Usuariocontrolador {
    
    @Autowired
    Usuarioservicio servicio;
    //http://localhost:8080/usuario/guardar
    @PostMapping("/guardar")
    public UsuarioModelo guardarUsuario(@RequestBody UsuarioModelo usuario){
        return servicio.guardarUsuario(usuario);
    }

    //http://localhost:8080/usuario/consultar
    @GetMapping ("/consultar")
    public ArrayList<UsuarioModelo> consultarUsuario(){
        return servicio.consultarUsuarios();
    }
    
    //http://localhost:8080/usuario/buscar-id/123454
    @GetMapping ("/buscar-id/{documento}")
    public Optional<UsuarioModelo> idUsuario(@PathVariable("documento")Long documento){
        return servicio.buscarPorDocumento(documento);
    }

    //http://localhost:8080/usuario/eliminar-id/1234
    @DeleteMapping("/eliminar-id/{documento}")
    public boolean eliminar(@PathVariable("documento")Long documento){
        return servicio.eliminaUsuario(documento);
    }

    //http://localhost:8080/usuario/buscarxapellido/pineda
    @GetMapping("/buscarxapellido/{apellido}")
    public ArrayList<UsuarioModelo> buscaXapellido(@PathVariable ("apellido") String apellido){
        return servicio.buscarXapellido(apellido);
    }

    //http://localhost:8080/usuario/buscarxnombre/adriana
    @GetMapping("/buscarxnombre/{nombre}")
    public ArrayList<UsuarioModelo> buscaXnombre(@PathVariable ("nombre") String nombre){
        return servicio.buscarXnombre(nombre);
    
    }

    //http://localhost:8080/usuario/buscarxcorreo/
    @GetMapping("/buscarxcorreo/{correo}")
    public ArrayList<UsuarioModelo> buscaXcorreo(@PathVariable ("correo") String correo){
        return servicio.buscarXapellido(correo);
    }
}
