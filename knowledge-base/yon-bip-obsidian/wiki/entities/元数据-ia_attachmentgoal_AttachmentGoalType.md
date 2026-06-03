---
tags: [BIP, 元数据, 数据字典, ia.attachmentgoal.AttachmentGoalType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 附件识别对象分类 (`ia.attachmentgoal.AttachmentGoalType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_attachment_goal_type` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：`fd46ea83-03ae-468d-aa48-d410cad5d3d8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 附件识别对象分类 |
| 物理表 | `ssc_ia_attachment_goal_type` |
| 数据库 schema | `yonbip-mid-sscia` |
| 所属应用 | `ZNSH` |
| 直连字段 | 23 个 |
| 子表 | 1 个 |
| 关联引用 | 4 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `attachmentGoals` | `ia.attachmentgoal.AttachmentGoal` | composition |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 分类编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `id` | `id` | `id` | 主键Id |
| `` | `modifier` | `modifier` | 修改人名称 |
| `path` | `path` | `path` | 路径 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `preset_tag` | `preset_tag` | `presetTag` | 预置标签 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parent_id` | `parent_id` | `parent` | 上级分类 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `attachmentGoals` | 附件识别对象 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 分类名称 |
