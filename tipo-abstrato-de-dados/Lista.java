package TipoAbstratodeDados;

public class Lista {
    private No inicio;

    public Lista() {
        this.setInicio(null);
    }

    // inserção de um elemento no início da Lista
    public void insereInicio(Object elemento) {
        No novoNo = new No (elemento, null);
        novoNo.setProximo(getInicio());
        this.inicio = novoNo;

    }

    // remoção de um elemento no início da Lista
    public Object removeInicio() {
        No auxiliar = this.inicio;
        this.inicio = auxiliar.getProximo();
        return auxiliar.getElemento();
    }

    // busca por um elemento em determinada posição da Lista
    public Object buscaElemento(long posicao) {
        No auxiliar = this.inicio;
        while ((posicao > 0) && (auxiliar != null)) {
            if (posicao == 1)
            return auxiliar.getElemento();
            posicao--;
            auxiliar = auxiliar.getProximo(); // passa para o próximo Nó da lista
        }
        return null; // a lista não possui elemento na posição indicada
    }

    // listagem de todos os elementos da Lista
    public void imprimeLista() {
        No auxiliar = this.inicio;
        System.out.println("Lista Ligada");
        while (auxiliar != null) {
            System.out.println(auxiliar.getElemento());
            auxiliar = auxiliar.getProximo();
        }
        System.out.println("------------------------------");
    }


    public No getInicio() {
        return inicio;
    }
    public void setInicio(No inicio) {
        this.inicio = inicio;
    }
}