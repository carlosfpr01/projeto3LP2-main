package projeto3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class MatriculaTest {
    
    @Test
    public void testMatriculaConstructor() {
        Aluno a = new Aluno("João", "123456");
        Curso c = new Curso("Ciência da Computação");
        Matricula m = new Matricula("2021CC123456", 2021, 1, a, c);
        
        assertEquals("2021CC123456", m.getMatricula());
        assertEquals(2021, m.getAno());
        assertEquals(1, m.getSemestre());
        assertEquals(a, m.getAluno());
        assertEquals(c, m.getCurso());
    }
    
    @Test
    public void testMatriculaConstructorWithNullAluno() {
        Curso c = new Curso("Ciência da Computação");
        assertThrows(RuntimeException.class, () -> new Matricula("2021CC123456", 2021, 1, null, c));
    }
    
    @Test
    public void testMatriculaConstructorWithNullCurso() {
        Aluno a = new Aluno("João", "123456");
        assertThrows(RuntimeException.class, () -> new Matricula("2021CC123456", 2021, 1, a, null));
    }
}