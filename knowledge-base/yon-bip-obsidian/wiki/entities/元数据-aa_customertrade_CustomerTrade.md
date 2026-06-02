---
tags: [BIP, 元数据, 数据字典, aa, aa.customertrade.CustomerTrade]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 客户行业 (`aa.customertrade.CustomerTrade`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_customertrade` | 应用: `DPMCUS`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `cCode` | |

## 全部属性（29 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 2 | `code` | 编码 | `cCode` | String | `text` | true | true |
| 3 | `name` | 名称 | `cName` | String | `multiLanguage` | true | true |
| 4 | `erpCode` | erp编码 | `cErpCode` | String | `text` |  | true |
| 5 | `order` | order | `iOrder` | Integer | `int` |  | true |
| 6 | `parent` | parent | `parent_id` | 51a01b3e-039a-4bb1-84e2-9c711c34d9e8 | `quote` |  | true |
| 7 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |  | true |
| 8 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |  | true |
| 9 | `customerTradeCharacter` | customerTradeCharacter | `customer_trade_character` | 07f5d88b-4f28-411e-9ac6-ac77f12ecd8f | `UserDefine` |  | true |
| 10 | `custType` | custType | `iCreatorType` | CustType | `` |  | true |
| 11 | `shop` | shop | `iShopID` | Long | `long` |  | true |
| 12 | `path` | path | `path` | String | `text` |  | true |
| 13 | `level` | level | `level` | Integer | `int` |  | true |
| 14 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |  | true |
| 15 | `iDeleted` | iDeleted | `iDeleted` | Integer | `int` |  | true |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 17 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 18 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 19 | `sort` | sort | `sort_num` | Integer | `int` |  | true |
| 20 | `isEnabled` | 是否Enabled | `isEnabled` | Boolean | `switch` |  | true |
| 21 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 22 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 23 | `creatorName` | creator名称 | `cCreatorName` | String | `text` |  | true |
| 24 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 25 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 26 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 27 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 28 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 29 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |

## 关联属性（6 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `parent` | `aa.customertrade.CustomerTrade` | `parent_id` |  |  |  |
| 2 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 3 | `creatorId` | `base.user.User` | `creatorId` |  |  |  |
| 4 | `modifierId` | `base.user.User` | `modifierId` |  |  |  |
| 5 | `customerTradeCharacter` | `aa.customertrade.CustomerTradeCharacter` | `customer_trade_character` |  |  |  |
| 6 | `tenant` | `base.tenant.Tenant` | `tenant_id` |  |  |  |

## 依赖接口（5 个）

- `ITree` → `base.itf.ITree` (v231)
- `IAuditInfo` → `base.itf.IAuditInfo` (v340)
- `IStopping` → `base.itf.IStopping` (v111)
- `IShop` → `base.itf.IShop` (v65)
- `IYTenant` → `ucfbase.ucfbaseItf.IYTenant` (v40)

## SQL 示例

```sql
SELECT id, cCode, cName, cErpCode, iOrder, parent_id, stopstatus, stop_time
FROM aa_customertrade
```