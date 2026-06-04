---
tags: ["BIP", "元数据", "数据字典", "BCD", "st.boxingrecord.BoxingRecord"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 装箱单主表 (`st.boxingrecord.BoxingRecord`)

> BCD | 物理表：`st_boxingrecord`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 装箱单主表 |
| 物理表 | `st_boxingrecord` |
| 数据库 schema | `uscmpub` |
| 所属应用 | `BCD` |
| 构建时间 | `2026-06-04 23:33:46.8290` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（27个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `org` | 库存组织id | `iOrgid` | c1135e08-c4bf-4499-90bf-67030d1f2654 |
| 2 | `isOneBox` | 一单一箱 | `isOneBox` | Boolean |
| 3 | `sourceType` | 来源 | `source_type` | String |
| 4 | `vendor` | 供应商 | `vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 5 | `custom` | 客户 | `custom` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 6 | `printCount` | 打印次数 | `printCount` | Integer |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 8 | `tplid` | 模板id | `tplid` | Long |
| 9 | `status` | 单据状态 | `status` | Short |
| 10 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 11 | `code` | 单据编号 | `code` | String |
| 12 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 13 | `boxCapacity` | 箱内码个数 | `box_capacity` | Decimal |
| 14 | `memo` | 备注 | `cMemo` | String |
| 15 | `boxingRecordDefineCharacter` | 主表自定义项特征组 | `boxingRecordDefineCharacter` | abdc0e25-42d5-4b9b-96ae-0e6b12876033 |
| 16 | `id` | ID | `id` | Long |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `creator` | 创建人 | `creator` | String |
| 19 | `createTime` | 创建时间 | `create_time` | DateTime |
| 20 | `createDate` | 创建日期 | `create_date` | Date |
| 21 | `modifier` | 修改人 | `modifier` | String |
| 22 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 23 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 24 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 25 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 26 | `boxingRecords` | 装箱单子表 | `` | 3a8611a8-d5e8-4a4c-834a-1a35acbd10a0 |
| 27 | `headItem` | 装箱单主表自定义项 | `` | 3da850a2-6406-4e21-8ff6-e112f4063328 |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `org` | 库存组织id | `aa.baseorg.InventoryOrgMV` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `vendor` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 4 | `custom` | 客户 | `aa.merchant.Merchant` | Service |  |
| 5 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 7 | `boxingRecords` | 装箱单子表 | `st.boxingrecord.BoxingRecords` | None | true |
| 8 | `boxingRecordDefineCharacter` | 主表自定义项特征组 | `st.boxingrecord.BoxingRecordDefineCharacter` | None |  |
| 9 | `headItem` | 装箱单主表自定义项 | `st.boxingrecord.BoxingRecordCustomItem` | None | true |
| 10 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
