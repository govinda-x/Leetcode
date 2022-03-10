class ParkingSystem {

    int [] car = new int[3];
    public ParkingSystem(int big, int medium, int small) {
        car[0] = big;
        car[1] = medium;
        car[2] = small;
    }
    
    public boolean addCar(int carType) {
        if(car[carType - 1]>0){
            car[carType-1]--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */