---
tags: [BIP, 元数据, 数据字典, lgm.guaranteeregister.GuaranteeHistory]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 开函登记版本历史 (`lgm.guaranteeregister.GuaranteeHistory`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`lgm_guarantee_history` | domain：`yonbip-fi-ctmlgm` | 应用：`LGM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开函登记版本历史 |
| 物理表 | `lgm_guarantee_history` |
| 数据库 schema | `yonbip-fi-ctmlgm` |
| 所属应用 | `LGM` |
| 直连字段 | 27 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `currency` | `` |
| `mainid` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_id` | `bill_id` | `billId` | 单据主键 |
| `bill_service_code` | `bill_service_code` | `billServiceCode` | 单据服务编码 |
| `change_reason` | `change_reason` | `changeReason` | 变更原因 |
| `change_version` | `change_version` | `changeVersion` | 版本号 |
| `change_version_type` | `change_version_type` | `changeVersionType` | 版本类型 |
| `code` | `code` | `code` | 单据编号 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `currency` | `currency` | `currency` | 币种 |
| `mainid` | `mainid` | `mainid` | 开函登记id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_date` | `change_date` | `changeDate` | 变更日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `guarantee_begin_date` | `guarantee_begin_date` | `guaranteeBeginDate` | 保函开始日期 |
| `guarantee_end_date` | `guarantee_end_date` | `guaranteeEndDate` | 保函结束日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `guarantee_amount` | `guarantee_amount` | `guaranteeAmount` | 保函金额 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
