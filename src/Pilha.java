public class Pilha {

   private int[] pilhaInt;
   private int topo;
   private static final int DEFAULT_CAPACITY = 10;


   public Pilha(){
    this(DEFAULT_CAPACITY);
   }

   public Pilha(int tamanho){
    pilhaInt = new int[tamanho];
    topo = -1;
   }

   private boolean eVazia(){
    return topo == -1;
   }

   private boolean eCheia(){
    return topo == this.pilhaInt.length;
   }


    public void push(int num){

        if(this.eCheia()){
            System.out.println("A pilha está cheia.");

        }else{
            topo++;
            this.pilhaInt[topo] = num;
        }
    }

    public void pop(){

        if(this.eVazia()){
            System.out.println("A pilha está vazia.");
        }else{
            this.topo--;
        }
    }

    public void imprimeTopo(){
        System.out.println("O valor do topo da pilha é: "+this.pilhaInt[this.topo]);
    }


}
