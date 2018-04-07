package modelos;

public class Producto {

    public static final String TABLE = "producto";
    public static final String UNDEFINIED = "%s";
    public static final String FIELD_CLAVE = "clave_producto";
    public static final String FIELD_DESC = "descripcion";
    public static final String FIELD_PRECIO = "precio";
    public static final String FIELD_CLAS = "clasificaion";
    public static final String FIELD_EXI = "existencia";
    public static final String FIELD_MAX_E = "max_existencia";
    public static final String FILED_MIN_E = "min_existencia";
    public static final String FIELDS = String.format("%s, %s, %s, %s, %s, %s, %s",
            FIELD_CLAVE, FIELD_DESC, FIELD_PRECIO, FIELD_CLAS, FIELD_EXI, FILED_MIN_E, FIELD_MAX_E);


}
