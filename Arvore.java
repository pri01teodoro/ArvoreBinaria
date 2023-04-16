
public class Arvore {

    public int valor; // raiz
    public Arvore esquerda; // referência ao filho esquerdo
    public Arvore direita; // referência ao filho direito

    // construtor
    public Arvore(int valor, Arvore direita, Arvore esquerda) {
        this.valor = valor;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    // atravessar
    public void atravessar() {

        if (esquerda != null) {
            esquerda.atravessar(); //recursivamente
        }
        System.out.println(this.valor);

        if (direita != null) {
            direita.atravessar();
        }

    }

    // adicionar elementos na árvore
    public void adicionar(int NovoValor) {
        if(valor > NovoValor) {
			// esquerda
			if(esquerda == null) esquerda = new Arvore(NovoValor, null, null);
			else esquerda.adicionar(NovoValor);
		} else if(valor < NovoValor) {
			// direita
			if(direita == null) direita = new Arvore(NovoValor, null, null);
			else direita.adicionar(NovoValor);
		}

    }

    public void buscar(Arvore arvoreBuscada, int valorBuscado) {
        if (arvoreBuscada == null) {
            System.out.println("A árvore está vazia");
        }

        if (arvoreBuscada != null) { //verificar se a árvore que estou procurando o elemento não é vazia
            if (valorBuscado == arvoreBuscada.valor) { // o valor buscado está na raiz
                System.out.println("Valor encontrado");
            }
            // se o valor buscado for menor que a raiz, percorer a árvore à esquerda até encontrar
            else if (valorBuscado < arvoreBuscada.valor) { 
                buscar(arvoreBuscada.esquerda, valorBuscado);
            }
            // se o valor buscado for maior que a raiz, percorer a árvore à direita até encontrar
            else if (valorBuscado > arvoreBuscada.valor) { 
                buscar(arvoreBuscada.direita, valorBuscado);
            }
        
        } else {
            System.out.println("Valor não encontrado");
        }
    }

    public static void main(String[] args) {
        // Arvore n2 = new Arvore(12, null, null);
        // Arvore n3 = new Arvore(8, null, null);
        // Arvore arvore = new Arvore(10, n2, n3);

        Arvore arvore1 = new Arvore(12, null, null);

        arvore1.adicionar(9);
        arvore1.adicionar(8);
        arvore1.adicionar(11);
        arvore1.adicionar(7);

        arvore1.atravessar();

        arvore1.buscar(arvore1, 12);

    }
}