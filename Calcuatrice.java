public class Calcuatrice  extends JFrame implements ActionListener,ItemListener{

    ToucheScientifique bScientifique;
    ToucheNormal bNormale;

    ButtonGroup bg1, bg2;

    JPanel pTxt, p2, p3;

    double xp = 1, xs = 0, aux = 0;
    boolean op = false, mult = false, div = false, som = false, soust = false, init = true;
    boolean dec = true, bin = false, oct = false, hex = false, YX = false, X1Y = false;
    boolean nAr = false, nCr = false, shift = false, virg = false;


    Calcuatrice() {

        bScientifique=new ToucheScientifique();
        bScientifique.setDimension();

        bNormale=new  ToucheNormal();
        bNormale.setDimension();

        JPanel pNorm=new JPanel();
        this.addButtonToPanelNormal(pNorm);

        p2=new JPanel(new GridLayout(1,1));p2.add(pNorm);

        JPanel pStd=new JPanel();
        this.addButtonToPanelNormal(pNorm);

        txt.setHorizontalAlignment(SwingConstants.RIGHT);
	    txt.setBackground(Color.black);txt.setForeground(Color.GREEN);
	    txt.setFont(new Font("DIALOG",Font.CENTER_BASELINE+Font.BOLD,12));

        JPanel pSci=new JPanel();
        this.addButtonToPanelScienti(pSci);

        p3 =new JPanel(new GridLayout(1,1)); p3.add(pSci);

        pTxt=new JPanel();pTxt.add(txt);pTxt.add(pStd);

    }


    private void addButtonToPanelNormal(JPanel pNorm){

            pNorm.add(bNormale.b7);pNorm.add(bNormale.b8);pNorm.add(bNormale.b9);pNorm.add(bNormale.bexp);

            pNorm.add(bNormale.bSqrt);pNorm.add(bNormale.bDiv);pNorm.add(bNormale.bSoust);

            pNorm.add(bNormale.b4);pNorm.add(bNormale.b5);pNorm.add(bNormale.b6);pNorm.add(bNormale.bMult);
            
            pNorm.add(bNormale.b1);pNorm.add(bNormale.b2);pNorm.add(bNormale.b3);pNorm.add(bNormale.bSom);
            
            pNorm.add(bNormale.b0);pNorm.add(bNormale.b);pNorm.add(bNormale.bpm);pNorm.add(bNormale.bRes);

    }

    private void addButtonsToPanelStandart(JPanel pStd){

        pStd.add(bNormale.Scie);

        pStd.add(bNormale.Norm);

        pStd.add(bNormale.bcl);

	    pStd.add(bNormale.bc);

        pStd.add(bNormale.bOff);
    }
    private void addButtonToPanelScienti(JPanel pSci){

    pSci.add(bScientifique.Bin);pSci.add(bScientifique.Oct);pSci.add(bScientifique.Hex);pSci.add(bScientifique.Dec);

	pSci.add(bScientifique.bA);pSci.add(bScientifique.bB);pSci.add(bScientifique.bC);pSci.add(bScientifique.bD);

	pSci.add(bScientifique.bPuis);pSci.add(bScientifique.bX2);pSci.add(bScientifique.b10x);pSci.add(bScientifique.bEx);

	pSci.add(bScientifique.bFact);pSci.add(bScientifique.bLog);pSci.add(bScientifique.bSin);pSci.add(bScientifique.bCos);

	pSci.add(bScientifique.bX1Y);pSci.add(bScientifique.b1X);pSci.add(bScientifique.bRand);pSci.add(bScientifique.bnCr);

    pSci.add(bScientifique.b2ndF);pSci.add(pScientifique.bE);pSci.add(bScientifique.bF);pSci.add(bScientifique.bTan);
    
    pSci.add(bScientifique.bnAr);

    }
    private void ecouteButton(){
        
    }




   



}
