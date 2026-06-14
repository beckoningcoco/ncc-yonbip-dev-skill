---
tags: [BIP, 元数据, 数据字典, aa.agent.AgentRelation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户交易关系 (`aa.agent.AgentRelation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`agentrelation` | domain：`udinghuo` | 应用：`` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户交易关系 |
| 物理表 | `agentrelation` |
| domain/服务域 | `udinghuo` |
| 所属应用 | `` |
| 直连字段 | 23 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `iagentId` | `` |
| `iShippingChoiceId` | `` |
| `iAgentAreaId` | `` |
| `iAgentLevelId` | `` |
| `iTransactionTypeId` | `` |
| `ytenant_id` | `` |
| `iDepartmentId` | `` |
| `iOrgId` | `` |
| `iCollectionAgreement` | `` |
| `cExchangeRateTypeId` | `` |
| `iSettlementWayId` | `` |
| `iAgentIndustryId` | `` |
| `cCurrencyId` | `` |
| `cTaxRateId` | `` |
| `iAgentCategoryId` | `` |

## 继承接口 (3个, 3字段)

- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCurrencyCode` | `cCurrencyCode` | `currencyCode` | 币种编码 |
| `cCurrencyName` | `cCurrencyName` | `currencyName` | 币种名称 |
| `bValid` | `bValid` | `valid` | 是否停用 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iAgentAreaId` | `iAgentAreaId` | `agentAreaId` | 客户区域 |
| `iAgentCategoryId` | `iAgentCategoryId` | `agentCategoryId` | 客户分类 |
| `iagentId` | `iagentId` | `agentId` | agentId |
| `iAgentIndustryId` | `iAgentIndustryId` | `agentIndustryId` | 客户行业 |
| `iAgentLevelId` | `iAgentLevelId` | `agentLevelId` | 客户级别 |
| `iCollectionAgreement` | `iCollectionAgreement` | `collectionAgreement` | 收款协议 |
| `cCurrencyId` | `cCurrencyId` | `currencyId` | 币种主键 |
| `cExchangeRateTypeId` | `cExchangeRateTypeId` | `exchangeRateType` | 汇率类型 |
| `iOrgId` | `iOrgId` | `orgId` | 组织id |
| `iSettlementWayId` | `iSettlementWayId` | `settlementWayId` | 结算方式id |
| `iShippingChoiceId` | `iShippingChoiceId` | `shippingChoiceId` | 发送方法id |
| `iDepartmentId` | `iDepartmentId` | `specialManagementDep` | 专管部门 |
| `cTaxRateId` | `cTaxRateId` | `taxRateId` | 销项税率 |
| `iTransactionTypeId` | `iTransactionTypeId` | `transactionTypeId` | 交易类型id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iBizId` | `iBizId` | `bizId` |  商家ID |
| `id` | `id` | `id` | ID |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
