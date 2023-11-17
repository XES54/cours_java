package Controller;


public class JumpController {
    private final Mario mario;

    public JumpController(Mario mario) {
        this.mario = mario;
    }

    public void EventJump() {
        System.out.println("Mario saute !");
        mario.jump();
    }
}


/*public abstract class jumpctrl implements KeyListener {
        if(k.getKeyCode() == KeyEvent.VK_KP_UP) {
        System.out.println(" Mario saute !");
    }

}*/