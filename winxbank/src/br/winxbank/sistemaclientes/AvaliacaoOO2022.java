package br.winxbank.sistemaclientes;
import br.winxbank.sistemabancario.Conta;
/**
 * @author Carol
 * Esta classe é uma representação de um Feedback a partir da conta do cliente.
 * A matricula requisitada no enunciado da questao nesse caso sera identificada pelo numero da conta do cliente
 */
public class AvaliacaoOO2022 {
    private String nome;
    private int matricula;
    private float nota;

    public AvaliacaoOO2022(String nome, int matricula, float nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getNota() {
        return nota;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public AvaliacaoOO2022(){

    }

}