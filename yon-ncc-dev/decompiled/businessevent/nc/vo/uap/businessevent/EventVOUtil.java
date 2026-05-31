/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.uap.bbd.func.IModuleQueryService
 *  nc.vo.pub.BusinessException
 *  nc.vo.sm.funcreg.ModuleVO
 */
package nc.vo.uap.businessevent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.uap.bbd.func.IModuleQueryService;
import nc.vo.pub.BusinessException;
import nc.vo.sm.funcreg.ModuleVO;
import nc.vo.uap.businessevent.EventListenerVO;
import nc.vo.uap.businessevent.EventSourceVO;
import nc.vo.uap.businessevent.EventTypeVO;
import nc.vo.uap.businessevent.UnionVO;

public class EventVOUtil {
    public static EventSourceVO getEventSourceVOBy(EventTypeVO vo) {
        if (vo == null) {
            return null;
        }
        return new EventSourceVO(vo);
    }

    public static Object[] constructTreeVOs(EventTypeVO[] vos) {
        Arrays.sort(vos, EventVOUtil.getEventTypeVOComparator());
        EventSourceVO[] esvos = EventVOUtil.getEventSourceVOsBy(vos);
        Arrays.sort(esvos, EventVOUtil.getEventSourceVOComparator());
        ModuleVO[] dsvos = EventVOUtil.getModuleVOs();
        Arrays.sort(dsvos, EventVOUtil.getModuleVOComparator());
        ArrayList<Object> list = new ArrayList<Object>();
        list.addAll(Arrays.asList(dsvos));
        list.addAll(Arrays.asList(esvos));
        list.addAll(Arrays.asList(vos));
        return list.toArray(new Object[0]);
    }

    private static EventSourceVO[] getEventSourceVOsBy(EventTypeVO[] vos) {
        ArrayList<EventSourceVO> list = new ArrayList<EventSourceVO>();
        if (vos == null || vos.length == 0) {
            return list.toArray(new EventSourceVO[0]);
        }
        for (EventTypeVO etvo : vos) {
            EventSourceVO esvo = EventVOUtil.getEventSourceVOBy(etvo);
            if (list.contains(esvo)) continue;
            list.add(esvo);
        }
        return list.toArray(new EventSourceVO[0]);
    }

    private static ModuleVO[] getModuleVOs() {
        try {
            return ((IModuleQueryService)NCLocator.getInstance().lookup(IModuleQueryService.class)).getAllRegModules();
        }
        catch (BusinessException e) {
            Logger.debug((Object)((Object)e));
            return null;
        }
    }

    public static Comparator<EventSourceVO> getEventSourceVOComparator() {
        return new Comparator<EventSourceVO>(){

            @Override
            public int compare(EventSourceVO o1, EventSourceVO o2) {
                if (o1.getSourcename() == null || o1.getSourceid().equals("ALL")) {
                    return -1;
                }
                if (o2.getSourcename() == null || o2.getSourceid().equals("ALL")) {
                    return 1;
                }
                return o1.getSourcename().compareTo(o2.getSourcename());
            }
        };
    }

    public static Comparator<EventTypeVO> getEventTypeVOComparator() {
        return new Comparator<EventTypeVO>(){

            @Override
            public int compare(EventTypeVO o1, EventTypeVO o2) {
                return o1.getEventtypecode().compareTo(o2.getEventtypecode());
            }
        };
    }

    public static Comparator<ModuleVO> getModuleVOComparator() {
        return new Comparator<ModuleVO>(){

            @Override
            public int compare(ModuleVO o1, ModuleVO o2) {
                return o1.getModuleid().compareTo(o2.getModuleid());
            }
        };
    }

    public static Comparator<EventListenerVO> getEventListenerVOComparator() {
        return new Comparator<EventListenerVO>(){

            @Override
            public int compare(EventListenerVO o1, EventListenerVO o2) {
                if (o1.getOperindex() == null && o2.getOperindex() == null) {
                    return 0;
                }
                if (o1.getOperindex() == null) {
                    return 1;
                }
                if (o2.getOperindex() == null) {
                    return -1;
                }
                return o1.getOperindex().compareTo(o2.getOperindex());
            }
        };
    }

    public static Comparator<UnionVO> getUnionVOComparator() {
        return new Comparator<UnionVO>(){

            @Override
            public int compare(UnionVO o1, UnionVO o2) {
                if (o1.getOperIndex() == null && o2.getOperIndex() == null) {
                    return 0;
                }
                if (o1.getOperIndex() == null) {
                    return 1;
                }
                if (o2.getOperIndex() == null) {
                    return -1;
                }
                return o1.getOperIndex().compareTo(o2.getOperIndex());
            }
        };
    }
}

