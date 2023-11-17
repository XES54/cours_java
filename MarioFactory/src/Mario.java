public class Mario implements Icharactere {
    @Override
    public void jump() {
        System.out.println("Mario saute !");
    }

    @Override
    public String hit() {
        System.out.println("Mario donne un coup !");
        return null;
    }
}