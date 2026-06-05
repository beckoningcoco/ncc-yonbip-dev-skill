---
tags: ["BIP", "元数据", "数据字典", "ED", "ed.routing.OperationSequence"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序序列 (`ed.routing.OperationSequence`)

> ED | 物理表：`ed_operation_sequence`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序序列 |
| 物理表 | `ed_operation_sequence` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 构建时间 | `2026-06-05 09:25:11.2750` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `defineCTS` | 工序序列自定义项 | `define_cts` | 2cef6ad8-f4ae-49c8-8ff6-7b12eb2dc661 |
| 2 | `description` | 序列描述 | `description` | String |
| 3 | `id` | ID | `id` | Long |
| 4 | `originalId` | 变更源 | `original_id` | Long |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `routingId` | 工艺路线ID | `routing_id` | 37955d3b-2143-4a4d-bdd5-0213a13394f5 |
| 7 | `rowno` | 序号 | `rowno` | Integer |
| 8 | `sequenceNum` | 工序序列 | `sequence_num` | Integer |
| 9 | `sequenceType` | 序列类型 | `sequence_type` | Integer |
| 10 | `srcOperationId` | 来源工序ID | `src_operation_id` | 4779185e-375a-4830-bc81-92255430924e |
| 11 | `targetOperationId` | 目标工序ID | `target_operation_id` | 4779185e-375a-4830-bc81-92255430924e |
| 12 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `defineCTS` | 工序序列自定义项 | `ed.routing.OperationSequenceDefineCharacter` | None |  |
| 2 | `routingId` | 工艺路线ID | `ed.routing.Routing` | None | true |
| 3 | `targetOperationId` | 目标工序ID | `ed.routing.RoutingOperation` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `srcOperationId` | 来源工序ID | `ed.routing.RoutingOperation` | None |  |
| 6 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
