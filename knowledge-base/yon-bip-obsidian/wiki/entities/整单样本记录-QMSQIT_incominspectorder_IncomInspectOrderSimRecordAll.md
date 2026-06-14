---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.incominspectorder.IncomInspectOrderSimRecordAll"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 整单样本记录 (`QMSQIT.incominspectorder.IncomInspectOrderSimRecordAll`)

> QMSQIT | 物理表：`qms_qit_incom_sim_record`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 整单样本记录 |
| 物理表 | `qms_qit_incom_sim_record` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:57.8300` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 检验单号 | `code` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `id` | ID | `id` | String |
| 8 | `inspect_value` | 检验值 | `inspect_value` | String |
| 9 | `inspecttime` | 检验时间 | `inspecttime` | DateTime |
| 10 | `modifier` | 修改人名称 | `modifier` | String |
| 11 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 14 | `pk_inspect_item_code` | 检验项目编码 | `pk_inspect_item_code` | String |
| 15 | `pk_inspector` | 检验员 | `pk_inspector` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 16 | `pk_inspector_code` | 检验员编码 | `pk_inspector_code` | String |
| 17 | `pk_inspectorder_b` | 检验信息id | `pk_inspectorder_b` | 602ac289-2dbc-4c0a-9972-33796c984402 |
| 18 | `pk_inspectorder_h` | 检验单id | `pk_inspectorder_h` | d4ef5893-2422-4c08-8e7e-df2087db7a8f |
| 19 | `pk_inspectorder_simple` | 样本号id | `pk_inspectorder_simple` | String |
| 20 | `pk_qualify_grade` | 质量等级 | `pk_qualify_grade` | String |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `sample_code` | 样本号 | `sample_code` | String |
| 23 | `sample_inspect_result` | 样本检验结果 | `sample_inspect_result` | String |
| 24 | `tenant` | 租户ID | `tenant_id` | String |
| 25 | `vnote` | 备注 | `vnote` | String |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `pk_inspectorder_b` | 检验信息id | `QMSQIT.incominspectorder.qms_qit_incominspectorder_b` | None |  |
| 5 | `pk_inspectorder_h` | 检验单id | `QMSQIT.incominspectorder.qms_qit_incominspectorder_h` | None | true |
| 6 | `pk_inspector` | 检验员 | `bd.staff.Staff` | Service |  |
