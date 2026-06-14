---
tags: [BIP, 元数据, 数据字典, aim.equip.EquipAssignment]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分配信息 (`aim.equip.EquipAssignment`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_equip_assignment` | domain：`ucf-amc-ambd` | 应用：`AIM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 分配信息 |
| 物理表 | `pam_equip_assignment` |
| domain/服务域 | `ucf-amc-ambd` |
| schema | `amc_ambd` |
| 所属应用 | `AIM` |
| 直连字段 | 17 个 |
| 子表 | 0 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_costcenter_use` | `finbd.bd_costcenterref` |
| `pk_material` | `productcenter.productref` |
| `pk_equip` | `` |
| `user_defines` | `` |
| `activity` | `` |
| `pk_jobmngfil` | `ucfbasedoc.bd_projectcardref` |
| `ytenant_id` | `` |
| `pk_usedept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `wbs` | `` |
| `pk_profitcenter_use` | `finbd.bd_allaccbodyref_inner` |
| `tenantid` | `` |

## 继承接口 (4个, 5字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 17 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `memo` | `memo` | `memo` | 备注 |
| `sysid` | `sysid` | `sysid` | 应用标识 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `pk_equip` | `pk_equip` | `pk_equip` | 卡片主键 |
| `pk_usedept` | `pk_usedept` | `pk_usedept` | 使用部门主键 |
| `pk_jobmngfil` | `pk_jobmngfil` | `pk_jobmngfil` | 项目主键 |
| `pk_costcenter_use` | `pk_costcenter_use` | `pk_costcenter_use` | 使用成本中心主键 |
| `pk_profitcenter_use` | `pk_profitcenter_use` | `pk_profitcenter_use` | 使用利润中心主键 |
| `pk_material` | `pk_material` | `pk_material` | 产品主键 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allocation_ratio` | `allocation_ratio` | `allocation_ratio` | 分摊比例(%) |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_defines` | `user_defines` | `userDefines` | 分配信息自定义项 |
