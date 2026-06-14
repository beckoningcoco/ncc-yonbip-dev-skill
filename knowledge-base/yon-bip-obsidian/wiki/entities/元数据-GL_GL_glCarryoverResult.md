---
tags: [BIP, 元数据, 数据字典, GL.GL.glCarryoverResult]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 期末结转报告 (`GL.GL.glCarryoverResult`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_carryover_result` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`250e6875-e6c1-45ea-a268-c64cb9b41287`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 期末结转报告 |
| 物理表 | `gl_carryover_result` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 19 个 |
| 子表 | 0 个 |
| 关联引用 | 1 个 |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `pk_org` | `pk_org` | `pkOrg` | 主组织 |
| `accbook_id` | `accbook_id` | `accbookId` | 账簿 |
| `periodunion` | `periodunion` | `periodunion` | 期间 |
| `rule_id` | `rule_id` | `ruleId` | 规则凭证定义 |
| `rule_name` | `rule_name` | `ruleName` | 规则凭证定义名称 |
| `exestatus` | `exestatus` | `exeStatus` | 执行状态 |
| `exeresult` | `exeresult` | `exeResult` | 执行结果 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `ytenant_id` | `ytenant_id` | `ytenant_id` | 租户ID |
| `creator` | `creator` | `creator` | 创建人 |
| `creationtime` | `creationtime` | `creationTime` | 创建时间 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `modifiedtime` | `modifiedtime` | `modifiedTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | pubts |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
