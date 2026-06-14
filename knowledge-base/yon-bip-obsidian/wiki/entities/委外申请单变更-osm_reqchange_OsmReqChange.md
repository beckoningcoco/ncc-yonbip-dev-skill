---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.reqchange.OsmReqChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外申请单变更 (`osm.reqchange.OsmReqChange`)

> OSM | 物理表：`osm_req_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外申请单变更 |
| 物理表 | `osm_req_change` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:55:18.1340` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（57个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `auditDate` | 审批日期 | `audit_date` | Date |
| 2 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 3 | `auditor` | 审批人名称 | `auditor` | String |
| 4 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 6 | `changeFlag` | 变更标识 | `change_flag` | Short |
| 7 | `changeVersion` | 变更版本号 | `change_version` | Integer |
| 8 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 9 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 10 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 11 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 12 | `closer` | 关闭人名称 | `closer` | String |
| 13 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `code` | 单据编号 | `code` | String |
| 15 | `createDate` | 创建日期 | `create_date` | Date |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime |
| 17 | `creator` | 创建人名称 | `creator` | String |
| 18 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `defineCharacteristics` | 自定义项特征组 | `define_cts` | d6bb15ae-8e5e-454b-8ed6-f763d77fdf77 |
| 20 | `departmentId` | 需求部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 21 | `externalSourceType` | 外部系统类型 | `external_source_type` | String |
| 22 | `id` | id | `id` | Long |
| 23 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 24 | `isVersions` | 是否最新版本 | `is_versions` | Boolean |
| 25 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 26 | `modifier` | 修改人名称 | `modifier` | String |
| 27 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 28 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 29 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 30 | `operatorId` | 需求人员 | `operator_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 31 | `orgId` | 需求组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 32 | `originalReqId` | 原委外申请单ID | `original_req_id` | 7d6905c0-a11a-44da-bad1-2990cbce269e |
| 33 | `osmBusiType` | 业务类型 | `osm_busi_type` | Integer |
| 34 | `out_sys_code` | 外部来源编码 | `out_sys_code` | String |
| 35 | `out_sys_id` | 外部来源线索 | `out_sys_id` | String |
| 36 | `out_sys_type` | 外部来源类型 | `out_sys_type` | String |
| 37 | `out_sys_version` | 外部来源版本 | `out_sys_version` | String |
| 38 | `overOrder` | 允许超量 | `over_order` | Short |
| 39 | `printCount` | 打印次数 | `printCount` | Integer |
| 40 | `pubts` | 时间戳 | `pubts` | DateTime |
| 41 | `reasonMemo` | 变更原因 | `reason_memo` | String |
| 42 | `remark` | 备注 | `remark` | String |
| 43 | `reqExecStatus` | 执行状态 | `req_exec_status` | OsmReqExecStatus |
| 44 | `returncount` | 退回次数 | `returncount` | Short |
| 45 | `sourceType` | 来源类别 | `source_type` | String |
| 46 | `status` | 单据状态 | `status` | Short |
| 47 | `subcontractRequisitionProductChange` | 委外申请单产品变更 | `` | 3b18adf7-8938-4841-b5af-5f11d4a5b9b0 |
| 48 | `submitTime` | 提交时间 | `submit_time` | DateTime |
| 49 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 50 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 51 | `tplid` | 模板id | `tplid` | Long |
| 52 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 53 | `verifystate` | 审批状态 | `verifystate` | Short |
| 54 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 55 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime |
| 56 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 57 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `submitter` | 提交人 | `base.user.BipUser` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `departmentId` | 需求部门 | `aa.baseorg.DeptMV` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 7 | `subcontractRequisitionProductChange` | 委外申请单产品变更 | `osm.reqchange.OsmReqProductChange` | None | true |
| 8 | `orgId` | 需求组织 | `org.func.BaseOrg` | Service |  |
| 9 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 10 | `defineCharacteristics` | 自定义项特征组 | `osm.reqchange.OsmReqChangeDefineCharacteristics` | None |  |
| 11 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | Service |  |
| 12 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 13 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 14 | `originalReqId` | 原委外申请单ID | `po.subcontractrequisition.SubcontractRequisition` | None |  |
| 15 | `operatorId` | 需求人员 | `bd.staff.Staff` | Service |  |
| 16 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 17 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
