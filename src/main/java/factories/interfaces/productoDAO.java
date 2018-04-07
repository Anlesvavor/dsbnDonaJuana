package factories.interfaces;

import modelos.Producto;

import java.util.List;

public interface productoDAO {
    public Boolean create(Producto obj);

    public List<Producto> read();

    public Producto read(Long id);

    public boolean update(Producto obj);

    public boolean update(Producto obj, String criteria);

    public Boolean deleteById(Long id);

    public Boolean deleteByCriteria(String criteria1, String criteria2);
}
