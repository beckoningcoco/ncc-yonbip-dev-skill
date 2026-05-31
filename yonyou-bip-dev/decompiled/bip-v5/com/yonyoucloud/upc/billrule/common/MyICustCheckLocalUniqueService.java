/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.support.model.check.CheckUnionBO
 *  com.yonyou.ucf.mdd.support.model.check.UnionKeyBO
 *  com.yonyou.ucf.mdd.support.service.check.CheckLocalUniqueService
 *  com.yonyou.ucf.mdd.support.service.check.extendInterfaces.ICustCheckLocalUniqueService
 *  org.imeta.orm.base.BizObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.common;

import com.yonyou.ucf.mdd.support.model.check.CheckUnionBO;
import com.yonyou.ucf.mdd.support.model.check.UnionKeyBO;
import com.yonyou.ucf.mdd.support.service.check.CheckLocalUniqueService;
import com.yonyou.ucf.mdd.support.service.check.extendInterfaces.ICustCheckLocalUniqueService;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="myICustCheckLocalUniqueService")
public class MyICustCheckLocalUniqueService
implements ICustCheckLocalUniqueService {
    @Autowired
    private CheckLocalUniqueService checkLocalUniqueService;

    public void unionColumnKey(CheckUnionBO checkUnionBO, BizObject bill, Map<String, List<String>> keysMap) throws Exception {
        UnionKeyBO unionKeyBO;
        Map unionKeyPropsMap = checkUnionBO.getUnionKeyProps();
        if (unionKeyPropsMap != null && !unionKeyPropsMap.isEmpty() && (unionKeyBO = (UnionKeyBO)unionKeyPropsMap.get("mddMainUnionKey")) != null) {
            this.checkLocalUniqueService.unionColumnKey(checkUnionBO, bill, keysMap);
        }
    }
}

