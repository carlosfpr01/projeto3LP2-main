package projeto3;


public class Disciplina {
    private String codigo;
    private String nome;
    private int cargaHoraria;

    public Disciplina(String c, String n, int ch) {
        this.codigo = c;
        this.nome = n;
        this.cargaHoraria = ch;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

}
