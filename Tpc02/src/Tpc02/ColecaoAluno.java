package Tpc02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ColecaoAluno {
	
		private Aluno[] alunos;
	    private int pos;
	    private int tam;

	    public ColecaoAluno(int tam) {
	        this.alunos = new Aluno[tam];
	        this.pos = 0;
	        this.tam = tam;
	    }
	    public void lerArquivo (String arquivo) throws FileNotFoundException{
			File fich = new File(arquivo);
			if(fich.exists()) {
				Scanner ler = new Scanner(fich);
				ler.nextLine();
				
				while(ler.hasNext()) {
					String linha = ler.nextLine();
					String []v = linha.split(";");
					String nome = v[0];
					double [] notas = new double [6];
					for (int i =1 ; i < v.length; i++) {
						notas [i - 1] = Integer.parseInt(v[i]); 
					}
					
					//criar um aluno com os dados da linha do ficheiro
					Aluno aluno = new Aluno (nome, notas);
					inserir(aluno);
				}
				ler.close();
			}
			else{
				System.out.println("Ficheiro nao existe");
			}
			return ;
		}
	    public void inserir(Aluno aluno) {
	        if (pos < tam) {
	            alunos[pos] = aluno;
	            pos++;
	        } else {
	            System.out.println("Vector cheio!");
	        }
	    }
	    
	    public void listar() {
	        for (int i = 0; i < pos; i++) {
	            System.out.println("Nome: " + alunos[i].getNome());
	            System.out.print("Notas: ");
	            double[] notas = alunos[i].getNotas();
	            for (int j = 0; j < notas.length; j++) {
	                System.out.print(notas[j] + " ");
	            }   System.out.println("\n");
	        }
	    }
	    
	    public void ordenar() {
	        for (int i = 0; i < pos; i++) {
	            double [] notas = alunos[i].getNotas();
	            for (int j = 0; j < notas.length - 1; j++) {
	                int menor = j;
	                for (int k = j + 1; k < notas.length; k++) {
	                    if (notas[k] < notas[menor]) {
	                        menor = k;
	                    }
	                }
	                double aux = notas[j];
	                notas[j] = notas[menor];
	                notas[menor] = aux;
	                
	            }
	        }
	        listar();
	    }

}
	     

