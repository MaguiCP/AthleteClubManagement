package Projeto;

import java.util.ArrayList;

/**
 * Representa um Jogador
 */
public final class Jogador {

    /**
     * Número de camisola do Jogador
     */
    private int num_camisola;
    /**
     * Posição do Jogador
     */
    private String posicao_jogador;
    /**
     * código da Equipa
     */
    private int codEquipa;
    /**
     * código do Atleta
     */
    private int codAtleta;
    /**
     * Equipa
     */
    Equipa equipa;
    /**
     * Atleta
     */
    Atleta atleta;
    /**
     * Lista de Jogadores
     */
    private ArrayList<Jogador> jogadores;
    /**
     * Valor default para Strings
     */
    private static String DFT_STRING_OMISSAO = " sem posi��o do jogador";
    /**
     * Valor default para números
     */
    private static int DFT_INT_OMISSAO = 0;

    /**
     * Classe construtora
     */
    @SuppressWarnings("unused")
    private Jogador() {
        setPosicao_jogador(DFT_STRING_OMISSAO);
        setNum_camisola(DFT_INT_OMISSAO);
        setCodEquipa(DFT_INT_OMISSAO);
        setCodAtleta(DFT_INT_OMISSAO);

    }

    /**
     * Constrói uma instância de Jogador com os valores passados por parâmetro
     *
     * @param codEquipa       código da Equipa
     * @param codAtleta       código do Atleta
     * @param e               equipa
     * @param a               atleta
     * @param num_camisola    Número de camisola do Jogador
     * @param posicao_jogador Posição do Jogador
     */

    public Jogador(int codEquipa, int codAtleta, Equipa e, Atleta a, int num_camisola, String posicao_jogador) {
        this.num_camisola = num_camisola;
        this.posicao_jogador = posicao_jogador;
        this.equipa = e;
        this.atleta = a;
        this.codAtleta = codAtleta;
        this.jogadores = new ArrayList<>();
        this.codEquipa = codEquipa;
    }

    /**
     * Constrói uma instância de Jogador por cópia do jogador passado por
     * parâmetro
     *
     * @param jogador O jogador a copiar
     *
     */
    public Jogador(Jogador jogador) {

        this.num_camisola = jogador.num_camisola;
        this.posicao_jogador = jogador.posicao_jogador;
        this.codAtleta = jogador.codAtleta;
        this.num_camisola = jogador.num_camisola;
        this.codEquipa = jogador.codEquipa;
        this.equipa = new Equipa(jogador.equipa);
        this.atleta = new Atleta(jogador.atleta);
        setJogadores(new ArrayList<>());

    }

    /**
     * Devolve o Código do Atleta
     *
     * @return Código do atleta
     */

    public int getCodAtleta() {
        return codAtleta;
    }

    /**
     * Define o C�digo do Atleta
     *
     * @param codAtleta O C�digo do Atleta
     */

    public void setCodAtleta(int codAtleta) {
        this.codAtleta = codAtleta;
    }

    /**
     * Devolve o Código da Equipa
     *
     * @return Código da Equipa
     */

    public int getCodEquipa() {
        return codEquipa;
    }

    /**
     * Define o Código da Equipa
     *
     * @param codEquipa da Equipa
     */

    public void setCodEquipa(int codEquipa) {
        this.codEquipa = codEquipa;
    }

    /**
     * Devolve o número da camisola do Jogador
     *
     * @return número da camisola do jogador
     */

    public int getNum_camisola() {
        return num_camisola;
    }

    /**
     * Define o número de camisola da Equipa
     *
     * @param num_camisola O número de camisola do Jogador
     */

    public void setNum_camisola(int num_camisola) {
        this.num_camisola = num_camisola;
    }

    /**
     * Devolve a posição do Jogador
     *
     * @return posição do jogador
     */

    public String getPosicao_jogador() {
        return posicao_jogador;
    }

    /**
     * Define a posição do Jogador
     *
     * @param posicao_jogador A posição do Jogador
     */

    public void setPosicao_jogador(String posicao_jogador) {
        this.posicao_jogador = posicao_jogador;
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
     * Devolve o Atleta
     *
     * @return atleta
     */

    public Atleta getAtleta() {
        return atleta;
    }

    /**
     * Define o Atleta
     *
     * @param atleta O atleta
     */

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
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
     * Modifica a Lista de Jogadores
     *
     * @param jogadores a nova lista de jogadores
     */

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    /**
     * Devolve a descrição atual do Jogador
     *
     * @return descrição do jogador
     */

    @Override
    public String toString() {
        return "Jogador{" + "num_camisola=" + num_camisola + ", posicao_jogador=" + posicao_jogador + ", equipa="
                + equipa + ", atleta=" + atleta + ", jogadores=" + jogadores + '}';
    }

}
