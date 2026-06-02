---
tags: [BIP, 元数据, 数据字典, pc.cls.PurchaseClass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 采购品类 (`pc.cls.PurchaseClass`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `product_purchase_class` | 应用: `GZTBDM` | 类型: `Class`

## 属性（29 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `orgId` | 组织ID | `orgId` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 3 | `code` | 编码 | `code` | String | `text` |
| 4 | `name` | 名称 | `name` | String | `multiLanguage` |
| 5 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 6 | `parent` | parent | `parent_id` | ec3f827d-4cff-462d-b74c-1dd556c96baa | `quote` |
| 7 | `order` | order | `iOrder` | Integer | `int` |
| 8 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 9 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 10 | `categoryManager` | categoryManager | `category_manager` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 11 | `categoryGrade` | categoryGrade | `category_grade` | 5ffdc7d3-9e62-4b5f-8668-eb39ddd20dd5 | `quote` |
| 12 | `purchaseClassCharacter` | purchaseClassCharacter | `purchase_class_character` | c93e891a-d45e-49ff-a19a-c1fc0261e604 | `UserDefine` |
| 13 | `level` | 层级 | `level` | Integer | `int` |
| 14 | `path` | path | `path` | String | `text` |
| 15 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 16 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 17 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 19 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 20 | `creator` | 创建人 | `creator` | String | `text` |
| 21 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 22 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 23 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 24 | `modifier` | 修改人 | `modifier` | String | `text` |
| 25 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 26 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 27 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 28 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 29 | `purchaseClassApplyRanges` | purchaseClassApplyRanges | `` | 5f25554e-6fca-465c-a2e3-bc1250cc719c | `` |

## 关联（10 个）

- `parent` -> `pc.cls.PurchaseClass` ()
- `categoryManager` -> `bd.staff.StaffNew` ()
- `purchaseClassCharacter` -> `pc.cls.PurchaseClassCharacter` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `categoryGrade` -> `aa.supplyability.SupplyAbilityDetail` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `purchaseClassApplyRanges` -> `pc.cls.PurchaseClassApplyRangeGroup` (0..n)
- `orgId` -> `bd.adminOrg.BaseOrgVO` ()
- `tenant` -> `base.tenant.Tenant` ()
