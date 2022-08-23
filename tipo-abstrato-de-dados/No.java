/* ESTUDO
 * implementando a classe nó
 * atributo: apontar para o proximo No da lista
 * atributo: armazena o elemento de cada No
 * contrutor: inicializa elemento e proximo
 * gets e setters de elemento e proximo
 */

package TipoAbstratodeDados;

public class No {
    private No proximo;
    private Object elemento;    

    public No(Object elemento, No proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
        // this.setElemento(elemento);
        // this.setProximo(proximo);
    }


    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    public Object getElemento() {
        return elemento;
    }
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }    
}