import javax.swing.JButton;
import javax.swing.JRadioButton;

/**
 * ToucheScientifique
 */
public class ToucheScientifique extends ToucheNormal {
    JButton bpm;
    JButton bX1Y;
    JButton b1X;
    JButton bSqrt;
    JButton bLog;
    JButton bRand;
    JButton bnCr;
    JButton bnAr;
    JButton bFact;
    JButton bSin;
    JButton bCos;
    JButton bTan;
    JButton bPuis;
    JButton bX2;
    JButton b10x;
    JButton bEx;
    JButton bF;
    JButton bE;
    JButton bD;
    JButton bC;
    JButton bB;
    JButton bA;

    
    JRadioButton Bin;
    JRadioButton Dec;
    JRadioButton Oct;
    JRadioButton Hex;

    public ToucheScientifique() {
        /* appel du constructeur de la class Normal */
        super();
        /* instanciation des attributs */
        bpm = new JButton("+/-");
        bX1Y = new JButton("X^(1/Y)");
        b1X = new JButton("1/X");
        bSqrt = new JButton("Rac");
        bLog = new JButton("Ln/Log");
        bRand = new JButton("Rand");
        bnCr = new JButton("nCr");
        bnAr = new JButton("nAr");
        bFact = new JButton("n!");
        bSin = new JButton("Sin");
        bCos = new JButton("Cos");
        bTan = new JButton("Tan");
        bPuis = new JButton("Y^X");
        bX2 = new JButton("X^2");
        b10x = new JButton("10^x");
        bEx = new JButton("e^x");
        bF = new JButton("F");
        bE = new JButton("E");
        bD = new JButton("D");
        bC = new JButton("C");
        bB = new JButton("B");
        bA = new JButton("A");
        
        Bin = new JRadioButton("Bin");
        Dec = new JRadioButton("Dec");
        Oct = new JRadioButton("Oct");
        Hex = new JRadioButton("Hex");
    }

    public void setDimension(){
        
        super.setDimension();
        bX1Y.setPreferredSize(dmin);
        b1X.setPreferredSize(dmin);
        bpm.setPreferredSize(dmin);
        bMult.setPreferredSize(dmin);
        bSqrt.setPreferredSize(dmin);
        bLog.setPreferredSize(dmin);
        bRand.setPreferredSize(dmin);
        bnCr.setPreferredSize(dmin);
        bnAr.setPreferredSize(dmin);
        bFact.setPreferredSize(dmin);
        bCos.setPreferredSize(dmin);
        bPuis.setPreferredSize(dmin);
        bX2.setPreferredSize(dmin);
        b10x.setPreferredSize(dmin);
        bEx.setPreferredSize(dmin);
        bF.setPreferredSize(dmin);
        bE.setPreferredSize(dmin);
        bD.setPreferredSize(dmin);
        bC.setPreferredSize(dmin);
        bB.setPreferredSize(dmin);
        bA.setPreferredSize(dmin);
        b2ndF.setPreferredSize(dmin);
        Bin.setPreferredSize(dmin);
        Dec.setPreferredSize(dmin);
        Oct.setPreferredSize(dmin);
        Hex.setPreferredSize(dmin);
        bSin.setPreferredSize(dmin);
        bTan.setPreferredSize(dmin);
    }
}