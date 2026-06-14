---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.saleorder.SaleOrderDetailHealthVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售订单医疗子表 (`cpu-order.saleorder.SaleOrderDetailHealthVO`)

> ycSaleCoor | 物理表：`cpu_sale_order_detail_health`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售订单医疗子表 |
| 物理表 | `cpu_sale_order_detail_health` |
| domain/服务域 | `cpu-order` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:51.0690` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（16个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 2 | `pubts` | 时间戳 | `ts` | DateTime |
| 3 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 4 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 5 | `auditUserId` | 审批人 | `audit_user_id` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 6 | `commonName` | 通用名 | `common_name` | String |
| 7 | `cpuSaleOrderDetailId` | 销售订单子表ID | `cpu_sale_order_detail_id` | 5fb7781a-74b1-4980-8261-0a9878c38f7b |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime |
| 9 | `createUserId` | 创建人 | `create_user_id` | Long |
| 10 | `dr` | 删除标识 | `dr` | Integer |
| 11 | `erpCode` | 院内编号 | `erp_code` | String |
| 12 | `id` | ID | `id` | Long |
| 13 | `transparentPurchaseNo` | 阳光采购号 | `transparent_purchase_no` | String |
| 14 | `ts` | 时间戳 | `ts` | DateTime |
| 15 | `updateTime` | 更新时间 | `update_time` | DateTime |
| 16 | `updateUserId` | 更新人 | `update_user_id` | Long |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `cpuSaleOrderDetailId` | 销售订单子表ID | `cpu-order.saleorder.SaleOrderDetailVO` | None | true |
| 2 | `auditUserId` | 审批人 | `cpu-privilege.user.MgrUser` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
