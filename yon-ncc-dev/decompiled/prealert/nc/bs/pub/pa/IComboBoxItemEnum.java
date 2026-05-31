/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.pub.pa;

public interface IComboBoxItemEnum {
    public ComboBoxItem[] getItems();

    public static class ComboBoxItem {
        private String displayName;
        private String value;

        public ComboBoxItem(String displayName, String value) {
            this.displayName = displayName;
            this.value = value;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}

