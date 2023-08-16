package com.conexia.jenkins.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/prueba")
@AllArgsConstructor
@Tag(name = "Prueba de jenkins")
public class PruebaJenkinsController {

	@GetMapping("/consultar-texto")
	public ResponseEntity<String> consultar() {
		return ResponseEntity.ok(">> Prueba de jenkins");
	}

}
