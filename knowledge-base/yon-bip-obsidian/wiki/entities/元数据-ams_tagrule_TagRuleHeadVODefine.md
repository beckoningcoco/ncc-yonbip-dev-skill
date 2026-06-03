---
tags: [BIP, 元数据, 数据字典, ams.tagrule.TagRuleHeadVODefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 条码规则自定义项 (`ams.tagrule.TagRuleHeadVODefine`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_tagrule_define` | domain：`ucf-amc-aim` | 应用：`AMS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 条码规则自定义项 |
| 物理表 | `pam_tagrule_define` |
| 数据库 schema | `ucf-amc-aim` |
| 所属应用 | `AMS` |
| 直连字段 | 66 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `id` | `` |
| `tenantid` | `` |

## 继承接口 (4个, 63字段)

- **自由自定义项(过期)** (`ucfbase.ucfbaseItf.CustomItem`)
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 66 个直连字段

### 文本字段 (61个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `define1` | `define1` | 自定义项1 |
| `` | `define10` | `define10` | 自定义项10 |
| `` | `define11` | `define11` | 自定义项11 |
| `` | `define12` | `define12` | 自定义项12 |
| `` | `define13` | `define13` | 自定义项13 |
| `` | `define14` | `define14` | 自定义项14 |
| `` | `define15` | `define15` | 自定义项15 |
| `` | `define16` | `define16` | 自定义项16 |
| `` | `define17` | `define17` | 自定义项17 |
| `` | `define18` | `define18` | 自定义项18 |
| `` | `define19` | `define19` | 自定义项19 |
| `` | `define2` | `define2` | 自定义项2 |
| `` | `define20` | `define20` | 自定义项20 |
| `` | `define21` | `define21` | 自定义项21 |
| `` | `define22` | `define22` | 自定义项22 |
| `` | `define23` | `define23` | 自定义项23 |
| `` | `define24` | `define24` | 自定义项24 |
| `` | `define25` | `define25` | 自定义项25 |
| `` | `define26` | `define26` | 自定义项26 |
| `` | `define27` | `define27` | 自定义项27 |
| `` | `define28` | `define28` | 自定义项28 |
| `` | `define29` | `define29` | 自定义项29 |
| `` | `define3` | `define3` | 自定义项3 |
| `` | `define30` | `define30` | 自定义项30 |
| `` | `define31` | `define31` | 自定义项31 |
| `` | `define32` | `define32` | 自定义项32 |
| `` | `define33` | `define33` | 自定义项33 |
| `` | `define34` | `define34` | 自定义项34 |
| `` | `define35` | `define35` | 自定义项35 |
| `` | `define36` | `define36` | 自定义项36 |
| `` | `define37` | `define37` | 自定义项37 |
| `` | `define38` | `define38` | 自定义项38 |
| `` | `define39` | `define39` | 自定义项39 |
| `` | `define4` | `define4` | 自定义项4 |
| `` | `define40` | `define40` | 自定义项40 |
| `` | `define41` | `define41` | 自定义项41 |
| `` | `define42` | `define42` | 自定义项42 |
| `` | `define43` | `define43` | 自定义项43 |
| `` | `define44` | `define44` | 自定义项44 |
| `` | `define45` | `define45` | 自定义项45 |
| `` | `define46` | `define46` | 自定义项46 |
| `` | `define47` | `define47` | 自定义项47 |
| `` | `define48` | `define48` | 自定义项48 |
| `` | `define49` | `define49` | 自定义项49 |
| `` | `define5` | `define5` | 自定义项5 |
| `` | `define50` | `define50` | 自定义项50 |
| `` | `define51` | `define51` | 自定义项51 |
| `` | `define52` | `define52` | 自定义项52 |
| `` | `define53` | `define53` | 自定义项53 |
| `` | `define54` | `define54` | 自定义项54 |
| `` | `define55` | `define55` | 自定义项55 |
| `` | `define56` | `define56` | 自定义项56 |
| `` | `define57` | `define57` | 自定义项57 |
| `` | `define58` | `define58` | 自定义项58 |
| `` | `define59` | `define59` | 自定义项59 |
| `` | `define6` | `define6` | 自定义项6 |
| `` | `define60` | `define60` | 自定义项60 |
| `` | `define7` | `define7` | 自定义项7 |
| `` | `define8` | `define8` | 自定义项8 |
| `` | `define9` | `define9` | 自定义项9 |
| `sysid` | `sysid` | `sysid` | 应用标识 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 条码规则ID |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
