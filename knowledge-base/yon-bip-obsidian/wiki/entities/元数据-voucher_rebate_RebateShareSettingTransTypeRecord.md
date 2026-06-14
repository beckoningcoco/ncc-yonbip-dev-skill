---
tags: [BIP, 元数据, 数据字典, voucher.rebate.RebateShareSettingTransTypeRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 账户使用规则交易类型记录表 (`voucher.rebate.RebateShareSettingTransTypeRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`udh_rebatesharesetting_transtype_record` | domain：`marketingbill` | 应用：`BBSMK` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 账户使用规则交易类型记录表 |
| 物理表 | `udh_rebatesharesetting_transtype_record` |
| domain/服务域 | `marketingbill` |
| 所属应用 | `BBSMK` |
| 直连字段 | 7 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `iRebateShareSettingId` | `` |
| `iTradeType` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 7 个直连字段

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iRebateShareSettingId` | `iRebateShareSettingId` | `rebateShareSettingId` | 账户使用规则ID |
| `iTradeType` | `iTradeType` | `tradeType` | 交易类型ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dCreateTime` | `dCreateTime` | `createTime` | 创建时间 |
| `dModifyTime` | `dModifyTime` | `modifyTime` | 修改时间 |
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
