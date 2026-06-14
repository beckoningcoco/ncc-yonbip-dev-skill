---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.retentionsample.RetentionSampleHead"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 留样单 (`QMSQIT.retentionsample.RetentionSampleHead`)

> QMSQIT | 物理表：`qms_qit_retentionsample_h`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 留样单 |
| 物理表 | `qms_qit_retentionsample_h` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:41:44.4800` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |
| 编码 | `code` | String | 单据编号 |

---

## 直接属性（30个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 质检组织id | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 2 | `code` | 单据编号 | `code` | String |
| 3 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 4 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 5 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 6 | `retentionDate` | 留样日期 | `retention_date` | Date |
| 7 | `retentionPersonId` | 留样人id | `retention_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 8 | `retentionDeptId` | 留样部门id | `retention_dept_id` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 9 | `remark` | 备注 | `remark` | String |
| 10 | `definect_h` | 自定义项特征 | `definect_h` | f5c8b041-8c1b-4d34-b9fa-b37682773936 |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 12 | `dr` | 逻辑删除标记 | `dr` | Short |
| 13 | `auditor` | 审批人名称 | `auditor` | String |
| 14 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 16 | `auditDate` | 审批日期 | `audit_date` | Date |
| 17 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 18 | `verifystate` | 审批状态 | `verifystate` | Short |
| 19 | `returncount` | 退回次数 | `returncount` | Short |
| 20 | `createTime` | 创建时间 | `create_time` | DateTime |
| 21 | `createDate` | 创建日期 | `create_date` | Date |
| 22 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 23 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 24 | `creator` | 创建人名称 | `creator` | String |
| 25 | `modifier` | 修改人名称 | `modifier` | String |
| 26 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 27 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 28 | `id` | 主键 | `id` | Long |
| 29 | `pubts` | 时间戳 | `pubts` | DateTime |
| 30 | `RetentionSampleBodyList` | 留样信息 | `` | 05398c4a-3480-40c0-acab-b45ee39a229d |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 2 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 3 | `retentionPersonId` | 留样人id | `bd.staff.Staff` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `retentionDeptId` | 留样部门id | `bd.adminOrg.DeptOrgVO` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `RetentionSampleBodyList` | 留样信息 | `QMSQIT.retentionsample.RetentionSampleBody` | None | true |
| 9 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 10 | `definect_h` | 自定义项特征 | `QMSQIT.retentionsample.RetentionSampleHDefineCharacter` | None |  |
| 11 | `orgId` | 质检组织id | `org.func.QualityOrg` | Service |  |
