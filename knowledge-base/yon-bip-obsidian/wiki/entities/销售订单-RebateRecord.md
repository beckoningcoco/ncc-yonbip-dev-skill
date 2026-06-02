---
tags: [BIP, 元数据, 数据字典, 销售订单, SCMSA, voucher.order.RebateRecord]
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

# 返利单记录 (`voucher.order.RebateRecord`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP 供应链（SCMSA）模块销售订单的子实体元数据字典。
> 物理表：`orderrebaterecord` | 所属应用：`SCMSA`
> 父实体：[[销售订单元数据]] (`voucher.order.Order`)

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 返利单记录 |
| 描述 |  |
| 物理表 | `orderrebaterecord` |
| 所属应用 | `SCMSA` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 数据权限场景 | `` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键ID |
| 编码 | `rowno` | `rowno` | Integer | rowno |

## 部署信息

- **部署时间**: 2024-05-24 23:52:44:000
- **安装来源**: `/app/uorders/ubill/src/ubill-server/scripts/db/patch/mongodb/V3_R5_2312/0001_udinghuo/0010_iuap_common/DML/0270_iuap_metadata/202405/202404151020_metadata_voucher-order_delta.zip`
- **安装人**: migration

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): id — 唯一字段: `['id']`

---

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | IUordercorp (`IUordercorp`) | `base.itf.IUordercorp` | 73 | 1 |
| 2 | Deletable (`Deletable`) | `base.itf.Deletable` | 67 | 1 |
| 3 | IYTenantExt (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |

### IUordercorp (`IUordercorp`)
> URI: `base.itf.IUordercorp` | 版本: 73

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `uordercorp` (公司(分区键)) | `iCorpId` | `long` | `Long` |

### Deletable (`Deletable`)
> URI: `base.itf.Deletable` | 版本: 67

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `isDeleted` (isDeleted) | `iDeleted` | `switch` | `Boolean` |

### IYTenantExt (`IYTenantExt`)
> URI: `ucfbase.ucfbaseItf.IYTenantExt` | 版本: 24

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `ytenant` (租户) | `ytenant_id` | `quote` | `yht.tenant.YhtTenant` |

---

## 全部直接属性（共 10 个）

> 含直接映射数据库列的字段。类型为 UUID 的为外键引用（详见关联属性节）。

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 | URI |
|---|--------|--------|---------|------|---------|------|------|-----|
| 1 | `rebateId` | rebateId | `irebateId` | 2fbfe730-99ba-4af1-aa4a-d51974687ecc | `quote` |  | true | `voucher.order.RebateRecord.rebateId` |
| 2 | `shareSettingId` | shareSettingId | `iShareSettingId` | 6353a3f1-4736-4c35-bc35-64ec2ea8bb7d | `quote` |  | true | `voucher.order.RebateRecord.shareSettingId` |
| 3 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true | `ucfbase.ucfbaseItf.IYTenantExt.ytenant` |
| 4 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |  | true | `uorder.voucher.UorderVouchLine.pubts` |
| 5 | `usedMoney` | usedMoney | `fusedMoney` | Decimal | `number` |  | true | `voucher.order.RebateRecord.usedMoney` |
| 6 | `orderId` | 订单ID | `iorderId` | c7c0beb4-f830-486d-83e1-51072b319fd2 | `quote` |  | true | `voucher.order.RebateRecord.orderId` |
| 7 | `id` | 主键ID | `id` | Long | `long` |  | true | `voucher.order.RebateRecord.id` |
| 8 | `rowno` | rowno | `rowno` | Integer | `int` |  | true | `voucher.base.IRowNum.rowno` |
| 9 | `uordercorp` | 公司(分区键) | `iCorpId` | Long | `long` |  | true | `base.itf.IUordercorp.uordercorp` |
| 10 | `isDeleted` | isDeleted | `iDeleted` | Boolean | `switch` |  | true | `base.itf.Deletable.isDeleted` |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `orderId` | 订单ID | `voucher.order.Order` | `iorderId` | rebateRecords → orderId | 0..n | Y | None |  |
| 2 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` | 外键引用 |  |  | Service |  |
| 3 | `rebateId` | rebateId | `voucher.rebate.Rebate` | `irebateId` | 外键引用 |  |  | Service |  |
| 4 | `shareSettingId` | shareSettingId | `voucher.rebate.RebateShareSetting` | `iShareSettingId` | 外键引用 |  |  | Service |  |

### Composition（子表）

- **订单ID**: `orderId` → `voucher.order.Order` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `rebateId` (rebateId) | `voucher.rebate.Rebate` | `irebateId` |
| `shareSettingId` (shareSettingId) | `voucher.rebate.RebateShareSetting` | `iShareSettingId` |

---

## 使用示例

```sql
-- 查询 返利单记录 数据
SELECT irebateId, iShareSettingId, ytenant_id, pubuts, fusedMoney, iorderId, id, rowno, iCorpId, iDeleted
FROM orderrebaterecord
WHERE orderId = ? -- 关联订单ID
```

### 通过 API 获取元数据

```bash
python bip_metadata_query.py voucher.order.RebateRecord
```
