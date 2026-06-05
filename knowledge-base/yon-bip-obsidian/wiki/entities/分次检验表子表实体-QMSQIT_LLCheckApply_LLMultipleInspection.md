---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.LLCheckApply.LLMultipleInspection"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 分次检验表子表实体 (`QMSQIT.LLCheckApply.LLMultipleInspection`)

> QMSQIT | 物理表：`qms_qit_llapply_multiple`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 分次检验表子表实体 |
| 物理表 | `qms_qit_llapply_multiple` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:41.9570` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `checkBill` | 检验单ID | `checkBill` | String |
| 2 | `checkCount` | 检验主数量 | `checkCount` | String |
| 3 | `checkNum` | 检验单号 | `checkNum` | String |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `id` | ID | `id` | String |
| 6 | `parent_id` | 来料检验申请ID | `parent_id` | 0eee67eb-f19b-41be-bd6c-2bb2c555d489 |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `tenant` | 租户ID | `tenant_id` | String |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `parent_id` | 来料检验申请ID | `QMSQIT.LLCheckApply.LLCheckApply` | None | true |
