package projeto3;

import java.util.List;

public class Aluno {
    private String cpf;
    private String nome;
    private List<Matricula> matriculas;

    public Aluno(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public List<Matricula> getMatriculas() {
        return this.matriculas;
    }

    protected void adicionaMatricula(Matricula m) {
        if (!this.matriculas.contains(m)) {
            this.matriculas.add(m);
        }
    }

}
