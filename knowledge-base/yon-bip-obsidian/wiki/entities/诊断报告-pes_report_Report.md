---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.report.Report"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 诊断报告 (`pes.report.Report`)

> IMP_PES | 物理表：`pes_dim_rpt`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 诊断报告 |
| 物理表 | `pes_dim_rpt` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:17:38.9520` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（49个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ReportResult` | 诊断报告结果 | `` | 2e99f49a-e5a5-4299-bb00-d8912f8c9160 |
| 2 | `auditDate` | 审批日期 | `audit_date` | Date |
| 3 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 4 | `auditor` | 审批人名称 | `auditor` | String |
| 5 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 7 | `businessStatus` | 业务状态 | `business_status` | String |
| 8 | `code` | 编码 | `code` | String |
| 9 | `copyCount` | 复制次数 | `copy_count` | Integer |
| 10 | `createDate` | 创建日期 | `create_date` | Date |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `creator` | 创建人名称 | `creator` | String |
| 13 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `customId` | 客户 | `custom_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 15 | `customerLevelId` | 客户级别 | `customer_level_id` | 40e121d8-8927-4bf1-ba4f-22a7b9f7b3b5 |
| 16 | `dispatchStatus` | 调度启用 | `dispatch_status` | Boolean |
| 17 | `equipmentId` | 设备 | `equipment_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 18 | `fileId` | 报告文件id | `file_id` | String |
| 19 | `fileTime` | 报告文件生成时间 | `file_time` | DateTime |
| 20 | `fileUrl` | 报告文件地址 | `file_url` | String |
| 21 | `fromDateTime` | 从日期 | `from_date_time` | DateTime |
| 22 | `id` | ID | `id` | Long |
| 23 | `intervalCycle` | 间隔周期/天 | `interval_cycle` | String |
| 24 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 25 | `isReported` | 已生成报告 | `reported` | Boolean |
| 26 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 27 | `modifier` | 修改人名称 | `modifier` | String |
| 28 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 29 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 30 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 31 | `name` | 名称 | `name` | String |
| 32 | `orgId` | 组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 33 | `pubts` | 时间戳 | `pubts` | DateTime |
| 34 | `qrcodeId` | 服务二维码 | `qrcode_id` | 512facdf-faea-4470-b3ff-5b2e5476f268 |
| 35 | `reportDetail` | 设备指标 | `` | c3d1cceb-f6b0-4187-916e-c6e71f727f33 |
| 36 | `reportExecutionLogVO` | 执行日志 | `` | 69d62750-2543-45f0-a1f3-5dd2f300f6fc |
| 37 | `reportRecord` | 诊断报告发布记录 | `` | cb2b8e92-4b58-4688-9782-32866864626d |
| 38 | `reportTemplateId` | 诊断报告模板 | `report_template_id` | 1e97a78e-5f7f-4f01-abd6-a6d99845cd2e |
| 39 | `returncount` | 退回次数 | `returncount` | Short |
| 40 | `status` | 单据状态 | `status` | String |
| 41 | `suggest` | 专家建议 | `suggest` | String |
| 42 | `taskId` | 调度任务id | `task_id` | String |
| 43 | `templateContentId` | 模板内容 | `template_content_id` | 67a65644-5898-4be8-a94a-55252c1b74f4 |
| 44 | `tenant` | 租户ID | `tenant_id` | String |
| 45 | `toDateTime` | 到日期 | `to_date_time` | DateTime |
| 46 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 47 | `verifystate` | 审批状态 | `verifystate` | Short |
| 48 | `vouchdate` | 单据日期 | `vouchdate` | DateTime |
| 49 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `reportExecutionLogVO` | 执行日志 | `pes.report.ReportExecutionLogVO` | None | true |
| 2 | `templateContentId` | 模板内容 | `pes.dimTpl.DimTpl` | None |  |
| 3 | `reportRecord` | 诊断报告发布记录 | `pes.report.ReportRecord` | None | true |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `customerLevelId` | 客户级别 | `aa.agentlevel.AgentLevel` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 9 | `ReportResult` | 诊断报告结果 | `pes.report.ReportResult` | None | true |
| 10 | `reportTemplateId` | 诊断报告模板 | `pes.reporttemplate.ReportTemplate` | None |  |
| 11 | `customId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 12 | `equipmentId` | 设备 | `aim.equip.EquipHeadVO` | Service |  |
| 13 | `orgId` | 组织 | `aa.baseorg.OrgMV` | Service |  |
| 14 | `reportDetail` | 设备指标 | `pes.report.ReportDetail` | None | true |
| 15 | `qrcodeId` | 服务二维码 | `pes.qrCode.PesServiceQrCode` | None |  |
| 16 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 17 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
