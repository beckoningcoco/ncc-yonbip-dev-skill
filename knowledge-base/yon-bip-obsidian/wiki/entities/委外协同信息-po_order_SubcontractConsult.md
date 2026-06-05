---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.SubcontractConsult"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外协同信息 (`po.order.SubcontractConsult`)

> PO | 物理表：`po_order_subcontract_consult`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外协同信息 |
| 物理表 | `po_order_subcontract_consult` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:23:30.1920` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | b80026c8-0517-4255-aca1-b7f374771eb6 | 生产订单id |

---

## 直接属性（35个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `allowConfirmPrice` | 允许确认价格 | `allow_confirm_price` | Boolean |
| 2 | `allowConfirmQty` | 允许确认数量 | `allow_confirm_qty` | Boolean |
| 3 | `buyerConfirmerName` | 代确认人姓名 | `buyer_confirmer_name` | String |
| 4 | `buyerConfirmerTime` | 代确认时间 | `buyer_confirmer_time` | DateTime |
| 5 | `consultFlag` | 协同订单 | `consult_flag` | Integer |
| 6 | `consultMode` | 协同方式 | `consult_mode` | Integer |
| 7 | `consultProcess` | 订单集成流程 | `consult_process` | Integer |
| 8 | `consultProcessPoint` | 订单协同流程 | `consult_process_point` | Integer |
| 9 | `consultStatus` | 订单协同状态 | `consult_status` | Integer |
| 10 | `eventCoordStatus` | 协同订单同步状态 | `event_coord_status` | Integer |
| 11 | `eventCpuError` | 供应商事件失败信息 | `event_cpu_error` | String |
| 12 | `eventCpuStatus` | 供应商事件状态 | `event_cpu_status` | Integer |
| 13 | `eventErrorMessage` | 协同订单失败信息 | `event_error_message` | String |
| 14 | `externalSystemId` | 外部系统主表ID | `external_system_id` | String |
| 15 | `foreignAttachment` | 对外附件 | `foreign_attachment` | String |
| 16 | `id` | 生产订单id | `id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 17 | `orderTitle` | 订单标题 | `order_title` | String |
| 18 | `publishPerson` | 发布人 | `publish_person` | String |
| 19 | `publishTime` | 发布时间 | `publish_time` | DateTime |
| 20 | `purchaseConfirmTime` | 买方确认时间 | `purchase_confirm_time` | DateTime |
| 21 | `purchasePerson` | 买方确认人 | `purchase_person` | String |
| 22 | `purchasePersonContact` | 买方确认人联系方式 | `purchase_person_contact` | String |
| 23 | `purchaseRemark` | 买方备注 | `purchase_remark` | String |
| 24 | `requireConfirm` | 需要委外商确认 | `require_confirm` | Boolean |
| 25 | `requireConsult` | 需要与委外商协同 | `require_consult` | Boolean |
| 26 | `saleConfirmTime` | 卖方确认时间 | `sale_confirm_time` | DateTime |
| 27 | `salePerson` | 卖方确认人 | `sale_person` | String |
| 28 | `salePersonContact` | 卖方确认人联系方式 | `sale_person_contact` | String |
| 29 | `saleRejectReason` | 卖方拒绝理由 | `sale_reject_reason` | String |
| 30 | `saleRemark` | 卖方备注 | `sale_remark` | String |
| 31 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 32 | `vendorAttachment` | 委外商附件 | `vendor_attachment` | String |
| 33 | `vendorEnterpriseId` | 委外商企业 | `vendor_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 34 | `vendorTenant` | 委外商租户 | `vendor_tenant` | String |
| 35 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `vendorEnterpriseId` | 委外商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 3 | `id` | 生产订单id | `po.order.Order` | None | true |
| 4 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
