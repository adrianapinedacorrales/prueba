package apigrupo25.apigrupo25.servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apigrupo25.apigrupo25.modelos.UsuarioModelo;
import apigrupo25.apigrupo25.repositorios.Usuariorepositorio;

@Service
public class Usuarioservicio {
    @Autowired
    Usuariorepositorio repositorio;
    public UsuarioModelo guardarUsuario(UsuarioModelo usuario){
        return repositorio.save(usuario);
    }
    public ArrayList<UsuarioModelo> consultarUsuarios(){
        return (ArrayList<UsuarioModelo>) repositorio.findAll();
    }

    public Optional <UsuarioModelo> buscarPorDocumento(Long documento){
        return repositorio.findById(documento);
    }

    public boolean eliminaUsuario(Long documento){
        if (repositorio.existsById(documento)){
            repositorio.deleteById(documento);
            return true;
        }
        else {
            return false;
        }
    }

    public ArrayList<UsuarioModelo> buscarXapellido(String apellido){
        return repositorio.findByApellido(apellido);

    }

    public ArrayList<UsuarioModelo> buscarXnombre(String nombre){
        return repositorio.findByNombre(nombre);
    }

    public ArrayList<UsuarioModelo> buscarXcorreo(String correo){
        return repositorio.findByCorreo(correo);
    }

}
