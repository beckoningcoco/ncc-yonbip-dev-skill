---
tags: [BIP, 元数据, 数据字典, GL.rulevoucher.fiRulevoucherSort]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 规则凭证类型 (`GL.rulevoucher.fiRulevoucherSort`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_rulevoucher_sort` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`548b25fc-b250-40ca-8799-adfa539ed23b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 规则凭证类型 |
| 物理表 | `fi_rulevoucher_sort` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 59 个 |
| 子表 | 1 个 |
| 关联引用 | 4 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `fiVtHeadList` | `GL.rulevoucher.fiVtHead` | composition |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `modifier` | `` |
| `` | `` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 59 个直连字段

### 文本字段 (53个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_group` | `pk_group` | `pkGroup` | 集团 |
| `pk_org` | `pk_org` | `pkOrg` | 组织 |
| `id` | `id` | `id` | 主键 |
| `classifyid` | `classifyid` | `classifyid` | 分类id |
| `code` | `code` | `code` | 编码 |
| `name` | `name` | `name` | 名称 |
| `name6` | `name6` | `name6` | 规则凭证分类名称多语扩展列6 |
| `name5` | `name5` | `name5` | 规则凭证分类名称多语扩展列5 |
| `name4` | `name4` | `name4` | 规则凭证分类名称多语扩展列4 |
| `name3` | `name3` | `name3` | 规则凭证分类名称多语扩展列3 |
| `name2` | `name2` | `name2` | 规则凭证分类名称多语扩展列2 |
| `description` | `description` | `description` | 描述 |
| `description2` | `description2` | `description2` | 描述多语 |
| `description3` | `description3` | `description3` | 描述多语 |
| `description4` | `description4` | `description4` | 描述多语 |
| `description5` | `description5` | `description5` | 描述多语 |
| `description6` | `description6` | `description6` | 描述多语 |
| `def1` | `def1` | `def1` | 自定义项1 |
| `def2` | `def2` | `def2` | 自定义项2 |
| `def3` | `def3` | `def3` | 自定义项3 |
| `def4` | `def4` | `def4` | 自定义项4 |
| `def5` | `def5` | `def5` | 自定义项5 |
| `def6` | `def6` | `def6` | 自定义项6 |
| `def7` | `def7` | `def7` | 自定义项7 |
| `def8` | `def8` | `def8` | 自定义项8 |
| `def9` | `def9` | `def9` | 自定义项9 |
| `def10` | `def10` | `def10` | 自定义项10 |
| `def11` | `def11` | `def11` | 自定义项11 |
| `def12` | `def12` | `def12` | 自定义项12 |
| `def13` | `def13` | `def13` | 自定义项13 |
| `def14` | `def14` | `def14` | 自定义项14 |
| `def15` | `def15` | `def15` | 自定义项15 |
| `def16` | `def16` | `def16` | 自定义项16 |
| `def17` | `def17` | `def17` | 自定义项17 |
| `def18` | `def18` | `def18` | 自定义项18 |
| `def19` | `def19` | `def19` | 自定义项19 |
| `def20` | `def20` | `def20` | 自定义项20 |
| `def21` | `def21` | `def21` | 自定义项21 |
| `def22` | `def22` | `def22` | 自定义项22 |
| `def23` | `def23` | `def23` | 自定义项23 |
| `def24` | `def24` | `def24` | 自定义项24 |
| `def25` | `def25` | `def25` | 自定义项25 |
| `def26` | `def26` | `def26` | 自定义项26 |
| `def27` | `def27` | `def27` | 自定义项27 |
| `def28` | `def28` | `def28` | 自定义项28 |
| `def29` | `def29` | `def29` | 自定义项29 |
| `def30` | `def30` | `def30` | 自定义项30 |
| `parentid` | `parentid` | `parentid` | 父id |
| `srctplid` | `srctplid` | `srctplid` | 来源id |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
| `ts` | `ts` | `ts` | 最新修改时间 |
| `tenantid` | `tenantid` | `tenantid` | 租户id |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 是否启用标识 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `fiVtHeadList` | 规则凭证主表 |
