---
tags: [BIP, 元数据, 数据字典, bd.costcenter.CostCenter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成本中心基本档案 (`bd.costcenter.CostCenter`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_costcenter` | domain：`finbd` | 应用：`DPMACCT` | 业务对象ID：`2d00c294-59f0-4f9e-a2a5-c4b37d67712c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成本中心基本档案 |
| 物理表 | `bd_costcenter` |
| 数据库 schema | `finbd` |
| 所属应用 | `DPMACCT` |
| 直连字段 | 47 个 |
| 子表 | 5 个 |
| 关联引用 | 20 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `factorScopes` | `bd.costcenter.FactorScope` | composition |
| `CostCenter_extend26List` | `bd.costcenter.CostCenter_extend26` | composition |
| `accentities` | `bd.costcenter.CostCenterAccentity` | composition |
| `relations` | `bd.costcenter.ContrastRelation` | composition |
| `dis` | `bd.costcenter.CostCenterDis` | composition |

## 关联引用 (20个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `` |
| `cc_class` | `bd_costcenterclassref` |
| `manager` | `ucf-staff-center.bd_staff_ref` |
| `` | `` |
| `virtually` | `` |
| `ytenant_id` | `` |
| `org_unit` | `ucf-org-center.org_pure_tree_ref` |
| `extend26fieldName` | `bip-usercenter.bip_user_ref` |
| `factor_scope` | `` |
| `profit_center` | `finbd.bd_allaccbodyref` |
| `accentity` | `finbd.bd_allaccbodyref` |
| `cost_center_character` | `` |
| `related_admin_org` | `` |
| `tenant_id` | `` |

## 继承接口 (6个, 18字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``

## 字段列表（按类型分组）

> 共 47 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 成本中心编码 |
| `log` | `log` | `log` | 引用校验失败日志 |
| `log_detail` | `log_detail` | `logDetail` | 引用详情 |
| `log_error` | `log_error` | `logError` | 引用检查出错信息 |
| `obj_id` | `obj_id` | `objid` | NCC数据ID |
| `task_id` | `task_id` | `taskId` | 任务id(引用校验检查) |
| `description` | `description` | `description` | 备注 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `path` | `path` | `path` | 路径 |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `factor_scope` | `factor_scope` | `factorScope` | 要素范围 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `cc_class` | `cc_class` | `ccClass` | 成本中心类别 |
| `manager` | `manager` | `manager` | 负责人 |
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `org_unit` | `org_unit` | `orgUnit` | 所属业务单元 |
| `profit_center` | `profit_center` | `profitCenter` | 利润中心 |
| `parent_id` | `parent_id` | `parent` | 父级成本中心 |
| `related_admin_org` | `related_admin_org` | `relatedAdminOrg` | 关联行政组织 |
| `virtually` | `virtually` | `virtually` | 虚拟 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_default` | `is_default` | `isDefault` | 默认成本中心 |
| `effect` | `effect` | `effect` | 生效 |
| `` | `isEnd` | `isEnd` | 是否末级 |
| `share_accentity` | `share_accentity` | `shareAccentity` | 是否共享会计主体 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `log_dr` | `log_dr` | `logDr` | 删除操作状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### quoteList (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `extend26fieldName` | `extend26fieldName` | `extend26` | BIP用户 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 成本中心名称 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enabledate` | `enabledate` | `enableDate` | 生效日期 |
| `expiredate` | `expiredate` | `expireDate` | 失效日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cost_center_character` | `cost_center_character` | `character` | 特征 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `CostCenter_extend26List` |  |
| `` | `` | `accentities` | 共享会计主体 |
| `` | `` | `dis` | 成本中心组织信息 |
| `` | `` | `factorScopes` | 要素范围 |
| `` | `` | `relations` | 对照关系 |
