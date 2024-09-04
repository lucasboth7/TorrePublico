import java.util.Scanner;
public class Torre {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o n° de discos que tem a torre de hanoi: ");
        int numDiscos = leitor.nextInt();
        
        int movimentosMin = (int) Math.pow(2, numDiscos) - 1;
        System.out.println("Movimentos minimo é de " + movimentosMin + " movimentos para " 
                + numDiscos + " discos");
        
        resolvendoHanoi( numDiscos, 'A', 'B', 'C');
    }
    
    public static void resolvendoHanoi(int n, char torre1, char torre2, char torre3){
        if( n>0){
        resolvendoHanoi(n-1, torre1, torre3, torre2);
        
        System.out.println("Mover o disco " + n+ " de " + torre1
         + " para " + torre3);
        resolvendoHanoi(n-1, torre2, torre1, torre3);
        }
                
    }
}
