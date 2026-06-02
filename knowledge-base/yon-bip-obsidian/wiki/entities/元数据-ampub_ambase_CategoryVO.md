---
tags: [BIP, 元数据, 数据字典, ampub.ambase.CategoryVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 资产类别 (`ampub.ambase.CategoryVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `pam_category` | 应用: `AMBD`

## 属性（47 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `category_code` | category_code | `category_code` | String | `text` |
| 2 | `category_name` | category_name | `category_name` | String | `multiLanguage` |
| 3 | `special_flag` | special_flag | `special_flag` | Boolean | `switch` |
| 4 | `line_category` | line_category | `line_category` | Boolean | `switch` |
| 5 | `associate_fa_flag` | associate_fa_flag | `associate_fa_flag` | Boolean | `switch` |
| 6 | `avg_use_life` | avg_use_life | `avg_use_life` | Integer | `int` |
| 7 | `design_life` | design_life | `design_life` | Integer | `int` |
| 8 | `portrait_flag` | portrait_flag | `portrait_flag` | Boolean | `switch` |
| 9 | `memo` | 备注 | `memo` | String | `text` |
| 10 | `pk_org` | pk_org | `pk_org` | String | `text` |
| 11 | `fk_parent` | fk_parent | `fk_parent` | 2cc09807-e5f0-4c71-a7ac-c4f932b8bdb7 | `quote` |
| 12 | `category_global` | category_global | `category_global` | String | `multiLanguage` |
| 13 | `cooperate_flag` | cooperate_flag | `cooperate_flag` | Boolean | `switch` |
| 14 | `name_pre_flag` | name_pre_flag | `name_pre_flag` | Boolean | `switch` |
| 15 | `inv_flag` | inv_flag | `inv_flag` | Boolean | `switch` |
| 16 | `innercode` | innercode | `innercode` | String | `text` |
| 17 | `max_inner_code` | max_inner_code | `max_inner_code` | String | `text` |
| 18 | `sync_status` | sync_status | `sync_status` | Short | `short` |
| 19 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 20 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 21 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 22 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 23 | `sysid` | sysid | `sysid` | String | `text` |
| 24 | `transi_type` | transi_type | `transi_type` | String | `text` |
| 25 | `enablestate` | enablestate | `enablestate` | Short | `short` |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 27 | `id` | ID | `id` | String | `text` |
| 28 | `level` | level | `level` | Integer | `int` |
| 29 | `path` | path | `path` | String | `text` |
| 30 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 31 | `seal_time` | seal_time | `seal_time` | DateTime | `timestamp` |
| 32 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 33 | `assetBusiness` | assetBusiness | `asset_business` | Short | `short` |
| 34 | `pk_sealer` | pk_sealer | `pk_sealer` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 35 | `tenant` | tenant | `tenantid` | 5d1b0fb2-2218-4eaa-abc9-1c23516b6596 | `quote` |
| 36 | `gatewayid` | gatewayid | `gatewayid` | String | `text` |
| 37 | `userDefines` | userDefines | `user_defines` | f5c4a256-bc8b-4def-baf4-aea8a90b3080 | `UserDefine` |
| 38 | `erpcode` | erpcode | `erpcode` | String | `text` |
| 39 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 40 | `parent` | parent | `parent_id` | 2cc09807-e5f0-4c71-a7ac-c4f932b8bdb7 | `quote` |
| 41 | `sort` | sort | `sort_num` | Integer | `int` |
| 42 | `erpid` | erpid | `erpid` | String | `text` |
| 43 | `attachgroup` | attachgroup | `` | 533df30b-d034-4212-b0d8-d0e678210cc4 | `` |
| 44 | `bodyvos` | bodyvos | `` | 6633c37a-8585-4d3f-b332-1f0f57329c6c | `` |
| 45 | `defines` | defines | `` | 0d336618-1aa0-4a0f-a3a1-581dd318b41d | `` |
| 46 | `keyparts` | keyparts | `` | bd4e7978-d5bf-4ec6-9c2f-83a49c312ccc | `` |
| 47 | `lineparam` | lineparam | `` | 6036c6f4-25d0-430c-a10e-e2a47378dba6 | `` |

## 关联（13 个）

- `lineparam` -> `ampub.ambase.LineParamVO` (0..n) 
- `parent` -> `ampub.ambase.CategoryVO` () 
- `creator` -> `base.user.BipUser` () 
- `keyparts` -> `ampub.ambase.KeyPartsVO` (0..n) 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `modifier` -> `base.user.BipUser` () 
- `defines` -> `ampub.ambase.CategoryVODefine` (1) [废]
- `userDefines` -> `ampub.ambase.CategoryVODefines` () 
- `pk_sealer` -> `base.user.BipUser` () 
- `fk_parent` -> `ampub.ambase.CategoryVO` () 
- `tenant` -> `baseapp.yht.PubTenant` () 
- `bodyvos` -> `ampub.ambase.CateParamVO` (0..n) 
- `attachgroup` -> `ampub.ambase.AttachGroupVO` (0..n) 
