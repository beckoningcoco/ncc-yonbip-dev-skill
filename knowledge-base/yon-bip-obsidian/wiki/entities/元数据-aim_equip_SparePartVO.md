---
tags: [BIP, 元数据, 数据字典, aim.equip.SparePartVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 零部件 (`aim.equip.SparePartVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_spare_part` | domain：`ucf-amc-ambd` | 应用：`AIM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 零部件 |
| 物理表 | `pam_spare_part` |
| domain/服务域 | `ucf-amc-ambd` |
| schema | `amc_ambd` |
| 所属应用 | `AIM` |
| 直连字段 | 21 个 |
| 子表 | 1 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `aim.equip.SparePartVODefine` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_material` | `productcenter.productref` |
| `unit` | `productcenter.pc_unitref_new` |
| `material_free` | `` |
| `pk_equip` | `` |
| `user_defines` | `` |
| `ytenant_id` | `` |
| `tenantid` | `` |
| `ass_unit` | `productcenter.pc_unitref_new` |
| `` | `` |

## 继承接口 (3个, 3字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_org` | `pk_org` | `pk_org` | 资产组织 |
| `serial_num` | `serial_num` | `serial_num` | 存货序列号 |
| `memo` | `memo` | `memo` | 备注 |
| `id` | `id` | `id` | 主键 |
| `sysid` | `sysid` | `sysid` | 系统标识 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_equip` | `pk_equip` | `pk_equip` | 资产卡片 |
| `pk_material` | `pk_material` | `pk_material` | 物料 |
| `unit` | `unit` | `unit` | 单位 |
| `ass_unit` | `ass_unit` | `ass_unit` | 主单位 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenantid` | `tenantid` | `tenant` | 租户 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `num` | `num` | `num` | 数量 |
| `change_rate` | `change_rate` | `change_rate` | 换算率 |
| `ass_num` | `ass_num` | `ass_num` | 件数 |
| `change_rateden` | `change_rateden` | `change_rateDen` | 换算率分母 |
| `change_ratenum` | `change_ratenum` | `change_rateNum` | 换算率分子 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_defines` | `user_defines` | `userDefines` | 零部件自定义项 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `material_free` | `material_free` | `materialFree` | 自由项特征组 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 零部件自定义项 |
