---
tags: [BIP, 元数据, 数据字典, GL.rulevoucher.fiVtLink]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 规则凭证生成凭证关联表 (`GL.rulevoucher.fiVtLink`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_vt_link` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`7b4c8f89-c22b-45b7-beca-0834bdafea6a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 规则凭证生成凭证关联表 |
| 物理表 | `fi_vt_link` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `accbody` | `` |
| `vtid` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `pk_group` | `pk_group` | `pkGroup` | 集团 |
| `accbook` | `accbook` | `accbook` | 账簿 |
| `period` | `period` | `period` | 会计期间 |
| `voucherid` | `voucherid` | `voucherid` | 凭证id |
| `description` | `description` | `description` | 描述 |
| `template_type` | `template_type` | `templateType` | 模板类型 |
| `srctplid` | `srctplid` | `srctplid` | 基准库ID |
| `pk_org` | `pk_org` | `pkOrg` | 会计主体id |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `tenantid` | `tenantid` | `tenantid` | 租户id |
| `ts` | `ts` | `ts` | 最新修改时间 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbody` | `accbody` | `accbody` | 会计主体 |
| `vtid` | `vtid` | `vtid` | 模板id |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billcode` | `billcode` | `billcode` | 凭证号 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `debit_org` | `debit_org` | `debitOrg` | 借方本币_账簿 |
