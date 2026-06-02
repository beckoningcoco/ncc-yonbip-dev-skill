---
tags: [BIP, 元数据, 数据字典, vc.variantConfiguration.VariantConfigurationAttr]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 选配参数文件属性模版 (`vc.variantConfiguration.VariantConfigurationAttr`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `vc_attr` | 应用: `ED` | 类型: `Class`

## 属性（12 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `characteristic` | characteristic | `characteristic` | String | `text` |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 4 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 5 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 6 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 8 | `seq` | seq | `seq` | Short | `short` |
| 9 | `variantConfiguration` | variantConfiguration | `variant_configuration_id` | f4984814-116e-4188-ab12-1b922a40f2cc | `quote` |
| 10 | `variantConfigurationAttrGroup` | variantConfigurationAttrGroup | `variant_configuration_attr_group_id` | 4bbdf6d9-0f0a-4a83-8f81-c210e9170ca0 | `quote` |
| 11 | `visible` | visible | `visible` | Short | `short` |
| 12 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `creator` -> `base.user.BipUser` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `variantConfiguration` -> `vc.variantConfiguration.VariantConfiguration` (0..n)
- `variantConfigurationAttrGroup` -> `vc.variantConfiguration.VariantConfigurationAttrGroup` ()
