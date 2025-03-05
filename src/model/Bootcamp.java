package model;

import model.bases.AtividadesOuCursos;
import model.bases.Devs;
import model.bases.Mentorias;

import java.util.Date;

public class Bootcamp {
    private String nome;
    private String descricao;
    private Date dataInicial;
    private Date dataFinal;
    private Devs dev;
    private Mentorias mentoria;
    private AtividadesOuCursos atividadesOuCursos;
}
