package factories.implementaciones.mySQL;

import modelos.Producto;
import org.junit.Assert;
import org.junit.Test;

public class ProductoDAOTest {
    @Test
    public void createTest(){
        factories.implementaciones.mySQL.ProductoDAO productoDAO = new ProductoDAO();
        Producto producto = new Producto(1,"Cornfleis",25.0f,"Abarrotes",5.0f, 2.0f, 10.0f);
        Assert.assertEquals(Boolean.TRUE, productoDAO.create(producto));

    }
}
