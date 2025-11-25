import javax.swing.*;
import java.awt.*;

import static java.lang.Math.abs;

public class WardUIPanel extends JPanel {
    private int wardID;
    private String wardName;
    private float temp;
    private float idealTemp;
    private boolean heatingStatus;

    public WardUIPanel(Ward ward){
        this.wardID = ward.getWardID();
        this.temp = ward.getTemp();
        this.idealTemp = ward.getIdealTemp();
        this.wardName = ward.getWardName();

        EnvironmentalSystem system = new EnvironmentalSystem();
        this.temp = system.getTempFeed().getTemp(this.wardID);
        this.heatingStatus = system.getHeating().getHeater(this.wardID).isOn();

        this.setLayout(new GridLayout(3,1));
        JLabel results = new JLabel();

        String heatingStatusString;
        if (heatingStatus){
            heatingStatusString = "ON";
        }
        else {
            heatingStatusString = "OFF";
        }
        results.setText("<html>Name: " +wardName+ "<br> Current Temp: " +temp + "<br> Ideal Temp: " +idealTemp + "<br> Heater status:" +heatingStatusString + " </html>");
        results.setHorizontalAlignment(JLabel.CENTER);

        float tempDifference = abs(idealTemp - temp);

        if (tempDifference > 0.5){
            this.setBackground(Color.RED);
        }

        this.add(results);


    }




}
