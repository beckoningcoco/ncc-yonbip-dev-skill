---
tags: [BIP, 元数据, 数据字典, earap.param.ReceivableParam]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应收参数 (`earap.param.ReceivableParam`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ar_param` | domain：`yonbip-fi-earapbill` | 应用：`EAR` | 业务对象ID：`f35fa7f6-4a4e-42f4-8d39-64c04d862670`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应收参数 |
| 物理表 | `ar_param` |
| domain/服务域 | `yonbip-fi-earapbill` |
| schema | `fiearapbill` |
| 所属应用 | `EAR` |
| 直连字段 | 22 个 |
| 子表 | 2 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `ReceivableParam_eventHangupQuickTypeList` | `earap.param.ReceivableParam_eventHangupQuickType` | composition |
| `ReceivableParam_gainLossUncalcQuickTypeList` | `earap.param.ReceivableParamQuickType` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `gainloss_uncalc_quick_type` | `finbd.bd_paymenttyperef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `event_hangup_quick_type` | `` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体ID |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `gainloss_balance_settled` | `gainloss_balance_settled` | `gainLossBalanceSettled` | 汇兑损益参数,余额结清时是否计算汇兑损益 |
| `gainloss_esti` | `gainloss_esti` | `gainLossEsti` | 汇兑损益参数,暂估应收事务是否计算汇兑损益 |

### 枚举字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_effect_mode` | `bill_effect_mode` | `billEffectMode` | 收款、退款单生效条件 |
| `booked_close` | `booked_close` | `bookedClose` | 登账参数,关账后数据处理方式 |
| `gainloss_dimension` | `gainloss_dimension` | `gainLossDimension` | 汇兑损益参数,汇兑损益计算维度 |
| `gainloss_mode` | `gainloss_mode` | `gainLossMode` | 汇兑损益参数,汇兑损益计算方式 |
| `transfer_same_direction` | `transfer_same_direction` | `transferSameDirection` | 债权转移转出行登账方向是否与原事务登账方向相同 |
| `verify_view_mode_arap` | `verify_view_mode_arap` | `verifyViewModeArAp` | 应收核销参数,应收应付事务展示模式 |
| `verify_view_mode_colpay` | `verify_view_mode_colpay` | `verifyViewModeColPay` | 应收核销参数,收款付款事务展示模式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `ReceivableParam_eventHangupQuickTypeList` | 会计事务参数,应收事务自动挂起款项类型 |
| `` | `` | `ReceivableParam_gainLossUncalcQuickTypeList` | 应收汇兑损益参数,款项类型不计算汇兑损益设置 |

### quoteList (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `event_hangup_quick_type` | `event_hangup_quick_type` | `eventHangupQuickType` | 会计事务参数,应收事务自动挂起款项类型 |
| `gainloss_uncalc_quick_type` | `gainloss_uncalc_quick_type` | `gainLossUncalcQuickType` | 汇兑损益参数,款项类型不计算汇兑损益设置 |
