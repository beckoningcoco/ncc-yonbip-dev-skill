---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.leniencyadjustrules.RuleDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 规则明细 (`QMSDFM.leniencyadjustrules.RuleDetail`)

> QIC | 物理表：`qms_dfm_rule_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 规则明细 |
| 物理表 | `qms_dfm_rule_detail` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:48:13.4210` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `ruleId` | 宽严度调整规则Id | `rule_id` | 3da39e15-1749-401c-b7fa-3444b8f8b7f2 |
| 4 | `lineNo` | 行号 | `line_no` | Decimal |
| 5 | `defineCharacteristicsTable` | 自定义项特征组 | `define_cts` | 908350da-c402-4613-9796-ca160e3d53a8 |
| 6 | `fromDegree` | 从程度 | `from_degree` | qms_degree |
| 7 | `toDegree` | 到程度 | `to_degree` | qms_degree |
| 8 | `inspectBatchNum` | 连续检验批数 | `inspect_batch_num` | Integer |
| 9 | `judgingCondition` | 判断条件 | `judging_condition` | qms_judgment |
| 10 | `symbol` | 比较符 | `symbol` | qms_symbols |
| 11 | `values` | 值 | `values` | Integer |
| 12 | `maxContinueTime` | 最大持续期 | `max_continue_time` | Integer |
| 13 | `dr` | 逻辑删除标记 | `dr` | Short |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime |
| 15 | `createDate` | 创建日期 | `create_date` | Date |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 18 | `creator` | 创建人名称 | `creator` | String |
| 19 | `modifier` | 修改人名称 | `modifier` | String |
| 20 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 21 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `ruleId` | 宽严度调整规则Id | `QMSDFM.leniencyadjustrules.LeniencyAdjustRules` | None | true |
| 5 | `defineCharacteristicsTable` | 自定义项特征组 | `QMSDFM.leniencyadjustrules.RuleDetaiDefineCharacter` | None |  |
