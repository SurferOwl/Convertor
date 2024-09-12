import Controller.LesControlleur;
import Model.ConvertorValutar;
import View.MainFrame;

import javax.swing.*;

public class Main extends JFrame {

    public static void main(String[] args) {

        MainFrame f = new MainFrame("Convertor Valutar");
        ConvertorValutar m = new ConvertorValutar();
        LesControlleur c = new LesControlleur(m,f);
    }

}
