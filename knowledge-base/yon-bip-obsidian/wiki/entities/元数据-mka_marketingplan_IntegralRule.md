---
tags: [BIP, 元数据, 数据字典, mka.marketingplan.IntegralRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 营销方案积分规则 (`mka.marketingplan.IntegralRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_integral_rule` | domain：`yycrm` | 应用：`MKA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 营销方案积分规则 |
| 物理表 | `mka_integral_rule` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `MKA` |
| 直连字段 | 15 个 |
| 子表 | 5 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `integralRuleTerminalCategoryType` | `mka.marketingplan.IntegralRuleTerminalCategoryType` | composition |
| `integralRuleActitityType` | `mka.marketingplan.IntegralRuleActitityType` | composition |
| `integralRuleDisplayId` | `mka.marketingplan.IntegralRuleDisplayId` | composition |
| `integralRuleCoupon` | `mka.marketingplan.IntegralRuleCoupon` | composition |
| `integralRuleCustomerCategoryType` | `mka.marketingplan.IntegralRuleCustomerCategoryType` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `membership_level` | `uhy.mm_memberlevelref` |
| `ytenant_id` | `` |
| `marketPlanId` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 15 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `coupon` | `coupon` | `coupon` | 卡券 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `membership_level` | `membership_level` | `membershipLevel` | 会员等级ID |
| `marketPlanId` | `marketPlanId` | `marketPlanId` | 营销方案ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `partner_execute` | `partner_execute` | `partnerExecute` | 伙伴执行 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `integral` | `integral` | `integral` | 积分 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `review_reuslt` | `review_reuslt` | `reviewReuslt` | 检核结果 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `integralRuleActitityType` | 积分规则活动类型孙表 |
| `` | `` | `integralRuleCoupon` | 积分规则卡券孙表 |
| `` | `` | `integralRuleCustomerCategoryType` | 积分规则客户类型孙表 |
| `` | `` | `integralRuleDisplayId` | 积分规则陈列规格孙表 |
| `` | `` | `integralRuleTerminalCategoryType` | 积分规则终端分类孙表 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
