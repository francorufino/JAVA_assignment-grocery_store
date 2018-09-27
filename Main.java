import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Mercado mercado = new Mercado();
    public static void main(String[] args) {

        // CRIANDO UM MERCADO

        mercado.setNome("Supermercado Dia");

        // CRIANDO PRODUTOS

        Produto arroz1 = new Produto("arroz branco", "Dia", "1 kg", 001, 2.89F);
//        Produto arroz2 = new Produto("arroz branco", "Namorado", "5 kg", 002, 12.99F);
        Produto feijao1 = new Produto("feijão carioca", "Rosalito", "1 kg", 003, 3.15F);
//        Produto feijao2 = new Produto("feijão carioca", "Dia", "1 kg", 004, 2.99F);

        // ADICIONANDO PRODUTOS NO MAPA

        mercado.adicionarNoMapa(arroz1);
//        mercado.adicionarNoMapa(arroz2);
        mercado.adicionarNoMapa(feijao1);
//        mercado.adicionarNoMapa(feijao2);

        // CRIANDO UM CARRINHO

        Carrinho carrinho = new Carrinho();
        //carrinho.adicionarProduto(arroz1);


    /*    Produto acucar1 = new Produto("Açúcar refinado União 5 kg", 12.99F);
//        Produto acucar2 = new Produto("Açúcar cristal orgânico Native 1 kg", 5.49F);
        Produto sal1 = new Produto("Sal refinado Lebre 1 kg", 1.59F);
//        Produto sal2 = new Produto("Sal refinado Dia 1 Kg", 1.35F);
        Produto oleo1 = new Produto("Oleo de milho Liza 900 ml", 5.45F);
//        Produto oleo2 = new Produto("Oleo de girassol Dia 900 ml", 4.79F);
        Produto molhoDeTomate1 = new Produto("Molho de tomate Salsaretti 340 g", 2.65F);
//        Produto molhoDeTomate2 = new Produto("Molho de tomate Dia 340 g", 1.89F);
        Produto macarrao1 = new Produto("Macarrao espaguete Renata 500 g", 2.45F);
//        Produto macarrao2 = new Produto("Macarrao espaguete Barilla 200 g", 3.49F);
        Produto cafe1 = new Produto("Café Pelé 500 g", 8.89F);
//        Produto cafe2 = new Produto("Café Pilão 250 g", 5.99F);
        Produto farinha1 = new Produto("Farinha de trigo Cocamar 1 Kg", 2.29F);
//        Produto farinha2 = new Produto("Farinha de trigo Dona Benta 1 kg", 3.69F);
        Produto leite1 = new Produto("Leite Jussara 1 L", 3.09F);
//        Produto leite2 = new Produto("Leite Paulista 1 L", 3.69F);*/


//adicionando produtos no mapa


  /*      mercado.adicionarNoMapa(acucar1);
//        mercado.adicionarNoMapa(acucar2);
        mercado.adicionarNoMapa(sal1);
//        mercado.adicionarNoMapa(sal2);
        mercado.adicionarNoMapa(oleo1);
//        mercado.adicionarNoMapa(oleo2);
        mercado.adicionarNoMapa(molhoDeTomate1);
//        mercado.adicionarNoMapa(molhoDeTomate2);
        mercado.adicionarNoMapa(macarrao1);
//        mercado.adicionarNoMapa(macarrao2);
        mercado.adicionarNoMapa(cafe1);
//        mercado.adicionarNoMapa(cafe2);
        mercado.adicionarNoMapa(farinha1);
//        mercado.adicionarNoMapa(farinha2);
        mercado.adicionarNoMapa(leite1);
//        mercado.adicionarNoMapa(leite2);*/


       /* System.out.println(carrinho.somarCarrinho(carrinho.getListaProdutos()));


        System.out.println(mercado.getMapaProdutos().get(2).getNome());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Voce deseja nota fiscal paulista? Digite 'Sim' ou 'Nao'");
        String retornoUser = scanner.next();
        if (retornoUser.equalsIgnoreCase("sim")) {
            System.out.println("Digite seu CPF");


        }*/
        // System.out.println("1 - fazer cadastro");

        System.out.println("Bem vindo!");
        mercado.criarEAddCliente();
        System.out.println("Ola " + mercado.getListaClientes().get(0).getNome()+ " " + mercado.getListaClientes().get(0).getSobrenome() + ", seu cadastro foi realizado com sucesso!");
        System.out.println("Escolha a opção desejada :");
        System.out.println("1 - buscar produto");
        System.out.println("2 - adicionar produto");
        System.out.println("3 - finalizar compra");
        System.out.println("4 - sair do sistema");


        Scanner scanner = new Scanner(System.in);

        int opcao = scanner.nextInt();
        while(opcao != 4) {
            switch (opcao) {
                case 1:
                    if(buscaProduto() != true){
                        System.out.println("Produto nao encontrado!");
                    }

//                        if scanner == algo q tem dentro da array devolve o case 2 senao ele vai pro try catch e manda de volta pro case 1

                    break;
                case 2:
                   // carrinho.adicionarProduto(mercado.getMapaProdutos().get(1));
                    carrinho.adicionarProduto(mercado.getMapaProdutos().get(2));
                    /*
                    se a string q ele digitou for igual a algum item do mapa ele adiciona o produto
                no final da array
                        e soma os itens. (q eh o case 3).*/
                    break;

                case 3:
                    carrinho.somarCarrinho(carrinho.getListaProdutos());
                    break;


            }
            System.out.println("Escolha a opção desejada :");
            System.out.println("1 - buscar produto");
            System.out.println("2 - adicionar produto");
            System.out.println("3 - finalizar compra");
            System.out.println("4 - sair do sistema");
            opcao = scanner.nextInt();
        }
        System.out.println("Obrigado volte sempre!");
    }


    public static boolean buscaProduto(){
        System.out.println("Digite o produto desejado: ");
        String nome = new Scanner(System.in).nextLine();

        try {
                for(Produto produto : mercado.buscarPorProduto(nome)) {

                    System.out.println(produto.getMarca());
                    return true;
                }

             } catch (Exception e) {
            System.out.println("Surgiu uma exception");
        }

        return false;
    }
}




