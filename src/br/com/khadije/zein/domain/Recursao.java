package br.com.khadije.zein.domain;

public class Recursao {
	public Integer fatorial(Integer x) {
	    if (x == 0)
	      return 1;
	    return x * fatorial(x - 1);
	  }
	public Integer potencia(Integer x, Integer y){
		if (y==0){
			return 1;
		}else{
			return (x*potencia(x,y-1));
		}
	}
	public Integer maiorVetor (Integer v[], int n)
	{ 
	   if (n == 1) return v[0];
	   else {
	      int x;
	      x = maiorVetor(v, n-1);
	      if (x > v[n-1]) return x;
	      else return v[n-1]; 
	   }
	}
	
	
	public Integer buscaVetor(Integer vetor[], Integer comeco, Integer fim, Integer item) {
	    /* Índice representando o meio do sub-vetor begin->end */
	    int i = (comeco + fim) / 2;

	    if (comeco > fim) {  /* Ponto de parada. Item não está no vetor */
	        return -1;
	    }

	    if (vetor[i] == item) {  /* Item encontrado */
	        return i;
	    }

	    if (vetor[i] < item) {  /* Item está no sub-vetor à direita */
	        return buscaVetor(vetor, i + 1, fim, item);


	    } else {  /* vector[i] > item. Item está no sub-vetor à esquerda */
	        return buscaVetor(vetor, comeco, i - 1, item);
	    }
	}    
	public Integer somaVetor(Integer vetor[], Integer tam) {
        if (tam > 0) {
            int soma = vetor[tam - 1] + somaVetor(vetor, tam - 1);
            return soma;
        } else {
            return 0;
        }

		
	}
	public void hanoi(Integer n, Integer origem, Integer destino, Integer trabalho) {
		if (n > 0) {
			hanoi(n - 1, origem,trabalho,destino);
			mover(origem,destino);
			hanoi(n - 1,trabalho,destino,origem);
		}
	}
	private void mover(Integer origem, Integer destino) {
		System.out.println(origem + " -> " + destino);
	}
	
	public Integer fibonnaci(Integer n) {
	        if (n < 2) {
	            return n;
	        } else {
	            return fibonnaci(n - 1) + fibonnaci(n - 2);
	        }
	    }
}
