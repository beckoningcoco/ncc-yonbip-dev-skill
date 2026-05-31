/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.doc.ext.service;

import com.yonyou.iuap.doc.check.dto.DocOrgPairDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantDTO;
import java.util.List;

public interface IMerchantExtNotifyService {
    public void insertMerchantNotify(List<MerchantDTO> var1);

    public void updateMerchantNotify(List<MerchantDTO> var1, String[] var2);

    public void deleteMerchantNotify(List<Long> var1);

    public void deleteMerchantOrgNotify(List<DocOrgPairDTO> var1);

    public void stopMerchantNotify(List<Long> var1);

    public void stopMerchantOrgNotify(List<DocOrgPairDTO> var1);

    public void unStopMerchantNotify(List<Long> var1);

    public void unStopMerchantOrgNotify(List<DocOrgPairDTO> var1);
}

