---
tags: ["BIP", "元数据", "数据字典", "ycQualityCollaboration", "suchangeCollab.supplierCn.CpuSupplierCnVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商产品变更信息 (`suchangeCollab.supplierCn.CpuSupplierCnVO`)

> ycQualityCollaboration | 物理表：`cpu_suppliercn`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商产品变更信息 |
| 物理表 | `cpu_suppliercn` |
| 数据库 schema | `yonbip-cpu-synergy` |
| 所属应用 | `ycQualityCollaboration` |
| 构建时间 | `2026-06-04 23:30:58.2640` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（51个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `buyerTenantName` | 采购商 | `buyer_tenant_name` | String |
| 3 | `orgId` | 采购组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 4 | `transtypeId` | 交易类型ID | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 5 | `isAccepted` | 是否接受 | `isAccepted` | Boolean |
| 6 | `applicantId` | 申请人ID | `applicant_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 7 | `collaborativeProcesse` | 协同流程 | `collaborative_processe` | Short |
| 8 | `supplierId` | 供应商ID | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 9 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 10 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 11 | `source` | 上游单据类型 | `source` | String |
| 12 | `upcode` | 采方单据编码 | `upcode` | String |
| 13 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 14 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 15 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 16 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 17 | `initiatorType` | 发起方 | `initiator_type` | Short |
| 18 | `billStatus` | 单据状态 | `bill_status` | Short |
| 19 | `collabStatus` | 协同状态 | `collab_status` | Short |
| 20 | `buyerRemark` | 采购商备注 | `buyer_remark` | String |
| 21 | `supplierRemark` | 供应商备注 | `supplier_remark` | String |
| 22 | `buyerAttachmentId` | 采购商附件 | `buyer_attachment_id` | String |
| 23 | `supplierAttachmentId` | 供应商附件 | `supplier_attachment_id` | String |
| 24 | `expectedChangeDate` | 生效日期 | `expected_change_date` | DateTime |
| 25 | `finalChangeDate` | 失效日期 | `final_change_date` | DateTime |
| 26 | `changePurpose` | 变更目的 | `change_purpose` | String |
| 27 | `changeReason` | 变更原因 | `change_reason` | String |
| 28 | `changeType` | 变更类型 | `change_type` | Short |
| 29 | `changeDescription` | 变更内容 | `change_description` | String |
| 30 | `changeImpact` | 变更影响 | `change_impact` | String |
| 31 | `beforeChange` | 变更前情况 | `before_change` | String |
| 32 | `afterChange` | 变更后情况 | `after_change` | String |
| 33 | `refusalReason` | 拒绝理由 | `refusal_reason` | String |
| 34 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 35 | `vendorContatPersonId` | 供方联系人ID | `vendorcontat_personid` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 36 | `CpuSupplierCnVODefineCtId` | 变更协同自定义项特征ID | `suppliercn_define_ct_id` | 7c21dfc2-b647-4e9b-ae79-41153e791c19 |
| 37 | `createTime` | 创建时间 | `create_time` | DateTime |
| 38 | `creatorId` | 创建人 | `creatorId` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 39 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 40 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 41 | `code` | 编码 | `code` | String |
| 42 | `printCount` | 打印次数 | `printCount` | Integer |
| 43 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 44 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 45 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 46 | `dr` | 逻辑删除标记 | `dr` | Short |
| 47 | `pubts` | 时间戳 | `pubts` | DateTime |
| 48 | `CpuSupplierCnBody` | 变更协同表体物料信息 | `` | 29f4eb4f-5d80-4a2b-ae80-9c0f7e0acfd3 |
| 49 | `closePrevBillStatus` | 关闭前单据状态 | `close_prev_billStatus` | Short |
| 50 | `supApplicantId` | 供方申请人ID | `sup_applicant_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 51 | `title` | 变更标题 | `title` | String |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `vendorContatPersonId` | 供方联系人ID | `base.user.BipUser` | Service |  |
| 2 | `supplierId` | 供应商ID | `aa.vendor.Vendor` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `CpuSupplierCnVODefineCtId` | 变更协同自定义项特征ID | `suchangeCollab.supplierCn.CpuSupplierCnVODefineCt` | None |  |
| 5 | `creatorId` | 创建人 | `base.user.BipUser` | Service |  |
| 6 | `supApplicantId` | 供方申请人ID | `bd.staff.Staff` | Service |  |
| 7 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 8 | `CpuSupplierCnBody` | 变更协同表体物料信息 | `suchangeCollab.supplierCn.CpuSupplierCnBody` | None | true |
| 9 | `applicantId` | 申请人ID | `bd.staff.Staff` | Service |  |
| 10 | `transtypeId` | 交易类型ID | `bd.bill.TransType` | Service |  |
| 11 | `orgId` | 采购组织ID | `org.func.BaseOrg` | Service |  |
