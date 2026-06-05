---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.proceTaskReport.ProceTaskReportExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序任务汇报平行表 (`sfc.proceTaskReport.ProceTaskReportExt`)

> IMPSFC | 物理表：`imp_sfc_procetaskrep_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序任务汇报平行表 |
| 物理表 | `imp_sfc_procetaskrep_ext` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:22:19.1150` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 5b6b44a2-42c1-49e8-9351-f34ff6838c71 | 工序任务汇报ID |

---

## 直接属性（32个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `firstCheck` | 首件检验 | `first_check` | String |
| 3 | `id` | 工序任务汇报ID | `id` | 5b6b44a2-42c1-49e8-9351-f34ff6838c71 |
| 4 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 5 | `interactiveMode` | 新老模式标识 | `interactive_mode` | Short |
| 6 | `isMultiDevice` | 多设备 | `is_multi_device` | Short |
| 7 | `isMultiStaff` | 多人员 | `is_multi_staff` | Short |
| 8 | `isReportPoint` | 是否报告点 | `is_reportpoint` | Short |
| 9 | `mainId` | 工序任务汇报id | `main_id` | 5b6b44a2-42c1-49e8-9351-f34ff6838c71 |
| 10 | `offChartOutput` | 表外产出 | `off_chart_output` | Integer |
| 11 | `opSequenceId` | 工序序列ID | `op_sequence_id` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 12 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |
| 13 | `orderByProductId` | 生产订单联副产品 | `order_by_product_id` | 4b08ee17-121c-4d32-9d32-e896d0d3a395 |
| 14 | `outConversionRateDen` | 产出换算率分母 | `out_conversion_rateden` | Decimal |
| 15 | `outConversionRateNum` | 产出换算率分子 | `out_conversion_ratenum` | Decimal |
| 16 | `outExchangeType` | 产出换算方式 | `out_exchange_type` | Short |
| 17 | `outputUnitId` | 产出单位 | `output_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 18 | `prodConversionRateDen` | 生产换算率分母 | `prod_conversion_rateden` | Decimal |
| 19 | `prodConversionRateNum` | 生产换算率分子 | `prod_conversion_ratenum` | Decimal |
| 20 | `prodUnitId` | 生产单位 | `prod_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `remark` | 备注 | `remark` | String |
| 23 | `sourceBizClueCode` | 来源业务线索单号 | `source_biz_clue_code` | String |
| 24 | `sourceBizClueId` | 来源业务线索主表id | `source_biz_clue_id` | Long |
| 25 | `sourceBizClueType` | 来源业务线索类型 | `source_biz_clue_type` | String |
| 26 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 27 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 28 | `terminalType` | 来源终端类型 | `terminal_type` | String |
| 29 | `totalSfcReworkNum` | 累计车间返工数量 | `total_sfc_rework_num` | Decimal |
| 30 | `totalSfcScrapNum` | 累计车间报废数量 | `total_sfc_scrap_num` | Decimal |
| 31 | `unitId` | 主计量单位 | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 32 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `orderByProductId` | 生产订单联副产品 | `po.order.OrderByProduct` | Service |  |
| 2 | `opSequenceId` | 工序序列ID | `po.order.OrderOpSequence` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `unitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 5 | `id` | 工序任务汇报ID | `sfc.proceTaskReport.proceTaskReport` | None | true |
| 6 | `mainId` | 工序任务汇报id | `sfc.proceTaskReport.proceTaskReport` | None |  |
| 7 | `outputUnitId` | 产出单位 | `pc.unit.Unit` | Service |  |
| 8 | `prodUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 9 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
