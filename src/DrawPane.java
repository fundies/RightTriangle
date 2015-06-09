import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

/**
 *
 */

/**
 * @author greg
 *
 */
public class DrawPane extends JPanel{

    /**
     *
     */
    private static final long serialVersionUID = -5803056762293718348L;
    private static int gap = 10;

    RightTriangle rt;

    DrawPane(RightTriangle t)
    {
        rt = t;
        setPreferredSize(new Dimension(2 * gap + rt.getBase(), 2 * gap + rt.getHeight()));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(gap, gap + rt.getHeight(), gap + rt.getBase(), gap + rt.getHeight());
        g.drawLine(gap, gap, gap, gap + rt.getHeight());
        g.drawLine(gap, gap, gap + rt.getBase(), gap+ rt.getHeight());
    }

    public void update(){
        setPreferredSize(new Dimension(2 * gap + rt.getBase(), 2 * gap + rt.getHeight()));
        repaint();
    }
}
