package modelos;

public class Producto {

    public static final String TABLE = "producto";
    public static final String UNDEF = "%s";
    public static final String FIELD_CLAVE = "clave_producto";
    public static final String FIELD_DESC = "descripcion";
    public static final String FIELD_PRECIO = "precio";
    public static final String FIELD_CLAS = "clasificaion";
    public static final String FIELD_EXI = "existencia";
    public static final String FIELD_MAX_E = "max_existencia";
    public static final String FILED_MIN_E = "min_existencia";
    public static final String FIELDS = String.format("%s, %s, %s, %s, %s, %s, %s",
            FIELD_CLAVE, FIELD_DESC, FIELD_PRECIO, FIELD_CLAS, FIELD_EXI, FILED_MIN_E, FIELD_MAX_E);

    public static final String READ_ALL  = String.format("SELECT %s FROM %s", FIELDS, TABLE);
    public static final String READ_BY_ID = String.format("%s WHERE %s = %s", READ_ALL, FIELD_CLAVE, UNDEF);
    public static final String READ_BY_CRITERIA = String.format("%s WHERE %s", READ_ALL, UNDEF);

    public static final String UPDATE_BY_ID = String.format(
            "UPDATE FROM %s SET %s = %s, %s = \"%s\", %s = %s, %s = \"%s\", %s = %s, %s = %s, %s = %s WHERE %s = %s",
            TABLE, FIELD_CLAVE, UNDEF, FIELD_DESC, UNDEF, FIELD_PRECIO, UNDEF, FIELD_CLAS, UNDEF, FIELD_EXI, UNDEF,
            FILED_MIN_E, UNDEF, FIELD_MAX_E, UNDEF, FIELD_CLAVE, UNDEF
    );

    public static final String CREATE = String.format(
            "INSERT INTO %s VALUES(%s, \"%s\", %s, \"%s\", %s, %s, %s)",
            TABLE, UNDEF, UNDEF, UNDEF, UNDEF, UNDEF, UNDEF, UNDEF
    );

    public static final String DELETE_BY_ID = String.format(
            "DELETE FROM %s WHERE %s = %s",
            TABLE, FIELD_CLAVE, UNDEF
    );


    public static final String DELETE_BY_CRITERIA = String.format(
            "DELETE FROM %s WHERE %s = %s",
            TABLE, UNDEF, UNDEF
    );


    private Integer clave;
    private String descripcion;
    private Float precio;
    private String clasificacion;
    private Float existencia;
    private Float minExistencia;
    private Float maxExistencia;

    public static String getTABLE() {
        return TABLE;
    }

    public static String getFieldClave() {
        return FIELD_CLAVE;
    }

    public static String getFieldDesc() {
        return FIELD_DESC;
    }

    public static String getFieldPrecio() {
        return FIELD_PRECIO;
    }

    public static String getFieldClas() {
        return FIELD_CLAS;
    }

    public static String getFieldExi() {
        return FIELD_EXI;
    }

    public static String getFieldMaxE() {
        return FIELD_MAX_E;
    }

    public static String getFiledMinE() {
        return FILED_MIN_E;
    }

    public static String getFIELDS() {
        return FIELDS;
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Float getExistencia() {
        return existencia;
    }

    public void setExistencia(Float existencia) {
        this.existencia = existencia;
    }

    public Float getMinExistencia() {
        return minExistencia;
    }

    public void setMinExistencia(Float minExistencia) {
        this.minExistencia = minExistencia;
    }

    public Float getMaxExistencia() {
        return maxExistencia;
    }

    public void setMaxExistencia(Float maxExistencia) {
        this.maxExistencia = maxExistencia;
    }
}
