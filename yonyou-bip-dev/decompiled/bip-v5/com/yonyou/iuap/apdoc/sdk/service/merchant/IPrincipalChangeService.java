/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.apdoc.sdk.service.merchant;

import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantPrincipalChangeDataDTO;
import java.util.List;

public interface IPrincipalChangeService {
    public void principalChange(List<MerchantPrincipalChangeDataDTO> var1) throws Exception;
}

