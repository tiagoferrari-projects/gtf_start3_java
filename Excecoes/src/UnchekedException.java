import javax.swing.*;

public class UnchekedException {

    public static void main(String[] args) {
        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{
                double resultado = dividir(Double.parseDouble(a), Double.parseDouble(b));
                System.out.printf("Resultado: %.2f%n", resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0.");
            }
            finally {
                System.out.println("Chegou no finally!");
            }
        } while(continueLooping);


        System.out.println("O código continua...");
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}

