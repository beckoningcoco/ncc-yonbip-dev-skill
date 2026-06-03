---
tags: [BIP, 元数据, 数据字典, drft.drftbillcirculate.DrftBillCirculate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 票据流转信息 (`drft.drftbillcirculate.DrftBillCirculate`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`drft_billcirculate` | domain：`drft` | 应用：`DRFT` | 业务对象ID：`d53e3479-8fcd-40f4-abc5-c075ebb0577b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 票据流转信息 |
| 物理表 | `drft_billcirculate` |
| 数据库 schema | `drft` |
| 所属应用 | `DRFT` |
| 直连字段 | 45 个 |
| 子表 | 3 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `DrftBillCirculateBodyList` | `drft.drftbillcirculate.DrftBillCirculateBody` | composition |
| `DrftBillCirculateAcptAssureList` | `drft.drftbillcirculate.DrftBillCirculateAcptAssure` | composition |
| `DrftBillCirculateDrawAssureList` | `drft.drftbillcirculate.DrftBillCirculateDrawAssure` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `notetype` | `drft_billtyperef` |
| `ytenant_id` | `` |
| `` | `` |
| `currency` | `bd_currencytenantreflist` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 45 个直连字段

### 文本字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `noteno` | `noteno` | `noteno` | 票据号 |
| `showinvoicer` | `showinvoicer` | `showinvoicer` | 出票人 |
| `showreceiver` | `showreceiver` | `showreceiver` | 收票人 |
| `showacceptancer` | `showacceptancer` | `showacceptancer` | 承兑人 |
| `showacceptbankacc` | `showacceptbankacc` | `showacceptbankacc` | 承兑人账号 |
| `showacceptopenbank` | `showacceptopenbank` | `showacceptopenbank` | 承兑人开户行 |
| `showinvoicerbankacc` | `showinvoicerbankacc` | `showinvoicerbankacc` | 出票人账号 |
| `showInvoiceOpenbankname` | `showInvoiceOpenbankname` | `showInvoiceOpenbankname` | 出票人开户行 |
| `showreceiverbankacc` | `showreceiverbankacc` | `showreceiverbankacc` | 收票人账号 |
| `showReceiveOpenbankname` | `showReceiveOpenbankname` | `showReceiveOpenbankname` | 收票人开户行 |
| `acptcreditrating` | `acptcreditrating` | `acptcreditrating` | 承兑人信用等级 |
| `acptratingexpdate` | `acptratingexpdate` | `acptratingexpdate` | 承兑人评级到期日 |
| `acptratingsubject` | `acptratingsubject` | `acptratingsubject` | 承兑人评级主体 |
| `billrange` | `billrange` | `billrange` | 子票区间 |
| `circulateflag` | `circulateflag` | `circulateflag` | 流通标识 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `drawcreditrating` | `drawcreditrating` | `drawcreditrating` | 出票人信用等级 |
| `drawratingexpdate` | `drawratingexpdate` | `drawratingexpdate` | 出票人评级到期日 |
| `drawratingsubject` | `drawratingsubject` | `drawratingsubject` | 出票人评级主体 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `srcpk` | `srcpk` | `srcpk` | 来源单据主键 |
| `srctype` | `srctype` | `srctype` | 来源单据类型 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `currency` | `currency` | `currency` | 币种id |
| `notetype` | `notetype` | `notetype` | 票据类型id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `invoicedate` | `invoicedate` | `invoicedate` | 出票日期 |
| `enddate` | `enddate` | `enddate` | 到期日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `istransfer` | `istransfer` | `istransfer` | 可转让 |

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
| `notemoney` | `notemoney` | `notemoney` | 票面金额 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `DrftBillCirculateAcptAssureList` | 票据流转信息承兑保证信息 |
| `` | `` | `DrftBillCirculateBodyList` | 票据流转信息子表 |
| `` | `` | `DrftBillCirculateDrawAssureList` | 票据流转信息出票保证信息 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
