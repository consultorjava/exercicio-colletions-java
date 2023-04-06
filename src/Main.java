import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno("Heron");
        Aluno aluno02 = new Aluno("Renata");
        Aluno aluno03 = new Aluno("Mariano");
        Aluno aluno04 = new Aluno("Jorge");

        List<Aluno> todosAlunos = List.of(aluno01,aluno02,aluno03,aluno04);

        List<Aluno> listaAlunosDia06 = List.of(aluno01,aluno02);
        List<Aluno> listaAlunosDia07 = List.of(aluno03,aluno04);

        Presenca presencaDia06 = new Presenca("06/04/2023",listaAlunosDia06);
        Presenca presencaDia07 = new Presenca("07/04/2023",listaAlunosDia07);
        Presenca presencaDia08 = new Presenca("08/04/2023",listaAlunosDia07);
        Presenca presencaDia09 = new Presenca("09/04/2023",listaAlunosDia06);



        Map<String, Presenca> chamada = new HashMap<>();
        chamada.put("01",presencaDia06);
        chamada.put("02",presencaDia07);
        chamada.put("03",presencaDia08);
        chamada.put("07",presencaDia09);

        Set<String> presencaDia = chamada.keySet();
        System.out.print("          ");
        for(String dia : presencaDia){
            System.out.print(chamada.get(dia).getDia() + " - ");
        }
        System.out.println("");

        for(Aluno aluno : todosAlunos){
           System.out.print(aluno.getNome()+ "       ");
            for(String dia2 : presencaDia){
                if(chamada.get(dia2).getAlunos().contains(aluno)){
                    System.out.print("Presente" + " - ");
                }else{
                    System.out.print("Ausente" + " - ");
                }
            }
            System.out.println("");
        }
        



    }
}