package ubilapaz.edu.bo.clasetaller.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ubilapaz.edu.bo.clasetaller.domain.Producto;
import ubilapaz.edu.bo.clasetaller.domain.User;
import ubilapaz.edu.bo.clasetaller.dto.ProductoDto;
import ubilapaz.edu.bo.clasetaller.dto.UserDto;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto,Integer> {
    @Query(value = "SELECT new ubilapaz.edu.bo.clasetaller.dto.ProductoDto(r.codigo, r.nombre, r.precio) FROM Producto r order by id desc")
    List<ProductoDto> obtenerLista();
}
