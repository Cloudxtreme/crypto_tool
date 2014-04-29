package by.bsuir.graduationproject.common.gui;

import java.awt.GraphicsEnvironment;

/**
 * @author l.zverugo Date: 26.04.14 Time: 17:24.
 */
public final class GUITools {
    private GUITools() {
    }

    /**
     * Gets actual screen width.
     *
     * @return actual screen width.
     */
    public static int getScreenWorkingWidth() {
        return GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
    }

    /**
     * Gets actual screen height.
     *
     * @return actual screen height.
     */
    public static int getScreenWorkingHeight() {
        return GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
    }

    /**
     * Builds relative <code>int</code> value for the given percent value.
     *
     * @param relatesTo relates to value.
     * @param percent percent value.
     * @return relative <code>int</code> value for the given percent value.
     */
    public static int getRelativeValue(int relatesTo, int percent) {
        return relatesTo * percent / 100;
    }
}
