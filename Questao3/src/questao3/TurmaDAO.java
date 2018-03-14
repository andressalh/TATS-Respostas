package questao3;


import questao3.Turma;

public interface TurmaDAO {
    public boolean existe(Turma turma);
    public boolean salvar(Turma turma);
}