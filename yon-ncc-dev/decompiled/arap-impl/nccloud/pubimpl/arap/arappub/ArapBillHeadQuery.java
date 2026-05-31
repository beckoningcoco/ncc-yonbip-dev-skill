/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.impl.pubapp.pattern.data.table.TableIDQueryCondition
 *  nc.impl.pubapp.pattern.data.vo.VOQuery
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.IAttributeMeta
 *  nc.vo.pub.ISuperVO
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pubapp.pattern.log.TimeLog
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 *  nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta
 *  nc.vo.pubapp.pattern.model.tool.BillComposite
 *  nc.vo.pubapp.pattern.model.tool.MetaTool
 *  nc.vo.pubapp.pattern.pub.Constructor
 */
package nccloud.pubimpl.arap.arappub;

import nc.impl.pubapp.pattern.data.table.TableIDQueryCondition;
import nc.impl.pubapp.pattern.data.vo.VOQuery;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.IAttributeMeta;
import nc.vo.pub.ISuperVO;
import nc.vo.pub.IVOMeta;
import nc.vo.pubapp.pattern.log.TimeLog;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;
import nc.vo.pubapp.pattern.model.tool.BillComposite;
import nc.vo.pubapp.pattern.model.tool.MetaTool;
import nc.vo.pubapp.pattern.pub.Constructor;

public class ArapBillHeadQuery<E extends IBill> {
    private Class<E> billClass;
    private IBillMeta billMeta;
    private BillComposite<E> composite;

    public ArapBillHeadQuery(Class<E> clazz) {
        this.billClass = clazz;
        this.billMeta = MetaTool.getBillMeta(clazz);
        this.composite = new BillComposite(clazz);
    }

    private ISuperVO[] query(Class<? extends ISuperVO> clazz, IAttributeMeta field, TableIDQueryCondition conditionBuilder) {
        IAttributeMeta[] feilds = new IAttributeMeta[]{field};
        String condition = conditionBuilder.build(feilds);
        TimeLog.logStart();
        VOQuery query = new VOQuery(clazz);
        ISuperVO[] vos = query.queryWithWhereKeyWord(condition, null);
        IVOMeta meta = null;
        if (vos.length > 0) {
            meta = vos[0].getMetaData();
        } else {
            ISuperVO vo = (ISuperVO)Constructor.construct(clazz);
            meta = vo.getMetaData();
        }
        String message = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0137") + meta.getLabel();
        message = message + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0138") + vos.length;
        TimeLog.info((String)message);
        return vos;
    }

    public IBill[] query(String[] keys) {
        TimeLog.logStart();
        TableIDQueryCondition conditionBuilder = new TableIDQueryCondition(keys);
        TimeLog.info((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0139"));
        TimeLog.logStart();
        IVOMeta parent = this.billMeta.getParent();
        Class parentClass = this.billMeta.getVOClass(parent);
        ISuperVO[] vos = this.query(parentClass, parent.getPrimaryAttribute(), conditionBuilder);
        this.composite.append(parent, vos);
        TimeLog.info((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0140"));
        TimeLog.logStart();
        IBill[] bills = this.composite.composite();
        return bills;
    }
}

