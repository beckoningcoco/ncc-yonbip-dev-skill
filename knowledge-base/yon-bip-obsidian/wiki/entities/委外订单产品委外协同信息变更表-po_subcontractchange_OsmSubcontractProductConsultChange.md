---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractchange.OsmSubcontractProductConsultChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单产品委外协同信息变更表 (`po.subcontractchange.OsmSubcontractProductConsultChange`)

> OSM | 物理表：`osm_product_subcontract_consult_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单产品委外协同信息变更表 |
| 物理表 | `osm_product_subcontract_consult_change` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:58:25.2940` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 874c6c6f-0c0e-4582-800e-77098c273c53 | id |

---

## 直接属性（16个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `confirmAuxQuantity` | 确认件数 | `confirm_aux_qty` | Decimal |
| 2 | `confirmDeliveryDate` | 确认交期 | `confirm_delivery_date` | Date |
| 3 | `confirmPrice` | 确认未税单价 | `confirm_price` | Decimal |
| 4 | `confirmTaxPrice` | 确认含税单价 | `confirm_tax_price` | Decimal |
| 5 | `externalSystemAutoId` | 外部系统行id | `external_system_auto_id` | String |
| 6 | `id` | id | `id` | 874c6c6f-0c0e-4582-800e-77098c273c53 |
| 7 | `originalOrderId` | 原单id | `original_order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 8 | `originalOrderProductId` | 原单产品id | `original_subcontract_product_id` | 095522af-b597-4311-a113-8a0cf55f3dfe |
| 9 | `purchaseRemark` | 买方备注 | `purchase_remark` | String |
| 10 | `requireSign` | 需要与签收方协同 | `require_sign` | Boolean |
| 11 | `saleRemark` | 卖方备注 | `sale_remark` | String |
| 12 | `signType` | 签收方 | `sign_type` | Integer |
| 13 | `signerEnterpriseId` | 签收方企业 | `signer_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 14 | `signerTenant` | 签收方租户 | `signer_tenant` | String |
| 15 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 16 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `originalOrderProductId` | 原单产品id | `po.order.SubcontractProductConsult` | None |  |
| 2 | `originalOrderId` | 原单id | `po.order.Order` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `id` | id | `po.subcontractchange.OsmOrderProductChange` | None | true |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 6 | `signerEnterpriseId` | 签收方企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
