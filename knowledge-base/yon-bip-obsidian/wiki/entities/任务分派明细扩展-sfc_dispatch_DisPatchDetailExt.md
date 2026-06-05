---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.dispatch.DisPatchDetailExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 任务分派明细扩展 (`sfc.dispatch.DisPatchDetailExt`)

> IMPSFC | 物理表：`imp_sfc_proc_plan_detail_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 任务分派明细扩展 |
| 物理表 | `imp_sfc_proc_plan_detail_ext` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:23:38.9780` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | db43487c-74bf-448e-a97c-8e4246938f6c | ID |

---

## 直接属性（77个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `actualEndTime` | 实际完工时间 | `actual_end_time` | DateTime |
| 2 | `actualStartTime` | 实际开工时间 | `actual_start_time` | DateTime |
| 3 | `checkType` | 质检方式 | `check_type` | Short |
| 4 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 5 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 6 | `completeDate` | 完工日期 | `complete_date` | Date |
| 7 | `completeTime` | 完工时间 | `complete_time` | DateTime |
| 8 | `completeUserId` | 完工人 | `complete_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `dispatchId` | 派工单id | `dispatch_id` | d9807931-2439-4200-9b93-efacb0f688b5 |
| 10 | `dispatchSn` | 派工顺序号 | `dispatch_sn` | Decimal |
| 11 | `dispatchTime` | 派工时间 | `dispatch_time` | DateTime |
| 12 | `dispatchUserId` | 派工人 | `dispatch_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `dr` | 逻辑删除标记 | `dr` | Short |
| 14 | `firstCheck` | 首件检验 | `first_check` | String |
| 15 | `firstCheckStatus` | 首检状态 | `first_check_status` | String |
| 16 | `firstCheckType` | 首检控制方式 | `first_check_type` | String |
| 17 | `firstsource` | 源头单据类型 | `first_source` | String |
| 18 | `firstsourceautoid` | 源头单据子表id | `first_source_autoid` | Long |
| 19 | `firstsourceautono` | 源头单据子表行号 | `first_source_autono` | Decimal |
| 20 | `firstsourceid` | 源头单据id | `first_source_id` | Long |
| 21 | `firstupcode` | 源头单据号 | `first_upcode` | String |
| 22 | `goodsId` | 货位 | `goods_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 23 | `holdDate` | 挂起日期 | `hold_date` | Date |
| 24 | `holdDesc` | 挂起说明 | `hold_desc` | String |
| 25 | `holdReasonId` | 挂起原因 | `hold_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 26 | `holdTime` | 挂起时间 | `hold_time` | DateTime |
| 27 | `holdUserId` | 挂起人 | `hold_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 28 | `id` | ID | `id` | db43487c-74bf-448e-a97c-8e4246938f6c |
| 29 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 30 | `isAutoComplete` | 自动完工 | `is_auto_complete` | Short |
| 31 | `isAutohandover` | 自动交接 | `is_autohandover` | Short |
| 32 | `isClose` | 关闭 | `is_close` | Short |
| 33 | `isHold` | 挂起 | `is_hold` | Short |
| 34 | `isOutsource` | 委外 | `is_outsource` | Short |
| 35 | `isPublish` | 发布 | `is_publish` | Short |
| 36 | `isReportPoint` | 报告点 | `is_reportpoint` | Short |
| 37 | `isSerialNoManage` | 序列号管理 | `is_serial_no_manage` | Short |
| 38 | `mainChangeRateDen` | 生产换算率分母 | `main_change_rateden` | Decimal |
| 39 | `mainChangeRateNum` | 生产换算率分子 | `main_change_ratenum` | Decimal |
| 40 | `materialApplyStatus` | 领料申请状态 | `material_apply_status` | Short |
| 41 | `materialStatus` | 领料状态 | `material_status` | Short |
| 42 | `nextId` | 后工序 | `next_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 43 | `nextSn` | 后序顺序号 | `next_sn` | Decimal |
| 44 | `openDate` | 打开日期 | `open_date` | Date |
| 45 | `openTime` | 打开时间 | `open_time` | DateTime |
| 46 | `openUserId` | 打开人 | `open_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 47 | `outChangeRateDen` | 产出换算率分母 | `out_change_rateden` | Decimal |
| 48 | `outChangeRateNum` | 产出换算率分子 | `out_change_ratenum` | Decimal |
| 49 | `outExchangeType` | 换算方式 | `out_exchange_type` | Short |
| 50 | `preId` | 前工序 | `pre_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 51 | `preSn` | 前序顺序号 | `pre_sn` | Decimal |
| 52 | `publishDate` | 发布日期 | `publish_date` | Date |
| 53 | `publishTime` | 发布时间 | `publish_time` | DateTime |
| 54 | `publishUserId` | 发布人 | `publish_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 55 | `scheduleEndTime` | 计划完工时间 | `schedule_end_time` | DateTime |
| 56 | `schedulePrepareTime` | 计划准备工时 | `schedule_prepare_time` | Decimal |
| 57 | `scheduleProcessTime` | 计划加工工时 | `schedule_process_time` | Decimal |
| 58 | `scheduleStartTime` | 计划开工时间 | `schedule_start_time` | DateTime |
| 59 | `srcDispatchPlanId` | 源派工工序id | `src_dispatch_plan_id` | Long |
| 60 | `startDate` | 开工日期 | `start_date` | Date |
| 61 | `startTime` | 开工时间 | `start_time` | DateTime |
| 62 | `startUserId` | 开工人 | `start_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 63 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 64 | `timeUnit` | 时间单位 | `time_unit` | Short |
| 65 | `uncompleteDate` | 反完工日期 | `uncomplete_date` | Date |
| 66 | `uncompleteTime` | 反完工时间 | `uncomplete_time` | DateTime |
| 67 | `uncompleteUserId` | 反完工人 | `uncomplete_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 68 | `unitExchangeType` | 换算方式 | `unit_exchange_type` | Short |
| 69 | `unpublishDate` | 取消发布日期 | `unpublish_date` | Date |
| 70 | `unpublishTime` | 取消发布时间 | `unpublish_time` | DateTime |
| 71 | `unpublishUserId` | 取消发布人 | `unpublish_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 72 | `unstartDate` | 反开工日期 | `unstart_date` | Date |
| 73 | `unstartTime` | 反开工时间 | `unstart_time` | DateTime |
| 74 | `unstartUserId` | 反开工人 | `unstart_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 75 | `vendorId` | 供应商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 76 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 77 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（19个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `preId` | 前工序 | `po.order.OrderProcess` | Service |  |
| 2 | `holdUserId` | 挂起人 | `base.user.User` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `goodsId` | 货位 | `aa.goodsposition.GoodsPosition` | Service |  |
| 5 | `publishUserId` | 发布人 | `base.user.User` | Service |  |
| 6 | `vendorId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 7 | `openUserId` | 打开人 | `base.user.User` | Service |  |
| 8 | `unpublishUserId` | 取消发布人 | `base.user.User` | Service |  |
| 9 | `holdReasonId` | 挂起原因 | `aa.reason.Reason` | Service |  |
| 10 | `dispatchId` | 派工单id | `sfc.dispatchinfo.DispatchInfo` | None |  |
| 11 | `completeUserId` | 完工人 | `base.user.User` | Service |  |
| 12 | `nextId` | 后工序 | `po.order.OrderProcess` | Service |  |
| 13 | `startUserId` | 开工人 | `base.user.User` | Service |  |
| 14 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 15 | `uncompleteUserId` | 反完工人 | `base.user.User` | Service |  |
| 16 | `id` | ID | `sfc.dispatch.DisPatchDetail` | None | true |
| 17 | `dispatchUserId` | 派工人 | `base.user.User` | Service |  |
| 18 | `unstartUserId` | 反开工人 | `base.user.User` | Service |  |
| 19 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
