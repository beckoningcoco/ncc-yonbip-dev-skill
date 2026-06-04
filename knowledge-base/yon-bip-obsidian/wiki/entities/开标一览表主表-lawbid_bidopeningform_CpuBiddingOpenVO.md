---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidopeningform.CpuBiddingOpenVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 开标一览表主表 (`lawbid.bidopeningform.CpuBiddingOpenVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bidding_open`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开标一览表主表 |
| 物理表 | `cpu_bidding_open` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:43.8080` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 开标一览表主实体ID |

## 部署信息

- 部署时间: 2025-10-24 23:57:22:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 2 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 6 | `id` | 开标一览表主实体ID | `id` | Long |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `bidProjectId` | 招标项目ID | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 9 | `bidSectionId` | 标段包ID | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 10 | `materialList` | 开标一览表物料表 | `` | 32b5ce32-971d-48be-a8ca-21cf5dad0c12 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `materialList` | 开标一览表物料表 | `lawbid.bidopeningform.CpuBiddingOpenMaterialVO` | None | true |
| 4 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `bidProjectId` | 招标项目ID | `lawbid.project.LawbidProject` | None |  |
| 6 | `bidSectionId` | 标段包ID | `lawbid.section.LawbidSection` | None |  |
