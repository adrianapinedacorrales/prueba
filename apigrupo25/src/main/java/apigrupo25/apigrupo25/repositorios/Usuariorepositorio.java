package apigrupo25.apigrupo25.repositorios;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import apigrupo25.apigrupo25.modelos.UsuarioModelo;

@Repository 
public interface Usuariorepositorio extends MongoRepository<UsuarioModelo, Long>{
    ArrayList<UsuarioModelo> findByApellido(String apellido);
    ArrayList<UsuarioModelo> findByNombre(String nombre);
    ArrayList<UsuarioModelo> findByCorreo(String correo);

    
}
