package com.patterns.builder.factory;

import com.patterns.builder.builders.ConstructorDocumentacionVehiculo;
import com.patterns.builder.enums.TipoDocumentacionEnum;

public interface BuilderFactory {

    ConstructorDocumentacionVehiculo getBuilder(TipoDocumentacionEnum tipoDocumentacion) throws ClassNotFoundException;
}
