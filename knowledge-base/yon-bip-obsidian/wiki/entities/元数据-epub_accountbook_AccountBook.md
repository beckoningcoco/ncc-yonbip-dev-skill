---
tags: [BIP, 元数据, 数据字典, epub.accountbook.AccountBook]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 账簿 (`epub.accountbook.AccountBook`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_accountbook` | domain：`fiepub` | 应用：`FP` | 业务对象ID：`83d4ba02-2843-4eec-98a9-28733c5f1447`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 账簿 |
| 物理表 | `epub_accountbook` |
| domain/服务域 | `fiepub` |
| schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 64 个 |
| 关联引用 | 35 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `accountBookPCM` | `epub.accountbook.AccountBookPCM` | composition |
| `accountBookIA` | `epub.accountbook.AccountBookIA` | composition |
| `svcregistration` | `epub.accountbook.Svcregistration` | composition |
| `secondAccEntity` | `epub.accountbook.SecondAccEntity` | composition |
| `accountBookAP` | `epub.accountbook.AccountBookAP` | composition |
| `accountBookRA` | `epub.accountbook.AccountBookRA` | composition |
| `multiLevelAccounting` | `epub.accountbook.multiLevelAccounting` | composition |
| `accountBookSC` | `epub.accountbook.AccountBookSC` | composition |
| `accountBookAR` | `epub.accountbook.AccountBookAR` | composition |
| `accountBookCM` | `epub.accountbook.AccountBookCM` | composition |
| `accountBookIS` | `epub.accountbook.AccountBookIS` | composition |
| `accountBookPRC` | `epub.accountbook.AccountBookPRC` | composition |
| `accountBookRVN` | `epub.accountbook.AccountBookRVN` | composition |
| `accountBookCE` | `epub.accountbook.AccountBookCE` | composition |
| `accountBookGL` | `epub.accountbook.AccountBookGL` | composition |
| `accountBookCC` | `epub.accountbook.AccountBookCC` | composition |
| `accountBookFA` | `epub.accountbook.AccountBookFA` | composition |

## 关联引用 (35个)

| 字段名 | 引用类型 |
|--------|---------|
| `controlscope` | `finbd.bd_controlscoperef` |
| `accpurpose` | `finbd.bd_accpurposeref` |
| `creatorId` | `` |
| `modifierId` | `` |
| `` | `` |
| `profitlossratetype` | `ucfbasedoc.bd_enclouddef_exchangerateref` |
| `accentity` | `finbd.bd_allaccbodyref_all` |
| `character` | `` |
| `accperiodscheme` | `finbd.bd_accperiodscheme` |
| `accountelement` | `` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `costelementtable` | `` |
| `tenant_id` | `` |
| `ratetype` | `ucfbasedoc.bd_enclouddef_exchangerateref` |
| `ytenant_id` | `` |
| `accountbooktype` | `fiepub_accountbooktypelistref` |
| `cashflowtype` | `fiepub_cashflowtyperef` |
| `accstandard` | `epub_accstandard_ref` |
| `accsubjectchart` | `epub_accsubjectchartref` |

## 继承接口 (4个, 12字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 64 个直连字段

### 文本字段 (16个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `accountingclassifi` | `accountingclassifi` | String | 账簿分类 |
| `accountbookattributes` | `accountbookattributes` | String | 账簿属性 |
| `description` | `description` | String | 描述 |
| `currencyreducedparam` | `currencyreducedparam` | String | 币种折算参数 |
| `exchangeratescheme` | `exchangeratescheme` | String | 默认汇率方案 |
| `auxShow` | `auxShow` | String | 辅助核算项显示参数 |
| `sysid` | `sysid` | String | 来源主键 |
| `objid` | `objid` | String | 友企连id |
| `code` | `code` | String | 账簿编码 |
| `creator` | `creator` | String | 创建人名称 |
| `id` | `id` | String | ID |
| `modifier` | `modifier` | String | 修改人名称 |
| `status` | `status` | String | 账簿状态 |
| `parent` | `parent` | String | 父级账簿ID |
| `path` | `path` | String | 参照路径 |
| `tree_select` | `tree_select` | String | 参照标识 |

### 引用字段 (17个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `accpurpose` | `accpurpose` | 637f4637-0862-4167-a2bf-ef52818ca9d9 | 核算目的id |
| `controlscope` | `controlscope` | b382fbab-2ecb-4733-bdb3-a6d3b81bf726 | 管控范围 |
| `accentity` | `accentity` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | 会计主体 |
| `accountbooktype` | `accountbooktype` | 9e073034-63ae-4aba-a113-1b28396f35e6 | 账簿类型id |
| `accsubjectchart` | `accsubjectchart` | 85ed5168-72ae-41c2-a5a5-51f3fc7b1bc0 | 科目表id |
| `accountelement` | `accountelement` | 85ed5168-72ae-41c2-a5a5-51f3fc7b1bc0 | 成本要素表 |
| `costelementtable` | `costelementtable` | b56c7f52-183c-4cea-a310-d6ee902365af | 要素表 |
| `accperiodscheme` | `accperiodscheme` | e7bb3d2b-b288-4696-b5f0-a9b0626cded8 | 会计期间方案id |
| `accstandard` | `accstandard` | f3f400fa-fb8d-43a6-8763-580b7dadcc60 | 会计准则id |
| `cashflowtype` | `cashflowtype` | 3be4c758-4392-492a-8707-592ec2e5617f | 现金流量类型id |
| `ratetype` | `ratetype` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | 汇率类型 |
| `profitlossratetype` | `profitlossratetype` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | 汇兑损益汇率类型 |
| `creatorId` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `currency` | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 本位币id |
| `modifierId` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `createDate` | `createDate` | Date | 创建日期 |
| `modifyDate` | `modifyDate` | Date | 修改日期 |
| `pubts` | `pubts` | Date | 时间戳 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `secondaryvoucher` | `secondaryvoucher` | Boolean | 辅凭证 |
| `issecond` | `issecond` | Boolean | 启用二级核算 |
| `systemgene` | `systemgene` | Boolean | 是否系统自动生成 |
| `stopstatus` | `stopstatus` | Boolean | 启用状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `sortnum` | `sortnum` | Long | 排序码 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `shortname` | `shortname` | String | 账簿简称 |
| `name` | `name` | String | 账簿名称 |

### timestamp (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `createTime` | `createTime` | DateTime | 创建时间 |
| `modifyTime` | `modifyTime` | DateTime | 修改时间 |
| `stop_time` | `stop_time` | DateTime | 停用时间 |

### other (17个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | 63725979-97c9-4f95-9a7a-a78b9740e7a1 | 应付管理模块子表 |
| `` | `` | 780968a0-4142-4de4-b3f8-2b2d6daf2569 | 应收管理模块子表 |
| `` | `` | 2da6292a-a05f-430a-8bc1-60f79004e245 | 成本中心模块子表 |
| `` | `` | 9ad9c513-d66f-4d81-b053-a8af51280fae | 成本估算模块子表 |
| `` | `` | 17b33dbb-0493-42ab-95b8-1cdb22d2a0df | 现金管理模块子表 |
| `` | `` | 8818bcfd-4ab2-4440-8752-aba0be30e972 | 固定资产模块子表 |
| `` | `` | 767f7e45-7917-4bb8-94ec-83b7d3c555f9 | 总账模块子表 |
| `` | `` | 0793446f-c654-407a-812a-737dea5b4046 | 存货核算模块子表 |
| `` | `` | 9d10611c-1ce2-465a-aa72-dfd136ff72b7 | 内部结算模块子表 |
| `` | `` | 29f462ec-06f5-4a24-b254-718d559c3617 | 产品成本模块子表 |
| `` | `` | 9f708666-af2e-4f8b-b947-13a0c149b8a6 | 项目成本模块子表 |
| `` | `` | 5df5cf5e-c394-4c72-b2d3-99a51251bf22 | 责任会计模块子表 |
| `` | `` | 85de1cf3-7e57-45c4-8915-e6d06c890cf0 | 收入管理模块子表 |
| `` | `` | e88648e1-430f-42a4-9ca7-d6b6e960ade0 | 专项成本模块子表 |
| `` | `` | e4c42f7a-1265-4366-8b12-a74026337745 | 多级核算 |
| `` | `` | e0e4a302-5388-4a09-9d40-ec72dfc7aea1 | 二级核算会计主体 |
| `` | `` | e33fbb68-21e5-4682-bd2c-69d1579ae2c8 | 账簿服务注册中间表 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `character` | `character` | fae6ee6b-b717-4b13-99d4-0ac0f77c0743 | 账簿特征属性 |
