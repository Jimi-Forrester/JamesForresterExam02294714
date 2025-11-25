import java.util.ArrayList;

public class Ward {
    private float temp;
    private float idealTemp;
    private String wardName;
    private int wardID;

    public Ward(int wardID){
        this.wardID = wardID;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String name){
        this.wardName = name;
    }

    public float getTemp(){
        return temp;
    }

    public void setTemp(float temp){
        this.temp = temp;
    }

    public float getIdealTemp(){
        return idealTemp;
    }

    public void setIdealTemp(float temp){
        this.idealTemp = temp;
    }

    public int getWardID(){
        return wardID;
    }

}
