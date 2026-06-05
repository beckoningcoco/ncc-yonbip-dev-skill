---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# API信息表 (`iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiInfo`)

> INPAPI | 物理表：`ucg_baseapi_api_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | API信息表 |
| 物理表 | `ucg_baseapi_api_info` |
| 数据库 schema | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:02:59.6820` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（88个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `agentUserScene` | agentUserScene | `agent_user_scene` | Integer |
| 2 | `apiClassifyId` | apiClassifyId | `api_classify_id` | 09b8ff01-839e-4dd3-a532-58e1f2046085 |
| 3 | `apiClassifyName` | apiClassifyName | `api_classify_name` | String |
| 4 | `apiCode` | apiCode | `api_code` | String |
| 5 | `appCode` | appCode | `app_code` | String |
| 6 | `applicationcode` | applicationcode | `applicationCode` | String |
| 7 | `approvalStatus` | approvalStatus | `approval_status` | Integer |
| 8 | `arrayParam` | arrayParam | `array_param` | Integer |
| 9 | `auth` | auth | `auth` | Integer |
| 10 | `authId` | authId | `auth_id` | String |
| 11 | `bidirectionalSsl` | bidirectionalSsl | `bidirectional_ssl` | Integer |
| 12 | `billNo` | billNo | `bill_no` | String |
| 13 | `bizObjOperationType` | bizObjOperationType | `biz_obj_operation_type` | String |
| 14 | `bizObjUri` | bizObjUri | `biz_obj_uri` | String |
| 15 | `bodyPassthrough` | bodyPassthrough | `body_passthrough` | Integer |
| 16 | `code` | api的编码 | `code` | String |
| 17 | `completeProxyUrl` | completeProxyUrl | `complete_proxy_url` | String |
| 18 | `connectUrl` | connectUrl | `connect_url` | String |
| 19 | `contentType` | contentType | `content_type` | String |
| 20 | `createTime` | createTime | `create_time` | Date |
| 21 | `createUser` | createUser | `create_user` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 22 | `customUrl` | customUrl | `custom_url` | String |
| 23 | `description` | description | `description` | String |
| 24 | `docUrl` | docUrl | `doc_url` | String |
| 25 | `domainCode` | domainCode | `domain_code` | String |
| 26 | `dr` | dr | `dr` | Integer |
| 27 | `enableMulti` | API是否支持多语 | `enable_multi` | Integer |
| 28 | `fileSize` | fileSize | `file_size` | Integer |
| 29 | `fixedUrl` | fixedUrl | `fixed_url` | String |
| 30 | `functionId` | functionId | `function_id` | String |
| 31 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 32 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 33 | `handler` | handler | `handler` | String |
| 34 | `healthExam` | healthExam | `health_exam` | Integer |
| 35 | `healthStatus` | healthStatus | `health_status` | Integer |
| 36 | `httpRequestType` | httpRequestType | `http_request_type` | String |
| 37 | `id` | id | `id` | String |
| 38 | `idempotent` | idempotent | `idempotent` | String |
| 39 | `ipbApiIntegSchemeDeftList` | 租户绑定的唯一集成方案表 | `` | 4e232fef-9f74-4231-9646-431b0a6757a5 |
| 40 | `isvId` | isvId | `isv_id` | String |
| 41 | `ma` | ma | `ma` | Integer |
| 42 | `microServiceCode` | microServiceCode | `micro_service_code` | String |
| 43 | `mock` | mock | `mock` | Integer |
| 44 | `mockTimeOut` | mockTimeOut | `mock_time_out` | String |
| 45 | `multiField` | 多语字段code | `multi_field` | String |
| 46 | `name` | name | `name` | String |
| 47 | `noAgentUserScene` | noAgentUserScene | `no_agent_user_scene` | Integer |
| 48 | `oldCompleteProxyUrl` | oldCompleteProxyUrl | `old_complete_proxy_url` | String |
| 49 | `openApi` | openApi | `open_api` | Integer |
| 50 | `openMode` | openMode | `open_mode` | Integer |
| 51 | `paramIsForce` | paramIsForce | `param_is_force` | Integer |
| 52 | `paramTransferMode` | paramTransferMode | `param_transfer_mode` | Integer |
| 53 | `pathJoin` | pathJoin | `path_join` | Integer |
| 54 | `pathMatch` | pathMatch | `path_match` | Integer |
| 55 | `preset` | preset | `preset` | Integer |
| 56 | `privacyCategory` | privacyCategory | `privacy_category` | Integer |
| 57 | `privacyLevel` | privacyLevel | `privacy_level` | Integer |
| 58 | `productId` | productId | `product_id` | 8bcc7790-ab21-49d6-b562-6c5f28da3d04 |
| 59 | `providerId` | 服务商id | `provider_id` | String |
| 60 | `proxyUrl` | proxyUrl | `proxy_url` | String |
| 61 | `publishStatus` | publishStatus | `publish_status` | Integer |
| 62 | `publishTime` | publishTime | `publish_time` | String |
| 63 | `requestParamsDemo` | requestParamsDemo | `request_params_demo` | String |
| 64 | `requestProtocol` | requestProtocol | `request_protocol` | String |
| 65 | `responseResultPassThrough` | responseResultPassThrough | `response_result_pass_through` | Integer |
| 66 | `returnFormatType` | returnFormatType | `return_format_type` | String |
| 67 | `routingStgy` | routingStgy | `routing_stgy` | Integer |
| 68 | `rpcAppName` | rpcAppName | `rpc_app_name` | String |
| 69 | `rpcMethodName` | rpcMethodName | `rpc_method_name` | String |
| 70 | `rpcServiceName` | rpcServiceName | `rpc_service_name` | String |
| 71 | `rpcServiceUrl` | rpcServiceUrl | `rpc_service_url` | String |
| 72 | `scene` | scene | `scene` | Integer |
| 73 | `serviceHttpMethod` | serviceHttpMethod | `service_http_method` | String |
| 74 | `sort` | sort | `sort` | Integer |
| 75 | `tenantId` | tenantId | `tenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 76 | `timeOut` | timeOut | `time_out` | String |
| 77 | `ucgBaseapiApiRouteList` | API与路由配置绑定关系表 | `` | 0ffe2ebe-995d-41de-b174-72cbbbe07823 |
| 78 | `ucgBaseapiParamConstList` | API常量表 | `` | 2060c6b1-bfd0-402b-be65-530effcf9570 |
| 79 | `ucgBaseapiParamConstMapList` | API常量参数映射表 | `` | c1b62d0f-d6a4-4513-92cd-835441b4fcdc |
| 80 | `ucgBaseapiParamMapList` | API入参映射表 | `` | 9620993e-3db6-4368-9bcf-1db3806632c9 |
| 81 | `ucgBaseapiStatusConfList` | API成功状态配置 | `` | 781ffc1d-3761-489e-a694-8a8bcd181960 |
| 82 | `ucgLogApiPublishList` | API版本信息表 | `` | 215d4519-d5be-4df9-961c-588d7a6ed9a1 |
| 83 | `ucgSchema` | ucgSchema | `ucg_schema` | String |
| 84 | `updateUserId` | updateUserId | `update_user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 85 | `updateUserName` | updateUserName | `update_user_name` | String |
| 86 | `userIdPassthrough` | userIdPassthrough | `user_id_passthrough` | Integer |
| 87 | `version` | version | `version` | String |
| 88 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ucgBaseapiParamMapList` | API入参映射表 | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiParamMap` | None | true |
| 2 | `ipbApiIntegSchemeDeftList` | 租户绑定的唯一集成方案表 | `iuap-api-management.A33_APIMngCompoment.ipbApiIntegSchemeDeft` | None | true |
| 3 | `productId` | productId | `iuap-api-management.A33_APIMngCompoment.ucgBaseProductInfo` | None |  |
| 4 | `updateUserId` | updateUserId | `base.user.BipUser` | Service |  |
| 5 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `ucgBaseapiApiRouteList` | API与路由配置绑定关系表 | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiRoute` | None | true |
| 7 | `apiClassifyId` | apiClassifyId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiClassify` | None |  |
| 8 | `ucgBaseapiParamConstList` | API常量表 | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiParamConst` | None | true |
| 9 | `tenantId` | tenantId | `yht.tenant.YhtTenant` | Service |  |
| 10 | `createUser` | createUser | `base.user.BipUser` | Service |  |
| 11 | `ucgLogApiPublishList` | API版本信息表 | `iuap-api-management.A33_APIMngCompoment.ucgLogApiPublish` | None | true |
| 12 | `ucgBaseapiStatusConfList` | API成功状态配置 | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiStatusConf` | None | true |
| 13 | `ucgBaseapiParamConstMapList` | API常量参数映射表 | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiParamConstMap` | None | true |
