---
tags: [BIP, 元数据, 数据字典, aa, aa.salearea.SaleArea]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 销售区域 (`aa.salearea.SaleArea`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_salearea` | 应用: `DPMCUS` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售区域 |
| 物理表 | `aa_salearea` |
| 应用 | `DPMCUS` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-22 23:00:18:000
- 安装来源: `/app/ugoods/upc/src/upc-server/scripts/db/patch/mongodb/V7_R0_2507/0002_customer/0010_iuap_common/DML/0270_iuap_metadata/20260515-itr/202602021528_metadata_aa-salearea.zip`

## 术语标记

`isAssigned`, `isExtend`, `data_auth`, `MasterData`, `dataAuth`, `doc`, `DirectConnection`

## 依赖接口（6 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| ITree (`ITree`) | `base.itf.ITree` | 231 | 5 |
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| IStopping (`IStopping`) | `base.itf.IStopping` | 111 | 2 |
| IShop (`IShop`) | `base.itf.IShop` | 65 | 1 |
| IAuto编码 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（32 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` | false | true |
| 2 | `orgId` | 组织ID | `orgId` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` | false | true |
| 3 | `code` | 编码 | `code` | String | `text` | true | false |
| 4 | `name` | 名称 | `name` | String | `multiLanguage` | true | false |
| 5 | `erpCode` | erp编码 | `cErpCode` | String | `text` | false | true |
| 6 | `parent` | parent | `parent_id` | 75fb7b76-fdb5-4e87-ab0d-e4215a299634 | `quote` | false | true |
| 7 | `order` | order | `iOrder` | Integer | `int` | false | true |
| 8 | `stopstatus` | stopstatus | `bStopStatus` | Boolean | `switch` | false | true |
| 9 | `remark` | 备注 | `remark` | String | `multiLanguage` | false | true |
| 10 | `custType` | custType(类型) | `iCreatorType` | CustType | `` | false | true |
| 11 | `shop` | shop | `iShopID` | Long | `long` |  | true |
| 12 | `stoptime` | stoptime | `dStopTime` | DateTime | `timestamp` | false | true |
| 13 | `path` | path | `path` | String | `text` |  | true |
| 14 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |  | true |
| 15 | `level` | level | `level` | Integer | `int` |  | true |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 17 | `logicallyDeleteType` | logicallyDeleteType(类型) | `logically_delete_type` | LogicallyDeleteType | `` | false | true |
| 18 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 19 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 20 | `sort` | 排序号 | `sort_num` | Integer | `int` |  | true |
| 21 | `creatorName` | creator名称 | `cCreatorName` | String | `text` | false | true |
| 22 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 23 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 24 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 25 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 26 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 27 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 28 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 29 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 30 | `saleAreaCharacter` | saleAreaCharacter | `aa_salearea_character` | 0cd2e7cd-f2f9-4570-b9a5-acc3188aa8d8 | `UserDefine` | false | true |
| 31 | `defines` | efines(日期) | `` | fd75cb59-abc9-4f5c-8c1f-cabd052bee2f | `` |  |  |
| 32 | `saleAreaApplyRange` | saleAreaApplyRange | `` | fc237a24-2ce5-4ebb-a723-4c36656b67db | `` |  |  |

## 关联属性（9 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `parent` | parent | `aa.salearea.SaleArea` | `parent_id` | 外键 |  |  | None |  |
| 2 | `saleAreaCharacter` | saleAreaCharacter | `aa.salearea.SaleAreaCharacter` | `aa_salearea_character` | 外键 |  |  | None |  |
| 3 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 4 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 5 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 6 | `orgId` | 组织ID | `bd.adminOrg.BaseOrgVO` | `orgId` | 外键 |  |  | Service |  |
| 7 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | None |  |
| 8 | `saleAreaApplyRange` | saleAreaApplyRange | `aa.salearea.SaleAreaApplyRange` | `` | saleAreaApplyRange → saleArea | 0..n | Y | None |  |
| 9 | `defines` | efines(日期) | `aa.salearea.SaleAreaDefine` | `` | defines → id | 1 | Y | None |  |

---

## SQL 示例

```sql
SELECT id, orgId, code, name, cErpCode, parent_id, iOrder, bStopStatus
FROM aa_salearea
```