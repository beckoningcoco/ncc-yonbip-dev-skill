---
tags: [BIP, 元数据, 数据字典, socialmdm.social.Degree]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 学位 (`socialmdm.social.Degree`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mdm_degreetbcode` | 应用: `DPMPI` | 类型: `Class`

## 属性（18 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `aid` | aid | `aid` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 4 | `id` | ID | `pk_mdm` | String | `text` |
| 5 | `linkFieldValue` | linkFieldValue | `link_fieldvalue` | String | `text` |
| 6 | `mdmCode` | mdm编码 | `mdm_code` | String | `text` |
| 7 | `mdmDuplicate` | mdmDuplicate | `mdm_duplicate` | Integer | `int` |
| 8 | `mdmParentCode` | mdmParent编码 | `mdm_parentcode` | String | `text` |
| 9 | `mdmSeal` | mdmSeal | `mdm_seal` | Integer | `int` |
| 10 | `name` | 名称 | `name` | String | `multiLanguage` |
| 11 | `nameResId` | nameResID | `name_resid` | String | `text` |
| 12 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |
| 13 | `sysId` | sysID | `sys_id` | String | `text` |
| 14 | `treeMasterId` | treeMasterID | `treemasterid` | String | `text` |
| 15 | `treeParentId` | treeParentID | `treeparentid` | String | `text` |
| 16 | `treeRefForeignKey` | treeRefForeignKey | `treeref_foreignkey` | String | `text` |
| 17 | `updateAt` | updateAt | `update_at` | String | `text` |
| 18 | `ytenantId` | ytenantID | `ytenant_id` | String | `text` |
