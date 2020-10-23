import javax.swing.*;

public class upprepa2 {
    public static void main(String[] args) {
        Double n = Double.parseDouble(JOptionPane.showInputDialog ("vilket tal vill du undersöka?"));
        Double k = 1.0;
        while   (k<=n){
            Double a = 1/k;
            k++;
            System.out.print(a + " ");
        }
    }
}
