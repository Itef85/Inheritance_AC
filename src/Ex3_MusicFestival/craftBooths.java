package Ex3_MusicFestival;

public class craftBooths extends NonMusicEvent{

    public double tax;
    public int rent;

    public int sales;

    public double cashedOwed;

    public craftBooths(String name, String type, String loc ){
        super(name, type, loc);
        super.setLocation(loc);
      this.rent = -2; // arbitrary default integer
        this.tax = 0.125;


    }
    public void Taxation(double t, int s){
        this.tax = t;
        this.sales = s;

        cashedOwed = (sales * 5) * tax;


    }
    public void setRent(int r){
        this.rent = r;
    }


}
