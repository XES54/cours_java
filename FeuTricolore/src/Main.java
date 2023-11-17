public class Main {
    public static void main(String[] args) {

        Vehicle car = new Vehicle("Car");
        Vehicle bike = new Vehicle("Bike");
        Vehicle ambulance = new Vehicle("Ambulance");
        Pedestrian pedestrian = new Pedestrian();


        TrafficLight trafficLight = new TrafficLight();
        trafficLight.addObserver(car);
        trafficLight.addObserver(bike);
        trafficLight.addObserver(ambulance);
        trafficLight.addObserver(pedestrian);

        trafficLight.changeState("Green");
        trafficLight.changeState("Yellow");
        trafficLight.changeState("Red");
    }
}