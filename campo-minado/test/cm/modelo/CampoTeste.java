package cm.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTeste {
	
	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {		
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeVizinhoDistancia1Esquerda() {
		var vizinho = new Campo(3, 2);
		boolean resultado =  campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1Direita() {
		var vizinho = new Campo(3, 4);
		boolean resultado =  campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoDistancia1EmCima() {
		var vizinho = new Campo(2, 3);
		boolean resultado =  campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoDistancia1EmBaixo() {
		var vizinho = new Campo(4, 3);
		boolean resultado =  campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoDistancia2() {
		var vizinho = new Campo(2, 2);
		boolean resultado =  campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	@Test
	void testeNãoVizinho() {
		var vizinho = new Campo(1, 1);
		boolean resultado =  campo.adicionarVizinho(vizinho);
		assertFalse(resultado);
	}
	
}
