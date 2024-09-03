package This;

class Studentdetails {
    int id;
    String name, address, city;

    Studentdetails(int id, String name, String address) {
    this.id = id;
    this.name = name;
    this.address = address;
    }
    Studentdetails(int id, String name, String address,String city){
        this(id, name, address);
        this.city = city;
    }
    void display(){
        System.out.println(id+" "+name+" "+address+" "+city);
    }
}
public class constuctorChaining {
    public static void main(String[] args) {
        Studentdetails sd = new Studentdetails(1,"Amritesh","UP");
        Studentdetails sd2 = new Studentdetails(1,"Amritesh","UP","azamgarh");
        sd.display();
        sd2.display();
    }
}
