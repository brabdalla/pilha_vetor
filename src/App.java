
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Testando Pilha");

        Pilha novaPilha = new Pilha();

        novaPilha.push(10);
        novaPilha.push(5);
        novaPilha.imprimeTopo();
        novaPilha.pop();
        novaPilha.imprimeTopo();


    }
}
