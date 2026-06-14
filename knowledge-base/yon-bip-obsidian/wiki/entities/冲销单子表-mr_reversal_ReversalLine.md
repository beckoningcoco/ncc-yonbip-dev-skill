---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.reversal.ReversalLine"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 冲销单子表 (`mr.reversal.ReversalLine`)

> MR | 物理表：`mr_reversal_line`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 冲销单子表 |
| 物理表 | `mr_reversal_line` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:47.9740` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `docType` | 单据类型 | `doc_type` | String |
| 2 | `id` | ID | `id` | Long |
| 3 | `mdsId` | 主需求id | `mds_id` | 5034750c-e1cd-4580-8cf5-62d7f0609a45 |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `reversalId` | 主表id | `reversal_id` | 61a864ab-64a8-4991-ae78-130c9042f96c |
| 6 | `reversalLineDetail` | 冲销单孙表 | `` | 3d2a617d-b7cf-4912-8354-70fbe7c0453e |
| 7 | `reversalMainQty` | 主计量冲销数量 | `reversal_main_qty` | Decimal |
| 8 | `reversalQty` | 冲销数量 | `reversal_qty` | Decimal |
| 9 | `reversalSetsQty` | 冲销套数 | `reversal_sets_qty` | Decimal |
| 10 | `reversalType` | 冲销类型 | `reversal_type` | String |
| 11 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 12 | `userDefineCharacter` | 自定义项实体 | `dct` | ec7c0317-be4a-4715-b8b6-2e53676ddc7a |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `userDefineCharacter` | 自定义项实体 | `mr.reversal.ReversalLineDCT` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `reversalId` | 主表id | `mr.reversal.Reversal` | None | true |
| 4 | `mdsId` | 主需求id | `mr.mds.MasterDemand` | None |  |
| 5 | `reversalLineDetail` | 冲销单孙表 | `mr.reversal.ReversalLineDetail` | None | true |
| 6 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
