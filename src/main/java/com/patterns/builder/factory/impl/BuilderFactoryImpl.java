package com.patterns.builder.factory.impl;

import com.patterns.builder.builders.ConstructorDocumentacionVehiculo;
import com.patterns.builder.builders.ConstructorDocumentacionVehiculoHtml;
import com.patterns.builder.builders.ConstructorDocumentacionVehiculoPdf;
import com.patterns.builder.enums.TipoDocumentacionEnum;
import com.patterns.builder.factory.BuilderFactory;
import org.springframework.stereotype.Component;

@Component
public class BuilderFactoryImpl implements BuilderFactory {

    private static final int DOCUMENTACION_HTML = 1;
    private static final int DOCUMENTACION_PDF = 2;

    @Override
    public ConstructorDocumentacionVehiculo getBuilder(TipoDocumentacionEnum tipoDocumentacion) throws ClassNotFoundException {
        switch(tipoDocumentacion.getClave()) {
            case DOCUMENTACION_HTML:
                return new ConstructorDocumentacionVehiculoHtml();
            case DOCUMENTACION_PDF:
                return new ConstructorDocumentacionVehiculoPdf();
            default:
                throw new ClassNotFoundException("No existe tipo de documento");
        }
    }
}
