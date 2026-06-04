---
tags: ["BIP", "元数据", "数据字典", "lawbid.scoringroomresultapproval.ScoringGroupApproval"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评标结果审批单 (`lawbid.scoringroomresultapproval.ScoringGroupApproval`)

> **平台版本：BIP 旗舰版 V5**

>  模块 | 物理表：`cpu_scoring_group_approval`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评标结果审批单 |
| 物理表 | `cpu_scoring_group_approval` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 20:03:03.0220` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2025-01-17 23:15:15:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 4 | 审批流信息 | `base.itf.IApprovalFlow` | 134 |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `scoreGroupId` | 评标组 | `score_group_id` | c67f065b-c2cc-4b6b-ab41-acf2ba3956f2 |
| 4 | `mainOrgId` | 主组织 | `main_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 5 | `returncount` | 退回次数 | `returncount` | Short |
| 6 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 7 | `verifystate` | 审批状态 | `verifystate` | Short |
| 8 | `pubts` | 逻辑删除标记 | `pubts` | DateTime |
| 9 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 10 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 11 | `conclusionInfo` | 评标结果描述 | `conclusion_info` | String |
| 12 | `file` | 附件 | `file` | String |
| 13 | `gather` | 评标结果审批单汇总表 | `` | 88447bf9-f6cb-4b84-abc7-0a8dc0955804 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `mainOrgId` | 主组织 | `org.func.BaseOrg` | Service |  |
| 2 | `scoreGroupId` | 评标组 | `lawbid.scoringroomresult.ScoringGroupVO` | None |  |
| 3 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | Service |  |
| 4 | `gather` | 评标结果审批单汇总表 | `lawbid.scoringroomresultapproval.ScoringRoomGatherApproval` | None | true |
