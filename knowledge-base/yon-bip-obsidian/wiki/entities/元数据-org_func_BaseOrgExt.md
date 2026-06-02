---
tags: [BIP, 元数据, 数据字典, org.func.BaseOrgExt]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务单元扩展信息 (`org.func.BaseOrgExt`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_orgs_ext` | 应用: `GZTORG` | 类型: `Class`

## 属性（39 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 2 | `country` | country | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 3 | `addressthree2` | addressthree2 | `addressthree2` | String | `text` |
| 4 | `addressthree3` | addressthree3 | `addressthree3` | String | `text` |
| 5 | `addressthree4` | addressthree4 | `addressthree4` | String | `text` |
| 6 | `addressthree5` | addressthree5 | `addressthree5` | String | `text` |
| 7 | `addressthree6` | addressthree6 | `addressthree6` | String | `text` |
| 8 | `establishmentDate` | establishmentDate | `establishment_date` | Date | `date` |
| 9 | `businessSegment` | businessSegment | `business_segment` | 80da2c28-e9b3-4881-9781-eaa8653ac121 | `quote` |
| 10 | `industry` | industry | `industry` | cfbad025-2f4a-410a-b0ec-eb67cdf5c89d | `quote` |
| 11 | `enterpriseSize` | enterpriseSize | `enterprise_size` | 922eac62-07c4-468d-a483-d00e85ee0525 | `quote` |
| 12 | `creditCode` | credit编码 | `credit_code` | String | `text` |
| 13 | `fax` | fax | `fax` | String | `text` |
| 14 | `addresstwo6` | addresstwo6 | `addresstwo6` | String | `text` |
| 15 | `otherPrincipal` | otherPrincipal | `other_principal` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 16 | `addresstwo5` | addresstwo5 | `addresstwo5` | String | `text` |
| 17 | `economyType` | economyType | `economy_type` | b1943fd6-92b8-426f-afa8-074e1d67940c | `quote` |
| 18 | `addresstwo4` | addresstwo4 | `addresstwo4` | String | `text` |
| 19 | `addresstwo3` | addresstwo3 | `addresstwo3` | String | `text` |
| 20 | `addresstwo2` | addresstwo2 | `addresstwo2` | String | `text` |
| 21 | `addressone6` | addressone6 | `addressone6` | String | `text` |
| 22 | `addressone2` | addressone2 | `addressone2` | String | `text` |
| 23 | `addressone3` | addressone3 | `addressone3` | String | `text` |
| 24 | `addressone4` | addressone4 | `addressone4` | String | `text` |
| 25 | `addressone5` | addressone5 | `addressone5` | String | `text` |
| 26 | `addressfour3` | addressfour3 | `addressfour3` | String | `text` |
| 27 | `addressfour2` | addressfour2 | `addressfour2` | String | `text` |
| 28 | `addressfour5` | addressfour5 | `addressfour5` | String | `text` |
| 29 | `addressfour4` | addressfour4 | `addressfour4` | String | `text` |
| 30 | `addressfour6` | addressfour6 | `addressfour6` | String | `text` |
| 31 | `province` | province | `province` | 95577e23-979f-4f09-a629-61fea93e576d | `quote` |
| 32 | `city` | city | `city` | 95577e23-979f-4f09-a629-61fea93e576d | `quote` |
| 33 | `county` | county | `county` | 95577e23-979f-4f09-a629-61fea93e576d | `quote` |
| 34 | `addressone` | addressone | `addressone` | String | `multiLanguage` |
| 35 | `addresstwo` | addresstwo | `addresstwo` | String | `multiLanguage` |
| 36 | `addressthree` | addressthree | `addressthree` | String | `multiLanguage` |
| 37 | `addressfour` | addressfour | `addressfour` | String | `multiLanguage` |
| 38 | `postcode` | postcode | `postcode` | String | `text` |
| 39 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（11 个）

- `country` -> `bd.country.CountryVO` ()
- `enterpriseSize` -> `bd.company.CompanyScaleVO` ()
- `province` -> `bd.region.BaseRegionVO` ()
- `city` -> `bd.region.BaseRegionVO` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `businessSegment` -> `bd.businessSegment.BusinessSegment` ()
- `county` -> `bd.region.BaseRegionVO` ()
- `industry` -> `bd.industry.IndustryCategoryVO` ()
- `otherPrincipal` -> `bd.staff.Staff` ()
- `economyType` -> `bd.economics.EconomicsTypeVO` ()
- `id` -> `org.func.BaseOrg` (1)
