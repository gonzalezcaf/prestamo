package com.learning.prestamo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Solicitud implements java.io.Serializable {

    static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Description(value = "Numero de solicitud de prestamo")
	@org.kie.api.definition.type.Label(value = "Id Solicitud")
	private java.lang.Integer idSolicitud;
	@org.kie.api.definition.type.Description(value = "Monto de dinero solicitado")
	@org.kie.api.definition.type.Label(value = "Monto Solicitado")
	private java.lang.Integer monto;
	@org.kie.api.definition.type.Description(value = "Monto Final Aprobado")
	@org.kie.api.definition.type.Label(value = "Monto Aprobado")
	private java.lang.Integer montoaprobado;
	@org.kie.api.definition.type.Description(value = "Cliente que solicita el prestamo")
	@org.kie.api.definition.type.Label(value = "Cliente")
	private com.learning.prestamo.cliente cliente;

    public Solicitud() {
    }


	public java.lang.Integer getIdSolicitud() {
		return this.idSolicitud;
	}

	public void setIdSolicitud(java.lang.Integer idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public java.lang.Integer getMonto() {
		return this.monto;
	}

	public void setMonto(java.lang.Integer monto) {
		this.monto = monto;
	}

	public java.lang.Integer getMontoaprobado() {
		return this.montoaprobado;
	}

	public void setMontoaprobado(java.lang.Integer montoaprobado) {
		this.montoaprobado = montoaprobado;
	}

	public com.learning.prestamo.cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(com.learning.prestamo.cliente cliente) {
		this.cliente = cliente;
	}

	public Solicitud(java.lang.Integer idSolicitud, java.lang.Integer monto,
			java.lang.Integer montoaprobado,
			com.learning.prestamo.cliente cliente) {
		this.idSolicitud = idSolicitud;
		this.monto = monto;
		this.montoaprobado = montoaprobado;
		this.cliente = cliente;
	}

}