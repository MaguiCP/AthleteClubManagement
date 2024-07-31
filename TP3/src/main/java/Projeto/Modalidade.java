package Projeto;

import java.util.ArrayList;

/**
 * Representa uma Modalidade
 */
public final class Modalidade {

    /**
     * nome da modalidade
     */
    private String nome_modalidade;
    /**
     * ano de ativação da Modalidade
     */
    private int anoAtivacao;
    /**
     * Lista de modalidades
     */
    private ArrayList<Modalidade> listarModalidades;
    /**
     * Valor default para Strings
     */
    private static String DFT_STRING_OMISSAO = " sem modalidade";
    /**
     * Valor default para números
     */
    private static int DFT_INT_OMISSAO = 0;

    /**
     * Classe construtora
     */
    @SuppressWarnings("unused")
    private Modalidade() {
        setListarModalidades(new ArrayList<>());
        setNome_modalidade(DFT_STRING_OMISSAO);
        setAnoAtivacao(DFT_INT_OMISSAO);
    }

    /**
     * Contrói uma instância de modalidade com os valores passados por parâmetro
     *
     * @param nome_modalidade nome da modalidade
     * @param anoAtivacao     ano de ativação
     */

    public Modalidade(String nome_modalidade, int anoAtivacao) {
        this.nome_modalidade = nome_modalidade;
        this.anoAtivacao = anoAtivacao;
    }

    /**
     * Constrói uma instância de Modalidade por cópia da modalidade passado por
     * parâmetro
     *
     * @param modalidade A modalidade a copiar
     *
     */

    public Modalidade(Modalidade modalidade) {
        this.listarModalidades = new ArrayList<>();
        this.nome_modalidade = modalidade.nome_modalidade;
        this.anoAtivacao = modalidade.anoAtivacao;
        listarModalidades = new ArrayList<>(modalidade.listarModalidades);

    }

    /**
     * Devolve o nome da Modalidade
     *
     * @return nome da modalidade
     */

    public String getNome_modalidade() {
        return nome_modalidade;
    }

    /**
     * Define o nome da Modalidade
     *
     * @param nome_modalidade O nome da modalidade
     */

    public void setNome_modalidade(String nome_modalidade) {
        this.nome_modalidade = nome_modalidade;
    }

    /**
     * Devolve o ano da ativação da modalidade
     *
     * @return ano ativação da modalidade
     */

    public int getAnoAtivacao() {
        return anoAtivacao;
    }

    /**
     * Define o ano de ativação da Modalidade
     *
     * @param anoAtivacao O ano de ativação da modalidade
     */

    public void setAnoAtivacao(int anoAtivacao) {
        this.anoAtivacao = anoAtivacao;
    }

    /**
     * Devolve a Lista de Modalidades
     *
     * @return Lista de modalidades
     */

    public ArrayList<Modalidade> getListarModalidades() {
        return listarModalidades;
    }

    /**
     * Modifica a Lista de Prémios de Modalidades
     *
     * @param listarModalidades A nova lista de Modalidades
     */

    public void setListarModalidades(ArrayList<Modalidade> listarModalidades) {
        this.listarModalidades = listarModalidades;
    }

    /**
     * Devolve a descrição atual da Modalidade
     *
     * @return descrição da modalidade
     */
    @Override
    public String toString() {
        return "Modalidade{" + "nome_modalidade=" + nome_modalidade + ", anoAtivacao=" + anoAtivacao;
    }

}
