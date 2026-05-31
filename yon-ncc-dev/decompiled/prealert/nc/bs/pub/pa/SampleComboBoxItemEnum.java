/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.pub.pa;

import nc.bs.pub.pa.IComboBoxItemEnum;

public class SampleComboBoxItemEnum
implements IComboBoxItemEnum {
    @Override
    public IComboBoxItemEnum.ComboBoxItem[] getItems() {
        return new IComboBoxItemEnum.ComboBoxItem[]{new IComboBoxItemEnum.ComboBoxItem("display1", "value1"), new IComboBoxItemEnum.ComboBoxItem("display2", "value2")};
    }
}

