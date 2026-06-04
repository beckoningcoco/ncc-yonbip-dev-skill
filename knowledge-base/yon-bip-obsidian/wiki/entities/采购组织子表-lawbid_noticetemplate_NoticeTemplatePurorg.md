---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.noticetemplate.NoticeTemplatePurorg"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购组织子表 (`lawbid.noticetemplate.NoticeTemplatePurorg`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_notice_template_purorg`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购组织子表 |
| 物理表 | `cpu_notice_template_purorg` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:16:41.4800` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2025-10-24 23:57:31:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `templateId` | 模板 | `template_id` | 8fb3205e-7cd6-462c-ab06-d3d4f5f897ea |
| 3 | `purOrgId` | 适用采购组织 | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 适用采购组织 | `org.func.BaseOrg` | Service |  |
| 2 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | Service |  |
| 3 | `templateId` | 模板 | `lawbid.noticetemplate.NoticeTemplate` | None | true |
