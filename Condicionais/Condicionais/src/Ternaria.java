public class Ternaria {
    public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação " : "Reprovado"; // ? e : são if e else de forma mais limpa
        System.out.println(resultado); 
        
    }
}
