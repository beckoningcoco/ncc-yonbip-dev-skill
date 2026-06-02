---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxesClassification.TaxesClassification]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 税收分类 (`taxpubdoc.taxesClassification.TaxesClassification`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tax_classification` | 应用: `DPMTAX` | 类型: `Class`

## 属性（27 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `parentCode` | parent编码 | `parent_code` | String | `text` |
| 2 | `simpleName` | simple名称 | `simple_name` | String | `multiLanguage` |
| 3 | `taxDesc` | taxDesc | `tax_desc` | String | `multiLanguage` |
| 4 | `simpleName2` | simpleName2 | `simple_name2` | String | `text` |
| 5 | `simpleName3` | simpleName3 | `simple_name3` | String | `text` |
| 6 | `simpleName4` | simpleName4 | `simple_name4` | String | `text` |
| 7 | `simpleName5` | simpleName5 | `simple_name5` | String | `text` |
| 8 | `taxrate` | taxrate | `taxrate` | Integer | `int` |
| 9 | `code` | 编码 | `code` | String | `text` |
| 10 | `name` | 名称 | `name` | String | `multiLanguage` |
| 11 | `isEnd` | 是否End | `isend` | Integer | `int` |
| 12 | `special_tag` | special_tag | `special_tag` | String | `text` |
| 13 | `country` | country | `country` | taxCountryEnum | `singleOption` |
| 14 | `parent` | parent | `parent_id` | d81afee5-cdcb-4c02-b2ac-054f55275897 | `quote` |
| 15 | `id` | ID | `id` | String | `text` |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 17 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 18 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 19 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 21 | `level` | 层级 | `level` | Integer | `int` |
| 22 | `path` | path | `path` | String | `text` |
| 23 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 24 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 25 | `TaxesClassificationListList` | TaxesClassificationListList | `` | 0f4e38ed-c7b9-47ec-b08c-82856d36a9c8 | `` |
| 26 | `TaxClassPolicyList` | TaxClassPolicyList | `` | 18c954fe-5588-4eae-bd1a-c66fd1f6dc7f | `` |
| 27 | `TaxClassCustomsList` | TaxClassCustomsList | `` | b362015b-738c-4f60-94da-da790b19a718 | `` |

## 关联（7 个）

- `parent` -> `taxpubdoc.taxesClassification.TaxesClassification` ()
- `creator` -> `base.user.BipUser` ()
- `modifier` -> `base.user.BipUser` ()
- `TaxesClassificationListList` -> `taxpubdoc.taxesClassification.TaxesClassificationList` (0..n)
- `ytenantId` -> `yht.tenant.YhtTenant` ()
- `TaxClassPolicyList` -> `taxpubdoc.taxesClassification.TaxClassPolicy` (0..n)
- `TaxClassCustomsList` -> `taxpubdoc.taxesClassification.TaxClassCustoms` (0..n)
