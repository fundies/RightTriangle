import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TextFrame extends JFrame implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = -7976072085757660279L;

    RightTriangle rt;

    private JTextField fHyp;
    private JTextField fBase;
    private JTextField fHeight;

    public TextFrame(RightTriangle t)
    {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rt = t;

        GridLayout gl = new GridLayout(3,2);
        setLayout(gl);

        JLabel lHeight = new JLabel("Height: ");
        lHeight.setHorizontalAlignment(JLabel.RIGHT);
        add(lHeight);

        fHeight = new JTextField();
        fHeight.addActionListener(this);
        add(fHeight);


        JLabel lBase = new JLabel("Base: ");
        lBase.setHorizontalAlignment(JLabel.RIGHT);
        add(lBase);

        fBase = new JTextField();
        fBase.addActionListener(this);
        add(fBase);


        JLabel lHyp = new JLabel("Hypotenuse: ");
        lHyp.setHorizontalAlignment(JLabel.RIGHT);
        add(lHyp);

        fHyp = new JTextField();
        fHyp.setEditable(false);
        add(fHyp);

        pack();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        rt.setBase(Integer.parseInt(fBase.getText()));
        rt.setHeight(Integer.parseInt(fHeight.getText()));
        fHyp.setText(String.valueOf(rt.getHyp()));
    }

}
