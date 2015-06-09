import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
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

        BoxLayout bl = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
        setLayout(bl);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rt.addObserver(this);
        drawPane = new DrawPane(rt);
        add(drawPane);
        pack();
    }

    @Override
    public void update(Observable o, Object arg) {
        setPreferredSize(drawPane.getPreferredSize());
        pack();
    }

}
