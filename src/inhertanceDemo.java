import javax.print.event.PrintJobListener;

public class inhertanceDemo {

    public static void main(String[] args) {
        
    }
    
}

class vehicle {
    String Brand;
    String Model;
    int Year;
    String Color;



public vehicle (String brand,  String model, int year, String colour){
    Brand =brand;
    Model= model;
    Year = year;
    Color = colour;

}
 public static void Print(){
 System.out.println("Vehicle Brand:"+ Brand + "Modle : " + Model + );

 }

class car1 extends vehicle {
     publi car1(){
        super();
     }
}

}