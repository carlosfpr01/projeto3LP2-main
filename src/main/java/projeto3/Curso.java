package projeto3;

import java.util.List;

public class Curso {
    private String nome;
    private List<Disciplina> disciplinas;
    private List<Matricula> matriculas;

    public Curso(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }
    
    public List<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }

    public List<Matricula> getMatriculas() {
        return this.matriculas;
    }

    public void incluiDisciplina(Disciplina d) {
        if (!this.disciplinas.contains(d)) {
            this.disciplinas.add(d);
        }
    }

    public void incluiMatricula(Matricula m) {
        if (!this.matriculas.contains(m)) {
            this.matriculas.add(m);
        }
    }
}
