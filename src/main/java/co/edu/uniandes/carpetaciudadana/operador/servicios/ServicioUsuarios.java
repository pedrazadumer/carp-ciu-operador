package co.edu.uniandes.carpetaciudadana.operador.servicios;

import co.edu.uniandes.carpetaciudadana.operador.dto.PeticionRegistrarUsuarioDto;
import co.edu.uniandes.carpetaciudadana.operador.dto.RespuestaRegistrarUsuarioDto;

public interface ServicioUsuarios {

    RespuestaRegistrarUsuarioDto registrarUsuario(PeticionRegistrarUsuarioDto peticionRegistrarUsuario);

}
