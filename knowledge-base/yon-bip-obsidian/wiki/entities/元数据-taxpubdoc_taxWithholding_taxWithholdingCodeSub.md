---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxWithholding.taxWithholdingCodeSub]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 代扣税税码子表(代扣税组合) (`taxpubdoc.taxWithholding.taxWithholdingCodeSub`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tax_withholding_code_sub` | 应用: `DPMTAX`

## 属性（10 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 2 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 3 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 4 | `id` | ID | `id` | String | `text` |
| 5 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 6 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 8 | `taxWithholdingCodeId` | taxWithholding编码ID | `tax_withholding_code_id` | aaae292d-ebbc-4b8f-a9f7-b67bff16c947 | `quote` |
| 9 | `taxWithholdingTypeId` | taxWithholdingTypeID | `tax_withholding_type_id` | affa6a3e-faa4-4896-baca-8b4da5dda6d8 | `quote` |
| 10 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `creator` -> `base.user.BipUser` () 
- `taxWithholdingCodeId` -> `taxpubdoc.taxWithholding.taxWithholdingCode` (1..n) 
- `taxWithholdingTypeId` -> `taxpubdoc.taxWithholding.taxWithholdingType` () 
- `modifier` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
