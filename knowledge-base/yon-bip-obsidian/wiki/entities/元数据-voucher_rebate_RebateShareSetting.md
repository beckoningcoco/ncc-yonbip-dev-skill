---
tags: [BIP, 元数据, 数据字典, voucher, voucher.rebate.RebateShareSetting]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 返利分摊设置 (`voucher.rebate.RebateShareSetting`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `udh_rebatesharesetting` | 应用: `BBSMK` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 返利分摊设置 |
| 物理表 | `udh_rebatesharesetting` |
| 应用 | `BBSMK` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `saleOrgId` | `iSaleOrgId` | |

## 部署信息

- 部署时间: 2026-05-23 00:59:58:000
- 安装来源: `/app/marketingbill/src/marketingbill-server/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-mkt-mkc2b/0010_iuap_common/DML/0270_iuap_metadata/20260515/001rebate/202605081659_metadata_voucher-rebate_delta.zip`

## 术语标记

`isAssigned`, `isExtend`, `MasterData`, `isMain`, `doc`

## 依赖接口（5 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IUordercorp (`IUordercorp`) | `base.itf.IUordercorp` | 73 | 1 |
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| IShop (`IShop`) | `base.itf.IShop` | 65 | 1 |
| IEnable (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| IYTenantExt (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |

---

## 全部属性（30 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `saleOrgId` | saleOrgId | `iSaleOrgId` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | true |
| 2 | `name` | 名称 | `cName` | String | `text` |  | true |
| 3 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 4 | `rebateType` | 返利类型 | `rebateType` | String | `text` |  | true |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 6 | `enable` | enable | `enable` | Short | `short` |  | true |
| 7 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 8 | `creatorId` | 创建人ID | `iSubmiterId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 9 | `modifierId` | 修改人ID | `iModifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 10 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 11 | `modifier` | 修改人 | `cModifier` | String | `text` |  | true |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 13 | `creator` | 创建人 | `cCreator` | String | `text` |  | true |
| 14 | `WhiteProduct` | WhiteProduct | `` | 3f144d6c-d8e3-4d46-a5ef-1b85c0ab0e13 | `` |  |  |
| 15 | `amountCalculationBasis` | amountCalculationBasis | `amountCalculationBasis` | AmountCalculationBasisEnum | `` |  | true |
| 16 | `applicableDocType` | applicableDocType(类型) | `applicableDocType` | RebateApplicableDocTypeEnum | `` |  | true |
| 17 | `bizId` | bizId | `iBizId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 18 | `disablets` | isablets(日期) | `disablets` | DateTime | `dateTime` |  | true |
| 19 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |  | true |
| 20 | `iDeleted` | 是否删除 | `ideleted` | Short | `short` |  | true |
| 21 | `isOrderDiscountControl` | 是否OrderDiscountControl | `isOrderDiscountControl` | Boolean | `switch` |  | true |
| 22 | `payMode` | payMode | `payMode` | String | `text` |  | true |
| 23 | `priority` | 优先级 | `priority` | Integer | `int` |  | true |
| 24 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |  | true |
| 25 | `rebateShareSettingDefineCharacter` | rebateShareSettingDefineCharacter | `rebateShareSettingDefineCharacter` | 0516e5dc-d8bc-47fb-a362-13759d7f73ee | `UserDefine` |  | true |
| 26 | `rebateShareSettingDetails` | rebateShareSettingDetails | `` | 1c2d408a-91fc-4ec8-bf88-ccbe6fbe37eb | `` |  |  |
| 27 | `rebateShareSettingTransTypeRecords` | rebateShareSettingTransTypeRecords | `` | 84ae0101-8d36-489b-a66a-f4974d0de187 | `` |  |  |
| 28 | `shop` | shop | `iShopID` | Long | `long` |  | true |
| 29 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |  | true |
| 30 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |

## 关联属性（9 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `rebateShareSettingDefineCharacter` | rebateShareSettingDefineCharacter | `voucher.rebate.RebateShareSettingDefineCharacter` | `rebateShareSettingDefineCharacter` | 外键 |  |  | None |  |
| 2 | `saleOrgId` | saleOrgId | `org.func.BaseOrg` | `iSaleOrgId` | 外键 |  |  | Service |  |
| 3 | `WhiteProduct` | WhiteProduct | `voucher.rebate.WhiteProduct` | `` | WhiteProduct → shareSettingId | 0..n | Y | None |  |
| 4 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 5 | `rebateShareSettingTransTypeRecords` | rebateShareSettingTransTypeRecords | `voucher.rebate.RebateShareSettingTransTypeRecord` | `` | rebateShareSettingTransTypeRecords → rebateShareSettingId | 0..n | Y | None |  |
| 6 | `bizId` | bizId | `aa.merchant.Merchant` | `iBizId` | 外键 |  |  | Service |  |
| 7 | `creatorId` | 创建人ID | `base.user.User` | `iSubmiterId` | 外键 |  |  | Service |  |
| 8 | `modifierId` | 修改人ID | `base.user.User` | `iModifierId` | 外键 |  |  | Service |  |
| 9 | `rebateShareSettingDetails` | rebateShareSettingDetails | `voucher.rebate.RebateShareSettingDetail` | `` | rebateShareSettingDetails → shareSettingId | 0..n | Y | None |  |

---

## SQL 示例

```sql
SELECT iSaleOrgId, cName, id, rebateType, create_time, enable, create_date, iSubmiterId
FROM udh_rebatesharesetting
```