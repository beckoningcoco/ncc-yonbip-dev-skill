---
tags: [BIP, 元数据, 数据字典, archive, archive.taxArchives.TaxRateArchive]
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

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_taxrate` | 应用: `DPMTAX` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 税率档案 |
| 物理表 | `bd_taxrate` |
| 应用 | `DPMTAX` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-23 00:30:31:000
- 安装来源: `/app/resources/yonbip-fi-taxpubdoc-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-fi-taxpubdoc/0010_iuap_common/DML/0270_iuap_metadata/202601/202603271653_metadata_archive-taxArchives_delta.zip`

## 术语标记

`MasterData`, `SharedZeroTenant`, `doc`

## 依赖接口（4 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| LogicDelete (`LogicDelete`) | `iuap.busiObj.LogicDelete` | 211 | 1 |
| IYTenant (`IYTenant`) | `iuap.busiObj.IYTenant` | 214 | 1 |
| IAuditInfo (`IAuditInfo`) | `iuap.busiObj.IAuditInfo` | 679 | 4 |
| IEnable (`IEnable`) | `iuap.busiObj.IEnable` | 508 | 3 |

---

## 全部属性（44 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `synchts` | synchts | `synchts` | Date | `dateTime` | false |  |
| 2 | `isGlobal` | 是否Global | `is_global` | taxpubdocYNEnum | `singleOption` | false |  |
| 3 | `socialData` | socialData | `social_data` | taxpubdoc_tax_bureau_archive_social_data | `singleOption` | false |  |
| 4 | `objid` | objid | `objid` | String | `text` | false |  |
| 5 | `ytenantId` | ytenantId | `ytenant_id` | String | `text` | false | true |
| 6 | `withholdRemit` | withholdRemit | `withhold_remit` | Boolean | `switch` | false |  |
| 7 | `define` | efine(日期) | `define` | 78189218-86d4-4286-bb4b-02880abf76fe | `UserDefine` | false |  |
| 8 | `creationtime` | reationtime | `creationtime` | Date | `dateTime` | false |  |
| 9 | `effectiveDate` | effectiveDate(日期) | `effective_date` | String | `date` | false |  |
| 10 | `scope` | scope | `scope` | applyScenesWithTaxRate | `singleOption` | false |  |
| 11 | `calculateCoefficient` | alculateCoefficient | `calculate_coefficient` | Integer | `int` | false |  |
| 12 | `ts` | ts | `ts` | Date | `dateTime` | false |  |
| 13 | `currency` | urrency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` | false |  |
| 14 | `tenantid` | tenantid | `tenantid` | String | `text` | false |  |
| 15 | `log` | log | `log` | String | `bigText` | false |  |
| 16 | `modifiedtime` | modifiedtime | `modifiedtime` | Date | `dateTime` | false |  |
| 17 | `unit` | unit | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` | false |  |
| 18 | `taxCategoryArchiveId` | taxCategoryArchiveId | `tax_category_archive_id` | 01a37978-70b8-4e8c-83d7-3a9b79d84917 | `quote` | false |  |
| 19 | `unitCode` | 单位编码 | `unit_code` | String | `text` | false |  |
| 20 | `taxBureauArchiveId` | taxBureauArchiveId | `tax_bureau_archive_id` | d910183c-a1c4-48b2-8bc4-0b9f1dda6eb8 | `quote` | false |  |
| 21 | `notaxation` | notaxation | `notaxation` | Boolean | `switch` | false |  |
| 22 | `name` | 名称 | `name` | String | `multiLanguage` | false |  |
| 23 | `taxRateType` | taxRateType(类型) | `tax_rate_type` | taxRateType | `singleOption` | false |  |
| 24 | `invalidationDate` | invalidationDate(日期) | `invalidation_date` | String | `date` | false |  |
| 25 | `taskId` | taskId | `task_id` | String | `text` | false |  |
| 26 | `taxfree` | taxfree | `taxfree` | Boolean | `switch` | false |  |
| 27 | `ntaxrate` | ntaxrate | `ntaxrate` | Decimal | `number` | false |  |
| 28 | `sysid` | sysid | `sysid` | String | `text` | false |  |
| 29 | `delFlag` | elFlag(日期) | `del_flag` | Integer | `int` | false |  |
| 30 | `businessid` | businessid | `businessid` | String | `text` | false |  |
| 31 | `country` | ountry | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` | false |  |
| 32 | `code` | 编码 | `code` | String | `text` | false |  |
| 33 | `TaxRateArchiveDetailList` | TaxRateArchiveDetailList | `` | 7e7304f0-4c00-413f-a0fc-31c5ed25c177 | `` |  |  |
| 34 | `progressiveTaxRateList` | progressiveTaxRateList | `` | 7cb79bb2-da5a-4b0f-a516-5880d24559cf | `` |  |  |
| 35 | `id` | 主键ID | `id` | String | `text` | false | true |
| 36 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | true |
| 37 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | true |
| 38 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 39 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 40 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | true |
| 41 | `disablets` | isablets(日期) | `disablets` | DateTime | `dateTime` |  | true |
| 42 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |  | true |
| 43 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |  | true |
| 44 | `dr` | 逻辑删除 | `dr` | Short | `short` |  | true |

## 关联属性（10 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `country` | ountry | `bd.country.CountryVO` | `country` | 外键 |  |  | Service | false |
| 2 | `unit` | unit | `pc.unit.Unit` | `unit` | 外键 |  |  | Service | false |
| 3 | `creator` | 创建人 | `base.user.BipUser` | `creator` | 外键 |  |  | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` | 外键 |  |  | Service |  |
| 5 | `define` | efine(日期) | `archive.taxArchives.TaxRateArchivedefineUserDefine` | `define` | 外键 |  |  | None | false |
| 6 | `TaxRateArchiveDetailList` | TaxRateArchiveDetailList | `archive.taxArchives.TaxRateArchiveDetail` | `` | TaxRateArchiveDetailList → taxRateArchiveId | 0..n | Y | None |  |
| 7 | `currency` | urrency | `bd.currencytenant.CurrencyTenantVO` | `currency` | 外键 |  |  | Service | false |
| 8 | `taxBureauArchiveId` | taxBureauArchiveId | `archive.taxArchives.TaxBureauArchive` | `tax_bureau_archive_id` | 外键 |  |  | None | false |
| 9 | `taxCategoryArchiveId` | taxCategoryArchiveId | `archive.taxArchives.TaxCategoryArchive` | `tax_category_archive_id` | 外键 |  |  | None | false |
| 10 | `progressiveTaxRateList` | progressiveTaxRateList | `archive.taxArchives.progressiveTaxRate` | `` | progressiveTaxRateList → taxRateArchiveId | 0..n | Y | None |  |

---

## SQL 示例

```sql
SELECT synchts, is_global, social_data, objid, ytenant_id, withhold_remit, define, creationtime
FROM bd_taxrate
```