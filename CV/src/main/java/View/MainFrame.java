package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
   private JPanel mainPan;
   private JPanel leftPan;
   private JPanel rightPan;
   private JPanel topPan;
   private JPanel bottomPan;
   private JPanel bottomPanUp;
   private JPanel center;
   private JPanel bottomPanDown;
   private JPanel bottomPanDownDown;
   private JLabel convertRONtoOth;
   private JLabel fromLab;
   private JLabel toLab;
   private JLabel suma;
   private JLabel rezultat;
   private JLabel currencyOne;
   private JLabel arrow;
   private JLabel currencyTwo;
   private JTextField sumT;
   private JTextField resT;
   private JComboBox<String> from;
   private JComboBox<String> to;
   private JButton lesButton;

    {
        from = new JComboBox<String>();
        to = new JComboBox<String>();
        convertRONtoOth = new JLabel();
        mainPan = new JPanel(new BorderLayout());
        leftPan = new JPanel(new FlowLayout());
        fromLab = new JLabel("From: ");
        toLab = new JLabel("To: ");
        rightPan = new JPanel(new FlowLayout());
        topPan = new JPanel(new FlowLayout());
        bottomPan = new JPanel(new GridLayout(3,1));
        bottomPanUp = new JPanel(new FlowLayout());
        bottomPanDown = new JPanel(new FlowLayout());
        bottomPanDownDown = new JPanel(new FlowLayout());
        center = new JPanel(new FlowLayout());
        arrow = new JLabel("->");
        center.add(arrow);
        bottomPan.add(bottomPanUp);
        bottomPan.add(bottomPanDown);
        bottomPan.add(bottomPanDownDown);
        convertRONtoOth.setText("Calculate to show to currencies");
        topPan.setBackground(Color.PINK);
        leftPan.setBackground(Color.PINK);
        rightPan.setBackground(Color.PINK);
        bottomPan.setBackground(Color.PINK);
        bottomPanUp.setBackground(Color.PINK);
        bottomPanDown.setBackground(Color.PINK);
        bottomPanDownDown.setBackground(Color.PINK);
        center.setBackground(Color.PINK);

        suma = new JLabel("Sum: ");
        rezultat = new JLabel("Result: ");
        currencyOne = new JLabel("RON");
        currencyTwo = new JLabel("RON");
        lesButton = new JButton("Calculate");

        sumT = new JTextField(10);
        resT = new JTextField(10);

        bottomPanUp.add(suma);
        bottomPanUp.add(sumT);
        bottomPanUp.add(currencyOne);
        bottomPanDownDown.add(lesButton);

        bottomPanDown.add(rezultat);
        bottomPanDown.add(resT);
        bottomPanDown.add(currencyTwo);

        String[] currencies = {"RON", "EUR", "USD", "CAD", "AUD"};
        for (String currency : currencies) {
            from.addItem(currency);
            to.addItem(currency);
        }


        from.setSelectedItem(currencies[0]);
        to.setSelectedItem(currencies[0]);

    }
    public MainFrame(String title) throws HeadlessException {
        super(title);
        frameInit();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        topPan.add(convertRONtoOth);
        mainPan.add(topPan,BorderLayout.PAGE_START);
        mainPan.add(leftPan,BorderLayout.LINE_START);
        leftPan.add(fromLab);
        leftPan.add(from);
        rightPan.add(toLab);
        rightPan.add(to);
        mainPan.add(rightPan,BorderLayout.LINE_END);
        mainPan.add(bottomPan,BorderLayout.PAGE_END);
        mainPan.add(center,BorderLayout.CENTER);

        this.setContentPane(mainPan);
        this.setSize(300, 200);
        this.setVisible(true);

    }

   public int getFromIndex(){

       return from.getSelectedIndex();
   }

   public int getToIndex(){

        return to.getSelectedIndex();
   }

    public String getSuma(){
        return sumT.getText();
    }

    public void setRezultat(Float res){
        resT.setText(res.toString());
    }

    public void addButtonListener(ActionListener e){
        lesButton.addActionListener(e);
    }

    public void setConvertRONtoOth(String convertRONtoOth) {
        this.convertRONtoOth.setText(convertRONtoOth);
    }
}
