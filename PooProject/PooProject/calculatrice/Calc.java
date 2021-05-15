package calculatrice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calc extends JFrame implements ActionListener, ItemListener {

    Clavier clavier = new Clavier();

    JRadioButton Scie, Norm, Bin, Dec, Oct, Hex;

    ButtonGroup Mode, Bases;
    JPanel pTxt, p2, p3;

    JTextField txt;

    double xp = 1, xs = 0, aux = 0;
    boolean op = false, mult = false, div = false, som = false, soust = false, init = true;
    boolean dec = true, bin = false, oct = false, hex = false, YX = false, X1Y = false;
    boolean nAr = false, nCr = false, shift = false, virg = false;



    /**
     * @brief crée un objet de type Calc
     */

    public Calc() {
        
        super("Calculatrice Made By AMADOU & AMEGAH");
        /* initialisation du champs de saisie */
        this.initTextComponent();
        /**  Initialisation des boutons de convertion de base */
        this.initConvertComponent();
        /** creéations de groupe pour regrouper les radio Button */
        Mode = new ButtonGroup();
        Bases = new ButtonGroup();
        /**  Mode  regroupe le Mode Normale et le Mode scientifique  */

        Mode.add(Norm);
        Mode.add(Scie);


        /**  Bases regroupe les boutons de bases decimales ,binaires hexadécimles et octal  */

        Bases.add(Bin);
        Bases.add(Oct);
        Bases.add(Hex);
        Bases.add(Dec);


        /** activation de la base 10 par défaut */

        Dec.setSelected(true); 

        /**  activation du Mode Normale par défaut  */
        Norm.setSelected(true); // 


        /** désactivation par défaut des Buttons A,B,C,D,E,F */

        clavier.bA.setEnabled(false);
        clavier.bB.setEnabled(false);
        clavier.bC.setEnabled(false);
        clavier.bD.setEnabled(false);
        clavier.bE.setEnabled(false);
        clavier.bF.setEnabled(false);

        // Definir la taille préférer des composants

        this.SetDimension();

        txt.setHorizontalAlignment(SwingConstants.RIGHT);
        txt.setBackground(Color.black);
        txt.setForeground(Color.GREEN);
        txt.setFont(new Font("DIALOG", Font.CENTER_BASELINE + Font.BOLD, 12));


        /** Declaration des Panels */

        p2 = CreatStandarPannel();

        p3 = createScientistPanel();

        JPanel pStd = new JPanel();

        pStd.add(Scie);
        pStd.add(Norm);
        pStd.add(clavier.bcl);
        pStd.add(clavier.bc);
        pStd.add(clavier.bOff);

        pTxt = new JPanel();

        pTxt.add(txt);
        pTxt.add(pStd);

        // Ajout des écouteurs sur tous les bouttons et radio bouton 

        this.listenAllButton();

        // Mise en forme de la fenetre

        this.setSize(new Dimension(452, 531));
        this.getContentPane().setLayout(new GridLayout(2, 1));
        this.getContentPane().add(pTxt);
        this.getContentPane().add(p2);
        this.setLocation(300, 100);
        this.setResizable(true);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    /**
     * @brief  activation des boutons hexadécimales
     * @param 
     */

    public void activateHexadecimalButton(boolean b) {
        clavier.bA.setEnabled(b);
        clavier.bB.setEnabled(b);
        clavier.bC.setEnabled(b);
        clavier.bD.setEnabled(b);
        clavier.bE.setEnabled(b);
        clavier.bF.setEnabled(b);
    }

    /**
     * @brief activation des panels p2 et p3
     * @param v
     */
    public void activateP2P3(boolean v) {
        clavier.b0.setEnabled(v);
        clavier.b1.setEnabled(v);
        clavier.b2.setEnabled(v);
        clavier.b3.setEnabled(v);
        clavier.b4.setEnabled(v);
        clavier.b5.setEnabled(v);
        clavier.b6.setEnabled(v);
        clavier.b7.setEnabled(v);
        clavier.b8.setEnabled(v);
        clavier.b9.setEnabled(v);
        clavier.b.setEnabled(v);
        clavier.bexp.setEnabled(v);
        clavier.bMult.setEnabled(v);
        clavier.bDiv.setEnabled(v);
        clavier.bSom.setEnabled(v);
        clavier.bSoust.setEnabled(v);
        clavier.bRes.setEnabled(v);
        clavier.bX1Y.setEnabled(v);
        clavier.b1X.setEnabled(v);
        clavier.bpm.setEnabled(v);
        clavier.bSqrt.setEnabled(v);
        clavier.bLog.setEnabled(v);
        clavier.bRand.setEnabled(v);
        clavier.bnCr.setEnabled(v);
        clavier.bnAr.setEnabled(v);
        clavier.bFact.setEnabled(v);
        clavier.bSin.setEnabled(v);
        clavier.bCos.setEnabled(v);
        clavier.bTan.setEnabled(v);
        clavier.bPuis.setEnabled(v);
        clavier.bX2.setEnabled(v);
        clavier.b10x.setEnabled(v);
        clavier.bEx.setEnabled(v);
        clavier.b2ndF.setEnabled(v);
        clavier.bA.setEnabled(v);
        clavier.bB.setEnabled(v);
        clavier.bC.setEnabled(v);
        clavier.bD.setEnabled(v);
        clavier.bE.setEnabled(v);
        clavier.bF.setEnabled(v);
    }

    void activateOperationsButton(boolean v) {
        clavier.b.setEnabled(v);
        clavier.bexp.setEnabled(v);
        clavier.bMult.setEnabled(v);
        clavier.bDiv.setEnabled(v);
        clavier.bSom.setEnabled(v);
        clavier.bSoust.setEnabled(v);
        clavier.bRes.setEnabled(v);
        clavier.bX1Y.setEnabled(v);
        clavier.b1X.setEnabled(v);
        clavier.bpm.setEnabled(v);
        clavier.bSqrt.setEnabled(v);
        clavier.bLog.setEnabled(v);
        clavier.bRand.setEnabled(v);
        clavier.bnCr.setEnabled(v);
        clavier.bnAr.setEnabled(v);
        clavier.bFact.setEnabled(v);
        clavier.bSin.setEnabled(v);
        clavier.bCos.setEnabled(v);
        clavier.bTan.setEnabled(v);
        clavier.bPuis.setEnabled(v);
        clavier.bX2.setEnabled(v);
        clavier.b10x.setEnabled(v);
        clavier.bEx.setEnabled(v);
        clavier.b2ndF.setEnabled(v);
    }
    /**
     * @brief une variable boolean et fait une correspondance avec la base 
     * @return int
     */

    int getSourceBase() {
        if (dec)
            return 10;
        else if (bin)
            return 2;
        else if (oct)
            return 8;
        else
            return 16;
    }
    /**
     * @brief prend  un Boutton et si le boutons désigne une base alors on désactive les certaine 
     *        boutons qui ne sont pas nécessaires 
     * @param src
     * @return
     */

    int getDestinationBase(Object src) {
        if (src == Dec) {
            dec = true;
            bin = false;
            oct = false;
            hex = false;
            activateHexadecimalButton(false);
            activateOperationsButton(true);
            clavier.b0.setEnabled(true);
            clavier.b1.setEnabled(true);
            clavier.b2.setEnabled(true);
            clavier.b3.setEnabled(true);
            clavier.b4.setEnabled(true);
            clavier.b5.setEnabled(true);
            clavier.b6.setEnabled(true);
            clavier.b7.setEnabled(true);
            clavier.b8.setEnabled(true);
            clavier.b9.setEnabled(true);
            return 10;
        } else if (src == Bin) {
            dec = false;
            bin = true;
            oct = false;
            hex = false;
            activateHexadecimalButton(false);
            activateOperationsButton(false);
            clavier.b0.setEnabled(true);
            clavier.b1.setEnabled(true);
            clavier.b2.setEnabled(false);
            clavier.b3.setEnabled(false);
            clavier.b4.setEnabled(false);
            clavier.b5.setEnabled(false);
            clavier.b6.setEnabled(false);
            clavier.b7.setEnabled(false);
            clavier.b8.setEnabled(false);
            clavier.b9.setEnabled(false);
            return 2;
        } else if (src == Oct) {
            dec = false;
            bin = false;
            oct = true;
            hex = false;
            activateHexadecimalButton(false);
            activateOperationsButton(false);
            clavier.b0.setEnabled(true);
            clavier.b1.setEnabled(true);
            clavier.b2.setEnabled(true);
            clavier.b3.setEnabled(true);
            clavier.b4.setEnabled(true);
            clavier.b5.setEnabled(true);
            clavier.b6.setEnabled(true);
            clavier.b7.setEnabled(true);
            clavier.b8.setEnabled(false);
            clavier.b9.setEnabled(false);
            return 8;
        } else {
            dec = false;
            bin = false;
            oct = false;
            hex = true;
            activateHexadecimalButton(true);
            activateOperationsButton(false);
            clavier.b0.setEnabled(true);
            clavier.b1.setEnabled(true);
            clavier.b2.setEnabled(true);
            clavier.b3.setEnabled(true);
            clavier.b4.setEnabled(true);
            clavier.b5.setEnabled(true);
            clavier.b6.setEnabled(true);
            clavier.b7.setEnabled(true);
            clavier.b8.setEnabled(true);
            clavier.b9.setEnabled(true);
            return 16;
        }
    }
    

    /**
     * @brief convertis les caractéres A,B,C,D,E,F  respectivement en  10;11;12;13;14;15;
     * @param c
     * @return
     */
    int charToInt(char c) {
       
           switch (c) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return (Character.getNumericValue(c));
        }
    }

    /**
     * @brief prend un entier et l'associe à un charactére
     * @param x
     * @return
     */
    char intToChar(int x) {
        switch (x) {
            case 10:
                return 'A';
            case 11:
                return 'B';
            case 12:
                return 'C';
            case 13:
                return 'D';
            case 14:
                return 'E';
            default:
                return 'F';
        }
    }
    /**
     * @brief prend une chaine de caractère et de verifier si c'est valide 
     * @param s
     * @return
     */
    
    boolean isValide(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.' || s.charAt(i) == '-')
                return false;
        }
        return true;
    }
    /**
     * @brief prend un charactére et le convertie et donne sa valeur selon la base choisie
     * @param dep
     * @param bs
     * @return
     */
    int toDec(String dep, int bs) {

        int i = (dep.length()) - 1;
        String s = dep;
        int puis = 0;
        int res = 0;
        while (i >= 0) {
            res = res + charToInt(s.charAt(i)) * ((int) (Math.pow(bs, puis)));
            puis++;
            i--;
        }
        return res;
    }

    String fromDec(String dep, int bd) {
        String s = "";
        int aux = Integer.parseInt(dep);
        while (aux / bd != 0) {
            if (aux % bd < 10) {
                s = (aux % bd) + s;
            } else {
                s = intToChar(aux % bd) + s;
            }
            aux = aux / bd;
        }
        if (aux % bd < 10) {
            s = (aux % bd) + s;
        } else {
            s = intToChar(aux % bd) + s;
        }
        return s;
    }
    /**
     * @brief : cette fonction se charge de faire les opérations et de l'afficher sur l'écran
     */
    void Resultat() {
        double x2 = Double.parseDouble(txt.getText());
        if (mult) {
            txt.setText("" + (xp * x2));
            xp = Double.parseDouble(txt.getText());
        } else if (div) {
            if (x2 != 0) {
                txt.setText("" + (xp / x2));
                xp = Double.parseDouble(txt.getText());
            } else {
                activateP2P3(false);
                txt.setBackground(Color.LIGHT_GRAY);
                txt.setForeground(Color.RED);
                txt.setText("  ERROR !!  DIVISION   PAR   ZERO   IMPOSSIBLE  ");
            }
        } else if (som) {
            txt.setText("" + (xs + x2));
            xs = Double.parseDouble(txt.getText());
        } else if (soust) {
            txt.setText("" + (xs - x2));
            xs = Double.parseDouble(txt.getText());
        } else if (YX) {
            double res = Math.pow(aux, x2);
            txt.setText("" + res);
        } else if (nAr) {
            if ((aux >= x2) && (aux >= 0) && (x2 >= 0)) {
                double res = (fact(aux) / fact((aux - x2)));
                txt.setText("" + res);
            } else {
                txt.setBackground(Color.LIGHT_GRAY);
                txt.setForeground(Color.RED);
                txt.setText("  ERROR!!  RULE  :  \"  n  doit  etre >= r  et  n >= 0  et  r >= 0  \" ");
                activateP2P3(false);
            }
        } else if (nCr) {
            if ((aux >= x2) && (aux >= 0) && (x2 >= 0)) {
                double res = (fact(aux) / (fact(x2) * fact((aux - x2))));
                txt.setText("" + res);
            } else {
                txt.setBackground(Color.LIGHT_GRAY);
                txt.setForeground(Color.RED);
                txt.setText(" ERROR!!   RULE  :  \"  n  doit  etre  >= r  et  n  >= 0  et  r  >= 0  \" ");
                activateP2P3(false);
            }
        } else if (X1Y) {
            if (x2 != 0) {
                double res = Math.pow(aux, (1 / x2));
                txt.setText("" + res);
            } else {
                txt.setBackground(Color.LIGHT_GRAY);
                txt.setForeground(Color.RED);
                txt.setText(" ERROR!!  DEUXIEME  NOMBRE  DOIT  ETRE  DIFFERENT  DE  0 ");
                activateP2P3(false);
            }
        }
        init = false;
        virg = false;
    }
    /**
     * @brief  calcule le factorielle d'un nombre
     * @param x
     * @return
     */
    double fact(double x) {
        double res = 1;
        if (x >= 0) {
            for (int i = 2; i <= x; i++) {
                res = res * i;
            }
            return res;
        } else
            return 0;
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        JButton baux = (JButton) src;
        //////////// *********Bouton des chiffres********//////////////
        if (src.equals(clavier.b0)) {
            if (!op)
                txt.setText(txt.getText() + baux.getText());
            else{
                txt.setText(baux.getText());
                op = false;
            }
        }

        /*********   Bouton des chiffres   ********/
        if ((src.equals(clavier.b0) || src.equals(clavier.b1) || src.equals(clavier.b2) || src.equals(clavier.b3)
                || src.equals(clavier.b4) || src.equals(clavier.b5) || src.equals(clavier.b6) || src.equals(clavier.b7)
                || src.equals(clavier.b8) || src.equals(clavier.b9) || src.equals(clavier.bA) || src.equals(clavier.bB)
                || src.equals(clavier.bC) || src.equals(clavier.bD) || src.equals(clavier.bE)
                || src.equals(clavier.bF) )){
            if (!op)
                txt.setText(txt.getText() + baux.getText());
            else
            {
                txt.setText(baux.getText());
                op = false;
            }
        }
        
        /*********     Bouton virgule   ********/
        else if (src.equals(clavier.b)) {
            if (!virg) {
                txt.setText(txt.getText() + ".");
                virg = true;
            }
        }


        /*********      Bouton Pi       ********/
        else if (src.equals(clavier.bexp)) {
            txt.setText("" + Math.PI);
            virg = true;
        }


        /*********      Bouton clear    *******/
        else if (src.equals(clavier.bc)) {
            txt.setText("0");
            xp = 1;
            xs = 0;
            init = true;
            aux = 0;
            shift = false;
            op = false;
            X1Y = true;
            mult = false;
            div = false;
            som = false;
            soust = false;
            nAr = false;
            nCr = false;
            activateP2P3(true);
            activateHexadecimalButton(false);
            Dec.setSelected(true);
            virg = false;
            txt.setBackground(Color.black);
            txt.setForeground(Color.GREEN);
        }


        /*********      Bouton de +/-       ********/
        else if (src.equals(clavier.bpm))
            txt.setText("" + Double.parseDouble(txt.getText()) * -1);
        else if (src.equals(clavier.bcl))
            txt.setText(txt.getText().substring(0, txt.getText().length() - 1));

        /*********      Multiplication      ********/
        else if (src.equals(clavier.bMult)) {
            try {
                if (init || op) 
                {
                    xp = (Double.parseDouble(txt.getText()));
                    init = false;
                    virg = false;
                    txt.setText("" + xp);
                } 
                else 
                {
                    Resultat();
                    xp = (Double.parseDouble(txt.getText()));
                }
                op = true;
                mult = true;
                div = false;
                som = false;
                soust = false;
                YX = false;
                nAr = false;
                nCr = false;
                X1Y = true;
            } catch (NumberFormatException execp) {
                txt.setBackground(Color.LIGHT_GRAY);
                txt.setForeground(Color.RED);
                txt.setText("ERROR :  CONVERTION  AVEC  VIRGULE  FLOTTANTE  NON  SUPPORTEE ");
                activateP2P3(false);
            }
        }


        /*******        Division        ******/
        else if (src.equals(clavier.bDiv)) {
            try {
                if (init || op) 
                {
                    xp = (Double.parseDouble(txt.getText()));
                    init = false;
                    virg = false;
                    txt.setText("" + xp);
                } else {
                    Resultat();
                    xp = (Double.parseDouble(txt.getText()));
                }
                op = true;
                mult = false;
                div = true;
                som = false;
                soust = false;
                YX = false;
                nAr = false;
                nCr = false;
                X1Y = true;
            } catch (NumberFormatException execp) {
                txt.setBackground(Color.LIGHT_GRAY);
                txt.setForeground(Color.RED);
                txt.setText("ERROR :  CONVERTION  AVEC  VIRGULE  FLOTTANTE  NON  SUPPORTEE ");
                activateP2P3(false);
            }
        }


        /***********    Somme   **********/
        else if (src.equals(clavier.bSom)) {
            try {
                if (init || op) {
                    xs = (Double.parseDouble(txt.getText()));
                    init = false;
                    virg = false;
                    txt.setText("" + xs);
                } else {
                    Resultat();
                    xs = (Double.parseDouble(txt.getText()));
                }
                op = true;
                mult = false;
                div = false;
                som = true;
                soust = false;
                YX = false;
                nAr = false;
                nCr = false;
                X1Y = true;
            } catch (NumberFormatException execp) {
                txt.setBackground(Color.LIGHT_GRAY);
                txt.setForeground(Color.RED);
                txt.setText("ERROR :  CONVERTION  AVEC  VIRGULE  FLOTTANTE  NON  SUPPORTEE ");
                activateP2P3(false);
            }
        }


        /************       Soustraction        ***********/
        else if (src.equals(clavier.bSoust)) {
            try {
                if (init || op) {
                    xs = (Double.parseDouble(txt.getText()));
                    init = false;
                    virg = false;
                    txt.setText("" + xs);
                } else {
                    Resultat();
                    xs = (Double.parseDouble(txt.getText()));
                }
                op = true;
                mult = false;
                div = false;
                som = false;
                soust = true;
                YX = false;
                nAr = false;
                nCr = false;
                X1Y = true;
            } catch (NumberFormatException execp) {
                txt.setBackground(Color.LIGHT_GRAY);
                txt.setForeground(Color.RED);
                txt.setText("ERROR :  CONVERTION  AVEC  VERGULE  FLOTTANTE  NON  SUPPORTEE ");
                activateP2P3(false);
            }
        }

        /**************     Resultat        *************/
        else if (e.getSource().equals(clavier.bRes)) {
            Resultat();
            init = true;
            virg = false;
        }


        /************       Les Boutons Scientifiques       ********/
        else if (src.equals(clavier.b2ndF)) {
            shift = true;
        } else if (src.equals(clavier.bPuis)) {
            aux = Double.parseDouble(txt.getText());
            YX = true;
            init = false;
            nAr = false;
            nCr = false;
            X1Y = true;
            op = true;
            mult = false;
            div = false;
            som = false;
            soust = false;
        } else if (src.equals(clavier.b10x)) {
            double x = Double.parseDouble(txt.getText());
            double res = Math.pow(10, x);
            txt.setText("" + res);
        } else if (src.equals(clavier.bX2)) {
            double x = Double.parseDouble(txt.getText());
            double res = Math.pow(x, 2);
            txt.setText("" + res);
        } else if (src.equals(clavier.bX1Y)) {
            aux = Double.parseDouble(txt.getText());
            YX = false;
            init = false;
            nAr = false;
            nCr = false;
            X1Y = true;
            op = true;
            mult = false;
            div = false;
            som = false;
            soust = false;
        } 
        else if (src.equals(clavier.b1X)) {
            double x = Double.parseDouble(txt.getText());
            if (x != 0) 
            {
                txt.setText("" + (1 / x));
            } 
            else 
            {
                txt.setBackground(Color.LIGHT_GRAY);
                txt.setForeground(Color.RED);
                txt.setText(" ERROR!!  DIVISION  PAR  ZERO  IMPOSSIBLE ");
                activateP2P3(false);
            }
        } 
        else if (src.equals(clavier.bLog)) {
            double x = Double.parseDouble(txt.getText());
            if (!shift && x > 0) 
            {
                double res = Math.log(x);
                txt.setText("" + res);
            } 
            else if (shift && x > 0) 
            {
                double res = Math.log10(x);
                txt.setText("" + res);
                shift = false;
            } 
            else if (x <= 0) 
            {
                txt.setBackground(Color.LIGHT_GRAY);
                txt.setForeground(Color.RED);
                txt.setText(" ERROR!!  RULE : \"  X  DOIT  ETRE  >  A  ZERO  \" ");
                activateP2P3(false);
            }
        } 
        else if (src.equals(clavier.bEx)) 
        {
            double x = Double.parseDouble(txt.getText());
            double res = Math.exp(x);
            txt.setText("" + res);
        } 
        else if (src.equals(clavier.bFact)) 
        {

            if (isValide(txt.getText())) {
                double res = fact(Double.parseDouble(txt.getText()));
                txt.setText("" + res);
            } 
            else 
            {
                txt.setBackground(Color.LIGHT_GRAY);
                txt.setForeground(Color.RED);
                txt.setText(" ERROR!!  RULE :  \"  N  DOIT  ETRE  UN ENTIER  >  A  ZERO \" ");
                activateP2P3(false);
            }
        } 

        else if (src.equals(clavier.bSin)) {
            if (!shift) 
            {
                double x = Math.toRadians(Double.parseDouble(txt.getText()));
                double res = Math.sin(x);
                txt.setText("" + res);
            } 
            else 
            {
                double x = Double.parseDouble(txt.getText());
                double res = Math.asin(x);
                txt.setText("" + Math.toDegrees(res));
                shift = false;
            }
        } 

        else if (src.equals(clavier.bCos)) 
        {
            if (!shift) 
            {
                double x = Math.toRadians(Double.parseDouble(txt.getText()));
                double res = Math.cos(x);
                txt.setText("" + res);
            } 
            else 
            {
                double x = Double.parseDouble(txt.getText());
                double res = Math.acos(x);
                txt.setText("" + Math.toDegrees(res));
                shift = false;
            }
        } 
        
        else if (src.equals(clavier.bTan)) 
        {
            if (!shift) 
            {
                double x = Math.toRadians(Double.parseDouble(txt.getText()));
                double res = Math.tan(x);
                txt.setText("" + res);
            } else {
                double x = Double.parseDouble(txt.getText());
                double res = Math.atan(x);
                txt.setText("" + Math.toDegrees(res));
                shift = false;
            }
        } 
        
        else if (src.equals(clavier.bSqrt)) 
        {
            double x = Double.parseDouble(txt.getText());
            if (x >= 0) 
            {
                double res = Math.sqrt(x);
                txt.setText("" + res);
            } 
            else 
            {
                txt.setBackground(Color.LIGHT_GRAY);
                txt.setForeground(Color.RED);
                txt.setText(" ERROR!!  RULE  :  \"  X  DOIT  ETRE  >  A  ZERO  \" ");
                activateP2P3(false);
            }
        } 

        else if (src.equals(clavier.bRand)) 
        {
            double x = Double.parseDouble(txt.getText());
            double res = Math.random();
            txt.setText("" + res);
        } 
        
        else if (src.equals(clavier.bnAr)) 
        {
            aux = Double.parseDouble(txt.getText());
            nAr = true;
            YX = false;
            init = false;
            op = true;
            mult = false;
            div = false;
            som = false;
            soust = false;
        } 
        
        else if (src.equals(clavier.bnCr)) 
        {
            aux = Double.parseDouble(txt.getText());
            nCr = true;
            YX = false;
            init = false;
            op = true;
            mult = false;
            div = false;
            som = false;
            soust = false;
        }
        
        /******* bouton Exit ****** */
        else if (src == clavier.bOff)
            System.exit(0);
    }


    /**
     * Appelé lorsqu'un élément a été sélectionné ou désélectionné par l'utilisateur.
     * Le code écrit pour cette méthode exécute les opérations qui doivent se produire
     *  lorsqu'un élément est sélectionné (ou désélectionné).
     */
    public void itemStateChanged(ItemEvent i) {

        Object srci = i.getSource();
        if (srci == Scie) {
            this.resize(452, 564);
            this.getContentPane().setLayout(new GridLayout(3, 1));
            this.getContentPane().add(pTxt);
            this.getContentPane().add(p3);
            this.getContentPane().add(p2);
            this.setLocation(300, 100);

        } else if (srci == Norm) {
            // Calculatrice c=new Calculatrice();
            this.getContentPane().removeAll();
            this.getContentPane().setLayout(new GridLayout(2, 1));
            this.resize(452, 331);
            this.getContentPane().add(pTxt);
            this.getContentPane().add(p2);
            this.setLocation(300, 100);
            // c.show();
            // this.dispose();
        } else if (dec) {
            activateOperationsButton(false);
            String dep = txt.getText();
            try {
                String s = fromDec(dep, getDestinationBase(srci));
                txt.setText(s);
            } catch (NumberFormatException e) {
                txt.setBackground(Color.LIGHT_GRAY);
                txt.setForeground(Color.RED);
                txt.setText("ERROR :  CONVERTION  AVEC  VERGULE  FLOTTANTE  NON  SUPPORTEE  ");
                activateP2P3(false);
            }
        } else if (bin || oct || hex) {
            try {
                int x = toDec(txt.getText(), getSourceBase());
                String s = "" + x;
                txt.setText(fromDec(s, getDestinationBase(srci)));
            } catch (NumberFormatException e) {
                txt.setBackground(Color.LIGHT_GRAY);
                txt.setForeground(Color.RED);
                txt.setText("ERROR :  CONVERTION  AVEC  VERGULE  FLOTTANTE  NON  SUPPORTEE  ");
                activateP2P3(false);
            }
        }
    }

    /**
     * @brief : initialise les JradiButtons
     */
    private void initConvertComponent() {
       
        /* initialisation des bouttons de controles */
        Scie = new JRadioButton("Sci");
        Norm = new JRadioButton("Std");
        Bin = new JRadioButton("Bin");
        Dec = new JRadioButton("Dec");
        Oct = new JRadioButton("Oct");
        Hex = new JRadioButton("Hex");

    }

    /**
     * @brief : initialise le JTexfield 
     */

    private void initTextComponent(){
        /* initialisation du champ text à zero par défaut */
        txt = new JTextField("0");
        txt.setPreferredSize(new Dimension(440, 100));
    }

    /**
     * @brief definie la dimension des JRadioButtons 
     */

    private void SetDimension() {
        
        Scie.setPreferredSize(new Dimension(80, 30));
        Norm.setPreferredSize(new Dimension(80, 30));
        Bin.setPreferredSize(new Dimension(80, 30));
        Dec.setPreferredSize(new Dimension(80, 30));
        Oct.setPreferredSize(new Dimension(80, 30));
        Hex.setPreferredSize(new Dimension(80, 30));

    }

    /**
     * @brief : crée un panel pour notre clavier standart
     * @return
     */
    private JPanel CreatStandarPannel() {

        JPanel pNorm = new JPanel();

        pNorm.add(clavier.b7);
        pNorm.add(clavier.b8);
        pNorm.add(clavier.b9);
        pNorm.add(clavier.bexp);
        pNorm.add(clavier.bSqrt);
        pNorm.add(clavier.b4);
        pNorm.add(clavier.b5);
        pNorm.add(clavier.b6);
        pNorm.add(clavier.bMult);
        pNorm.add(clavier.bDiv);
        pNorm.add(clavier.b1);
        pNorm.add(clavier.b2);
        pNorm.add(clavier.b3);
        pNorm.add(clavier.bSom);
        pNorm.add(clavier.bSoust);
        pNorm.add(clavier.b0);
        pNorm.add(clavier.b);
        pNorm.add(clavier.bpm);
        pNorm.add(clavier.bRes);

        p2 = new JPanel(new GridLayout(1, 1));
        p2.add(pNorm);

        return p2;

    }

    /**
     * @brief : crée un panel pour notre clavier scientifique
     * @return
     */

    private JPanel createScientistPanel() {

        JPanel pSci = new JPanel();

        pSci.add(Bin);
        pSci.add(Oct);
        pSci.add(Hex);
        pSci.add(Dec);
        pSci.add(clavier.b2ndF);
        pSci.add(clavier.bA);
        pSci.add(clavier.bB);
        pSci.add(clavier.bC);
        pSci.add(clavier.bD);
        pSci.add(clavier.bE);
        pSci.add(clavier.bPuis);
        pSci.add(clavier.bX2);
        pSci.add(clavier.b10x);
        pSci.add(clavier.bEx);
        pSci.add(clavier.bF);
        pSci.add(clavier.bFact);
        pSci.add(clavier.bLog);
        pSci.add(clavier.bSin);
        pSci.add(clavier.bCos);
        pSci.add(clavier.bTan);
        pSci.add(clavier.bX1Y);
        pSci.add(clavier.b1X);
        pSci.add(clavier.bRand);
        pSci.add(clavier.bnCr);
        pSci.add(clavier.bnAr);
        p3 = new JPanel(new GridLayout(1, 1));
        p3.add(pSci);

        return p3;
    }


    /**
     * @brief activation de l'écoute sur les bouttons
     */
    public void listenAllButton() {
        
        clavier.b0.addActionListener(this);
        clavier.b1.addActionListener(this);
        clavier.b2.addActionListener(this);
        clavier.b3.addActionListener(this);
        clavier.b4.addActionListener(this);
        clavier.b5.addActionListener(this);
        clavier.b6.addActionListener(this);
        clavier.b7.addActionListener(this);
        clavier.b8.addActionListener(this);
        clavier.b9.addActionListener(this);
        clavier.b.addActionListener(this);
        clavier.bexp.addActionListener(this);
        clavier.b1X.addActionListener(this);
        clavier.bpm.addActionListener(this);
        clavier.bMult.addActionListener(this);
        clavier.bDiv.addActionListener(this);
        clavier.bSom.addActionListener(this);
        clavier.bSoust.addActionListener(this);
        clavier.bRes.addActionListener(this);
        clavier.bX1Y.addActionListener(this);
        clavier.bc.addActionListener(this);
        clavier.bcl.addActionListener(this);
        clavier.bOff.addActionListener(this);
        clavier.bSqrt.addActionListener(this);
        clavier.bLog.addActionListener(this);
        clavier.bRand.addActionListener(this);
        clavier.bnCr.addActionListener(this);
        clavier.bnAr.addActionListener(this);
        clavier.bFact.addActionListener(this);
        clavier.bSin.addActionListener(this);
        clavier.bCos.addActionListener(this);
        clavier.bTan.addActionListener(this);
        clavier.bPuis.addActionListener(this);
        clavier.bX2.addActionListener(this);
        clavier.b10x.addActionListener(this);
        clavier.bEx.addActionListener(this);
        clavier.b2ndF.addActionListener(this);
        clavier.bA.addActionListener(this);
        clavier.bB.addActionListener(this);
        clavier.bC.addActionListener(this);
        clavier.bD.addActionListener(this);
        clavier.bE.addActionListener(this);
        clavier.bF.addActionListener(this);

        Scie.addItemListener(this);
        Norm.addItemListener(this);
        Bin.addItemListener(this);
        Dec.addItemListener(this);
        Oct.addItemListener(this);
        Hex.addItemListener(this);

    }

}
