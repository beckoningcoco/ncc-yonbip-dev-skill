---
tags: [BIP, 元数据, 数据字典, ec.express.Express]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物流公司 (`ec.express.Express`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ec_express` | domain：`dst` | 应用：`SDOC` | 业务对象ID：`59f58046-7bfe-4f71-bf39-fb25d76abfde`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物流公司 |
| 物理表 | `ec_express` |
| domain/服务域 | `dst` |
| schema | `omsdata` |
| 所属应用 | `SDOC` |
| 直连字段 | 37 个 |
| 关联引用 | 11 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `expressUnRange` | `ec.express.ExpressUnRange` | composition |
| `expressUnAddress` | `ec.express.ExpressUnAddress` | composition |
| `ExpressWeight` | `ec.express.ExpressWeight` | composition |
| `expressRange` | `ec.express.ExpressRange` | composition |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `ys_supplier` | `` |
| `` | `` |
| `valueInsurance` | `` |
| `logistic_id` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 12字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 37 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `creator` | String | 创建人名称 |
| `express_code` | `express_code` | String | 物流网点编码 |
| `express_name` | `express_name` | String | 网点名称 |
| `level` | `level` | String | 优先级 |
| `logistic_code` | `logistic_code` | String | 标准物流公司编码 |
| `logistic_source` | `logistic_source` | String | 物流单号来源 |
| `` | `modifier` | String | 修改人名称 |
| `number_begin` | `number_begin` | String | 快递单起始单号 |
| `print_template` | `print_template` | String | 快递单打印模板 |
| `printer` | `printer` | String | 快递单打印机 |
| `supplier` | `supplier` | String | 对应供应商 |
| `versionguid` | `versionguid` | String | 版本guid |
| `wmsLogisticCode` | `wmsLogisticCode` | String | WMS对应编码 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `logistic_id` | `logistic_id` | d0870b3f-7113-45cb-8cc7-c812e9bf6dc2 | 标准物流公司代码 |
| `` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `valueInsurance` | `valueInsurance` | a9c1bb5d-9b73-4f65-8e98-f85a35f1fcf6 | 保价策略 |
| `ys_supplier` | `ys_supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | 对应供应商 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_date` | `create_date` | Date | 创建日期 |
| `modify_date` | `modify_date` | Date | 修改日期 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `cash_on_delivery` | `cash_on_delivery` | Boolean | 支持货到付款 |
| `is_offline` | `is_offline` | Boolean | 是否线下发货 |
| `is_used` | `is_used` | Boolean | 是否启用 |
| `stopstatus` | `stopstatus` | Boolean | 停用状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `defaultValueInsurance` | `defaultValueInsurance` | Integer | 默认保价 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `is_home_delivery` | `is_home_delivery` | Short | 支持送货上门 |

### 长整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | Long | 主键 |

### other (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | dd748f94-1035-4274-b1b0-1ae38a8c30ed | 物流配送重量 |
| `` | `` | 1388aebb-fa3e-459d-b8d7-db6e661bb39c | 物流配送范围 |
| `` | `` | 10e4a086-02b1-4afd-bc34-ad519648bbb5 | 不到地址改用物流 |
| `` | `` | 7ef1a3b4-ae0e-4016-8606-658e04374307 | 不到区改用物流 |

### timestamp (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |
| `stop_time` | `stop_time` | DateTime | 停用时间 |
