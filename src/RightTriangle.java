import java.util.Observable;


public class RightTriangle extends Observable {
    private int height;
    private int base;
    private int hyp;

    public RightTriangle(int b, int h)
    {
        base = b;
        height = h;
        setHyp();
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
        setHyp();
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
        setHyp();
    }

    /**
     * @return the hyp
     */
    public int getHyp() {
        return hyp;
    }

    /**
     * @param hyp the hyp to set
     */
    public void setHyp() {
        hyp = (int) Math.round(Math.sqrt(base * base + height * height));
        setChanged();
        notifyObservers();
    }
}
