/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyoucloud.iuap.upc.api.service.IBizApiHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

public abstract class BaseBizApiHandler
implements IBizApiHandler {
    @Override
    public Object handle(BillDataDto dataDto, String action) throws Exception {
        Optional<Method> method = Arrays.stream(this.getClass().getDeclaredMethods()).filter(m -> m.getName().equals(action)).findFirst();
        if (method.isPresent()) {
            return method.get().invoke(this, dataDto);
        }
        throw new UnsupportedOperationException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807DC", (String)"\u672a\u5b9a\u4e49\u65b9\u6cd5\"%s\"\u3002"), action));
    }
}

