public class App {
    public static void main(String[] args) throws Exception {
        int num1 = Integer.parseInt(System.console().readLine("Introduzca un número entero: "));
        int num2 = Integer.parseInt(System.console().readLine("Introduzca un número entero distinto al anterior: "));

        for (int i = Math.min(num1,num2); i <= Math.max(num1,num2); i++) {
            System.out.print(i + " ");
            i = i + 6;
        }
    }
}
