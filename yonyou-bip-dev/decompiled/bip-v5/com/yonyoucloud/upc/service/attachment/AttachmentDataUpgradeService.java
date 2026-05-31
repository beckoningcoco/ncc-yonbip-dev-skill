/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.attachment;

import java.util.List;

public interface AttachmentDataUpgradeService {
    public void allAttachmentDataUpgrade(String var1);

    public void productAttachmentDataUpgrade(List<Long> var1) throws Exception;

    public void productAlbumDataUpgrade(List<Long> var1) throws Exception;

    public void productSpecItemAlbumDataUpgrade(List<Long> var1) throws Exception;

    public void merchantCorpImageAlbumDataUpgrade(List<Long> var1) throws Exception;

    public void merchantAttachmentDataUpgrade(List<Long> var1) throws Exception;

    public void attachmentGroupDataUpgrade(List<Long> var1) throws Exception;

    public void productUrlDataUpgrade(List<Long> var1) throws Exception;

    public void merchantMainDataUpgrade(List<Long> var1) throws Exception;

    public void productDescriptionDataUpgrade(List<Long> var1) throws Exception;

    public void presentationClassDataUpgrade(List<Long> var1) throws Exception;

    public void tagDataUpgrade(List<Long> var1) throws Exception;

    public void brandDataUpgrade(List<Long> var1) throws Exception;

    public void productApplyDataUpgrade(List<Long> var1) throws Exception;

    public void merchantApplyDataUpgrade(List<Long> var1) throws Exception;

    public String queryAttachmentDataUpgradeResult() throws Exception;

    public void buildImageThumb(List<Long> var1);
}

