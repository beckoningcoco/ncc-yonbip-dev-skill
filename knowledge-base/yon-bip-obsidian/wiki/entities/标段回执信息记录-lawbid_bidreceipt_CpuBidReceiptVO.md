---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidreceipt.CpuBidReceiptVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 标段回执信息记录 (`lawbid.bidreceipt.CpuBidReceiptVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_receipt`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标段回执信息记录 |
| 物理表 | `cpu_bid_receipt` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:56.2060` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2025-10-24 23:57:23:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidProjectId` | 招标项目主键 | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 2 | `bidSectionId` | 标段（包）主键 | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 3 | `bidreceiptDetail` | 供应回执记录明细 | `` | 0011b64c-5ab2-432f-bc5b-5258b85ce5af |
| 4 | `billId` | 回执业务单据主键 | `bill_id` | Long |
| 5 | `billType` | 回执业务单据类型:变更公告/答疑澄清... | `bill_type` | String |
| 6 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 9 | `id` | ID | `id` | Long |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `bidreceiptDetail` | 供应回执记录明细 | `lawbid.bidreceipt.CpuBidReceiptDetailVO` | None | true |
| 3 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `bidProjectId` | 招标项目主键 | `lawbid.project.LawbidProject` | None |  |
| 5 | `bidSectionId` | 标段（包）主键 | `lawbid.section.LawbidSection` | None |  |
