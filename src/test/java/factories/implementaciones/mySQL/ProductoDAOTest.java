package factories.implementaciones.mySQL;

import modelos.Producto;
import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOTest {
    @Test
    public void createTest(){
        factories.implementaciones.mySQL.ProductoDAO productoDAO = new ProductoDAO();
        Producto producto = new Producto(1,"Cornfleis",25.0f,"Abarrotes",5.0f, 2.0f, 10.0f);
        Assert.assertEquals(Boolean.TRUE, productoDAO.create(producto));
    }

    @Test
    public void deleteByIdTest(){
        factories.implementaciones.mySQL.ProductoDAO productoDAO = new ProductoDAO();
        Assert.assertEquals(Boolean.TRUE, productoDAO.deleteById(1));
    }

    @Test
    public void readTest(){
        factories.implementaciones.mySQL.ProductoDAO productoDAO = new ProductoDAO();
        productoDAO.read().stream().forEach((Producto obj)->{
            System.out.println(obj.toString());
        });
    }
}
