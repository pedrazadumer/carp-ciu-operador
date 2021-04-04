package co.edu.uniandes.carpetaciudadana.operador.controladores;

import co.edu.uniandes.carpetaciudadana.operador.dto.RespuestaRegistrarUsuarioDto;
import co.edu.uniandes.carpetaciudadana.operador.servicios.ServicioUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControladorPruebaUsuarios {

    @Autowired
    private ServicioUsuarios servicioUsuarios;

    @PostMapping("registrar-usuario-prueba")
    public RespuestaRegistrarUsuarioDto registrarUsuarioPrueba() {
        return servicioUsuarios.registrarUsuario(null);
    }
}
