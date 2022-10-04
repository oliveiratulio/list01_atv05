import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        int metro;
        int centimetro;
    
        System.out.print("Informe o metro: ");
        metro = ler.nextInt();
    
        centimetro = metro * 100;
        ler.close();
        
        System.out.print("O centimetro do metro informado tem: " +centimetro);
    
    }
}
