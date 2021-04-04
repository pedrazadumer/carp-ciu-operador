package co.edu.uniandes.carpetaciudadana.operador.dto;

import lombok.Data;

@Data
public class OperadorDto {

    private String nombre;
    private boolean esServicioPremium;
    private UsuarioDto usuario;

}
