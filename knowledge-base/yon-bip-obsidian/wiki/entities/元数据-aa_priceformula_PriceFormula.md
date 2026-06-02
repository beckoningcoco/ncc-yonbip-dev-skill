---
tags: [BIP, 元数据, 数据字典, aa.priceformula.PriceFormula]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 价格公式 (`aa.priceformula.PriceFormula`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `cpu_price_formula` | 应用: `ycPriceCenter`

## 属性（33 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `creatorName` | creator名称 | `creatorName` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `formulaShow` | formulaShow | `formula_show` | String | `text` |
| 5 | `orgId` | orgID | `orgid` | a4916c85-f087-4e87-a178-0ad37aff7cd0 | `quote` |
| 6 | `tenant` | tenant | `ytenant_id` | String | `text` |
| 7 | `ytenant` | ytenant | `ytenant_id` | String | `text` |
| 8 | `srcformulaid` | srcformulaid | `srcformulaid` | 97790819-6d1f-4b4b-8d1c-f6d78b6531e4 | `quote` |
| 9 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 10 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 11 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 12 | `isWfControlled` | 是否WfControlled | `isWfControlled` | Boolean | `switch` |
| 13 | `verifystate` | verifystate | `verifystate` | Short | `short` |
| 14 | `returncount` | returncount | `returncount` | Short | `short` |
| 15 | `auditor` | auditor | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 16 | `auditTime` | auditTime | `audit_time` | DateTime | `timestamp` |
| 17 | `vouchdate` | vouchdate | `vouchdate` | Date | `date` |
| 18 | `status` | 状态 | `status` | Short | `short` |
| 19 | `formulaDesc` | formulaDesc | `formula_desc` | String | `multiLanguage` |
| 20 | `formula` | formula | `formula` | String | `text` |
| 21 | `formulaFactor` | formulaFactor | `formula_factor` | String | `text` |
| 22 | `pricingPoint` | pricingPoint | `pricing_point` | PricingPoint | `multipleOption` |
| 23 | `priceFlag` | priceFlag | `price_flag` | FactorType | `` |
| 24 | `effectiveDate` | effective日期 | `effective_date` | DateTime | `timestamp` |
| 25 | `expiryDate` | expiry日期 | `expiry_date` | DateTime | `timestamp` |
| 26 | `id` | ID | `id` | Long | `long` |
| 27 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 28 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 29 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 30 | `modifierName` | modifier名称 | `modifierName` | String | `text` |
| 31 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 32 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 33 | `priceformulastrategy` | priceformulastrategy | `` | 3e104afe-0912-4c25-b9c5-124650f3cf98 | `` |

## 关联（6 个）

- `srcformulaid` -> `aa.priceformula.PriceFormula` () 
- `creator` -> `base.user.BipUser` () 
- `priceformulastrategy` -> `aa.priceformula.PriceFormulaStrategy` (1..n) 
- `modifier` -> `base.user.BipUser` () 
- `auditor` -> `base.user.BipUser` () 
- `orgId` -> `org.func.PurchaseOrg` () 
