
class Temperature{
private double min;
private double max;

public Temperature (double min,double max ){
    this.min=min;
    this.max=max;
}
public double getMin(){
    return min;
}
public double getMax(){
    return max;
}
public String toString(){
    return "temperature: "+"Min Value is: "+min+",Max Value is: "+max;
}
}
class weather{
    private Temperature[]temp;
    public weather(int days){
        temp=new Temperature[days];

    }
    public void add_Temperature(int day,Temperature temp1){
        try{
            temp[day]=temp1;
            System.out.println("DAta Added");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("The data is invalid or day");
        }
    }
    public void allTemperature(){
        for(int i=0;i<temp.length;i++){
if (temp[i]!=null) 
    System.out.println(temp[i]);
        }
    }
       public void min_Temperature(){
        for(int i=0;i<temp.length;i++){
if (temp[i]!=null) 
    System.out.println(temp[i]);
        }
    }
       public void maxTemperature(){
        for(int i=0;i<temp.length;i++){
if (temp[i]!=null) 
    System.out.println(temp[i]);
        }
    }
    public void getmin_temperature(){
        double min=Double.MAX_VALUE;
        int place=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i].getMin()<min){
                min=temp[i].getMin();
                place=i;
            }
        }
       System.out.println(min+" Present in the index "+place);
    }

    public void getmax_temperature(){
        double max=Double.MIN_VALUE;
        int place=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i].getMax()>max){
                max=temp[i].getMin();
                place=i;
            }
        }
       System.out.println(max+" Present in the index "+place);
    }
    public void getMinAvg(){
        double sum=0.0;
        for(int i=0;i<temp.length;i++){
           sum=sum+temp[i].getMin();
        }
       System.out.println((sum/temp.length)+" is the min_averge");
    }
    public void getMaxAvg(){
        double sum=0.0;
        for(int i=0;i<temp.length;i++){
           sum=sum+temp[i].getMax();
        }
       System.out.println((sum/temp.length)+" is the max_averge");
    }
}
public class sy {
    public static void main(String[] args) {
        weather w1=new weather(7);
        w1.add_Temperature(0,new Temperature(23.3,29.5));
        w1.add_Temperature(1,new Temperature(20.3,27.5));
        w1.add_Temperature(2,new Temperature(21.3,29.5));
        w1.add_Temperature(3,new Temperature(23.3,27.5));
        w1.add_Temperature(4,new Temperature(28.3,26.5));
        w1.add_Temperature(5,new Temperature(20.3,29.9));
        w1.add_Temperature(6,new Temperature(22.0,25.5));
        w1.min_Temperature();
        w1.getmin_temperature();
        w1.getmax_temperature();
        w1.getMinAvg();
        w1.getMaxAvg();
    }
}


