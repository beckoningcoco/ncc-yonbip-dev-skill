---
tags: [BIP, 元数据, 数据字典, bd.staff.PsnlCatg]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 员工类别 (`bd.staff.PsnlCatg`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_psnl_catg` | domain：`ucf-staff-center` | 应用：`DPMSTF` | 业务对象ID：`efb15607-296f-4b59-bbb8-dadb80e6e9d7`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 员工类别 |
| 物理表 | `bd_psnl_catg` |
| domain/服务域 | `ucf-staff-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMSTF` |
| 直连字段 | 39 个 |
| 子表 | 2 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `countryList` | `bd.staff.PsnlCatgCountry` | composition |
| `defines` | `bd.staff.PsnlCatgDefine` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `` |
| `parentid` | `` |
| `user_define_character` | `` |
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `` | `` |
| `tenantid` | `` |

## 继承接口 (9个, 24字段)

- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **审批信息** (`bd.itf.ISystemInfo`)
  - `dr` → `dr`
  - `enable` → `enable`
  - `sysid` → `sysid`
  - `tenantid` → `tenantid`
  - `ts` → `ts`
- **树型结构** (`basedoc.basedocItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 39 个直连字段

### 文本字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bu_id` | `bu_id` | `bu_id` | 所属业务群 |
| `businessid` | `businessid` | `businessid` | 友企联同步业务主键 |
| `code` | `code` | `code` | 编码 |
| `distribution_site` | `distribution_site` | `distributionSite` | 来源站点 |
| `id` | `id` | `id` | 主键 |
| `innercode` | `innercode` | `innercode` | 内部码 |
| `log` | `log` | `log` | 删除引用日志 |
| `memo` | `memo` | `memo` | 备注 |
| `name2` | `name2` | `name2` | 员工名称备用2 |
| `name3` | `name3` | `name3` | 员工名称备用3 |
| `name4` | `name4` | `name4` | 员工名称备用4 |
| `name5` | `name5` | `name5` | 员工名称备用5 |
| `name6` | `name6` | `name6` | 员工名称备用6 |
| `objid` | `objid` | `objid` | 友企联同步主键 |
| `path` | `path` | `path` | 路径 |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `tenantid` | `tenantid` | `tenantid` | 租户标识 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `country` | `country` | `country` | 国家/地区 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `parentid` | `parentid` | `parent` | 上级类别显示属性 |
| `parentid` | `parentid` | `parentid` | 上级类别 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cltype` | `cltype` | `cltype` | 类型 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |
| `enable` | `enable` | `enable` | 启用状态 |
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `countryList` | 员工类别国家/地区 |
| `` | `` | `defines` | 员工类别自定义项 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 公共时间戳 |
| `synchts` | `synchts` | `synchts` | 友企联同步时间戳 |
| `ts` | `ts` | `ts` | 时间戳 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_define_character` | `user_define_character` | `user_define_character` | 自定义项特征属性 |
