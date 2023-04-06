import com.sun.source.tree.ReturnTree;

import java.util.List;

public class Presenca {

    private String dia;
    private List<Aluno> alunos;

    public Presenca(String dia, List<Aluno> alunos){
        this.dia = dia;
        this.alunos = alunos;
    }

    public String getDia(){
        return this.dia;
    }

    public void setDia(String dia){
        this.dia = dia;
    }

    public List<Aluno> getAlunos(){
        return alunos;
    }

    public  void addAluno(Aluno aluno){
        alunos.add(aluno);
    }
}
