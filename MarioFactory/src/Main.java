public class Main {
    public static void main(String[] args) {
        Mario mario = MarioFactory.make();

        String resultHit = mario.hit();
        System.out.println(resultHit);
    }

}