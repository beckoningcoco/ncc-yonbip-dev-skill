---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.SubcontractProductConsult"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外产品协同信息 (`po.order.SubcontractProductConsult`)

> PO | 物理表：`po_order_subcontract_product_consult`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外产品协同信息 |
| 物理表 | `po_order_subcontract_product_consult` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:25:55.8490` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 8eadf170-a715-41e1-b654-51ef707f7e90 | 订单产品id |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `confirmAuxQuantity` | 确认件数 | `confirm_aux_qty` | Decimal |
| 2 | `confirmDeliveryDate` | 确认交期 | `confirm_delivery_date` | Date |
| 3 | `confirmPrice` | 确认未税单价 | `confirm_price` | Decimal |
| 4 | `confirmTaxPrice` | 确认含税单价 | `confirm_tax_price` | Decimal |
| 5 | `externalSystemAutoId` | 外部系统行id | `external_system_auto_id` | String |
| 6 | `id` | 订单产品id | `id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 7 | `purchaseRemark` | 买方备注 | `purchase_remark` | String |
| 8 | `requireSign` | 需要与签收方协同 | `require_sign` | Boolean |
| 9 | `saleRemark` | 卖方备注 | `sale_remark` | String |
| 10 | `signType` | 签收方 | `sign_type` | Integer |
| 11 | `signerEnterpriseId` | 签收方企业 | `signer_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 12 | `signerTenant` | 签收方租户 | `signer_tenant` | String |
| 13 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `id` | 订单产品id | `po.order.OrderProduct` | None | true |
| 3 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 4 | `signerEnterpriseId` | 签收方企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
