package Controller;


public class HitController {
    private final Mario mario;

    public HitController(Mario mario) {
        this.mario = mario;
    }

    public void EventHit() {
        System.out.println("Mario donne un coup !");
        mario.hit();
    }
}

/*public abstract class hitctrl implements KeyListener {
        if(k.getKeyCode() == KeyEvent.VK_SPACE) {
        System.out.println(" Mario donne un coup !");
    }

}*/