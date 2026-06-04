---
tags: ["BIP", "元数据", "数据字典", "ycQualityCollaboration", "suchangeCollab.supplierCn.CpuSupplierCnBody"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 变更协同表体物料信息 (`suchangeCollab.supplierCn.CpuSupplierCnBody`)

> ycQualityCollaboration | 物理表：`cpu_suppliercn_b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 变更协同表体物料信息 |
| 物理表 | `cpu_suppliercn_b` |
| 数据库 schema | `yonbip-cpu-synergy` |
| 所属应用 | `ycQualityCollaboration` |
| 构建时间 | `2026-06-04 23:32:16.5920` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（30个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `lineno` | 行号 | `lineno` | Decimal |
| 3 | `cnId` | 变更协同主表ID | `cn_id` | 6e9f7ea7-251e-43b0-ba62-c5c5181ea990 |
| 4 | `materialId` | 物料ID | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 5 | `changeContent` | 变更内容 | `change_content` | String |
| 6 | `buyerRemark` | 采购商备注 | `buyer_remark` | String |
| 7 | `buyerAttachmentId` | 采购商附件 | `buyer_attachment_id` | String |
| 8 | `effectiveDate` | 生效时间 | `effective_date` | DateTime |
| 9 | `expiryDate` | 失效时间 | `expiry_date` | DateTime |
| 10 | `expectedChangeDate` | 预期变更日期 | `expected_change_date` | DateTime |
| 11 | `confirmChangeDate` | 确认变更日期 | `confirm_change_date` | DateTime |
| 12 | `beforeChange` | 变更前情况 | `before_change` | String |
| 13 | `afterChange` | 变更后情况 | `after_change` | String |
| 14 | `MaterialFreeCtId` | 物料自由项特征组ID | `suppliercn_b_free_ct_id` | 91fc5f62-1770-42de-9e98-29b0bf647f73 |
| 15 | `MaterialDefineCtId` | 物料自定义项特征ID | `suppliercn_b_define_ct_id` | 32bb9a84-8feb-493b-9d93-0bf9a1555d31 |
| 16 | `supplierRemark` | 供应商备注 | `supplier_remark` | String |
| 17 | `supplierAttachmentId` | 供应商附件 | `supplier_attachment_id` | String |
| 18 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 19 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 20 | `source` | 上游单据类型 | `source` | String |
| 21 | `upcode` | 上游单据号 | `upcode` | String |
| 22 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 23 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 24 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 25 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 27 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 28 | `dr` | 逻辑删除标记 | `dr` | Short |
| 29 | `pubts` | 时间戳 | `pubts` | DateTime |
| 30 | `rowCollabStatus` | 协同状态 | `row_collab_status` | Short |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `cnId` | 变更协同主表ID | `suchangeCollab.supplierCn.CpuSupplierCnVO` | None | true |
| 3 | `materialId` | 物料ID | `pc.product.Product` | Service |  |
| 4 | `MaterialDefineCtId` | 物料自定义项特征ID | `suchangeCollab.supplierCn.CpuSupplierCnBodyDefineCt` | None |  |
| 5 | `MaterialFreeCtId` | 物料自由项特征组ID | `suchangeCollab.supplierCn.CpuSupplierCnBodyFreeCt` | None |  |
