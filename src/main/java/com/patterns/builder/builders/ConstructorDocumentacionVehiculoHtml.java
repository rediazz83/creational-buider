package com.patterns.builder.builders;

import com.patterns.builder.domain.DocumentacionHtml;

public class ConstructorDocumentacionVehiculoHtml extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoHtml() {
        this.documentacion = new DocumentacionHtml();
    }

    @Override
    public void construyeDocumentacionPedido(String nombreCliente) throws Exception {
        this.documentacion.agregaDocumento("<html>Solicitud de pedido Cliente: " + nombreCliente + "</html>");
    }

    @Override
    public void construyeDocumentacionMatriculacion(String nombreSolicitante) throws Exception {
        this.documentacion.agregaDocumento("<html>Solicitud de matriculacion Solicitante: " + nombreSolicitante + "</html>");
    }
}
