package co.edu.uniandes.carpetaciudadana.operador.servicios.impl;

import co.edu.uniandes.carpetaciudadana.operador.dto.OperadorDto;
import co.edu.uniandes.carpetaciudadana.operador.dto.PeticionRegistrarUsuarioDto;
import co.edu.uniandes.carpetaciudadana.operador.dto.RespuestaRegistrarUsuarioDto;
import co.edu.uniandes.carpetaciudadana.operador.dto.UsuarioDto;
import co.edu.uniandes.carpetaciudadana.operador.servicios.ServicioUsuarios;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

public class ServicioUsuariosDatosFalsos implements ServicioUsuarios {

    private static final String CONTEXTO_API_USUARIOS = "/api/v1/usuarios";

    private final String urlBaseBus;
    private final RestTemplate restTemplate;

    public ServicioUsuariosDatosFalsos(String urlBaseBus, RestTemplate restTemplate) {
        this.urlBaseBus = urlBaseBus;
        this.restTemplate = restTemplate;
    }

    public RespuestaRegistrarUsuarioDto registrarUsuario(PeticionRegistrarUsuarioDto peticionRegistrarUsuario) {
        ResponseEntity<RespuestaRegistrarUsuarioDto> respuesta = this.restTemplate.postForEntity(
                this.urlBaseBus + CONTEXTO_API_USUARIOS,
                crearPeticionDePrueba(),
                RespuestaRegistrarUsuarioDto.class,
                Collections.singletonMap("Content-Type", "application/json"));

        return respuesta.getBody();
    }

    private static PeticionRegistrarUsuarioDto crearPeticionDePrueba() {
        PeticionRegistrarUsuarioDto peticionRegistrarUsuario = new PeticionRegistrarUsuarioDto();
        OperadorDto operador = new OperadorDto();
        UsuarioDto usuario = new UsuarioDto();
        usuario.setNumIdentificacion("12345789");
        usuario.setTipoDocIdentidad("Cedula");
        usuario.setClave("xyusmsd");
        operador.setNombre("OperadorA");
        operador.setEsServicioPremium(false);
        operador.setUsuario(usuario);
        peticionRegistrarUsuario.setOperador(operador);
        return peticionRegistrarUsuario;
    }
}
