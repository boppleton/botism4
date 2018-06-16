import gui.MarketOrders;
import gui.StartWindow;
import org.pushingpixels.substance.api.skin.SubstanceNebulaLookAndFeel;

import javax.swing.*;
import java.awt.*;

public class Botism {

    public static StartWindow startWindow;


    public static void main(String[] args) {

        startGUI();

    }

    private static void startGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new SubstanceNebulaLookAndFeel());
                } catch (Exception e) {
                    System.out.println("Substance Graphite failed to initialize");
                }

        startWindow = new StartWindow();

        JFrame frame = new JFrame("botism");
        frame.setContentPane(new StartWindow().mainpanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setMinimumSize(new Dimension(200, 400));
        frame.setResizable(true);
        frame.pack();
        frame.setVisible(true);

    }
});
    }



}

