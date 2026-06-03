---
tags: [BIP, 元数据, 数据字典, znbzbx.intransexpwithholding.InTransExpWithHoldingBusiVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务数据 (`znbzbx.intransexpwithholding.InTransExpWithHoldingBusiVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_intransexpwithholding_busi` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务数据 |
| 物理表 | `znbz_intransexpwithholding_busi` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 62 个 |
| 子表 | 1 个 |
| 关联引用 | 11 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `InTransExpWithHoldingBusiUserdefVO` | `znbzbx.intransexpwithholding.InTransExpWithHoldingBusiUserdefVO` | composition |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `auditorId` | `aa_user` |
| `cfinaceorg` | `ucf-org-center.org_unit_tree_ref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `ytenant_id` | `` |
| `` | `` |
| `pk_intransexpwithholding` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_admindepttreeviewref` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |
| `bustype` | `bd_billtyperef` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 62 个直连字段

### 文本字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |
| `code` | `code` | `code` | 单据编号 |
| `vreason` | `vreason` | `vreason` | 事由 |
| `vdef1` | `vdef1` | `vdef1` | 自定义项1 |
| `vdef2` | `vdef2` | `vdef2` | 自定义项2 |
| `vdef3` | `vdef3` | `vdef3` | 自定义项3 |
| `vdef4` | `vdef4` | `vdef4` | 自定义项4 |
| `vdef5` | `vdef5` | `vdef5` | 自定义项5 |
| `vdef6` | `vdef6` | `vdef6` | 自定义项6 |
| `vdef7` | `vdef7` | `vdef7` | 自定义项7 |
| `vdef8` | `vdef8` | `vdef8` | 自定义项8 |
| `vdef9` | `vdef9` | `vdef9` | 自定义项9 |
| `vdef10` | `vdef10` | `vdef10` | 自定义项10 |
| `vdef11` | `vdef11` | `vdef11` | 自定义项11 |
| `vdef12` | `vdef12` | `vdef12` | 自定义项12 |
| `vdef13` | `vdef13` | `vdef13` | 自定义项13 |
| `vdef14` | `vdef14` | `vdef14` | 自定义项14 |
| `vdef15` | `vdef15` | `vdef15` | 自定义项15 |
| `vdef16` | `vdef16` | `vdef16` | 自定义项16 |
| `vdef17` | `vdef17` | `vdef17` | 自定义项17 |
| `vdef18` | `vdef18` | `vdef18` | 自定义项18 |
| `vdef19` | `vdef19` | `vdef19` | 自定义项19 |
| `vdef20` | `vdef20` | `vdef20` | 自定义项20 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_intransexpwithholding` | `pk_intransexpwithholding` | `pk_intransexpwithholding` | 费用预算处理主表id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 经办人 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织 |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门 |
| `vcurrency` | `vcurrency` | `vcurrency` | 原币币种 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `auditorId` | `auditorId` | `auditorId` | 审批人 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vouchdate` | `vouchdate` | `vouchdate` | 单据日期 |
| `auditDate` | `auditDate` | `auditDate` | 审批日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ismulticurrency` | `ismulticurrency` | `ismulticurrency` | 是否多币种 |
| `isaddrow` | `isaddrow` | `isaddrow` | 是否手工增行 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imakebilltype` | `imakebilltype` | `imakebilltype` | 单据生成方式 |
| `sourcebill_body` | `sourcebill_body` | `sourcebill_body` | 源单关联表体 |
| `datavalid` | `datavalid` | `datavalid` | 数据有效性 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `status` | `status` | `status` | 单据状态 |
| `isettlestatus` | `isettlestatus` | `isettlestatus` | 结算状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `pk_sourcebill` | `pk_sourcebill` | `pk_sourcebill` | 源单单据id |

### 数值字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nlineno` | `nlineno` | `nlineno` | 行号 |
| `nbillmny` | `nbillmny` | `nbillmny` | 金额 |
| `nwithholdingmny` | `nwithholdingmny` | `nwithholdingmny` | 可预提金额 |
| `nnatbillmny` | `nnatbillmny` | `nnatbillmny` | 金额-本币 |
| `nnatwithholdingmny` | `nnatwithholdingmny` | `nnatwithholdingmny` | 可预提金额-本币 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |
| `ndefnum6` | `ndefnum6` | `ndefnum6` | 自定义项(小数)6 |
| `ndefnum7` | `ndefnum7` | `ndefnum7` | 自定义项(小数)7 |
| `ndefnum8` | `ndefnum8` | `ndefnum8` | 自定义项(小数)8 |
| `ndefnum9` | `ndefnum9` | `ndefnum9` | 自定义项(小数)9 |
| `ndefnum10` | `ndefnum10` | `ndefnum10` | 自定义项(小数)10 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `createTime` | `createTime` | `createTime` | 创建时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `InTransExpWithHoldingBusiUserdefVO` | 业务数据（自定义项）表 |
