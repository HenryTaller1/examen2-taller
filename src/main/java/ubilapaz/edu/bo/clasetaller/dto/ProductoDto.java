package ubilapaz.edu.bo.clasetaller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ProductoDto {
    public String codigo;
    public String nombre;
    public Double precio;

//    public UserDto(String codigo, String nombre, Double precio) {
//        this.codigo = codigo;
//        this.precio = precio;
//        this.nombre = nombre;
    }


