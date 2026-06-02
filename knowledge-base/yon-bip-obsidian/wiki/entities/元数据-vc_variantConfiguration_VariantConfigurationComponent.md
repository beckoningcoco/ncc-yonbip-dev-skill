---
tags: [BIP, 元数据, 数据字典, vc.variantConfiguration.VariantConfigurationComponent]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 选配参数文件组件模版 (`vc.variantConfiguration.VariantConfigurationComponent`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `vc_component` | 应用: `ED` | 类型: `Class`

## 属性（31 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `bomComponentId` | bomComponentID | `bom_component_id` | f78e2b2f-0634-41d3-a002-c5a68f3e9992 | `quote` |
| 2 | `bomId` | bomID | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed | `quote` |
| 3 | `bomLevel` | bomLevel | `bom_level` | String | `text` |
| 4 | `bomUnit` | bomUnit | `bom_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 5 | `componentFreeCT` | componentFreeCT | `component_freect_id` | e600c179-f49d-4cc6-804d-9c2217aaa118 | `UserDefine` |
| 6 | `componentNum` | componentNum | `component_num` | Decimal | `number` |
| 7 | `componentProductId` | componentProductID | `component_product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 8 | `componentUseNum` | componentUseNum | `component_use_num` | Decimal | `number` |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 10 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 11 | `denominatorQuantity` | denominatorQuantity | `denominator_quantity` | Decimal | `number` |
| 12 | `groupEx` | groupEx | `group_ex` | Short | `short` |
| 13 | `groupFirst` | groupFirst | `group_first` | Short | `short` |
| 14 | `groupNo` | groupNo | `group_no` | String | `text` |
| 15 | `id` | ID | `id` | Long | `long` |
| 16 | `isShow` | 是否Show | `is_show` | Short | `short` |
| 17 | `lineType` | lineType | `line_type` | Short | `short` |
| 18 | `materialGroupNo` | materialGroupNo | `material_group_no` | String | `text` |
| 19 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 21 | `mustSelect` | mustSelect | `must_select` | Short | `short` |
| 22 | `numEdit` | numEdit | `num_edit` | Short | `short` |
| 23 | `pBomId` | pBomID | `p_bom_id` | f494c08f-f466-474b-937a-4773d56696ed | `quote` |
| 24 | `parentFreeCT` | parentFreeCT | `parent_freect_id` | 21352ede-0497-4f1a-81ce-cdc72f2edc7b | `UserDefine` |
| 25 | `parentProductId` | parentProductID | `parent_product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 27 | `serialNo` | serialNo | `serial_no` | Integer | `int` |
| 28 | `usageType` | usageType | `usage_type` | Short | `short` |
| 29 | `variantConfiguration` | variantConfiguration | `variant_configuration_id` | f4984814-116e-4188-ab12-1b922a40f2cc | `quote` |
| 30 | `variantConfigurationAttrGroup` | variantConfigurationAttrGroup | `vc_group_id` | 4bbdf6d9-0f0a-4a83-8f81-c210e9170ca0 | `quote` |
| 31 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（13 个）

- `componentFreeCT` -> `vc.variantConfiguration.BomComponentFCT` ()
- `bomId` -> `ed.bom.Bom` ()
- `creator` -> `base.user.BipUser` ()
- `parentProductId` -> `pc.product.Product` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `bomComponentId` -> `ed.bom.BomComponent` ()
- `modifier` -> `base.user.BipUser` ()
- `componentProductId` -> `pc.product.Product` ()
- `bomUnit` -> `pc.unit.Unit` ()
- `parentFreeCT` -> `vc.variantConfiguration.BomParentFCT` ()
- `variantConfiguration` -> `vc.variantConfiguration.VariantConfiguration` (0..n)
- `variantConfigurationAttrGroup` -> `vc.variantConfiguration.VariantConfigurationAttrGroup` ()
- `pBomId` -> `ed.bom.Bom` ()
