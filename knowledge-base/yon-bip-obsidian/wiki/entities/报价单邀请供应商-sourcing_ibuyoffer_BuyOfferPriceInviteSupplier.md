---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.BuyOfferPriceInviteSupplier"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 报价单邀请供应商 (`sourcing.ibuyoffer.BuyOfferPriceInviteSupplier`)

> ycSouringInquiry | 物理表：`cpu_buyoffer_supply`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报价单邀请供应商 |
| 物理表 | `cpu_buyoffer_supply` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:06:21.0840` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `buyofferId` | 询价单id | `buyoffer_id` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 |
| 3 | `supplyId` | 供应商租户id | `supply_id` | Long |
| 4 | `supplydocId` | 供应商档案id | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 5 | `supplyName` | 供应商名称 | `supply_name` | String |
| 6 | `supplyCode` | 供应商编码 | `supply_code` | String |
| 7 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 8 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 9 | `createPin` | 创建人 | `create_pin` | String |
| 10 | `updatePin` | 修改人 | `update_pin` | String |
| 11 | `sysVersion` | 系统版本 | `sys_version` | Integer |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime |
| 13 | `updateTime` | 修改时间 | `update_time` | DateTime |
| 14 | `modifiedtime` | 最近修改时间 | `modifiedtime` | DateTime |
| 15 | `creator` | 创建人 | `creator` | String |
| 16 | `modifier` | 更新人 | `modifier` | String |
| 17 | `phonenumber` | 供应商电话 | `phonenumber` | String |
| 18 | `supplyType` | 供应商类型 | `supply_type` | Integer |
| 19 | `dr` | 逻辑删除标识 | `dr` | Integer |
| 20 | `remark` | 备注 | `remark` | String |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 22 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 23 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `buyofferId` | 询价单id | `sourcing.ibuyoffer.BuyOfferVO` | None |  |
| 2 | `supplydocId` | 供应商档案id | `aa.vendor.Vendor` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
