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
        return this.getMatricula();
    }

    public NotaDisciplina registraNotaDisciplina(float n, Disciplina d, Situacao s){
        NotaDisciplina notaD = new NotaDisciplina(n, d, s);
        notaD.setAnoSemestre(this);
        this.notas.add(notaD);
        return notaD;
    }

    public List<NotaDisciplina> listNotaDisciplina(){
        return this.listNotaDisciplina();
    }

    protected void setMatricula(Matricula m) {
        if(m == null) {
            throw new RuntimeException("Matricula não pode ser nula");
        }else{
            this.matricula = m;
        }
    }
}
