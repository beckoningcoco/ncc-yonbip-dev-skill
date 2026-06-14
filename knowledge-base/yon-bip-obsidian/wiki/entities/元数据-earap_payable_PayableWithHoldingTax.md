---
tags: [BIP, 元数据, 数据字典, earap.payable.PayableWithHoldingTax]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应付结算清单代扣税信息 (`earap.payable.PayableWithHoldingTax`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ap_payable_g_wht` | domain：`yonbip-ec-contract` | 应用：`STB` | 业务对象ID：`d610a7e5-78db-461c-a39c-57d3d42a26b8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应付结算清单代扣税信息 |
| 物理表 | `ap_payable_g_wht` |
| domain/服务域 | `yonbip-ec-contract` |
| schema | `yonbip_clm_contract` |
| 所属应用 | `STB` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `whtax_type_id` | `yonbip-fi-taxpubdoc.RefTable_9623e95970` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `whtax_subject_id` | `ucfbasedoc.bd_taxrate` |
| `whtax_id` | `yonbip-fi-taxpubdoc.RefTable_6e574b3619` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `body_id` | `` |
| `ytenant_id` | `` |
| `header_id` | `` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局分布式事务ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `whtax_subject_id` | `whtax_subject_id` | `whtaxSubject` | 代扣税税目 |
| `header_id` | `header_id` | `headerId` | 应付结算清单基本信息ID |
| `whtax_id` | `whtax_id` | `whtax` | 代扣税税码 |
| `body_id` | `body_id` | `bodyId` | 应付发票明细信息 |
| `whtax_type_id` | `whtax_type_id` | `whtaxType` | 代扣税类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务的状态 |
| `order_no` | `order_no` | `orderNo` | 序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ori_whtax_base_amount` | `ori_whtax_base_amount` | `oriWhtaxBaseAmount` | 税基 |
| `row_no` | `row_no` | `rowNo` | 行号 |
| `local_whtax_amount` | `local_whtax_amount` | `localWhtaxAmount` | 本币代扣税税额 |
| `ori_whtax_amount` | `ori_whtax_amount` | `oriWhtaxAmount` | 代扣税税额 |
| `local_whtax_base_amount` | `local_whtax_base_amount` | `localWhtaxBaseAmount` | 本币税基 |
| `whtax_rate` | `whtax_rate` | `whtaxRate` | 税率 |
