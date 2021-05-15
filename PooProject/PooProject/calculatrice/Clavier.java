package calculatrice;

import javax.swing.JButton;

import java.awt.*;

public class Clavier {

    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b, bexp, bc, bcl, bMult, bDiv, bSom, bSoust;
    JButton bRes, bOff, bX1Y, b1X, bpm, bSqrt, bLog, bRand, bnCr, bnAr, bFact, bSin, bCos;
    JButton bTan, bPuis, bX2, b10x, bEx, bF, bE, bD;
    JButton bC, bB, bA, b2ndF;




    public Clavier(){

        this.initButton();
        this.setButtonDimention();

    }

    private  void setButtonDimention(){

        bSin.setPreferredSize(new Dimension(80, 30));
        bc.setPreferredSize(new Dimension(80, 30));
        bOff.setPreferredSize(new Dimension(80, 30));
        bcl.setPreferredSize(new Dimension(80, 30));
        bTan.setPreferredSize(new Dimension(80, 30));
        b0.setPreferredSize(new Dimension(80, 30));
        b1.setPreferredSize(new Dimension(80, 30));
        b2.setPreferredSize(new Dimension(80, 30));
        b3.setPreferredSize(new Dimension(80, 30));
        b4.setPreferredSize(new Dimension(80, 30));
        b5.setPreferredSize(new Dimension(80, 30));
        b6.setPreferredSize(new Dimension(80, 30));
        b7.setPreferredSize(new Dimension(80, 30));
        b8.setPreferredSize(new Dimension(80, 30));
        b9.setPreferredSize(new Dimension(80, 30));
        b.setPreferredSize(new Dimension(80, 30));
        bexp.setPreferredSize(new Dimension(80, 30));
        bDiv.setPreferredSize(new Dimension(80, 30));
        bSom.setPreferredSize(new Dimension(80, 30));
        bSoust.setPreferredSize(new Dimension(80, 30));
        bRes.setPreferredSize(new Dimension(165, 30));
        bX1Y.setPreferredSize(new Dimension(80, 30));
        b1X.setPreferredSize(new Dimension(80, 30));
        bpm.setPreferredSize(new Dimension(80, 30));
        bMult.setPreferredSize(new Dimension(80, 30));
        bSqrt.setPreferredSize(new Dimension(80, 30));
        bLog.setPreferredSize(new Dimension(80, 30));
        bRand.setPreferredSize(new Dimension(80, 30));
        bnCr.setPreferredSize(new Dimension(80, 30));
        bnAr.setPreferredSize(new Dimension(80, 30));
        bFact.setPreferredSize(new Dimension(80, 30));
        bCos.setPreferredSize(new Dimension(80, 30));
        bPuis.setPreferredSize(new Dimension(80, 30));
        bX2.setPreferredSize(new Dimension(80, 30));
        b10x.setPreferredSize(new Dimension(80, 30));
        bEx.setPreferredSize(new Dimension(80, 30));
        bF.setPreferredSize(new Dimension(80, 30));
        bE.setPreferredSize(new Dimension(80, 30));
        bD.setPreferredSize(new Dimension(80, 30));
        bC.setPreferredSize(new Dimension(80, 30));
        bB.setPreferredSize(new Dimension(80, 30));
        bA.setPreferredSize(new Dimension(80, 30));
        b2ndF.setPreferredSize(new Dimension(80, 30));

    }

    private void initButton(){

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
    }

}
