---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "saleauction.bid.BiddingFee"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商缴费信息 (`saleauction.bid.BiddingFee`)

> ycBusinessCenter | 物理表：`cpu_bidding_fee`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商缴费信息 |
| 物理表 | `cpu_bidding_fee` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:48.1350` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | af94c771-f926-452b-8760-f06c22b53d8f | 平行表主键 |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 平行表主键 | `id` | af94c771-f926-452b-8760-f06c22b53d8f |
| 2 | `bondFeeId` | 缴费单 | `bond_fee_id` | 4e17edaa-83d2-44c6-bb42-7e2c52098b9e |
| 3 | `bondFeeDetailId` | 缴费单明细 | `bond_fee_detail_id` | a8440690-f179-4a0b-80cb-8353524eb941 |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 7 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bondFeeDetailId` | 缴费单明细 | `ewallet.suppliertransapply.SupplierTransApplyDetail` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `id` | 平行表主键 | `saleauction.bid.BiddingVO` | None | true |
| 4 | `bondFeeId` | 缴费单 | `ewallet.suppliertransapply.SupplierTransApply` | Service |  |
