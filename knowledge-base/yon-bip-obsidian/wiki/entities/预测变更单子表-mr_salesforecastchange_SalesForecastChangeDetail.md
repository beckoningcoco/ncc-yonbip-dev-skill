---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.salesforecastchange.SalesForecastChangeDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 预测变更单子表 (`mr.salesforecastchange.SalesForecastChangeDetail`)

> MR | 物理表：`mr_sales_forecast_change_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预测变更单子表 |
| 物理表 | `mr_sales_forecast_change_detail` |
| domain/服务域 | `requirementsplanning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:17:07.8440` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（73个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `salesForecastChangeId` | 主表主键 | `sales_forecast_change_id` | 8022add9-5784-42c1-96c5-bc13985aa15e |
| 2 | `originalSalesForecastId` | 原单子表id | `original_sales_forecast_id` | 6b4fb6a5-cf8c-4b89-b344-340b16f3ba5b |
| 3 | `originalId` | 原单主表id | `original_id` | eeab251b-018b-4334-b86a-a1b3f4767369 |
| 4 | `id` | id | `id` | Long |
| 5 | `freeCharacteristics` | 自由特征组实体 | `free_characteristics` | 76df146a-d887-4320-9cc3-cf29c39d18c9 |
| 6 | `userDefineCharacterB` | 自定义项实体 | `body_dct` | de8b4920-d974-4d4e-a373-9bfa9f8ccda6 |
| 7 | `name` | 名称 | `name` | String |
| 8 | `free1` | 规格1 | `free1` | String |
| 9 | `free2` | 规格2 | `free2` | String |
| 10 | `free3` | 规格3 | `free3` | String |
| 11 | `free4` | 规格4 | `free4` | String |
| 12 | `free5` | 规格5 | `free5` | String |
| 13 | `free6` | 规格6 | `free6` | String |
| 14 | `free7` | 规格7 | `free7` | String |
| 15 | `free8` | 规格8 | `free8` | String |
| 16 | `free9` | 规格9 | `free9` | String |
| 17 | `free10` | 规格10 | `free10` | String |
| 18 | `salesForecastId` | 主表主键 | `sales_forecast_id` | eeab251b-018b-4334-b86a-a1b3f4767369 |
| 19 | `materialId` | 制造物料 | `material_id` | Long |
| 20 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 21 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 22 | `requirementNumber` | 预测数量 | `requirement_number` | Decimal |
| 23 | `requirementDate` | 需求日期 | `requirement_date` | DateTime |
| 24 | `effectiveDate` | 有效日期 | `effective_date` | DateTime |
| 25 | `remark` | 备注 | `remark` | String |
| 26 | `trackNumber` | 跟踪号 | `track_number` | String |
| 27 | `sourceType` | 来源类型 | `source_type` | String |
| 28 | `sourceVouchId` | 来源单据ID | `source_vouch_id` | String |
| 29 | `sourceVouchCode` | 来源单据号 | `source_vouch_code` | String |
| 30 | `sourceVouchRowId` | 来源单据行ID | `source_vouch_row_id` | String |
| 31 | `assistUnit` | 辅计量单位 | `assist_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 32 | `assistUnitCount` | 辅计量数量 | `assist_quantity` | Decimal |
| 33 | `assistChangeRate` | 辅计量换算率 | `assist_change_rate` | Decimal |
| 34 | `customerId` | 客户 | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 35 | `isForecast` | 是否预测 | `is_forecast` | Boolean |
| 36 | `parent` | 父级id | `parent_id` | 6b4fb6a5-cf8c-4b89-b344-340b16f3ba5b |
| 37 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 38 | `lineNo` | 行号 | `line_no` | Decimal |
| 39 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 40 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 41 | `source` | 上游单据类型 | `source` | String |
| 42 | `upcode` | 上游单据号 | `upcode` | String |
| 43 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 44 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 45 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 46 | `level` | 层级 | `level` | Integer |
| 47 | `path` | 路径 | `path` | String |
| 48 | `sort` | 排序号 | `sort_num` | Integer |
| 49 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 50 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 51 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 52 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 53 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 54 | `rowno` | 序号 | `rowno` | Integer |
| 55 | `pubts` | 时间戳 | `pubts` | DateTime |
| 56 | `assistChangeRateDen` | 换算率分母 | `assist_change_rateden` | Decimal |
| 57 | `assistChangeRateNum` | 换算率分子 | `assist_change_ratenum` | Decimal |
| 58 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 59 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 60 | `linecloseDate` | 行关闭日期 | `lineclose_date` | DateTime |
| 61 | `linecloseTime` | 行关闭时间 | `lineclose_time` | DateTime |
| 62 | `linecloser` | 行关闭人 | `linecloser` | String |
| 63 | `mainReversalQuantity` | 主计量冲销数量 | `main_reversal_qty` | Decimal |
| 64 | `optionFreeB` | 选配特征组 | `option_free_b` | d1c576b1-a9a8-4197-bb60-95c40bf4757c |
| 65 | `reversalQuantity` | 冲销数量 | `reversal_qty` | Decimal |
| 66 | `rootVouchCode` | 源头单据号 | `root_vouch_code` | String |
| 67 | `rootVouchId` | 源头单据ID | `root_vouch_id` | Long |
| 68 | `rootVouchRowId` | 源头单据行ID | `root_vouch_row_id` | Long |
| 69 | `rootVouchRowNo` | 源头单据行号 | `root_vouch_row_no` | Decimal |
| 70 | `rootVouchType` | 源头单据类型 | `root_vouch_type` | String |
| 71 | `variantConfId` | 选配参数文件 | `variant_conf_id` | f4984814-116e-4188-ab12-1b922a40f2cc |
| 72 | `variantConfigCtsId` | 选配结果清单id | `variantconfigcts_id` | Long |
| 73 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `optionFreeB` | 选配特征组 | `mr.salesforecastchange.SalesForecastChangeDetailOCT` | None |  |
| 2 | `parent` | 父级id | `mr.salesforecast.SalesForecastDetail` | None |  |
| 3 | `assistUnit` | 辅计量单位 | `pc.unit.Unit` | Service |  |
| 4 | `userDefineCharacterB` | 自定义项实体 | `mr.salesforecastchange.SalesForecastChangeDetailDCT` | None |  |
| 5 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 6 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 7 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | Service |  |
| 8 | `salesForecastChangeId` | 主表主键 | `mr.salesforecastchange.SalesForecastChange` | None | true |
| 9 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 10 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 11 | `originalSalesForecastId` | 原单子表id | `mr.salesforecast.SalesForecastDetail` | None |  |
| 12 | `salesForecastId` | 主表主键 | `mr.salesforecast.SalesForecast` | None |  |
| 13 | `freeCharacteristics` | 自由特征组实体 | `mr.salesforecastchange.SalesForecastChangeDetailFCT` | None |  |
| 14 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 15 | `variantConfId` | 选配参数文件 | `vc.variantConfiguration.VariantConfiguration` | Service |  |
| 16 | `customerId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 17 | `originalId` | 原单主表id | `mr.salesforecast.SalesForecast` | None |  |
| 18 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 19 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 20 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
