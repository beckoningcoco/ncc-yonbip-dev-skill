---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.applicableobjecttemplate.ApplicableObjectDim"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 适用对象维度 (`QMSQIT.applicableobjecttemplate.ApplicableObjectDim`)

> QMSQIT | 物理表：`qms_qit_applicable_object_dim`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 适用对象维度 |
| 物理表 | `qms_qit_applicable_object_dim` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:53.6960` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dimType` | 维度类型 | `dim_type` | String |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `icolumn` | 字段 | `icolumn` | 1a5d304f-40a4-47a2-a075-f8b5ab6af37b |
| 4 | `icolumnCode` | 字段编码 | `icolumn_code` | String |
| 5 | `id` | ID | `id` | Long |
| 6 | `memo` | 备注 | `memo` | String |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `templateId` | 模版ID | `template_id` | 9cf5f5cd-70ea-4d73-bb89-e348a0630dc2 |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `icolumn` | 字段 | `base.character.Character` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `templateId` | 模版ID | `QMSQIT.applicableobjecttemplate.ApplicableObjectTemplate` | None | true |
