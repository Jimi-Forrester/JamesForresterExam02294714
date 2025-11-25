import javax.swing.*;

import java.awt.*;

import static java.lang.Math.abs;

public class HumidityUIPanel extends JPanel {
    private int insideHumidityPerctange;
    private int outsideHumidityPercentage;
    private boolean humidiferStatus;

    public HumidityUIPanel(){
        EnvironmentalSystem system = new EnvironmentalSystem();
        this.insideHumidityPerctange = system.getHumidityFeed().getInsideHumidity();
        this.outsideHumidityPercentage = system.getHumidityFeed().getOutsideHumidity();
        this.humidiferStatus = system.getDehumudifier().isOn();


        JLabel resultsText = new JLabel();
        int humidityDifference = abs(insideHumidityPerctange-outsideHumidityPercentage);
        resultsText.setText("<Html> Inside Humidity: " +insideHumidityPerctange + "%" + "<br> Outside Humidity: " +outsideHumidityPercentage + "%" + "<br> Difference: " +humidityDifference + "%<br> Humidifer ON?: "+humidiferStatus+"</html>");
        resultsText.setHorizontalAlignment(JLabel.CENTER);

        if ((insideHumidityPerctange - outsideHumidityPercentage) > 10){
            this.setBackground(Color.RED);
        }

        this.add(resultsText);
    }
}
