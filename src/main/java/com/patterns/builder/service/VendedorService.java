package com.patterns.builder.service;

import com.patterns.builder.domain.Documentacion;
import com.patterns.builder.domain.Mandantes;

public interface VendedorService {

    Documentacion construye(Mandantes mandantes) throws Exception;
}
