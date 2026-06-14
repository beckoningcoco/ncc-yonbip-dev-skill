---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.project.LawbidProjectSection"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 招标项目标段信息 (`lawbid.project.LawbidProjectSection`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_project_section_record`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 招标项目标段信息 |
| 物理表 | `cpu_project_section_record` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:32.0940` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键ID |

## 部署信息

- 部署时间: 2025-10-24 23:57:50:000

## 依赖接口（6个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 项目标段接口 | `project.itf.IProjectSection` | 74 |
| 6 | lawbidTenant租户相关 | `lawbid.itf.ITenant` | 2 |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidProjectId` | 招标项目ID | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 2 | `tenantId` | tenant租户 | `tenant_id` | String |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 6 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 7 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 10 | `id` | 主键ID | `id` | Long |
| 11 | `bidSectionId` | 标段ID | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 3 | `bidProjectId` | 招标项目ID | `lawbid.project.LawbidProject` | None | true |
| 4 | `bidSectionId` | 标段ID | `lawbid.section.LawbidSection` | None |  |
