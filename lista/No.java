package Lista;

public class No<T> { // tipos genericos do Java: <T>; pode ser qualquer coisa de qualquer tipo
    private T elemento;
    private No<T> proximo;
    
    // contrutor que seta o elemento e o proximo
    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    // cosntrutor que passa os dois atributos
    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    // para visualizar os elementos
    @Override
    public String toString() {
        return "No [elemento=" + elemento + ", proximo=" + proximo + "]";
    }
    

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    public No<T> getProximo() {
        return proximo;
    }
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }    
}
