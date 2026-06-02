---
tags: [BIP, 元数据, 数据字典, sccs, sccs.multitrade.TradeRoute]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 贸易路径主表 (`sccs.multitrade.TradeRoute`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `scmmp_traderoute` | 应用: `SCCS` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 贸易路径主表 |
| 物理表 | `scmmp_traderoute` |
| 应用 | `SCCS` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-23 00:40:22:000
- 安装来源: `/app/scmmp/scmsa-app/src/yonbip-scm-scmmp/scripts/db/patch/mongodb/V5_R0_2507/0005_scmmp/0010_iuap_common/DML/0270_iuap_metadata/202604/202603051407_metadata_sccs-multitrade_delta.zip`

## 术语标记

`data_auth`, `doc`, `isMain`, `MasterData`

## 依赖接口（3 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| IStopping (`IStopping`) | `base.itf.IStopping` | 111 | 2 |

---

## 全部属性（33 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` |  | true |
| 3 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 4 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 5 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 6 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 7 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 8 | `toinvoice` | toinvoice | `toinvoice` | Short | `short` |  | true |
| 9 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |  | true |
| 10 | `orgId` | 组织ID | `orgId` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` | false | true |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 13 | `name` | 名称 | `name` | String | `multiLanguage` |  | true |
| 14 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 16 | `routeType` | routeType(类型) | `routeType` | Short | `short` |  | true |
| 17 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |  | true |
| 18 | `cobillnum` | obillnum | `cobillnum` | String | `text` |  | true |
| 19 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 20 | `direction` | irection(日期) | `direction` | Short | `short` |  | true |
| 21 | `arrivalSyncDirection` | arrivalSyncDirection | `arrival_sync_direction` | Integer | `int` |  | true |
| 22 | `closureInitiateColl` | losureInitiateColl | `closure_initiate_coll` | Integer | `int` |  | true |
| 23 | `defineCharPick` | efineCharPick(日期) | `definecharpick` | Short | `short` |  | true |
| 24 | `details` | etails(日期) | `` | 64edcc22-4fad-450e-8937-5705cad5179a | `` |  |  |
| 25 | `endtradeAutopurchase` | endtradeAutopurchase | `endtrade_autopurchase` | Boolean | `switch` |  | true |
| 26 | `firstInvoiceMethod` | irstInvoiceMethod(金额) | `first_invoice_method` | Short | `short` |  | true |
| 27 | `firstLogisticsMethod` | irstLogisticsMethod(金额) | `firstlogisticsmethod` | Short | `short` |  | true |
| 28 | `invoiceDirection` | nvoiceDirection(ID) | `invoice_direction` | Integer | `int` |  | true |
| 29 | `isFirstLastStationSync` | 是否FirstLastStationSync | `is_first_last_station_sync` | Integer | `int` |  | true |
| 30 | `isSignConfirmSync` | 是否SignConfirmSync | `is_sign_confirm_sync` | Integer | `int` |  | true |
| 31 | `orderChangeCollaboration` | orderChangeCollaboration | `order_change_collaboration` | Short | `short` |  | true |
| 32 | `orderDirection` | orderDirection | `orderDirection` | Short | `short` |  | true |
| 33 | `rejectDirection` | rejectDirection | `reject_direction` | Short | `short` |  | true |

## 关联属性（5 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 2 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 3 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 4 | `details` | etails(日期) | `sccs.multitrade.TradeRoutes` | `` | details → mainid | 1..n | Y | None |  |
| 5 | `orgId` | 组织ID | `org.func.BaseOrg` | `orgId` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT creator, code, modify_date, ytenant_id, modifier, creatorId, modifierId, toinvoice
FROM scmmp_traderoute
```