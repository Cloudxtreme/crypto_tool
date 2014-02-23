package by.bsuir.graduationproject.gui.button;

import by.bsuir.graduationproject.gui.util.GUIConstants;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

/**
 * @author l.zverugo
 */
public class RoundedButton extends Component {

    private ActionListener actionListener;     // Post action events to listeners
    private String label;                      // The Button's text
    protected boolean pressed = false; // true if the button is detented.

    /**
     * Constructs a RoundedButton with no label.
     */
    public RoundedButton() {
        this("");
    }

    /**
     * Constructs a RoundedButton with the specified label.
     *
     * @param label the label of the button
     */
    public RoundedButton(String label) {
        this.label = label;
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
        invalidate();
        repaint();
    }

    /**
     * paints the RoundedButton
     */
    @Override
    public void paint(Graphics g) {
        try {
            g.drawImage(ImageIO.read(new File(GUIConstants.SUBMIT_BUTTON_IMAGE_PATH)), 0, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * The preferred size of the button.
     */
    @Override
    public Dimension getPreferredSize() {
        Font f = getFont();
        if (f != null) {
        FontMetrics fm = getFontMetrics(getFont());
        int max = Math.max(fm.stringWidth(label) + 40, fm.getHeight() + 40);
        return new Dimension(max, max);
        } else {
        return new Dimension(100, 100);
        }
    }

    /**
     * The minimum size of the button.
     */
    @Override
    public Dimension getMinimumSize() {
        return new Dimension(100, 100);
    }

    /**
     * Adds the specified action listener to receive action events from this
     * button.
     *
     * @param listener the action listener
     */
    public void addActionListener(ActionListener listener) {
        actionListener = AWTEventMulticaster.add(actionListener, listener);
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
    }

    /**
     * Removes the specified action listener so it no longer receives action
     * events from this button.
     *
     * @param listener the action listener
     */
    public void removeActionListener(ActionListener listener) {
        actionListener = AWTEventMulticaster.remove(actionListener, listener);
    }

    /**
     * Determine if click was inside round button.
     */
    @Override
    public boolean contains(int x, int y) {
        int mx = getSize().width / 2;
        int my = getSize().height / 2;
        return (((mx - x) * (mx - x) + (my - y) * (my - y)) <= mx * mx);
    }

    /**
     * Paints the button and distribute an action event to all listeners.
     */
    @Override
    public void processMouseEvent(MouseEvent e) {
        Graphics g;
        switch (e.getID()) {
        case MouseEvent.MOUSE_PRESSED:
        // render myself inverted....
        pressed = true;

        // Repaint might flicker a bit. To avoid this, you can use
        // double buffering (see the Gauge example).
        repaint();
        break;
        case MouseEvent.MOUSE_RELEASED:
        if (actionListener != null) {
        actionListener.actionPerformed(new ActionEvent(
        this, ActionEvent.ACTION_PERFORMED, label));
        }
        // render myself normal again
        if (pressed == true) {
        pressed = false;

        // Repaint might flicker a bit. To avoid this, you can use
        // double buffering (see the Gauge example).
        repaint();
        }
        break;
        case MouseEvent.MOUSE_ENTERED:

        break;
        case MouseEvent.MOUSE_EXITED:
        if (pressed == true) {
        // Cancel! Don't send action event.
        pressed = false;

        // Repaint might flicker a bit. To avoid this, you can use
        // double buffering (see the Gauge example).
        repaint();

        // Note: for a more complete button implementation,
        // you wouldn't want to cancel at this point, but
        // rather detect when the mouse re-entered, and
        // re-highlight the button. There are a few state
        // issues that that you need to handle, which we leave
        // this an an excercise for the reader (I always
        // wanted to say that!)
        }
        break;
        }
        super.processMouseEvent(e);
        }
    }