---
tags: ["BIP", "元数据", "数据字典", "PO", "PO.assistant.assistantTplChangeRecord"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 助手模板修改记录 (`PO.assistant.assistantTplChangeRecord`)

> PO | 物理表：`assistant_tpl_change_record`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 助手模板修改记录 |
| 物理表 | `assistant_tpl_change_record` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:32:53.1710` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenantId` | 租户ID | `tenant_id` | f656daea-8dfb-426b-820a-152686578ea3 |
| 3 | `id` | 主键 | `id` | Long |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `tplid` | 模板id | `tplId` | Long |
| 6 | `changeuserid` | 修改人id | `changeUserId` | Long |
| 7 | `changeusername` | 修改人名称 | `changeUserName` | String |
| 8 | `changetype` | 修改类型 | `changeType` | Integer |
| 9 | `latest` | 是否最新 | `latest` | Integer |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `tenantId` | 租户ID | `yht.tenant.YxyTenant` | Service |  |
| 2 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
