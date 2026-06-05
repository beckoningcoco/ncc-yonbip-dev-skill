---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.retentionsampleprocess.RetentionSampleProcess"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 留样处理单 (`QMSQIT.retentionsampleprocess.RetentionSampleProcess`)

> QMSQIT | 物理表：`qms_qit_retentionsamprocess`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 留样处理单 |
| 物理表 | `qms_qit_retentionsamprocess` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:41:40.3640` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（36个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 质检组织id | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 4 | `code` | 编码 | `code` | String |
| 5 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 6 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 7 | `returncount` | 退回次数 | `returncount` | Short |
| 8 | `processType` | 处理类型 | `process_type` | String |
| 9 | `previewPrintCount` | 预览打印次数 | `previewPrintCount` | Integer |
| 10 | `printCount` | 打印次数 | `printCount` | Integer |
| 11 | `remark` | 备注 | `remark` | String |
| 12 | `verifystate` | 审批状态 | `verifystate` | Short |
| 13 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 14 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 15 | `modifier` | 修改人名称 | `modifier` | String |
| 16 | `processPeople` | 业务员 | `process_people` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 17 | `definect_h` | 自定义特征 | `definect_h` | 13b54837-dbe0-4885-8b4f-87b59c681d48 |
| 18 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `dr` | 逻辑删除标记 | `dr` | Short |
| 21 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 22 | `tplid` | 模板id | `tplid` | Long |
| 23 | `tenant` | 租户 | `tenant_id` | String |
| 24 | `auditDate` | 审批日期 | `audit_date` | Date |
| 25 | `createDate` | 创建日期 | `create_date` | Date |
| 26 | `creator` | 创建人名称 | `creator` | String |
| 27 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 28 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 29 | `directPrintCount` | 直接打印次数 | `directPrintCount` | Integer |
| 30 | `auditor` | 审批人名称 | `auditor` | String |
| 31 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 32 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 33 | `createTime` | 创建时间 | `create_time` | DateTime |
| 34 | `status` | 单据状态 | `status` | Short |
| 35 | `pubts` | 时间戳 | `pubts` | DateTime |
| 36 | `detailList` | 留样处理单详细信息 | `` | 1dcd722a-bbd9-4b80-935a-6be7ddfe3c8c |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 2 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `processPeople` | 业务员 | `bd.staff.Staff` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `detailList` | 留样处理单详细信息 | `QMSQIT.retentionsampleprocess.RetentionSampleProcessDetail` | None | true |
| 8 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 9 | `definect_h` | 自定义特征 | `QMSQIT.retentionsampleprocess.RetentionSampleProcessDefine` | None |  |
| 10 | `orgId` | 质检组织id | `org.func.QualityOrg` | Service |  |
