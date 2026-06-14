---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.decisionchange.CpuDecisionChange"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购结果变更主表 (`lawbid.decisionchange.CpuDecisionChange`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_decision_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购结果变更主表 |
| 物理表 | `cpu_decision_change` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:24:39.6840` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `decision_change_code` | String | 定标变更单编码 |

## 部署信息

- 部署时间: 2026-05-22 23:54:59:000

## 依赖接口（10个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 审批兼容信息 | `lawbid.commonitf.ICompatibleFlowInfo` | 6 |
| 2 | 审批流信息 | `base.itf.IApprovalFlow` | 134 |
| 3 | 自动编号 | `voucher.base.IAutoCode` | 49 |
| 4 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 5 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 6 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 7 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 8 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 9 | 定标变更主表接口 | `lawdecision.itf.ICpuDecisionChange` | 121 |
| 10 | 审批信息 | `base.itf.IApprovalInfo` | 172 |

---

## 直接属性（57个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `decisionChangeName` | 变更标题 | `decision_change_name` | String |
| 2 | `decisionChangeType` | 变更类型 | `decision_change_type` | Integer |
| 3 | `decisionChangeOrigin` | 变更发起方 | `decision_change_origin` | Integer |
| 4 | `tenantId` | 租户id | `tenant_id` | String |
| 5 | `code` | 定标变更单编码 | `decision_change_code` | String |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `createDate` | 创建日期 | `create_date` | Date |
| 9 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 10 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `dr` | 逻辑删除标记 | `dr` | Short |
| 12 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime |
| 14 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 15 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 16 | `bidProjectCode` | 采购项目编码 | `bid_project_code` | String |
| 17 | `bidProjectName` | 采购项目名称 | `bid_project_name` | String |
| 18 | `ts` | 时间戳 | `ts` | DateTime |
| 19 | `purchaseType` | 采购类别 | `purchase_type` | String |
| 20 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 21 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 22 | `status` | 云审状态 | `workflow_status` | Short |
| 23 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 24 | `auditor` | 审批人名称 | `auditor` | String |
| 25 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 26 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 27 | `auditDate` | 审批日期 | `audit_date` | Date |
| 28 | `tenant` | 租户ID | `tenant_id` | String |
| 29 | `decisionChangePersonName` | 变更人 | `decision_change_person_name` | String |
| 30 | `decisionChangeDate` | 变更时间 | `decision_change_date` | Date |
| 31 | `decisionChangeResponsible` | 变更责任方 | `decision_change_responsible` | Integer |
| 32 | `decisionChangeReason` | 变更理由 | `decision_change_reason` | String |
| 33 | `id` | id | `id` | Long |
| 34 | `decisionChangeFileId` | 变更附件 | `decision_change_file_id` | String |
| 35 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer |
| 36 | `oldBillNum` | 原始单据号 | `old_bill_num` | String |
| 37 | `flowSource` | 审批源 | `flow_source` | String |
| 38 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 39 | `verifystate` | 审批状态 | `verifystate` | Short |
| 40 | `returncount` | 退回次数 | `returncount` | Short |
| 41 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 42 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 43 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 44 | `purOrgId` | 采购组织主键 | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 45 | `bidProjectId` | 采购项目主键 | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 46 | `decisionId` | 采购结果id | `decision_id` | 1fc86047-2eea-424c-b46f-8fd24fdcc970 |
| 47 | `bidSectionId` | 标段包id | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 48 | `billstate` | 单据状态 | `bill_state` | Integer |
| 49 | `creator` | 创建人 | `creator` | String |
| 50 | `modifier` | 修改人 | `modifier` | String |
| 51 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 52 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 53 | `vouchdate` | 单据日期 | `vouchdate` | DateTime |
| 54 | `approveEndTime` | 审批通过时间 | `approve_end_time` | DateTime |
| 55 | `approveStartTime` | 审批开始时间 | `approve_start_time` | DateTime |
| 56 | `decisionChangePersonId` | 变更人id | `decision_change_person_id` | String |
| 57 | `materialList` | 中标物料明细 | `` | cae271e3-ab7d-481f-870e-6358088003fe |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织主键 | `org.func.BaseOrg` | Service |  |
| 2 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 3 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `materialList` | 中标物料明细 | `lawbid.decisionchange.CpuDsnChangeMaterialDetail` | None | true |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 8 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 9 | `decisionId` | 采购结果id | `lawbid.decisionresult.CpuDecision` | None |  |
| 10 | `bidProjectId` | 采购项目主键 | `lawbid.project.LawbidProject` | None |  |
| 11 | `bidSectionId` | 标段包id | `lawbid.section.LawbidSection` | None |  |
