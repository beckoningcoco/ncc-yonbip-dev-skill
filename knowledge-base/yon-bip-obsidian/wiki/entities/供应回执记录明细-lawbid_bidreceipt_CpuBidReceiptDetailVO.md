---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidreceipt.CpuBidReceiptDetailVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应回执记录明细 (`lawbid.bidreceipt.CpuBidReceiptDetailVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_receipt_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应回执记录明细 |
| 物理表 | `cpu_bid_receipt_detail` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:43.0870` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2025-10-24 23:57:23:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 4 | 跨租户供应商租户接口 | `cpu.itf.IVendorTenant` | 14 |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `checkReceiptTime` | 查看回执时间 | `check_receipt_time` | DateTime |
| 3 | `checkStatus` | 是否查看回执,1:是,0:否 | `check_status` | Integer |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 6 | `id` | ID | `id` | Long |
| 7 | `linkman` | 联系人 | `linkman` | String |
| 8 | `linkmanMail` | 联系人邮箱 | `linkman_mail` | String |
| 9 | `linkmanTel` | 联系方式 | `linkman_tel` | String |
| 10 | `linkmanUserId` | 联系人 | `linkman_user_id` | String |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `receiptId` | 标段回执信息记录主表主键 | `receipt_id` | 4a8d4274-2564-407e-804d-816b3cabbbe3 |
| 13 | `supplydocId` | 供应商档案 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 14 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplydocId` | 供应商档案 | `aa.vendor.Vendor` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `receiptId` | 标段回执信息记录主表主键 | `lawbid.bidreceipt.CpuBidReceiptVO` | None | true |
