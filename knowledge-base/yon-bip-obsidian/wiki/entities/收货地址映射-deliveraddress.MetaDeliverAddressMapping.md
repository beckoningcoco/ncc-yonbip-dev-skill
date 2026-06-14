---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.deliveraddress.MetaDeliverAddressMapping"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 收货地址映射 (`mall.deliveraddress.MetaDeliverAddressMapping`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`deliver_address_mapping` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.deliveraddress.MetaDeliverAddressMapping` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收货地址映射 |
| 物理表 | `deliver_address_mapping` |
| domain/服务域 | `yonbip-cpu-mall` |
| schema | `cpu_mall` |
| 所属应用 | `ycYuncaiMall` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:08:07.9990` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `ID` | `ID` | Long | ID |

## 部署信息

- **部署时间**: 2025-10-24 23:19:32:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202508061611_metadata_mall-deliveraddress.zip`
- **安装人**: mongoTools
- **安装排名**: `0b182b9f-1c2a-404a-a76c-df8bca8cf2f0`

## 术语标记

`MasterData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 9 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `address` | 收货地址 | `ADDRESS` | String | `text` |  | ✓ |
| 2 | `channelCode` | 渠道编码 | `CHANNEL_CODE` | String | `text` |  | ✓ |
| 3 | `channelId` | 渠道id | `CHANNEL_ID` | Long | `long` |  | ✓ |
| 4 | `ctId` | 自定义项特征组id | `ct_id` | 3cfe6507-b8d5-4e97-81bd-b1a72e41fee7 | `UserDefine` |  | ✓ |
| 5 | `deliverAddressId` | 主表id | `DELIVER_ADDRESS_ID` | d6443dd6-42b2-4513-8eca-cd72ac2029ea | `quote` |  | ✓ |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 7 | `id` | ID | `ID` | Long | `long` |  | ✓ |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ctId` | 自定义项特征组id | `mall.deliveraddress.MetaDeliverAddressMappingCt` | `ct_id` |  →  |  |  | None |  |
| 2 | `deliverAddressId` | 主表id | `mall.deliveraddress.MetaDeliverAddress` | `DELIVER_ADDRESS_ID` | metaDeliverAddressMappings → deliverAddressId | 1..n | true | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |

### Composition（子表）

- **deliverAddressId**: `metaDeliverAddressMappings` → `mall.deliveraddress.MetaDeliverAddress` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
