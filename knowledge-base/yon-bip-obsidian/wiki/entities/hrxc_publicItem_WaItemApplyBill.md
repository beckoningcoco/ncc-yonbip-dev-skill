---
tags: [BIP, metadata, hrxc, WaItemApplyBill]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 公共薪资项目申请表 (hrxc.publicItem.WaItemApplyBill)

> Platform: BIP V5 | Table: wa_item_apply_bill | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 公共薪资项目申请表 |
| uri | hrxc.publicItem.WaItemApplyBill |
| tableName | wa_item_apply_bill |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 自动编号 (IAutoCode) | voucher.base.IAutoCode |
| 2 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 4 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 5 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |

---

## All Fields (27)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | orgId | 组织Id | ORGID | quote | org.func.AdminOrg |  |  | isMasterOrg,nullable |
| 2 | returncount | 退回次数 | RETURNCOUNT | short | Short |  |  | nullable,reportHide |
| 3 | billTypeId | 单据类型 | bill_type_id | quote | bd.bill.BillTypeVO |  |  | nullable |
| 4 | billTypeCode | 单据类型编码 | bill_type_code | text | String |  |  | nullable |
| 5 | status | 状态 | STATUS | int | Integer |  |  | nullable |
| 6 | code | 单据编码 | CODE | text | String |  |  | REF.CODE,CODE,nullable,isCode |
| 7 | billName | 单据名称 | BILL_NAME | multiLanguage | String |  |  | nullable |
| 8 | busiOrgVid | 组织Vid | BUSIORGVID | quote | org.func.BaseOrgTimeline |  |  | nullable |
| 9 | country | 国家/地区id | country | quote | bd.country.CountryVO |  |  | nullable |
| 10 | categoryId | 所属分类id | CATEGORYID | quote | hrxc.publicItem.WaItemCategory |  |  | nullable |
| 11 | description | 申请说明 | DESCRIPTION | multiLanguage | String |  |  | nullable |
| 12 | isWfControlled | 是否审批流控制 | iS_WF_CONTROLLED | switch | Boolean |  |  | nullable,reportHide |
| 13 | waItemApplyBillDefineCharacter | 公共薪资项目申请表特征组 | wa_item_apply_bill_define_character | UserDefine | hrxc.publicItem.WaItemApplyBillCharacteristics |  |  | nullable |
| 14 | verifystate | 单据状态 | VERIFYSTATE | short | Short |  |  | nullable,reportHide |
| 15 | transiTypeId | 交易类型ID | transi_type_id | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 16 | transiTypeCode | 交易类型编码 | transi_type_code | text | String |  |  | nullable |
| 17 | transiTypeName | 交易类型 | TRANSI_TYPE_NAME | text | String |  |  | nullable |
| 18 | id | 主键 | ID | text | String |  |  | nullable,uiHide,REF.ID |
| 19 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 20 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 21 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 22 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable,migrationIgnoreRef |
| 23 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 24 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable |
| 25 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 26 | tenant | 租户主键(旧) | TENANTID | text | String |  |  | nullable |
| 27 | waItemApplys | 公共薪资项目申请明细 | - | - | hrxc.publicItem.WaItemApply |  |  |  |

---

## Reference Fields (9)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orgId | 组织Id | ORGID | org.func.AdminOrg |
| 2 | billTypeId | 单据类型 | bill_type_id | bd.bill.BillTypeVO |
| 3 | busiOrgVid | 组织Vid | BUSIORGVID | org.func.BaseOrgTimeline |
| 4 | country | 国家/地区id | country | bd.country.CountryVO |
| 5 | categoryId | 所属分类id | CATEGORYID | hrxc.publicItem.WaItemCategory |
| 6 | transiTypeId | 交易类型ID | transi_type_id | bd.bill.TransType |
| 7 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 8 | creator | 创建人 | CREATOR | base.user.BipUser |
| 9 | modifier | 修改人 | MODIFIER | base.user.BipUser |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | waItemApplys | 公共薪资项目申请明细 | hrxc.publicItem.WaItemApply |
