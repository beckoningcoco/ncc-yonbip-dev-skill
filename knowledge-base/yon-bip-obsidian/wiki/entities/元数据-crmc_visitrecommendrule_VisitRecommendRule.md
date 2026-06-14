---
tags: [BIP, 元数据, 数据字典, crmc.visitrecommendrule.VisitRecommendRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 拜访推荐规则 (`crmc.visitrecommendrule.VisitRecommendRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`crmc_visit_recommend_rule` | domain：`yycrm` | 应用：`CRMC` | 业务对象ID：`babdb1f9-032b-4360-b573-e8177c388abb`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 拜访推荐规则 |
| 物理表 | `crmc_visit_recommend_rule` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `CRMC` |
| 直连字段 | 28 个 |
| 子表 | 5 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `recommendApplyPartners` | `crmc.visitrecommendrule.RecommendApplyPartner` | composition |
| `recommendApplyOrgs` | `crmc.visitrecommendrule.RecommendApplyOrg` | composition |
| `visitRecommendRange` | `crmc.visitrecommendrule.VisitRecommendRange` | composition |
| `recommendTriggerRules` | `crmc.visitrecommendrule.RecommendTriggerRule` | composition |
| `visitRecommendBasis` | `crmc.visitrecommendrule.VisitRecommendBasis` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (5个, 13字段)

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
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 28 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 申请编码 |
| `name` | `name` | `name` | 规则名称 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `memo` | `memo` | `memo` | 备注 |
| `filter_condition` | `filter_condition` | `filterCondition` | 自定义过滤条件 |
| `filter_type` | `filter_type` | `filterType` | 过滤类型 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人ID |
| `` | `modifierId` | `modifierId` | 修改人ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |
| `is_pre_set` | `is_pre_set` | `isPreSet` | 是否预置数据 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rule_target` | `rule_target` | `ruleTarget` | 规则目标 |
| `type` | `type` | `type` | 推荐类型  1=拜访推荐  3 = 业务规则 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `visit_object` | `visit_object` | `visitObject` | 拜访对象 |
| `` | `` | `recommendApplyOrgs` | 适用组织子表 |
| `` | `` | `recommendApplyPartners` | 适用伙伴子表 |
| `` | `` | `recommendTriggerRules` | 触发规则 |
| `` | `` | `visitRecommendBasis` | 拜访推荐依据 |
| `` | `` | `visitRecommendRange` | 拜访推荐范围 |
