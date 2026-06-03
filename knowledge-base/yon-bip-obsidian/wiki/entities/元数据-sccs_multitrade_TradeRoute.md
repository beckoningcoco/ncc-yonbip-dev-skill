---
tags: [BIP, 元数据, 数据字典, sccs.multitrade.TradeRoute]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 贸易路径主表 (`sccs.multitrade.TradeRoute`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`scmmp_traderoute` | domain：`scmmp` | 应用：`SCCS` | 业务对象ID：`c366c8ff-5e7c-4cd1-bbf7-45a8e078f3dc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 贸易路径主表 |
| 物理表 | `scmmp_traderoute` |
| 数据库 schema | `scmmp` |
| 所属应用 | `SCCS` |
| 直连字段 | 33 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `details` | `sccs.multitrade.TradeRoutes` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `orgId` | `` |

## 继承接口 (3个, 11字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`

## 字段列表（按类型分组）

> 共 33 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `code` | `code` | `code` | 编码 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `cobillnum` | `cobillnum` | `cobillnum` | 首站物流协同单据 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `orgId` | `orgId` | `orgId` | 源头主组织 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |
| `endtrade_autopurchase` | `endtrade_autopurchase` | `endtradeAutopurchase` | 末站代采 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `arrival_sync_direction` | `arrival_sync_direction` | `arrivalSyncDirection` | 到货协同方向 |
| `closure_initiate_coll` | `closure_initiate_coll` | `closureInitiateColl` | 订单关闭/打开协同 |
| `invoice_direction` | `invoice_direction` | `invoiceDirection` | 发票抛转方向 |
| `is_first_last_station_sync` | `is_first_last_station_sync` | `isFirstLastStationSync` | 首末站到货协同 |
| `is_sign_confirm_sync` | `is_sign_confirm_sync` | `isSignConfirmSync` | 首末站签收确认协同 |

### 短整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `toinvoice` | `toinvoice` | `toinvoice` | 是否抛转发票 |
| `routeType` | `routeType` | `routeType` | 类别 |
| `direction` | `direction` | `direction` | 抛转方向 |
| `definecharpick` | `definecharpick` | `defineCharPick` | 自定义特征携带 |
| `first_invoice_method` | `first_invoice_method` | `firstInvoiceMethod` | 首站发票生单方式 |
| `firstlogisticsmethod` | `firstlogisticsmethod` | `firstLogisticsMethod` | 首站物流生单方式 |
| `order_change_collaboration` | `order_change_collaboration` | `orderChangeCollaboration` | 订单变更协同 |
| `orderDirection` | `orderDirection` | `orderDirection` | 订单抛转方向 |
| `reject_direction` | `reject_direction` | `rejectDirection` | 退货抛转方向 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `details` | 贸易路径子表 |
