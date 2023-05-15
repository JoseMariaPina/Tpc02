package Tpc02;

public class Aluno {
	private String nome;
    private double [] notas;

    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }


	public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }
    public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}


}
