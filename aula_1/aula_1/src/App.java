public class App {
    public static void main(String[] args) {
        // //* MultiplicaAi
        var num = 3;

        System.out.println("Tabela de multiplicação de " + num);
        for (int i = 1; i < num; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }

        //* Piramide de Numeros
        var numQty = 5;

        for(int i = 1; i <= numQty; i++) {
            var numString = "";

            for(int j = 1; j <= i; j++) {
                numString += j;
            }

            System.out.println(numString);
        }
    }
}
