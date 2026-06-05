---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.salesforecastchange.SalesForecastChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 预测变更单主表 (`mr.salesforecastchange.SalesForecastChange`)

> MR | 物理表：`mr_sales_forecast_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预测变更单主表 |
| 物理表 | `mr_sales_forecast_change` |
| 数据库 schema | `requirementsplanning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:37.9210` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（56个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `status` | 单据状态 | `status` | String |
| 2 | `id` | id | `id` | Long |
| 3 | `code` | 订单号 | `code` | String |
| 4 | `originalId` | 原单id | `original_id` | eeab251b-018b-4334-b86a-a1b3f4767369 |
| 5 | `isVersions` | 是否最新版本 | `is_versions` | Boolean |
| 6 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 7 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 8 | `reasonMemo` | 变更原因 | `reason_memo` | String |
| 9 | `userDefineCharacterH` | 主表自定义项实体 | `head_dct` | c6b020df-c85a-40fc-a6f3-f2a67526dad1 |
| 10 | `fromDPFlag` | 来源于DP标识 | `from_dp_flag` | Boolean |
| 11 | `planStartDate` | 计划起始日期 | `plan_start_date` | DateTime |
| 12 | `planEndDate` | 计划截止日期 | `plan_end_date` | DateTime |
| 13 | `periodType` | 期间类型 | `period_type` | PeriodTypeEnum |
| 14 | `period` | 期间 | `period` | 4e2f676d-fbf6-448e-b43f-aae7fd6fa808 |
| 15 | `datasub` | 应用来源 | `datasub` | String |
| 16 | `remark` | 备注 | `remark` | String |
| 17 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 18 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 19 | `departmentId` | 部门ID | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 20 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 21 | `simulateFlag` | 模拟需求 | `simulate_flag` | Boolean |
| 22 | `changeVersion` | 变更版本号 | `change_version` | Integer |
| 23 | `auditor` | 审批人名称 | `auditor` | String |
| 24 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 25 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 26 | `auditDate` | 审批日期 | `audit_date` | Date |
| 27 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 28 | `verifystate` | 审批状态 | `verifystate` | Short |
| 29 | `returncount` | 退回次数 | `returncount` | Short |
| 30 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 31 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 32 | `closer` | 关闭人名称 | `closer` | String |
| 33 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 34 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 35 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 36 | `createTime` | 创建时间 | `create_time` | DateTime |
| 37 | `createDate` | 创建日期 | `create_date` | Date |
| 38 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 39 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 40 | `creator` | 创建人名称 | `creator` | String |
| 41 | `modifier` | 修改人名称 | `modifier` | String |
| 42 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 43 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 44 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 45 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 46 | `source` | 上游单据类型 | `source` | String |
| 47 | `upcode` | 上游单据号 | `upcode` | String |
| 48 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 49 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 50 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 51 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 52 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 53 | `tplid` | 模板id | `tplid` | Long |
| 54 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 55 | `pubts` | 时间戳 | `pubts` | DateTime |
| 56 | `salesForecastChangeDetail` | 预测变更单子表 | `` | 2085d5e4-5b47-4149-9e1a-319b64790927 |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `period` | 期间 | `mr.timebucket.TimeBucket` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `departmentId` | 部门ID | `aa.baseorg.DeptMV` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 7 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 8 | `salesForecastChangeDetail` | 预测变更单子表 | `mr.salesforecastchange.SalesForecastChangeDetail` | None | true |
| 9 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 10 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 11 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 12 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 13 | `userDefineCharacterH` | 主表自定义项实体 | `mr.salesforecastchange.SalesForecastChangeDCT` | None |  |
| 14 | `originalId` | 原单id | `mr.salesforecast.SalesForecast` | None |  |
| 15 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 16 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
