---
tags: ["BIP", "元数据", "数据字典", "PO", "po.finishedreport.FinishedReportDetailExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 完工报告产品扩展表 (`po.finishedreport.FinishedReportDetailExt`)

> PO | 物理表：`po_finished_report_detail_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 完工报告产品扩展表 |
| 物理表 | `po_finished_report_detail_ext` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:35:48.3350` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | d8490919-eda7-40f8-a9a3-9869fc46b507 | ID |
| 编码 | `rowno` | Decimal | 行号(序列号接口) |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 2 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 3 | `closeReleaseQty` | 关闭释放完工量 | `close_release_qty` | Integer |
| 4 | `destructiveInspectAuxQty` | 破坏性检验件数 | `destructive_inspect_aux_qty` | Decimal |
| 5 | `destructiveInspectQty` | 破坏性检验数量 | `destructive_inspect_qty` | Decimal |
| 6 | `firstCheck` | 首检 | `first_check` | String |
| 7 | `id` | ID | `id` | d8490919-eda7-40f8-a9a3-9869fc46b507 |
| 8 | `inspectionCtrlPoint` | 检验控制点 | `inspection_ctrl_point` | String |
| 9 | `inspectionDate` | 检验日期 | `inspection_date` | Date |
| 10 | `isClose` | 行关闭 | `is_close` | Integer |
| 11 | `linecloseReasonId` | 关闭原因 | `lineclose_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 12 | `linecloseRemark` | 关闭说明 | `lineclose_remark` | String |
| 13 | `offChartReceipt` | 表外产出 | `off_chart_receipt` | Boolean |
| 14 | `operationId` | 标准工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime |
| 16 | `rowno` | 行号(序列号接口) | `rowno` | Decimal |
| 17 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 18 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 19 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 20 | `urgentApplyQty` | 紧急放行申请数量 | `urgent_apply_qty` | Decimal |
| 21 | `urgentQty` | 紧急放行通过数量 | `urgent_qty` | Decimal |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `operationId` | 标准工序ID | `ed.operation.Operation` | Service |  |
| 3 | `id` | ID | `po.finishedreport.FinishedReportDetail` | None | true |
| 4 | `linecloseReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
