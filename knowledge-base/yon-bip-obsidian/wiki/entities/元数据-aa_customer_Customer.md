---
tags: [BIP, 元数据, 数据字典, aa.customer.Customer]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户档案 (`aa.customer.Customer`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`agent` | domain：`uorder-base` | 应用：`free0907` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户档案 |
| 物理表 | `agent` |
| 数据库 schema | `uorder-base` |
| 所属应用 | `free0907` |
| 直连字段 | 19 个 |
| 子表 | 0 个 |
| 关联引用 | 0 个 |

## 继承接口 (2个, 2字段)

- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cErpCode` | `cErpCode` | `cErpCode` | ERP编码 |
| `cTaxNo` | `cTaxNo` | `cTaxNo` | 纳税人识别号 |
| `cCode` | `cCode` | `code` | 客户编码 |
| `cCreator` | `cCreator` | `creator` | 创建人 |
| `iCusCreLine` | `iCusCreLine` | `iCusCreLine` | 信用额度 |
| `iDeleted` | `iDeleted` | `isDeleted` | 状态 |
| `cModifier` | `cModifier` | `modifier` | 修改人 |
| `cName` | `cName` | `name` | 客户名称 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bURetailJoin` | `bURetailJoin` | `uRetailJoin` | 是否零售加盟商 |

### 长整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cPayway` | `cPayway` | `cPayway` | 支付方式 |
| `iAgentAreaId` | `iAgentAreaId` | `iAgentAreaId` | 客户地区 |
| `iAgentIndustryId` | `iAgentIndustryId` | `iAgentIndustryId` | 客户行业 |
| `iAgentLevelId` | `iAgentLevelId` | `iAgentLevelId` | 客户级别 |
| `iSettlementWayId` | `iSettlementWayId` | `iSettlementWayId` | 结算方式 |
| `iShippingChoiceId` | `iShippingChoiceId` | `iShippingChoiceId` | 发运方式 |
| `id` | `id` | `id` | ID |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dCreatedTime` | `dCreatedTime` | `createTime` | 创建时间 |
| `dModifyTime` | `dModifyTime` | `modifyTime` | 修改时间 |
