---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "lawbid.bidorder.BidOrderDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 畅捷支付订单明细子表 (`lawbid.bidorder.BidOrderDetail`)

> ycBusinessCenter | 物理表：`cpu_bid_order_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 畅捷支付订单明细子表 |
| 物理表 | `cpu_bid_order_detail` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:45.2210` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户ID | `buyer_tenant_id` | String |
| 2 | `chanpayTradeNo` | 畅捷支付单据流水号 | `chanpay_trade_no` | String |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `enterpriseId` | 租户主键 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 5 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 6 | `id` | ID | `id` | Long |
| 7 | `orderId` | 订单ID | `order_id` | 5e9f5c82-1e96-44c1-8081-4183576af71a |
| 8 | `outTradeNo` | 单据流水号 | `out_trade_no` | String |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 11 | `ytenant` | 租户ID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `orderId` | 订单ID | `lawbid.bidorder.BidOrder` | None | true |
| 2 | `ytenant` | 租户ID | `yht.tenant.YhtTenant` | Service |  |
| 3 | `enterpriseId` | 租户主键 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
