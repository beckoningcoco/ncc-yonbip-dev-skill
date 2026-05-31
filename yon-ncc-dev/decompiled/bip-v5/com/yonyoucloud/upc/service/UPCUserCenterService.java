/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.bip.user.dto.AddIdentityDTO
 *  com.yonyou.bip.user.dto.UserVO
 *  com.yonyou.bip.user.service.IUserIdentityService
 *  com.yonyou.bip.user.utils.JsonResponse
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyoucloud.upc.service.IUPCUserCenterService
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.bip.user.dto.AddIdentityDTO;
import com.yonyou.bip.user.dto.UserVO;
import com.yonyou.bip.user.service.IUserIdentityService;
import com.yonyou.bip.user.utils.JsonResponse;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyoucloud.upc.service.IUPCUserCenterService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class UPCUserCenterService
implements IUPCUserCenterService {
    private static final Logger log = LoggerFactory.getLogger(UPCUserCenterService.class);
    @Autowired
    private IUserIdentityService iUserIdentityService;

    public String addUsersAndIdentity(String tenantId, String resCode, Integer userType, String userJson) {
        AddIdentityDTO addIdentityDTO = new AddIdentityDTO();
        addIdentityDTO.setResCode(resCode);
        addIdentityDTO.setUserType(userType);
        addIdentityDTO.setTenantId(tenantId);
        UsersObj usersObj = (UsersObj)JSON.parseObject((String)userJson, UsersObj.class);
        List<UserVO> list = usersObj.getUsers();
        addIdentityDTO.setUsers(list);
        log.info("yhtrequest:{}", (Object)userJson);
        String result = "";
        JsonResponse jsonResponse = this.iUserIdentityService.addUsersAndIdentity(addIdentityDTO);
        log.info("yhtreturn:{}", (Object)jsonResponse);
        if (Objects.isNull(jsonResponse) || jsonResponse.isFailed()) {
            log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040809C1", (String)"UserCenterUtils\u6dfb\u52a0\u53cb\u6237\u901a\u8eab\u4efd\u5931\u8d25:{}"), (Object)result);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800821, new Object[]{result});
        }
        JSONObject resultMap = JSON.parseObject((String)JSON.toJSONString((Object)jsonResponse));
        log.info("yhtreturnresultMap:{}", (Object)resultMap);
        if (resultMap != null && resultMap.get("status") != null && Integer.parseInt(resultMap.get("status").toString()) == 1) {
            List errorsResultMap = (List)resultMap.get("errors");
            if (!CollectionUtils.isEmpty((Collection)errorsResultMap)) {
                if (((Map)errorsResultMap.get(0)).get("msg") != null && InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040809C2", (String)"\u624b\u673a\u53f7\u91cd\u590d\uff0c\u4e0d\u80fd\u6dfb\u52a0\uff01").equals(((Map)errorsResultMap.get(0)).get("msg"))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800822);
                }
                result = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040809C4", (String)"UserCenterUtils\u6dfb\u52a0\u53cb\u6237\u901a\u8eab\u4efd\u5931\u8d25errors:%s"), JSON.toJSONString((Object)errorsResultMap));
                log.info(result);
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800821, new Object[]{((Map)errorsResultMap.get(0)).get("msg")});
            }
            List identitysResultMap = (List)resultMap.get("identitys");
            if (!CollectionUtils.isEmpty((Collection)identitysResultMap)) {
                log.info("yhtreturnidentitysResultMap:{}", (Object)identitysResultMap);
                return JSON.toJSONString((Object)identitysResultMap);
            }
        } else {
            result = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040809BF", (String)"UserCenterUtils\u6dfb\u52a0\u53cb\u6237\u901a\u8eab\u4efd\u5931\u8d25:%s"), resultMap.get("msg"));
            log.info(result);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800821, new Object[]{result});
        }
        return result;
    }

    public void removeUsersAndIdentity(String tenantId, String identityType, String resCode, List<String> userIds, String docId) {
        log.info("tenantId:{}identityType:{}resCode:{}userIds:{}", new Object[]{tenantId, identityType, resCode, userIds});
        JsonResponse jsonResponse = this.iUserIdentityService.removeIdentityFromTenant(tenantId, userIds, resCode, Integer.valueOf(identityType), docId);
        String result = "";
        log.info("removeUsersAndIdentity:{}", (Object)jsonResponse);
        if (Objects.isNull(jsonResponse) || jsonResponse.isFailed()) {
            log.info(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040809C5", (String)"UserCenterUtils\u79fb\u9664\u53cb\u6237\u901a\u8eab\u4efd\u5931\u8d25:{}"), (Object)result);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800823, new Object[]{result});
        }
        JsonResponse resultMap = jsonResponse;
        log.info("removeUsersAndIdentityresultMap:{}", (Object)resultMap);
        if (resultMap != null && resultMap.get("status") != null && Integer.parseInt(resultMap.get("status").toString()) == 1) {
            List errorsResultMap = (List)resultMap.get("errors");
            if (!CollectionUtils.isEmpty((Collection)errorsResultMap)) {
                result = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040809C0", (String)"UserCenterUtils\u79fb\u9664\u53cb\u6237\u901a\u8eab\u4efd\u5931\u8d25errors:%s"), JSON.toJSONString((Object)errorsResultMap));
                log.info(result);
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800821, new Object[]{result});
            }
        } else {
            result = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040809BF", (String)"UserCenterUtils\u6dfb\u52a0\u53cb\u6237\u901a\u8eab\u4efd\u5931\u8d25:%s"), resultMap.get("msg"));
            log.info(result);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800821, new Object[]{result});
        }
    }

    public static class UsersObj {
        private List<UserVO> users;

        public List<UserVO> getUsers() {
            return this.users;
        }

        public void setUsers(List<UserVO> users) {
            this.users = users;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof UsersObj)) {
                return false;
            }
            UsersObj other = (UsersObj)o;
            if (!other.canEqual(this)) {
                return false;
            }
            List<UserVO> this$users = this.getUsers();
            List<UserVO> other$users = other.getUsers();
            return !(this$users == null ? other$users != null : !((Object)this$users).equals(other$users));
        }

        protected boolean canEqual(Object other) {
            return other instanceof UsersObj;
        }

        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            List<UserVO> $users = this.getUsers();
            result = result * 59 + ($users == null ? 43 : ((Object)$users).hashCode());
            return result;
        }

        public String toString() {
            return "UPCUserCenterService.UsersObj(users=" + this.getUsers() + ")";
        }
    }
}

