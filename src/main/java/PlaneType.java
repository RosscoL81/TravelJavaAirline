public enum PlaneType {
    BOEING747(10, 50);

    private int capacity;
    private int totalWeight;

    private PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getTotalWeight(){
        return this.totalWeight;
    }

}
