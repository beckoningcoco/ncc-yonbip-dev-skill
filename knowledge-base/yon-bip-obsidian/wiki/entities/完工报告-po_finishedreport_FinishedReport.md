---
tags: ["BIP", "元数据", "数据字典", "PO", "po.finishedreport.FinishedReport"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 完工报告 (`po.finishedreport.FinishedReport`)

> PO | 物理表：`po_finished_report`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 完工报告 |
| 物理表 | `po_finished_report` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:33:26.9780` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（53个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `autoPush` | 自动下推 | `auto_push` | Boolean |
| 2 | `isCard` | 是否流转卡下推 | `is_card` | Boolean |
| 3 | `offChartReceipt` | 表外产出 | `off_chart_receipt` | Boolean |
| 4 | `isGenerateBarcode` | 自动生码 | `is_generate_barcode` | Boolean |
| 5 | `autoInspection` | 自动检验 | `auto_inspection` | Boolean |
| 6 | `defineCharacter` | 自定义项特征属性组 | `define_ct` | ba37cdf0-1042-4f4f-8fff-b34008bb7fab |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 8 | `id` | ID | `id` | Long |
| 9 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 10 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 11 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 12 | `code` | 单据编号 | `code` | String |
| 13 | `productionDepartmentId` | 生产部门 | `production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 14 | `operatorId` | 报告人 | `operator_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 15 | `status` | 单据状态 | `status` | Short |
| 16 | `createDate` | 创建日期 | `create_date` | Date |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 18 | `auditDate` | 审核日期 | `audit_date` | Date |
| 19 | `remark` | 备注 | `remark` | String |
| 20 | `barCode` | 单据条码 | `bar_code` | String |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 23 | `printCount` | 打印次数 | `printCount` | Integer |
| 24 | `verifystate` | 审批状态 | `verifystate` | Short |
| 25 | `returncount` | 退回次数 | `returncount` | Short |
| 26 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 27 | `creator` | 创建人 | `creator` | String |
| 28 | `createTime` | 创建时间 | `create_time` | DateTime |
| 29 | `modifierId` | 最后修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 30 | `modifier` | 最后修改人 | `modifier` | String |
| 31 | `modifyTime` | 最后修改时间 | `modify_time` | DateTime |
| 32 | `auditorId` | 审核人ID | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 33 | `auditor` | 审核人 | `auditor` | String |
| 34 | `auditTime` | 审核时间 | `audit_time` | DateTime |
| 35 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 36 | `isFlowCoreBill` | 是否核心单据 | `isFlowCoreBill` | Boolean |
| 37 | `tplid` | 模板id | `tplid` | Long |
| 38 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 39 | `source` | 来源单据类型 | `source` | String |
| 40 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 41 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 42 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 43 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 44 | `closer` | 关闭人名称 | `closer` | String |
| 45 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 46 | `finishedReportDetail` | 完工报告详情 | `` | d8490919-eda7-40f8-a9a3-9869fc46b507 |
| 47 | `finishedReportSrcDt` | 完工报告来源明细 | `` | fea3ef35-d0ef-4668-8e2f-9fdc36f96b75 |
| 48 | `finishedReportUserdefItem` | 表头固定自定义项 | `` | 93535196-092f-4a24-aaa9-78468ca36113 |
| 49 | `headExtItem` | 表头自由自定义项 | `` | 3565df4a-e9fb-4dd8-b387-ecd4df88ef2c |
| 50 | `submitTime` | 提交时间 | `submit_time` | DateTime |
| 51 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 52 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime |
| 53 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |

---

## 关联属性（19个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `submitter` | 提交人 | `base.user.BipUser` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人ID | `base.user.User` | Service |  |
| 4 | `modifierId` | 最后修改人ID | `base.user.User` | Service |  |
| 5 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 6 | `headExtItem` | 表头自由自定义项 | `po.finishedreport.FinishedReportExtItem` | None | true |
| 7 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 8 | `finishedReportUserdefItem` | 表头固定自定义项 | `po.finishedreport.FinishedReportUserdefItem` | None | true |
| 9 | `auditorId` | 审核人ID | `base.user.User` | Service |  |
| 10 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | Service |  |
| 11 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 12 | `finishedReportSrcDt` | 完工报告来源明细 | `po.finishedreport.FinishedReportSrcDt` | None | true |
| 13 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 14 | `productionDepartmentId` | 生产部门 | `aa.baseorg.DeptMV` | Service |  |
| 15 | `defineCharacter` | 自定义项特征属性组 | `po.finishedreport.DefineCharacter` | None |  |
| 16 | `operatorId` | 报告人 | `bd.staff.Staff` | Service |  |
| 17 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 18 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 19 | `finishedReportDetail` | 完工报告详情 | `po.finishedreport.FinishedReportDetail` | None | true |
