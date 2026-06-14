---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.salesforecast.SalesForecast"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 预测单主表 (`mr.salesforecast.SalesForecast`)

> MR | 物理表：`mr_sales_forecast`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预测单主表 |
| 物理表 | `mr_sales_forecast` |
| domain/服务域 | `requirementsplanning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:13.7590` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（55个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 2 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 3 | `source` | 上游单据类型 | `source` | String |
| 4 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 5 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 6 | `simulateFlag` | 模拟需求 | `simulate_flag` | Boolean |
| 7 | `changeVersion` | 变更版本号 | `change_version` | Integer |
| 8 | `fromDPFlag` | 来源于DP标识 | `from_dp_flag` | Boolean |
| 9 | `planStartDate` | 计划起始日期 | `plan_start_date` | Date |
| 10 | `planEndDate` | 计划截止日期 | `plan_end_date` | Date |
| 11 | `periodType` | 期间类型 | `period_type` | PeriodTypeEnum |
| 12 | `period` | 期间 | `period` | 4e2f676d-fbf6-448e-b43f-aae7fd6fa808 |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 14 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 15 | `upcode` | 上游单据号 | `upcode` | String |
| 16 | `auditDate` | 审批日期 | `audit_date` | Date |
| 17 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 18 | `auditor` | 审批人名称 | `auditor` | String |
| 19 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 21 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 22 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 23 | `closer` | 关闭人名称 | `closer` | String |
| 24 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 25 | `code` | 编码 | `code` | String |
| 26 | `createDate` | 创建日期 | `create_date` | Date |
| 27 | `createTime` | 创建时间 | `create_time` | DateTime |
| 28 | `creator` | 创建人名称 | `creator` | String |
| 29 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 30 | `datasub` | 应用来源 | `datasub` | String |
| 31 | `departmentId` | 部门ID | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 32 | `id` | ID | `id` | Long |
| 33 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 34 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 35 | `userDefineCharacterH` | 自定义项特征组 | `head_dct` | fef01690-e617-4e94-9330-2d07d26c25b1 |
| 36 | `modifier` | 修改人名称 | `modifier` | String |
| 37 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 38 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 39 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 40 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 41 | `pubts` | 时间戳 | `pubts` | DateTime |
| 42 | `remark` | 备注 | `remark` | String |
| 43 | `returncount` | 退回次数 | `returncount` | Short |
| 44 | `status` | 单据状态 | `status` | String |
| 45 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 46 | `tplid` | 模板id | `tplid` | Long |
| 47 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 48 | `verifystate` | 审批状态 | `verifystate` | Short |
| 49 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 50 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 51 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 52 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 53 | `salesForecastAttrextItems` | 表头自定义项 | `` | 62e0f66e-cb20-4e0e-bf97-e3a6344f4a40 |
| 54 | `salesForecastDetail` | 预测单子表 | `` | 6b4fb6a5-cf8c-4b89-b344-340b16f3ba5b |
| 55 | `salesForecastUserdefItem` | 表头固定自定义项 | `` | 165e3887-68ee-4f8b-84c5-1fc62c796b99 |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `period` | 期间 | `mr.timebucket.TimeBucket` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `departmentId` | 部门ID | `aa.baseorg.DeptMV` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 7 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 8 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 9 | `salesForecastAttrextItems` | 表头自定义项 | `mr.salesforecast.SalesForecastAttrextItem` | None | true |
| 10 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 11 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 12 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 13 | `salesForecastDetail` | 预测单子表 | `mr.salesforecast.SalesForecastDetail` | None | true |
| 14 | `userDefineCharacterH` | 自定义项特征组 | `mr.salesforecast.SalesForecastDCT` | None |  |
| 15 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 16 | `salesForecastUserdefItem` | 表头固定自定义项 | `mr.salesforecast.SalesForecastUserdefItem` | None | true |
| 17 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
