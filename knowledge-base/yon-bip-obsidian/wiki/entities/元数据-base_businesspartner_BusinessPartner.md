---
tags: [BIP, 元数据, 数据字典, base, base.businesspartner.BusinessPartner]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 业务伙伴 (`base.businesspartner.BusinessPartner`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `base_businesspartner` | 应用: `DPMBP`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 全部属性（53 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `partnerRoleClasses` | partnerRoleClasses | `` | e861426d-069e-4ca0-9aa9-1e1cac8645ab | `` |  |  |
| 2 | `id` | 主键ID | `id` | String | `text` |  | true |
| 3 | `code` | 编码 | `code` | String | `text` |  | true |
| 4 | `name` | 名称 | `name` | String | `multiLanguage` |  | true |
| 5 | `erpCode` | erp编码 | `erpCode` | String | `text` |  | true |
| 6 | `shortname` | shortname | `shortname` | String | `multiLanguage` |  | true |
| 7 | `searchcode` | searchcode | `searchcode` | String | `text` |  | true |
| 8 | `partnerType` | 伙伴类型 | `partnerType` | PartnerType | `` |  | true |
| 9 | `parent` | parent | `parent_id` | c1627369-6457-4828-883d-756b79bd0f46 | `quote` |  | true |
| 10 | `country` | country | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |  | true |
| 11 | `newTimeZone` | newTimeZone | `new_time_zone_id` | String | `text` |  | true |
| 12 | `language` | language | `language` | a014aa1b-1f14-4d31-88fb-dcce538d9973 | `quote` |  | true |
| 13 | `internalOrgId` | internalOrgID | `internal_org_Id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | true |
| 14 | `financialSynergyFlag` | financialSynergyFlag | `financial_synergy_flag` | Integer | `int` |  | true |
| 15 | `status` | 状态 | `status` | Status | `` |  | true |
| 16 | `comment` | comment | `comment` | String | `multiLanguage` |  | true |
| 17 | `businessPartnerCharacterDef` | businessPartnerCharacterDef | `business_partner_character_def` | cebffa0b-1243-415c-a431-2be9de666da8 | `UserDefine` |  | true |
| 18 | `licenseType` | licenseType | `licenseType` | LicenseType | `` |  | true |
| 19 | `creditCode` | credit编码 | `creditCode` | String | `text` |  | true |
| 20 | `legalPerson` | legalPerson | `legalPerson` | String | `text` |  | true |
| 21 | `legalPersonIdNo` | legalPersonIdNo | `legalPersonIdNo` | String | `text` |  | true |
| 22 | `mobile` | mobile | `mobile` | String | `text` | false | true |
| 23 | `money` | money | `money` | String | `text` |  | true |
| 24 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | true |
| 25 | `buildDate` | buildDate | `buildDate` | DateTime | `timestamp` |  | true |
| 26 | `businessterm` | businessterm | `businessterm` | DateTime | `timestamp` |  | true |
| 27 | `regionId` | regionID | `regionId` | String | `text` |  | true |
| 28 | `regAddress` | regAddress | `regAddress` | String | `text` |  | true |
| 29 | `contactName` | contact名称 | `contactName` | String | `text` |  | true |
| 30 | `contactTel` | contactTel | `contactTel` | String | `text` |  | true |
| 31 | `fax` | fax | `fax` | String | `text` |  | true |
| 32 | `email` | email | `email` | String | `text` |  | true |
| 33 | `postalCode` | postal编码 | `postalCode` | String | `text` |  | true |
| 34 | `website` | website | `website` | String | `text` |  | true |
| 35 | `scope` | scope | `scope` | String | `multiLanguage` |  | true |
| 36 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 37 | `dr` | 逻辑删除 | `dr` | Short | `short` |  | true |
| 38 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 39 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 40 | `timeZone` | timeZone | `timeZone` | ff57c966-b826-4a94-a5f6-1599c1fe4eb3 | `quote` |  | true |
| 41 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 42 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 43 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 44 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 45 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 46 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 47 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 48 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 49 | `orgGroupId` | orgGroupID | `org_group_id` | 6a8af5af-0687-4254-ab87-c07e00fc8398 | `quote` |  | true |
| 50 | `partnerCapitalComparisons` | partnerCapitalComparisons | `` | fecb2491-7f44-45ee-9904-713e5aa6ee9b | `` |  |  |
| 51 | `partnerVendorComparisons` | partnerVendorComparisons | `` | 25ed4839-ccf6-4f1c-a96b-aa5234390e76 | `` |  |  |
| 52 | `partnerMerchantComparisons` | partnerMerchantComparisons | `` | a625aa78-13e5-41a7-9251-c5e4b20309a2 | `` |  |  |
| 53 | `partnerBankDatas` | partnerBankDatas | `` | 042cf129-0454-4374-9062-dcb42f61301e | `` |  |  |

## 关联属性（17 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `country` | `bd.country.CountryVO` | `country` |  |  |  |
| 2 | `parent` | `base.businesspartner.BusinessPartner` | `parent_id` |  |  |  |
| 3 | `partnerCapitalComparisons` | `base.businesspartner.PartnerCapitalComparison` | `` | 0..n | Y |  |
| 4 | `partnerBankDatas` | `base.businesspartner.BankData` | `` | 0..n | Y |  |
| 5 | `partnerVendorComparisons` | `base.businesspartner.PartnerVendorComparison` | `` | 0..n | Y |  |
| 6 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 7 | `partnerMerchantComparisons` | `base.businesspartner.PartnerMerchantComparison` | `` | 0..n | Y |  |
| 8 | `creatorId` | `base.user.User` | `creatorId` |  |  |  |
| 9 | `modifierId` | `base.user.User` | `modifierId` |  |  |  |
| 10 | `timeZone` | `bd.timezonelanguage.TimeZoneVO` | `timeZone` |  |  |  |
| 11 | `language` | `bd.timezonelanguage.LanguageVO` | `language` |  |  |  |
| 12 | `businessPartnerCharacterDef` | `base.businesspartner.BusinessPartnerCharacterDef` | `business_partner_character_def` |  |  |  |
| 13 | `orgGroupId` | `pc.pub_org_group.PubOrgGroup` | `org_group_id` |  |  |  |
| 14 | `currency` | `bd.currencytenant.CurrencyTenantVO` | `currency` |  |  |  |
| 15 | `partnerRoleClasses` | `base.businesspartner.RoleClass` | `` | 0..n | Y |  |
| 16 | `internalOrgId` | `bd.adminOrg.BaseOrgVO` | `internal_org_Id` |  |  |  |
| 17 | `tenant` | `base.tenant.Tenant` | `tenant_id` |  |  |  |

## 依赖接口（6 个）

- `IAuditInfo` → `base.itf.IAuditInfo` (v340)
- `ITenant` → `base.itf.ITenant` (v73)
- `IErpCode` → `base.itf.IErpCode` (v73)
- `LogicDelete` → `ucfbase.ucfbaseItf.LogicDelete` (v74)
- `IAutoCode` → `voucher.base.IAutoCode` (v49)
- `IYTenant` → `ucfbase.ucfbaseItf.IYTenant` (v40)

## SQL 示例

```sql
SELECT id, code, name, erpCode, shortname, searchcode, partnerType, parent_id
FROM base_businesspartner
```