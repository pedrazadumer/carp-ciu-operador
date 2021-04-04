package co.edu.uniandes.carpetaciudadana.operador.contexto;

import co.edu.uniandes.carpetaciudadana.operador.servicios.ServicioUsuarios;
import co.edu.uniandes.carpetaciudadana.operador.servicios.impl.ServicioUsuariosDatosFalsos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfiguracionServicios {

    @Value("${url.base.bus}")
    private String urlBaseBus;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public ServicioUsuarios servicioUsuarios() {
        return new ServicioUsuariosDatosFalsos(urlBaseBus, restTemplate());
    }
}
