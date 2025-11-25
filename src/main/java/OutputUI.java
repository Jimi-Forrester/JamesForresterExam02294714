import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class OutputUI extends JPanel {

    public OutputUI(){

        Ward northWard = new Ward(0);
        northWard.setIdealTemp(23);
        northWard.setWardName("North Ward");

        Ward centralWard = new Ward(1);
        centralWard.setIdealTemp(22);
        centralWard.setWardName("Central Ward");

        Ward southWard = new Ward(2);
        southWard.setIdealTemp(20);
        southWard.setWardName("South Ward");

        ArrayList<Ward> wardList = new ArrayList<>();
        wardList.add(northWard);
        wardList.add(centralWard);
        wardList.add(northWard);

        this.setLayout(new GridLayout(2,3));

        for (Ward ward : wardList){
            WardUIPanel wardPanel = new WardUIPanel(ward);
            System.out.println(ward.getWardName());
            this.add(wardPanel);
        }

        this.add(new HumidityUIPanel());
        this.add(new AirPollutionUIPanel());



//        for (Ward ward : Ward.getWardList()){
//            System.out.println(ward.getWardName());
//        }

//        WardUIPanel testPanel = new WardUIPanel(northWard);
//        HumidityUIPanel testPanel2 = new HumidityUIPanel();
//        AirPollutionUIPanel testPanel3 = new AirPollutionUIPanel();
//        frame.add(testPanel);
//        frame.add(testPanel2);
//        frame.add(testPanel3);

    }

    public JPanel getOutputUI(){
        return this;
    }

}
