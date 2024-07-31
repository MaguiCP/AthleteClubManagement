package Projeto;

import java.time.LocalDate;

/**
 * Representa um Atleta
 */
public class Atleta {

    /**
     * Nome do Atleta
     */
    private String nome;
    /**
     * Número do cartão de cidadão
     */

    private String num_cartao_cidadao;

    /**
     * Endereço do Atleta
     */
    private String endereco;
    /**
     * Data de nascimento do Atleta
     */
    LocalDate data_nascimento;
    /**
     * Contacto de telefone do Atleta
     */
    private String contacto_tele;
    /**
     * Correio eletrónico do Atleta
     */
    private String correio_ele;

    /**
     * Valor default para Strings
     */
    private static final String DFT_STRING_OMISSAO = " sem nome";

    /**
     * Classe construtora
     */
    @SuppressWarnings("unused")
    private Atleta() {
        setNome(DFT_STRING_OMISSAO);
        setNum_cartao_cidadao(DFT_STRING_OMISSAO);
        setEndeco(DFT_STRING_OMISSAO);
        setData_nascimento(LocalDate.now());

    }

    /**
     * Constrói uma instância de Atleta com os valores passados por parâmetro
     *
     * @param nome               O nome do atleta
     * @param num_cartao_cidadao O número do cartao cidadao do Atleta
     * @param endereco           O endereço do Atleta
     * @param data_nascimento    A data de nascimento do Atleta
     * @param contacto_tele      O contacto de telefone do
     * @param correio_ele        O endereço de correio eletrónico do Atleta
     *
     */
    public Atleta(String nome, String num_cartao_cidadao, String endereco, LocalDate data_nascimento,
            String contacto_tele, String correio_ele) {

        this.nome = nome;
        this.num_cartao_cidadao = num_cartao_cidadao;
        this.endereco = endereco;
        this.data_nascimento = data_nascimento;
        this.contacto_tele = contacto_tele;
        this.correio_ele = correio_ele;

    }

    /**
     * Constrói uma instância de Atleta por cópia do atleta passado por
     * parâmetro
     *
     * @param atleta O atleta a copiar
     *
     */
    public Atleta(Atleta atleta) {
        this.nome = atleta.nome;
        this.num_cartao_cidadao = atleta.num_cartao_cidadao;
        this.endereco = atleta.endereco;
        this.data_nascimento = atleta.data_nascimento;
        this.contacto_tele = atleta.contacto_tele;
        this.correio_ele = atleta.correio_ele;

    }

    /**
     * Devolve o nome do Atleta
     *
     * @return nome do atleta
     */
    public String getNome() {
        return nome;
    }

    /**
     * Devolve número do cartão cidadão do atleta
     *
     * @return numero cartao cidadao do atleta
     */
    public String getNum_cartao_cidadao() {
        return num_cartao_cidadao;
    }

    /**
     * Devolve o endereço do Atleta
     *
     * @return endereco atleta
     */
    public String getEndeco() {
        return endereco;
    }

    /**
     * Devolve data de nascimento do Atleta
     *
     * @return data de nascimento
     */
    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    /**
     * Devolve contacto telefónico do Atleta
     *
     * @return contacto telefonico do atleta
     */
    public String getContacto_tele() {
        return contacto_tele;
    }

    /**
     * Devolve correio eletrónico do Atleta
     *
     * @return correio eletronico do atleta
     */
    public String getCorreio_ele() {
        return correio_ele;
    }

    /**
     * Define o nome do Atleta
     *
     * @param nome O nome do Atleta
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define o número do cartão de cidadão do Atleta
     *
     * @param num_cartao_cidadao número do cartão de cidadão do Atleta
     */
    public void setNum_cartao_cidadao(String num_cartao_cidadao) {
        this.num_cartao_cidadao = num_cartao_cidadao;
    }

    /**
     * Define endereço do Atleta
     *
     * @param endeco endereço do atleta
     */
    public void setEndeco(String endeco) {
        this.endereco = endeco;
    }

    /**
     * Define a data de nascimento do Atleta
     *
     * @param data_nascimento data de nascimento do atleta
     */
    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    /**
     * Define contacto do atleta
     *
     * @param contacto_tele contacto do atleta
     */
    public void setContacto_tele(String contacto_tele) {
        this.contacto_tele = contacto_tele;
    }

    /**
     * Define correio eletrónico do atleta
     *
     * @param correio_ele correio eletrónico do atleta
     */
    public void setCorreio_ele(String correio_ele) {
        this.correio_ele = correio_ele;
    }

    /**
     * Devolve a descrição atual do Atleta
     *
     * @return descrição do atleta
     */
    @Override
    public String toString() {
        return "Atleta{" + "nome=" + nome + ", num_cartao_cidadao=" + num_cartao_cidadao + ", endereco=" + endereco
                + ", data_nascimento=" + data_nascimento + ", contacto_tele=" + contacto_tele + ", correio_ele="
                + correio_ele + '}' + "\n";
    }
}
