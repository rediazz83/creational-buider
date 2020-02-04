package com.patterns.builder.service.impl;

import com.patterns.builder.builders.ConstructorDocumentacionVehiculo;
import com.patterns.builder.domain.Documentacion;
import com.patterns.builder.domain.Mandantes;
import com.patterns.builder.service.VendedorService;

public class VendedorServiceImpl implements VendedorService {

    protected ConstructorDocumentacionVehiculo constructor;

    public VendedorServiceImpl(ConstructorDocumentacionVehiculo constructor) {
        this.constructor = constructor;
    }

    public Documentacion construye(Mandantes mandantes) throws Exception {
        constructor.construyeDocumentacionPedido(mandantes.getNombreCliente());
        constructor.construyeDocumentacionMatriculacion(mandantes.getNombreSolicitante());
        return constructor.resultado();
    }
}
