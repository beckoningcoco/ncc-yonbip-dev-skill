---
tags: [BIP, 元数据, 数据字典, aa, aa.agentlevel.AgentLevel]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 客户级别 (`aa.agentlevel.AgentLevel`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `agentlevel` | 应用: `DPMCUS`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `cCode` | |

## 全部属性（23 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 2 | `code` | 编码 | `cCode` | String | `text` | true | true |
| 3 | `name` | 名称 | `cName` | String | `multiLanguage` | true | true |
| 4 | `erpCode` | erp编码 | `cErpCode` | String | `text` |  | true |
| 5 | `isEnabled` | 是否Enabled | `isEnabled` | Boolean | `switch` |  | true |
| 6 | `order` | order | `iOrder` | Integer | `int` |  | true |
| 7 | `comment` | comment | `cComment` | String | `multiLanguage` |  | true |
| 8 | `shop` | shop | `iShopID` | Long | `long` |  | true |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 10 | `iDeleted` | iDeleted | `iDeleted` | Integer | `int` |  | true |
| 11 | `custType` | custType | `iCreatorType` | CustType | `` |  | true |
| 12 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 13 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 14 | `outSysKey` | outSysKey | `cOutSysKey` | String | `text` |  | true |
| 15 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 17 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 18 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 19 | `creatorName` | creator名称 | `cCreatorName` | String | `text` |  | true |
| 20 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 21 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 22 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 23 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |

## 关联属性（4 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 2 | `creatorId` | `base.user.User` | `creatorId` |  |  |  |
| 3 | `modifierId` | `base.user.User` | `modifierId` |  |  |  |
| 4 | `tenant` | `base.tenant.Tenant` | `tenant_id` |  |  |  |

## 依赖接口（4 个）

- `IAuditInfo` → `base.itf.IAuditInfo` (v340)
- `ITenant` → `base.itf.ITenant` (v73)
- `IShop` → `base.itf.IShop` (v65)
- `IYTenant` → `ucfbase.ucfbaseItf.IYTenant` (v40)

## SQL 示例

```sql
SELECT id, cCode, cName, cErpCode, isEnabled, iOrder, cComment, iShopID
FROM agentlevel
```