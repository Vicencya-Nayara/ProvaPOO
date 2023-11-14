import java.util.Scanner;

public class AgendaMedica {
    Scanner Ler = new Scanner(System.in);
    MarcacaoHorario[] consulta = new MarcacaoHorario[8];

    public AgendaMedica() {
        for (int i = 0; i < 8; i++) {
            consulta[i] = new MarcacaoHorario();
            System.out.printf("Informe o %dº horário disponível: ", i + 1);
            consulta[i].Horario = Ler.next();
            consulta[i].NomePaciente = "Livre";
        }
    }

    public void Agendar(String N, String H) {
        for (int i = 0; i < 8; i++) {
            if (consulta[i].Horario.equals(H)) {
                if (consulta[i].NomePaciente.equals("Livre")) {
                    consulta[i].NomePaciente = N;
                    System.out.println("Consulta marcada com sucesso.");
                    return;
                } else {
                    System.out.println("O horário não está disponível.");
                    return;
                }
            }
        }
        System.out.println("Horário inválido.");
    }

    public void VerificarHorario(String H) {
        for (int i = 0; i < 8; i++) {
            if (consulta[i].Horario.equals(H)) {
                if (consulta[i].NomePaciente.equals("Livre")) {
                    System.out.println("Horário Livre");
                } else {
                    System.out.println("Consulta marcada para: " + consulta[i].NomePaciente);
                }
                return;
            }
        }
        System.out.println("Horário inválido.");
    }

    public void VerificarPaciente(String N) {
        boolean pacienteEncontrado = false;
        for (int i = 0; i < 8; i++) {
            if (consulta[i].NomePaciente.equals(N)) {
                System.out.println("Consulta marcada para este paciente no horário: " + consulta[i].Horario);
                pacienteEncontrado = true;
            }
        }
        if (!pacienteEncontrado) {
            System.out.println("Nenhuma consulta marcada para este paciente.");
        }
    }
}