---
tags: [BIP, 元数据, 数据字典, usp, usp.sendAndReceiveSite.SendAndReceiveSite]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 收发货点 (`usp.sendAndReceiveSite.SendAndReceiveSite`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `usp_sendandreceivesite` | 应用: `SCCS` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收发货点 |
| 物理表 | `usp_sendandreceivesite` |
| 应用 | `SCCS` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2025-10-24 23:47:33:000
- 安装来源: `/app/newustock/src/yonbip-scm-scmf/scripts/db/patch/mongodb/V5_R0_2507/0003_scmpub/0010_iuap_common/DML/0270_iuap_metadata/202510/202510091106_metadata_usp-sendAndReceiveSite_delta.zip`

## 术语标记

`doc`, `MasterData`

## 依赖接口（5 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IStopping (`IStopping`) | `base.itf.IStopping` | 111 | 2 |
| ITenant (`ITenant`) | `base.itf.ITenant` | 73 | 1 |
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| IAuto编码 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（23 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 2 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 3 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 4 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 6 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |  | true |
| 7 | `code` | 编码 | `code` | String | `text` |  | true |
| 8 | `siteName` | site名称 | `site_name` | String | `multiLanguage` |  | true |
| 9 | `transportAreaId` | transportAreaId | `transport_area_id` | 373171f0-f497-4bab-bda7-ff4b6489c13e | `quote` |  | true |
| 10 | `detailedAddress` | etailedAddress(日期) | `detailed_address` | String | `multiLanguage` |  | true |
| 11 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |  | true |
| 12 | `remake` | remake | `remake` | String | `multiLanguage` |  | true |
| 13 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 15 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 17 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 18 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 19 | `latitude` | 纬度 | `latitude` | Decimal | `number` |  | true |
| 20 | `linkman` | linkman | `linkman` | String | `text` |  | true |
| 21 | `longitude` | 经度 | `longitude` | Decimal | `number` |  | true |
| 22 | `phone` | phone | `phone` | String | `text` |  | true |
| 23 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |

## 关联属性（5 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 2 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 3 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 4 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | Service |  |
| 5 | `transportAreaId` | transportAreaId | `base.shipregion.ShipRegion` | `transport_area_id` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT create_date, creatorId, modifierId, modify_date, pubts, stop_time, code, site_name
FROM usp_sendandreceivesite
```