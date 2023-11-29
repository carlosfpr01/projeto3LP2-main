package projeto3;

import java.util.List;

public class AnoSemestre {
    private int ano;
    private int semestre;
    private Matricula matricula;
    private List<NotaDisciplina> notas;

    protected AnoSemestre(int a, int s, Matricula m) {
        this.ano = a;
        this.semestre = s;
        this.setMatricula(m);
    }

    public int getAno() {
        return ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public Matricula getMatricula() {
        return this.matricula;
    }

    public NotaDisciplina registraNotaDisciplina(float n, Disciplina d, Situacao s){
        NotaDisciplina nd = new NotaDisciplina(n, d, s);
        if (!this.notas.contains(nd)) {
            this.notas.add(nd);
        }
        return nd;
    }

    public List<NotaDisciplina> listNotaDisciplina(){
        return this.notas;
    }

    protected void setMatricula(Matricula m) {
        if(m == null) {
            throw new RuntimeException("Matricula não pode ser nula");
        }else{
            this.matricula = m;
        }
    }
}
