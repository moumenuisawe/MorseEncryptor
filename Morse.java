import javax.swing.JOptionPane;

public class Morse {

    public static void main(String[] args) {
        String code = JOptionPane.showInputDialog("Author: Waleed\nEnter a Sentence to encrypt:");
        String encode = code
                .replace("A", "+-/").replace("a", "+-/")        // all these replaces are connceted, implemented on the string code
                .replace("B", "---+/").replace("b", "---+/")
                .replace("C", "-+-+/").replace("c", "-+-+/")
                .replace("D", "--+/").replace("d", "--+/")
                .replace("E", "-/").replace("e", "-/")
                .replace("F", "-+--/").replace("f", "-+--/")
                .replace("G", "-++/").replace("g", "-++/")
                .replace("H", "----/").replace("h", "----/")
                .replace("I", "--/").replace("i", "--/")
                .replace("J", "+++-/").replace("j", "+++-/")
                .replace("K", "+-+/").replace("k", "+-+/")
                .replace("L", "--+-/").replace("l", "--+-/")
                .replace("M", "++/").replace("m", "++/")
                .replace("N", "-+/").replace("n", "-+/")
                .replace("O", "+++/").replace("o", "+++/")
                .replace("P", "-++-/").replace("p", "-++-/")
                .replace("Q", "+-++/").replace("q", "+-++/")
                .replace("R", "-+-/").replace("r", "-+-/")
                .replace("S", "---/").replace("s", "---/")
                .replace("T", "+/").replace("t", "+/")
                .replace("U", "+--/").replace("u", "+--/")
                .replace("V", "+---/").replace("v", "+---/")
                .replace("W", "++-/").replace("w", "++-/")
                .replace("X", "+--+/").replace("x", "+--+/")
                .replace("Y", "++-+/").replace("y", "++-+/")
                .replace("Z", "--++/").replace("z", "--++/")
                .replace("1", "++++-/")
                .replace("2", "+++--/")
                .replace("3", "++---/")
                .replace("4", "+----/")
                .replace("5", "-----/")
                .replace("6", "----+/")
                .replace("7", "---++/")
                .replace("8", "--+++/")
                .replace("9", "-++++/")
                .replace("0", "+++++/")
                .replace(" ", "///");
        
        System.out.println("\nThe encrypted Sentence is :\n\n"+encode+"\n");
        
    }

}
