---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clmContractFile]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 文本对象 (`CLM.clmContract.clmContractFile`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `clm_contractfile` | 应用: `CLM`

## 属性（18 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `billType` | 票据类型 | `bill_type` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |
| 2 | `billid` | billid | `billid` | String | `text` |
| 3 | `businessObject` | businessObject | `business_Object` | String | `text` |
| 4 | `clmContractFileDetailList` | clmContractFileDetailList | `` | a06ad254-c939-434e-be75-7d4b0dec2557 | `` |
| 5 | `contractType` | contractType | `contract_type` | b23c8bcc-9978-44fb-a5d5-b54d687b59bb | `quote` |
| 6 | `contractfileConfigId` | contractfileConfigID | `contractfile_config_id` | 361c3cc9-358a-4933-a267-fd50da708e70 | `quote` |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 8 | `createType` | createType | `create_type` | createType | `singleOption` |
| 9 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 10 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 11 | `id` | ID | `id` | String | `text` |
| 12 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 14 | `orgId` | orgID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 16 | `status` | 状态 | `status` | clmContractFileStatus | `singleOption` |
| 17 | `tranType` | tranType | `tran_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 18 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（9 个）

- `creator` -> `base.user.BipUser` () 
- `contractType` -> `DZHTFW.econtract.contractType` () 
- `billType` -> `bd.bill.BillTypeVO` () 
- `modifier` -> `base.user.BipUser` () 
- `clmContractFileDetailList` -> `CLM.clmContract.clmContractFileDetail` (0..n) 
- `contractfileConfigId` -> `CLM.clmContract.clmContractFileConfig` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `orgId` -> `org.func.BaseOrg` () 
- `tranType` -> `bd.bill.TransType` () 
