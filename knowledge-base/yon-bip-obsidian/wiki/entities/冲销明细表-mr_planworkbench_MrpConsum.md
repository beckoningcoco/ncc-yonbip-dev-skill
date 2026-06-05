---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.MrpConsum"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 冲销明细表 (`mr.planworkbench.MrpConsum`)

> MR | 物理表：`mr_mrp_consum`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 冲销明细表 |
| 物理表 | `mr_mrp_consum` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:44.8630` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（52个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `consumDocDate` | 单据日期 | `consum_doc_date` | DateTime |
| 2 | `consumDocId` | 被消抵单据 | `consum_doc_id` | Long |
| 3 | `consumDocLineId` | 被消抵单据 | `consum_doc_line_id` | Long |
| 4 | `consumDocNo` | 单号 | `consum_doc_no` | String |
| 5 | `consumDocQty` | 需求原量 | `consum_doc_qty` | Decimal |
| 6 | `consumDocSDInfo` | 被消抵单据供需信息 | `consumdoc_sdinfo_id` | dde99445-beaa-46b6-af8f-0f18e24f04f7 |
| 7 | `consumQty` | 消抵数量 | `consum_qty` | Decimal |
| 8 | `consumReqDate` | 需求日期 | `consum_req_date` | DateTime |
| 9 | `consumReqQty` | 需求余量 | `consum_req_qty` | Decimal |
| 10 | `createDate` | 创建日期 | `create_date` | Date |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `creator` | 创建人名称 | `creator` | String |
| 13 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `deductMethod` | 冲销方式 | `deduc_method` | DeductMethodEnum |
| 15 | `docId` | 消抵单据 | `doc_id` | Long |
| 16 | `docLineId` | 消抵单据 | `doc_line_id` | Long |
| 17 | `docLineNo` | 订单行号 | `doc_line_no` | String |
| 18 | `docNo` | 订单单号 | `doc_no` | String |
| 19 | `docQty` | 订单需求原量 | `doc_qty` | Decimal |
| 20 | `docSDInfo` | 消抵单据供需信息 | `doc_sdinfo_id` | dde99445-beaa-46b6-af8f-0f18e24f04f7 |
| 21 | `dr` | 逻辑删除标识 | `dr` | Integer |
| 22 | `fcDocumentType` | 预测单据类型 | `fc_document_type` | DocTypeEnum |
| 23 | `fcRootDocLineNo` | 预测源头单据行号 | `fc_root_doc_line_no` | String |
| 24 | `fcRootDocNo` | 预测源头单据号 | `fc_root_doc_no` | String |
| 25 | `id` | ID | `id` | Long |
| 26 | `materialId` | 制造物料 | `material_id` | Long |
| 27 | `modifier` | 修改人名称 | `modifier` | String |
| 28 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 29 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 30 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 31 | `orderDocumentType` | 订单单据类型 | `order_document_type` | DocTypeEnum |
| 32 | `orderRootDocLineNo` | 订单源头单据行号 | `order_root_doc_line_no` | String |
| 33 | `orderRootDocNo` | 订单源头单据号 | `order_root_doc_no` | String |
| 34 | `orgId` | 计划组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 35 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 36 | `planParamVersion` | 计划版本 | `plan_param_version` | Integer |
| 37 | `planType` | 计划类型 | `plan_type` | PlanTypeAllEnum |
| 38 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 39 | `pubts` | 时间戳 | `pubts` | DateTime |
| 40 | `reSourceDocId` | 冲销来源单据id | `re_src_doc_id` | Long |
| 41 | `reSourceDocNo` | 冲销来源单号 | `re_src_doc_no` | String |
| 42 | `reSourceType` | 冲销来源类型 | `re_src_type` | String |
| 43 | `rootDocDate` | 计划发货日期 | `root_doc_date` | DateTime |
| 44 | `rootDocId` | 源头单据 | `root_doc_id` | Long |
| 45 | `rootDocLineId` | 源头单据行 | `root_doc_line_id` | Long |
| 46 | `rootDocLineNo` | 源头单据行号 | `root_doc_line_no` | String |
| 47 | `rootDocNo` | 源头单据号 | `root_doc_no` | String |
| 48 | `rootDocOrgId` | 源头单据组织 | `root_doc_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 49 | `rootDocTypeCode` | 源头单据类型编码 | `root_doc_type_code` | DocTypeEnum |
| 50 | `sendQty` | 订单出货量 | `send_qty` | Decimal |
| 51 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 52 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `rootDocOrgId` | 源头单据组织 | `org.func.BaseOrg` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 7 | `consumDocSDInfo` | 被消抵单据供需信息 | `mr.planworkbench.SDInfo` | None |  |
| 8 | `docSDInfo` | 消抵单据供需信息 | `mr.planworkbench.SDInfo` | None |  |
| 9 | `orgId` | 计划组织 | `org.func.BaseOrg` | Service |  |
| 10 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
