---
tags: [BIP, 元数据, 数据字典, tmsp.fundbusinobjarchives.FundBusinObjArchivesItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 伙伴银行信息 (`tmsp.fundbusinobjarchives.FundBusinObjArchivesItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tmsp_fundbusinobj_archives_item` | domain：`yonbip-fi-ctmtmsp` | 应用：`TMSP` | 业务对象ID：`86d0f3de-b64f-43e9-9f07-52b7afcf541f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 伙伴银行信息 |
| 物理表 | `tmsp_fundbusinobj_archives_item` |
| domain/服务域 | `yonbip-fi-ctmtmsp` |
| schema | `yonbip_fi_ctmpub` |
| 所属应用 | `TMSP` |
| 直连字段 | 33 个 |
| 子表 | 0 个 |
| 关联引用 | 10 个 |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `bbank_id` | `ucfbasedoc.bd_bankcard` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `bbank_account_id` | `ucfbasedoc.bd_enterprisebank` |
| `bcountry_region` | `ucfbasedoc.bd_countryref` |
| `bopenaccountbank_id` | `ucfbasedoc.bd_bankdotref` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `arthives_item_character_define` | `` |
| `ytenant_id` | `` |
| `mainid` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |

## 继承接口 (4个, 9字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`

## 字段列表（按类型分组）

> 共 33 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `account_name` | `account_name` | `accountname` | 账号名称 |
| `address` | `address` | `address` | 开户行地址 |
| `authorized_acccentity` | `authorized_acccentity` | `authorizedAcccentity` | 授权会计主体 |
| `bank_account` | `bank_account` | `bankaccount` | 银行账号 |
| `bbank_code` | `bbank_code` | `bbankCode` | 银行类别编码 |
| `bfundbusinobjtype_name` | `bfundbusinobjtype_name` | `bfundbusinobjtypename` | 资金伙伴名称 |
| `bremark` | `bremark` | `bremark` | 备注 |
| `ext` | `ext` | `ext` | ext |
| `iban` | `iban` | `iban` | IBAN |
| `id` | `id` | `id` | 主键 |
| `linenumber` | `linenumber` | `linenumber` | 联行号 |
| `swift` | `swift` | `swift` | SWIFT编码 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bbank_account_id` | `bbank_account_id` | `bbankAccountId` | 银行账户ID |
| `bbank_id` | `bbank_id` | `bbankid` | 银行类别id |
| `bcountry_region` | `bcountry_region` | `bcountryregion` | 国家地区 |
| `bopenaccountbank_id` | `bopenaccountbank_id` | `bopenaccountbankid` | 银行网点 |
| `creator` | `creator` | `creator` | 创建人 |
| `currency` | `currency` | `currency` | 币种 |
| `mainid` | `mainid` | `mainid` | 资金伙伴档案id |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `benabled` | `benabled` | `benabled` | 启停用状态 |
| `bisprivated` | `bisprivated` | `bisprivated` | 是否对私 |
| `isdefaultaccount` | `isdefaultaccount` | `isdefaultaccount` | 是否默认账户 |
| `isused` | `isused` | `isused` | 是否被引用 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 档案状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | dr |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `arthives_item_character_define` | `arthives_item_character_define` | `arthivesItemCharacterDefine` | 自定义特征 |
