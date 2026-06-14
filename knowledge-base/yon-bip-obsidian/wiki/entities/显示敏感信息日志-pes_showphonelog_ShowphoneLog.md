---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.showphonelog.ShowphoneLog"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 显示敏感信息日志 (`pes.showphonelog.ShowphoneLog`)

> IMP_PES | 物理表：`imp_pes_showphone_log`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 显示敏感信息日志 |
| 物理表 | `imp_pes_showphone_log` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:21.2400` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `creationtime` | 创建时间 | `creationtime` | DateTime |
| 2 | `creator` | 创建人 | `creator` | String |
| 3 | `id` | ID | `id` | Long |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `requestIp` | 请求IP | `request_ip` | String |
| 6 | `requestTag` | Tags | `request_tag` | String |
| 7 | `sensitiveinformationType` | 敏感信息类型 | `sensitiveinformation_type` | String |
| 8 | `userId` | 用户ID | `user_id` | String |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
