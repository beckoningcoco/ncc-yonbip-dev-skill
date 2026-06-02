---
tags: [BIP, 元数据, 数据字典, bd, bd.expenseitem.ExpenseItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 费用项目 (`bd.expenseitem.ExpenseItem`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_expenseitem` | 应用: `DPMACCT`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 全部属性（47 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` | false | true |
| 2 | `code` | 编码 | `code` | String | `text` | true | false |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` | false | true |
| 4 | `assetbusiness` | assetbusiness | `assetbusiness` | Boolean | `switch` | false | true |
| 5 | `assetmanage` | assetmanage | `assetmanage` | String | `text` | false | true |
| 6 | `assetproduct` | assetproduct | `assetproduct` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` | false | true |
| 7 | `character` | character | `expenseitem_character` | a2e4dca2-d2d8-4edf-b181-3521edd284a4 | `UserDefine` | false | true |
| 8 | `picture` | picture | `picture` | String | `text` | false | true |
| 9 | `costcontrolbusiness` | costcontrolbusiness | `costcontrolbusiness` | Boolean | `switch` | false | true |
| 10 | `invoice` | invoice | `invoice` | Boolean | `switch` | false | true |
| 11 | `marketbusiness` | marketbusiness | `marketbusiness` | Boolean | `switch` | false | true |
| 12 | `propertybusiness` | propertybusiness | `propertybusiness` | Boolean | `switch` | false | true |
| 13 | `shared` | shared | `shared` | Boolean | `switch` | false | true |
| 14 | `supplychainbusiness` | supplychainbusiness | `supplychainbusiness` | Boolean | `switch` | false | true |
| 15 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 16 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |  | true |
| 17 | `level` | level | `level` | Integer | `int` |  | true |
| 18 | `objid` | objid | `obj_id` | String | `text` | false | true |
| 19 | `parent` | parent | `parent` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` | false | true |
| 20 | `path` | path | `path` | String | `text` |  | true |
| 21 | `sort` | sort | `sort` | Decimal | `number` | false | true |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 23 | `accentity` | accentity | `accentity` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` | false | true |
| 24 | `expenseitemtype` | expenseitemtype | `expenseitemtype` | f21b5eab-a129-49f6-ae72-9f9a2f415134 | `quote` | false | true |
| 25 | `product` | product | `product` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` | false | true |
| 26 | `productsku` | productsku | `productsku` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` | false | true |
| 27 | `taxDeductible` | taxDeductible | `taxDeductible` | Boolean | `switch` | false | true |
| 28 | `updateCost` | updateCost | `updateCost` | Boolean | `switch` | false | true |
| 29 | `desc` | desc | `desc` | String | `multiLanguage` | false | true |
| 30 | `enabled` | enabled | `enabled` | Boolean | `switch` | false | true |
| 31 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 32 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 33 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 34 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 35 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 36 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 37 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 38 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 39 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |  | true |
| 40 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |  | true |
| 41 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 42 | `applyranges` | applyranges | `` | c02cef75-6246-46eb-b564-a50b395078cc | `` |  |  |
| 43 | `delLog` | delLog | `del_log` | String | `text` | false | true |
| 44 | `delStatus` | delStatus | `del_status` | Short | `short` | false | true |
| 45 | `mnemoniccode` | mnemoniccode | `mnemoniccode` | String | `text` |  | true |
| 46 | `products` | products | `` | a7825eef-94fb-4140-9182-4f8f3c658c5a | `` |  |  |
| 47 | `taskId` | taskID | `task_id` | String | `text` | false | true |

## 关联属性（13 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `assetproduct` | `pc.product.Product` | `assetproduct` |  |  |  |
| 2 | `parent` | `bd.expenseitem.ExpenseItem` | `parent` |  |  |  |
| 3 | `product` | `pc.product.Product` | `product` |  |  |  |
| 4 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 5 | `creatorId` | `base.user.User` | `creatorId` |  |  |  |
| 6 | `modifierId` | `base.user.User` | `modifierId` |  |  |  |
| 7 | `accentity` | `org.func.BaseOrg` | `accentity` |  |  |  |
| 8 | `products` | `bd.expenseitem.ExpenseItemProduct` | `` | 0..n | Y |  |
| 9 | `character` | `bd.expenseitem.expenseitemCharacter` | `expenseitem_character` |  |  |  |
| 10 | `productsku` | `pc.product.ProductSKU` | `productsku` |  |  |  |
| 11 | `expenseitemtype` | `bd.expenseitem.ExpenseItemType` | `expenseitemtype` |  |  |  |
| 12 | `applyranges` | `bd.expenseitem.ExpenseItemApplyRange` | `` | 0..n | Y |  |
| 13 | `tenant` | `base.tenant.Tenant` | `tenant_id` |  |  |  |

## 依赖接口（6 个）

- `IAuditInfo` → `base.itf.IAuditInfo` (v340)
- `ITree` → `ucfbase.ucfbaseItf.ITree` (v339)
- `ITenant` → `base.itf.ITenant` (v73)
- `IYTenant` → `ucfbase.ucfbaseItf.IYTenant` (v40)
- `IStopping` → `base.itf.IStopping` (v111)
- `IAutoCode` → `voucher.base.IAutoCode` (v49)

## SQL 示例

```sql
SELECT id, code, name, assetbusiness, assetmanage, assetproduct, expenseitem_character, picture
FROM bd_expenseitem
```