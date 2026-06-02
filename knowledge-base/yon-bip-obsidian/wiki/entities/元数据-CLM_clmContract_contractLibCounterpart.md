---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.contractLibCounterpart]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 合同中心相对方 (`CLM.clmContract.contractLibCounterpart`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `clm_contract_counterpart` | 应用: `CLM`

## 属性（37 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accountOpeningAddress` | accountOpeningAddress | `account_opening_address` | String | `text` |
| 2 | `address` | address | `address` | String | `text` |
| 3 | `bankAccount` | bankAccount | `bank_account` | String | `text` |
| 4 | `bizFlowInstanceId` | bizFlowInstanceID | `bizflowinstance_id` | String | `text` |
| 5 | `bizFlowMakeBillCode` | bizFlowMakeBill编码 | `bizflow_makebillcode` | String | `text` |
| 6 | `bizflowId` | bizflowID | `bizflow_id` | String | `text` |
| 7 | `bizflowName` | bizflow名称 | `bizflowname` | String | `text` |
| 8 | `bprincipalCounterparty` | bprincipalCounterparty | `bprincipal_counterparty` | Boolean | `switch` |
| 9 | `clmCounterpartId` | clmCounterpartID | `clm_counterpart_id` | 90e85817-9c8a-41f4-b1f8-0f61b6030e78 | `quote` |
| 10 | `contractLibId` | contractLibID | `contractlib_id` | a2b72a3c-8c65-4b56-8e8f-35821ac27556 | `quote` |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 12 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 13 | `ctlibFeature` | ctlibFeature | `ctlib_feature` | 99caa9c5-0739-4324-821a-80330e20e6b3 | `UserDefine` |
| 14 | `customerId` | customerID | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 15 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 16 | `firstBusiObj` | firstBusiObj | `firstbusiobj` | String | `text` |
| 17 | `firstChildId` | firstChildID | `firstchild_id` | String | `text` |
| 18 | `firstCode` | first编码 | `firstcode` | String | `text` |
| 19 | `firstId` | firstID | `first_id` | String | `text` |
| 20 | `fullName` | full名称 | `person_id` | String | `text` |
| 21 | `id` | ID | `id` | String | `text` |
| 22 | `merchantType` | merchantType | `merchant_type` | merchantType | `singleOption` |
| 23 | `mobile` | mobile | `mobile` | String | `text` |
| 24 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 25 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 26 | `participant` | participant | `participant` | participant | `singleOption` |
| 27 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 28 | `signSort` | signSort | `sign_sort` | Decimal | `number` |
| 29 | `sourceBusiObj` | sourceBusiObj | `sourcebusiobj` | String | `text` |
| 30 | `sourceChildId` | sourceChildID | `sourcechild_id` | String | `text` |
| 31 | `sourceCode` | source编码 | `sourcecode` | String | `text` |
| 32 | `sourceGrandId` | sourceGrandID | `sourcegrand_id` | String | `text` |
| 33 | `sourceId` | sourceID | `source_id` | String | `text` |
| 34 | `supplierId` | supplierID | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 35 | `taxNumber` | taxNumber | `tax_number` | String | `text` |
| 36 | `tbFilterType` | tbFilterType | `tb_filter_type` | Integer | `int` |
| 37 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（8 个）

- `creator` -> `base.user.BipUser` () 
- `supplierId` -> `aa.vendor.Vendor` () [废]
- `modifier` -> `base.user.BipUser` () 
- `customerId` -> `aa.merchant.Merchant` () [废]
- `contractLibId` -> `CLM.clmContract.contractLib` (0..n) [废]
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `ctlibFeature` -> `CLM.clmContract.contractLibCounterpartctlibFeatureUserDefine` () [废]
- `clmCounterpartId` -> `DZHTFW.econtract.counterpart` () [废]
