public class TwoWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle vehicleCreator(){
        return new TwoWheelerVechice();
    }
}