---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.originalrecord.OriginalRecordInspectMethod"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 原始记录检测方法 (`QMSQIT.originalrecord.OriginalRecordInspectMethod`)

> QMSQIT | 物理表：`qms_qit_originalrecord_inspectmethod`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 原始记录检测方法 |
| 物理表 | `qms_qit_originalrecord_inspectmethod` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:21.0350` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | 主键 | `id` | Long |
| 3 | `originalRecordId` | 原始记录id | `originalrecord_id` | d380185e-d5f5-439c-8c3e-e88eb07140fd |
| 4 | `lineNo` | 行号 | `line_no` | Integer |
| 5 | `inspectMethodId` | 检测方法id | `inspect_method_id` | 90d44bff-eef4-4fd8-a0c1-8ce14fbab951 |
| 6 | `definect_method` | 检测方法自定义项特征 | `definect_method` | 0681792f-9ce9-42a1-88c2-5a2244ab7f00 |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `inspectMethodId` | 检测方法id | `QMSDFM.detectionMethod.QmsDfmDetectionMethod` | Service |  |
| 2 | `originalRecordId` | 原始记录id | `QMSQIT.originalrecord.OriginalRecordHead` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `definect_method` | 检测方法自定义项特征 | `QMSQIT.originalrecord.OriginalRecordMethodDefineCharacter` | None |  |
