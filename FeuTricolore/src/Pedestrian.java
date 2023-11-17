class Pedestrian implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Pedestrian received signal: " + message);
    }
}
