---
tags: [BIP, metadata, st, PickingRequisition]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 出库申请单 (st.pickingrequisition.PickingRequisition)

> Platform: BIP V5 | Module: st | Table: po_picking_requisition | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 出库申请单 |
| uri | st.pickingrequisition.PickingRequisition |
| tableName | po_picking_requisition |
| domain | ustock |
| applicationCode | ST |
| superUri | voucher.base.Vouch |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (8)

| # | Name | URI |
|---|------|-----|
| 1 | 审批信息 (IApprovalInfo) | base.itf.IApprovalInfo |
| 2 | 关闭信息 (IClosing) | base.itf.IClosing |
| 3 | 锁定信息 (ILock) | base.itf.ILock |
| 4 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 5 | 流程接口 (IBusinessFlow) | base.itf.IBusinessFlow |
| 6 | 条形码 (IBarCode) | ucfbase.ucfbaseItf.IBarCode |
| 7 | 打印次数 (IPrintCount) | base.itf.IPrintCount |
| 8 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (57)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | vendor | 委外供应商 | iVendorId | quote | aa.vendor.Vendor |  |  | dataPowerFlag,data_auth,nullable |
| 2 | auditorId | 审批人 | auditorId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 3 | closerId | 关闭人 | closerId | quote | base.user.User |  |  | BUSINESSMESSAGE,nullable |
| 4 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 5 | lockDate | 锁定日期 | lock_Date | date | Date |  |  | nullable |
| 6 | tcOrgAccount | 跨组织委外结算 | tc_org_account | short | Short |  |  | nullable |
| 7 | lendSupplier | 借用对象供应商 | lend_supplier | quote | aa.vendor.Vendor |  |  | nullable |
| 8 | costAccountingMethod | 委外成本核算方式 | cost_accounting_method | int | Integer |  |  | nullable |
| 9 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 10 | lockTime | 锁定时间 | lock_time | timestamp | Timestamp |  |  | nullable,reportHide |
| 11 | locker | 锁定人 | locker | text | String |  |  | isGlobalization,nullable |
| 12 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 13 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 14 | requisitionDefineCharacter | 自定义项特征属性组 | requisitionDefineCharacter | UserDefine | st.pickingrequisition.RequisitionDefineCharacter |  |  | nullable |
| 15 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 16 | tplid | 模板id | tplid | long | Long |  |  | isBusinessLog,nullable |
| 17 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 18 | orgId | 申请组织 | org_id | quote | aa.baseorg.OrgMV |  |  | isMasterOrg,nullable |
| 19 | transTypeId | 交易类型 | trans_type_id | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 20 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | isBusinessLog,nullable |
| 21 | code | 单据编号 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 22 | productionDepartmentId | 申请部门 | production_department_id | quote | aa.baseorg.DeptMV |  |  | data_auth,nullable |
| 23 | operatorId | 申请人 | operator_id | quote | bd.staff.Staff |  |  | data_auth,nullable |
| 24 | status | 单据状态 | status | short | Short |  |  | isBusinessLog,nullable |
| 25 | requisitionType | 申请类型 | requisition_type | text | String |  |  | nullable |
| 26 | srcBillType | 来源单据类型 | cSrcBillType | text | String |  |  | bMakeBill,nullable |
| 27 | nextBillType | 下游单据类型 | nextbill_type | text | String |  |  | nullable |
| 28 | barCode | 单据条码 | bar_code | text | String |  |  | nullable |
| 29 | remark | 备注 | remark | text | String |  |  | nullable |
| 30 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 31 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 32 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 33 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 34 | auditDate | 审核日期 | audit_date | date | Date |  |  | nullable |
| 35 | closeDate | 关闭日期 | close_Date | date | Date |  |  | nullable |
| 36 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 37 | creator | 创建人 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 38 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 39 | modifier | 最后修改人 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 40 | modifyTime | 最后修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 41 | auditor | 审核人 | auditor | text | String |  |  | isGlobalization,nullable |
| 42 | auditTime | 审核时间 | audit_time | timestamp | Timestamp |  |  | nullable |
| 43 | closer | 关闭人 | closer | text | String |  |  | isGlobalization,nullable,reportHide |
| 44 | closeTime | 关闭时间 | close_time | timestamp | Timestamp |  |  | nullable,reportHide |
| 45 | bizFlow | 流程ID | bizFlowId | quote | bf.bizflow.BusinessFlow |  |  | nullable,reportHide |
| 46 | isFlowCoreBill | 是否核心单据 | isFlowCoreBill | switch | Boolean |  |  | nullable,reportHide |
| 47 | lendType | 借用对象类型 | lend_type | short | Short |  |  | nullable |
| 48 | lendDept | 借出部门 | lend_dept | quote | aa.baseorg.DeptMV |  |  | nullable |
| 49 | lendCustom | 借出客户 | lend_custom | quote | aa.merchant.Merchant |  |  | nullable |
| 50 | isConvert | 转换 | isConvert | text | String |  |  | nullable |
| 51 | lendUser | 借出人员 | lend_user | quote | bd.staff.Staff |  |  | nullable |
| 52 | printCount | 打印次数 | printCount | int | Integer |  |  | nullable,reportHide |
| 53 | serviceNo | 服务单号 | service_no | text | String |  |  | nullable |
| 54 | defines | 出库申请单主表自由自定义项 | - | - | st.pickingrequisition.PickingRequisitionDefine |  |  |  |
| 55 | pickingRequisitionUserdefItem | 表头固定自定义项 | - | - | st.pickingrequisition.PickingRequisitionUserdefItem |  |  |  |
| 56 | purpose | 用途 | purpose | text | String |  |  | nullable |
| 57 | requisitionDetail | 出库申请单详情 | - | - | st.pickingrequisition.PickingRequisitionDetail |  |  |  |

---

## Reference Fields (16)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | vendor | 委外供应商 | iVendorId | aa.vendor.Vendor |
| 2 | auditorId | 审批人 | auditorId | base.user.User |
| 3 | closerId | 关闭人 | closerId | base.user.User |
| 4 | lendSupplier | 借用对象供应商 | lend_supplier | aa.vendor.Vendor |
| 5 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 6 | modifierId | 修改人 | modifierId | base.user.User |
| 7 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 8 | orgId | 申请组织 | org_id | aa.baseorg.OrgMV |
| 9 | transTypeId | 交易类型 | trans_type_id | bd.bill.TransType |
| 10 | productionDepartmentId | 申请部门 | production_department_id | aa.baseorg.DeptMV |
| 11 | operatorId | 申请人 | operator_id | bd.staff.Staff |
| 12 | creatorId | 创建人 | creatorId | base.user.User |
| 13 | bizFlow | 流程ID | bizFlowId | bf.bizflow.BusinessFlow |
| 14 | lendDept | 借出部门 | lend_dept | aa.baseorg.DeptMV |
| 15 | lendCustom | 借出客户 | lend_custom | aa.merchant.Merchant |
| 16 | lendUser | 借出人员 | lend_user | bd.staff.Staff |

---

## Number Fields (7)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | tcOrgAccount | 跨组织委外结算 | tc_org_account | short |
| 2 | costAccountingMethod | 委外成本核算方式 | cost_accounting_method | int |
| 3 | status | 单据状态 | status | short |
| 4 | verifystate | 审批状态 | verifystate | short |
| 5 | returncount | 退回次数 | returncount | short |
| 6 | lendType | 借用对象类型 | lend_type | short |
| 7 | printCount | 打印次数 | printCount | int |

---

## Date Fields (6)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | createDate | 创建日期 | create_date | date |
| 2 | lockDate | 锁定日期 | lock_Date | date |
| 3 | modifyDate | 修改日期 | modify_date | date |
| 4 | vouchdate | 单据日期 | vouchdate | date |
| 5 | auditDate | 审核日期 | audit_date | date |
| 6 | closeDate | 关闭日期 | close_Date | date |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | requisitionDetail | 出库申请单详情 | st.pickingrequisition.PickingRequisitionDetail |
| 2 | pickingRequisitionUserdefItem | 表头固定自定义项 | st.pickingrequisition.PickingRequisitionUserdefItem |
| 3 | defines | 出库申请单主表自由自定义项 | st.pickingrequisition.PickingRequisitionDefine |
