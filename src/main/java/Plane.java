public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    public int getPlanesCapacity() {
        return this.planeType.getCapacity();
    }

    public int getPlanesTotalWeight() {
        return this.planeType.getTotalWeight();
    }


}
