/**
 * @author Waleed Mortaja, contact Email : <a href="mailto:waleed.mortaja@gmail.com">waleed.mortaja@gmail.com</a>
 */
import javax.swing.JOptionPane;

public class MorseEn {

    public static void main(String[] args) {
        String code = JOptionPane.showInputDialog("Author: Waleed\nEnter a Sentence to encrypt:");
        String encode = code
                .replace("A", "10/").replace("a", "10/")        // all these replaces are connceted, implemented on the string code
                .replace("B", "0001/").replace("b", "0001/")
                .replace("C", "0101/").replace("c", "0101/")
                .replace("D", "001/").replace("d", "001/")
                .replace("E", "0/").replace("e", "0/")
                .replace("F", "0100/").replace("f", "0100/")
                .replace("G", "011/").replace("g", "011/")
                .replace("H", "0000/").replace("h", "0000/")
                .replace("I", "00/").replace("i", "00/")
                .replace("J", "1110/").replace("j", "1110/")
                .replace("K", "101/").replace("k", "101/")
                .replace("L", "0010/").replace("l", "0010/")
                .replace("M", "11/").replace("m", "11/")
                .replace("N", "01/").replace("n", "01/")
                .replace("O", "111/").replace("o", "111/")
                .replace("P", "0110/").replace("p", "0110/")
                .replace("Q", "1011/").replace("q", "1011/")
                .replace("R", "010/").replace("r", "010/")
                .replace("S", "000/").replace("s", "000/")
                .replace("T", "1/").replace("t", "1/")
                .replace("U", "100/").replace("u", "100/")
                .replace("V", "1000/").replace("v", "1000/")
                .replace("W", "110/").replace("w", "110/")
                .replace("X", "1001/").replace("x", "1001/")
                .replace("Y", "1101/").replace("y", "1101/")
                .replace("Z", "0011/").replace("z", "0011/")
         
                .replace(" ", "///");
        
        System.out.println("\nThe encrypted Sentence is :\n\n"+encode+"\n");
        
    }

}
