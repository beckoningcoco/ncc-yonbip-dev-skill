---
tags: [BIP, 元数据, 数据字典, DZHTFW.econtract.contractLegalType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 合同法律类别 (`DZHTFW.econtract.contractLegalType`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `clm_contract_legaltype` | 应用: `DZHTFW`

## 属性（15 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `name` | 名称 | `name` | String | `multiLanguage` |
| 3 | `outerSysId` | outerSysID | `outer_sys_id` | String | `text` |
| 4 | `remark` | remark | `remark` | String | `multiLanguage` |
| 5 | `id` | ID | `id` | String | `text` |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 8 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 9 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 11 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 12 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 13 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 14 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 15 | `dr` | 逻辑删除 | `dr` | Short | `short` |

## 关联（3 个）

- `creator` -> `base.user.BipUser` () 
- `modifier` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
