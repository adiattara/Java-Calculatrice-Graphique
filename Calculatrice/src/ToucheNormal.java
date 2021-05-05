import javax.swing.JButton;

public class ToucheNormal extends Touche {
    /* chiffres */

    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b,bexp,bMult,bDiv,bSom,bSoust, bRes;

    public ToucheNormal() {
        /* appel au constructeur de la class Touche*/
        super();
        /* instanciation des attributs */
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b = new JButton(".");
        bexp = new JButton("Pi");
        bMult = new JButton("*");
        bDiv = new JButton("/");
        bSom = new JButton("+");
        bSoust = new JButton("-");
        bRes = new JButton("=");

    }

    @Override
    public void setDimension() {
        // TODO Auto-generated method stub
        
    }

}
