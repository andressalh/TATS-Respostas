

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import questao3.Turma;
import questao3.TurmaController;
import questao3.TurmaDAO;
import questao3.VerificadorDeCodigos;

/**
 *
 * @author andre
 */
public class TestQuestao3 {
    Turma turma = new Turma();
    TurmaDAO turmadao;
    VerificadorDeCodigos verifCod;
    TurmaController turmaController;

    
    @Before
    public void setUp() {
        turmadao = mock(TurmaDAO.class);
        verifCod = mock(VerificadorDeCodigos.class);
        turmaController = new TurmaController(turmadao);
    }

    @Test
    public void TestCodDiscInvalido() {
        
        turma.setCodDisciplina("123");
        turma.setCodTurma("2");
        turma.setMaximoAlunos(10);
   
    
    }
}
