---
tags: [BIP, 元数据, 数据字典, aa.store.SalesBusinessInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售业务信息 (`aa.store.SalesBusinessInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_salessbusinessinfo` | domain：`yxybase` | 应用：`Marketingpublic` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售业务信息 |
| 物理表 | `mp_salessbusinessinfo` |
| 数据库 schema | `yxybase` |
| 所属应用 | `Marketingpublic` |
| 直连字段 | 12 个 |
| 子表 | 1 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `salesBusinessInfoDefine` | `aa.store.SalesBusinessInfoDefine` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `iSaleLatestFollowPerson` | `ucf-staff-center.bd_staff_ref` |
| `storelevel` | `aa_storelevel` |
| `` | `` |
| `ytenant_id` | `` |
| `salearea` | `productcenter.aa_salearearef` |
| `iStoreId` | `` |
| `salesBusinessInfoDefineCharacter` | `` |
| `saleorg` | `ucf-org-center.bd_salesorg` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `iStoreId` | `iStoreId` | `store` | 主表ID |
| `saleorg` | `saleorg` | `saleOrg` | 销售组织id |
| `salearea` | `salearea` | `saleArea` | 销售区域id |
| `storelevel` | `storelevel` | `storeLevel` | 终端等级id |
| `iSaleLatestFollowPerson` | `iSaleLatestFollowPerson` | `saleLatestFollowPerson` | 最近跟进人主键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 销售业务信息id |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `salesBusinessInfoDefineCharacter` | `salesBusinessInfoDefineCharacter` | `salesBusinessInfoDefineCharacter` | 自定义项特征属性组 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 销售业务信息时间戳 |
| `dSaleLatestFollowUpTime` | `dSaleLatestFollowUpTime` | `saleLatestFollowUpTime` | 最近跟进时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `salesBusinessInfoDefine` | 销售业务信息自定义项 |
