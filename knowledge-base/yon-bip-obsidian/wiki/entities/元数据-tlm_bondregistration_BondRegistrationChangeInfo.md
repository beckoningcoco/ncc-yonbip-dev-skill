---
tags: [BIP, 元数据, 数据字典, tlm.bondregistration.BondRegistrationChangeInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 债券注册登记变更历史 (`tlm.bondregistration.BondRegistrationChangeInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_bondregistration_changeinfo` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 债券注册登记变更历史 |
| 物理表 | `tlm_bondregistration_changeinfo` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 34 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `trading_market` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `ytenant_id` | `` |
| `` | `` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `register_approval_Doc` | `` |
| `mainid` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 34 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `uppercase_money` | `uppercase_money` | `uppercaseMoney` | 金额大写 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `version_number` | `version_number` | `versionNumber` | 版本号 |
| `code` | `code` | `code` | 单据编号 |
| `change_reason` | `change_reason` | `changeReason` | 变更原因 |
| `change_type` | `change_type` | `changeType` | 版本类型 |
| `` | `creator` | `creator` | 创建人名称 |
| `id` | `id` | `id` | 债券注册登记变更历史id |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 债券注册登记主表id |
| `trading_market` | `trading_market` | `tradingMarket` | 交易市场ID |
| `register_approval_Doc` | `register_approval_Doc` | `registerApprovalDoc` | 注册批文 |
| `currency` | `currency` | `currency` | 币种ID |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `start_date` | `start_date` | `startDate` | 起始日期 |
| `end_date` | `end_date` | `endDate` | 到期日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_budget` | `is_budget` | `isBudget` | 是否占用預算 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `termNumber` | `termNumber` | `termNumber` | 期限数量 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `domestic_or_overseas` | `domestic_or_overseas` | `domesticOrOverseas` | 境内/外 |
| `is_circulate_quota` | `is_circulate_quota` | `isCirculateQuota` | 额度是否循环 |
| `control_model` | `control_model` | `controlModel` | 控制方式 |
| `` | `status` | `status` | 单据状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `eid` | `eid` | `eid` | 关联单据id |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `register_total_amount` | `register_total_amount` | `registerTotalAmount` | 注册总额度 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
