---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clmContractFileConfig]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 合同文件配置 (`CLM.clmContract.clmContractFileConfig`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `clm_contractfile_config` | 应用: `CLM`

## 属性（17 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `billTypeId` | 票据类型ID | `bill_type_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |
| 2 | `clmContractFileConfigDetailList` | clmContractFileConfigDetailList | `` | 28d2e9f5-edaf-4b03-9af2-4688a97cc8e9 | `` |
| 3 | `code` | 编码 | `code` | String | `text` |
| 4 | `contractType` | contractType | `contract_type` | b23c8bcc-9978-44fb-a5d5-b54d687b59bb | `quote` |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 6 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 7 | `desc` | desc | `desc` | String | `bigText` |
| 8 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 9 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 10 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 11 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 12 | `id` | ID | `id` | String | `text` |
| 13 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 15 | `name` | 名称 | `name` | String | `text` |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 17 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（6 个）

- `clmContractFileConfigDetailList` -> `CLM.clmContract.clmContractFileConfigDetail` (0..n) 
- `creator` -> `base.user.BipUser` () 
- `contractType` -> `DZHTFW.econtract.contractType` () 
- `modifier` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `billTypeId` -> `bd.bill.BillTypeVO` () 
