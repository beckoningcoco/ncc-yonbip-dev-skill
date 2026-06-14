---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidratedoc.CpuBidRateDoc"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 招标汇率主表 (`lawbid.bidratedoc.CpuBidRateDoc`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_rate_doc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 招标汇率主表 |
| 物理表 | `cpu_bid_rate_doc` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:48.3960` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-05-22 22:09:33:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `sectionCode` | 标段编号 | `section_code` | String |
| 2 | `sectionName` | 标段名称 | `section_name` | String |
| 3 | `multipleCurrentStage` | 阶段 | `multiple_current_stage` | Integer |
| 4 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `id` | id | `id` | Long |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `rateDocDetailList` | 招标汇率子表 | `` | 540f3f67-00c2-4c91-8b3d-d77426867365 |
| 9 | `sectionId` | 标段ID | `section_id` | ecfe849d-8880-4a81-ac60-5318b0a7915b |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `rateDocDetailList` | 招标汇率子表 | `lawbid.bidratedoc.CpuBidRateDocDetail` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `sectionId` | 标段ID | `lawbid.project.LawbidProjectSection` | None |  |
