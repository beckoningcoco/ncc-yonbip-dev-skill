/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.ui;

import java.awt.Component;
import java.awt.Container;

public class SwingUtil {
    public static void setContainerEnabled(Component node, boolean value) {
        Container container = null;
        if (node instanceof Container) {
            node.setEnabled(value);
            container = (Container)node;
            Component[] group = container.getComponents();
            for (int i = 0; i < group.length; ++i) {
                Component childNode = group[i];
                SwingUtil.setContainerEnabled(childNode, value);
            }
        } else {
            node.setEnabled(value);
        }
    }
}

