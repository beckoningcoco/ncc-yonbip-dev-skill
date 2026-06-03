---
tags: [BIP, 元数据, 数据字典, GL.GL.glCarryover]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 期末结转 (`GL.GL.glCarryover`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_vt_head` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`d68cf361-89ea-4155-b343-bc7674ae4640`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 期末结转 |
| 物理表 | `fi_vt_head` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 28 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `vouchertype` | `fiepub.epub_vouchertype_ref` |
| `pk_org` | `finbd.bd_allaccbodyref_inner` |
| `accbook` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `rulevouchersort` | `yonbip-fi-egl.RefTable_5db6b63f80` |
| `ytenant_id` | `` |
| `accsubjectchart` | `` |

## 继承接口 (2个, 5字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 28 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `carrytype` | `carrytype` | `carrytype` | 结转方式 |
| `category` | `category` | `category` | 类别 |
| `code` | `code` | `code` | 编码 |
| `description` | `description` | `description` | 描述 |
| `effectperiod` | `effectperiod` | `effectperiod` | 开始期间 |
| `expiryperiod` | `expiryperiod` | `expiryperiod` | 结束期间 |
| `id` | `id` | `id` | 主键 |
| `name` | `name` | `name` | 名称 |
| `template_type` | `template_type` | `templateType` | 模板类别 |
| `vtlevel` | `vtlevel` | `vtlevel` | 模版级别 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook` | `accbook` | `accbook` | 账簿 |
| `accsubjectchart` | `accsubjectchart` | `accsubjectchart` | 科目表 |
| `pk_org` | `pk_org` | `pkOrg` | 会计主体 |
| `rulevouchersort` | `rulevouchersort` | `rulevouchersort` | 规则分类 |
| `vouchertype` | `vouchertype` | `vouchertype` | 凭证类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `effectperiodid` | `effectperiodid` | `effectperiodid` | 开始期间(主键) |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `businesstype` | `businesstype` | `businesstype` | 业务类型 |
| `periodtype` | `periodtype` | `periodtype` | 期间类别 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `currencycarry` | `currencycarry` | `currencycarry` | 币种 |
| `enable` | `enable` | `enable` | 是否可用 |
| `ismachine` | `ismachine` | `ismachine` | 是否机器人 |
| `terminal` | `terminal` | `terminal` | 期末处理 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `ts` | `ts` | `pubts` | pubts |
