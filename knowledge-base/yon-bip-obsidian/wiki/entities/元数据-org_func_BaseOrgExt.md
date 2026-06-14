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

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_orgs_ext` | domain：`ucf-org-center` | 应用：`GZTORG` | 业务对象ID：`2674508f-710f-4f14-a0ce-940053e8ed05`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务单元扩展信息 |
| 物理表 | `org_orgs_ext` |
| domain/服务域 | `ucf-org-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `GZTORG` |
| 直连字段 | 39 个 |
| 子表 | 0 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `ucfbasedoc.bd_countryref` |
| `enterprise_size` | `ucfbasedoc.bd_companyscale_ref` |
| `province` | `ucfbasedoc.bd_realregionprovinceref` |
| `city` | `ucfbasedoc.bd_regioncityref` |
| `ytenant_id` | `` |
| `business_segment` | `ucf-staff-center.bd_business_segment_ref` |
| `county` | `ucfbasedoc.bd_regioncityref` |
| `industry` | `ucfbasedoc.bd_industrycategory_ref` |
| `other_principal` | `ucf-staff-center.bd_staff_ref` |
| `economy_type` | `ucfbasedoc.bd_economicstype_ref` |
| `id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 39 个直连字段

### 文本字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `addressthree2` | `addressthree2` | `addressthree2` | 地址3英文 |
| `addressthree3` | `addressthree3` | `addressthree3` | 地址3繁体 |
| `addressthree4` | `addressthree4` | `addressthree4` | 备用地址 |
| `addressthree5` | `addressthree5` | `addressthree5` | 备用地址 |
| `addressthree6` | `addressthree6` | `addressthree6` | 备用地址 |
| `credit_code` | `credit_code` | `creditCode` | 社会统一信用代码 |
| `fax` | `fax` | `fax` | 传真 |
| `addresstwo6` | `addresstwo6` | `addresstwo6` | 备用地址 |
| `addresstwo5` | `addresstwo5` | `addresstwo5` | 备用地址 |
| `addresstwo4` | `addresstwo4` | `addresstwo4` | 备用地址 |
| `addresstwo3` | `addresstwo3` | `addresstwo3` | 地址2繁体 |
| `addresstwo2` | `addresstwo2` | `addresstwo2` | 地址2英文 |
| `addressone6` | `addressone6` | `addressone6` | 备用地址 |
| `addressone2` | `addressone2` | `addressone2` | 地址1英文 |
| `addressone3` | `addressone3` | `addressone3` | 地址1繁体 |
| `addressone4` | `addressone4` | `addressone4` | 备用地址 |
| `addressone5` | `addressone5` | `addressone5` | 备用地址 |
| `addressfour3` | `addressfour3` | `addressfour3` | 地址4繁体 |
| `addressfour2` | `addressfour2` | `addressfour2` | 地址4英文 |
| `addressfour5` | `addressfour5` | `addressfour5` | 备用地址 |
| `addressfour4` | `addressfour4` | `addressfour4` | 备用地址 |
| `addressfour6` | `addressfour6` | `addressfour6` | 备用地址 |
| `postcode` | `postcode` | `postcode` | 邮编 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `country` | `country` | `country` | 国家/地区 |
| `business_segment` | `business_segment` | `businessSegment` | 业务板块 |
| `industry` | `industry` | `industry` | 所属行业 |
| `enterprise_size` | `enterprise_size` | `enterpriseSize` | 企业规模 |
| `other_principal` | `other_principal` | `otherPrincipal` | 其他负责人 |
| `economy_type` | `economy_type` | `economyType` | 经济类型 |
| `province` | `province` | `province` | 省/州 |
| `city` | `city` | `city` | 城市 |
| `county` | `county` | `county` | 区县 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `establishment_date` | `establishment_date` | `establishmentDate` | 设立日期 |

### multiLanguage (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `addressone` | `addressone` | `addressone` | 地址1 |
| `addresstwo` | `addresstwo` | `addresstwo` | 地址2 |
| `addressthree` | `addressthree` | `addressthree` | 地址3 |
| `addressfour` | `addressfour` | `addressfour` | 地址4 |
