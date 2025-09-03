public class Client{
    private Vehicle vehicle;
    public Client(VehicleFactory vehicleFactory){
        vehicle = vehicleFactory.vehicleCreator();
    }

    public Vehicle getVehicle(){
        return vehicle;
    }
}