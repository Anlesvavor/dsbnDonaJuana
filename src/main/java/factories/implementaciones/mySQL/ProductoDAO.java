package factories.implementaciones.mySQL;

import conexiones.Conexion;
import modelos.Producto;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ProductoDAO implements factories.interfaces.ProductoDAO {

    @Override
    public Boolean create(Producto obj) {
        try {

            Conexion conexion = Conexion.getInstance();
            Statement st = conexion.getConnecion().createStatement();
            st.execute(String.format(
                    Producto.CREATE,
                    obj.getClave(), obj.getDescripcion(), obj.getPrecio(), obj.getClasificacion(), obj.getExistencia(),
                    obj.getMinExistencia(), obj.getMaxExistencia()
                    )
            );
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override
    public List<Producto> read() {
        return null;
    }

    @Override
    public Producto read(Long id) {
        return null;
    }

    @Override
    public boolean update(Producto obj) {
        return false;
    }

    @Override
    public boolean update(Producto obj, String criteria) {
        return false;
    }

    @Override
    public Boolean deleteById(Long id) {
        return null;
    }

    @Override
    public Boolean deleteByCriteria(String criteria1, String criteria2) {
        return null;
    }
}
