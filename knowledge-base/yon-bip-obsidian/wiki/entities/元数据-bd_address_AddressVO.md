---
tags: [BIP, 元数据, 数据字典, bd.address.AddressVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 银行网点地址信息 (`bd.address.AddressVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_address` | 应用: `DPMSETL`

## 属性（23 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `country` | country | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 3 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 4 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 5 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 6 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 7 | `province` | province | `province` | 95577e23-979f-4f09-a629-61fea93e576d | `quote` |
| 8 | `province_input` | province_input | `province_input` | String | `text` |
| 9 | `city` | city | `city` | 95577e23-979f-4f09-a629-61fea93e576d | `quote` |
| 10 | `city_input` | city_input | `city_input` | String | `text` |
| 11 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 12 | `district` | district | `district` | 95577e23-979f-4f09-a629-61fea93e576d | `quote` |
| 13 | `tenant` | tenant | `tenantid` | String | `text` |
| 14 | `district_input` | district_input | `district_input` | String | `text` |
| 15 | `addressone` | addressone | `addressone` | String | `multiLanguage` |
| 16 | `addresstwo` | addresstwo | `addresstwo` | String | `multiLanguage` |
| 17 | `sysid` | sysid | `sysid` | String | `text` |
| 18 | `addressthree` | addressthree | `addressthree` | String | `multiLanguage` |
| 19 | `addressfour` | addressfour | `addressfour` | String | `multiLanguage` |
| 20 | `postcode` | postcode | `postcode` | String | `text` |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 22 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 23 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |

## 关联（7 个）

- `country` -> `bd.country.CountryVO` () 
- `creator` -> `base.user.BipUser` () 
- `province` -> `bd.region.BaseRegionVO` () 
- `city` -> `bd.region.BaseRegionVO` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `district` -> `bd.region.BaseRegionVO` () 
- `modifier` -> `base.user.BipUser` () 
