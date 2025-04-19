package controlFlow;

public class BreakContinue {

    public static void main(String[] args) {
        
        for (int i = 1;i <= 20; i++){
            if (i==13 || i==17) {
                continue;              
            }
            if (i ==19) {
                break;
            }
            System.out.println("Número: " + i);
        }       
    }
}