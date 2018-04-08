package factories.implementaciones.mySQL;

import conexiones.Conexion;
import modelos.Producto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
        List<Producto> productos = new ArrayList<>();
        try {
            Conexion conexion = Conexion.getInstance();
            Statement st = conexion.getConnecion().createStatement();
            ResultSet res = st.executeQuery(Producto.READ_ALL);
            while (res.next()){
                productos.add(makeProducto(res));
            }
        }catch ( ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
        return productos;
    }

    @Override
    public Producto read(Integer clave) {
        Producto producto = null;
        try {
            Conexion conexion = Conexion.getInstance();
            Statement st = conexion.getConnecion().createStatement();
            ResultSet res = st.executeQuery(String.format(Producto.READ_BY_ID, clave));
            while (res.next()){
                producto = makeProducto(res);
            }
        }catch ( ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
        return producto;
    }

    @Override
    public List<Producto> readByCriteria(String column, String criteria){
        List<Producto> productos = new ArrayList<>();
        try {
            Conexion conexion = Conexion.getInstance();
            Statement st = conexion.getConnecion().createStatement();
            ResultSet res = st.executeQuery(String.format(Producto.READ_BY_CRITERIA, column, criteria));
            while (res.next()){
                productos.add(makeProducto(res));
            }
        }catch ( ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
        return productos;
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
    public Boolean deleteById(Integer clave) {
        try {
            Conexion conexion = Conexion.getInstance();
            Statement st = conexion.getConnecion().createStatement();
            st.execute(String.format(Producto.DELETE_BY_ID, clave));
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override
    public Boolean deleteByCriteria(String criteria1, String criteria2) {
        return null;
    }

    private Producto makeProducto(ResultSet rs) throws SQLException {
        Producto producto = new Producto();
        Integer i = 1;
        producto.setClave(rs.getInt(i++));
        producto.setDescripcion(rs.getString(i++));
        producto.setPrecio(rs.getFloat(i++));
        producto.setClasificacion(rs.getString(i++));
        producto.setExistencia(rs.getFloat(i++));
        producto.setMinExistencia(rs.getFloat(i++));
        producto.setMaxExistencia(rs.getFloat(i));
        return producto;
    }

    public List<String> getClasificaciones(){
        List<String> resultado = new ArrayList<>();
        try {
            Conexion conexion = Conexion.getInstance();
            Statement st = conexion.getConnecion().createStatement();
            ResultSet rs = st.executeQuery(String.format("SELECT DISTINCT %s FROM %s", Producto.FIELD_CLAS, Producto.TABLE));
            while(rs.next()){
                resultado.add(rs.getString(1));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resultado;
    }
}
