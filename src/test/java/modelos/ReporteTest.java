package modelos;

import factories.implementaciones.mySQL.ProductoDAO;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReporteTest {

    @Test
    public void existenciaMenorQueTest(){
        ReporteProductos rep = new ReporteProductos();
        rep.existenciaMenorQue(5.0f).forEach(System.out::println);
        System.out.println(rep.existenciaMenorQue(5.0f).count());
    }
    @Test
    public void existenciaMayorQueTest(){
        ReporteProductos rep = new ReporteProductos();
        rep.existenciaMayorQue(6.0f).forEach(System.out::println);
        System.out.println(rep.existenciaMayorQue(6.0f).count());
    }

    @Test
    public void precioEntreTest(){
        ReporteProductos rep = new ReporteProductos();
        rep.precioEntre(20.30f, 45.00f).forEach(System.out::println);
    }

    @Test
    public void cantidadPorClasificacion(){
        ReporteProductos rep = new ReporteProductos();
        factories.interfaces.ProductoDAO productoDAO = new ProductoDAO();
        List<String> clasificaciones = productoDAO.getClasificaciones();
        clasificaciones.forEach(s -> System.out.println(String.format("%s: %s", s, rep.agruparPorClasificacion(s).count())));
    }

    @Test
    public void mismaClasificacionEntrePrecios(){
        ReporteProductos rep = new ReporteProductos();
        factories.interfaces.ProductoDAO productoDAO = new ProductoDAO();
        List<String> clasificaciones = productoDAO.getClasificaciones();
        for (String s: clasificaciones) {
            rep.existenciaMayorQueDesdeQuery(15.50f, rep.agruparPorClasificacion(s)).forEach(producto -> System.out.println(producto.toString()));
        }
    }
}
