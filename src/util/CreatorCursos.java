package util;

import br.com.dio.desafio.dominio.model.bases.Curso;

import java.util.ArrayList;
import java.util.List;

public class CreatorCursos {

    public static Curso criarCurso( ){
        Curso curso = new Curso();
        curso.setDescricao("Java Curso");
        curso.setTitulo("Teste");
        curso.setCargaHoraria(25);
        return curso;
    }
    public static List<Curso> ListaDeCursos( ) {
        List listaCursos = new ArrayList<>();
        Curso curso1 = new Curso();
        curso1.setDescricao("Java Curso");
        curso1.setTitulo("Teste");
        curso1.setCargaHoraria(25);
        Curso curso2 = new Curso();
        curso2.setDescricao("Java Curso");
        curso2.setTitulo("Teste");
        curso2.setCargaHoraria(25);
        listaCursos.add(curso1);
        listaCursos.add(curso2);
        return listaCursos;
    }

}
