---
tags: [BIP, 元数据, 数据字典, usp, usp.plantransportroute.PlanTransportRoute]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 计划运输路线 (`usp.plantransportroute.PlanTransportRoute`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `usp_plantransportroute` | 应用: `SCCS` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划运输路线 |
| 物理表 | `usp_plantransportroute` |
| 应用 | `SCCS` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2025-10-24 23:47:33:000
- 安装来源: `/app/newustock/src/yonbip-scm-scmf/scripts/db/patch/mongodb/V5_R0_2507/0003_scmpub/0010_iuap_common/DML/0270_iuap_metadata/202510/202510091113_metadata_usp-plantransportroute_delta.zip`

## 术语标记

`doc`, `MasterData`

## 依赖接口（5 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IAuto编码 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| ITenant (`ITenant`) | `base.itf.ITenant` | 73 | 1 |
| IStopping (`IStopping`) | `base.itf.IStopping` | 111 | 2 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（28 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 2 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 4 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |  | true |
| 5 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 6 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 7 | `code` | 编码 | `code` | String | `text` |  | true |
| 8 | `name` | 名称 | `name` | String | `multiLanguage` |  | true |
| 9 | `startPoint` | startPoint | `startPoint` | String | `text` |  | true |
| 10 | `endPoint` | endPoint | `endPoint` | String | `text` |  | true |
| 11 | `sendTransWay` | sendTransWay | `sendTransWay` | aa2f6845-347d-499f-a5b2-964b84747d99 | `quote` |  | true |
| 12 | `defaultCarrier` | efaultCarrier(日期) | `defaultCarrier` | 1b03840a-b023-48e5-8ef4-0e613721e2d0 | `quote` |  | true |
| 13 | `specifyCarrier` | specifyCarrier | `specifyCarrier` | Boolean | `switch` |  | true |
| 14 | `routeDistance` | routeDistance | `routeDistance` | Decimal | `number` |  | true |
| 15 | `routeDuration` | routeDuration | `routeDuration` | Decimal | `number` |  | true |
| 16 | `isConsiderPlan` | 是否ConsiderPlan | `isConsiderPlan` | Boolean | `switch` |  | true |
| 17 | `planLeadTime` | planLeadTime(时间) | `planLeadTime` | Decimal | `number` |  | true |
| 18 | `isSegmentedTransport` | 是否SegmentedTransport | `isSegmentedTransport` | Boolean | `switch` |  | true |
| 19 | `memo` | 备注 | `memo` | String | `multiLanguage` |  | true |
| 20 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |  | true |
| 21 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 22 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 23 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 24 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 25 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 26 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 27 | `childs` | hilds | `` | 1e79a3a1-5309-428e-8964-93b4894fb94b | `` |  |  |
| 28 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |

## 关联属性（7 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 2 | `defaultCarrier` | efaultCarrier(日期) | `les.carrier.carrier` | `defaultCarrier` | 外键 |  |  | Service |  |
| 3 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 4 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 5 | `sendTransWay` | sendTransWay | `aa.sendtrans.SendTransWay` | `sendTransWay` | 外键 |  |  | Service |  |
| 6 | `childs` | hilds | `usp.plantransportroute.PlanTransportRouteDetail` | `` | childs → mainId | 0..n | Y | None |  |
| 7 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT create_date, modify_date, pubts, stop_time, tenant_id, id, code, name
FROM usp_plantransportroute
```