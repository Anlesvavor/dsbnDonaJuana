package modelos;

import factories.implementaciones.mySQL.ProductoDAO;

import java.util.List;
import java.util.stream.Stream;

public class Reporte {


    private static void inciso1(){
        System.out.println("Numero de productos con existencia mayor a 20");
        long rep = new ReporteProductos().existenciaMayorQue(20.0f).count();
        System.out.println(rep);
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    public static void inciso2(){
        System.out.println("Numero de productos con existencia menor a 15");
        long rep = new ReporteProductos().existenciaMenorQue(15.0f).count();
        System.out.println(rep);
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    public static void inciso3(){
        System.out.println("Lista de con la misma calificacion y precio mayor a 15.50");
        ReporteProductos rep = new ReporteProductos();
        factories.interfaces.ProductoDAO productoDAO = new ProductoDAO();
        List<String> clasificaciones = productoDAO.getClasificaciones();
        for (String s: clasificaciones) {
            rep.existenciaMayorQueDesdeQuery(15.50f, rep.agruparPorClasificacion(s)).forEach(producto -> System.out.println(producto.toString()));
        }
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    public static void inciso4(){
        System.out.println("Lista de articulos con precio mayor a 20.30 y menor a 45.00");
        Stream rep = new ReporteProductos().precioEntre(20.30f, 45.00f);
        System.out.println("");
        rep.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    public static void inciso5(){
        System.out.println("Numero de productos agrupados por clasificacion");
        ReporteProductos rep = new ReporteProductos();
        factories.interfaces.ProductoDAO productoDAO = new ProductoDAO();
        List<String> clasificaciones = productoDAO.getClasificaciones();
        clasificaciones.forEach(s -> System.out.println(String.format("%s: %s", s, rep.agruparPorClasificacion(s).count())));
        System.out.println("-------------------------------------------------------------------------------------------");

    }

    public static void main(String[] args) {
        inciso1();
        inciso2();
        inciso3();
        inciso4();
        inciso5();
    }
}
