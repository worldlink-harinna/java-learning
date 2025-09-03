public class Client{
    private Vehicle vehicle;
    public client(VechicleFactory vehicleFactory){
        vehicle = vehicleFactory.vehicleCreator();
    }

    public Vehicle getVehicle(){
        return vehicle;
    }
}