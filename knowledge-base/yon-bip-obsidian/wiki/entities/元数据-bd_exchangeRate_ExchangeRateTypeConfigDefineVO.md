---
tags: [BIP, 元数据, 数据字典, bd.exchangeRate.ExchangeRateTypeConfigDefineVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 汇率类型同步配置自定义表 (`bd.exchangeRate.ExchangeRateTypeConfigDefineVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_exchangeratetype_config_define` | 应用: `DPMPI` | 类型: `Class`

## 属性（16 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `exchangeConversionMethod` | exchangeConversionMethod | `exchange_conversion_method` | Integer | `int` |
| 3 | `bankSource` | bankSource | `bank_source` | String | `text` |
| 4 | `exchangeratetype` | exchangeratetype | `exchangerate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 5 | `targetCurrencyId` | targetCurrencyID | `targetcurrency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 6 | `sourceCurrencyId` | sourceCurrencyID | `sourcecurrency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 7 | `enable` | enable | `enable` | Integer | `int` |
| 8 | `sysid` | sysid | `sysid` | String | `text` |
| 9 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 11 | `tenant` | tenant | `tenantid` | String | `text` |
| 12 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 13 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 14 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 15 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 16 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |

## 关联（6 个）

- `creator` -> `base.user.BipUser` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `sourceCurrencyId` -> `bd.currencytenant.CurrencyTenantVO` ()
- `exchangeratetype` -> `bd.exchangeRate.ExchangeRateTypeVO` (0..n)
- `targetCurrencyId` -> `bd.currencytenant.CurrencyTenantVO` ()
