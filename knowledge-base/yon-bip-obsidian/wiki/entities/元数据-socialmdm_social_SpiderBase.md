---
tags: [BIP, 元数据, 数据字典, socialmdm.social.SpiderBase]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 行政区划 (`socialmdm.social.SpiderBase`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sdm_spider_base` | domain：`iuap-apdoc-social` | 应用：`DPMPI` | 业务对象ID：`731070b3-e622-470e-9397-b43e2b143565`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 行政区划 |
| 物理表 | `sdm_spider_base` |
| domain/服务域 | `iuap-apdoc-social` |
| schema | `iuap_apdoc_social` |
| 所属应用 | `DPMPI` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 0 个 |

## 继承接口 (1个, 5字段)

- **树型结构** (`basedoc.basedocItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `country` | `country` | `country` | 国别编码 |
| `country_code` | `country_code` | `countryCode` | 新增11 |
| `country_order` | `country_order` | `countryOrder` | 新增12 |
| `full_name` | `full_name` | `fullName` | 全名称 |
| `code` | `code` | `id` | 编码 |
| `mul_language` | `mul_language` | `mulLanguage` | 多语json串 |
| `name2` | `name2` | `name2` | 英文名称 |
| `name3` | `name3` | `name3` | 繁体名称 |
| `name4` | `name4` | `name4` | 新增7 |
| `name5` | `name5` | `name5` | 新增8 |
| `name6` | `name6` | `name6` | 新增9 |
| `name_resid` | `name_resid` | `nameResId` | 多语平台资源编码 |
| `parent_code` | `parent_code` | `parent` | 父编码 |
| `path` | `path` | `path` | 路径 |
| `pk` | `pk` | `pk` | pk主键 |
| `sys_id` | `sys_id` | `sysId` | 新增14 |
| `tenant_id` | `tenant_id` | `tenantId` | 租户id |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 友户通租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 是否删除 |
| `level` | `level` | `level` | 行政区划等级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auto_id` | `auto_id` | `autoId` | 自增id |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `ts` | 最后更新时间 |
