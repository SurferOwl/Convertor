package Controller;

import Model.ConvertorValutar;
import View.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LesControlleur {

    private ConvertorValutar conv;
    private MainFrame view;
    private static final String[] currencies = {"RON", "EUR", "USD", "CAD", "AUD"};

    public LesControlleur(ConvertorValutar c, MainFrame v) {
        conv = c;
        view = v;
        view.addButtonListener(new ButtonListener());
    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            float s = Float.parseFloat(view.getSuma());
            int from = view.getFromIndex();
            int to = view.getToIndex();
            String curr = conv.getCurrencies(from,to);

            view.setConvertRONtoOth("1 " + currencies[from].toString() + " = " + curr + " " + currencies[to].toString());
            view.setCurrencyOne(currencies[from]);
            view.setCurrencyTwo(currencies[to]);

            try {

                if (s < 0) {
                    throw new NumberFormatException();
                }

                conv.setResult(from, to, s);
                view.setRezultat(conv.getResult());

                System.out.println(conv.getResult());
            } catch (NumberFormatException l) {
                System.out.println("NUUUUUUUU");
            }
        }
    }

}
