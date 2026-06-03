---
tags: [BIP, 元数据, 数据字典, GL.rulevoucher.fiRulevoucherDistribute]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 规则凭证共享关系表 (`GL.rulevoucher.fiRulevoucherDistribute`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_rulevoucher_distribute` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`7b4c8f89-c22b-45b7-beca-0834bdafea6a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 规则凭证共享关系表 |
| 物理表 | `fi_rulevoucher_distribute` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 17 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `rulevoucherid` | `` |
| `pk_org` | `` |
| `accbook` | `` |
| `modifier` | `` |
| `rulevouchersort` | `` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 17 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_group` | `pk_group` | `pkGroup` | 集团 |
| `description` | `description` | `description` | 描述 |
| `id` | `id` | `id` | 规则凭证共享关系表id |
| `ts` | `ts` | `ts` | 最新修改时间 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
| `srctplid` | `srctplid` | `srctplid` | 来源id |
| `tenantid` | `tenantid` | `tenantid` | 租户id |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_org` | `pk_org` | `pkOrg` | 组织 |
| `accbook` | `accbook` | `accbook` | 账簿 |
| `rulevouchersort` | `rulevouchersort` | `rulevouchersort` | 规则凭证分类 |
| `rulevoucherid` | `rulevoucherid` | `rulevoucherid` | 规则凭证id |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 是否启用标识 |
| `dr` | `dr` | `dr` | 逻辑删除 |
