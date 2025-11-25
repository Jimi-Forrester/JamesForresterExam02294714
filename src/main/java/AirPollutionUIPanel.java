import javax.swing.*;
import java.awt.*;

public class AirPollutionUIPanel extends JPanel{
    private float currentPollution;
    private boolean purifierStatus;

    public AirPollutionUIPanel(){
        EnvironmentalSystem system = new EnvironmentalSystem();
        this.currentPollution = system.getPollutionFeed().getPollution();
        this.purifierStatus = system.getAirPurifier().isOn();


        JLabel resultsLabel = new JLabel();
        resultsLabel.setText("<html>Current Pollution: " + currentPollution + "ug/m^3 <br> Air purifier status: " +purifierStatus + "</html>");
        resultsLabel.setHorizontalAlignment(JLabel.CENTER);

        if (currentPollution > 5){
            this.setBackground(Color.RED);
        }

        this.add(resultsLabel);
    }
}
