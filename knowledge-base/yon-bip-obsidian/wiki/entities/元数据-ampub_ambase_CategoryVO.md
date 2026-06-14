---
tags: [BIP, 元数据, 数据字典, ampub.ambase.CategoryVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资产类别 (`ampub.ambase.CategoryVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_category` | domain：`ucf-amc-ambd` | 应用：`AMBD` | 业务对象ID：`3c9a78c4-1559-4380-a603-1880c9cd73a3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资产类别 |
| 物理表 | `pam_category` |
| domain/服务域 | `ucf-amc-ambd` |
| schema | `amc_ambd` |
| 所属应用 | `AMBD` |
| 直连字段 | 47 个 |
| 子表 | 5 个 |
| 关联引用 | 13 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `lineparam` | `ampub.ambase.LineParamVO` | composition |
| `keyparts` | `ampub.ambase.KeyPartsVO` | composition |
| `bodyvos` | `ampub.ambase.CateParamVO` | composition |
| `attachgroup` | `ampub.ambase.AttachGroupVO` | composition |
| `defines` | `ampub.ambase.CategoryVODefine` | composition |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `parent_id` | `` |
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `user_defines` | `` |
| `pk_sealer` | `` |
| `fk_parent` | `` |
| `tenantid` | `` |

## 继承接口 (8个, 18字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **树型结构** (`baseapp.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **审计信息** (`baseapp.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **ERP来源信息** (`baseapp.itf.IErpInfo`)
  - `erpcode` → `erpcode`
  - `erpid` → `erpid`
  - `gatewayid` → `gatewayid`
- **停启用状态** (`baseapp.itf.IEnableState`)
  - `enablestate` → `enablestate`
  - `pk_sealer` → `pk_sealer`
  - `seal_time` → `seal_time`
- **自动编码** (`baseapp.itf.IAutoCode`)
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 47 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `category_code` | `category_code` | `category_code` | 资产类别编码 |
| `memo` | `memo` | `memo` | 备注 |
| `pk_org` | `pk_org` | `pk_org` | 资产组织 |
| `innercode` | `innercode` | `innercode` | 内部编码 |
| `max_inner_code` | `max_inner_code` | `max_inner_code` | 最大内部编码 |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `transi_type` | `transi_type` | `transi_type` | 交易类型 |
| `id` | `id` | `id` | 资产类别主键 |
| `path` | `path` | `path` | 路径 |
| `gatewayid` | `gatewayid` | `gatewayid` | 网关主键 |
| `erpcode` | `erpcode` | `erpcode` | erp系统编码 |
| `erpid` | `erpid` | `erpid` | erp系统主键 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fk_parent` | `fk_parent` | `fk_parent` | 父类别主键 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 最后修改人 |
| `pk_sealer` | `pk_sealer` | `pk_sealer` | 启用人 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `parent_id` | `parent_id` | `parent` | 上级分类 |

### 布尔字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `special_flag` | `special_flag` | `special_flag` | 特种设备 |
| `line_category` | `line_category` | `line_category` | 线性类别 |
| `associate_fa_flag` | `associate_fa_flag` | `associate_fa_flag` | 固定资产核算 |
| `portrait_flag` | `portrait_flag` | `portrait_flag` | 资产画像 |
| `cooperate_flag` | `cooperate_flag` | `cooperate_flag` | 协同管理 |
| `name_pre_flag` | `name_pre_flag` | `name_pre_flag` | 下级名称继承标志 |
| `inv_flag` | `inv_flag` | `inv_flag` | 是否库存管理标记 |
| `` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `avg_use_life` | `avg_use_life` | `avg_use_life` | 平均使用寿命(月) |
| `design_life` | `design_life` | `design_life` | 设计寿命(月) |
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sync_status` | `sync_status` | `sync_status` | 同步状态 |
| `enablestate` | `enablestate` | `enablestate` | 启用状态 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |
| `asset_business` | `asset_business` | `assetBusiness` | 资产业务分类 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `category_name` | `category_name` | `category_name` | 资产类别名称 |
| `category_global` | `category_global` | `category_global` | 全级次资产类别 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 最后修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `seal_time` | `seal_time` | `seal_time` | 启用时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_defines` | `user_defines` | `userDefines` | 资产类别自定义项 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `attachgroup` | 资产类别附件分组 |
| `` | `` | `bodyvos` | 资产类别技术参数 |
| `` | `` | `defines` | 资产类别自定义项 |
| `` | `` | `keyparts` | 资产部位 |
| `` | `` | `lineparam` | 线性参数 |
