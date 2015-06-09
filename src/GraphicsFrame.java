import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

/**
 *
 */

/**
 * @author greg
 *
 */
public class GraphicsFrame extends JFrame implements Observer {

    /**
     *
     */
    private static final long serialVersionUID = -6563371366287755574L;
    private DrawPane drawPane;

    public GraphicsFrame(RightTriangle rt)
    {
        super();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rt.addObserver(this);
        drawPane = new DrawPane(rt);
        getContentPane().add(drawPane);
        pack();
    }

    @Override
    public void update(Observable o, Object arg) {
        drawPane.update();
        pack();
    }

}
