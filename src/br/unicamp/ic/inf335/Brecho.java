package br.unicamp.ic.inf335;

import java.util.ArrayList;
import java.util.Collections;

import br.unicamp.ic.inf335.beans.ProdutoBean;

public class Brecho {

	private static final ArrayList<ProdutoBean> produtos = new ArrayList<ProdutoBean>();
	
	public static void main(String[] args) {
		produtos.add(new ProdutoBean("CD00001","Celular Galaxy S10", "128 Gb, Preto, com Carregador",1250.0,"Poucos riscos, estado de novo."));
		produtos.add(new ProdutoBean("CD00002","Prod 2 ...", "Bla Bla Bla",1100.0,"Bla Bla Bla"));
		produtos.add(new ProdutoBean("CD00003","Prod 3 ...", "Bla Bla Bla",120.0,"Bla Bla Bla"));
		produtos.add(new ProdutoBean("CD00004","Prod 4 ...", "Bla Bla Bla",1300.0,"Bla Bla Bla"));
		produtos.add(new ProdutoBean("CD00005","Prod 5 ...", "Bla Bla Bla",9400.0,"Bla Bla Bla"));
		produtos.add(new ProdutoBean("CD00006","Prod 6 ...", "Bla Bla Bla",1500.0,"Bla Bla Bla"));
		
		// Imprime produtos
		for (ProdutoBean produto : produtos) {
			System.out.println("Codigo = " + produto.getCodigo() + " Nome = " + produto.getNome() + " Valor = " + produto.getValor());
		}
		
		// Ordena produtos
		Collections.sort(produtos);
		
		System.out.println("-------------------- Produtos Ordenados -------------------");
		// Imprime produtos ordenados
		for (ProdutoBean produto : produtos) {
			System.out.println("Codigo = " + produto.getCodigo() + " Nome = " + produto.getNome() + " Valor = " + produto.getValor());
		}
		
		// Calcula Média
		Double acumulado = 0.0;
		int i = 0;
		while (i<produtos.size()) {
			acumulado += produtos.get(i).getValor();
			i++;
		}
		Double media = acumulado / i;
		System.out.println("Media de Valores = " + media);
	}

}
