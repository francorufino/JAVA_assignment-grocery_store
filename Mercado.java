import java.util.*;

public class Mercado {

    private String nome;
    private List<Cliente> listaClientes = new ArrayList<>();
    private Map<Integer, Produto> mapaProdutos = new HashMap<>();
    private Map<String, Cliente> mapaClientesVIP = new HashMap<>();

    public void adicionarVIP_(String cpf, Cliente cliente) {
        mapaClientesVIP.put(cpf, cliente);
    }


    public void adicionarNoMapa(Produto produto) {
        getMapaProdutos().put((getId() + 1), produto);
    }


    public void criarEAddCliente() {
        Cliente novoCliente = new Cliente();
        Scanner sc = new Scanner(System.in);
       // String name = sc.nextLine();
        System.out.println("Digite seu nome :");
        novoCliente.setNome(sc.nextLine());
        System.out.println("Digite seu sobrenome :");
        novoCliente.setSobrenome(sc.nextLine());
        System.out.println("Digite seu cpf :");
        novoCliente.setCpf(sc.nextLine());
        listaClientes.add(novoCliente);
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Produto> buscarPorProduto(String produtoProcurado) {
        List<Produto> listMapa = new ArrayList<>();
        for (Integer id : mapaProdutos.keySet()) {
            if (mapaProdutos.get(id).getTipo().contains(produtoProcurado)) {
                listMapa.add(mapaProdutos.get(id));
            }
        }
        return listMapa;
    }


       public Integer getId(){
            return getMapaProdutos().size();
        }

        public String getNome () {
            return nome;
        }

        public void setNome (String nome){
            this.nome = nome;
        }


        public Map<Integer, Produto> getMapaProdutos () {
            return mapaProdutos;
        }

        public void setMapaProdutos (Map < Integer, Produto > mapaProdutos){
            this.mapaProdutos = mapaProdutos;
        }
    }