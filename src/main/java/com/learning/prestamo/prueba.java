package com.learning.prestamo;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class prueba implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "PRUEBA_ID_GENERATOR")
    @javax.persistence.Id
    @javax.persistence.SequenceGenerator(name = "PRUEBA_ID_GENERATOR", sequenceName = "PRUEBA_ID_SEQ")
    private java.lang.Long id;

    public prueba() {
    }
    
    public prueba(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getId() {
        return this.id;
    }
    
    public void setId(java.lang.Long id) {
        this.id = id;
    }




}