import javax.swing.JOptionPane;
public class Exercicio4 {
    public static void main(String[]args){
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor: "));
        float n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o terceiro valor: "));
        float n4 = Float.parseFloat(JOptionPane.showInputDialog("Digite o quarto valor: "));
        float diferenca = (n1 * n2) - (n3 * n4);
        JOptionPane.showMessageDialog(null, "Difereça dos produtos: " + diferenca);
    }
}
