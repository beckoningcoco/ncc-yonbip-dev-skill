---
tags: [BIP, 元数据, 数据字典, pc, pc.productline.ProductLine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 产品线 (`pc.productline.ProductLine`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `productline` | 应用: `GZTBDM` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 产品线 |
| 物理表 | `productline` |
| 应用 | `GZTBDM` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `cCode` | |

## 部署信息

- 部署时间: 2026-05-22 23:00:07:000
- 安装来源: `/app/ugoods/upc/src/upc-server/scripts/db/patch/mongodb/V7_R0_2507/0001_material/0010_iuap_common/DML/0270_iuap_metadata/20260515-itr/202602021529_metadata_pc-productline.zip`

## 术语标记

`data_auth`, `DirectConnection`, `doc`, `MasterData`

## 依赖接口（5 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| ITenant (`ITenant`) | `base.itf.ITenant` | 73 | 1 |
| IErp编码 (`IErpCode`) | `base.itf.IErpCode` | 73 | 1 |
| IStopping (`IStopping`) | `base.itf.IStopping` | 111 | 2 |
| ISociCoreArchive (`ISociCoreArchive`) | `base.itf.ISociCoreArchive` | 28 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（13 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` | false | true |
| 2 | `code` | 编码 | `cCode` | String | `text` | true | false |
| 3 | `name` | 名称 | `cName` | String | `multiLanguage` | true | false |
| 4 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |  | true |
| 5 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |  | true |
| 6 | `remark` | 备注 | `remark` | String | `multiLanguage` | false | true |
| 7 | `erpCode` | erp编码 | `erpCode` | String | `text` |  | true |
| 8 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 9 | `productLineCharacterDef` | productLineCharacterDef | `productline_character_def` | 69bc9871-a427-427c-9672-6a3c0ddf6293 | `UserDefine` | false | true |
| 10 | `sociCoreArchive` | sociCoreArchive | `sociCoreArchive_id` | Long | `long` |  | true |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 12 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 13 | `productLineDefines` | productLineDefines | `` | ed6f2c0b-aa49-4607-b883-108003cf34ce | `` |  |  |

## 关联属性（4 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `productLineCharacterDef` | productLineCharacterDef | `pc.productline.ProductLineCharacterDef` | `productline_character_def` | 外键 |  |  | None |  |
| 2 | `productLineDefines` | productLineDefines | `pc.productline.ProductLineDefine` | `` | productLineDefines → id | 1 | Y | None |  |
| 3 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 4 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | None |  |

---

## SQL 示例

```sql
SELECT id, cCode, cName, stopstatus, stop_time, remark, erpCode, ytenant_id
FROM productline
```