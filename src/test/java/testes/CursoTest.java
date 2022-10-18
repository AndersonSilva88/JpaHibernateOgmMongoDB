package testes;

import dao.curso.CursoDao;
import dao.curso.ICursoDao;
import domain.Curso;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CursoTest {

    private ICursoDao  cursoDao;

    public CursoTest() {
        cursoDao = new CursoDao();
    }

    @Test
    public void cadastrar() {
        Curso curso = new Curso();
        curso.setCodigo("A1");
        curso.setDescricao("Curso teste - hibernate ogm");
        curso.setNome("Curso Java Backend");
        curso = cursoDao.cadastrar(curso);

        assertNotNull(curso);
        assertNotNull(curso.getId());
    }
}
