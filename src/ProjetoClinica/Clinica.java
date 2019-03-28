package ProjetoClinica;

public class Clinica {
    public static void main(String args[]){
        Paciente paciente = new Paciente();
        paciente.nome = "Willdenberg";
        paciente.endereco = "Icoaraci"
        paciente.numeroCartao = 232323;

        Medico medico = new Medico();
        medico.nome = "Pedro";
        medico.endereco = "Umarizal";
        medico.crm = "12312";
        medico.especialidade = "cardiologista";

        AtendimentoMedico atendimento = new AtendimentoMedico();
        atendimento.dataConsulta = "20/04/19";
        atendimento.paciente = paciente;
        atendimento.medico = medico;



    }
}
