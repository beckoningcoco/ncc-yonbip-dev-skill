---
tags: [BIP, 元数据, 数据字典, aa, aa.settlemethod.SettleMethod]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 结算方式 (`aa.settlemethod.SettleMethod`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `settle_method` | 应用: `DPMSETL` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 结算方式 |
| 物理表 | `settle_method` |
| 应用 | `DPMSETL` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `cCode` | |

## 部署信息

- 部署时间: 2026-01-23 23:27:49:000
- 安装来源: `/app/ugoods/upc/src/upc-server/scripts/db/patch/mongodb/V7_R0_2507/0006_bizdoc/0010_iuap_common/DML/0270_iuap_metadata/20260115-itr/202512051451_metadata_aa-settlemethod.zip`

## 术语标记

`isAssigned`, `isExtend`, `MasterData`, `doc`, `tree_tag`

## 依赖接口（7 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| ITree (`ITree`) | `base.itf.ITree` | 231 | 5 |
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| ITenant (`ITenant`) | `base.itf.ITenant` | 73 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| IAuto编码 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| ITree (`ITree`) | `ucfbase.ucfbaseItf.ITree` | 339 | 6 |
| ITree (`ITree`) | `iuap.busiObj.ITree` | 968 | 6 |

---

## 全部属性（30 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `settlemethodFreeDefines` | settlemethodFreeDefines | `` | 95cb6ac5-a16f-4888-bfa6-506637cf0722 | `` |  |  |
| 2 | `code` | 编码 | `cCode` | String | `text` | true | false |
| 3 | `comment` | omment | `cComment` | String | `multiLanguage` |  | true |
| 4 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 6 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 7 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 8 | `defineCharacter` | efineCharacter(日期) | `defineCharacter` | b58a0b77-d6e2-49f9-a4e6-025a8f48ef73 | `UserDefine` |  | true |
| 9 | `directConnection` | irectConnection(日期) | `direct_connection` | Integer | `int` |  | true |
| 10 | `erpCode` | erp编码 | `cErpCode` | String | `text` |  | true |
| 11 | `iDeleted` | 是否删除 | `iDeleted` | Integer | `int` |  | true |
| 12 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 13 | `isDefault` | 是否Default | `isDefault` | Boolean | `switch` |  | true |
| 14 | `isEnabled` | 是否启用 | `isEnabled` | Boolean | `switch` | false | false |
| 15 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |  | true |
| 16 | `level` | level | `iDepth` | Integer | `int` |  | true |
| 17 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 18 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 21 | `name` | 名称 | `cName` | String | `multiLanguage` | true | false |
| 22 | `order` | order | `iOrder` | Integer | `int` |  | true |
| 23 | `parent` | parent | `iParentId` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |  | true |
| 24 | `path` | path | `cPath` | String | `text` |  | true |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 26 | `serviceAttr` | serviceAttr | `service_attr` | ServiceAttrOfSettleMethod | `` | true | false |
| 27 | `sort` | 排序号 | `sort_num` | Integer | `int` |  | true |
| 28 | `sourcetype` | sourcetype | `sourcetype` | Boolean | `switch` |  | true |
| 29 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 30 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |

## 关联属性（7 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `parent` | parent | `aa.settlemethod.SettleMethod` | `iParentId` | 外键 |  |  | None |  |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 3 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 4 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 5 | `settlemethodFreeDefines` | settlemethodFreeDefines | `aa.settlemethod.SettleMethodFreeDefine` | `` | settlemethodFreeDefines → id | 1 | Y | None |  |
| 6 | `defineCharacter` | efineCharacter(日期) | `aa.settlemethod.SettleMethodDefineCharacter` | `defineCharacter` | 外键 |  |  | None |  |
| 7 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | None |  |

---

## SQL 示例

```sql
SELECT cCode, cComment, create_date, create_time, creator, creatorId, defineCharacter, direct_connection
FROM settle_method
```