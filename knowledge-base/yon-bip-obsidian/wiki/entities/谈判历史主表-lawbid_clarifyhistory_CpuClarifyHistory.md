---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.clarifyhistory.CpuClarifyHistory"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 谈判历史主表 (`lawbid.clarifyhistory.CpuClarifyHistory`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_clarify_history`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 谈判历史主表 |
| 物理表 | `cpu_clarify_history` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:49.9250` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2026-05-22 22:09:33:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `bidProjectId` | 采购项目标识 | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 3 | `bidSectionId` | 标段（包）id | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 4 | `bidClarifyId` | 谈判单标识 | `bid_clarify_id` | d318ae13-0f72-4ceb-84dc-25c79f08b220 |
| 5 | `scoringGroupId` | 评标组标识 | `scoring_group_id` | bd52c08b-9c24-45c6-b5ba-6209956c1411 |
| 6 | `ytenantId` | 租户id | `ytenant_id` | String |
| 7 | `buyerTenantId` | 采购商租户id | `buyer_tenant_id` | String |
| 8 | `enterpriseId` | 采购商企业id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 9 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 10 | `createDate` | 创建日期 | `create_date` | DateTime |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `creator` | 创建人名称 | `creator` | String |
| 13 | `creatorId` | 创建人 | `creatorId` | String |
| 14 | `detailList` | 谈判历史明细子表 | `` | f484cc25-62d2-4411-ab7a-eb1da5838d28 |
| 15 | `dr` | 逻辑删除标记 | `dr` | Short |
| 16 | `modifier` | 修改人名称 | `modifier` | String |
| 17 | `modifierId` | 修改人 | `modifierId` | String |
| 18 | `modifyDate` | 修改日期 | `modify_date` | DateTime |
| 19 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidClarifyId` | 谈判单标识 | `lawbid.talks.BidClarifyVO` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `detailList` | 谈判历史明细子表 | `lawbid.clarifyhistory.CpuClarifyHistoryDetail` | None | true |
| 4 | `scoringGroupId` | 评标组标识 | `lawbid.scoringgroup.ScoringGroupVO` | None |  |
| 5 | `enterpriseId` | 采购商企业id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `bidProjectId` | 采购项目标识 | `lawbid.project.LawbidProject` | None |  |
| 7 | `bidSectionId` | 标段（包）id | `lawbid.section.LawbidSection` | None |  |
