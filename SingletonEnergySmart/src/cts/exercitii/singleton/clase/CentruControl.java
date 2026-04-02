package cts.exercitii.singleton.clase;

public class CentruControl {
    private static CentruControl instance;
    private double consumTotal=0;
    private boolean alertaAvarie;


    private CentruControl() {
        this.consumTotal=0;
        this.alertaAvarie=false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CentruControl{");
        sb.append("consumTotal=").append(consumTotal);
        sb.append(", alertaAvarie=").append(alertaAvarie);
        sb.append('}');
        return sb.toString();
    }

    public void setConsumTotal(double consumTotal) {
        this.consumTotal = consumTotal;
    }

    public static synchronized CentruControl getInstance(){
        if(instance==null)
            instance=new CentruControl();
        return instance;
    }


}
