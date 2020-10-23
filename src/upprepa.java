import com.sun.source.tree.WhileLoopTree;

import javax.swing.*;

public class upprepa {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Vilket tal vill du veta?"));
        int k = 1;
        while (k <= n) {
            int a = k*k;
            k++;
            System.out.print(a + " ");
        }
    }
}
