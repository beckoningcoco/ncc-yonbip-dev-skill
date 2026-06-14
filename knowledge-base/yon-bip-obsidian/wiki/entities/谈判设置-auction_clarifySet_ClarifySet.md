---
tags: ["BIP", "元数据", "数据字典", "auction.clarifySet.ClarifySet"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 谈判设置 (`auction.clarifySet.ClarifySet`)

>  | 物理表：`cpu_bid_clarify_set`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 谈判设置 |
| 物理表 | `cpu_bid_clarify_set` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 23:25:04.0830` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `roundsStatus` | 谈判轮次 | `rounds_status` | Integer |
| 2 | `rounds` | 轮次 | `rounds` | Integer |
| 3 | `sequenceStatus` | 谈判次数 | `sequence_status` | Integer |
| 4 | `sequence` | 次数 | `sequence` | Integer |
| 5 | `rankType` | 展示供应商排名 | `rank_type` | Integer |
| 6 | `status` | 设置状态 | `status` | Integer |
| 7 | `id` | id | `id` | Long |
| 8 | `bidSectionId` | 标段id | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 9 | `bidSectionCode` | 标段(包)编码 | `bid_section_code` | String |
| 10 | `bidProjectId` | 招标项目 | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 11 | `bidProjectCode` | 招标项目编码 | `bid_project_code` | String |
| 12 | `groupId` | 评标组 | `group_id` | Long |
| 13 | `enterpriseId` | 租户主键 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 14 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 15 | `dr` | 逻辑删除标记 | `dr` | Short |
| 16 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `tenantId` | tenant租户 | `tenant_id` | String |
| 19 | `ts` | 时间戳 | `ts` | DateTime |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `enterpriseId` | 租户主键 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 3 | `bidProjectId` | 招标项目 | `auction.project.AuctionProject` | None |  |
| 4 | `bidSectionId` | 标段id | `auction.project.AuctionSection` | None |  |
