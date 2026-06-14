---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.reversal.ReversalLineDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 冲销单孙表 (`mr.reversal.ReversalLineDetail`)

> MR | 物理表：`mr_reversal_line_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 冲销单孙表 |
| 物理表 | `mr_reversal_line_detail` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:18:09.5050` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `docType` | 单据类型 | `doc_type` | String |
| 2 | `id` | ID | `id` | Long |
| 3 | `mdsId` | 主需求id | `mds_id` | 5034750c-e1cd-4580-8cf5-62d7f0609a45 |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `reversalLineId` | 子表id | `reversal_line_id` | d5035f8d-63f9-414b-b0fd-73e64f10527b |
| 6 | `reversalMainQty` | 主计量冲销数量 | `reversal_main_qty` | Decimal |
| 7 | `reversalQty` | 冲销数量 | `reversal_qty` | Decimal |
| 8 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 9 | `userDefineCharacter` | 自定义项实体 | `dct` | efa3102d-5978-4e15-b6d1-7780c77df6b5 |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `userDefineCharacter` | 自定义项实体 | `mr.reversal.ReversalLineDetailDCT` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `mdsId` | 主需求id | `mr.mds.MasterDemand` | None |  |
| 4 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 5 | `reversalLineId` | 子表id | `mr.reversal.ReversalLine` | None | true |
