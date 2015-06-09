import java.awt.EventQueue;

public class RightTriangleUI {

    private TextFrame textFrame;
    private GraphicsFrame graphicsFrame;

    private RightTriangle rt;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                RightTriangleUI window = new RightTriangleUI();
                window.textFrame.setVisible(true);
                window.graphicsFrame.setVisible(true);
                window.graphicsFrame.setLocation(200, 0);
            }
        });
    }

    /**
     * Create the application.
     */
    public RightTriangleUI() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        rt = new RightTriangle(300,400);
        textFrame = new TextFrame(rt);
        //rt.addObserver(graphicsFrame);

        //textFrame.setBounds(100, 100, 450, 300);

        graphicsFrame = new GraphicsFrame(rt);
        //graphicsFrame.setBounds(100, 100, 450, 300);
    }
}
