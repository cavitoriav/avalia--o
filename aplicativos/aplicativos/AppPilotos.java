package aplicativos;

import java.io.IOException;
import java.util.Scanner;

import classes.Aeronave;
import classes.Pessoa;
import classes.Piloto;

public class AppPilotos {
    public static void main(String[] args) throws InterruptedException, IOException {
        final int MAX_ELEMENTOS = 10;
        int opcao, qtdCadastrados = 0;
        String CPF;
        Pessoa [] pilotos = new Pessoa[MAX_ELEMENTOS];
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Pessoa pss = new Pessoa();
        Piloto plt = new Piloto();
        Aeronave arn = new Aeronave();
    
        do {
            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - Cadastrar piloto");
            System.out.println("2 - Listar pilotos cadastrados");
            System.out.println("3 - Localizar piloto pelo CPF");
            System.out.println("4 - Cadastrar aeronave");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = in.nextInt();
            in.nextLine(); 

            if (opcao == 1) {
                // Se não tem mais espaço no vetor, saio do cadastro
                if (qtdCadastrados == MAX_ELEMENTOS) {
                    System.out.println("\nNão há espaço para cadastrar novos pilotos.");
                    voltarMenu(in);
                    continue;

                }
            
                    System.out.println("Insira o nome do piloto:");
                    pss.setNome(in.next());
                    System.out.println("Insira o cpf do piloto:");
                    pss.setCpf(in.next());
                    System.out.println("Insira o breve do piloto:");
                    pss.setBreve(in.next());
                    pilotos [qtdCadastrados] = pss;
                    qtdCadastrados++;

                System.out.println("\nPiloto cadastrado com sucesso.");
                voltarMenu(in);

            } else if (opcao == 2) {
                // Se não tem ninguém cadastrado no vetor, caio fora
                if (qtdCadastrados == 0) {
                    System.out.println("\nNão há pilotos cadastrados para exibir.");
                    voltarMenu(in);
                    continue;
                }
                else if(opcao == 2){
                    if(pilotos[0] != null){
                    for (Pessoa pessoa : pilotos) {
                            if(pss != null){
                                System.out.println(pss);
                        
                            if(pss != null){
                                System.out.println(pss);
                            }
                        }
                    }
                }
            }
                    
                    else{   
                        System.out.println("A lista não possui cadastro.");
                    }
                    sc.next();
                voltarMenu(in);
            } else if (opcao == 3) {
                Boolean localizado = false;
                System.out.println("Informe o cpf do piloto:");
                CPF = sc.next();
                for (Pessoa Pessoa : pilotos) {
                    if(pss != null && CPF .equals(pss.getCpf())){
                        System.out.println(pss);
                        localizado = true;
                    }
                }
                if(!localizado){
                    System.out.println("Cpf não encontrado.");
                }
                sc.next();


            } else if (opcao == 4) {
                 // Se não tem ninguém cadastrado no vetor, caio fora
                 if (qtdCadastrados == 0) {
                    System.out.println("\nSem pilotos, não há como cadastrar uma aeronave");
                    voltarMenu(in);
                    continue;
                }

                System.out.println("Digite o cpf do piloto que deseja cadastrar na aeronave:");
                CPF = in.next();

                System.out.println("Digite o medelo da aeronave:");
                arn.setModelo(sc.next());
                System.out.println("Digite o número de série da aeronave:");
                arn.setNumeroSerie(sc.next());
                
                voltarMenu(in);

                System.out.println("\nAeronave cadastrada com sucesso.");

                System.out.println("Modelo da aeronave: " + arn.getModelo());
                System.out.println("numero de seria da aeronave: " + arn.getNumeroSerie());



            }
            else if (opcao != 0) {
                System.out.println("\nOpção inválida!");
            }
        } while (opcao != 0);

        System.out.println("Fim do programa!");

        in.close();
    }

    private static void voltarMenu(Scanner in) throws InterruptedException, IOException {
        System.out.println("\nPressione ENTER para voltar ao menu.");
        in.nextLine();

        // Limpa toda a tela, deixando novamente apenas o menu
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");
        
        System.out.flush();
    }
}