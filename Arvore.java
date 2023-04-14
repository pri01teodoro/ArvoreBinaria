public class Arvore {
   
    public int valor; //raiz
	public Arvore esquerda; //referência ao filho esquerdo
	public Arvore direita; //referência ao filho direito

    //construtor
    public Arvore(int valor, Arvore direita, Arvore esquerda) {
        this.valor = valor;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    //atravessar
    public void atravessar(){

        if(esquerda != null){
            esquerda.atravessar();
        }
        System.out.println(this.valor);

        if(direita != null){
            direita.atravessar();
        }

    }

    //adicionar elementos na árvore
    public void adicionar(int NovoValor){
        this.valor = NovoValor;

        while (true) {
            if (esquerda == null) {
                esquerda = new Arvore(NovoValor, null, null);
            } else esquerda.adicionar(NovoValor);
        }

        

        
    }


    public static void main(String[] args) {
        Arvore arvore = new Arvore(10, null, null);
        
        arvore.atravessar();
        


    }
}