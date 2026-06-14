---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.proceTaskReport.ProceTaskReportDetailSn"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序任务汇报序列号 (`sfc.proceTaskReport.ProceTaskReportDetailSn`)

> IMPSFC | 物理表：`imp_sfc_procetaskrep_sn`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序任务汇报序列号 |
| 物理表 | `imp_sfc_procetaskrep_sn` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:24:29.7870` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（47个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `childId` | 工序任务汇报明细id | `child_id` | 7ed5ecde-bf12-45c3-a73a-e69e184d05e8 |
| 2 | `define1` | 自定义项1 | `define1` | String |
| 3 | `define10` | 自定义项10 | `define10` | String |
| 4 | `define11` | 自定义项11 | `define11` | String |
| 5 | `define12` | 自定义项12 | `define12` | String |
| 6 | `define13` | 自定义项13 | `define13` | String |
| 7 | `define14` | 自定义项14 | `define14` | String |
| 8 | `define15` | 自定义项15 | `define15` | String |
| 9 | `define16` | 自定义项16 | `define16` | String |
| 10 | `define17` | 自定义项17 | `define17` | String |
| 11 | `define18` | 自定义项18 | `define18` | String |
| 12 | `define19` | 自定义项19 | `define19` | String |
| 13 | `define2` | 自定义项2 | `define2` | String |
| 14 | `define20` | 自定义项20 | `define20` | String |
| 15 | `define21` | 自定义项21 | `define21` | String |
| 16 | `define22` | 自定义项22 | `define22` | String |
| 17 | `define23` | 自定义项23 | `define23` | String |
| 18 | `define24` | 自定义项24 | `define24` | String |
| 19 | `define25` | 自定义项25 | `define25` | String |
| 20 | `define26` | 自定义项26 | `define26` | String |
| 21 | `define27` | 自定义项27 | `define27` | String |
| 22 | `define28` | 自定义项28 | `define28` | String |
| 23 | `define29` | 自定义项29 | `define29` | String |
| 24 | `define3` | 自定义项3 | `define3` | String |
| 25 | `define30` | 自定义项30 | `define30` | String |
| 26 | `define4` | 自定义项4 | `define4` | String |
| 27 | `define5` | 自定义项5 | `define5` | String |
| 28 | `define6` | 自定义项6 | `define6` | String |
| 29 | `define7` | 自定义项7 | `define7` | String |
| 30 | `define8` | 自定义项8 | `define8` | String |
| 31 | `define9` | 自定义项9 | `define9` | String |
| 32 | `detailLineNo` | 子表行号 | `detail_line_no` | Decimal |
| 33 | `dr` | 逻辑删除标记 | `dr` | Short |
| 34 | `id` | ID | `id` | Long |
| 35 | `lineNo` | 行号 | `line_no` | Decimal |
| 36 | `mainId` | 工序任务汇报id | `main_id` | Long |
| 37 | `makebillsign` | 生单标识 | `cMakeBillSign` | String |
| 38 | `presnstate` | 序列号上一状态 | `creSNstate` | String |
| 39 | `proceTaskLineId` | 工序任务汇报信息ID | `proce_task_line_id` | de66617d-1de0-4dca-8844-cfc180a45de8 |
| 40 | `pubts` | 时间戳 | `pubts` | DateTime |
| 41 | `rowno` | 序号 | `rowno` | Integer |
| 42 | `sn` | 序列号 | `csn_code` | String |
| 43 | `snCharacteristics` | 自由项特征组 | `sn_characteristics` | f18a8ec0-5da3-4832-8e64-02f434fb28b0 |
| 44 | `snstate` | 序列号状态 | `cSNstate` | String |
| 45 | `sourcebillsnid` | 来源序列号行id | `iSourceBillSNId` | Long |
| 46 | `updatecount` | 序列号更新次数 | `iUpdateCount` | Integer |
| 47 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `snCharacteristics` | 自由项特征组 | `sfc.proceTaskReport.SnCharacteristics` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `proceTaskLineId` | 工序任务汇报信息ID | `sfc.proceTaskReport.proceTaskReportLine` | None |  |
| 4 | `childId` | 工序任务汇报明细id | `sfc.proceTaskReport.ProceTaskReportDetail` | None | true |
