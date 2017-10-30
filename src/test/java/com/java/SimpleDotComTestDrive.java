package test.java.com.java;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        esteTestCompruebaQueCuandoFallaDevuelveMiss();
    }

    private static void esteTestCompruebaQueCuandoFallaDevuelveMiss() {
        // Este test comprueba que cuando falla devuelve miss
        // Los comentarios caducan, mucho mejor poner buenos nombres de metodos

        SimpleDotCom simpleDotCom = new SimpleDotCom();

        String result = simpleDotCom.checkYourSelf ("marujita diaz");

        if ("miss".equals(result)){
            System.out.println("funciona loco");
        } else {
            System.out.println("Algo no anda bien");
        }
    }

    private static class SimpleDotCom {
        public String checkYourSelf(String marujita_diaz) {
            return "miss";
        }
    }
}
