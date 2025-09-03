public class FourWheelerFactory implements VechicleFactory{
    @override
    public Vehicle createVehicle(){
        return new FourWheeler();
    }

}