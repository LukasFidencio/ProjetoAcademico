package mapa.bicicleta;

import model.Contrato;
import model.Bicicleta;
import model.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class MapaBicicleta {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Contrato> contratos = new ArrayList<>();
    static ArrayList<Bicicleta> bicicletas = new ArrayList<>();
    static int selecao = 0;

    public static void main(String[] args) {
        int opMenu = 0;

        System.out.println("Bem vindo ao sistema de cadastros do Sr. José!");

        do {
            try {
                Scanner ler = new Scanner(System.in);

                System.out.println("Digite o número da opção desejada:");

                System.out.println("1 – Cadastrar Bicicleta\n"
                        + "2 - Listar Bicicleta\n"
                        + "3 - Alterar dados de Bicicleta\n"
                        + "4 – Cadastrar Cliente pessoa Física\n"
                        + "5 - Listar Clientes pessoa Física\n"
                        + "6 - Alterar dados de Cliente pessoa Física\n"
                        + "7 - Abrir Contrato\n"
                        + "8 - Listar Contrato\n"
                        + "9 - Encerrar\n\n");

                opMenu = ler.nextInt();

                switch (opMenu) {

                    case 1:
                        addBicicleta(ler);
                        break;

                    case 2:
                        listBicicleta();
                        break;

                    case 3:
                        altBicicleta(ler);
                        break;

                    case 4:
                        addCliente(ler);
                        break;

                    case 5:
                        listCliente();
                        break;

                    case 6:
                        alterarCliente(ler);
                        break;

                    case 7:
                        abrirContrato(ler);
                        break;

                    case 8:
                        listContrato();
                        break;
                }
            } catch (Exception exception) {
                System.out.println("Tem que ser número inteiro de 1 a 9!\n\n");
            }
        } while (opMenu != 9);
    }

    private static void alterarCliente(Scanner ler) {
        int opMenu;
        System.out.println("Digite o número do CLiente a ser alterado:\n");
        listCliente();

        try {
            selecao = ler.nextInt();
            if (selecao <= clientes.size() - 1) {
                System.out.println("Alterando Cliente!");
                System.out.println("\nO que deseja alterar? Digite 1, 2 ou 3, se deseja sair pressione 4!"
                        + "\n 1 - Nome"
                        + "\n 2 - CPF"
                        + "\n 3 - Telefone"
                        + "\n 4 - Sair \n");
                do {
                    opMenu = ler.nextInt();
                    switch (opMenu) {
                        case 1:
                            System.out.println("Digite o novo Nome:\n");
                            clientes.get(selecao).setNome(ler.next());
                            System.out.println("Nome alterado!\n");
                            break;

                        case 2:
                            System.out.println("Digite o novo CPF:\n");
                            clientes.get(selecao).setCPF(ler.next());
                            System.out.println("CPF alterado!\n");
                            break;

                        case 3:
                            System.out.println("Digite o novo Telefone:\n");
                            clientes.get(selecao).setTelefone(ler.next());
                            System.out.println("Telefone alterado!\n");
                            break;

                        case 4:
                            break;
                            
                        default:
                            System.out.println("Deve ser um valor entre 1 e 4!");
                            break;
                    }
                } while (opMenu > 4);
            } else {
                System.out.println("Deve ser numero inteiro de Cliente existente!\n\n");
            }
        } catch (Exception exception) {
            System.out.println("Deve ser numero inteiro de Cliente existente!\n\n");
        }
    }

    private static void addBicicleta(Scanner ler) {
        System.out.println("Adicionando bicicleta!");
        int codBicicleta = bicicletas.size();

        System.out.println("Digite a cor:\n");
        String cor = ler.next();

        System.out.println("Digite o tipo:\n");
        String tipo = ler.next();

        System.out.println("Digite o número de marchas:\n");
        int marchas;
        try {
            marchas = ler.nextInt();
        } catch (Exception exception) {
            System.out.println("Tem q ser um número inteiro!\nFalha ao adicionar Bicicleta!\n\n");
            return;
        }

        System.out.println("Digite o valor do aluguel:");
        double aluguel;
        try {
            aluguel = ler.nextDouble();
        } catch (Exception exception) {
            System.out.println("Tem q ser um número!\nFalha ao adicionar Bicicleta!\n\n");
            return;
        }

        //Instanciando bicicleta e adicionando no vetor arraylist bicicletas.           
        Bicicleta bicicleta = new Bicicleta(codBicicleta, cor, tipo, marchas, aluguel);
        bicicletas.add(bicicleta);
        System.out.println("Bicicleta adicionada com sucesso!");

    }

    private static void listBicicleta() {
        System.out.println("Lista de Bicicletas:\n");
        int i;
        int n = bicicletas.size();
        for (i = 0; i < n; i++) {
            System.out.println("Bicicleta " + i + " - " + bicicletas.get(i).getTipo()
                    + " \n Cor: " + bicicletas.get(i).getCor()
                    + " \n Valor do aluguel: RS" + bicicletas.get(i).getValorAluguel()
                    + " \n Numero de Marchas: " + bicicletas.get(i).getMarchas()
                    + " \n Numero de contratos: " + bicicletas.get(i).getContratos().size() + "\n");
        }
        System.out.printf("\n\n");
    }

    /**
     * Pegar posição da bicicleta Ler o atributo deseja alterar pelo menu Fazer
     * set no atribudo na classe bicicleta
     *
     * @param ler Variável para leitura de dados.
     */
    private static void altBicicleta(Scanner ler) {
        int opMenu;
        try {
            System.out.println("Digite o número de posição da bicicleta a ser alterada:\n");
            listBicicleta();
            selecao = ler.nextInt();
            if (selecao <= bicicletas.size() - 1) {
                System.out.println("Alterando bicicleta!\n");
                System.out.println("Bicicleta " + selecao + " - " + bicicletas.get(selecao).getTipo()
                        + " \n Cor: " + bicicletas.get(selecao).getCor()
                        + " \n Valor do aluguel: RS" + bicicletas.get(selecao).getValorAluguel());

                do {
                    System.out.println("\nO que deseja alterar? Digite 1, 2 ou 3, se deseja sair pressione 4!"
                            + "\n 1 - Tipo"
                            + "\n 2 - Cor"
                            + "\n 3 - Valor do Aluguel"
                            + "\n 4 - Marchas"
                            + "\n 5 - Sair \n");

                    opMenu = ler.nextInt();
                    switch (opMenu) {
                        case 1:
                            System.out.println("Digite o novo tipo:\n");
                            bicicletas.get(selecao).setTipo(ler.next());
                            System.out.println("Tipo alterado!\n");
                            break;

                        case 2:
                            System.out.println("Digite a nova cor:\n");
                            bicicletas.get(selecao).setCor(ler.next());
                            System.out.println("Cor alterada!\n");
                            break;

                        case 3:
                            System.out.println("Digite o novo valor de aluguel:\n");
                            bicicletas.get(selecao).setValorAluguel(ler.nextDouble());
                            System.out.println("Valor alterado!\n");
                            break;

                        case 4:
                            System.out.println("Digite o novo Numero de Marchas:\n");
                            bicicletas.get(selecao).setMarchas(ler.nextInt());
                            System.out.println("Valor alterado!\n");
                            break;

                        default:
                            System.out.println("Tem que ser 1, 2, 3, 4 ou 5!");
                            break;
                    }
                } while (opMenu > 5);
            } else {
                System.out.println("Deve ser numero inteiro de bicicleta existente!\n\n");
            }
        } catch (Exception exception) {
            System.out.println("Deve ser numero inteiro de bicicleta existente!\n\n");
        }
    }

    private static void addCliente(Scanner ler) {
        System.out.println("Adicionando cliente!");

        System.out.println("Digite o nome do Cliente:\n");
        String nome = ler.next();

        System.out.println("Digite o CPF do Cliente:\n");
        String CPF = ler.next();

        System.out.println("Digite o telefone do Cliente:\n");
        String telefone = ler.next();

        int codCliente = clientes.size();

        Cliente cliente = new Cliente(codCliente, nome, CPF, telefone);
        clientes.add(cliente);

        System.out.println("Bicicleta adicionada com sucesso!\n");

    }

    private static void listCliente() {
        System.out.println("Lista de Clientes:\n");
        int i;
        int j = clientes.size();
        for (i = 0; i < j; i++) {
            System.out.printf("Cliente " + i + " : " + clientes.get(i).getNome() + ""
                    + "\n CPF: " + clientes.get(i).getCPF() + ""
                    + "\n Telefone: " + clientes.get(i).getTelefone()
                    + "\n Numero de contratos: " + clientes.get(i).getContratos().size() + "\n\n");
        }
        System.out.printf("\n\n");
    }

    private static void abrirContrato(Scanner ler) {
        boolean denovo = false;
        try {
            ArrayList<Bicicleta> bicicletasContrato = new ArrayList<>();

            System.out.println("Abrindo contrato!\n");

            System.out.println("Selecione um Cliente pelo número:\n");
            listCliente();

            Cliente cliente = clientes.get(ler.nextInt());

            System.out.println("Selecione o Valor do contrato:\n");
            double valor = ler.nextDouble();

            int codContrato = contratos.size();

            do {
                denovo = false;

                System.out.println("Selecione uma Bicicleta pelo número:\n");
                listBicicleta();

                Bicicleta bicicleta = bicicletas.get(ler.nextInt());
                bicicletasContrato.add(bicicleta);

                System.out.println("Deseja adicionar mais uma bicicleta ao contrato? Se sim digite 1\n");
                if (ler.nextInt() == 1) {
                    denovo = true;
                }
            } while (denovo == true);

            Contrato contrato = new Contrato(cliente, codContrato, valor, bicicletasContrato);
            contratos.add(contrato);
        } catch (Exception exception) {
            System.out.println("Opcao errada\n\n");
        }
    }

    private static void listContrato() {
        System.out.println("Lista de contratos:\n\n");
        int i;
        int j = contratos.size();
        for (i = 0; i < j; i++) {
            System.out.println("Contrato - " + contratos.get(i).getCodigoContrato()
                    + "\nNome do Cliente: " + contratos.get(i).getCliente().getNome() + "\n");

            System.out.println("Bicicletas deste COntrato:\n");
            int k;
            int l = contratos.get(i).getBicicletas().size();
            for (k = 0; k < l; k++) {
                System.out.println("Bicicleta " + k + " - " + contratos.get(i).getBicicletas().get(k).getTipo()
                        + "\n Cor: " + contratos.get(i).getBicicletas().get(k).getCor());

            }
            System.out.println("\n\n");
        }
    }
}
