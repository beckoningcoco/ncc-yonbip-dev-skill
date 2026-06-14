---
tags: ["BIP", "元数据", "数据字典", "ED", "ed.routing.Routing"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工艺路线 (`ed.routing.Routing`)

> ED | 物理表：`ed_routing`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工艺路线 |
| 物理表 | `ed_routing` |
| domain/服务域 | `engineeringdata` |
| 所属应用 | `ED` |
| 构建时间 | `2026-06-05 09:22:46.3290` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 工艺路线关联标识 |
| 编码 | `code` | String | 编码 |

---

## 直接属性（79个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 2 | `changeType` | 换算方式 | `change_type` | Short |
| 3 | `produceBatch` | 生产批量 | `produce_batch` | Decimal |
| 4 | `produceUnit` | 生产单位 | `produce_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 5 | `productUnit` | 主计量单位 | `product_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 6 | `modifyType` | 变更类型 | `modify_type` | Short |
| 7 | `isHistory` | 修订历史 | `is_history` | Short |
| 8 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 9 | `routingDefineCharacter` | 自定义项特征属性组 | `routing_define_character` | c549c75e-edb1-41ee-8341-c1d256264d10 |
| 10 | `auditDate` | 审批日期 | `audit_date` | Date |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 12 | `newestVer` | 最新版本 | `newest_ver` | Short |
| 13 | `applicableScope` | 适用范围 | `applicable_scope` | Integer |
| 14 | `originalId` | 变更源 | `original_id` | Long |
| 15 | `routingFreeCts` | 工艺路线自由项特征组自定义项实体 | `routing_free_cts` | cab19356-03bb-4ecf-9863-85c343db65b6 |
| 16 | `sensitiveUID` | SKU敏感域唯一性ID | `sensitive_uid` | String |
| 17 | `id` | 工艺路线关联标识 | `id` | Long |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |
| 19 | `orgId` | 组织id | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 20 | `routingSensitive` | 工艺路线敏感域 | `routing_sensitive` | e383976f-137d-42ca-9556-262dee0d225d |
| 21 | `code` | 编码 | `code` | String |
| 22 | `name` | 名称 | `name` | String |
| 23 | `routeTemplateId` | 工艺路线模板ID | `routetemplate_id` | 1d7fc118-77a0-4f55-be7a-5496bba0bb67 |
| 24 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 25 | `materialId` | 制造物料ID | `material_id` | Long |
| 26 | `routingType` | 路线类别 | `routing_type` | Integer |
| 27 | `substituteDescription` | 替代标识 | `substitute_description` | String |
| 28 | `version` | 版本 | `version` | String |
| 29 | `effectiveDate` | 生效时间 | `effective_date` | DateTime |
| 30 | `expiryDate` | 失效时间 | `expiry_date` | DateTime |
| 31 | `timeUnit` | 时间单位 | `time_unit` | Short |
| 32 | `sumPrepareTs` | 固定提前期 | `sum_prepare_ts` | Decimal |
| 33 | `sumProcessTs` | 变动提前期 | `sum_process_ts` | Decimal |
| 34 | `status` | 单据状态 | `status` | Short |
| 35 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 36 | `verifystate` | 审批状态 | `verifystate` | Short |
| 37 | `rollup` | 默认卷积 | `rollup` | Short |
| 38 | `memo` | 备注 | `memo` | String |
| 39 | `returncount` | 退回次数 | `returncount` | Short |
| 40 | `isFromIndustryProcessLib` | 来源行业工艺库 | `is_from_industry_process_lib` | Short |
| 41 | `industryProcessLibraryId` | 行业工艺库ID | `industryProcessLibraryId` | String |
| 42 | `creator` | 创建人 | `creator` | String |
| 43 | `createTime` | 创建时间 | `create_time` | DateTime |
| 44 | `modifier` | 最后修改人 | `modifier` | String |
| 45 | `modifyTime` | 最后修改时间 | `modify_time` | DateTime |
| 46 | `auditor` | 审核人 | `auditor` | String |
| 47 | `auditTime` | 审核时间 | `audit_time` | DateTime |
| 48 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 49 | `bomRelated` | 生效BOM版本 | `bom_related` | String |
| 50 | `batch` | 批量 | `batch` | Decimal |
| 51 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 52 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 53 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 54 | `tplid` | 模板id | `tplid` | Long |
| 55 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 56 | `bomId` | bomId | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 57 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 58 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 59 | `lockTime` | 锁定时间 | `lock_time` | DateTime |
| 60 | `stopstatus` | 停用状态 | `stopstatus` | Boolean |
| 61 | `createDate` | 创建日期 | `create_date` | Date |
| 62 | `closer` | 关闭人名称 | `closer` | String |
| 63 | `stoptime` | 停用时间 | `stop_time` | DateTime |
| 64 | `locker` | 锁定人 | `locker` | String |
| 65 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 66 | `lockDate` | 锁定日期 | `lock_Date` | Date |
| 67 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 68 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 69 | `unitExchangeType` | 单位转化类型 | `unit_exchange_type` | String |
| 70 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 71 | `changeRateDen` | 换算率分母 | `change_rate_den` | Decimal |
| 72 | `changeRateNum` | 换算率分子 | `change_rate_num` | Decimal |
| 73 | `defines` | 工艺路线(固定自定义项)表 | `` | e1adb9e2-ca89-40b6-9b8f-a976aa08df84 |
| 74 | `isParallelSeq` | 是否存在并行序列 | `is_parallel_seq` | Integer |
| 75 | `operationSequence` | 工序序列 | `` | e06ef0eb-bcef-4c86-9b2a-70288829bbaa |
| 76 | `routingApplicableMaterial` | 适用物料 | `` | 03f42101-e320-4371-9078-86f246f9fe23 |
| 77 | `routingAttrextItem` | 工艺路线(自由自定义项)表 | `` | feb65dd1-fb84-411a-af64-52919797bb1a |
| 78 | `routingClassify` | 工艺类别 | `routing_classify` | Integer |
| 79 | `routingOperation` | 工艺路线工序 | `` | 4779185e-375a-4830-bc81-92255430924e |

---

## 关联属性（23个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `produceUnit` | 生产单位 | `pc.unit.Unit` | Service |  |
| 2 | `routingSensitive` | 工艺路线敏感域 | `ed.routing.RoutingSensitiveDefine` | None |  |
| 3 | `routingApplicableMaterial` | 适用物料 | `ed.routing.RoutingApplicableMaterial` | None | true |
| 4 | `operationSequence` | 工序序列 | `ed.routing.OperationSequence` | None | true |
| 5 | `bomId` | bomId | `ed.bom.Bom` | None |  |
| 6 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 7 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 8 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 10 | `wbs` | wbs | `BGDM.wbs.wbs_doc` | Service |  |
| 11 | `productUnit` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 12 | `orgId` | 组织id | `aa.baseorg.OrgMV` | Service |  |
| 13 | `routingOperation` | 工艺路线工序 | `ed.routing.RoutingOperation` | None | true |
| 14 | `routingAttrextItem` | 工艺路线(自由自定义项)表 | `ed.routing.RoutingAttrextItem` | None | true |
| 15 | `defines` | 工艺路线(固定自定义项)表 | `ed.routing.RoutingUserDefine` | None | true |
| 16 | `routingFreeCts` | 工艺路线自由项特征组自定义项实体 | `ed.routing.RoutingFreePropCharacters` | None |  |
| 17 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 18 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 19 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 20 | `routeTemplateId` | 工艺路线模板ID | `ed.routing.RouteTemplate` | None |  |
| 21 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 22 | `routingDefineCharacter` | 自定义项特征属性组 | `ed.routing.RoutingDefineCharacter` | None |  |
| 23 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
