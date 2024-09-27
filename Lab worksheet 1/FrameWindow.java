import javax.swing.JFrame;

// defines a new class called sampleWindow.
public class FrameWindow {
    // main method
    public static void main(String[] args){
        //creating frame object
        JFrame frame;
        frame = new JFrame();

        frame.setTitle("My First Frame");
        frame.setSize(300, 200);
        frame.setLocation( 100, 50);
        frame.setVisible(true);
    }
}
