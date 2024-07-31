package Projeto;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Representa um Clube
 */
public final class Clube {

    /**
     * Denominação do Clube
     */
    private String denominacao;
    /**
     * NIF do Clube
     */
    private String NIF;
    /**
     * Endereço do Clube
     */
    private String endereco;
    /**
     * contacto Telefónico do Clube
     */
    private String contactoTelefonico;
    /**
     * Correio eletrónico do CLube
     */
    private String correioEletronico;
    /**
     * Data do Clube
     */
    LocalDate data;
    /**
     * Lista de Atletas
     */
    private ArrayList<Atleta> listaAtletas;
    /**
     * Lista de Equipas
     */
    private ArrayList<Equipa> listaEquipa;
    /**
     * Lista de Jogadores
     */
    private ArrayList<Jogador> listaJogador;
    /**
     * Lista de Modalidades
     */
    private ArrayList<Modalidade> listaModalidade;
    /**
     * Lista de Prémios
     */
    private ArrayList<Premio> listaPremio;

    /**
     * Valor default para Strings
     */
    private static final String DFT_STRING_OMISSAO = " sem nome";

    /**
     * Classe Construtora
     */
    @SuppressWarnings("unused")
    private Clube() {
        setDenominacao(DFT_STRING_OMISSAO);
        setNIF(DFT_STRING_OMISSAO);
        setEndereco(DFT_STRING_OMISSAO);
        setContactoTelefonico(DFT_STRING_OMISSAO);
        setCorreioEletronico(DFT_STRING_OMISSAO);
        setListaAtletas(new ArrayList<>());
        setListaEquipa(new ArrayList<>());
        setListaJogador(new ArrayList<>());
        setListaModalidade(new ArrayList<>());
        setListaPremio(new ArrayList<>());
        setData(LocalDate.now());
    }

    /**
     * Constrói uma instância de Clube com os valores passados por parâmetro
     *
     * @param denominacao        denominação do Clube
     * @param NIF                O NIF do Clube
     * @param endereco           O endereço do Clube
     * @param data               A data do Clube
     * @param contactoTelefonico O contacto de telefone do Clube
     * @param correioEletronico  O endereço de correio eletrónico do Clube
     *
     */
    public Clube(String denominacao, String NIF, String endereco, LocalDate data, String contactoTelefonico,
            String correioEletronico) {
        this.listaAtletas = new ArrayList<>();
        this.listaEquipa = new ArrayList<>();
        this.listaModalidade = new ArrayList<>();
        this.listaJogador = new ArrayList<>();
        this.listaPremio = new ArrayList<>();
        this.denominacao = denominacao;
        this.NIF = NIF;
        this.endereco = endereco;
        this.contactoTelefonico = contactoTelefonico;
        this.correioEletronico = correioEletronico;
        this.data = data;
        listaAtletas = new ArrayList<>();
        listaModalidade = new ArrayList<>();
        listaJogador = new ArrayList<>();
        listaEquipa = new ArrayList<>();
        listaPremio = new ArrayList<>();

    }

    /**
     * Constrói uma instância de Clube por cópia do clube passado por parâmetro
     *
     * @param clube O clube a copiar
     *
     */
    public Clube(Clube clube) {
        this.listaAtletas = new ArrayList<>();
        this.listaModalidade = new ArrayList<>();
        this.listaEquipa = new ArrayList<>();
        this.listaJogador = new ArrayList<>();
        this.denominacao = clube.denominacao;
        this.NIF = clube.NIF;
        this.endereco = clube.endereco;
        this.contactoTelefonico = clube.contactoTelefonico;
        this.correioEletronico = clube.correioEletronico;
        this.data = clube.data;
        listaAtletas = new ArrayList<>(clube.listaAtletas);
        listaModalidade = new ArrayList<>(clube.listaModalidade);
        listaJogador = new ArrayList<>(clube.listaJogador);
        listaEquipa = new ArrayList<>(clube.listaEquipa);
        listaPremio = new ArrayList<>(clube.listaPremio);

    }

    /**
     * Devolve a Lista de Atletas
     *
     * @return lista de atletas
     */
    public ArrayList<Atleta> getListaAtletas() {
        return listaAtletas;
    }

    /**
     * Devolve a Lista de Equipas
     *
     * @return lista de equipas
     */
    public ArrayList<Equipa> getListaEquipa() {
        return listaEquipa;
    }

    /**
     * Devolve a Lista de Jogadores
     *
     * @return lista de jogadores
     */

    public ArrayList<Jogador> getListaJogador() {
        return listaJogador;
    }

    /**
     * Devolve a Lista de Modalidades
     *
     * @return lista de modalidades
     */
    public ArrayList<Modalidade> getListaModalidade() {
        return listaModalidade;
    }

    /**
     * Modifica a Lista de Atletas do Clube
     *
     * @param listaAtletas A nova lista de Atletas
     */

    public void setListaAtletas(ArrayList<Atleta> listaAtletas) {
        this.listaAtletas = listaAtletas;
    }

    /**
     * Modifica a Lista de Equipas do Clube
     *
     * @param listaEquipa A nova lista de Equipas
     */

    public void setListaEquipa(ArrayList<Equipa> listaEquipa) {
        this.listaEquipa = listaEquipa;
    }

    /**
     * Modifica a Lista de Jogares do Clube
     *
     * @param listaJogador nova lista de Jogadores
     */

    public void setListaJogador(ArrayList<Jogador> listaJogador) {
        this.listaJogador = listaJogador;
    }

    /**
     * Modifica a Lista de Modalidades do Clube
     *
     * @param listaModalidade A nova lista de Modalidade
     */

    public void setListaModalidade(ArrayList<Modalidade> listaModalidade) {
        this.listaModalidade = listaModalidade;
    }

    /**
     * Devolve a Data do Clube
     *
     * @return Data do Clube
     */

    public LocalDate getData() {
        return data;
    }

    /**
     * Define a data do Clube
     *
     * @param data data do clube
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Devolve a denominação do Clube
     *
     * @return denominação do Clube
     */

    public String getDenominacao() {
        return denominacao;
    }

    /**
     * Define a denominação do Clube
     *
     * @param denominacao denominação do clube
     */

    public void setDenominacao(String denominacao) {
        this.denominacao = denominacao;
    }

    /**
     * Devolve o NIF do Clube
     *
     * @return NIF do Clube
     */

    public String getNIF() {
        return NIF;
    }

    /**
     * Define o NIF do Clube
     *
     * @param NIF NIF do clube
     */
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    /**
     * Devolve o endereço do Clube
     *
     * @return endereço do Clube
     */

    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do Clube
     *
     * @param endereco endereço do clube
     */

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Devolve o contacto telefónico do Clube
     *
     * @return contacto telefónico do Clube
     */

    public String getContactoTelefonico() {
        return contactoTelefonico;
    }

    /**
     * Define o contacto telefónico do Clube
     *
     * @param contactoTelefonico contacto telefónicodo do clube
     */

    public void setContactoTelefonico(String contactoTelefonico) {
        this.contactoTelefonico = contactoTelefonico;
    }

    /**
     * Devolve o correio eletrónico do Clube
     *
     * @return correio eletrónico do Clube
     */

    public String getCorreioEletronico() {
        return correioEletronico;
    }

    /**
     * Define o correio eletrónico do Clube
     *
     * @param correioEletronico correio eletrónico do clube
     */

    public void setCorreioEletronico(String correioEletronico) {
        this.correioEletronico = correioEletronico;
    }

    /**
     * Devolve a Lista de Prêmios
     *
     * @return Lista de prêmios
     */

    public ArrayList<Premio> getListaPremio() {
        return listaPremio;
    }

    /**
     * Modifica a Lista de Prêmios do Clube
     *
     * @param listaPremio A nova lista de Prêmios
     */
    public void setListaPremio(ArrayList<Premio> listaPremio) {
        this.listaPremio = listaPremio;
    }

    /**
     * Adiciona um Atleta a lista de atletas
     *
     * @param nome           do Atleta
     * @param cc             do Atleta
     * @param endereco       do Atleta
     * @param dataNascimento do Atleta
     * @param telefone       do Atleta
     * @param email          do Atleta
     */
    public void adicionarAtleta(String nome, String cc, String endereco, LocalDate dataNascimento, String telefone,
            String email) {
        Atleta atleta = new Atleta(nome, cc, endereco, dataNascimento, telefone, email);
        listaAtletas.add(atleta);
    }

    /**
     * Adiciona uma modalidade a lista de modalidades
     *
     * @param nome
     * @param anoAtivacao
     */

    public void adicionarModalidade(String nome, int anoAtivacao) {
        Modalidade modalidade = new Modalidade(nome, anoAtivacao);
        listaModalidade.add(modalidade);
    }

    /**
     * Adiciona uma equipa a lista de equipas
     *
     * @param escalao
     * @param ano_civil
     * @param codMod
     */

    public void adicionarEquipa(String escalao, int ano_civil, int codMod) {
        Modalidade modalidade = listaModalidade.get(codMod);
        Equipa equipa = new Equipa(escalao, ano_civil, modalidade, codMod);
        listaEquipa.add(equipa);
    }

    /**
     * Adiciona um jogador a Equipa
     *
     * @param codEquipa
     * @param codAtleta
     * @param nCamisola
     * @param posicaoJogador
     */

    public void adicionarJogadorEquipa(int codEquipa, int codAtleta, int nCamisola, String posicaoJogador) {
        Equipa e = listaEquipa.get(codEquipa);
        Atleta a = listaAtletas.get(codAtleta);
        Jogador jogador = new Jogador(codEquipa, codAtleta, e, a, nCamisola, posicaoJogador);
        listaJogador.add(jogador);
    }

    /**
     * Adiciona um premio a lista de premios
     *
     * @param codEquipa
     * @param nCamisola
     * @param designacao
     * @param anoAtribuicao
     */

    public void adicionarPremioIndividual(int codEquipa, int nCamisola, String designacao, int anoAtribuicao) {
        Equipa e = listaEquipa.get(codEquipa);
        Premio premio = new Premio(codEquipa, e, nCamisola, designacao, anoAtribuicao);
        listaPremio.add(premio);
    }

    /**
     * Procura os jogadores na equipa
     *
     * @param num
     * @return jogador
     */

    public ArrayList<Jogador> obterJogadoresEquipa(int num) {
        ArrayList<Jogador> listaJogadoresEquipa = new ArrayList<Jogador>();

        for (int i = 0; i < listaJogador.size(); i++) {
            Jogador jogador = listaJogador.get(i);
            if (jogador.getCodEquipa() == num) {
                listaJogadoresEquipa.add(jogador);

            }
        }
        return listaJogadoresEquipa;
    }

    /**
     * Elimina um atleta da lista de atletas
     *
     * @param atleta
     */

    public void eliminarAtleta(Atleta atleta) {
        listaAtletas.remove(atleta);
    }

    /**
     * Elimina uma modalidade da lista de modalidades
     *
     * @param modalidade
     */

    public void eliminarModalidade(Modalidade modalidade) {
        listaModalidade.remove(modalidade);
    }

    /**
     * Elimina jogador da equipa
     *
     * @param numEquipa
     * @param numCamisola
     */

    public void eliminarJogadorEquipa(int numEquipa, int numCamisola) {
        for (int i = 0; i < listaJogador.size(); i++) {
            Jogador jogador = listaJogador.get(i);
            if (jogador.getCodEquipa() == numEquipa) {
                if (jogador.getNum_camisola() == numCamisola) {
                    listaJogador.remove(i);
                }
            }
        }
    }

    /**
     * Elimina equipa
     *
     * @param equipa
     */

    public void eliminarEquipa(Equipa equipa) {
        listaEquipa.remove(equipa);
    }

    /**
     * Elimina prêmio atribuido
     *
     * @param premio
     */

    public void eliminarPremio(Premio premio) {
        listaPremio.remove(premio);
    }

    /**
     * Calcula o total de prêmios de um atleta
     *
     * @param numModalidade
     * @return total de premios individuais
     */

    public int calcularTotalPremiosIndividuais(int numModalidade) {
        int totalPremiosIndividuais = 0;
        for (int i = 0; i < listaEquipa.size(); i++) {
            Equipa equipa = listaEquipa.get(i);
            if (equipa.getCodMod() == numModalidade) {
                for (int l = 0; l < listaPremio.size(); l++) {
                    Premio premio = listaPremio.get(l);
                    if (premio.getCodEquipa() == i) {
                        totalPremiosIndividuais++;
                    }
                }
            }
        }
        return totalPremiosIndividuais;
    }

    /**
     * Calcula o tatal de inscrições de um atleta
     *
     * @param numAtleta
     * @return numero de inscricoes de um atleta
     */

    public int calcularTotalInscricoesAtleta(int numAtleta) {
        int totalInscricoesAtleta = 0;
        for (int i = 0; i < listaJogador.size(); i++) {
            Jogador jogador = listaJogador.get(i);
            if (jogador.getCodAtleta() == numAtleta) {
                totalInscricoesAtleta++;
            }
        }
        return totalInscricoesAtleta;
    }

    /**
     * Devolve a descrição atual do Clube
     *
     * @return descrição do clube
     */
    @Override
    public String toString() {
        return "Clube{" + "denominacao=" + denominacao + ", NIF=" + NIF + ", endereco=" + endereco
                + ", contactoTelefonico=" + contactoTelefonico + ", correioEletronico=" + correioEletronico + ", data="
                + data + "\n listaAtletas=" + listaAtletas + "\n listaEquipa=" + listaEquipa + "\n listaJogador="
                + listaJogador + "\n listaModalidade=" + listaModalidade + "\n listaPremio=" + listaPremio + '}';
    }

}
