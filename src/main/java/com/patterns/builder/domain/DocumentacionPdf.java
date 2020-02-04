package com.patterns.builder.domain;

public class DocumentacionPdf extends Documentacion {
    
    @Override
    public void agregaDocumento(String documento) throws Exception {
        if(documento.startsWith("<pdf>")) {
            contenido.add(documento);
            return;
        }

        throw new Exception("Documento no es el adecuado");
    }

    @Override
    public void imprime() {
        System.out.println("Documentacion PDF");
        contenido.stream().forEach(documento -> System.out.println(documento));
    }
}
