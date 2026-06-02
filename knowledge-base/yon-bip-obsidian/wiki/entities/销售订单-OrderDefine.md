---
tags: [BIP, 元数据, 数据字典, 销售订单, SCMSA, voucher.order.OrderDefine]
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

# 销售订单表头自定义项 (`voucher.order.OrderDefine`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP 供应链（SCMSA）模块销售订单的子实体元数据字典。
> 物理表：`uo_define_orderdefine` | 所属应用：`SCMSA`
> 父实体：[[销售订单元数据]] (`voucher.order.Order`)

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售订单表头自定义项 |
| 描述 |  |
| 物理表 | `uo_define_orderdefine` |
| 所属应用 | `SCMSA` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 数据权限场景 | `` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `orderId` | `order_id` | c7c0beb4-f830-486d-83e1-51072b319fd2 | 订单ID |

## 部署信息

- **部署时间**: 2026-01-24 01:22:17:000
- **安装来源**: `/app/uorders/ubill/src/ubill-server/scripts/db/patch/mongodb/V5_R0_2507/0001_udinghuo/0010_iuap_common/DML/0270_iuap_metadata/202512/202512181002_metadata_voucher-order_delta.zip`
- **安装人**: mongoTools

## 术语标记

`BusinessData`, `fixedUserdef`

## 约束

- **migration_orderId** (MetaClassPrimary): 订单id — 唯一字段: `['orderId']`

---

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | IUordercorp (`IUordercorp`) | `base.itf.IUordercorp` | 73 | 1 |
| 2 | UserdefItem (`UserdefItem`) | `base.itf.UserdefItem` | 1934 | 60 |
| 3 | IYTenantExt (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |

### IUordercorp (`IUordercorp`)
> URI: `base.itf.IUordercorp` | 版本: 73

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `uordercorp` (公司(分区键)) | `iCorpId` | `long` | `Long` |

### UserdefItem (`UserdefItem`)
> URI: `base.itf.UserdefItem` | 版本: 1934

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `define1` (define1) | `` | `text` | `String` |
| `define10` (define10) | `` | `text` | `String` |
| `define11` (define11) | `` | `text` | `String` |
| `define12` (define12) | `` | `text` | `String` |
| `define13` (define13) | `` | `text` | `String` |
| `define14` (define14) | `` | `text` | `String` |
| `define15` (define15) | `` | `text` | `String` |
| `define16` (define16) | `` | `text` | `String` |
| `define17` (define17) | `` | `text` | `String` |
| `define18` (define18) | `` | `text` | `String` |
| `define19` (define19) | `` | `text` | `String` |
| `define2` (define2) | `` | `text` | `String` |
| `define20` (define20) | `` | `text` | `String` |
| `define21` (define21) | `` | `text` | `String` |
| `define22` (define22) | `` | `text` | `String` |
| `define23` (define23) | `` | `text` | `String` |
| `define24` (define24) | `` | `text` | `String` |
| `define25` (define25) | `` | `text` | `String` |
| `define26` (define26) | `` | `text` | `String` |
| `define27` (define27) | `` | `text` | `String` |
| `define28` (define28) | `` | `text` | `String` |
| `define29` (define29) | `` | `text` | `String` |
| `define3` (define3) | `` | `text` | `String` |
| `define30` (define30) | `` | `text` | `String` |
| `define31` (define31) | `` | `text` | `String` |
| `define32` (define32) | `` | `text` | `String` |
| `define33` (define33) | `` | `text` | `String` |
| `define34` (define34) | `` | `text` | `String` |
| `define35` (define35) | `` | `text` | `String` |
| `define36` (define36) | `` | `text` | `String` |
| `define37` (define37) | `` | `text` | `String` |
| `define38` (define38) | `` | `text` | `String` |
| `define39` (define39) | `` | `text` | `String` |
| `define4` (define4) | `` | `text` | `String` |
| `define40` (define40) | `` | `text` | `String` |
| `define41` (define41) | `` | `text` | `String` |
| `define42` (define42) | `` | `text` | `String` |
| `define43` (define43) | `` | `text` | `String` |
| `define44` (define44) | `` | `text` | `String` |
| `define45` (define45) | `` | `text` | `String` |
| `define46` (define46) | `` | `text` | `String` |
| `define47` (define47) | `` | `text` | `String` |
| `define48` (define48) | `` | `text` | `String` |
| `define49` (define49) | `` | `text` | `String` |
| `define5` (define5) | `` | `text` | `String` |
| `define50` (define50) | `` | `text` | `String` |
| `define51` (define51) | `` | `text` | `String` |
| `define52` (define52) | `` | `text` | `String` |
| `define53` (define53) | `` | `text` | `String` |
| `define54` (define54) | `` | `text` | `String` |
| `define55` (define55) | `` | `text` | `String` |
| `define56` (define56) | `` | `text` | `String` |
| `define57` (define57) | `` | `text` | `String` |
| `define58` (define58) | `` | `text` | `String` |
| `define59` (define59) | `` | `text` | `String` |
| `define6` (define6) | `` | `text` | `String` |
| `define60` (define60) | `` | `text` | `String` |
| `define7` (define7) | `` | `text` | `String` |
| `define8` (define8) | `` | `text` | `String` |
| `define9` (define9) | `` | `text` | `String` |

### IYTenantExt (`IYTenantExt`)
> URI: `ucfbase.ucfbaseItf.IYTenantExt` | 版本: 24

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `ytenant` (租户) | `ytenant_id` | `quote` | `yht.tenant.YhtTenant` |

---

## 全部直接属性（共 66 个）

> 含直接映射数据库列的字段。类型为 UUID 的为外键引用（详见关联属性节）。

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 | URI |
|---|--------|--------|---------|------|---------|------|------|-----|
| 1 | `code` | 编码 | `cOrderNo` | String | `text` |  | true | `voucher.order.OrderDefine.code` |
| 2 | `define1` | define1 | `define1` | String | `text` | false | true | `base.itf.UserdefItem.define1` |
| 3 | `define10` | define10 | `define10` | String | `text` | false | true | `base.itf.UserdefItem.define10` |
| 4 | `define11` | define11 | `define11` | String | `text` | false | true | `base.itf.UserdefItem.define11` |
| 5 | `define12` | define12 | `define12` | String | `text` | false | true | `base.itf.UserdefItem.define12` |
| 6 | `define13` | define13 | `define13` | String | `text` | false | true | `base.itf.UserdefItem.define13` |
| 7 | `define14` | define14 | `define14` | String | `text` | false | true | `base.itf.UserdefItem.define14` |
| 8 | `define15` | define15 | `define15` | String | `text` | false | true | `base.itf.UserdefItem.define15` |
| 9 | `define16` | define16 | `define16` | String | `text` | false | true | `base.itf.UserdefItem.define16` |
| 10 | `define17` | define17 | `define17` | String | `text` | false | true | `base.itf.UserdefItem.define17` |
| 11 | `define18` | define18 | `define18` | String | `text` | false | true | `base.itf.UserdefItem.define18` |
| 12 | `define19` | define19 | `define19` | String | `text` | false | true | `base.itf.UserdefItem.define19` |
| 13 | `define2` | define2 | `define2` | String | `text` | false | true | `base.itf.UserdefItem.define2` |
| 14 | `define20` | define20 | `define20` | String | `text` | false | true | `base.itf.UserdefItem.define20` |
| 15 | `define21` | define21 | `define21` | String | `text` | false | true | `base.itf.UserdefItem.define21` |
| 16 | `define22` | define22 | `define22` | String | `text` | false | true | `base.itf.UserdefItem.define22` |
| 17 | `define23` | define23 | `define23` | String | `text` | false | true | `base.itf.UserdefItem.define23` |
| 18 | `define24` | define24 | `define24` | String | `text` | false | true | `base.itf.UserdefItem.define24` |
| 19 | `define25` | define25 | `define25` | String | `text` | false | true | `base.itf.UserdefItem.define25` |
| 20 | `define26` | define26 | `define26` | String | `text` | false | true | `base.itf.UserdefItem.define26` |
| 21 | `define27` | define27 | `define27` | String | `text` | false | true | `base.itf.UserdefItem.define27` |
| 22 | `define28` | define28 | `define28` | String | `text` | false | true | `base.itf.UserdefItem.define28` |
| 23 | `define29` | define29 | `define29` | String | `text` | false | true | `base.itf.UserdefItem.define29` |
| 24 | `define3` | define3 | `define3` | String | `text` | false | true | `base.itf.UserdefItem.define3` |
| 25 | `define30` | define30 | `define30` | String | `text` | false | true | `base.itf.UserdefItem.define30` |
| 26 | `define31` | define31 | `define31` | String | `text` | false | true | `base.itf.UserdefItem.define31` |
| 27 | `define32` | define32 | `define32` | String | `text` | false | true | `base.itf.UserdefItem.define32` |
| 28 | `define33` | define33 | `define33` | String | `text` | false | true | `base.itf.UserdefItem.define33` |
| 29 | `define34` | define34 | `define34` | String | `text` | false | true | `base.itf.UserdefItem.define34` |
| 30 | `define35` | define35 | `define35` | String | `text` | false | true | `base.itf.UserdefItem.define35` |
| 31 | `define36` | define36 | `define36` | String | `text` | false | true | `base.itf.UserdefItem.define36` |
| 32 | `define37` | define37 | `define37` | String | `text` | false | true | `base.itf.UserdefItem.define37` |
| 33 | `define38` | define38 | `define38` | String | `text` | false | true | `base.itf.UserdefItem.define38` |
| 34 | `define39` | define39 | `define39` | String | `text` | false | true | `base.itf.UserdefItem.define39` |
| 35 | `define4` | define4 | `define4` | String | `text` | false | true | `base.itf.UserdefItem.define4` |
| 36 | `define40` | define40 | `define40` | String | `text` | false | true | `base.itf.UserdefItem.define40` |
| 37 | `define41` | define41 | `define41` | String | `text` | false | true | `base.itf.UserdefItem.define41` |
| 38 | `define42` | define42 | `define42` | String | `text` | false | true | `base.itf.UserdefItem.define42` |
| 39 | `define43` | define43 | `define43` | String | `text` | false | true | `base.itf.UserdefItem.define43` |
| 40 | `define44` | define44 | `define44` | String | `text` | false | true | `base.itf.UserdefItem.define44` |
| 41 | `define45` | define45 | `define45` | String | `text` | false | true | `base.itf.UserdefItem.define45` |
| 42 | `define46` | define46 | `define46` | String | `text` | false | true | `base.itf.UserdefItem.define46` |
| 43 | `define47` | define47 | `define47` | String | `text` | false | true | `base.itf.UserdefItem.define47` |
| 44 | `define48` | define48 | `define48` | String | `text` | false | true | `base.itf.UserdefItem.define48` |
| 45 | `define49` | define49 | `define49` | String | `text` | false | true | `base.itf.UserdefItem.define49` |
| 46 | `define5` | define5 | `define5` | String | `text` | false | true | `base.itf.UserdefItem.define5` |
| 47 | `define50` | define50 | `define50` | String | `text` | false | true | `base.itf.UserdefItem.define50` |
| 48 | `define51` | define51 | `define51` | String | `text` | false | true | `base.itf.UserdefItem.define51` |
| 49 | `define52` | define52 | `define52` | String | `text` | false | true | `base.itf.UserdefItem.define52` |
| 50 | `define53` | define53 | `define53` | String | `text` | false | true | `base.itf.UserdefItem.define53` |
| 51 | `define54` | define54 | `define54` | String | `text` | false | true | `base.itf.UserdefItem.define54` |
| 52 | `define55` | define55 | `define55` | String | `text` | false | true | `base.itf.UserdefItem.define55` |
| 53 | `define56` | define56 | `define56` | String | `text` | false | true | `base.itf.UserdefItem.define56` |
| 54 | `define57` | define57 | `define57` | String | `text` | false | true | `base.itf.UserdefItem.define57` |
| 55 | `define58` | define58 | `define58` | String | `text` | false | true | `base.itf.UserdefItem.define58` |
| 56 | `define59` | define59 | `define59` | String | `text` | false | true | `base.itf.UserdefItem.define59` |
| 57 | `define6` | define6 | `define6` | String | `text` | false | true | `base.itf.UserdefItem.define6` |
| 58 | `define60` | define60 | `define60` | String | `text` | false | true | `base.itf.UserdefItem.define60` |
| 59 | `define7` | define7 | `define7` | String | `text` | false | true | `base.itf.UserdefItem.define7` |
| 60 | `define8` | define8 | `define8` | String | `text` | false | true | `base.itf.UserdefItem.define8` |
| 61 | `define9` | define9 | `define9` | String | `text` | false | true | `base.itf.UserdefItem.define9` |
| 62 | `id` | 主键ID | `id` | Long | `long` |  | true | `voucher.order.OrderDefine.id` |
| 63 | `orderId` | 订单ID | `order_id` | c7c0beb4-f830-486d-83e1-51072b319fd2 | `quote` |  | true | `voucher.order.OrderDefine.orderId` |
| 64 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |  | true | `uorder.voucher.UorderBizObject.pubts` |
| 65 | `uordercorp` | 公司(分区键) | `iCorpId` | Long | `long` |  | true | `base.itf.IUordercorp.uordercorp` |
| 66 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true | `ucfbase.ucfbaseItf.IYTenantExt.ytenant` |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `orderId` | 订单ID | `voucher.order.Order` | `order_id` | headItem → orderId | 1 | Y | None |  |
| 2 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` | 外键引用 |  |  | Service |  |

### Composition（子表）

- **订单ID**: `orderId` → `voucher.order.Order` | 1

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |

---

## 使用示例

```sql
-- 查询 销售订单表头自定义项 数据
SELECT cOrderNo, define1, define10, define11, define12, define13, define14, define15, define16, define17
FROM uo_define_orderdefine
WHERE orderId = ? -- 关联订单ID
```

### 通过 API 获取元数据

```bash
python bip_metadata_query.py voucher.order.OrderDefine
```
