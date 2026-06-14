---
tags: ["BIP", "元数据", "数据字典", "lawbid.clarifySet.ClarifySet"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 谈判设置 (`lawbid.clarifySet.ClarifySet`)

> **平台版本：BIP 旗舰版 V5**

>  模块 | 物理表：`cpu_bid_clarify_set`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 谈判设置 |
| 物理表 | `cpu_bid_clarify_set` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 19:56:48.5600` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-25 00:18:18:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 企业ID | `cpu-base.itf.IEnterprise` | 7 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | lawbidTenant租户相关 | `lawbid.itf.ITenant` | 2 |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidProjectCode` | 招标项目编码 | `bid_project_code` | String |
| 2 | `bidProjectId` | 招标项目 | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 3 | `bidSectionCode` | 标段(包)编码 | `bid_section_code` | String |
| 4 | `bidSectionId` | 标段id | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 5 | `billVersionId` | 版本id | `bill_version_id` | a3a5ef89-acd9-4d26-bfa0-f2828d18ef6b |
| 6 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `enterpriseId` | 租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 9 | `groupId` | 评标组 | `group_id` | Long |
| 10 | `id` | id | `id` | Long |
| 11 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `rankType` | 供应商排名展示方式 | `rank_type` | Integer |
| 14 | `rounds` | 谈判轮数 | `rounds` | Integer |
| 15 | `roundsStatus` | 轮次状态 | `rounds_status` | Integer |
| 16 | `sequence` | 每轮次数 | `sequence` | Integer |
| 17 | `sequenceStatus` | 次数状态 | `sequence_status` | Integer |
| 18 | `status` | 设置状态 | `status` | Integer |
| 19 | `tenantId` | tenant租户 | `tenant_id` | String |
| 20 | `ts` | 时间戳 | `ts` | DateTime |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billVersionId` | 版本id | `lawbid.billversion.BizBillVersion` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `enterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `bidProjectId` | 招标项目 | `lawbid.project.LawbidProject` | None |  |
| 5 | `bidSectionId` | 标段id | `lawbid.section.LawbidSection` | None |  |
