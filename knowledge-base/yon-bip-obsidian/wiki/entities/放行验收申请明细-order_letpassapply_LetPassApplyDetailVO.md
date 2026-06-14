---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "order.letpassapply.LetPassApplyDetailVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 放行验收申请明细 (`order.letpassapply.LetPassApplyDetailVO`)

> ycSaleCoor | 物理表：`cpu_letpass_apply_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 放行验收申请明细 |
| 物理表 | `cpu_letpass_apply_detail` |
| domain/服务域 | `cpu-cooperation` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:37.9900` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | 表体id |

---

## 直接属性（51个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 表体id | `id` | String |
| 2 | `mainId` | 主表id | `main_id` | 933c6472-5b81-4980-84c5-4223e96a3da3 |
| 3 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 4 | `productCode` | 物料编码 | `product_code` | String |
| 5 | `productName` | 物料名称 | `product_name` | String |
| 6 | `productSpec` | 规格 | `product_spec` | String |
| 7 | `productModel` | 型号 | `product_model` | String |
| 8 | `fileId` | 申请附件 | `file_id` | String |
| 9 | `mainUnitId` | 主单位id | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 10 | `mainUnit` | 主单位 | `main_unit` | String |
| 11 | `purUnitId` | 采购单位id | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 12 | `purUnit` | 采购单位 | `pur_unit` | String |
| 13 | `purchaseExchRate` | 采购换算率 | `purchase_exch_rate` | Decimal |
| 14 | `num` | 申请数量 | `num` | Decimal |
| 15 | `mainNum` | 申请主数量 | `main_num` | Decimal |
| 16 | `applyLetPassedNum` | 放行数量 | `apply_letpassed_num` | Decimal |
| 17 | `applyLetPassedMainNum` | 放行主数量 | `apply_letpassed_main_num` | Decimal |
| 18 | `letPassType` | 放行类型 | `letpass_type` | String |
| 19 | `diffLetPassedNum` | 放行差异数量 | `diff_letpassed_num` | Decimal |
| 20 | `diffLetPassedMainNum` | 放行差异主数量 | `diff_letpassed_main_num` | Decimal |
| 21 | `letPassResult` | 放行结果 | `letpass_result` | String |
| 22 | `checkAcceptExplain` | 验收说明 | `check_accept_explain` | String |
| 23 | `projectDocId` | 项目档案id | `project_doc_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 24 | `projectDocName` | 项目名称 | `project_doc_name` | String |
| 25 | `projectDocCode` | 项目编码 | `project_doc_code` | String |
| 26 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 27 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 28 | `upcode` | 上游单据号 | `upcode` | String |
| 29 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 30 | `source` | 上游单据类型 | `source` | String |
| 31 | `purBillId` | 采购订单主表id | `pur_bill_id` | Long |
| 32 | `purBillBid` | 采购订单子表id | `pur_bill_bid` | Long |
| 33 | `purCode` | 采购订单编码 | `pur_code` | String |
| 34 | `freeCharacteristics` | 自由项特征组 | `free_characteristics` | 51f5b37a-f86f-4cb8-aede-aa63e4f352f7 |
| 35 | `detailDefineCharacter` | 自定义项特征组 | `detail_define_character` | ebb49cde-ea5b-449a-937e-595595b7b45f |
| 36 | `dr` | 删除标志 | `dr` | Integer |
| 37 | `pubts` | 时间戳 | `pubts` | DateTime |
| 38 | `activity` | 活动主键 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 39 | `activityCode` | 活动编码 | `activity_code` | String |
| 40 | `activityName` | 活动 | `activity_name` | String |
| 41 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 42 | `defines` | 放行验收申请明细自定义项 | `` | 68f6f201-ecbc-4e13-8f45-e4ec351b23b6 |
| 43 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 44 | `purchaseExchRateDen` | 采购换算率分母 | `purchase_exch_rateden` | Decimal |
| 45 | `purchaseExchRateNum` | 采购换算率分子 | `purchase_exch_ratenum` | Decimal |
| 46 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 47 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 48 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 49 | `wbsCode` | WBS任务编码 | `wbs_code` | String |
| 50 | `wbsName` | WBS任务 | `wbs_name` | String |
| 51 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `activity` | 活动主键 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 2 | `freeCharacteristics` | 自由项特征组 | `order.letpassapply.LetPassApplyFreeCharacter` | None |  |
| 3 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `purUnitId` | 采购单位id | `pc.unit.Unit` | Service |  |
| 6 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 7 | `projectDocId` | 项目档案id | `bd.project.ProjectVO` | Service |  |
| 8 | `mainId` | 主表id | `order.letpassapply.LetPassApplyVO` | None | true |
| 9 | `detailDefineCharacter` | 自定义项特征组 | `order.letpassapply.LetPassApplyDetailDefineCharacter` | None |  |
| 10 | `mainUnitId` | 主单位id | `pc.unit.Unit` | Service |  |
| 11 | `defines` | 放行验收申请明细自定义项 | `order.letpassapply.LetPassApplyDetailVODefine` | None | true |
