public class ContadorDeLetras {

    public static void main(String[] args) {
        System.out.println(new ContadorDeLetras().contadorDeLetrasAs("BananAs"));
    }

    public int contadorDeLetrasAs(String s) {
        int contagem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                contagem++;
            }
        }
        return contagem;
    }

}
