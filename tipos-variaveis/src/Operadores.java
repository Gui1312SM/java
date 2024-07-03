public class Operadores {
    public static void main(String[] args) {
        boolean condicao1 = true;
        
        boolean condicao2 = false;

        if(condicao1 && ( 7 > 4 ) ){
            System.out.println("as duas são verdadeiras");
        }
       
        if(condicao1 || condicao2){
            System.out.println("Uma da condicões é verdadeira");
        }
        System.out.println("fim");
       
    }    
}