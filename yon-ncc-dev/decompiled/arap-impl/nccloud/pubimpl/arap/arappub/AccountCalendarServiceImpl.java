/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bd.accperiod.InvalidAccperiodExcetion
 *  nc.pubitf.accperiod.AccountCalendar
 *  nc.vo.pub.lang.UFDate
 *  nccloud.pubitf.arap.arappub.IAccountCalendarService
 */
package nccloud.pubimpl.arap.arappub;

import nc.bd.accperiod.InvalidAccperiodExcetion;
import nc.pubitf.accperiod.AccountCalendar;
import nc.vo.pub.lang.UFDate;
import nccloud.pubitf.arap.arappub.IAccountCalendarService;

public class AccountCalendarServiceImpl
implements IAccountCalendarService {
    public AccountCalendar getInstanceByPk_org(String pk_org) {
        return AccountCalendar.getInstanceByPk_org((String)pk_org);
    }

    public void set(AccountCalendar ac, String year) throws InvalidAccperiodExcetion {
        ac.set(year);
    }

    public void setDate(AccountCalendar ac, UFDate date) throws InvalidAccperiodExcetion {
        ac.setDate(date);
    }
}

