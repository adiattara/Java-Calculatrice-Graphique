import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.*;

public class Touche {
    JButton b0;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton b;
    JButton bexp;
    JButton bc;
    JButton bcl;
    JButton bMult;
    JButton bDiv;
    JButton bSom;
    JButton bSoust;

    JButton bRes;
    JButton bOff;
    JButton bX1Y;
    JButton b1X;
    JButton bpm;
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
    JButton b2ndF;

    JRadioButton Scie;
    JRadioButton Norm;
    JRadioButton Bin;
    JRadioButton Dec;
    JRadioButton Oct;
    JRadioButton Hex;

    ButtonGroup bg1;
    ButtonGroup bg2;

    JPanel pTxt;
    JPanel p2;
    JPanel p3;

    JTextField txt;

    double xp = 1, xs = 0, aux = 0;

    boolean op = false;
    boolean mult = false;
    boolean div = false;
    boolean som = false;
    boolean soust = false;
    boolean init = true;

    boolean dec = true;
    boolean bin = false;
    boolean oct = false;
    boolean hex = false;
    boolean YX = false;
    boolean X1Y = false;
    boolean nAr = false;
    boolean nCr = false;
    boolean shift = false;
    boolean virg = false;


    Dimension dmin;
    Dimension dmoyen;
    Dimension dmax;

    public Touche(){
   
        // Initialisation des bouton et champs de saisie
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
        bX1Y = new JButton("X^(1/Y)");
        bpm = new JButton("+/-");
        bMult = new JButton("*");
        bDiv = new JButton("/");
        bSom = new JButton("+");
        bSoust = new JButton("-");
        bRes = new JButton("=");
        b1X = new JButton("1/X");
        txt = new JTextField("0");
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
        b2ndF = new JButton("2nF");
        bc = new JButton("C");
        bOff = new JButton("OFF");
        bcl = new JButton("Del");
        Scie = new JRadioButton("Sci");
        Norm = new JRadioButton("Std");
        Bin = new JRadioButton("Bin");
        Dec = new JRadioButton("Dec");
        Oct = new JRadioButton("Oct");
        Hex = new JRadioButton("Hex");

        bg1 = new ButtonGroup();
        bg2 = new ButtonGroup();
        bg1.add(Norm);
        bg1.add(Scie);
        bg2.add(Bin);
        bg2.add(Oct);
        bg2.add(Hex);
        bg2.add(Dec);
        Dec.setSelected(true);
        Norm.setSelected(true);
        bA.setEnabled(false);
        bB.setEnabled(false);
        bC.setEnabled(false);
        bD.setEnabled(false);
        bE.setEnabled(false);
        bF.setEnabled(false);

        dmin = new Dimension(80, 30);
        dmoyen = new Dimension(165,30);
        dmax = new Dimension(440,35);
    }

    public void setDimension() {

        // Definir la taille préférer des composants
        b0.setPreferredSize(dmin);
        b1.setPreferredSize(dmin);
        b2.setPreferredSize(dmin);
        b3.setPreferredSize(dmin);
        b4.setPreferredSize(dmin);
        b5.setPreferredSize(dmin);
        b6.setPreferredSize(dmin);
        b7.setPreferredSize(dmin);
        b8.setPreferredSize(dmin);
        b9.setPreferredSize(dmin);
        b.setPreferredSize(dmin);
        bexp.setPreferredSize(dmin);
        bDiv.setPreferredSize(dmin);
        bSom.setPreferredSize(dmin);
        bSoust.setPreferredSize(dmin);
        bRes.setPreferredSize(dmoyen);
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
        Scie.setPreferredSize(dmin);
        Norm.setPreferredSize(dmin);
        Bin.setPreferredSize(dmin);
        Dec.setPreferredSize(dmin);
        Oct.setPreferredSize(dmin);
        Hex.setPreferredSize(dmin);
        bSin.setPreferredSize(dmin);
        bc.setPreferredSize(dmin);
        bOff.setPreferredSize(dmin);
        bcl.setPreferredSize(dmin);
        bTan.setPreferredSize(dmin);
        txt.setPreferredSize(dmax);
    }




}
