---
tags: [BIP, 元数据, 数据字典, pc, pc.unit.Unit]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 计量单位 (`pc.unit.Unit`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `unit` | 应用: `GZTBDM` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计量单位 |
| 物理表 | `unit` |
| 应用 | `GZTBDM` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-01-23 23:27:31:000
- 安装来源: `/app/ugoods/upc/src/upc-server/scripts/db/patch/mongodb/V7_R0_2507/0001_material/0010_iuap_common/DML/0270_iuap_metadata/20260115-itr/202512232144_metadata_pc-unit.zip`

## 术语标记

`DirectConnection`, `doc`, `isMain`, `MasterData`

## 依赖接口（7 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| ITenant (`ITenant`) | `base.itf.ITenant` | 73 | 1 |
| IErp编码 (`IErpCode`) | `base.itf.IErpCode` | 73 | 1 |
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| Deletable (`Deletable`) | `base.itf.Deletable` | 67 | 1 |
| IStopping (`IStopping`) | `base.itf.IStopping` | 111 | 2 |
| ISociCoreArchive (`ISociCoreArchive`) | `base.itf.ISociCoreArchive` | 28 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（31 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` | true | false |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` | true | false |
| 4 | `erpCode` | erp编码 | `erpCode` | String | `text` |  | true |
| 5 | `enName` | en名称 | `en_name` | String | `text` | false | true |
| 6 | `unitGroup` | unitGroup | `unit_group_id` | 13e015de-e72c-4af0-bf79-bfe8dd03ffdb | `quote` | false | true |
| 7 | `truncationType` | truncationType(类型) | `truncationType` | Integer | `int` | true | false |
| 8 | `precision` | precision | `precision` | Integer | `int` | false | true |
| 9 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |  | true |
| 10 | `bBaseUnit` | bBaseUnit | `baseunit` | Boolean | `switch` | false | true |
| 11 | `convertCoefficient` | onvertCoefficient | `convert_coefficient` | Decimal | `number` | false | true |
| 12 | `sourcetype` | sourcetype | `sourcetype` | Boolean | `switch` | false | true |
| 13 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |  | true |
| 14 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` | false | true |
| 15 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` | false | true |
| 16 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` | false | true |
| 17 | `sociCoreArchive` | sociCoreArchive | `sociCoreArchive_id` | Long | `long` |  | true |
| 18 | `logicallyDeleteType` | logicallyDeleteType(类型) | `logically_delete_type` | LogicallyDeleteType | `` | false | true |
| 19 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |  | true |
| 20 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 22 | `unitCharacter` | unitCharacter | `unit_character` | 14285594-c962-4d6f-b909-b053dfa5f7f5 | `UserDefine` | false | true |
| 23 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 24 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 25 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 26 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 27 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 28 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 29 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 30 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 31 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |

## 关联属性（6 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 2 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 3 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 4 | `unitCharacter` | unitCharacter | `pc.unit.UnitCharacter` | `unit_character` | 外键 |  |  | None |  |
| 5 | `unitGroup` | unitGroup | `pc.unit.UnitGroup` | `unit_group_id` | 外键 |  |  | None |  |
| 6 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | None |  |

---

## SQL 示例

```sql
SELECT id, code, name, erpCode, en_name, unit_group_id, truncationType, precision
FROM unit
```