---
tags: [BIP, 元数据, 数据字典, ed.bom.BomComponentStepLoss]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 子件阶梯损耗 (`ed.bom.BomComponentStepLoss`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ed_bom_component_step_loss` | domain：`engineeringdata` | 应用：`ED` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 子件阶梯损耗 |
| 物理表 | `ed_bom_component_step_loss` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `bom_component_id` | `` |

## 继承接口 (1个, 1字段)

- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `remark` | `remark` | `remark` | 备注 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_component_id` | `bom_component_id` | `bomComponentId` | 关联材料 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allocation_source_id` | `allocation_source_id` | `allocationSourceId` | 分配来源Id |
| `id` | `id` | `id` | ID |
| `original_id` | `original_id` | `originalId` | 修订源 |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_from_main_quantity` | `bom_from_main_quantity` | `bomFromMainQuantity` | 母件起始主数量 |
| `bom_to_main_quantity` | `bom_to_main_quantity` | `bomToMainQuantity` | 母件截止主数量(含) |
| `must_loss_quantity` | `must_loss_quantity` | `mustLossQuantity` | 固定损耗 |
| `scrap` | `scrap` | `scrap` | 损耗率 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
