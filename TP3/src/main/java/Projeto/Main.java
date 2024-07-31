package Projeto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
                try (Scanner ler = new Scanner(System.in)) {
                        Clube c1 = new Clube("Clube X", "123456789", "Porto", LocalDate.of(2014, 5, 2), "931122334",
                                        "clubex@gmail.com");

                        // Adicionar 10 atletas ao clube
                        c1.adicionarAtleta("Pedro Nunes", "1111111", "Porto", LocalDate.of(2000, 3, 1), "91234343234",
                                        "pedronumes@gmail.com");
                        c1.adicionarAtleta("Mário Alves", "2222222", "Maia", LocalDate.of(2000, 12, 5), "91666777888",
                                        "marioalves@gmail.com");
                        c1.adicionarAtleta("Miguel Oliveira", "3333333", "Gaia", LocalDate.of(1997, 2, 15),
                                        "91666777888",
                                        "marioalves@gmail.com");
                        c1.adicionarAtleta("Rui Silva", "4444444", "Porto", LocalDate.of(1997, 12, 5), "91666777888",
                                        "marioalves@gmail.com");
                        c1.adicionarAtleta("Tiago Silva", "5555555", "Gaia", LocalDate.of(2000, 10, 22), "91666777888",
                                        "marioalves@gmail.com");
                        c1.adicionarAtleta("José Pedro", "6666666", "Valongo", LocalDate.of(2000, 1, 16), "91666777888",
                                        "marioalves@gmail.com");
                        c1.adicionarAtleta("Gabriel Bastos", "7777777", "Matosinhos", LocalDate.of(1997, 6, 24),
                                        "91666777888",
                                        "marioalves@gmail.com");
                        c1.adicionarAtleta("Gustavo Mendes", "8888888", "Maia", LocalDate.of(2000, 8, 1), "91666777888",
                                        "marioalves@gmail.com");
                        c1.adicionarAtleta("Alexandre Santos", "9999999", "Porto", LocalDate.of(2002, 4, 25),
                                        "91666777888",
                                        "marioalves@gmail.com");
                        c1.adicionarAtleta("Gonçalo Barbosa", "1212121", "Matosinhos", LocalDate.of(2002, 9, 15),
                                        "91666777888",
                                        "marioalves@gmail.com");
                        System.out.println("I - Listar toda a informação do clube" + c1.toString());

                        // Adicionar 2 modalidades ao clube
                        c1.adicionarModalidade("futebol", 1990);
                        c1.adicionarModalidade("futsal", 1995);
                        System.out.println("II - Listar toda a informação do clube" + c1.toString());

                        // Adicionar 2 equipas e, para isso, fazer:
                        // Mostrar todas as modalidades do clube, solicitar uma e depois adicionar/criar
                        // uma
                        // equipa (sem jogadores por agora)
                        ArrayList<Modalidade> listaModalidade = c1.getListaModalidade();
                        listarModalidades(listaModalidade);
                        System.out.println("\nDigite a posição da modalidade na lista: ");
                        int num = ler.nextInt();
                        c1.adicionarEquipa("sub21", 2020, num);

                        // Outra equipa
                        // Mostrar todas as modalidades do clube, solicitar uma e depois adicionar/criar
                        // uma
                        // equipa (sem jogadores por agora)
                        listaModalidade = c1.getListaModalidade();
                        listarModalidades(listaModalidade);
                        System.out.println("\nDigite a posição da modalidade na lista: ");
                        num = ler.nextInt();
                        c1.adicionarEquipa("sub23", 2021, num);
                        System.out.println("III - Listar toda a informação do clube" + c1.toString());

                        // Adicionar 2 jogadores a cada uma das equipas criadas anteriormente. Para
                        // isso, come�ar por
                        // selecionar a equipa e s� depois os atletas.
                        ArrayList<Equipa> listaEquipa = c1.getListaEquipa();
                        listarEquipas(listaEquipa);
                        System.out.println("\nDigite a posição da equipa na lista: ");
                        num = ler.nextInt();
                        ArrayList<Atleta> listaAtleta = c1.getListaAtletas();
                        listarAtletas(listaAtleta);
                        System.out.println("\nDigite a posição do atleta na lista: ");
                        int num1 = ler.nextInt();
                        c1.adicionarJogadorEquipa(num, num1, 12, "defesa esquerdo");

                        // outro atleta
                        listarAtletas(listaAtleta);
                        System.out.println("\nDigite a posição do atleta na lista: ");
                        num1 = ler.nextInt();
                        c1.adicionarJogadorEquipa(num, num1, 7, "atacante");

                        // outro atleta
                        listarAtletas(listaAtleta);
                        System.out.println("\nDigite a posição do atleta na lista: ");
                        num1 = ler.nextInt();
                        c1.adicionarJogadorEquipa(num, num1, 78, "guarda-redes");

                        System.out.println("IV - Listar toda a informação do clube" + c1.toString());

                        // Adicionar 3 jogadores a outra equipa. Começar por listar as equipas
                        // existentes no clube
                        listarEquipas(listaEquipa);
                        System.out.println("\nDigite a posição da equipa na lista: ");
                        num = ler.nextInt();
                        listaAtleta = c1.getListaAtletas();

                        // Listar os atletas e pedir para escolher um deles
                        listarAtletas(listaAtleta);
                        System.out.println("\nDigite a posição do atleta na lista: ");
                        num1 = ler.nextInt();
                        c1.adicionarJogadorEquipa(num, num1, 77, "guarda-redes");

                        // outro atleta
                        listarAtletas(listaAtleta);
                        System.out.println("\nDigite a posição do atleta na lista: ");
                        num1 = ler.nextInt();
                        c1.adicionarJogadorEquipa(num, num1, 25, "defesa direito");

                        // outro atleta
                        listarAtletas(listaAtleta);
                        System.out.println("\nDigite a posição do atleta na lista: ");
                        num1 = ler.nextInt();
                        c1.adicionarJogadorEquipa(num, num1, 15, "atacante");
                        System.out.println("IV - Listar toda a informação do clube" + c1.toString());

                        // Adicionar um prémio individual. A equipa, jogador devem ser escolhidos.
                        listarEquipas(listaEquipa);
                        System.out.println("\nDigite a posição da equipa na lista: ");
                        num = ler.nextInt();
                        ArrayList<Jogador> listaJogadoresEquipa = c1.obterJogadoresEquipa(num);
                        listarJogadoresEquipa(listaJogadoresEquipa);
                        System.out.println("\nDigite o número da camisola do jogador: ");
                        num1 = ler.nextInt();
                        c1.adicionarPremioIndividual(num, num1, "Melhor jogador em campo", 2021);

                        // Adicionar um prémio individual. A equipa, jogador devem ser escolhidos.
                        listarEquipas(listaEquipa);
                        System.out.println("\nDigite a posição da equipa na lista: ");
                        num = ler.nextInt();
                        listaJogadoresEquipa = c1.obterJogadoresEquipa(num);
                        listarJogadoresEquipa(listaJogadoresEquipa);
                        System.out.println("\nDigite o número da camisola do jogador: ");
                        num1 = ler.nextInt();
                        c1.adicionarPremioIndividual(num, num1, "Melhor jogador em campo", 2021);

                        // Adicionar um prémio individual. A equipa, jogador devem ser escolhidos.
                        listarEquipas(listaEquipa);
                        System.out.println("\nDigite a posição da equipa na lista: ");
                        num = ler.nextInt();
                        listaJogadoresEquipa = c1.obterJogadoresEquipa(num);
                        listarJogadoresEquipa(listaJogadoresEquipa);
                        System.out.println("\nDigite o número da camisola do jogador: ");
                        num1 = ler.nextInt();
                        c1.adicionarPremioIndividual(num, num1, "Melhor jogador em campo", 2021);
                        System.out.println("V - Listar toda a informação do clube" + c1.toString());

                        // Calcular e mostrar a quantidade de vezes que um dado atleta foi inscrito em
                        // equipas, independentemente da modalidade
                        ArrayList<Jogador> listaJogador = c1.getListaJogador();
                        listarJogadoresEquipa(listaJogador);
                        System.out.println("\nDigite o código do atleta na lista:");
                        int num3 = ler.nextInt();
                        System.out.println("Quantidade de inscrições do atleta = "
                                        + c1.calcularTotalPremiosIndividuais(num3));

                        // Calcular e mostrar a quantidade total de prémios individuais dos jogadores
                        // que praticam uma dada modalidade
                        listarModalidades(listaModalidade);
                        System.out.println("\nDigite a posição da modalidade na lista:");
                        int num2 = ler.nextInt();
                        System.out.println("Quantidade de prémios individuais dos jogadores da "
                                        + listaModalidade.get(num2) + " = "
                                        + c1.calcularTotalPremiosIndividuais(num2));

                        // Eliminar um jogador de uma equipa
                        listarEquipas(listaEquipa);
                        System.out.println("\nDigite a posição da equipa na lista: ");
                        num = ler.nextInt();
                        listaJogadoresEquipa = c1.obterJogadoresEquipa(num);
                        listarJogadoresEquipa(listaJogadoresEquipa);
                        System.out.println("\nDigite o número da camisola do jogador: ");
                        num1 = ler.nextInt();
                        c1.eliminarJogadorEquipa(num, num1);
                        listaJogadoresEquipa = c1.obterJogadoresEquipa(num);
                        listarJogadoresEquipa(listaJogadoresEquipa);
                }

        }

        public static void listarModalidades(ArrayList<Modalidade> listaModalidade) {
                System.out.println("\n #### Modalidades ####");
                for (int i = 0; i < listaModalidade.size(); i++) {
                        System.out.println(i + " - " + listaModalidade.get(i).toString());
                }
        }

        public static void listarEquipas(ArrayList<Equipa> listaEquipa) {
                System.out.println("\n #### Equipas ####");
                for (int i = 0; i < listaEquipa.size(); i++) {
                        System.out.println(i + " - " + listaEquipa.get(i).toString());
                }
        }

        public static void listarAtletas(ArrayList<Atleta> listaAtletas) {
                System.out.println("\n #### Atletas ####");
                for (int i = 0; i < listaAtletas.size(); i++) {
                        System.out.println(i + " - " + listaAtletas.get(i).toString());
                }
        }

        public static void listarJogadoresEquipa(ArrayList<Jogador> listaJogador) {
                System.out.println("\n #### Jogadores ####");
                for (int i = 0; i < listaJogador.size(); i++) {
                        System.out.println(i + " - " + listaJogador.get(i).toString());
                }
        }

}
