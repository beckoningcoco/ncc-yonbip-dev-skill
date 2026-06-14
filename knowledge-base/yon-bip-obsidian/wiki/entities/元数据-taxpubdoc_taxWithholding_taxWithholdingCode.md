---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxWithholding.taxWithholdingCode]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 代扣税税码 (`taxpubdoc.taxWithholding.taxWithholdingCode`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tax_withholding_code` | domain：`yonbip-fi-taxpubdoc` | 应用：`DPMTAX` | 业务对象ID：`2b481747-da02-451e-8a22-c0a7e0785ac4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 代扣税税码 |
| 物理表 | `tax_withholding_code` |
| domain/服务域 | `yonbip-fi-taxpubdoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMTAX` |
| 直连字段 | 21 个 |
| 子表 | 2 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `taxWithholdingScopeList` | `taxpubdoc.taxWithholding.taxWithholdingScope` | composition |
| `taxWithholdingCodeSubList` | `taxpubdoc.taxWithholding.taxWithholdingCodeSub` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `country_id` | `ucfbasedoc.bd_countryref` |

## 继承接口 (4个, 9字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr_flag` | `dr_flag` | `drFlag` | 唯一索引的字段 |
| `id` | `id` | `id` | 主键 |
| `task_id` | `task_id` | `taskId` | 删除引用校验任务id |
| `tax_code` | `tax_code` | `taxCode` | 代扣税税码 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `country_id` | `country_id` | `countryId` | 国家地区 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `del_flag` | `del_flag` | `delFlag` | 自定义删除标记 |
| `enable` | `enable` | `enable` | 档案状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `log` | `log` | `log` | 操作日志 |

### multipleOption (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tax_calculate_point` | `tax_calculate_point` | `taxCalculatePoint` | 计税时点 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tax_code_description` | `tax_code_description` | `taxCodeDescription` | 税码描述 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `taxWithholdingCodeSubList` | 代扣税税码子表(代扣税组合) |
| `` | `` | `taxWithholdingScopeList` | 适用范围 |
