---
tags: [BIP, 元数据, 数据字典, calendar.workingCalendar.WorkingCalendar]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 工作日历 (`calendar.workingCalendar.WorkingCalendar`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ts_working_calendar` | domain：`ucf-staff-center` | 应用：`DPMWDC` | 业务对象ID：`12037585-4753-429c-ab27-cdddb979520a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工作日历 |
| 物理表 | `ts_working_calendar` |
| domain/服务域 | `ucf-staff-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMWDC` |
| 直连字段 | 33 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `holiday` | `calendar.workingCalendar.Holiday` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `` |
| `CREATOR` | `` |
| `busiorg` | `` |
| `ytenant_id` | `` |
| `MODIFIER` | `` |
| `` | `` |
| `tenantid` | `` |

## 继承接口 (5个, 13字段)

- **租户接口** (`ucfbase.ucfbaseItf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 33 个直连字段

### 文本字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `isdefault` | `isdefault` | `isdefault` | 是否默认方案:0:否，1:是 |
| `isfriday` | `isfriday` | `isfriday` | 星期五是否工作日 0：否，1：是 |
| `ismonday` | `ismonday` | `ismonday` | 星期一是否工作日 0：否，1：是 |
| `issaturday` | `issaturday` | `issaturday` | 星期六是否工作日 0：否，1：是 |
| `issunday` | `issunday` | `issunday` | 星期日是否工作日 0：否，1：是 |
| `isthursday` | `isthursday` | `isthursday` | 星期四是否工作日 0：否，1：是 |
| `istuesday` | `istuesday` | `istuesday` | 星期二是否工作日 0：否，1：是 |
| `iswednesday` | `iswednesday` | `iswednesday` | 星期三是否工作日 0：否，1：是 |
| `name` | `name` | `name` | 节点标题 |
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `path` | `path` | `path` | 路径 |
| `workingcalendarname2` | `workingcalendarname2` | `workingcalendarname2` | 假日类别名称2 |
| `workingcalendarname3` | `workingcalendarname3` | `workingcalendarname3` | 假日类别名称3 |
| `workingcalendarname4` | `workingcalendarname4` | `workingcalendarname4` | 假日类别名称4 |
| `workingcalendarname5` | `workingcalendarname5` | `workingcalendarname5` | 假日类别名称5 |
| `workingcalendarname6` | `workingcalendarname6` | `workingcalendarname6` | 假日类别名称6 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busiorg` | `busiorg` | `busiorg` | 有权限的组织ID |
| `country` | `country` | `country` | 国家 |
| `CREATOR` | `CREATOR` | `creator` | 创建者 |
| `MODIFIER` | `MODIFIER` | `modifier` | 修改者 |
| `tenantid` | `tenantid` | `tenant` | 租户ID |
| `ytenant_id` | `ytenant_id` | `yTenantId` | 友户通租户ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `ts` | `ts` | `pubts` | ts |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `holiday` | 假日定义 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `workingcalendarname` | `workingcalendarname` | `workingcalendarname` | 假日类别名称 |
