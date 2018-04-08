package factories.interfaces;

import modelos.Producto;

import java.util.List;

public interface ProductoDAO {
    public Boolean create(Producto obj);

    public List<Producto> read();

    public Producto read(Integer clave);

    List<Producto> readByCriteria(String column, String criteria);

    public boolean update(Producto obj);

    public boolean update(Producto obj, String criteria);

    public Boolean deleteById(Integer clave);

    public Boolean deleteByCriteria(String criteria1, String criteria2);

    public List<String> getClasificaciones();
}
