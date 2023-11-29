package projeto3; 

import java.util.List;

public class Matricula {
    
    private String matricula;
    private int ano;
    private int semestre;
    private Aluno aluno;
    private Curso curso;
    private List<AnoSemestre> anoSemestres;

    public Matricula(String m, int ano, int sem, Aluno a, Curso c) {
        this.matricula = m;
        this.ano = ano;
        this.semestre = sem;
        this.setAluno(a);
        this.setCurso(c);
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAno() {
        return ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public Aluno getAluno() {
        return this.aluno;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public List<AnoSemestre> listAnoSemestres() {
        return this.anoSemestres;
    }

    public void registraAnoSemestre(int ano, int sem) {
        AnoSemestre as = new AnoSemestre(ano, sem);
        if (!this.anoSemestres.contains(as)) {
            this.anoSemestres.add(as);
        }
    }

    protected void setAluno(Aluno a) {
        if(a == null) {
            throw new RuntimeException("Aluno não pode ser nulo");
        }else{
            this.aluno = a;
        }
       
    }

    protected void setCurso(Curso c) {
        if(c == null) {
            throw new RuntimeException("Aluno não pode ser nulo");
        }else{
            this.curso = c;
        }
    }

}
