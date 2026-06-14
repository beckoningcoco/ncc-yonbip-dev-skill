---
tags: [BIP, metadata, CLM, contract, clm_contract_item]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同标的物 (CLM.clmContract.clm_contract_item)

> Platform: BIP V5 | CLM | Table: clm_contract_item | Schema: yonbip-ec-contract
> Parent: CLM.clmContract.clm_contract

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 合同标的物 |
| uri | CLM.clmContract.clm_contract_item |
| tableName | clm_contract_item |
| domain | yonbip-ec-contract |
| schema | `yonbip_clm_contract` |
| applicationCode | CLM |
| superUri | iuap.busiObj.BizObject |
| isBusinessObject | true |
| isExtend | true |
| description | 合同标的物 |

## Key/Code/Name

| Role | Column |
|------|--------|
| key | id |

## Suppliers (6)

| # | Name | URI |
|---|------|-----|
| 1 | 逻辑删除 (LogicDelete) | iuap.busiObj.LogicDelete |
| 2 | 统一租户接口 (IYTenant) | iuap.busiObj.IYTenant |
| 3 | 业务流多来源 (BusinessFlowSourcesItf) | iuap.busiObj.BusinessFlowSourcesItf |
| 4 | 业务流基础 (BusinessFlowItf) | iuap.busiObj.BusinessFlowItf |
| 5 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |
| 6 | 审计信息 (IAuditInfo) | iuap.busiObj.IAuditInfo |

---

## All Fields (46)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 2 | bizFlowInstanceId | 业务流实例id | bizflowinstance_id | text | String |  |  | nullable,uiHide |
| 3 | bizFlowMakeBillCode | 单据转换规则编码 | bizflow_makebillcode | text | String |  |  | nullable,uiHide |
| 4 | bizflowId | 业务流id | bizflow_id | text | String |  |  | nullable,uiHide |
| 5 | bizflowName | 流程名称 | bizflowname | text | String |  |  | nullable,uiHide |
| 6 | contractId | 合同信息 | clm_contract_id | quote | CLM.clmContract.clm_contract |  |  | isExtenal,isFk,nullable |
| 7 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 8 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 9 | currencyId | 币种 | currency_id | quote | bd.currencytenant.CurrencyTenantVO |  |  | changeFromBusinessPage,isExtenal,nullable |
| 10 | dr | 逻辑删除 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 11 | feature | 合同明细表特征 | feature | UserDefine | CLM.clmContract.clm_contract_itemfeatureUserDefine |  |  | changeFromBusinessPage,generateElasticEntity,isExtenal,nullable |
| 12 | firstBusiObj | 来源业务对象 | firstbusiobj | text | String |  |  | nullable,uiHide |
| 13 | firstChildId | 来源单据子表id | firstchild_id | text | String |  |  | nullable,uiHide |
| 14 | firstCode | 来源单据号 | firstcode | text | String |  |  | nullable,uiHide |
| 15 | firstId | 来源单据主表id | first_id | text | String |  |  | nullable,uiHide |
| 16 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 17 | materialClassId | 物料分类 | material_class_id | quote | pc.cls.ManagementClass |  |  | isExtenal,nullable |
| 18 | materialId | 物料 | material_id | quote | pc.product.Product |  |  | changeFromBusinessPage,isExtenal,nullable |
| 19 | materialIdFreeCT | 物料自由项特征组 | materialIdFreeCT | FreeCT | CLM.clmContract.clm_contract_itemmaterialIdFreeCTFreeCT |  |  | changeFromBusinessPage,generateElasticEntity,isExtenal,nullable,senvitiveType |
| 20 | memo | 备注 | memo | text | String |  |  | changeFromBusinessPage,isExtenal,nullable |
| 21 | mny | 本币无税金额 | mny | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 22 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 23 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 24 | num | 数量 | num | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 25 | oriMny | 原币无税金额 | ori_mny | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 26 | oriPrice | 原币无税单价 | ori_price | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 27 | oriTax | 原币税额 | ori_tax | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 28 | oriTaxMny | 原币含税金额 | ori_tax_mny | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 29 | oriTaxPrice | 原币含税单价 | ori_tax_price | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 30 | plandelivDate | 计划收发货日期 | plandeliv_date | dateTime | Date |  |  | changeFromBusinessPage,isExtenal,nullable |
| 31 | price | 本币无税单价 | price | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 32 | projectId | 关联项目 | project_id | quote | bd.project.ProjectVO |  |  | isExtenal,nullable |
| 33 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 34 | rowNum | 行号 | row_num | int | Integer |  |  | isExtenal,nullable |
| 35 | sourceBusiObj | 上游业务对象 | sourcebusiobj | text | String |  |  | nullable,uiHide |
| 36 | sourceChildId | 上游单据子表id | sourcechild_id | text | String |  |  | nullable,uiHide |
| 37 | sourceCode | 上游单据号 | sourcecode | text | String |  |  | nullable,uiHide |
| 38 | sourceGrandId | 来源孙表id | sourcegrand_id | text | String |  |  | nullable,uiHide |
| 39 | sourceId | 上游单据主表id | source_id | text | String |  |  | nullable,uiHide |
| 40 | tax | 本币税额 | tax | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 41 | taxRate | 税率 | taxrate | quote | archive.taxArchives.TaxRateArchive |  |  | changeFromBusinessPage,isExtenal,nullable |
| 42 | taxmny | 本币含税金额 | taxmny | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 43 | taxprice | 本币含税单价 | taxprice | number | Decimal |  |  | changeFromBusinessPage,isExtenal,nullable |
| 44 | unitId | 单位 | unit_id | quote | pc.unit.Unit |  |  | changeFromBusinessPage,isExtenal,nullable |
| 45 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 46 | ytenantId | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (12)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 2 | contractId | 合同信息 | clm_contract_id | CLM.clmContract.clm_contract |
| 3 | creator | 创建人 | creator | base.user.BipUser |
| 4 | currencyId | 币种 | currency_id | bd.currencytenant.CurrencyTenantVO |
| 5 | materialClassId | 物料分类 | material_class_id | pc.cls.ManagementClass |
| 6 | materialId | 物料 | material_id | pc.product.Product |
| 7 | modifier | 修改人 | modifier | base.user.BipUser |
| 8 | projectId | 关联项目 | project_id | bd.project.ProjectVO |
| 9 | taxRate | 税率 | taxrate | archive.taxArchives.TaxRateArchive |
| 10 | unitId | 单位 | unit_id | pc.unit.Unit |
| 11 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 12 | ytenantId | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (13)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | dr | 逻辑删除 | dr | short |
| 2 | mny | 本币无税金额 | mny | number |
| 3 | num | 数量 | num | number |
| 4 | oriMny | 原币无税金额 | ori_mny | number |
| 5 | oriPrice | 原币无税单价 | ori_price | number |
| 6 | oriTax | 原币税额 | ori_tax | number |
| 7 | oriTaxMny | 原币含税金额 | ori_tax_mny | number |
| 8 | oriTaxPrice | 原币含税单价 | ori_tax_price | number |
| 9 | price | 本币无税单价 | price | number |
| 10 | rowNum | 行号 | row_num | int |
| 11 | tax | 本币税额 | tax | number |
| 12 | taxmny | 本币含税金额 | taxmny | number |
| 13 | taxprice | 本币含税单价 | taxprice | number |

---

## Date Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | createTime | 创建时间 | create_time | dateTime |
| 2 | modifyTime | 修改时间 | modify_time | dateTime |
| 3 | plandelivDate | 计划收发货日期 | plandeliv_date | dateTime |
| 4 | pubts | 时间戳 | pubts | dateTime |
