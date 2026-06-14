---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.calldocument.CallBidPaymentMethod"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 标书缴纳方式 (`lawbid.calldocument.CallBidPaymentMethod`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_payment_method`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标书缴纳方式 |
| 物理表 | `cpu_bid_payment_method` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:14:33.4340` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2025-10-24 23:57:52:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidPaymentId` | 标书费缴纳方式 | `bid_payment_id` | c88936ac-b4d4-4f31-b90e-eca5f8037e4b |
| 2 | `bidPaymentCode` | 标书费缴纳方式 | `bid_payment_code` | String |
| 3 | `bidSectionId` | 标段ID | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 4 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 5 | `callBidDocumentSectionId` | 招标文件子表 | `call_bid_document_section_id` | c5e9e2bd-4010-4ba3-9d39-10172dc5bf8f |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `id` | ID | `id` | Long |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `callBidDocumentSectionId` | 招标文件子表 | `lawbid.calldocument.CallBidDocumentSection` | None | true |
| 3 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `bidPaymentId` | 标书费缴纳方式 | `ewallet.config.PayType` | Service |  |
| 5 | `bidSectionId` | 标段ID | `lawbid.section.LawbidSection` | None |  |
