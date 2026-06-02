---
tags: [BIP, 元数据, 数据字典, org, org.func.BaseOrg]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 业务单元 (`org.func.BaseOrg`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_orgs` | 应用: `GZTORG` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务单元 |
| 物理表 | `org_orgs` |
| 应用 | `GZTORG` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-23 00:06:27:000
- 安装来源: `/app/orgcenter/iuap-apcom-org/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap-apcom-org/0010_iuap_common/DML/0270_iuap_metadata/202605/202605151129_metadata_org-func_delta.zip`

## 术语标记

`isAssigned`, `isExtend`, `data_auth`, `isMultiCodeRule`, `MasterData`, `isMain`, `isOrg`, `doc`, `DirectConnection`, `state_tag`, `isUseCondition`

## 依赖接口（10 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IAuto编码 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| IOrg (`IOrg`) | `org.base.IOrg` | 17 | 3 |
| ISystemInfo (`ISystemInfo`) | `bd.itf.ISystemInfo` | 77 | 5 |
| BasedocITenant (`BasedocITenant`) | `basedoc.basedocItf.BasedocITenant` | 103 | 1 |
| BasedocIState (`BasedocIState`) | `basedoc.basedocItf.BasedocIState` | 101 | 1 |
| ITimeLineDoc (`ITimeLineDoc`) | `hred.itf.ITimeLineDoc` | 75 | 2 |
| AuditInfo (`AuditInfo`) | `basedoc.basedocItf.AuditInfo` | 289 | 4 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| ITree (`ITree`) | `basedoc.basedocItf.ITree` | 336 | 5 |
| LogicDelete (`LogicDelete`) | `basedoc.basedocItf.LogicDelete` | 31 | 0 |

---

## 全部属性（125 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | String | `text` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` |  | true |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |  | true |
| 4 | `name2` | name2 | `name2` | String | `text` |  | true |
| 5 | `name3` | name3 | `name3` | String | `text` |  | true |
| 6 | `name4` | name4 | `name4` | String | `text` |  | true |
| 7 | `name5` | name5 | `name5` | String | `text` |  | true |
| 8 | `name6` | name6 | `name6` | String | `text` |  | true |
| 9 | `shortname` | shortname | `shortname` | String | `multiLanguage` |  | true |
| 10 | `shortname2` | shortname2 | `shortname2` | String | `text` |  | true |
| 11 | `shortname3` | shortname3 | `shortname3` | String | `text` |  | true |
| 12 | `shortname4` | shortname4 | `shortname4` | String | `text` |  | true |
| 13 | `shortname5` | shortname5 | `shortname5` | String | `text` |  | true |
| 14 | `shortname6` | shortname6 | `shortname6` | String | `text` |  | true |
| 15 | `companytype` | ompanytype | `companytype` | 45cbc79d-a41a-41e4-af94-b264ce83596a | `quote` |  | true |
| 16 | `parent` | parent | `parentid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | true |
| 17 | `parentid` | parentid | `parentid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | true |
| 18 | `innercode` | nnercode(ID) | `innercode` | String | `text` |  | true |
| 19 | `isbizunit` | 是否bizunit | `is_biz_unit` | Integer | `int` |  | true |
| 20 | `parentorgid` | parentorgid | `parentorgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | true |
| 21 | `orgtype` | orgtype | `orgtype` | Integer | `int` |  | true |
| 22 | `iscontrolunit` | 是否controlunit | `is_control_unit` | Integer | `int` |  | true |
| 23 | `depttype` | epttype(日期) | `depttype` | 3bb6a10a-b3a8-438b-a891-3f81baf7a850 | `quote` |  | true |
| 24 | `principal` | principal | `principal` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 25 | `branchleader` | branchleader | `branchleader` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 26 | `locationid` | locationid | `locationid` | 95256905-1d37-4ca6-a37f-ddbdab4d1c25 | `quote` |  | true |
| 27 | `taxpayerid` | taxpayerid | `taxpayerid` | String | `text` |  | true |
| 28 | `taxpayername` | taxpayername | `taxpayername` | String | `text` |  | true |
| 29 | `usedtaxpayerid` | usedtaxpayerid | `usedtaxpayerid` | String | `text` |  | true |
| 30 | `usedtaxpayername` | usedtaxpayername | `usedtaxpayername` | String | `text` |  | true |
| 31 | `address` | 地址 | `address` | String | `multiLanguage` |  | true |
| 32 | `address2` | address2 | `address2` | String | `text` |  | true |
| 33 | `address3` | address3 | `address3` | String | `text` |  | true |
| 34 | `address4` | address4 | `address4` | String | `text` |  | true |
| 35 | `address5` | address5 | `address5` | String | `text` |  | true |
| 36 | `address6` | address6 | `address6` | String | `text` |  | true |
| 37 | `contact` | ontact | `contact` | String | `text` |  | true |
| 38 | `taxpayertype` | taxpayertype | `taxpayertype` | Integer | `int` |  | true |
| 39 | `telephone` | telephone | `telephone` | String | `text` |  | true |
| 40 | `exchangerate` | exchangerate | `exchangerate` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |  | true |
| 41 | `language` | language | `language` | a014aa1b-1f14-4d31-88fb-dcce538d9973 | `quote` |  | true |
| 42 | `timezone` | timezone | `timezone` | String | `text` |  | true |
| 43 | `description` | 描述 | `description` | String | `multiLanguage` |  | true |
| 44 | `description2` | escription2(日期) | `description2` | String | `text` |  | true |
| 45 | `description3` | escription3(日期) | `description3` | String | `text` |  | true |
| 46 | `description4` | escription4(日期) | `description4` | String | `text` |  | true |
| 47 | `description5` | escription5(日期) | `description5` | String | `text` |  | true |
| 48 | `description6` | escription6(日期) | `description6` | String | `text` |  | true |
| 49 | `level` | level | `level` | Integer | `int` |  | true |
| 50 | `displayorder` | isplayorder(日期) | `displayorder` | Integer | `int` |  | true |
| 51 | `sort` | 排序号 | `displayorder` | Integer | `int` |  | true |
| 52 | `globalorder` | globalorder | `global_order` | Integer | `int` |  | true |
| 53 | `objid` | objid | `objid` | String | `text` |  | true |
| 54 | `countryzone` | ountryzone | `countryzone` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |  | true |
| 55 | `corpid` | orpid | `corpid` | a754b1bb-3377-4617-922e-a6108548cd73 | `quote` |  | true |
| 56 | `unitdefinefeature` | unitdefinefeature | `characterid` | de0dbeae-672d-4297-8681-15f13968fa6e | `UserDefine` |  | true |
| 57 | `isdefault` | 是否default | `isdefault` | Integer | `int` |  | true |
| 58 | `isEnd` | 是否End | `isEnd` | Integer | `int` |  | true |
| 59 | `functypes` | unctypes(金额) | `orglevel` | String | `text` |  | true |
| 60 | `currency` | urrency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | true |
| 61 | `frozen` | rozen(金额) | `frozen` | Integer | `int` |  | true |
| 62 | `frozentime` | rozentime(金额) | `frozen_time` | Date | `date` |  | true |
| 63 | `enable` | enable | `enable` | Integer | `int` |  | false |
| 64 | `starttime` | starttime | `start_time` | DateTime | `timestamp` |  | true |
| 65 | `effectivedate` | effectivedate | `effectivedate` | DateTime | `timestamp` |  | true |
| 66 | `endtime` | endtime | `end_time` | DateTime | `timestamp` |  | true |
| 67 | `expirationdate` | expirationdate | `expirationdate` | DateTime | `timestamp` |  | true |
| 68 | `closed` | losed | `closed` | Integer | `int` |  | true |
| 69 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 70 | `creationtime` | reationtime | `creationtime` | DateTime | `timestamp` |  | true |
| 71 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 72 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |  | true |
| 73 | `sourceid` | sourceid | `sourceid` | String | `text` |  | true |
| 74 | `sourcetype` | sourcetype | `source_type` | Integer | `int` |  | true |
| 75 | `externalorg` | externalorg | `external_org` | Integer | `int` |  | true |
| 76 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 77 | `tenantid` | tenantid | `tenantid` | String | `text` |  | false |
| 78 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 79 | `sysid` | sysid | `sysid` | String | `text` |  | false |
| 80 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 81 | `ts` | ts | `ts` | DateTime | `timestamp` |  | false |
| 82 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |  | true |
| 83 | `dr` | 逻辑删除 | `dr` | Integer | `int` |  | true |
| 84 | `orgid` | orgid | `orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | true |
| 85 | `region` | region | `region` | String | `text` |  | true |
| 86 | `orgform` | orgform | `orgform` | String | `text` |  | true |
| 87 | `orglevel` | orglevel | `orglevel` | String | `text` |  | true |
| 88 | `path` | path | `path` | String | `text` |  | true |
| 89 | `businessid` | businessid | `businessid` | String | `text` |  | true |
| 90 | `log` | log | `log` | String | `text` |  | true |
| 91 | `canEmployee` | anEmployee | `can_employee` | Integer | `int` |  | true |
| 92 | `jsonextattr` | jsonextattr | `jsonextattr` | String | `text` |  | true |
| 93 | `groupid` | groupid | `group_id` | String | `text` |  | true |
| 94 | `baseOrgExt` | baseOrgExt | `` | 358dcd4a-b254-4860-95eb-e8470f5c37fc | `` |  |  |
| 95 | `defines` | efines(日期) | `` | 8f74cb2c-d6da-4649-8da2-a236ae3b1029 | `` |  |  |
| 96 | `adminOrg` | adminOrg | `` | c3b96360-c57f-455b-9728-2ca499d9922a | `` |  |  |
| 97 | `salesOrg` | salesOrg | `` | 4991976e-11ee-406e-bdbb-0f73f9f89ff2 | `` |  |  |
| 98 | `purchaseOrg` | purchaseOrg | `` | a4916c85-f087-4e87-a178-0ad37aff7cd0 | `` |  |  |
| 99 | `inventoryOrg` | nventoryOrg(ID) | `` | e18e914b-4518-4e8c-ac21-783145fe7da1 | `` |  |  |
| 100 | `factoryOrg` | actoryOrg(金额) | `` | dcff4710-92a6-4b3a-85c0-553ad21aabc3 | `` |  |  |
| 101 | `researchDevelopOrg` | researchDevelopOrg | `` | 604f7730-68fd-4fe1-9323-b1b2c9a0360e | `` |  |  |
| 102 | `planOrg` | planOrg | `` | 2255a046-3146-4614-92e1-dfc0246b415e | `` |  |  |
| 103 | `qualityOrg` | qualityOrg | `` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a | `` |  |  |
| 104 | `financeOrg` | inanceOrg(金额) | `` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `` |  |  |
| 105 | `taxpayerOrg` | taxpayerOrg | `` | 48b572d0-b5ee-469a-a313-4c20d9182f63 | `` |  |  |
| 106 | `assetsOrg` | assetsOrg | `` | 23108f32-b0af-425a-83cc-d10c0af18cc3 | `` |  |  |
| 107 | `maintainOrg` | maintainOrg | `` | 118abacd-adc7-412e-9c0c-868f1c3b4110 | `` |  |  |
| 108 | `serviceOrg` | serviceOrg | `` | 4572acae-3dd7-4f37-bbf9-766fe130a7f1 | `` |  |  |
| 109 | `logisticsOrg` | logisticsOrg | `` | 5b3cb420-49f7-4289-a937-76cee6a2a349 | `` |  |  |
| 110 | `safetyOrg` | safetyOrg | `` | 5228334a-50fb-49af-8829-86dadc6bdf44 | `` |  |  |
| 111 | `energyOrg` | energyOrg | `` | 7097d9d2-c89c-4405-b2ab-9ce0ca1f8cbc | `` |  |  |
| 112 | `settlementOrg` | settlementOrg | `` | c8022140-b5fa-4f19-a0b2-2be0192eac18 | `` |  |  |
| 113 | `fundsOrg` | undsOrg(金额) | `` | 60bf293e-5593-454b-be50-5a5fa016e4a6 | `` |  |  |
| 114 | `sharingsOrg` | sharingsOrg | `` | 3049d5e4-fc95-4459-9acc-5b9429825966 | `` |  |  |
| 115 | `hrsharingsOrg` | hrsharingsOrg | `` | 84b9eb13-960d-4147-a961-292820a3bd91 | `` |  |  |
| 116 | `hrbizOrg` | hrbizOrg | `` | f2f4b9e0-5035-4a5a-8b65-6cc17bb9e628 | `` |  |  |
| 117 | `itOrg` | tOrg(ID) | `` | 575554ae-c3e6-48c6-b383-9d5a81b3ce80 | `` |  |  |
| 118 | `legalOrg` | legalOrg | `` | 6e90d23e-1fe8-4951-8e39-1bf7a28e151f | `` |  |  |
| 119 | `ext0Org` | ext0Org | `` | a95cf340-bfa7-4980-af28-923effbd198b | `` |  |  |
| 120 | `ext1Org` | ext1Org | `` | d913b342-9085-41a1-a8d1-04c251ed2eab | `` |  |  |
| 121 | `ext2Org` | ext2Org | `` | f1398838-61d4-4050-b848-616c31037659 | `` |  |  |
| 122 | `ext3Org` | ext3Org | `` | 277eeaa5-6b85-4eb4-b97a-62cd276653da | `` |  |  |
| 123 | `ext4Org` | ext4Org | `` | 1274aba2-2700-44a4-9e9f-c9ab986f5901 | `` |  |  |
| 124 | `ext5Org` | ext5Org | `` | b5ad07b4-608d-4ff8-97c7-22df3503d9ad | `` |  |  |
| 125 | `deptnature` | eptnature(日期) | `dept_nature` | Short | `short` |  | true |

## 关联属性（50 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `parent` | parent | `org.func.BaseOrg` | `parentid` | 外键 |  |  | None |  |
| 2 | `ext1Org` | ext1Org | `org.func.Ext1Org` | `` | ext1Org → id | 1 | Y | None |  |
| 3 | `maintainOrg` | maintainOrg | `org.func.MaintainOrg` | `` | maintainOrg → id | 1 | Y | None |  |
| 4 | `baseOrgExt` | baseOrgExt | `org.func.BaseOrgExt` | `` | baseOrgExt → id | 1 | Y | None |  |
| 5 | `financeOrg` | inanceOrg(金额) | `org.func.FinanceOrg` | `` | financeOrg → id | 1 | Y | None |  |
| 6 | `corpid` | orpid | `hrcm.contractentity.ContractEntity` | `corpid` | 外键 |  |  | Service |  |
| 7 | `ext5Org` | ext5Org | `org.func.Ext5Org` | `` | ext5Org → id | 1 | Y | None |  |
| 8 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` | 外键 |  |  | Service |  |
| 9 | `sharingsOrg` | sharingsOrg | `org.func.SharingsOrg` | `` | sharingsOrg → id | 1 | Y | None |  |
| 10 | `qualityOrg` | qualityOrg | `org.func.QualityOrg` | `` | qualityOrg → id | 1 | Y | None |  |
| 11 | `language` | language | `bd.timezonelanguage.LanguageVO` | `language` | 外键 |  |  | Service |  |
| 12 | `researchDevelopOrg` | researchDevelopOrg | `org.func.ResearchDevelopOrg` | `` | researchDevelopOrg → id | 1 | Y | None |  |
| 13 | `safetyOrg` | safetyOrg | `org.func.SafetyOrg` | `` | safetyOrg → id | 1 | Y | None |  |
| 14 | `defines` | efines(日期) | `org.func.BaseOrgDefine` | `` | defines → id | 1 | Y | None |  |
| 15 | `inventoryOrg` | nventoryOrg(ID) | `org.func.InventoryOrg` | `` | inventoryOrg → id | 1 | Y | None |  |
| 16 | `branchleader` | branchleader | `bd.staff.Staff` | `branchleader` | 外键 |  |  | Service |  |
| 17 | `assetsOrg` | assetsOrg | `org.func.AssetsOrg` | `` | assetsOrg → id | 1 | Y | None |  |
| 18 | `purchaseOrg` | purchaseOrg | `org.func.PurchaseOrg` | `` | purchaseOrg → id | 1 | Y | None |  |
| 19 | `tenant` | tenant | `yht.tenant.YhtTenant` | `tenantid` | 外键 |  |  | Service |  |
| 20 | `ext0Org` | ext0Org | `org.func.Ext0Org` | `` | ext0Org → id | 1 | Y | None |  |
| 21 | `hrsharingsOrg` | hrsharingsOrg | `org.func.HrsharingsOrg` | `` | hrsharingsOrg → id | 1 | Y | None |  |
| 22 | `ext4Org` | ext4Org | `org.func.Ext4Org` | `` | ext4Org → id | 1 | Y | None |  |
| 23 | `adminOrg` | adminOrg | `org.func.AdminOrg` | `` | adminOrg → id | 1 | Y | None |  |
| 24 | `orgid` | orgid | `org.func.BaseOrg` | `orgid` | 外键 |  |  | None | true |
| 25 | `energyOrg` | energyOrg | `org.func.EnergyOrg` | `` | energyOrg → id | 1 | Y | None |  |
| 26 | `itOrg` | tOrg(ID) | `org.func.ITOrg` | `` | itOrg → id | 1 | Y | None |  |
| 27 | `exchangerate` | exchangerate | `bd.exchangeRate.ExchangeRateTypeVO` | `exchangerate` | 外键 |  |  | Service |  |
| 28 | `ext3Org` | ext3Org | `org.func.Ext3Org` | `` | ext3Org → id | 1 | Y | None |  |
| 29 | `salesOrg` | salesOrg | `org.func.SalesOrg` | `` | salesOrg → id | 1 | Y | None |  |
| 30 | `legalOrg` | legalOrg | `org.func.LegalOrg` | `` | legalOrg → id | 1 | Y | None |  |
| 31 | `countryzone` | ountryzone | `bd.country.CountryVO` | `countryzone` | 外键 |  |  | Service |  |
| 32 | `parentid` | parentid | `org.func.BaseOrg` | `parentid` | 外键 |  |  | None |  |
| 33 | `settlementOrg` | settlementOrg | `org.func.SettlementOrg` | `` | settlementOrg → id | 1 | Y | None |  |
| 34 | `principal` | principal | `bd.staff.Staff` | `principal` | 外键 |  |  | Service |  |
| 35 | `logisticsOrg` | logisticsOrg | `org.func.LogisticsOrg` | `` | logisticsOrg → id | 1 | Y | None |  |
| 36 | `currency` | urrency | `bd.currencytenant.CurrencyTenantVO` | `currency` | 外键 |  |  | Service |  |
| 37 | `serviceOrg` | serviceOrg | `org.func.ServiceOrg` | `` | serviceOrg → id | 1 | Y | None |  |
| 38 | `hrbizOrg` | hrbizOrg | `org.func.HrbizOrg` | `` | hrbizOrg → id | 1 | Y | None |  |
| 39 | `creator` | 创建人 | `base.user.BipUser` | `creator` | 外键 |  |  | Service |  |
| 40 | `unitdefinefeature` | unitdefinefeature | `org.func.UnitBaseFeature` | `characterid` | 外键 |  |  | None |  |
| 41 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 42 | `ext2Org` | ext2Org | `org.func.Ext2Org` | `` | ext2Org → id | 1 | Y | None |  |
| 43 | `fundsOrg` | undsOrg(金额) | `org.func.FundsOrg` | `` | fundsOrg → id | 1 | Y | None |  |
| 44 | `planOrg` | planOrg | `org.func.PlanOrg` | `` | planOrg → id | 1 | Y | None |  |
| 45 | `companytype` | ompanytype | `org.doc.CompanyType` | `companytype` | 外键 |  |  | None |  |
| 46 | `locationid` | locationid | `hrcm.location.Location` | `locationid` | 外键 |  |  | Service |  |
| 47 | `parentorgid` | parentorgid | `org.func.BaseOrg` | `parentorgid` | 外键 |  |  | None |  |
| 48 | `factoryOrg` | actoryOrg(金额) | `org.func.FactoryOrg` | `` | factoryOrg → id | 1 | Y | None |  |
| 49 | `depttype` | epttype(日期) | `org.doc.DeptType` | `depttype` | 外键 |  |  | None |  |
| 50 | `taxpayerOrg` | taxpayerOrg | `org.func.TaxpayerOrg` | `` | taxpayerOrg → id | 1 | Y | None |  |

---

## SQL 示例

```sql
SELECT id, code, name, name2, name3, name4, name5, name6
FROM org_orgs
```