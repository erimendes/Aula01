public class Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Teste: ");
        
        int var01 = 2;
        double var02 = 3.5;
        String var03 = "4.5";
        
        System.out.println("Inteiro: " + var01);
        System.out.println("Double: " + var02);
        System.out.println("String: " + var03);
        
        int var04 = var01 + (int)var02;
        double var05 = var01 + var02 + Double.parseDouble(var03);
        double var06 = Double.parseDouble(var03);
        int var07 = (int)var06;
        
        System.out.println("var04: " + var04);
        System.out.println("var05: " + var05);
        System.out.println("var07: " + var07);
    }
    
}