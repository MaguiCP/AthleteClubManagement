package Projeto;

import java.util.ArrayList;

/**
 * Representa um Prémio
 */
public final class Premio {
    /**
     * Número camisola
     */
    private int nCamisola;
    /**
     * Código da Equipa
     */
    private int codEquipa;
    /**
     * Equipa
     */
    Equipa equipa;
    /**
     * Designação do Prémio
     */
    private String designacao;
    /**
     * Ano de atribuição do Prémio
     */
    private int anoAtribuicao;
    /**
     * Lista de prémios
     */
    private ArrayList<Premio> listaPremio;

    /**
     * Valor default para Strings
     */
    private static final String DFT_STRING_OMISSAO = " sem nome";
    /**
     * Valor default para números
     */
    private static final int DFT_INT_OMISSAO = 0;

    /**
     * Classe construtora
     */
    @SuppressWarnings("unused")
    private Premio() {
        setnCamisola(DFT_INT_OMISSAO);
        setCodEquipa(DFT_INT_OMISSAO);
        setDesignacao(DFT_STRING_OMISSAO);
        setAnoAtribuicao(DFT_INT_OMISSAO);
        setListaPremio(new ArrayList<>());
        setEquipa(new Equipa());
    }

    /**
     * Constrói uma instância de premio com os valores passados por parâmetro
     * 
     * @param codEquipa     Código da Equipa
     * @param equipa        equipa
     * @param nCamisola     Número camisola
     * @param designacao    designação
     * @param anoAtribuicao Ano de atribuição do Prémio
     */

    public Premio(int codEquipa, Equipa equipa, int nCamisola, String designacao, int anoAtribuicao) {
        this.nCamisola = nCamisola;
        this.equipa = equipa;
        this.designacao = designacao;
        this.anoAtribuicao = anoAtribuicao;
        this.listaPremio = new ArrayList<>();
        this.codEquipa = codEquipa;
    }

    /**
     * Constrói uma instância de premio por cópia do premio passado por
     * parâmetro
     *
     * @param premio O prémio a copiar
     *
     */

    public Premio(Premio premio) {
        this.nCamisola = premio.nCamisola;
        this.equipa = premio.equipa;
        this.designacao = premio.designacao;
        this.anoAtribuicao = premio.anoAtribuicao;
        this.listaPremio = new ArrayList<>(premio.listaPremio);
    }

    /**
     * Devolve o código da Equipa
     *
     * @return código da equipa
     */

    public int getCodEquipa() {
        return codEquipa;
    }

    public void setCodEquipa(int codEquipa) {
        this.codEquipa = codEquipa;
    }

    /**
     * Devolve o número da camisola
     *
     * @return número da camisola
     */

    public int getnCamisola() {
        return nCamisola;
    }

    /**
     * Define o número de camisola
     *
     * @param nCamisola O núemero de camisola
     */

    public void setnCamisola(int nCamisola) {
        this.nCamisola = nCamisola;
    }

    /**
     * Devolve a Equipa
     *
     * @return equipa
     */

    public Equipa getEquipa() {
        return equipa;
    }

    /**
     * Define a Equipa
     *
     * @param equipa A equipa
     */

    public void setEquipa(Equipa equipa) {
        this.equipa = equipa;
    }

    /**
     * Devolve a designação
     *
     * @return a designação
     */

    public String getDesignacao() {
        return designacao;
    }

    /**
     * Define a designação
     *
     * @param designacao A designação
     */

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     * Devolve o ano de atribuição do prémio
     *
     * @return o ano de atribuição do prémio
     */

    public int getAnoAtribuicao() {
        return anoAtribuicao;
    }

    /**
     * Define o ano de atribuição do prémio
     *
     * @param anoAtribuicao ano de atribuição do prémio
     */

    public void setAnoAtribuicao(int anoAtribuicao) {
        this.anoAtribuicao = anoAtribuicao;
    }

    /**
     * Devolve a Lista de Prémios
     *
     * @return Lista de prémios
     */

    public ArrayList<Premio> getListaPremio() {
        return listaPremio;
    }

    /**
     * Modifica a Lista de Prémios
     *
     * @param listaPremio A nova lista de Prémios
     */

    public void setListaPremio(ArrayList<Premio> listaPremio) {
        this.listaPremio = listaPremio;
    }

    /**
     * Devolve a descrição atual do Premio
     * 
     * @return descrição do premio
     */

    @Override
    public String toString() {
        return "Premio{" + "nCamisola=" + nCamisola + ", equipa=" + equipa + ", designacao=" + designacao
                + ", anoAtribuicao=" + anoAtribuicao + '}';
    }

}
