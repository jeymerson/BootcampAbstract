package br.com.dio.desafio.dominio.model.bases;

import java.time.LocalDate;

public class Mentoria  extends  Conteudo {
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO +20d;
    }


    @Override
    public String toString() {
        return "Mentoria" + " {" +
                "título = '" + getTitulo() + '\'' +
                ", descrição = '" + getDescricao() + '\'' +
                ", data = " + data +
                '}';
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

}
