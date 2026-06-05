---
tags: ["BIP", "元数据", "数据字典", "ED", "ed.mainformula.FormulaOperationDrawing"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序图纸 (`ed.mainformula.FormulaOperationDrawing`)

> ED | 物理表：`ed_route_operation_drawing`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序图纸 |
| 物理表 | `ed_route_operation_drawing` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 构建时间 | `2026-06-05 09:26:30.9580` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `attachmentId` | 附件 | `attachment_id` | String |
| 2 | `code` | 图纸编号 | `code` | String |
| 3 | `fileId` | 图纸文件ID | `file_id` | String |
| 4 | `id` | ID | `id` | Long |
| 5 | `name` | 图纸名称 | `name` | String |
| 6 | `operationId` | 标准工序 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 7 | `originalId` | 变更源 | `original_id` | Long |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `routingOperationId` | 工艺路线工序ID | `routingOperation_id` | e3ed947a-f5e9-45e7-86b9-a225e6cbfbfb |
| 10 | `rowno` | 序号 | `rowno` | Integer |
| 11 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `operationId` | 标准工序 | `ed.operation.Operation` | None |  |
| 3 | `routingOperationId` | 工艺路线工序ID | `ed.mainformula.FormulaOperation` | None | true |
| 4 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
