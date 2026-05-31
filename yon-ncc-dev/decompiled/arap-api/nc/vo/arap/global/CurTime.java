/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.arap.global;

import java.util.Calendar;
import java.util.Date;

public class CurTime {
    public static String getCurrentTimeStampString() {
        return CurTime.getTimeStampString(System.currentTimeMillis());
    }

    public static String getTimeStampString(long l) {
        Date d = new Date();
        Calendar cl = Calendar.getInstance();
        cl.setTime(d);
        int[] ia = new int[5];
        int year = cl.get(1);
        ia[0] = cl.get(2) + 1;
        ia[1] = cl.get(5);
        ia[2] = cl.get(11);
        ia[3] = cl.get(12);
        ia[4] = cl.get(13);
        byte[] ba = new byte[19];
        ba[7] = 45;
        ba[4] = 45;
        ba[10] = 32;
        ba[16] = 58;
        ba[13] = 58;
        ba[0] = (byte)(year / 1000 + 48);
        ba[1] = (byte)(year / 100 % 10 + 48);
        ba[2] = (byte)(year / 10 % 10 + 48);
        ba[3] = (byte)(year % 10 + 48);
        for (int i = 0; i < 5; ++i) {
            ba[i * 3 + 5] = (byte)(ia[i] / 10 + 48);
            ba[i * 3 + 6] = (byte)(ia[i] % 10 + 48);
        }
        return new String(ba);
    }
}

