---
tags: [BIP, 元数据, 数据字典, tlm.limitapplication.Limitapplication]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 衍生品额度 (`tlm.limitapplication.Limitapplication`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_limitapplication` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`664ac9e6-6821-41c7-9066-8a56867cda54`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 衍生品额度 |
| 物理表 | `tlm_limitapplication` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 69 个 |
| 子表 | 1 个 |
| 关联引用 | 29 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `tlm.limitapplication.LimitapplicationDefine` | composition |

## 关联引用 (29个)

| 字段名 | 引用类型 |
|--------|---------|
| `exchangeBuyCurrency` | `ucfbasedoc.bd_currencytenantref` |
| `financing_org_bank` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `limitapplicationCharacterDef` | `` |
| `remotePricingCurrency` | `ucfbasedoc.bd_currencytenantref` |
| `` | `` |
| `nearPricingCurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pricingCurrency` | `ucfbasedoc.bd_currencytenantref` |
| `sellCurrency` | `ucfbasedoc.bd_currencytenantref` |
| `accentity` | `ucf-org-center.bd_financeorgtreeref_na` |
| `financial_product` | `tlm_financialProductRef` |
| `remoteBuyCurrency` | `ucfbasedoc.bd_currencytenantref` |
| `remoteSellCurrency` | `ucfbasedoc.bd_currencytenantref` |
| `contract_id` | `` |
| `tenant_id` | `` |
| `exchangeNearSellCurrency` | `ucfbasedoc.bd_currencytenantref` |
| `ytenant_id` | `` |
| `accentity_raw` | `` |
| `nearbuyCurrency` | `ucfbasedoc.bd_currencytenantref` |
| `buyCurrency` | `ucfbasedoc.bd_currencytenantref` |
| `exchangeNearbuyCurrency` | `ucfbasedoc.bd_currencytenantref` |
| `protocolCurrency` | `ucfbasedoc.bd_currencytenantref` |
| `trade_type` | `` |
| `exchangeSellCurrency` | `ucfbasedoc.bd_currencytenantref` |
| `exchangeCurrency` | `ucfbasedoc.bd_currencytenantref` |
| `nearSellCurrency` | `ucfbasedoc.bd_currencytenantref` |
| `refCurrency` | `ucfbasedoc.bd_currencytenantref` |

## 继承接口 (5个, 17字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 69 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `` | `auditor` | `auditor` | 审批人 |
| `code` | `code` | `code` | 单据编号 |
| `financing_org_type` | `financing_org_type` | `financingOrgType` | 交易机构类型 |

### 引用字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `contract_id` | `contract_id` | `contractID` | 合约号 |
| `trade_type` | `trade_type` | `bustype` | 交易类型 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `financial_product` | `financial_product` | `financialProduct` | 金融产品id |
| `protocolCurrency` | `protocolCurrency` | `protocolCurrency` | 合约币种id |
| `sellCurrency` | `sellCurrency` | `sellCurrency` | 卖出币种id |
| `buyCurrency` | `buyCurrency` | `buyCurrency` | 买入币种id |
| `nearSellCurrency` | `nearSellCurrency` | `nearSellCurrency` | 近端卖出币种id |
| `nearbuyCurrency` | `nearbuyCurrency` | `nearbuyCurrency` | 近端买入币种id |
| `refCurrency` | `refCurrency` | `refCurrency` | 源币种id |
| `exchangeCurrency` | `exchangeCurrency` | `exchangeCurrency` | 兑换币种id |
| `exchangeBuyCurrency` | `exchangeBuyCurrency` | `exchangeBuyCurrency` | 买入币种id |
| `exchangeSellCurrency` | `exchangeSellCurrency` | `exchangeSellCurrency` | 卖出币种id |
| `exchangeNearSellCurrency` | `exchangeNearSellCurrency` | `exchangeNearSellCurrency` | 近端卖出币种id |
| `exchangeNearbuyCurrency` | `exchangeNearbuyCurrency` | `exchangeNearbuyCurrency` | 近端买入币种id |
| `pricingCurrency` | `pricingCurrency` | `pricingCurrency` | 计价币种id |
| `financing_org_bank` | `financing_org_bank` | `financingOrgForBank` | 交易机构id |
| `nearPricingCurrency` | `nearPricingCurrency` | `nearPricingCurrency` | 近端计价币种id |
| `remotePricingCurrency` | `remotePricingCurrency` | `remotePricingCurrency` | 远端计价币种id |
| `remoteBuyCurrency` | `remoteBuyCurrency` | `remoteBuyCurrency` | 远端买入币种id |
| `remoteSellCurrency` | `remoteSellCurrency` | `remoteSellCurrency` | 远端卖出币种id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `vouchdate` | `vouchdate` | `vouchdate` | 单据日期 |
| `enablestartdate` | `enablestartdate` | `enableStartDate` | 额度开始日期 |
| `enableenddate` | `enableenddate` | `enableEndDate` | 额度结束日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |

### 短整数 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `verifystate` | `verifystate` | 审批状态 |
| `billtype` | `billtype` | `billtype` | 单据类型编码 |
| `srcitem` | `srcitem` | `srcitem` | 事项来源 |
| `src_event_type` | `src_event_type` | `srcEventType` | 事项类型 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `audit_status` | `audit_status` | `auditStatus` | 审批状态 |
| `trade_direction` | `trade_direction` | `tradeDirection` | 交易方向 |
| `trade_direction_exchange` | `trade_direction_exchange` | `tradeDirectionExchange` | 交易方向 |
| `trade_direction_rate` | `trade_direction_rate` | `tradeDirectionRate` | 交易方向 |
| `trade_direction_ref` | `trade_direction_ref` | `tradeDirectionRef` | 交易方向 |
| `on_site_or_off_site` | `on_site_or_off_site` | `onSiteOrOffSite` | 场内/外 |
| `domestic_or_overseas` | `domestic_or_overseas` | `domesticOrOverseas` | 境内/外 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 主表id |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sellLimitAmount` | `sellLimitAmount` | `sellLimitAmount` | 额度金额(卖出币种) |
| `buyLimitAmount` | `buyLimitAmount` | `buyLimitAmount` | 额度金额(买入币种) |
| `nearSellLimitAmount` | `nearSellLimitAmount` | `nearSellLimitAmount` | 额度金额(近端卖出币种) |
| `nearBuyLimitAmount` | `nearBuyLimitAmount` | `nearBuyLimitAmount` | 额度金额(近端买入币种) |
| `limitAmount` | `limitAmount` | `limitAmount` | 额度金额(合约币种) |
| `UsedAmount` | `UsedAmount` | `UsedAmount` | 已用额度金额 |
| `usableAmount` | `usableAmount` | `usableAmount` | 可用额度金额 |
| `limitAmountRef` | `limitAmountRef` | `limitAmountRef` | 额度金额 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `limitapplicationCharacterDef` | `limitapplicationCharacterDef` | `limitapplicationCharacterDef` | 额度申请自定义项 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 自由自定义项 |
