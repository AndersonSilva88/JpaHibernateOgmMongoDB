package testes;

import dao.matricula.IMatriculaDao;
import dao.matricula.MatriculaDao;
import domain.Matricula;
import org.junit.Test;

import java.time.Instant;

import static org.junit.Assert.assertNotNull;

public class MatriculaTest {

    private IMatriculaDao matriculaDao;

    public MatriculaTest() {
        matriculaDao = new MatriculaDao();
    }

    @Test
    public void cadastrar() {
        Matricula matricula = new Matricula();
        matricula.setCodigo("S1");
        matricula.setDataMatricula(Instant.now());
        matricula.setValor(1500.00);
        matricula.setStatus("ATIVA");
        matricula = matriculaDao.cadastrar(matricula);

        assertNotNull(matricula);
        assertNotNull(matricula.getId());
    }
}
