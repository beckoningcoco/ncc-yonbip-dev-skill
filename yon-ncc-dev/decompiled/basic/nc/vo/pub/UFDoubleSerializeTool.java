/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import nc.vo.pub.lang.UFDouble;

public class UFDoubleSerializeTool {
    private static int BYTE = 2;
    private static int SHORT = 4;
    private static int INT = 9;
    private static int LONG = 18;

    public void writeUFDouble(ObjectOutputStream out, UFDouble value) throws IOException {
        String[] numberString = this.getNumberString(value.toString());
        int intLength = this.getNumberLength(numberString[0]);
        int decimalLength = this.getNumberLength(numberString[1]);
        this.check(intLength, decimalLength, value.toString());
        this.writeIntFlag(out, intLength, numberString[0]);
        out.writeByte((byte)decimalLength);
        this.writeNumber(out, numberString[0], intLength);
        this.writeNumber(out, numberString[1], decimalLength);
    }

    private void writeIntFlag(ObjectOutputStream out, int length, String intString) throws IOException {
        int value;
        byte flag = (byte)length;
        boolean isZeroNegative = false;
        if (length == 1 && (value = Integer.valueOf(intString).intValue()) == 0) {
            boolean bl = isZeroNegative = intString.indexOf("-") >= 0;
        }
        if (isZeroNegative) {
            flag = (byte)(flag | 0x40);
        }
        out.writeByte(flag);
    }

    private void writeNumber(ObjectOutputStream out, String value, int length) throws IOException {
        int[] splitArea = this.splitNumberAera(length);
        int size = splitArea.length;
        boolean flag = false;
        int startIndex = 0;
        int endIndex = 0;
        boolean isNegative = value.indexOf("-") >= 0;
        for (int i = 0; i < size; ++i) {
            flag = i == size - 1;
            endIndex += splitArea[i];
            String str = null;
            if (i == 0) {
                if (isNegative) {
                    ++endIndex;
                }
                if (endIndex > value.length()) {
                    endIndex = value.length();
                }
                str = value.substring(startIndex, endIndex);
            } else {
                str = flag ? value.substring(startIndex) : value.substring(startIndex, endIndex);
            }
            startIndex = endIndex;
            this.writeSplitNumber(out, str, splitArea[i]);
        }
    }

    private int[] splitNumberAera(int length) {
        int[] splitArea = null;
        switch (length) {
            case 23: 
            case 24: {
                splitArea = new int[]{LONG, SHORT, BYTE};
                break;
            }
            case 21: 
            case 22: {
                splitArea = new int[]{LONG, SHORT};
                break;
            }
            case 19: 
            case 20: {
                splitArea = new int[]{LONG, BYTE};
                break;
            }
            case 16: 
            case 17: 
            case 18: {
                splitArea = new int[]{LONG};
                break;
            }
            case 14: 
            case 15: {
                splitArea = new int[]{INT, SHORT, BYTE};
                break;
            }
            case 12: 
            case 13: {
                splitArea = new int[]{INT, SHORT};
                break;
            }
            case 10: 
            case 11: {
                splitArea = new int[]{INT, BYTE};
                break;
            }
            case 7: 
            case 8: 
            case 9: {
                splitArea = new int[]{INT};
                break;
            }
            case 5: 
            case 6: {
                splitArea = new int[]{SHORT, BYTE};
                break;
            }
            case 3: 
            case 4: {
                splitArea = new int[]{SHORT};
                break;
            }
            case 1: 
            case 2: {
                splitArea = new int[]{BYTE};
                break;
            }
            case 0: {
                splitArea = new int[]{};
            }
        }
        return splitArea;
    }

    private void writeSplitNumber(ObjectOutputStream out, String value, int type) throws IOException {
        long number = Long.parseLong(value);
        if (type == BYTE) {
            out.writeByte((byte)number);
        } else if (type == SHORT) {
            out.writeShort((short)number);
        } else if (type == INT) {
            out.writeInt((int)number);
        } else if (type == LONG) {
            out.writeLong(number);
        }
    }

    private String[] getNumberString(String value) {
        int index = value.indexOf(".");
        String intStr = null;
        String decimalStr = null;
        if (index == -1) {
            intStr = value;
            decimalStr = "";
        } else {
            intStr = value.substring(0, index);
            decimalStr = value.substring(index + 1);
        }
        return new String[]{intStr, decimalStr};
    }

    private void check(int intLength, int decimalLength, String value) {
        if (intLength > 24) {
            String message = "UFDouble integer digits cant not be more than 24 :" + value;
            throw new RuntimeException(message);
        }
    }

    private int getNumberLength(String value) {
        if (value == null) {
            return 0;
        }
        int length = 0;
        boolean flag = value.indexOf("-") >= 0;
        length = flag ? value.length() - 1 : value.length();
        return length;
    }

    public UFDouble readUFDouble(ObjectInputStream in) throws IOException, ClassNotFoundException {
        byte flag = in.readByte();
        int intLength = flag & 0x3F;
        boolean isZeroNegative = (flag & 0x40) == 64;
        byte decimalLength = in.readByte();
        StringBuffer buffer = new StringBuffer();
        if (isZeroNegative) {
            buffer.append("-");
        }
        this.readNumber(in, buffer, intLength);
        if (decimalLength > 0) {
            buffer.append(".");
            this.readNumber(in, buffer, decimalLength);
        }
        return new UFDouble(buffer.toString());
    }

    private void readNumber(ObjectInputStream in, StringBuffer buffer, int length) throws IOException, ClassNotFoundException {
        if (length == 0) {
            return;
        }
        int[] splitArea = this.splitNumberAera(length);
        int size = splitArea.length;
        boolean flag = false;
        int count = 0;
        int currentLength = 0;
        for (int i = 0; i < size; ++i) {
            flag = i == size - 1;
            long value = this.readSplitNumber(in, splitArea[i]);
            currentLength = flag ? length - count : splitArea[i];
            count += splitArea[i];
            buffer.append(this.build(value, currentLength));
        }
    }

    private long readSplitNumber(ObjectInputStream in, int type) throws IOException, ClassNotFoundException {
        long number = 0L;
        if (type == BYTE) {
            number = in.readByte();
        } else if (type == SHORT) {
            number = in.readShort();
        } else if (type == INT) {
            number = in.readInt();
        } else if (type == LONG) {
            number = in.readLong();
        }
        return number;
    }

    private String build(long value, int length) {
        StringBuffer buffer = new StringBuffer();
        String str = String.valueOf(value);
        int size = length - str.length();
        for (int i = 0; i < size; ++i) {
            buffer.append("0");
        }
        buffer.append(str);
        return buffer.toString();
    }
}

