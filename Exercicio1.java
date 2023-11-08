import javax.swing.JOptionPane;
public class Exercicio1 {
    public static void main(String[]args){
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Informe seu salario: "));
        float abono = Float.parseFloat(JOptionPane.showInputDialog("Informe seu abono: "));
        float Nsalario = salario + abono;
        JOptionPane.showMessageDialog(null, "Seu novo salario sera: "+ Nsalario);
    }
}