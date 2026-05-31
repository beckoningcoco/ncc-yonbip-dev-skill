/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.api.interfaces.refer.IReferExtend
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.QueryPagerVo
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  org.apache.commons.lang3.ObjectUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.impl;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.api.interfaces.refer.IReferExtend;
import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.QueryPagerVo;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name={"coredoc.beancondition.refextend"}, havingValue="true")
public class ReferExtendServiceImpl
implements IReferExtend {
    private static final int PAGE_INDEX = 1;
    private static final String PAGE_SIZE = "coredoc.refdata.pagesize";
    private static final String TOTAL_COUNT = "coredoc.refdata.totalcount";
    private static final String GRID = "grid";
    private static final String DATA_TYPE = "dataType";
    private static final List<String> REF_BILLNUM_LIST = new ArrayList<String>(Arrays.asList("productref"));
    @Autowired
    private YMSParamConfig ymsParamConfig;

    public void beforeGetRefData(RefEntity refEntity, Map<String, Object> paramMap) {
        boolean isSimpleField;
        boolean pageFlag;
        boolean bl = pageFlag = paramMap != null && !paramMap.isEmpty() && GRID.equalsIgnoreCase((String)paramMap.get(DATA_TYPE)) && (!paramMap.containsKey("page") || ObjectUtils.isEmpty((Object)paramMap.get("page")));
        if (pageFlag) {
            QueryPagerVo queryPagerVo = new QueryPagerVo(1, Integer.parseInt(AppContext.getEnvConfig((String)PAGE_SIZE, (String)"5")));
            queryPagerVo.setTotalCount(Integer.parseInt(AppContext.getEnvConfig((String)TOTAL_COUNT, (String)"50")));
            paramMap.put("page", queryPagerVo);
        }
        if ((isSimpleField = BooleanUtil.isTrue((Object)this.ymsParamConfig.getRefSimpleField())) && REF_BILLNUM_LIST.contains(refEntity.getCBillnum())) {
            paramMap.put("isDistinct ", true);
        }
    }
}

