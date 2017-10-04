
/**
 *
 * @author 16550549
 */
public class Principal {

    public static void main(String[] args) {
    int aiMillion[] = new int [200000000]; //LA MEMORIA DEL  HEAP TIENE UN LIMITE
        for (int i = 0; i < aiMillion.length; i++) {
            aiMillion[i]= (int)(Math.random() * 100) +1; //POR LO CUAL NO SE PUEDE LLENAR EL ARREGLO
            
        }
    
    }
    
}
