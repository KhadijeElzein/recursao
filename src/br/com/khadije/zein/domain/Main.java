package br.com.khadije.zein.domain;

public class Main {

	 public static void main(String[] args) {
		    Recursao r = new Recursao();
		    int resp = r.fatorial(3);
		    System.out.println(resp);
		    resp = r.potencia(2, 2);
		    System.out.println(resp);
		    Integer [] vetor = new Integer[]{0,1,2,3,4};
		    resp = r.maiorVetor(vetor, vetor.length);
		    System.out.println(resp);
		    resp = r.buscaVetor(vetor,0,vetor.length,2);
		    System.out.println(resp);
		    resp = r.somaVetor(vetor, vetor.length);
		    System.out.println(resp);
		    resp = r.fibonnaci(5);
		    System.out.println(resp);
			r.hanoi(5, 1, 3, 2);


		  }
}
