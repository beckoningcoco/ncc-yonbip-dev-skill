---
tags: [BIP, 元数据, 数据字典, archive.taxArchives.TaxRateArchive]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 税率档案 (`archive.taxArchives.TaxRateArchive`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_taxrate` | domain：`yonbip-fi-taxpubdoc` | 应用：`DPMTAX` | 业务对象ID：`eef18317-c20c-46f8-9408-416f8e938a19`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 税率档案 |
| 物理表 | `bd_taxrate` |
| domain/服务域 | `yonbip-fi-taxpubdoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMTAX` |
| 直连字段 | 44 个 |
| 子表 | 2 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `TaxRateArchiveDetailList` | `archive.taxArchives.TaxRateArchiveDetail` | composition |
| `progressiveTaxRateList` | `archive.taxArchives.progressiveTaxRate` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `ucfbasedoc.bd_countryref` |
| `unit` | `productcenter.pc_unitref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `define` | `` |
| `` | `` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `tax_bureau_archive_id` | `yonbip-fi-taxpubdoc.RefTable_457b0fd24` |
| `tax_category_archive_id` | `yonbip-fi-taxpubdoc.RefTable_c271791694` |

## 继承接口 (4个, 9字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`

## 字段列表（按类型分组）

> 共 44 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `objid` | `objid` | `objid` | 来源系统主键 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `tenantid` | `tenantid` | `tenantid` | 老租户id |
| `unit_code` | `unit_code` | `unitCode` | 计量单位编码 |
| `task_id` | `task_id` | `taskId` | 删除引用校验任务id |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `businessid` | `businessid` | `businessid` | 业务主键 |
| `code` | `code` | `code` | 税率编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `currency` | `currency` | `currency` | 币种 |
| `unit` | `unit` | `unit` | 单位 |
| `tax_category_archive_id` | `tax_category_archive_id` | `taxCategoryArchiveId` | 税种名称 |
| `tax_bureau_archive_id` | `tax_bureau_archive_id` | `taxBureauArchiveId` | 税制名称 |
| `country` | `country` | `country` | 国家地区 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `effective_date` | `effective_date` | `effectiveDate` | 生效日期 |
| `invalidation_date` | `invalidation_date` | `invalidationDate` | 失效日期 |

### 日期时间 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `synchts` | `synchts` | `synchts` | 来源系统时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间(平台原有) |
| `ts` | `ts` | `ts` | 时间戳 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间(平台原有) |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `withhold_remit` | `withhold_remit` | `withholdRemit` | 代扣代缴 |
| `notaxation` | `notaxation` | `notaxation` | 不征税 |
| `taxfree` | `taxfree` | `taxfree` | 免税 |

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_global` | `is_global` | `isGlobal` | 是否预置 |
| `social_data` | `social_data` | `socialData` | 社会化数据 |
| `scope` | `scope` | `scope` | 适用范围 |
| `tax_rate_type` | `tax_rate_type` | `taxRateType` | 税率类型 |
| `enable` | `enable` | `enable` | 档案状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `calculate_coefficient` | `calculate_coefficient` | `calculateCoefficient` | 计算系数 |
| `del_flag` | `del_flag` | `delFlag` | 自定义删除标记 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ntaxrate` | `ntaxrate` | `ntaxrate` | 税率 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define` | `define` | `define` | 自定义项 |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `log` | `log` | `log` | 操作日志 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 税率描述 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `TaxRateArchiveDetailList` | 税率档案明细 |
| `` | `` | `progressiveTaxRateList` | 累进税率 |
