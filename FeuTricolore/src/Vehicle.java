class Vehicle implements Observer {
    private final String type;

    public Vehicle(String type) {
        this.type = type;
    }

    @Override
    public void update(String message) {
        System.out.println(type + " received signal: " + message);
    }
}
