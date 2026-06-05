---
tags: ["BIP", "元数据", "数据字典", "ED", "ed.mainformula.MainFormula"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 主配方 (`ed.mainformula.MainFormula`)

> ED | 物理表：`ed_routing`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 主配方 |
| 物理表 | `ed_routing` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 构建时间 | `2026-06-05 09:22:44.8390` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 主配方编码 |

---

## 直接属性（75个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `applicableScope` | 适用范围 | `applicable_scope` | Integer |
| 2 | `auditDate` | 审批日期 | `audit_date` | Date |
| 3 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 4 | `auditor` | 审批人名称 | `auditor` | String |
| 5 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `batch` | 主批量 | `batch` | Decimal |
| 7 | `bomId` | 物料清单 | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 8 | `bomRelated` | 生效BOM版本 | `bom_related` | String |
| 9 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 10 | `changeRateDen` | 换算率分母 | `change_rate_den` | Decimal |
| 11 | `changeRateNum` | 换算率分子 | `change_rate_num` | Decimal |
| 12 | `changeType` | 换算方式 | `change_type` | Short |
| 13 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 14 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 15 | `closer` | 关闭人名称 | `closer` | String |
| 16 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `code` | 主配方编码 | `code` | String |
| 18 | `createDate` | 创建日期 | `create_date` | Date |
| 19 | `createTime` | 创建时间 | `create_time` | DateTime |
| 20 | `creator` | 创建人名称 | `creator` | String |
| 21 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `effectiveDate` | 生效日期 | `effective_date` | DateTime |
| 23 | `expiryDate` | 失效日期 | `expiry_date` | DateTime |
| 24 | `id` | ID | `id` | Long |
| 25 | `industryProcessLibraryId` | 行业工艺库ID | `industryProcessLibraryId` | String |
| 26 | `isFromIndustryProcessLib` | 来源行业工艺库 | `is_from_industry_process_lib` | Short |
| 27 | `isHistory` | 修订历史 | `is_history` | Short |
| 28 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 29 | `lockDate` | 锁定日期 | `lock_Date` | Date |
| 30 | `lockTime` | 锁定时间 | `lock_time` | DateTime |
| 31 | `locker` | 锁定人 | `locker` | String |
| 32 | `materialId` | 制造物料 | `material_id` | Long |
| 33 | `memo` | 备注 | `memo` | String |
| 34 | `modifier` | 修改人名称 | `modifier` | String |
| 35 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 36 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 37 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 38 | `modifyType` | 变更类型 | `modify_type` | Short |
| 39 | `name` | 工艺路线名称 | `name` | String |
| 40 | `newestVer` | 最新版本 | `newest_ver` | Short |
| 41 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 42 | `originalId` | 变更源 | `original_id` | Long |
| 43 | `produceBatch` | 生产批量 | `produce_batch` | Decimal |
| 44 | `produceUnit` | 生产单位 | `produce_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 45 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 46 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 47 | `productUnit` | 主计量单位 | `product_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 48 | `pubts` | 时间戳 | `pubts` | DateTime |
| 49 | `returncount` | 退回次数 | `returncount` | Short |
| 50 | `rollup` | 默认卷积 | `rollup` | Short |
| 51 | `routeTemplateId` | 工艺路线模板ID | `routetemplate_id` | 1d7fc118-77a0-4f55-be7a-5496bba0bb67 |
| 52 | `routingApplicableMaterial` | 适用物料 | `` | fb59fb3e-f636-4150-89e2-d7551f4d2a1a |
| 53 | `routingClassify` | 工艺类别 | `routing_classify` | Integer |
| 54 | `routingDefineCharacter` | 主配方自定义项 | `routing_define_character` | c549c75e-edb1-41ee-8341-c1d256264d10 |
| 55 | `routingFreeCts` | 主配方自由项特征组自定义项实体 | `routing_free_cts` | cab19356-03bb-4ecf-9863-85c343db65b6 |
| 56 | `routingOperation` | 配方工序 | `` | e3ed947a-f5e9-45e7-86b9-a225e6cbfbfb |
| 57 | `routingSensitive` | 主配方敏感域自定义项实体 | `routing_sensitive` | e383976f-137d-42ca-9556-262dee0d225d |
| 58 | `routingType` | 路线类别 | `routing_type` | Integer |
| 59 | `sensitiveUID` | SKU敏感域唯一性ID | `sensitive_uid` | String |
| 60 | `status` | 单据状态 | `status` | Short |
| 61 | `stopstatus` | 停用状态 | `stopstatus` | Boolean |
| 62 | `stoptime` | 停用时间 | `stop_time` | DateTime |
| 63 | `substituteDescription` | 替代说明 | `substitute_description` | String |
| 64 | `sumPrepareTs` | 固定提前期 | `sum_prepare_ts` | Decimal |
| 65 | `sumProcessTs` | 变动提前期 | `sum_process_ts` | Decimal |
| 66 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 67 | `timeUnit` | 时间单位 | `time_unit` | Short |
| 68 | `tplid` | 模板id | `tplid` | Long |
| 69 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 70 | `unitExchangeType` | 单位转化类型 | `unit_exchange_type` | String |
| 71 | `verifystate` | 审批状态 | `verifystate` | Short |
| 72 | `version` | 工艺路线版本 | `version` | String |
| 73 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 74 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 75 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `produceUnit` | 生产单位 | `pc.unit.Unit` | Service |  |
| 2 | `routingSensitive` | 主配方敏感域自定义项实体 | `ed.routing.RoutingSensitiveDefine` | None |  |
| 3 | `routingApplicableMaterial` | 适用物料 | `ed.mainformula.FormulaApplicableMaterial` | None | true |
| 4 | `bomId` | 物料清单 | `ed.bom.Bom` | None |  |
| 5 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `wbs` | wbs | `BGDM.wbs.wbs_doc` | Service |  |
| 10 | `productUnit` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 11 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 12 | `routingOperation` | 配方工序 | `ed.mainformula.FormulaOperation` | None | true |
| 13 | `routingFreeCts` | 主配方自由项特征组自定义项实体 | `ed.routing.RoutingFreePropCharacters` | None |  |
| 14 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 15 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 16 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 17 | `routeTemplateId` | 工艺路线模板ID | `ed.routing.RouteTemplate` | None |  |
| 18 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 19 | `routingDefineCharacter` | 主配方自定义项 | `ed.routing.RoutingDefineCharacter` | None |  |
| 20 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
