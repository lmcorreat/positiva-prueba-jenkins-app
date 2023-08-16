package com.conexia.jenkins.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author lcorrea
 */
@SpringBootTest(classes = PruebaJenkinsController.class)
class PruebaJenkinsControllerTest {

	@Autowired
	private PruebaJenkinsController pruebaJenkinsController;

	@Test
	void obtenerTareasConfiguradas() {
		String resultado = ">> Prueba de jenkins";
		final ResponseEntity<String> respuestaEsperada = new ResponseEntity(resultado, HttpStatus.OK);

		final ResponseEntity<?> respuestaEjecucion = pruebaJenkinsController.consultar();

		Assertions.assertEquals(respuestaEsperada, respuestaEjecucion);
	}
}
