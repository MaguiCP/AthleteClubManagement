package Projeto;

import java.util.ArrayList;

/**
 * Representa uma Equipa
 */
public class Equipa {

    /**
     * Escalão da Equipa
     */
    private String escalao;
    /**
     * Ano civil da Equipa
     */
    private int ano_civil;
    /**
     * Código da Modalidade da Equipa
     */
    private int codMod;
    /**
     * Modalidade
     */
    Modalidade modalidade;
    /**
     * Lista de Jogadores
     */
    ArrayList<Jogador> jogadores;
    /**
     * Valor default para Strings
     */
    private static final String ESCALAO_PREDEFINIDO = "Nao definido";
    /**
     * Valor default para números
     */
    private static final int DFT_INT_OMISSAO = 0;

    /**
     * Classe construtora
     */
    public Equipa() {

        setEscalao(ESCALAO_PREDEFINIDO);
        setAno_civil(DFT_INT_OMISSAO);
    }

    /**
     * Constrói uma instância de Equipa com os valores passados por parâmetro
     *
     * @param escalao   Escalão da Equipa
     * @param ano_civil Ano civil da Equipa
     * @param m         modalidade
     * @param codMod    Código da Modalidade da Equipa
     */

    public Equipa(String escalao, int ano_civil, Modalidade m, int codMod) {

        this.escalao = escalao;
        this.ano_civil = ano_civil;
        this.modalidade = m;
        this.jogadores = new ArrayList<>();
        this.codMod = codMod;
    }

    /**
     * Constrói uma instância de Equipa por cópia da equipa passado por
     * parâmetro
     *
     * @param equipa A equipa a copiar
     *
     */
    public Equipa(Equipa equipa) {

        this.escalao = equipa.escalao;
        this.ano_civil = equipa.ano_civil;
    }

    /**
     * Devolve a Modalidade
     *
     * @return modalidade da equipa
     */

    public Modalidade getModalidade() {
        return modalidade;
    }

    /**
     * Define a Modalidade
     *
     * @param modalidade a Modalidade
     */

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    /**
     * Devolve a Lista de Jogadores
     *
     * @return Lista de jogadores
     */

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    /**
     * Modifica a Lista deJogadores
     *
     * @param jogadores a nova lista de jogadores
     */

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    /**
     * Devolve o Código da Modalidade da Equipa
     *
     * @return Código da Modalidade da Equipa
     */

    public int getCodMod() {
        return codMod;
    }

    /**
     * Define o Código da Modalidade da Equipa
     *
     * @param codMod Código da Modalidade da Equipa
     */

    public void setCodMod(int codMod) {
        this.codMod = codMod;
    }

    /**
     * Devolve o Escalão
     *
     * @return Escalão
     */

    public String getEscalao() {
        return escalao;
    }

    /**
     * Define o Escalão
     *
     * @param escalao O Escalão
     */

    public void setEscalao(String escalao) {
        this.escalao = escalao;
    }

    /**
     * Devolve o ano civil da Equipa
     *
     * @return ano civil da equipa
     */

    public int getAno_civil() {
        return ano_civil;
    }

    /**
     * Define o ano civil da Equipa
     *
     * @param ano_civil O ano civil da Equipa
     */

    public void setAno_civil(int ano_civil) {
        this.ano_civil = ano_civil;
    }

    /**
     * Devolve a descrição atual da Equipa
     *
     * @return descrição da equipa
     */

    @Override
    public String toString() {
        return "Equipa{" + "escalao=" + escalao + ", ano_civil=" + ano_civil + ", modalidade=" + modalidade + '}';
    }

}
