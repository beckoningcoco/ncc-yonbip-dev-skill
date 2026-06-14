---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.salesforecast.SalesForecastDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 预测单子表 (`mr.salesforecast.SalesForecastDetail`)

> MR | 物理表：`mr_sales_forecast_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预测单子表 |
| 物理表 | `mr_sales_forecast_detail` |
| domain/服务域 | `requirementsplanning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:55.5780` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 行号 |

---

## 直接属性（72个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 2 | `level` | 层级 | `level` | Integer |
| 3 | `name` | 节点标题 | `name` | String |
| 4 | `path` | 路径 | `path` | String |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 7 | `lineNo` | 行号 | `line_no` | Decimal |
| 8 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 9 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 10 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 11 | `sort` | 排序号 | `sort_num` | Integer |
| 12 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 13 | `isForecast` | 是否预测 | `is_forecast` | Boolean |
| 14 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 15 | `parent` | parent | `parent_id` | 6b4fb6a5-cf8c-4b89-b344-340b16f3ba5b |
| 16 | `source` | 上游单据类型 | `source` | String |
| 17 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 18 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 19 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 20 | `upcode` | 上游单据号 | `upcode` | String |
| 21 | `freeCharacteristics` | 自由特征组实体 | `free_characteristics` | ecc040f7-db2e-4692-8f33-053c1069cf68 |
| 22 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `rowno` | 行号 | `rowno` | Integer |
| 25 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 26 | `sourceType` | 来源类型 | `source_type` | String |
| 27 | `sourceVouchCode` | 来源单据号 | `source_vouch_code` | String |
| 28 | `sourceVouchId` | 来源单据ID | `source_vouch_id` | String |
| 29 | `assistUnit` | 辅计量id | `assist_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 30 | `sourceVouchRowId` | 来源单据行ID | `source_vouch_row_id` | String |
| 31 | `trackNumber` | 跟踪号 | `track_number` | String |
| 32 | `assistUnitCount` | 数量 | `assist_quantity` | Decimal |
| 33 | `salesForecastId` | 计划独立需求关联标识 | `sales_forecast_id` | eeab251b-018b-4334-b86a-a1b3f4767369 |
| 34 | `materialId` | 物料id | `material_id` | Long |
| 35 | `assistChangeRate` | 换算率 | `assist_change_rate` | Decimal |
| 36 | `requirementNumber` | 需求数量 | `requirement_number` | Decimal |
| 37 | `customerId` | 客户 | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 38 | `requirementDate` | 需求日期 | `requirement_date` | DateTime |
| 39 | `effectiveDate` | 有效日期 | `effective_date` | DateTime |
| 40 | `remark` | 备注 | `remark` | String |
| 41 | `id` | ID | `id` | Long |
| 42 | `free1` | 颜色测试 | `free1` | String |
| 43 | `free2` | 测试31 | `free2` | String |
| 44 | `free3` | 定量测试 | `free3` | String |
| 45 | `userDefineCharacterB` | 自定义项特征组 | `body_dct` | 0a9dfbb4-4f8c-42b2-8020-69e1d72a8479 |
| 46 | `free4` | 香雪产地 | `free4` | String |
| 47 | `free5` | 组织 | `free5` | String |
| 48 | `free6` | 物料规格6 | `free6` | String |
| 49 | `free7` | 物料规格7 | `free7` | String |
| 50 | `free8` | 物料规格8 | `free8` | String |
| 51 | `free9` | 物料规格9 | `free9` | String |
| 52 | `free10` | 物料规格10 | `free10` | String |
| 53 | `assistChangeRateDen` | 换算率分母 | `assist_change_rateden` | Decimal |
| 54 | `assistChangeRateNum` | 换算率分子 | `assist_change_ratenum` | Decimal |
| 55 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 56 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 57 | `linecloseDate` | 行关闭日期 | `lineclose_date` | DateTime |
| 58 | `linecloseTime` | 行关闭时间 | `lineclose_time` | DateTime |
| 59 | `linecloser` | 行关闭人 | `linecloser` | String |
| 60 | `mainReversalQuantity` | 主计量冲销数量 | `main_reversal_qty` | Decimal |
| 61 | `optionFreeB` | 选配特征组 | `option_free_b` | c327e727-440c-4a25-8039-deb6579dc35d |
| 62 | `reversalQuantity` | 冲销数量 | `reversal_qty` | Decimal |
| 63 | `rootVouchCode` | 源头单据号 | `root_vouch_code` | String |
| 64 | `rootVouchId` | 源头单据ID | `root_vouch_id` | Long |
| 65 | `rootVouchRowId` | 源头单据行ID | `root_vouch_row_id` | Long |
| 66 | `rootVouchRowNo` | 源头单据行号 | `root_vouch_row_no` | Decimal |
| 67 | `rootVouchType` | 源头单据类型 | `root_vouch_type` | String |
| 68 | `salesForecastDetailAttrextItems` | 子表自定义项 | `` | 4efb1da0-6345-4c11-a72e-1ed6d2990ff7 |
| 69 | `salesForecastDetailUserdefItem` | 子件表固定自定义项 | `` | dece25ce-74ef-49b0-8edd-4c88b201c4d9 |
| 70 | `variantConfId` | 选配参数文件 | `variant_conf_id` | f4984814-116e-4188-ab12-1b922a40f2cc |
| 71 | `variantConfigCtsId` | 选配结果清单id | `variantconfigcts_id` | Long |
| 72 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |

---

## 关联属性（19个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `optionFreeB` | 选配特征组 | `mr.salesforecast.SalesForecastDetailOCT` | None |  |
| 2 | `parent` | parent | `mr.salesforecast.SalesForecastDetail` | None |  |
| 3 | `assistUnit` | 辅计量id | `pc.unit.Unit` | Service |  |
| 4 | `userDefineCharacterB` | 自定义项特征组 | `mr.salesforecast.SalesForecastDetailDCT` | None |  |
| 5 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 6 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 7 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | Service |  |
| 8 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 9 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 10 | `salesForecastId` | 计划独立需求关联标识 | `mr.salesforecast.SalesForecast` | None | true |
| 11 | `salesForecastDetailUserdefItem` | 子件表固定自定义项 | `mr.salesforecast.SalesForecastDetailUserdefItem` | None | true |
| 12 | `freeCharacteristics` | 自由特征组实体 | `mr.salesforecast.SalesForecastDetailFCT` | None |  |
| 13 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 14 | `variantConfId` | 选配参数文件 | `vc.variantConfiguration.VariantConfiguration` | Service |  |
| 15 | `customerId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 16 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 17 | `salesForecastDetailAttrextItems` | 子表自定义项 | `mr.salesforecast.SalesForecastDetailAttrextItem` | None | true |
| 18 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 19 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
