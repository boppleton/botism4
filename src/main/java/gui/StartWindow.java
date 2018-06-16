package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StartWindow {

    public static MarketOrders marketOrdersWindow;


    public JPanel mainpanel;
    private JButton marketButton;
    private JButton liqsButton;
    private JButton orderBookButton;

    public StartWindow() {


        // MARKET BUTTON
        marketButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openMarketWindow();
            }
        });
    }

    public static void openMarketWindow() {

        marketOrdersWindow = new MarketOrders();

        JFrame frame = new JFrame("botism");
        frame.setContentPane(new MarketOrders().mainPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setMinimumSize(new Dimension(200, 400));
        frame.setResizable(true);
        frame.pack();
        frame.setVisible(true);

    }
}
