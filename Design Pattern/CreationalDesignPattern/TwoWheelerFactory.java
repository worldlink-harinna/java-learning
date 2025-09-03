public class TwoWheelerFactory implements VechicleFactory{
    @override
    public Vehicle createVehicle(){
        return new TwoWheelerVechice();
    }
}