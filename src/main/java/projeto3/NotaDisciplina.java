package projeto3;


public class NotaDisciplina {
    private float nota;
    private Situacao situacao;

    protected NotaDisciplina(float n, Disciplina d, Situacao s) {
        this.nota = n;
        this.setDisciplina(d);
        if (s != null) {
            throw new RuntimeException("Situacao não pode ser nula");
        }else{
            this.situacao = s;
        }
    }
    public float getNota() {
        return nota;
    }

    public Disciplina getDisciplina() {
        return this.getDisciplina();
    }

    public Situacao getSituacao() {
        return this.getSituacao();
    }

    public AnoSemestre getAnoSemestre() {
        return this.getAnoSemestre();
    }

    protected void setAnoSemestre(AnoSemestre as) {
        this.setAnoSemestre(as);
    }

    protected void setDisciplina(Disciplina d) {
        if(d == null) {
            throw new RuntimeException("Disciplina não pode ser nula");
        }else{
            this.setDisciplina(d);
        }
    }
}
