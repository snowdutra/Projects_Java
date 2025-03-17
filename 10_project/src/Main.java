public class Main {
    
    public static void main(String[] args) {

        ListaDupla<Produto> lista = new ListaDupla<>();
        lista.inserir(new Produto("batata", 15));

        lista.imprimir();
        
    }
}