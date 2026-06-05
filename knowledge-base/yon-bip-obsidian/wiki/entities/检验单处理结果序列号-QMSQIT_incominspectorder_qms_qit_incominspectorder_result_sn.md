---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.incominspectorder.qms_qit_incominspectorder_result_sn"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验单处理结果序列号 (`QMSQIT.incominspectorder.qms_qit_incominspectorder_result_sn`)

> QMSQIT | 物理表：`qms_qit_inspect_result_sn`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验单处理结果序列号 |
| 物理表 | `qms_qit_inspect_result_sn` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:45:38.4680` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（42个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `resultId` | 处理结果行id | `result_id` | b8617523-4895-4d63-9586-3a1ba9eafaeb |
| 4 | `sn` | 序列号 | `csn_code` | String |
| 5 | `snCharacter` | 序列号自由特征组 | `sn_characteristics` | 64897a85-03f7-42b4-8a4f-39eab89eca63 |
| 6 | `define1` | 自定义项1 | `define1` | String |
| 7 | `define2` | 自定义项2 | `define2` | String |
| 8 | `define3` | 自定义项3 | `define3` | String |
| 9 | `define4` | 自定义项4 | `define4` | String |
| 10 | `define5` | 自定义项5 | `define5` | String |
| 11 | `define6` | 自定义项6 | `define6` | String |
| 12 | `define7` | 自定义项7 | `define7` | String |
| 13 | `define8` | 自定义项8 | `define8` | String |
| 14 | `define9` | 自定义项9 | `define9` | String |
| 15 | `define10` | 自定义项10 | `define10` | String |
| 16 | `define11` | 自定义项11 | `define11` | String |
| 17 | `define12` | 自定义项12 | `define12` | String |
| 18 | `define13` | 自定义项13 | `define13` | String |
| 19 | `define14` | 自定义项14 | `define14` | String |
| 20 | `define15` | 自定义项15 | `define15` | String |
| 21 | `define16` | 自定义项16 | `define16` | String |
| 22 | `define17` | 自定义项17 | `define17` | String |
| 23 | `define18` | 自定义项18 | `define18` | String |
| 24 | `define19` | 自定义项19 | `define19` | String |
| 25 | `define20` | 自定义项20 | `define20` | String |
| 26 | `define21` | 自定义项21 | `define21` | String |
| 27 | `define22` | 自定义项22 | `define22` | String |
| 28 | `define23` | 自定义项23 | `define23` | String |
| 29 | `define24` | 自定义项24 | `define24` | String |
| 30 | `define25` | 自定义项25 | `define25` | String |
| 31 | `define26` | 自定义项26 | `define26` | String |
| 32 | `define27` | 自定义项27 | `define27` | String |
| 33 | `define28` | 自定义项28 | `define28` | String |
| 34 | `define29` | 自定义项29 | `define29` | String |
| 35 | `define30` | 自定义项30 | `define30` | String |
| 36 | `updatecount` | 序列号更新次数 | `iUpdateCount` | Integer |
| 37 | `presnstate` | 序列号上一状态 | `creSNstate` | String |
| 38 | `snstate` | 序列号状态 | `cSNstate` | String |
| 39 | `sourcebillsnid` | 来源序列号行id | `iSourceBillSNId` | Long |
| 40 | `makebillsign` | 生单标识 | `cMakeBillSign` | String |
| 41 | `pubts` | 时间戳 | `pubts` | DateTime |
| 42 | `dr` | 逻辑删除标记 | `dr` | Short |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `resultId` | 处理结果行id | `QMSQIT.incominspectorder.qms_qit_incominspectorder_result` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `snCharacter` | 序列号自由特征组 | `QMSQIT.incominspectorder.InComInspectResultSnCharacteristics` | None |  |
