---
tags: [BIP, 元数据, 数据字典, uhybase.fan.WxAccount]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 公众号 (`uhybase.fan.WxAccount`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_wxaccount` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：`e5f40cb8-5f03-4429-8e0b-f25ed0ded13e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 公众号 |
| 物理表 | `mp_wxaccount` |
| domain/服务域 | `uhy` |
| schema | `yilian` |
| 所属应用 | `SDMB` |
| 直连字段 | 27 个 |
| 子表 | 1 个 |
| 关联引用 | 3 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `wxAccountCoupon` | `uhybase.fan.WxAccountCoupon` | composition |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `cAppID` | `mm_corphierarchyref` |
| `ytenant_id` | `` |
| `` | `` |

## 继承接口 (3个, 3字段)

- **会员租户相关** (`base.itf.IMembercorp`)
  - `iCorpId` → `iCorpId`
- **创建时间** (`uhy.itf.CreateTime`)
  - `dCreateTime` → `dCreateTime`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cWXAccountID` | `cWXAccountID` | `cWXAccountID` | 公众号ID |
| `cWXAccountName` | `cWXAccountName` | `cWXAccountName` | 公众号名称 |
| `cAppSecret` | `cAppSecret` | `cAppSecret` | AppSecret |
| `cCompany` | `cCompany` | `cCompany` | 公司名称 |
| `cDescription` | `cDescription` | `cDescription` | 公司介绍 |
| `cBindWXAccount` | `cBindWXAccount` | `cBindWXAccount` | 绑定个人公众号 |
| `cFuncInfo` | `cFuncInfo` | `cFuncInfo` | 公众号授权清单 |
| `cQRCode` | `cQRCode` | `cQRCode` | 微信二维码 |
| `cWXAppID` | `cWXAppID` | `cWXAppID` | 微信APPID |
| `cWXHeadPic` | `cWXHeadPic` | `cWXHeadPic` | 微信图片 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAppID` | `cAppID` | `cAppID` | 会籍 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCategory` | `iCategory` | `iCategory` | 帐号类型 |
| `bAuthentic` | `bAuthentic` | `bAuthentic` | 是否授权 |
| `dCreateTime` | `dCreateTime` | `createTime` | 创建时间 |
| `dCreateTime` | `dCreateTime` | `dCreateTime` | 创建事件 |
| `iMiniProgramType` | `iMiniProgramType` | `iMiniProgramType` | 小程序类型(0:原生 1:H5) |
| `iOpenPlatFormAccess` | `iOpenPlatFormAccess` | `iOpenPlatFormAccess` | 是否开放平台 |
| `iServiceTypeInfo` | `iServiceTypeInfo` | `iServiceTypeInfo` | 绑定个人公众号 |
| `iStatus` | `iStatus` | `iStatus` | 状态 |
| `iVerifyTypeInfo` | `iVerifyTypeInfo` | `iVerifyTypeInfo` | 绑定个人公众号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iFirstReplyType` | `iFirstReplyType` | `iFirstReplyType` | 首关发送消息 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `iEPUserID` | `iEPUserID` | `iEPUserID` | EPUserID |
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `wxAccountCoupon` | 微信公众号优惠券 |
