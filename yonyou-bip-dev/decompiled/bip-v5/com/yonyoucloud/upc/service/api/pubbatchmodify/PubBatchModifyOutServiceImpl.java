/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyoucloud.iuap.upc.api.IPubBatchModifyService
 *  com.yonyoucloud.iuap.upc.dto.pubbatchmodify.PubBatchModifyDTO
 *  com.yonyoucloud.iuap.upc.dto.pubbatchmodify.PubBatchModifyModifySaveDTO
 *  com.yonyoucloud.iuap.upc.dto.pubbatchmodify.PubBatchModifyQueryDTO
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.api.pubbatchmodify;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyoucloud.iuap.upc.api.IPubBatchModifyService;
import com.yonyoucloud.iuap.upc.dto.pubbatchmodify.PubBatchModifyDTO;
import com.yonyoucloud.iuap.upc.dto.pubbatchmodify.PubBatchModifyModifySaveDTO;
import com.yonyoucloud.iuap.upc.dto.pubbatchmodify.PubBatchModifyQueryDTO;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PubBatchModifyOutServiceImpl
implements IPubBatchModifyService {
    private static final Logger log = LoggerFactory.getLogger(PubBatchModifyOutServiceImpl.class);

    public List<PubBatchModifyDTO> getPubBatchModifyBatchEntity(PubBatchModifyQueryDTO pubBatchModifyQueryDTO) throws Exception {
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801273);
    }

    public PubBatchModifyDTO getPubBatchModifyEntityField(PubBatchModifyQueryDTO pubBatchModifyQueryDTO) throws Exception {
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801273);
    }

    public String batchModify(PubBatchModifyModifySaveDTO pubBatchModifyModifySaveDTO) throws Exception {
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801273);
    }

    public String getSyncDataProgress(String asyncKey) throws Exception {
        try {
            asyncKey = URLDecoder.decode(asyncKey, "UTF-8");
        }
        catch (UnsupportedEncodingException e) {
            log.error("getSyncDataProgress" + e.getMessage(), (Throwable)e);
        }
        return AppContext.cache().get(asyncKey);
    }
}

