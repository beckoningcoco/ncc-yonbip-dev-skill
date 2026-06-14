---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.CheckPlan.CheckPlanSource"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验计划来源 (`QMSQIT.CheckPlan.CheckPlanSource`)

> QMSQIT | 物理表：`qms_qit_checkplansource`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验计划来源 |
| 物理表 | `qms_qit_checkplansource` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:34.9640` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `checkPlanPlanId` | 检验计划方案id | `checkplanplan_id` | ac691d53-5db4-494c-821d-8ea322d2baf3 |
| 4 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 5 | `checkType` | 检验类型 | `check_type` | String |
| 6 | `sourceType` | 来源单据类型 | `source_type` | 4a227650-b866-4f4c-a6ca-2433297a1713 |
| 7 | `createCheckPlan` | 是否生成检验计划 | `create_checkplan` | Boolean |
| 8 | `sourceDefineCharacter` | 自定义项特征组 | `definect_b` | a7abd579-2aed-44cc-b517-e7774da796e5 |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `createDate` | 创建日期 | `create_date` | Date |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `creator` | 创建人名称 | `creator` | String |
| 15 | `modifier` | 修改人名称 | `modifier` | String |
| 16 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `checkPlanPlanId` | 检验计划方案id | `QMSQIT.CheckPlan.CheckPlanPlan` | None | true |
| 2 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 3 | `sourceType` | 来源单据类型 | `bd.bill.BillTypeVO` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `sourceDefineCharacter` | 自定义项特征组 | `QMSQIT.CheckPlan.CheckPlanSourceDefineCharacter` | None |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
