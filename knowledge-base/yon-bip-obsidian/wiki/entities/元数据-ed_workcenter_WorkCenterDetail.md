---
tags: [BIP, 元数据, 数据字典, ed.workcenter.WorkCenterDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 工作中心明细 (`ed.workcenter.WorkCenterDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ed_workcenter_detail` | domain：`engineeringdata` | 应用：`ED` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工作中心明细 |
| 物理表 | `ed_workcenter_detail` |
| domain/服务域 | `engineeringdata` |
| 所属应用 | `ED` |
| 直连字段 | 14 个 |
| 子表 | 2 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyDefines` | `ed.workcenter.WorkCenterDetailUserDefine` | composition |
| `attBodyDefines` | `ed.workcenter.WorkCenterDetailAttrextItem` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `work_type_id` | `finbd.bd_activitytyperef` |
| `ytenant_id` | `` |
| `workcenter_id` | `` |
| `workCenterDetailDefineCharacter` | `` |
| `` | `` |
| `quantity_unit` | `productcenter.pc_unitref` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `memo` | `memo` | `memo` | 备注 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `quantity_unit` | `quantity_unit` | `quantityUnit` | 数量单位 |
| `workcenter_id` | `workcenter_id` | `workCenterId` | 工作中心id |
| `work_type_id` | `work_type_id` | `workTypeId` | 作业类型Id |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `workType_activityClass` | `workType_activityClass` | `workTypeIdActivityClass` | 作业类别 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 子表ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quantity` | `quantity` | `quantity` | 数量 |
| `line_no` | `line_no` | `lineNo` | 行号 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `workCenterDetailDefineCharacter` | `workCenterDetailDefineCharacter` | `workCenterDetailDefineCharacter` | 自定义项特征属性组 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `attBodyDefines` | 工作中心明细(自由自定义项) |
| `` | `` | `bodyDefines` | 工作中心明细(固定自定义项)表 |
