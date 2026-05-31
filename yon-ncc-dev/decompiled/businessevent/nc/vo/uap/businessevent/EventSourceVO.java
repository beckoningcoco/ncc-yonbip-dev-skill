/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.MultiLangContext
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.ValidationException
 *  nccloud.commons.lang.StringUtils
 */
package nc.vo.uap.businessevent;

import java.io.Serializable;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.MultiLangContext;
import nc.vo.pub.SuperVO;
import nc.vo.pub.ValidationException;
import nc.vo.uap.businessevent.EventTypeVO;
import nccloud.commons.lang.StringUtils;

public class EventSourceVO
extends SuperVO
implements Serializable {
    private static final long serialVersionUID = -736195674877529089L;
    private EventTypeVO eventTypeVO;

    public EventSourceVO() {
    }

    public EventSourceVO(EventTypeVO vo) {
        this.eventTypeVO = vo;
    }

    public String getSourceid() {
        return this.eventTypeVO.getSourceid();
    }

    public String getSourcename() {
        return this.toString();
    }

    public String getOwner() {
        return this.eventTypeVO.getOwner();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof EventSourceVO)) {
            return false;
        }
        EventSourceVO vo = (EventSourceVO)obj;
        return vo.getSourceid().equals(this.getSourceid()) && StringUtils.equalsIgnoreCase((CharSequence)vo.getSourcename(), (CharSequence)this.getSourcename());
    }

    public int hashCode() {
        if (StringUtil.isEmptyWithTrim((String)this.getSourceid())) {
            return 37;
        }
        return this.getSourceid().hashCode();
    }

    public void validate() throws ValidationException {
    }

    public String getPKFieldName() {
        return null;
    }

    public String getParentPKFieldName() {
        return null;
    }

    public String getTableName() {
        return null;
    }

    public String toString() {
        if (this.eventTypeVO == null) {
            return "";
        }
        String name = null;
        int langseq = MultiLangContext.getInstance().getCurrentLangSeq();
        switch (langseq) {
            case 1: {
                name = this.eventTypeVO.getSourcename();
                break;
            }
            case 2: {
                name = this.eventTypeVO.getSourcename2();
                break;
            }
            case 3: {
                name = this.eventTypeVO.getSourcename3();
                break;
            }
            case 4: {
                name = this.eventTypeVO.getSourcename4();
                break;
            }
            case 5: {
                name = this.eventTypeVO.getSourcename5();
                break;
            }
            case 6: {
                name = this.eventTypeVO.getSourcename6();
                break;
            }
        }
        if (name == null) {
            name = this.eventTypeVO.getSourcename();
        }
        if (StringUtils.isEmpty((CharSequence)name)) {
            return "";
        }
        return name;
    }
}

