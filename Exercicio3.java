import javax.swing.JOptionPane;
public class Exercicio3 {
    public static void main(String[]args){
        float bruto = Float.parseFloat(JOptionPane.showInputDialog("Informe seu salario bruto: "));
        float noturno = Float.parseFloat(JOptionPane.showInputDialog("Informe seu adcional noturno: "));
        float extras = Float.parseFloat(JOptionPane.showInputDialog("Informe suas horas extras: "));
        float desconto = Float.parseFloat(JOptionPane.showInputDialog("Informe seu desconto mensal: "));
        float liquido = (bruto + noturno - desconto) + 5 * extras;
        JOptionPane.showMessageDialog(null, "Seu salario liquido é: " + liquido);

    }   
}
