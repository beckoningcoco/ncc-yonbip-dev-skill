---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoringdata.CpuMark"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 汇总报价单主表 (`lawbid.scoringdata.CpuMark`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_mark`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 汇总报价单主表 |
| 物理表 | `cpu_mark` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:03.2320` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-01-23 23:56:24:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 审计信息 | `ucfbase.ucfbaseItf.IAuditInfo` | 192 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `enterpriseId` | 租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 3 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 4 | `scoringGroupId` | 评标组 | `scoring_group_id` | bd52c08b-9c24-45c6-b5ba-6209956c1411 |
| 5 | `bidProjectId` | 招标项目 | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 6 | `bidSectionId` | 标段(包) | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 7 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 8 | `stepSeq` | 当前分步开标阶段 | `step_seq` | Integer |
| 9 | `cpuMarkDefineCharacter` | 汇总报价单表头自定义项 | `define_character_id` | b6b83196-e380-44c9-bd62-09b0c080a04b |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 12 | `creator` | 创建人名称 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 13 | `modifier` | 修改人名称 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 15 | `dr` | 逻辑删除标记 | `dr` | Short |
| 16 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `materialList` | 汇总报价物料表体 | `` | 8c4341a0-e9a3-4c70-9df2-525171b82f42 |
| 19 | `scoringDataMarkList` | 汇总报价单供应商子表 | `` | d7ba184f-30df-4eb9-a0d9-91c375b93db8 |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | 创建人名称 | `base.user.BipUser` | Service |  |
| 2 | `scoringDataMarkList` | 汇总报价单供应商子表 | `lawbid.scoringdata.ScoringDataMark` | None | true |
| 3 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `modifier` | 修改人名称 | `base.user.BipUser` | Service |  |
| 6 | `materialList` | 汇总报价物料表体 | `lawbid.scoringdata.ScoringDataMarkMateriel` | None | true |
| 7 | `scoringGroupId` | 评标组 | `lawbid.scoringgroup.ScoringGroupVO` | None |  |
| 8 | `cpuMarkDefineCharacter` | 汇总报价单表头自定义项 | `lawbid.scoringdata.CpuMarkDefineCharacter` | None |  |
| 9 | `enterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 10 | `bidProjectId` | 招标项目 | `lawbid.project.LawbidProject` | None |  |
| 11 | `bidSectionId` | 标段(包) | `lawbid.section.LawbidSection` | None |  |
