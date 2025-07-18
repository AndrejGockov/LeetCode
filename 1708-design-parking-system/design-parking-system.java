class ParkingSystem {
    int big;
    int medium;
    int small;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small; 
    }
    
    public boolean addCar(int carType) {
        boolean canAddCar = true;
        switch(carType){
            case 1:
                if(big > 0)
                    big--;
                else
                    canAddCar = false;
                break;
            case 2:
                if(medium > 0)
                    medium--;
                else
                    canAddCar = false;
                break;
            case 3:
                if(small > 0)
                    small--;
                else
                    canAddCar = false;
                break;
        }

        return canAddCar;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
