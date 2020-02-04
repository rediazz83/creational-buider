package com.patterns.builder.builders;

import com.patterns.builder.domain.Documentacion;

public abstract class ConstructorDocumentacionVehiculo {

    protected Documentacion documentacion;

    public abstract void construyeDocumentacionPedido(String nombreCliente) throws Exception;

    public abstract void construyeDocumentacionMatriculacion(String nombreSolicitante) throws Exception;

    public Documentacion resultado() {
        return this.documentacion;
    }
}
