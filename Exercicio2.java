import javax.swing.JOptionPane;
public class Exercicio2 {
    public static void main(String[]args){
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe sua primeira nota: "));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe sua segunda nota: "));
        float n3 = Float.parseFloat(JOptionPane.showInputDialog("Informe sua terceira nota: "));
        float n4 = Float.parseFloat(JOptionPane.showInputDialog("Informe sua quarta nota: "));
        float media = (n1 + n2 + n3 + n4) / 4;
        JOptionPane.showMessageDialog(null, "Sua media final é: " + media );
    }
}
