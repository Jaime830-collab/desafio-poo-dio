import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Do basico ao Avancado");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Frontend");
        curso2.setCargaHoraria(20);
        
        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Como proseguir no Bootcamp");
        mentoria1.setDescricao("Metodos de Estudos");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer.");
        bootcamp.setDescricao("Desenvolva suas abilidades com Java.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev01 = new Dev();
        dev01.setNome("Calabreso");
        dev01.inscreverBootcamo(bootcamp);
        System.out.println("Conteudos Inscritos de Calabreso" + dev01.getConsteudosInscritos());
        System.out.println("Conteudos Concluidos de Calabreso" + dev01.getConsteudosConcluidos());
        dev01.progredir();
        dev01.progredir();

        System.out.println("Conteudos Inscritos de Lombrigo" + dev01.getConsteudosInscritos());
        System.out.println("Conteudos Concluidos de Lombrigo" + dev01.getConsteudosConcluidos());
        System.out.println("XP" + dev01.calcularTotalXp());

        System.err.println("--------------------------------------------------------------");

        Dev dev02 = new Dev();
        dev02.setNome("Lombrigo");
        dev02.inscreverBootcamo(bootcamp);
        System.out.println("Conteudos Inscritos de Lombrigo" + dev02.getConsteudosInscritos());
        System.out.println("Conteudos Concluidos de Lombrigo" + dev02.getConsteudosConcluidos());
        dev02.progredir();
        dev02.progredir();
        dev02.progredir();

        System.out.println("Conteudos Inscritos de Lombrigo" + dev02.getConsteudosInscritos());
        System.out.println("Conteudos Concluidos de Lombrigo" + dev02.getConsteudosConcluidos());
        System.out.println("XP" + dev02.calcularTotalXp());

    }
}
