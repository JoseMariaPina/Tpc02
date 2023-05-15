package Tpc02;

import java.io.FileNotFoundException;

public class Teste {

	public static void main(String[] args) throws FileNotFoundException {
		
			ColecaoAluno alunos = new ColecaoAluno(3);
			alunos.lerArquivo("alunos.csv");
			alunos.listar();
	        alunos.ordenar();


	}

}
