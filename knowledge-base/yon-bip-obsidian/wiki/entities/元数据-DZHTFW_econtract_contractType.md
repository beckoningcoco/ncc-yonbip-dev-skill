---
tags: [BIP, 元数据, 数据字典, DZHTFW.econtract.contractType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 合同类型 (`DZHTFW.econtract.contractType`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `clm_contract_type` | 应用: `DZHTFW`

## 属性（24 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `adaptallorgs` | adaptallorgs | `adaptallorgs` | Boolean | `switch` |
| 2 | `billTypeId` | 票据类型ID | `bill_type_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |
| 3 | `code` | 编码 | `code` | String | `text` |
| 4 | `contractGroupId` | contractGroupID | `contract_group_id` | 4c202967-83b6-4bc2-8c87-739ebb342000 | `quote` |
| 5 | `iOrder` | iOrder | `i_order` | Integer | `int` |
| 6 | `icon` | icon | `icon` | String | `text` |
| 7 | `name` | 名称 | `name` | String | `multiLanguage` |
| 8 | `outerSysId` | outerSysID | `outer_sys_id` | String | `text` |
| 9 | `remark` | remark | `remark` | String | `multiLanguage` |
| 10 | `transTypeId` | transTypeID | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quoteList` |
| 11 | `feature` | feature | `feature` | 1ad5f961-6782-40aa-bad4-f94902c62de9 | `UserDefine` |
| 12 | `contracttypescopeList` | contracttypescopeList | `` | 85822a42-bf72-41b7-a68b-19fb6439498a | `` |
| 13 | `contractType_transTypeIdList` | contractType_transTypeIdList | `` | e7ce076d-a36b-4629-998b-e7048a2e2050 | `` |
| 14 | `id` | ID | `id` | String | `text` |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 17 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 18 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 19 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 20 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 21 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 22 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 23 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 24 | `dr` | 逻辑删除 | `dr` | Short | `short` |

## 关联（9 个）

- `creator` -> `base.user.BipUser` () 
- `feature` -> `DZHTFW.econtract.ContractTypeFeature` () [废]
- `modifier` -> `base.user.BipUser` () 
- `contractGroupId` -> `DZHTFW.econtract.contractTypeGroup` () [废]
- `transTypeId` -> `bd.bill.TransType` () [废]
- `contracttypescopeList` -> `DZHTFW.econtract.contracttypescope` (0..n) 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `billTypeId` -> `bd.bill.BillTypeVO` () [废]
- `contractType_transTypeIdList` -> `DZHTFW.econtract.contractType_transTypeId` (0..n) 
