package com.patterns.builder.enums;

import java.util.Arrays;

public enum TipoDocumentacionEnum {
    HTML(1, "Documentacion en html"), PDF(2, "Documentacion en pdf");

    private int clave;
    private String valor;

    TipoDocumentacionEnum(int clave, String valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public int getClave() {
        return this.clave;
    }

    public static TipoDocumentacionEnum buscarTipoDocumentacion(int clave) throws Exception {
        return Arrays.stream(TipoDocumentacionEnum.values())
                .filter(tipoFabrica -> tipoFabrica.clave == clave).findFirst().orElseThrow(Exception::new);
    }
}
