---
tags: [BIP, 元数据, 数据字典, bd.taxrate.TaxRateVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 税目税率 (`bd.taxrate.TaxRateVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_taxrate` | 应用: `GZTBDM`

## 属性（20 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 2 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 3 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 4 | `objid` | objid | `objid` | String | `text` |
| 5 | `log` | log | `log` | String | `text` |
| 6 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 7 | `tenant` | tenant | `tenantid` | String | `text` |
| 8 | `code` | 编码 | `code` | String | `text` |
| 9 | `name` | 名称 | `name` | String | `multiLanguage` |
| 10 | `ntaxRate` | ntaxRate | `ntaxrate` | Decimal | `number` |
| 11 | `scope` | scope | `scope` | Integer | `int` |
| 12 | `id` | ID | `id` | String | `text` |
| 13 | `country` | country | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 14 | `taxFree` | taxFree | `taxfree` | Boolean | `switch` |
| 15 | `noTaxation` | noTaxation | `notaxation` | Boolean | `switch` |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 17 | `enable` | enable | `enable` | Integer | `int` |
| 18 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 19 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 20 | `sysid` | sysid | `sysid` | String | `text` |

## 关联（4 个）

- `country` -> `bd.country.CountryVO` () 
- `creator` -> `base.user.BipUser` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `modifier` -> `base.user.BipUser` () 
