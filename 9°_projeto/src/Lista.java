public class Lista {
    No inicio;
    No fim;

    // inserir um elemento no final da lista
    public void insere(String dado) {
        No aux = new No(dado);
        if (inicio == null) {
            fim = inicio = aux;
        } else {
            fim.prox = aux;
        }
    }
}

// método para imprimir a lista
public void imprimir() {
    No aux = inicio;
    while (aux != null) {
        System.out.println(aux.dado);
        aux = aux.prox;
    }
}
