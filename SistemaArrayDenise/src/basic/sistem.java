package basic;

import java.util.ArrayList;
import java.util.Scanner;

import models.Adesivo; // Importa a classe Adesivo do pacote models

public class sistem { // Classe principal do sistema de gerenciamento de adesivos
    static ArrayList<Adesivo> adesivos = new ArrayList<Adesivo>(); // ArrayList para armazenar objetos da classe Adesivo

    // Método para gerar o próximo ID disponível para adesivos
    public static long gerarProximoId() {
        long contador = 0;

        for (Adesivo adesivo : adesivos) {
            if (adesivo.getId() > contador) {
                contador = adesivo.getId();
            }
        }
        return contador + 1; // Retorna o próximo ID único
    }

    public static void main(String[] args) { // Método principal main
        Scanner sc = new Scanner(System.in); // Scanner para entrada de dados
        boolean funcionando = true; // Variável para controlar se o programa deve continuar rodando

        do { // Loop do-while para o menu do programa
            // Exibe o menu de opções
            System.out.println("Sistema de Gerenciamento de Adesivos de Moto");
            System.out.println("1 - Adicionar adesivo");
            System.out.println("2 - Listar adesivos");
            System.out.println("3 - Editar adesivos");
            System.out.println("4 - Deletar adesivo");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt(); // Lê a opção do usuário

            switch (opcao) { // Switch para lidar com a opção escolhida
                case 1: { // Caso 1: Adicionar adesivo
                    Adesivo adesivo = new Adesivo(); // Cria um novo objeto Adesivo
                    System.out.println("Qual o modelo do adesivo ?");
                    adesivo.setModelo(sc.next()); // Define o modelo do adesivo
                    System.out.println("Quais as cores disponíveis?");
                    adesivo.setCor(sc.next()); // Define a cor do adesivo
                    System.out.println("Quantas unidades disponíveis?");
                    adesivo.setQuantidade(sc.nextDouble()); // Define a quantidade do adesivo
                    System.out.println("Qual o valor?");
                    adesivo.setPreco(sc.nextDouble()); // Define o preço do adesivo
                    adesivo.setId(gerarProximoId()); // Define o ID único do adesivo
                    adesivos.add(adesivo); // Adiciona o adesivo ao ArrayList
                    System.out.println("Adesivo adicionado com sucesso!");
                    System.out.println("-------------------------------");
                    break;
                }
                case 2: { // Caso 2: Listar adesivos
                    if (adesivos.isEmpty()) { // Verifica se a lista de adesivos está vazia
                        System.out.println("Nada para listar");
                        System.out.println("");
                    } else {
                        // Itera sobre a lista de adesivos e exibe suas informações
                        for (Adesivo adesivo : adesivos) {
                            System.out.println("Código ID: " + adesivo.getId());
                            System.out.println("Modelo: " + adesivo.getModelo());
                            System.out.println("Cor: " + adesivo.getCor());
                            System.out.println("Quantidades disponíveis: " + adesivo.getQuantidade());
                            System.out.println("Preço: R$ " + adesivo.getPreco());
                            System.out.println("-------------------------------");
                        }
                    }
                    break;
                }
                case 3: { // Caso 3: Editar adesivos
                    System.out.println("Digite o ID para atualizar");
                    int idAtualizar = sc.nextInt(); // Lê o ID do adesivo a ser atualizado

                    Adesivo adesivoAtualizado = new Adesivo(); // Cria um novo objeto Adesivo para atualização
                    System.out.println("Digite o modelo do adesivo");
                    adesivoAtualizado.setModelo(sc.next()); // Define o novo modelo do adesivo
                    System.out.println("Digite a cor do adesivo");
                    adesivoAtualizado.setCor(sc.next()); // Define a nova cor do adesivo
                    System.out.println("Digite a quantidade do adesivo");
                    adesivoAtualizado.setQuantidade(sc.nextDouble()); // Define a nova quantidade do adesivo
                    System.out.println("Digite o preço do adesivo");
                    adesivoAtualizado.setPreco(sc.nextDouble()); // Define o novo preço do adesivo

                    // Itera sobre a lista de adesivos e atualiza o adesivo com o ID correspondente
                    for (Adesivo adesivo : adesivos) {
                        if (adesivo.getId() == idAtualizar) {
                            adesivoAtualizado.setId(adesivo.getId()); // Mantém o mesmo ID
                            adesivos.set(adesivos.indexOf(adesivo), adesivoAtualizado); // Atualiza o adesivo na lista
                        }
                    }
                    break;
                }
                case 4: { // Caso 4: Deletar adesivo
                    System.out.println("Qual o ID para deletar ?");
                    int idDeletar = sc.nextInt(); // Lê o ID do adesivo a ser deletado

                    // Remove o adesivo da lista se o ID corresponder
                    adesivos.removeIf(adesivo -> adesivo.getId() == idDeletar);
                    break;
                }
                case 9: { // Caso 9: Sair do programa
                    System.out.println("Saindo do sistema...");
                    System.out.println("---------------------");
                    funcionando = false; // Define funcionando como false para sair do loop
                    break;
                }
                default: // Caso padrão: Opção inválida
                    System.out.println("Opção inválida! Tente novamente.");
                    System.out.println("");
            }
        } while (funcionando); // Continua o loop enquanto funcionando for true

        sc.close(); // Fecha o Scanner para liberar recursos
    }
}
