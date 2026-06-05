---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.proceTaskReport.proceTaskReportLineExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序任务汇报平行表 (`sfc.proceTaskReport.proceTaskReportLineExt`)

> IMPSFC | 物理表：`imp_sfc_procetaskrep_line_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序任务汇报平行表 |
| 物理表 | `imp_sfc_procetaskrep_line_ext` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:26:16.2060` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | de66617d-1de0-4dca-8844-cfc180a45de8 | 工序任务汇报信息ID |

---

## 直接属性（27个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `cancelDate` | 取消确认日期 | `cancel_date` | Date |
| 2 | `cancelStaff` | 取消确认人 | `cancel_staff` | String |
| 3 | `cancelStaffId` | 取消确认人ID | `cancel_staff_id` | String |
| 4 | `cancelTime` | 取消确认时间 | `cancel_time` | DateTime |
| 5 | `checkDate` | 检验确认日期 | `check_date` | Date |
| 6 | `checkTime` | 检验确认时间 | `check_time` | DateTime |
| 7 | `checkUser` | 检验人 | `check_user` | String |
| 8 | `checkUserId` | 检验人ID | `check_user_id` | String |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `firstCheck` | 首件检验 | `first_check` | String |
| 11 | `id` | 工序任务汇报信息ID | `id` | de66617d-1de0-4dca-8844-cfc180a45de8 |
| 12 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 13 | `isReportPoint` | 是否报告点 | `is_reportpoint` | Short |
| 14 | `offChartOutput` | 表外产出 | `off_chart_output` | Integer |
| 15 | `opSequenceId` | 工序序列ID | `op_sequence_id` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 16 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |
| 17 | `outConversionRateDen` | 产出换算率分母 | `out_conversion_rateden` | Decimal |
| 18 | `outConversionRateNum` | 产出换算率分子 | `out_conversion_ratenum` | Decimal |
| 19 | `prodConversionRateDen` | 生产换算率分母 | `prod_conversion_rateden` | Decimal |
| 20 | `prodConversionRateNum` | 生产换算率分子 | `prod_conversion_ratenum` | Decimal |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `sn` | 工序顺序号 | `sn` | Decimal |
| 23 | `sourceBizClueCode` | 来源业务线索单号 | `source_biz_clue_code` | String |
| 24 | `sourceBizClueId` | 来源业务线索主表id | `source_biz_clue_id` | Long |
| 25 | `sourceBizClueType` | 来源业务线索类型 | `source_biz_clue_type` | String |
| 26 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `opSequenceId` | 工序序列ID | `po.order.OrderOpSequence` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `id` | 工序任务汇报信息ID | `sfc.proceTaskReport.proceTaskReportLine` | None | true |
