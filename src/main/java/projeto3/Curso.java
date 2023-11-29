package projeto3;

import java.util.List;

public class Curso {
    private String nome;

    public Curso(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }
    
    public List<Disciplina> getDisciplina() {
        return this.getDisciplina();
    }

    public List<Matricula> getMatriculas() {
        return this.getMatriculas();
    }

    public void incluiDisciplina(Disciplina d) {
       new Disciplina(d.getCodigo(), d.getNome(), d.getCargaHoraria());
    }

    public void incluiMatricula(Matricula m) {
        this.getMatriculas().add(m);
    }
}
