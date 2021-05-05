import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public abstract class Touche {
    

    JButton bc,bcl,bOff,b2ndF;


    // ButtonGroup bg1;
    // ButtonGroup bg2;

    // JPanel pTxt;
    // JPanel p2;
    // JPanel p3;

    // JTextField txt;

    // double xp = 1, xs = 0, aux = 0;

    // boolean op = false;
    // boolean mult = false;
    // boolean div = false;
    // boolean som = false;
    // boolean soust = false;
    // boolean init = true;

    // boolean dec = true;
    // boolean bin = false;
    // boolean oct = false;
    // boolean hex = false;
    // boolean YX = false;
    // boolean X1Y = false;
    // boolean nAr = false;
    // boolean nCr = false;
    // boolean shift = false;
    // boolean virg = false;

    Dimension dmin = new Dimension(80, 30);
    Dimension dmoyen = new Dimension(165, 30);
    Dimension dmax = new Dimension(440, 35);

    public Touche() {

        b2ndF = new JButton("2nF");
        bc = new JButton("C");
        bOff = new JButton("OFF");
        bcl = new JButton("Del");

        b2ndF.setPreferredSize(dmin);
        bc.setPreferredSize(dmin);
        bOff.setPreferredSize(dmin);
        bcl.setPreferredSize(dmin);
    }

    public abstract void setDimension();

        // Definir la taille préférer des composants
        // b0.setPreferredSize(dmin);
        // b1.setPreferredSize(dmin);
        // b2.setPreferredSize(dmin);
        // b3.setPreferredSize(dmin);
        // b4.setPreferredSize(dmin);
        // b5.setPreferredSize(dmin);
        // b6.setPreferredSize(dmin);
        // b7.setPreferredSize(dmin);
        // b8.setPreferredSize(dmin);
        // b9.setPreferredSize(dmin);
        // b.setPreferredSize(dmin);
        // bexp.setPreferredSize(dmin);
        // bDiv.setPreferredSize(dmin);
        // bSom.setPreferredSize(dmin);
        // bSoust.setPreferredSize(dmin);
        // bRes.setPreferredSize(dmoyen);
        // bX1Y.setPreferredSize(dmin);
        // b1X.setPreferredSize(dmin);
        // bpm.setPreferredSize(dmin);
        // bMult.setPreferredSize(dmin);
        // bSqrt.setPreferredSize(dmin);
        // bLog.setPreferredSize(dmin);
        // bRand.setPreferredSize(dmin);
        // bnCr.setPreferredSize(dmin);
        // bnAr.setPreferredSize(dmin);
        // bFact.setPreferredSize(dmin);
        // bCos.setPreferredSize(dmin);
        // bPuis.setPreferredSize(dmin);
        // bX2.setPreferredSize(dmin);
        // b10x.setPreferredSize(dmin);
        // bEx.setPreferredSize(dmin);
        // bF.setPreferredSize(dmin);
        // bE.setPreferredSize(dmin);
        // bD.setPreferredSize(dmin);
        // bC.setPreferredSize(dmin);
        // bB.setPreferredSize(dmin);
        // bA.setPreferredSize(dmin);
        // b2ndF.setPreferredSize(dmin);
        // Scie.setPreferredSize(dmin);
        // Norm.setPreferredSize(dmin);
        // Bin.setPreferredSize(dmin);
        // Dec.setPreferredSize(dmin);
        // Oct.setPreferredSize(dmin);
        // Hex.setPreferredSize(dmin);
        // bSin.setPreferredSize(dmin);
        // bc.setPreferredSize(dmin);
        // bOff.setPreferredSize(dmin);
        // bcl.setPreferredSize(dmin);
        // bTan.setPreferredSize(dmin);
        // txt.setPreferredSize(dmax);




}
