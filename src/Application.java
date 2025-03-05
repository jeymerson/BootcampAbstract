import br.com.dio.desafio.dominio.model.Bootcamp;
import br.com.dio.desafio.dominio.model.bases.Curso;
import br.com.dio.desafio.dominio.model.bases.Dev;
import br.com.dio.desafio.dominio.model.bases.Mentoria;
import util.CreatorCursos;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        Curso curso1 = new Curso();
        curso1.setDescricao("Java Curso1");
        curso1.setTitulo("Teste1");
        curso1.setCargaHoraria(25);
        System.out.println(curso1);
        System.out.println(data);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java mentoria");
        mentoria.setDescricao("Descrevendo");
        mentoria.setData(data);
        System.out.println(mentoria);
        Curso curso2 = CreatorCursos.criarCurso();
        System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Drescrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev DevJeySilver = new Dev();
        DevJeySilver.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos" + DevJeySilver.getConteudosInscritos());

        DevJeySilver.progredir();
        DevJeySilver.progredir();

        System.out.println("-");
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + DevJeySilver.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + DevJeySilver.getConteudosConcluidos());
        System.out.println("XP: " + DevJeySilver.calcularTotalXp());

        System.out.println("_______________________________");
        Dev DevJoao = new Dev();
        DevJoao.setNome("João");
        DevJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos" + DevJoao.getConteudosInscritos());

        DevJoao.progredir();
        DevJoao.progredir();
        DevJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + DevJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + DevJoao.getConteudosConcluidos());
        System.out.println("XP: " + DevJoao.calcularTotalXp());


    }
}