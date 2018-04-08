package modelos;

import factories.implementaciones.mySQL.ProductoDAO;

import java.util.List;
import java.util.stream.Stream;

public class ReporteProductos {

    public Stream<Producto> existenciaMenorQue(Float cantidad){
        final Float existencia = cantidad;
        factories.interfaces.ProductoDAO productoDAO = new ProductoDAO();
        return productoDAO.read().stream().filter(producto -> producto.getExistencia() < existencia);
    }

    public Stream<Producto> existenciaMayorQue(Float cantidad){
        final Float existencia = cantidad;
        factories.interfaces.ProductoDAO productoDAO = new ProductoDAO();
        return productoDAO.read().stream().filter(producto -> producto.getExistencia() > existencia);
    }

    public Stream<Producto> existenciaMayorQueDesdeQuery(Float cantidad, Stream<Producto> stream){
        final Float existencia = cantidad;
        factories.interfaces.ProductoDAO productoDAO = new ProductoDAO();
        return stream.filter(producto -> producto.getPrecio() > cantidad);
    }

    public Stream<Producto> precioEntre(final Float cant1, final Float cant2){
        factories.interfaces.ProductoDAO productoDAO = new ProductoDAO();
        return productoDAO.read().stream().filter(producto -> producto.getPrecio() >= cant1 && producto.getPrecio() <= cant2);
    }

    public Stream<Producto> precionMayorQue(final Float precio){
        factories.interfaces.ProductoDAO productoDAO = new ProductoDAO();
        return productoDAO.read().stream().filter(producto -> producto.getPrecio() >= precio);
    }

    public Stream<Producto> agruparPorClasificacion(String clasificacion){
        factories.interfaces.ProductoDAO productoDAO = new ProductoDAO();
        return productoDAO.readByCriteria(Producto.FIELD_CLAS, clasificacion).stream();
    }

}
