---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractrequisition.SubcontractRequisition"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外申请单 (`po.subcontractrequisition.SubcontractRequisition`)

> OSM | 物理表：`po_subcontract_requisition`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外申请单 |
| 物理表 | `po_subcontract_requisition` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:56:26.4780` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 单据号 |

---

## 直接属性（56个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 2 | `overOrder` | 允许超量 | `over_order` | Short |
| 3 | `defineCharacteristics` | 自定义项特征组 | `define_cts` | bb24f03a-93d5-482a-bf58-f3c12ef23fbb |
| 4 | `sourceType` | 来源类别 | `source_type` | String |
| 5 | `id` | ID | `id` | Long |
| 6 | `osmBusiType` | 业务类型 | `osm_busi_type` | Integer |
| 7 | `reqExecStatus` | 执行状态 | `req_exec_status` | OsmReqExecStatus |
| 8 | `changeVersion` | 变更版本号 | `change_version` | Integer |
| 9 | `changeFlag` | 变更标识 | `change_flag` | Short |
| 10 | `externalSourceType` | 外部系统类型 | `external_source_type` | String |
| 11 | `submitTime` | 提交时间 | `submit_time` | DateTime |
| 12 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 13 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime |
| 14 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 15 | `out_sys_id` | 外部来源线索 | `out_sys_id` | String |
| 16 | `out_sys_code` | 外部来源编码 | `out_sys_code` | String |
| 17 | `out_sys_version` | 外部来源版本 | `out_sys_version` | String |
| 18 | `out_sys_type` | 外部来源类型 | `out_sys_type` | String |
| 19 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 20 | `orgId` | 需求组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 21 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 22 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 23 | `code` | 单据号 | `code` | String |
| 24 | `departmentId` | 需求部门ID | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 25 | `operatorId` | 需求人员 | `operator_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 26 | `status` | 状态 | `status` | Short |
| 27 | `remark` | 备注 | `remark` | String |
| 28 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 29 | `verifystate` | 审批状态 | `verifystate` | Short |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime |
| 31 | `modifier` | 修改人 | `modifier` | String |
| 32 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 33 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 34 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 35 | `creator` | 创建人 | `creator` | String |
| 36 | `createTime` | 创建时间 | `create_time` | DateTime |
| 37 | `auditor` | 审核人 | `auditor` | String |
| 38 | `auditTime` | 审核时间 | `audit_time` | DateTime |
| 39 | `auditDate` | 审核日期 | `audit_date` | Date |
| 40 | `closer` | 关闭人 | `closer` | String |
| 41 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 42 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 43 | `closeReasonId` | 关闭原因ID | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 44 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 45 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 46 | `tplid` | 模板id | `tplid` | Long |
| 47 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 48 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 49 | `returncount` | 退回次数 | `returncount` | Short |
| 50 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 51 | `createDate` | 创建日期 | `create_date` | Date |
| 52 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 53 | `headExtItem` | 表头自由自定义项 | `` | b7dd9a25-6e1f-441a-b4d4-d3cd691c23ef |
| 54 | `orderUserdefItem` | 表头固定自定义项 | `` | 39b717a1-cef8-4232-a40d-1a9ddb3b318b |
| 55 | `printCount` | 打印次数 | `printCount` | Integer |
| 56 | `subcontractRequisitionProduct` | 委外申请单行 | `` | 88cbcf2d-a040-4a0b-845a-25bce8d0fb5d |

---

## 关联属性（18个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `submitter` | 提交人 | `base.user.BipUser` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `departmentId` | 需求部门ID | `aa.baseorg.DeptMV` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 7 | `headExtItem` | 表头自由自定义项 | `po.subcontractrequisition.SubcontractRequisitionExtItem` | None | true |
| 8 | `orgId` | 需求组织ID | `org.func.BaseOrg` | Service |  |
| 9 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 10 | `defineCharacteristics` | 自定义项特征组 | `po.subcontractrequisition.RequisitionDefineCharacteristics` | None |  |
| 11 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | Service |  |
| 12 | `subcontractRequisitionProduct` | 委外申请单行 | `po.subcontractrequisition.SubcontractRequisitionProduct` | None | true |
| 13 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 14 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 15 | `operatorId` | 需求人员 | `bd.staff.Staff` | Service |  |
| 16 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 17 | `closeReasonId` | 关闭原因ID | `aa.reason.Reason` | Service |  |
| 18 | `orderUserdefItem` | 表头固定自定义项 | `po.subcontractrequisition.SubcontractRequisitionDefine` | None | true |
