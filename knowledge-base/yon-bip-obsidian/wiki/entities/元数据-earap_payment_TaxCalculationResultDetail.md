---
tags: [BIP, 元数据, 数据字典, earap.payment.TaxCalculationResultDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 计税结果明细 (`earap.payment.TaxCalculationResultDetail`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `stwb_tax_calc_result_b` | 应用: `EAP`

## 属性（14 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `calculationComponentFormula` | calculationComponentFormula | `calculation_component_formula` | String | `bigText` |
| 2 | `calculationComponentId` | calculationComponentID | `calculation_component_id` | String | `text` |
| 3 | `reliefAmount` | reliefAmount | `relief_amount` | Decimal | `number` |
| 4 | `taxReliefBid` | taxReliefBid | `tax_relief_bid` | String | `text` |
| 5 | `taxReliefId` | taxReliefID | `tax_relief_id` | String | `text` |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 7 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 8 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 9 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 10 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 11 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 12 | `mainid` | mainid | `mainid` | 08a46952-2d1c-44ab-b444-7e0571e3f66a | `quote` |
| 13 | `id` | ID | `id` | String | `text` |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |

## 关联（4 个）

- `creator` -> `base.user.BipUser` () 
- `modifier` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `mainid` -> `earap.payment.TaxCalculationResult` (0..n) [废]
