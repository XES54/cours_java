import Controller.HitController;
import Controller.JumpController;

public class Main {
    public static void main(String[] args) {
        Mario mario = new Mario();

        JumpController jumpController = new JumpController(mario);
        jumpController.EventJump();

        HitController hitController = new HitController(mario);
        hitController.EventHit();
    }
}
