---
tags: [BIP, 元数据, 数据字典, bd.staff.StaffBankAcct]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 员工银行账号 (`bd.staff.StaffBankAcct`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_staff_bankacct` | domain：`ucf-staff-center` | 应用：`DPMSTF` | 业务对象ID：`f38679b1-213d-44f5-ae3d-946f4a7dc562`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 员工银行账号 |
| 物理表 | `bd_staff_bankacct` |
| domain/服务域 | `ucf-staff-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMSTF` |
| 直连字段 | 31 个 |
| 子表 | 1 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bankacctdefines` | `bd.staff.StaffBankAcctDefine` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `user_define_character` | `` |
| `bank` | `ucfbasedoc.bd_bankcard` |
| `creator` | `` |
| `` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `staff_id` | `ucf-staff-center.bd_staff_ref` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `bankname` | `ucfbasedoc.bd_bankdottableref` |
| `tenantid` | `` |

## 继承接口 (7个, 13字段)

- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **审计信息** (`bd.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **审批信息** (`bd.itf.ISystemInfo`)
  - `dr` → `dr`
  - `enable` → `enable`
  - `sysid` → `sysid`
  - `tenantid` → `tenantid`
  - `ts` → `ts`
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 31 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accountname` | `accountname` | `accountname` | 户名 |
| `account` | `account` | `account` | 账号 |
| `accttype` | `accttype` | `accttype` | 账号类型 |
| `memo` | `memo` | `memo` | 备注 |
| `id` | `id` | `id` | 主键 |
| `objid` | `objid` | `objid` | 混合云ID |
| `sysid` | `sysid` | `sysid` | 来源系统标识 |
| `businessid` | `businessid` | `businessid` | 友企联同步业务主键 |
| `bu_id` | `bu_id` | `bu_id` | 所属业务群 |
| `modifier` | `modifier` | `lastflag` | 修改人 |
| `tenantid` | `tenantid` | `tenantid` | 租户ID |
| `jsonextattr` | `jsonextattr` | `jsonextattr` | 扩展属性(隐藏) |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bank` | `bank` | `bank` | 银行类别 |
| `bankname` | `bankname` | `bankname` | 开户行 |
| `currency` | `currency` | `currency` | 币种 |
| `staff_id` | `staff_id` | `staff_id` | 员工 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `tenantid` | `tenantid` | `tenant` | 租户ID |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isdefault` | `isdefault` | `isdefault` | 是否首选 |
| `enable` | `enable` | `enable` | 启用状态 |
| `recordnum` | `recordnum` | `recordnum` | 记录序号 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_define_character` | `user_define_character` | `user_define_character` | 特征 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `synchts` | `synchts` | `synchts` | 友企联同步时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `ts` | `ts` | `ts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bankacctdefines` | 员工银行账户自定义项 |
