---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractchange.OsmSubcontractConsultChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单委外协同信息变更 (`po.subcontractchange.OsmSubcontractConsultChange`)

> OSM | 物理表：`osm_order_subcontract_consult_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单委外协同信息变更 |
| 物理表 | `osm_order_subcontract_consult_change` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:56:21.0310` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | dadfc2eb-7638-4b21-95b9-e274fb4fe84d | 生产订单id |

---

## 直接属性（49个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `consultProcess` | 协同订单流程 | `consult_process` | Integer |
| 2 | `requireConsult` | 需要与委外商协同 | `require_consult` | Boolean |
| 3 | `purchaseRemark` | 买方备注 | `purchase_remark` | String |
| 4 | `saleRemark` | 卖方备注 | `sale_remark` | String |
| 5 | `consultMode` | 协同方式 | `consult_mode` | Integer |
| 6 | `saleConfirmTime` | 卖方确认时间 | `sale_confirm_time` | DateTime |
| 7 | `eventCoordStatus` | 协同订单同步状态 | `event_coord_status` | Integer |
| 8 | `publishPerson` | 发布人 | `publish_person` | String |
| 9 | `allowConfirmPrice` | 允许确认价格 | `allow_confirm_price` | Boolean |
| 10 | `originalOrderId` | 原单id | `original_order_id` | c49e19e4-d9f7-4def-85bd-368a1bda207c |
| 11 | `vendorEnterpriseId` | 委外商企业 | `vendor_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 12 | `consultFlag` | 协同订单 | `consult_flag` | Integer |
| 13 | `externalSystemId` | 外部系统主表ID | `external_system_id` | String |
| 14 | `eventErrorMessage` | 协同订单失败信息 | `event_error_message` | String |
| 15 | `id` | 生产订单id | `id` | dadfc2eb-7638-4b21-95b9-e274fb4fe84d |
| 16 | `buyerConfirmerName` | 代确认人姓名 | `buyer_confirmer_name` | String |
| 17 | `orderTitle` | 订单标题 | `order_title` | String |
| 18 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 19 | `publishTime` | 发布时间 | `publish_time` | DateTime |
| 20 | `saleRejectReason` | 卖方拒绝理由 | `sale_reject_reason` | String |
| 21 | `salePersonContact` | 卖方确认人联系方式 | `sale_person_contact` | String |
| 22 | `vendorAttachment` | 委外商附件 | `vendor_attachment` | String |
| 23 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 24 | `requireConfirm` | 需要委外商确认 | `require_confirm` | Boolean |
| 25 | `buyerConfirmerTime` | 代确认时间 | `buyer_confirmer_time` | DateTime |
| 26 | `allowConfirmQty` | 允许确认数量 | `allow_confirm_qty` | Boolean |
| 27 | `salePerson` | 卖方确认人 | `sale_person` | String |
| 28 | `purchasePersonContact` | 买方确认人联系方式 | `purchase_person_contact` | String |
| 29 | `purchasePerson` | 买方确认人 | `purchase_person` | String |
| 30 | `purchaseConfirmTime` | 买方确认时间 | `purchase_confirm_time` | DateTime |
| 31 | `vendorTenant` | 委外商租户 | `vendor_tenant` | String |
| 32 | `consultStatus` | 订单协同状态 | `consult_status` | Integer |
| 33 | `foreignAttachment` | 对外附件 | `foreign_attachment` | String |
| 34 | `consultProcessPoint` | 订单协同流程 | `consult_process_point` | Integer |
| 35 | `consultStatusChange` | (变更)订单协同状态 | `consult_status_change` | Integer |
| 36 | `eventCpuError` | 供应商事件失败信息 | `event_cpu_error` | String |
| 37 | `eventCpuStatus` | 供应商事件状态 | `event_cpu_status` | Integer |
| 38 | `foreignAttachmentChange` | (变更)对外附件 | `foreign_attachment_change` | String |
| 39 | `publishPersonChange` | (变更)发布人 | `publish_person_change` | String |
| 40 | `publishTimeChange` | (变更)发布时间 | `publish_time_change` | DateTime |
| 41 | `publishUserId` | (变更)发布人id | `publish_user_id` | Long |
| 42 | `requireConfirmChange` | (变更)需要委外商确认 | `require_confirm_change` | Short |
| 43 | `requireConsultChange` | (变更)需要与委外商协同 | `require_consult_change` | Short |
| 44 | `saleConfirmTimeChange` | (变更)卖方确认时间 | `sale_confirm_time_change` | DateTime |
| 45 | `salePersonChange` | (变更)卖方确认人 | `sale_person_change` | String |
| 46 | `salePersonContactChange` | (变更)卖方确认人联系方式 | `sale_person_contact_change` | String |
| 47 | `saleRejectReasonChange` | (变更)卖方拒绝理由 | `sale_reject_reason_change` | String |
| 48 | `saleRemarkChange` | (变更)卖方备注 | `sale_remark_change` | String |
| 49 | `vendorAttachmentChange` | (变更)委外商附件 | `vendor_attachment_change` | String |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `originalOrderId` | 原单id | `po.order.SubcontractConsult` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `vendorEnterpriseId` | 委外商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `id` | 生产订单id | `po.subcontractchange.OsmOrderChange` | None | true |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
