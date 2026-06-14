---
tags: [BIP, 元数据, 数据字典, marketing.price.PriceStrategy]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 定价策略 (`marketing.price.PriceStrategy`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`udh_price_strategy` | domain：`marketingbill` | 应用：`B2Bpricing` | 业务对象ID：`fd4fc21d-27ce-44aa-8b61-16b02eb0d95f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定价策略 |
| 物理表 | `udh_price_strategy` |
| domain/服务域 | `marketingbill` |
| 所属应用 | `B2Bpricing` |
| 直连字段 | 46 个 |
| 子表 | 3 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `priceStrategyRules` | `marketing.price.PriceStrategyMatchRule` | composition |
| `priceStrategySteps` | `marketing.price.PriceStrategyStep` | composition |
| `priceStrategyScopes` | `marketing.price.PriceStrategyScope` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `auditorid` | `` |
| `ytenant_id` | `` |
| `creation_org_id` | `market_salesorgref` |
| `instance_id` | `` |

## 继承接口 (8个, 22字段)

- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 46 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 编号 |
| `description` | `description` | `description` | 描述 |
| `priority` | `priority` | `priority` | 优先级 |
| `udh_pre_pricing_dimension_id` | `udh_pre_pricing_dimension_id` | `pricePreDimensionId` | 匹配维度ID |
| `auditor` | `auditor` | `auditor` | 审核人 |
| `` | `creator` | `creator` | 制单人 |
| `` | `modifier` | `modifier` | 修改人 |
| `name2` | `name2` | `name2` | 名称2 |
| `name3` | `name3` | `name3` | 名称3 |
| `name4` | `name4` | `name4` | 名称4 |
| `name5` | `name5` | `name5` | 名称5 |
| `name6` | `name6` | `name6` | 名称6 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creation_org_id` | `creation_org_id` | `creationOrgId` | 销售组织ID |
| `auditorid` | `auditorid` | `auditorId` | 审核人Id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审核日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `isTaxIncluded` | `isTaxIncluded` | `isTaxIncluded` | 是否含税 |
| `canEdit` | `canEdit` | `canEdit` | 可修改 |
| `canEnable` | `canEnable` | `canEnable` | 可启用 |
| `iSystem` | `iSystem` | `iSystem` | 系统预设 |
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 短整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `status` | `status` | `status` | 单据状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `version` | `version` | `version` | 版本号 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 单据id |
| `iBizId` | `iBizId` | `bizId` | 商家 |
| `udh_price_strategy_id` | `udh_price_strategy_id` | `parentId` | 父模板ID |
| `tenant_id` | `tenant_id` | `uordercorp` | 租户ID |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审核时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `pubuts` | `pubuts` | `pubts` | 时间戳 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `priceStrategyRules` | 定价策略匹配规则 |
| `` | `` | `priceStrategyScopes` | 定价策略适应范围 |
| `` | `` | `priceStrategySteps` | 定价策略取价步骤 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `instance_id` | `instance_id` | `properties` | 价格特征实体001 |
