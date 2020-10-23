import javax.swing.*;

public class Diagnos2 {
    public static void main(String[] args) {
        while (true) {
        String s = JOptionPane.showInputDialog("Vilken multiplikationstabell vill du undersöka?");

            if ( s == null)
                break;
         int   indata = Integer.parseInt (s);
        int antal = 1;
        int f = 1;
        while (antal<=10) {
            f =  indata*antal;
            System.out.println(antal + "*" + indata + "=" + f + " ");
            antal++;

        }
        antal = 0;
        f = indata;
        for (antal=1; antal<=10; f = indata*antal ) {
            System.out.println(antal + "*" + indata + "=" + f + " ");
            antal++;
        }
        antal = 0;
        do {
            antal ++;
            f = indata*antal;
            System.out.println(antal + "*" + indata + "=" + f + " ");
        } while (antal < 10);
        }

    }
}
