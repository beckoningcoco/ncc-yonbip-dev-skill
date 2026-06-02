---
tags: [BIP, 元数据, 数据字典, base, base.shipregion.ShipRegion]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 运输区域 (`base.shipregion.ShipRegion`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `base_shipregion` | 应用: `DPMSI` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 运输区域 |
| 物理表 | `base_shipregion` |
| 应用 | `DPMSI` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-22 23:00:22:000
- 安装来源: `/app/ugoods/upc/src/upc-server/scripts/db/patch/mongodb/V7_R0_2507/0006_bizdoc/0010_iuap_common/DML/0270_iuap_metadata/20260515-itr/202602021533_metadata_base-shipregion.zip`

## 术语标记

`doc`, `isMain`, `MasterData`

## 依赖接口（6 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| ITenant (`ITenant`) | `base.itf.ITenant` | 73 | 1 |
| IErp编码 (`IErpCode`) | `base.itf.IErpCode` | 73 | 1 |
| IStopping (`IStopping`) | `base.itf.IStopping` | 111 | 2 |
| LogicDelete (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（20 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` |  | true |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |  | true |
| 4 | `erpCode` | erp编码 | `erpCode` | String | `text` |  | true |
| 5 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |  | true |
| 6 | `country` | ountry | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |  | true |
| 7 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |  | true |
| 8 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 9 | `dr` | 逻辑删除 | `dr` | Short | `short` |  | true |
| 10 | `defineCharacter` | efineCharacter(日期) | `defineCharacter` | 6f81af01-5324-4883-8f85-c63892fd24b9 | `UserDefine` |  | true |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 12 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 13 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 14 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 15 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 17 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 18 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |

## 关联属性（6 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `country` | ountry | `bd.country.CountryVO` | `country` | 外键 |  |  | Service |  |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 3 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 4 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 5 | `defineCharacter` | efineCharacter(日期) | `base.shipregion.ShipRegionDefineCharacter` | `defineCharacter` | 外键 |  |  | None |  |
| 6 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | None |  |

---

## SQL 示例

```sql
SELECT id, code, name, erpCode, stopstatus, country, stop_time, ytenant_id
FROM base_shipregion
```