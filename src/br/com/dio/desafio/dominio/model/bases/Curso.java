package br.com.dio.desafio.dominio.model.bases;


public class Curso extends  Conteudo {

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    private int cargaHoraria;


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "Curso" + " {" +
                "título = '" + getTitulo() + '\'' +
                ", descrição = '" + getDescricao() + '\'' +
                ", carga horaria = " + cargaHoraria + " horas"+
                '}';
    }

}
