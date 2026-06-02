---
tags: [BIP, 元数据, 数据字典, 销售订单, SCMSA, voucher.order.OrderDetailGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
parent_entity: voucher.order.Order
---

# 订单分组 (`voucher.order.OrderDetailGroup`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP 供应链（SCMSA）模块销售订单的子实体元数据字典。
> 物理表：`orderdetailgroup` | 所属应用：`SCMSA`
> 父实体：[[销售订单元数据]] (`voucher.order.Order`)

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 订单分组 |
| 描述 |  |
| 物理表 | `orderdetailgroup` |
| 所属应用 | `SCMSA` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 数据权限场景 | `` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键ID |

## 部署信息

- **部署时间**: 2024-05-24 23:52:44:000
- **安装来源**: `/app/uorders/ubill/src/ubill-server/scripts/db/patch/mongodb/V3_R5_2312/0001_udinghuo/0010_iuap_common/DML/0270_iuap_metadata/202405/202404151020_metadata_voucher-order_delta.zip`
- **安装人**: migration

## 术语标记

`BusinessData`, `reportHide`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

---

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | IUordercorp (`IUordercorp`) | `base.itf.IUordercorp` | 73 | 1 |
| 2 | IYTenantExt (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |

### IUordercorp (`IUordercorp`)
> URI: `base.itf.IUordercorp` | 版本: 73

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `uordercorp` (公司(分区键)) | `iCorpId` | `long` | `Long` |

### IYTenantExt (`IYTenantExt`)
> URI: `ucfbase.ucfbaseItf.IYTenantExt` | 版本: 24

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `ytenant` (租户) | `ytenant_id` | `quote` | `yht.tenant.YhtTenant` |

---

## 全部直接属性（共 34 个）

> 含直接映射数据库列的字段。类型为 UUID 的为外键引用（详见关联属性节）。

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 | URI |
|---|--------|--------|---------|------|---------|------|------|-----|
| 1 | `apportionAttr` | apportionAttr | `cApportionAttr` | String | `text` |  | true | `voucher.order.OrderDetailGroup.apportionAttr` |
| 2 | `apportionMoney` | apportionMoney | `fApportionMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetailGroup.apportionMoney` |
| 3 | `apportionName` | apportionName | `cApportionName` | String | `text` |  | true | `voucher.order.OrderDetailGroup.apportionName` |
| 4 | `apportionType` | apportionType | `cApportionType` | String | `text` |  | true | `voucher.order.OrderDetailGroup.apportionType` |
| 5 | `bMultiGiveaways` | bMultiGiveaways | `bMultiGiveaways` | Boolean | `switch` |  | true | `voucher.order.OrderDetailGroup.bMultiGiveaways` |
| 6 | `bizId` | 商家ID | `bizId` | Long | `long` |  | true | `voucher.order.OrderDetailGroup.bizId` |
| 7 | `calcWithDisCount` | calcWithDisCount | `bCalcWithDisCount` | Boolean | `switch` |  | true | `voucher.order.OrderDetailGroup.calcWithDisCount` |
| 8 | `calcWithNum` | calcWithNum | `bCalcWithNum` | Boolean | `switch` |  | true | `voucher.order.OrderDetailGroup.calcWithNum` |
| 9 | `canChangeGiveaway` | canChangeGiveaway | `bCanChangeGiveaway` | Boolean | `switch` |  | true | `voucher.order.OrderDetailGroup.canChangeGiveaway` |
| 10 | `code` | 编码 | `cOrderNo` | String | `text` |  | true | `voucher.order.OrderDetailGroup.code` |
| 11 | `comPromotionGroupId` | comPromotionGroupId | `iComPromotionGroupId` | Long | `long` |  | true | `voucher.order.OrderDetailGroup.comPromotionGroupId` |
| 12 | `endDate` | endDate | `pEndDate` | DateTime | `timestamp` |  | true | `voucher.order.OrderDetailGroup.endDate` |
| 13 | `entireGroup` | entireGroup | `bEntireGroup` | Boolean | `switch` |  | true | `voucher.order.OrderDetailGroup.entireGroup` |
| 14 | `entityGiveawayPreId` | entityGiveawayPreId | `iEntityGiveawayPreId` | Long | `long` |  | true | `voucher.order.OrderDetailGroup.entityGiveawayPreId` |
| 15 | `entityGiveawayPreName` | entityGiveawayPreName | `cEntityGiveawayPreName` | String | `text` |  | true | `voucher.order.OrderDetailGroup.entityGiveawayPreName` |
| 16 | `entityMoneyPreId` | entityMoneyPreId | `iEntityMoneyPreId` | Long | `long` |  | true | `voucher.order.OrderDetailGroup.entityMoneyPreId` |
| 17 | `entityMoneyPreName` | entityMoneyPreName | `cEntityMoneyPreName` | String | `text` |  | true | `voucher.order.OrderDetailGroup.entityMoneyPreName` |
| 18 | `existGroup` | existGroup | `existGroup` | Boolean | `switch` |  | true | `voucher.order.OrderDetailGroup.existGroup` |
| 19 | `giveawayDes` | giveawayDes | `cGiveawayDes` | String | `text` |  | true | `voucher.order.OrderDetailGroup.giveawayDes` |
| 20 | `giveawayRule` | giveawayRule | `iGiveawayRule` | Integer | `int` |  | true | `voucher.order.OrderDetailGroup.giveawayRule` |
| 21 | `groupQuantity` | groupQuantity | `iGroupQuantity` | Integer | `int` |  | true | `voucher.order.OrderDetailGroup.groupQuantity` |
| 22 | `iIndex` | iIndex | `iIndex` | Long | `long` |  | true | `voucher.order.OrderDetailGroup.iIndex` |
| 23 | `id` | 主键ID | `id` | Long | `long` |  | true | `base.entity.BizObject.id` |
| 24 | `orderId` | 订单ID | `iorderId` | c7c0beb4-f830-486d-83e1-51072b319fd2 | `quote` |  | true | `voucher.order.OrderDetailGroup.orderId` |
| 25 | `preId` | preId | `iPreId` | Long | `long` |  | true | `voucher.order.OrderDetailGroup.preId` |
| 26 | `preType` | preType | `iPreType` | Integer | `int` |  | true | `voucher.order.OrderDetailGroup.preType` |
| 27 | `promotionType` | promotionType | `cPromotionType` | String | `text` |  | true | `voucher.order.OrderDetailGroup.promotionType` |
| 28 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |  | true | `uorder.voucher.UorderBizObject.pubts` |
| 29 | `saleOrgId` | saleOrgId | `saleOrgId` | Long | `long` |  | true | `voucher.order.OrderDetailGroup.saleOrgId` |
| 30 | `startDate` | startDate | `pStartDate` | DateTime | `timestamp` |  | true | `voucher.order.OrderDetailGroup.startDate` |
| 31 | `uordercorp` | 公司(分区键) | `iCorpId` | Long | `long` |  | true | `base.itf.IUordercorp.uordercorp` |
| 32 | `userAddGiveawayGroup` | userAddGiveawayGroup | `bUserAddGiveawayGroup` | Boolean | `switch` |  | true | `voucher.order.OrderDetailGroup.userAddGiveawayGroup` |
| 33 | `userSelected` | userSelected | `bUserSelected` | Boolean | `switch` |  | true | `voucher.order.OrderDetailGroup.userSelected` |
| 34 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true | `ucfbase.ucfbaseItf.IYTenantExt.ytenant` |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `orderId` | 订单ID | `voucher.order.Order` | `iorderId` | orderDetailGroups → orderId | 0..n | Y | None |  |
| 2 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` | 外键引用 |  |  | Service |  |

### Composition（子表）

- **订单ID**: `orderId` → `voucher.order.Order` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |

---

## 使用示例

```sql
-- 查询 订单分组 数据
SELECT cApportionAttr, fApportionMoney, cApportionName, cApportionType, bMultiGiveaways, bizId, bCalcWithDisCount, bCalcWithNum, bCanChangeGiveaway, cOrderNo
FROM orderdetailgroup
WHERE orderId = ? -- 关联订单ID
```

### 通过 API 获取元数据

```bash
python bip_metadata_query.py voucher.order.OrderDetailGroup
```
