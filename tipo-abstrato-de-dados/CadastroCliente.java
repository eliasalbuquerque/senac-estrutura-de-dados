package TipoAbstratodeDados;

public class CadastroCliente {
    
    public static void main(String[] args) {
        // estancia classes Lista e Cliente
        Lista listaClientes = new Lista();
        Cliente c = new Cliente(001, "Produtos LTDA", "Rua sem nome, 200", 5000.0);

        // inserindo elementos na Lista Ligada
        listaClientes.insereInicio(c);
        listaClientes.insereInicio(new Cliente(002, "Negócios SA", "Avenida Principal, 10", 12000.0));
        listaClientes.insereInicio(new Cliente(003,"Parceiros LTDA", "Rua dos negócios, 2000", 7000.0));

        // ver a lista ligada
        listaClientes.imprimeLista();

        //remove elementos na Lista Ligada
        listaClientes.removeInicio();
        listaClientes.imprimeLista();


    }    
}
