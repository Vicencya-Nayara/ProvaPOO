public class Clinica {
    public static void main(String[] args) {
        AgendaMedica C1 = new AgendaMedica();
        C1.Agendar("João","18:00");
        C1.VerificarHorario("18:00");
        C1.VerificarPaciente("João");
    }
}