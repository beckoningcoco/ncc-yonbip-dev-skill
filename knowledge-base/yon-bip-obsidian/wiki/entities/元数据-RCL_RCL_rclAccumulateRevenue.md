---
tags: [BIP, 元数据, 数据字典, RCL.RCL.rclAccumulateRevenue]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同累计收入 (`RCL.RCL.rclAccumulateRevenue`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_accumulate` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`37f0c7f0-8182-4c5d-b536-5dcdb0e8f91c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同累计收入 |
| 物理表 | `rcl_accumulate` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `period` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accentity` | `ucf-org-center.bd_financeorgtreeref` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contradt_detailid` | `contradt_detailid` | `contractdetailid` | 合同行主键 |
| `contract_id` | `contract_id` | `contractid` | 合同主键 |
| `contract_no` | `contract_no` | `contractno` | 合同号 |
| `contract_rowno` | `contract_rowno` | `contractrowno` | 合同行号 |
| `period_code` | `period_code` | `periodcode` | 期间编码 |
| `periodexesituation_id` | `periodexesituation_id` | `periodexesituationid` | 分期执行情况主键 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `period` | `period` | `period` | 期间 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billdate` | `billdate` | `billdate` | 单据日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `totalbusinessmoney` | `totalbusinessmoney` | `totalbusinessmoney` | 累计业务金额 |
| `totaldeferincomemoney_save` | `totaldeferincomemoney_save` | `totaldeferincomemoneysave` | 累计递延收入金额(保存) |
| `totalincomemoney_save` | `totalincomemoney_save` | `totalincomemoneysaved` | 累计收入金额(保存) |
