---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.incominspectorder.qms_qit_incom_bad_items_detailresult_all"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 表头处理结果明细不良项目详情 (`QMSQIT.incominspectorder.qms_qit_incom_bad_items_detailresult_all`)

> QMSQIT | 物理表：`qms_qit_incom_bad_items`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 表头处理结果明细不良项目详情 |
| 物理表 | `qms_qit_incom_bad_items` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:45:34.1000` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `badItemsCode` | 代码 | `bad_Items_code` | String |
| 2 | `badItemsId` | 不良项目id | `bad_items_id` | 3de0c23e-ee02-46b4-bae7-0a982de498ce |
| 3 | `badItemsName` | 名称 | `bad_Items_name` | String |
| 4 | `badItemsVnote` | 备注 | `bad_Items_vnote` | String |
| 5 | `bad_number` | 统计个数 | `bad_number` | Integer |
| 6 | `defineCTH` | 自定义项特征 | `definect_h` | 7de95f34-0e7e-4346-b3d5-cb52991fcc00 |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `id` | ID | `id` | String |
| 9 | `number` | 个数 | `number` | Integer |
| 10 | `pk_baseinspectorder_b` | 检验信息id | `pk_baseinspectorder_b` | 602ac289-2dbc-4c0a-9972-33796c984402 |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `resultId` | 处理结果id | `result_id` | e1503ddc-d2ce-46f8-b37d-b310747e1742 |
| 13 | `tenant` | 租户ID | `tenant_id` | String |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `resultId` | 处理结果id | `QMSQIT.incominspectorder.qms_qit_incominspectorder_detailresult_all` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `badItemsId` | 不良项目id | `QMSDFM.badItems.badItems` | Service |  |
| 4 | `defineCTH` | 自定义项特征 | `QMSQIT.incominspectorder.BadItemsDefineCharacter` | None |  |
| 5 | `pk_baseinspectorder_b` | 检验信息id | `QMSQIT.incominspectorder.qms_qit_incominspectorder_b` | None |  |
