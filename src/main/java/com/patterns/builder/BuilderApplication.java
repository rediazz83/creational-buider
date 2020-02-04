package com.patterns.builder;

import com.patterns.builder.domain.Documentacion;
import com.patterns.builder.domain.Mandantes;
import com.patterns.builder.enums.TipoDocumentacionEnum;
import com.patterns.builder.factory.BuilderFactory;
import com.patterns.builder.service.VendedorService;
import com.patterns.builder.service.impl.VendedorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class BuilderApplication implements CommandLineRunner {

	@Autowired
	private BuilderFactory builderFactory;

	private VendedorService service;

	public static void main(String[] args) {
		SpringApplication.run(BuilderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service = new VendedorServiceImpl(builderFactory.getBuilder(consultarIntencion()));

		Documentacion documentacion = service.construye(
				new Mandantes("Rodrigo Diaz", "Pamela Mejias"));

		documentacion.imprime();
	}

	private TipoDocumentacionEnum consultarIntencion() throws Exception {
		Scanner reader = new Scanner(System.in);
		System.out.println("Desea generar documentacion HTML (1) o PDF (2):");

		return TipoDocumentacionEnum.buscarTipoDocumentacion(Integer.parseInt(reader.next()));
	}

}
