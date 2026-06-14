---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.incominspectorder.qms_qit_incominspectorder_simple"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验单样本号子表 (`QMSQIT.incominspectorder.qms_qit_incominspectorder_simple`)

> QMSQIT | 物理表：`qms_qit_incom_simple`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验单样本号子表 |
| 物理表 | `qms_qit_incom_simple` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:07.1080` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `id` | ID | `id` | String |
| 3 | `pk_inspectorder_h` | 检验单id | `pk_inspectorder_h` | d4ef5893-2422-4c08-8e7e-df2087db7a8f |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `sample_code` | 样本号 | `sample_code` | String |
| 6 | `tenant` | 租户ID | `tenant_id` | String |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `pk_inspectorder_h` | 检验单id | `QMSQIT.incominspectorder.qms_qit_incominspectorder_h` | None | true |
