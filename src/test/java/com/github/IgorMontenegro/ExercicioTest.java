package com.github.IgorMontenegro;
/**
 * Exercício para aula2. E aula3
 * 
 * @author Igor
 * @version 1.0
 * © Copyright Universidade Federal de Goiás
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class ExercicioTest {
	
	// Casos de teste para Soma dos Numeros naturais
	@Test
	public void valorArbitrarioParaSomaTeste() {
		assertEquals(6.0, Exercicio.somaNaturais(3),2.0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void numeroMenorQueZeroSomaNatural() {
		Exercicio.somaNaturais(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void numeroMenoresQueZeroSomaNatural() {
		Exercicio.somaNaturais(0);
	}
	
	// Casos de teste para Produto
	@Test
	public void valorArbitrarioParaProdutoTeste() {
		assertEquals(9, Exercicio.produto(3, 3));
	}

	@Test
	public void numeroAMaiorQueBTeste() {
		assertEquals(15, Exercicio.produto(5, 3));
	}

	@Test(expected = IllegalArgumentException.class)
	public void numeroMenoresQueZeroSomaProdutoValorATeste() {
		Exercicio.produto(0, 2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void numeroMenoresQueZeroSomaProdutoValorBTeste() {
		Exercicio.produto(3, 0);
	}

	// Casos de teste para Potência
	@Test(expected = IllegalArgumentException.class)
	public void numeroMenorQueZeroPotenciaValorXTeste() {
		Exercicio.potencia(0, 2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void numeroMenorQueZeroPotenciaValorYTeste() {
		Exercicio.potencia(3, 0);
	}

	@Test
	public void valorArbitrarioParaPotenciaTeste() {
		assertEquals(27, Exercicio.potencia(3, 3));
	}

	// Casos de teste para Propriedade 3025
	@Test(expected = IllegalArgumentException.class)
	public void numeroMenorQueZeroPropriedade3025Teste() {
		Exercicio.propriedade3025(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void numeroMaiorQue9999Propriedade3025Teste() {
		Exercicio.propriedade3025(100000);
	}

	@Test
	public void valorCertoParaPropriedade3025Teste() {
		assertTrue(Exercicio.propriedade3025(3025));
	}

	@Test
	public void valorErradoParaPropriedade3025Teste() {
		assertFalse(Exercicio.propriedade3025(3125));
	}

	// Casos de teste para Propriedade 153
	@Test(expected = IllegalArgumentException.class)
	public void numeroMenorQueZeroPropriedade153Teste() {
		Exercicio.propriedade153(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void numeroMaiorQue9999Propriedade153Teste() {
		Exercicio.propriedade153(99999);
	}

	@Test
	public void valorCertoParaPropriedade153Teste() {
		assertTrue(Exercicio.propriedade153(153));
	}

	@Test
	public void valorErradoParaPropriedade153Teste() {
		assertFalse(Exercicio.propriedade153(154));
	}

	// Casos de teste para Numero Primo
	@Test(expected = IllegalArgumentException.class)
	public void numeroMenorQue1PrimoTeste() {
		Exercicio.primo(0);
	}

	@Test
	public void numeroPrimoTeste() {
		assertTrue(Exercicio.primo(3));
	}

	@Test
	public void numeroNaoPrimoTeste() {
		assertFalse(Exercicio.primo(10));
	}
	
	// Casos de teste para Numero Harmonico
	@Test(expected = IllegalArgumentException.class)
	public void numeroMenorQue1NumeroHarmonicoTeste() {
		Exercicio.numeroHarmonico(0);
	}
	@Test
	public void valorArbitrarioNumeroHarmonicoTeste() {
		assertEquals(1,Exercicio.numeroHarmonico(10));
	}

	//Casos de teste para PI
	@Test(expected = IllegalArgumentException.class)
	public void piWrongParameterTest(){
		Exercicio.pi(-1);
	}
	
	@Test
	public void piTest(){
		assertEquals(3.1416,Exercicio.pi(1),1);
	}
	
	// Casos de teste para raiz quadrada
	@Test
	public void raizQuadradaTest() {
		assertEquals(2, Exercicio.raiz(4, 1));
	}
	@Test(expected = IllegalArgumentException.class)
	public void raizQuadradaWrongParametersTest(){
		Exercicio.raiz(0, 1);
	}
	
	//Casos de teste para fatorial
	@Test(expected = IllegalArgumentException.class)
	public void fatorialNumeroMenorQue1Test() {
		Exercicio.fatorial(-1);
	}

	@Test
	public void fatorialTest() {
		assertEquals(6, Exercicio.fatorial(3));
	}
	
	//Casos de teste para razao aurea
	@Test
	public void razaoAureaTest(){
		assertEquals(1.666, Exercicio.razaoAurea(1, 1, 1),0.5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void razaoAureaXSmallerThanYTest(){
		Exercicio.razaoAurea(3, 5, 2);
	}
	@Test(expected = IllegalArgumentException.class)
	public void razaoAureaXSmallerThan0Test(){
		Exercicio.razaoAurea(-3, -2, 10);
	}
	@Test(expected = IllegalArgumentException.class)
	public void razaoAureaKSmallerThan0Test(){
		Exercicio.razaoAurea(20, -1, -1);
	}
	
	//Casos de teste para fibonacci
	@Test
	public void fibonacciTest(){
		assertEquals(55,Exercicio.fibonacci(10));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void fibonacciWrongParametersTest(){
		Exercicio.fibonacci(-1);
	}
	
	@Test
	public void fibonacciValueEquals1(){
		assertEquals(1,Exercicio.fibonacci(1));
	}

	@Test
	public void fibonacciValueEquals0(){
		assertEquals(0,Exercicio.fibonacci(0));
	}
	
	//Casos de teste para resto (MOD)
	@Test(expected = IllegalArgumentException.class)
	public void modWrongParametersTest(){
		Exercicio.mod(-2,-1);
	}
	@Test
	public void modTest(){
		assertEquals(1, Exercicio.mod(10, 3));
	}
	
	//Casos de teste para quadrado perfeito
	@Test
	public void quadradoPerfeitoTest(){
		assertTrue(Exercicio.quadradoPerfeito(25));
	}
	@Test(expected = IllegalArgumentException.class)
	public void quadradoPerfeitoWrongValue(){
		Exercicio.quadradoPerfeito(0);
	}
	@Test
	public void quadradoPerfeitoFalseResult(){
		assertFalse(Exercicio.quadradoPerfeito(13));
	}
}