package com.patterns.builder.builders;

import com.patterns.builder.domain.DocumentacionPdf;

public class ConstructorDocumentacionVehiculoPdf extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoPdf() {
        this.documentacion = new DocumentacionPdf();
    }

    @Override
    public void construyeDocumentacionPedido(String nombreCliente) throws Exception {
        this.documentacion.agregaDocumento("<pdf>Solicitud de pedido Cliente: " + nombreCliente + "</pdf>");
    }

    @Override
    public void construyeDocumentacionMatriculacion(String nombreSolicitante) throws Exception {
        this.documentacion.agregaDocumento("<pdf>Solicitud de matriculacion Solicitante: " + nombreSolicitante + "</pdf>");
    }
}
