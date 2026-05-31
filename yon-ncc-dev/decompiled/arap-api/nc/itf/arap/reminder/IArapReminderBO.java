/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.reminder;

import java.util.List;
import nc.vo.arap.reminder.AggReminderVO;
import nc.vo.arap.reminder.ReminderQueryVO;
import nc.vo.pub.BusinessException;

public interface IArapReminderBO {
    public List<AggReminderVO> query(ReminderQueryVO var1) throws BusinessException;
}

