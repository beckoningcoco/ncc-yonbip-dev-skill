---
tags: [BIP, 元数据, 数据字典, sact.contract.ReceiveAgreement]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收款协议 (`sact.contract.ReceiveAgreement`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sact_receiveagreement` | domain：`sact` | 应用：`SACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收款协议 |
| 物理表 | `sact_receiveagreement` |
| domain/服务域 | `sact` |
| schema | `scmmp` |
| 所属应用 | `SACT` |
| 直连字段 | 52 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `agree_oId` | `` |
| `ytenant_id` | `` |
| `receiveAgreementDefineCharacter` | `` |
| `sact_vid` | `` |
| `ireceivestartbase` | `ucfbasedoc.bd_receivestartbase` |
| `settleWay` | `productcenter.aa_settlemethodref` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 52 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `note` | `note` | `note` | 备注 |
| `payType` | `payType` | `payType` | 付款方式 |
| `paymentCode` | `paymentCode` | `paymentCode` | 付款条款编码 |
| `supportDocName` | `supportDocName` | `supportDocName` | 支撑文档名称 |
| `receivename` | `receivename` | `receiveName` | 阶段名称 |
| `startbasecode` | `startbasecode` | `startBaseCode` | 起算时点编码 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settleWay` | `settleWay` | `settleWay` | 结算方式 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `sact_vid` | `sact_vid` | `sactVId` | 外键 |
| `agree_oId` | `agree_oId` | `agreeOId` | 收款历史 |
| `ireceivestartbase` | `ireceivestartbase` | `receiveStartBase` | 起算时点 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `canUseCredits` | `canUseCredits` | `canUseCredits` | 是否可使用授信 |
| `canUseInspirit` | `canUseInspirit` | `canUseInspirit` | 是否可使用激励 |
| `isCashDiscount` | `isCashDiscount` | `isCashDiscount` | 是否现金折扣 |
| `isFullPayment` | `isFullPayment` | `isFullPayment` | 是否已足额付款 |
| `bstartsourcetype` | `bstartsourcetype` | `sourceType` | 起算时点是否是系统预制 |
| `bprereceive` | `bprereceive` | `preReceive` | 0无预收,2预收 |
| `bdeposit` | `bdeposit` | `deposit` | 0无保证金,2有保证金 |

### 整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bankCommitmentTerm` | `bankCommitmentTerm` | `bankCommitmentTerm` | 银承期限 |
| `iorder` | `iorder` | `order` | 期号 |
| `iaccountday` | `iaccountday` | `accountDay` | 账期 |
| `iaccountunit` | `iaccountunit` | `accountUnit` | 账期单位 |
| `idelaydays` | `idelaydays` | `delayDays` | 起算日延迟日 |
| `idelaymonths` | `idelaymonths` | `delayMonths` | 起算日延迟月 |
| `icontrolmode` | `icontrolmode` | `controlMode` | 控制方式 |
| `icontroloppt` | `icontroloppt` | `controlOppt` | 控制时机 |
| `icontrollink` | `icontrollink` | `controlLink` | 控制环节 |

### 短整数 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `businessType` | `businessType` | `businessType` | 适用业务类型 |
| `fixedexpireday` | `fixedexpireday` | `fixedexpireday` | 固定到期日 |
| `fixedoaday` | `fixedoaday` | `fixedoaday` | 固定出账日 |
| `iaccounttype` | `iaccounttype` | `accountType` | 账期类型 |
| `ifixedoaday1` | `ifixedoaday1` | `fixedoaday1` | 固定出账日1 |
| `ifixedoaday2` | `ifixedoaday2` | `fixedoaday2` | 固定出账日2 |
| `ifixedoaday3` | `ifixedoaday3` | `fixedoaday3` | 固定出账日3 |
| `ifixedoaday4` | `ifixedoaday4` | `fixedoaday4` | 固定出账日4 |
| `ifixedexpireday1` | `ifixedexpireday1` | `fixedexpireday1` | 固定到期日1 |
| `ifixedexpireday2` | `ifixedexpireday2` | `fixedexpireday2` | 固定到期日2 |
| `ifixedexpireday3` | `ifixedexpireday3` | `fixedexpireday3` | 固定到期日3 |
| `ifixedexpireday4` | `ifixedexpireday4` | `fixedexpireday4` | 固定到期日4 |
| `iprereceivetype` | `iprereceivetype` | `preReceiveType` | 预收折算方式 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 收款协议 |
| `iperiodid` | `iperiodid` | `periodId` | 收款协议账期 |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `freceivepercent` | `freceivepercent` | `receivePercent` | 应收比例 |
| `farmoney` | `farmoney` | `arMoney` | 应收金额 |
| `frecmoney` | `frecmoney` | `recMoney` | 已收金额 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dstartbasedate` | `dstartbasedate` | `startBaseDate` | 起算日 |
| `daccountday` | `daccountday` | `accountDate` | 出账日 |
| `dexpiredate` | `dexpiredate` | `expireDate` | 到期日 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `dstartbasetime` | `dstartbasetime` | `startDateTime` | 起算时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `receiveAgreementDefineCharacter` | `receiveAgreementDefineCharacter` | `receiveAgreementDefineCharacter` | 销售合同收款协议自定义项特征属性组 |
