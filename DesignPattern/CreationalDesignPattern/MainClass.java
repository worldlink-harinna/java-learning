
public class MainClass{

    public static void main(String[] args){

        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Client twoWheelerCLient  = new Client(twoWheelerFactory);
        TwoWheeler twoWheeler = twoWheelerCLient.getVehicle();
        twoWheeler.printVehicle();

    }
}