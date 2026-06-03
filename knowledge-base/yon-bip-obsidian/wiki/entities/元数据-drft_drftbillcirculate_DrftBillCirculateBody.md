---
tags: [BIP, 元数据, 数据字典, drft.drftbillcirculate.DrftBillCirculateBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 票据流转信息子表 (`drft.drftbillcirculate.DrftBillCirculateBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`drft_billcirculatebody` | domain：`drft` | 应用：`DRFT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 票据流转信息子表 |
| 物理表 | `drft_billcirculatebody` |
| 数据库 schema | `drft` |
| 所属应用 | `DRFT` |
| 直连字段 | 29 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `mainid` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 29 个直连字段

### 文本字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `businesstype` | `businesstype` | `businesstype` | 流转类别 |
| `isendofieldname` | `isendofieldname` | `isendofieldname` | 不得转让标记 |
| `signflag` | `signflag` | `signflag` | 应答标识 |
| `rejectreason` | `rejectreason` | `rejectreason` | 拒付理由 |
| `signflagfieldname` | `signflagfieldname` | `signflagfieldname` | 应答标识名称 |
| `rejectreasonfieldname` | `rejectreasonfieldname` | `rejectreasonfieldname` | 拒付理由名称 |
| `applydatefiled` | `applydatefiled` | `applydatefiled` | 申请日期名称 |
| `ensureaddressfiled` | `ensureaddressfiled` | `ensureaddressfiled` | 保证人地址名称 |
| `recoursetype` | `recoursetype` | `recoursetype` | 追索类型名称 |
| `propsracctid` | `propsracctid` | `propsracctid` | 申请人账户 |
| `propsrname` | `propsrname` | `propsrname` | 申请人户名 |
| `frombankno` | `frombankno` | `frombankno` | 申请人开户行号 |
| `fromorgcode` | `fromorgcode` | `fromorgcode` | 申请人开户行组织结构代码 |
| `rcvrracctid` | `rcvrracctid` | `rcvrracctid` | 接收人账户 |
| `rcvrrname` | `rcvrrname` | `rcvrrname` | 接收人户名 |
| `tobankno` | `tobankno` | `tobankno` | 接收人开户行号 |
| `toorgcode` | `toorgcode` | `toorgcode` | 接收人开户行组织结构代码 |
| `propsrfieldname` | `propsrfieldname` | `propsrfieldname` | 出票人/背书人名称 |
| `rcvrrfieldname` | `rcvrrfieldname` | `rcvrrfieldname` | 承兑人/收款人/被背书人名称 |
| `signdatefiled` | `signdatefiled` | `signdatefiled` | 承兑/出票/背书日期 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 卡片主表关联标识 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `appdate` | `appdate` | `appdate` | 申请日期 |
| `signdate` | `signdate` | `signdate` | 签收日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `transflag` | `transflag` | `transflag` | 可否转让标识 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
