/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.ipass.presentationclass.PresentationClassIPassTreeRequest
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.iuap.ipass.service.presentationclass;

import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.ipass.presentationclass.PresentationClassIPassTreeRequest;
import org.springframework.stereotype.Service;

@Service
public interface PresentationClassIPassService {
    public CoreDocJsonResultForOpenApi doPresentationClassQuery(PresentationClassIPassTreeRequest var1);
}

