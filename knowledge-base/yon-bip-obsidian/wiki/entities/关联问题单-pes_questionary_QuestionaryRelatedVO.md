---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.questionary.QuestionaryRelatedVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 关联问题单 (`pes.questionary.QuestionaryRelatedVO`)

> IMP_PES | 物理表：`sms_questionary_related`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 关联问题单 |
| 物理表 | `sms_questionary_related` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:07.5680` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 关联问题单组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `questionaryRelatedId` | 问题单id | `quest_related_id` | eeb14336-53d4-43c2-8fec-54c61718e8aa |
| 3 | `description` | 关联原因 | `description` | String |
| 4 | `questionaryId` | 问题单id | `questionary_id` | eeb14336-53d4-43c2-8fec-54c61718e8aa |
| 5 | `id` | id | `id` | Long |
| 6 | `tenant` | 租户ID | `tenant_id` | String |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `questionaryRelatedId` | 问题单id | `pes.questionary.QuestionaryVO` | None |  |
| 3 | `questionaryId` | 问题单id | `pes.questionary.QuestionaryVO` | None | true |
| 4 | `orgId` | 关联问题单组织id | `org.func.BaseOrg` | Service |  |
