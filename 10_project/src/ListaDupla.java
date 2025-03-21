public class ListaDupla<T> {
    private No<T> inicio;
    private No<T> fim;
    private int tamanho;

    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    // método para inserir um nó no final da lista 
    public void inserir(T dado) {
        No<T> aux = new No<>(dado);
        if (estaVazia()) {
            inicio = aux;
            fim = aux;
        } else {
            aux.setAnterior(fim);
            fim.setProximo(aux);
            fim = aux;
        }
        tamanho++;
    }

    // método para imprimir os elementos da lista
    public void imprimir() {
        No<T> aux = inicio;
        while (aux != null) {
            System.out.print(aux.getDado() + " ");
            aux = aux.getProximo();
        }
    }

    // método que recebe um objeto e retornar o seu endereço (caso exista)
    public No<T> pesquisar(T dado) {
        No<T> aux = fim;
        while (aux != null) {
            if (aux.getDado().equals(dado)) {
                return aux;
            }
            aux = aux.getAnterior();
        }
        return null;
    }

    // método para verificar se a lista está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    //  método para remover um nó
    public void remover(T dado) {
        No<T> aux = pesquisar(dado);
        if (aux != null) {
            if (aux.getAnterior() != null) {
                aux.getAnterior().setProximo(aux.getProximo());
            } else {
                inicio = aux.getProximo();
            }
            if (aux.getProximo() != null) {
                aux.getProximo().setAnterior(aux.getAnterior());
            } else {
                fim = aux.getAnterior();
            }
            aux = null;
            tamanho--;
        }
    }

    // método para inserir um objeto em uma posição específica 
}

