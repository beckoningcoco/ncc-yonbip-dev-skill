---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.contractLibChange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 合同中心变更信息 (`CLM.clmContract.contractLibChange`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `clm_contractlib_change` | 应用: `CLM`

## 属性（25 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `bizFlowInstanceId` | bizFlowInstanceID | `bizflowinstance_id` | String | `text` |
| 2 | `bizFlowMakeBillCode` | bizFlowMakeBill编码 | `bizflow_makebillcode` | String | `text` |
| 3 | `bizflowId` | bizflowID | `bizflow_id` | String | `text` |
| 4 | `bizflowName` | bizflow名称 | `bizflowname` | String | `text` |
| 5 | `changeCreateTime` | changeCreateTime | `change_create_time` | Date | `dateTime` |
| 6 | `changeCreator` | changeCreator | `change_creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 7 | `contractLib_id` | contractLib_id | `contractLib_id` | a2b72a3c-8c65-4b56-8e8f-35821ac27556 | `quote` |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 9 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 10 | `ctlibFeature` | ctlibFeature | `ctlib_feature` | a6060b97-a099-4f2f-8acb-86eda1e1a1d6 | `UserDefine` |
| 11 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 12 | `firstBusiObj` | firstBusiObj | `firstbusiobj` | String | `text` |
| 13 | `firstChildId` | firstChildID | `firstchild_id` | String | `text` |
| 14 | `firstCode` | first编码 | `firstcode` | String | `text` |
| 15 | `firstId` | firstID | `first_id` | String | `text` |
| 16 | `id` | ID | `id` | String | `text` |
| 17 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 20 | `sourceBusiObj` | sourceBusiObj | `sourcebusiobj` | String | `text` |
| 21 | `sourceChildId` | sourceChildID | `sourcechild_id` | String | `text` |
| 22 | `sourceCode` | source编码 | `sourcecode` | String | `text` |
| 23 | `sourceGrandId` | sourceGrandID | `sourcegrand_id` | String | `text` |
| 24 | `sourceId` | sourceID | `source_id` | String | `text` |
| 25 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（6 个）

- `creator` -> `base.user.BipUser` () 
- `modifier` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `contractLib_id` -> `CLM.clmContract.contractLib` (0..n) 
- `ctlibFeature` -> `CLM.clmContract.contractLibChangectlibFeatureUserDefine` () 
- `changeCreator` -> `base.user.BipUser` () 
