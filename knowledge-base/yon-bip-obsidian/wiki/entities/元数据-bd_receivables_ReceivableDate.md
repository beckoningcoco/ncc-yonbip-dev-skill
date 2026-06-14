---
tags: [BIP, 元数据, 数据字典, bd.receivables.ReceivableDate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收款账期 (`bd.receivables.ReceivableDate`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_receivabledate` | domain：`ucfbasedoc` | 应用：`DPMSETL` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收款账期 |
| 物理表 | `bd_receivabledate` |
| domain/服务域 | `ucfbasedoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMSETL` |
| 直连字段 | 31 个 |
| 子表 | 1 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `receivableDateDefine` | `bd.receivables.ReceivableDateDefine` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `receivableDateCharacter` | `` |
| `receivestartbase` | `ucfbasedoc.bd_receivestartbaseref` |
| `settleWay` | `productcenter.aa_settlemethodref` |
| `receiveAgreement` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 31 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `receiveAgreement` | `receiveAgreement` | `receiveAgreement` | 收款协议 |
| `settleWay` | `settleWay` | `settleWay` | 结算方式 |
| `receivestartbase` | `receivestartbase` | `receiveStartBase` | 起算时点 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `prereceive` | `prereceive` | `preReceive` | 预收款 |
| `deposit` | `deposit` | `deposit` | 保证金 |

### 整数 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `delaydays` | `delaydays` | `delayDays` | 延迟天数 |
| `delaymonths` | `delaymonths` | `delayMonths` | 延迟月份 |
| `fixedoaday` | `fixedoaday` | `fixedoaday` | 固定日 |
| `fixedoaday1` | `fixedoaday1` | `fixedoaday1` | 固定日1 |
| `fixedoaday2` | `fixedoaday2` | `fixedoaday2` | 固定日2 |
| `fixedoaday3` | `fixedoaday3` | `fixedoaday3` | 固定日3 |
| `fixedoaday4` | `fixedoaday4` | `fixedoaday4` | 固定日4 |
| `accounttype` | `accounttype` | `accountType` | 账期类型 |
| `accountday` | `accountday` | `accountDay` | 账期 |
| `accountUnit` | `accountUnit` | `accountUnit` | 账期单位 |
| `fixedexpireday` | `fixedexpireday` | `fixedexpireday` | 固定日 |
| `fixedexpireday1` | `fixedexpireday1` | `fixedexpireday1` | 固定日1 |
| `fixedexpireday2` | `fixedexpireday2` | `fixedexpireday2` | 固定日2 |
| `fixedexpireday3` | `fixedexpireday3` | `fixedexpireday3` | 固定日3 |
| `fixedexpireday4` | `fixedexpireday4` | `fixedexpireday4` | 固定日4 |
| `controllink` | `controllink` | `controlLink` | 控制环节 |
| `controloppt` | `controloppt` | `controlOppt` | 控制时机 |
| `controlmode` | `controlmode` | `controlMode` | 控制方式 |
| `iorder` | `iorder` | `order` | 排序 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `receivepercent` | `receivepercent` | `receivePercent` | 收款比例 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `receivename` | `receivename` | `receiveName` | 收款名称 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `receivableDateCharacter` | `receivableDateCharacter` | `receivableDateCharacter` | 自定义项特征 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `receivableDateDefine` | 收款账期扩展表(自定义项扩展表) |
