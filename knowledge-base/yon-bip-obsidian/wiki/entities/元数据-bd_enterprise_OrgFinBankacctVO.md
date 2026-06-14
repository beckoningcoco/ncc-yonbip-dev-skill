---
tags: [BIP, 元数据, 数据字典, bd.enterprise.OrgFinBankacctVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 企业资金账户 (`bd.enterprise.OrgFinBankacctVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_fin_bankacct` | domain：`ucfbasedoc` | 应用：`DPMSETL` | 业务对象ID：`d0113636-9df6-4d4a-a22e-3c221207d530`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 企业资金账户 |
| 物理表 | `org_fin_bankacct` |
| domain/服务域 | `ucfbasedoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMSETL` |
| 直连字段 | 47 个 |
| 关联引用 | 18 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `linkedAccountList` | `bd.enterprise.BankAcctLinkedAccVO` | composition |
| `currencyList` | `bd.enterprise.BankAcctCurrencyVO` | composition |
| `defines` | `bd.enterprise.OrgFinBankacctVODefine` | composition |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `banknumber` | `ucfbasedoc.bd_bankdotref` |
| `parent` | `ucfbasedoc.bd_enterprisebank` |
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `` | `` |
| `orgid` | `ucf-org-center.bd_fundsorg` |
| `bankcity` | `ucfbasedoc.bd_regioncityref` |
| `agent_bank` | `` |
| `bank` | `ucfbasedoc.bd_bankcard` |
| `org_group_id` | `` |
| `account_purpose` | `ucfbasedoc.bd_accountpurposeref` |
| `settleorgid` | `ucf-org-center.bd_settlementorg` |
| `account_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `bankprovince` | `ucfbasedoc.bd_regionprovinceref` |
| `defineCharacter` | `` |

## 继承接口 (5个, 7字段)

- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 47 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | String | id |
| `code` | `code` | String | 账户编码 |
| `account` | `account` | String | 银行账号 |
| `linenumber` | `linenumber` | String | 联行号 |
| `log` | `log` | String | 操作日志 |
| `sysid` | `sysid` | String | 应用标识 |
| `objid` | `objid` | String | 友企连同步ID |
| `tenantid` | `tenantid` | String | 租户 |

### 引用字段 (14个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `settleorgid` | `settleorgid` | c8022140-b5fa-4f19-a0b2-2be0192eac18 | 结算中心 |
| `account_purpose` | `account_purpose` | 6e200813-f353-480a-9b2f-4508a4a09266 | 账户用途 |
| `orgid` | `orgid` | 60bf293e-5593-454b-be50-5a5fa016e4a6 | 组织 |
| `account_org_id` | `account_org_id` | 4928db62-a46d-4829-a26a-1de4bb3bf98c | 开户组织 |
| `bank` | `bank` | b7ee7189-ed97-48d5-91e4-808228664429 | 银行类别 |
| `bankprovince` | `bankprovince` | 95577e23-979f-4f09-a629-61fea93e576d | 开户省 |
| `bankcity` | `bankcity` | 95577e23-979f-4f09-a629-61fea93e576d | 开户市 |
| `banknumber` | `banknumber` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | 开户行 |
| `parent` | `parent` | fbc20885-a507-45bd-a986-74d3fc28d38a | 上级企业银行账户 |
| `org_group_id` | `org_group_id` | 44210b7f-0ffa-4cf9-be11-8fdfa006a2ae | 适用范围ID |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |
| `agent_bank` | `agent_bank` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | 电票代理行 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `ctm_direct_link_flag` | `ctm_direct_link_flag` | Boolean | 司库直联 |
| `ctm_account_open_flag` | `ctm_account_open_flag` | Boolean | 企业资金账户开户标识 |
| `tax_registration` | `tax_registration` | Boolean | 纳税登记 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `account_level` | `account_level` | String | 账户等级 |

### 整数 (9个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `busiobj_filterkey` | `busiobj_filterkey` | Integer | 系统filterKey属性 |
| `acctopentype` | `acctopentype` | Integer | 开户类型 |
| `accttype` | `accttype` | Integer | 账户性质 |
| `accountNature` | `accountNature` | Integer | 账户类型 |
| `acctstatus` | `acctstatus` | Integer | 账户状态 |
| `acctStatementDirection` | `acctStatementDirection` | Integer | 银行对账单余额方向 |
| `enable` | `enable` | Integer | 启用状态 |
| `original` | `original` | Integer | 来源 |
| `dr` | `dr` | Integer | 逻辑删除标记 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 账户名称 |
| `acctname` | `acctname` | String | 开户名 |
| `description` | `description` | String | 备注 |

### timestamp (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `accountOpenDate` | `accountOpenDate` | DateTime | 开户日期 |
| `accountClosureDate` | `accountClosureDate` | DateTime | 销户日期 |
| `creationtime` | `creationtime` | DateTime | 创建时间 |
| `modifiedtime` | `modifiedtime` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `defineCharacter` | `defineCharacter` | aa8b61a0-91c5-4590-8295-7f819f572ad6 | 自定义项特征 |

### other (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | ca2768f5-3665-469a-ac93-5800e4148596 | 企业资金账户币种 |
| `` | `` | ea73a065-fb7f-453d-911a-c333a473ba99 | 企业银行(自定义项)表 |
| `` | `` | 148c1902-064a-4e89-8f2f-7100062322fb | 数币关联银行账户 |
