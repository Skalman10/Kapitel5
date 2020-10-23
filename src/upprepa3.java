import javax.swing.*;

public class upprepa3 {
    public static void main(String[] args) {
        double höjd = Double.parseDouble(JOptionPane.showInputDialog("Vilken höjd släpper du bollen från?(m)"));
        double k = 1;
        double ab = 1;
        while (ab>0.01) {
            ab = Math.pow (0.7, k) *höjd;
            k++;
        }
        JOptionPane.showMessageDialog(null, k + " studsar");

    }
}
