/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.basedoc.social.distribute.DistributePostUtil
 *  com.yonyou.iuap.basedoc.social.distribute.service.ISocialDistributeService
 *  com.yonyou.iuap.basedoc.social.param.CallbackDistributeParam
 *  com.yonyou.iuap.basedoc.social.param.SocialDistributeParam
 *  com.yonyou.iuap.basedoc.social.param.SocialQueryParam
 *  com.yonyou.iuap.framework.sdk.common.auth.FrameworkAuthProvider
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.ext.base.BaseController
 *  com.yonyou.ucf.mdd.ext.util.ResultMessage
 *  javax.servlet.http.HttpServletRequest
 *  javax.servlet.http.HttpServletResponse
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 */
package com.yonyoucloud.upc.controller.social;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.basedoc.social.distribute.DistributePostUtil;
import com.yonyou.iuap.basedoc.social.distribute.service.ISocialDistributeService;
import com.yonyou.iuap.basedoc.social.param.CallbackDistributeParam;
import com.yonyou.iuap.basedoc.social.param.SocialDistributeParam;
import com.yonyou.iuap.basedoc.social.param.SocialQueryParam;
import com.yonyou.iuap.framework.sdk.common.auth.FrameworkAuthProvider;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.ext.base.BaseController;
import com.yonyou.ucf.mdd.ext.util.ResultMessage;
import com.yonyoucloud.upc.service.social.CommonSocialService;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"/social/managementClass"})
public class ManagementClassSocialController
extends BaseController {
    private static final Logger log = LoggerFactory.getLogger(ManagementClassSocialController.class);
    Logger logger = LoggerFactory.getLogger(ManagementClassSocialController.class);
    @Autowired
    private ISocialDistributeService socialDistributeService;
    @Autowired
    private CommonSocialService commonSocialService;
    private final FrameworkAuthProvider authProvider;

    public ManagementClassSocialController(FrameworkAuthProvider authProvider) {
        this.authProvider = authProvider;
    }

    @PostMapping(value={"/distribute"})
    public void distribute(HttpServletResponse response, HttpServletRequest request) throws Exception {
        this.authProvider.detectBillNoAndAuthenticate();
        String userObject = request.getParameter("userObject");
        SocialDistributeParam socialDistributeParam = (SocialDistributeParam)JSON.parseObject((String)userObject, SocialDistributeParam.class);
        HashMap<String, String> messs = new HashMap<String, String>();
        try {
            this.socialDistributeService.distribute(socialDistributeParam);
        }
        catch (Exception e) {
            CallbackDistributeParam callbackDistributeParam = new CallbackDistributeParam();
            callbackDistributeParam.setMessage(e.getMessage());
            this.logger.error(e.getMessage(), (Throwable)e);
            DistributePostUtil.executeCallbackDistribute((CallbackDistributeParam)callbackDistributeParam);
        }
        messs.put("success", "true");
        this.renderJson(response, JSON.toJSONString(messs));
    }

    @PostMapping(value={"/query"})
    public void query(@RequestBody SocialQueryParam socialQueryParam, HttpServletResponse response) {
        this.authProvider.detectBillNoAndAuthenticate();
        try {
            Pager pager = this.commonSocialService.query(socialQueryParam);
            this.renderJson(response, ResultMessage.data((Object)pager));
        }
        catch (Exception e) {
            log.error(e.getMessage(), (Throwable)e);
            this.renderJson(response, ResultMessage.error((String)e.getMessage()));
        }
    }
}

