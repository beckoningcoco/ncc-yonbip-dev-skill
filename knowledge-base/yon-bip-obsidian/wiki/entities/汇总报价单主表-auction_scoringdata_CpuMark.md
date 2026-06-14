---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.scoringdata.CpuMark"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 汇总报价单主表 (`auction.scoringdata.CpuMark`)

> ycSouringAuction | 物理表：`cpu_mark`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 汇总报价单主表 |
| 物理表 | `cpu_mark` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:24:35.0360` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidProjectId` | 招标项目 | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 2 | `bidSectionId` | 标段(包) | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 3 | `cpuMarkDefineCharacter` | 汇总报价单表头自定义项 | `define_character_id` | 0799d7c3-5d64-40d6-a3f5-68a3fc813586 |
| 4 | `enterpriseId` | 租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 5 | `id` | id | `id` | Long |
| 6 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 7 | `stepSeq` | 当前分步开标阶段 | `step_seq` | Integer |
| 8 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `createDate` | 创建日期 | `create_date` | Date |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 15 | `creator` | 创建人名称 | `creator` | String |
| 16 | `modifier` | 修改人名称 | `modifier` | String |
| 17 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `materialList` | 供应商报价明细 | `` | 2200f5c0-cb73-44cf-a8f0-6e67980e5793 |
| 22 | `scoringDataMarkList` | 投标供应商 | `` | b1392faa-f850-4468-b4b3-d7f1f85fc4b4 |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `scoringDataMarkList` | 投标供应商 | `auction.scoringdata.ScoringDataMark` | None | true |
| 2 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `materialList` | 供应商报价明细 | `auction.scoringdata.ScoringDataMarkMateriel` | None | true |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `cpuMarkDefineCharacter` | 汇总报价单表头自定义项 | `auction.scoringdata.CpuMarkDefineCharacter` | None |  |
| 8 | `enterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 9 | `bidProjectId` | 招标项目 | `auction.project.AuctionProject` | None |  |
| 10 | `bidSectionId` | 标段(包) | `auction.project.AuctionSection` | None |  |
