---
tags: [BIP, 元数据, 数据字典, ampub.equipbase.LocationVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 位置 (`ampub.equipbase.LocationVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_location` | domain：`ucf-amc-ambd` | 应用：`AMBD` | 业务对象ID：`796218cf-d845-4560-af61-697f05c8cdb0`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 位置 |
| 物理表 | `pam_location` |
| 数据库 schema | `ucf-amc-ambd` |
| 所属应用 | `AMBD` |
| 直连字段 | 42 个 |
| 关联引用 | 15 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `measurepoint` | `ampub.equipbase.LocMeasurePointVO` | composition |
| `defines` | `ampub.equipbase.LocationVODefine` | composition |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_warehouse` | `productcenter.aa_warehouse` |
| `parent_id` | `` |
| `creator` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `gis_operator` | `` |
| `modifier` | `` |
| `pk_cost_center` | `finbd.bd_costcenterref` |
| `pk_org` | `ucf-org-center.org_pure_tree_ref` |
| `user_defines` | `` |
| `pk_sealer` | `` |
| `pk_icorg` | `ucf-org-center.bd_inventoryorg` |
| `fk_parent` | `ucf-amc-ambd.ampub_location_ref` |
| `tenantid` | `` |

## 继承接口 (8个, 18字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **树型结构** (`baseapp.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **审计信息** (`baseapp.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **ERP来源信息** (`baseapp.itf.IErpInfo`)
  - `erpcode` → `erpcode`
  - `erpid` → `erpid`
  - `gatewayid` → `gatewayid`
- **停启用状态** (`baseapp.itf.IEnableState`)
  - `enablestate` → `enablestate`
  - `pk_sealer` → `pk_sealer`
  - `seal_time` → `seal_time`
- **自动编码** (`baseapp.itf.IAutoCode`)
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 42 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `location_code` | `location_code` | String | 位置编码 |
| `qr_code` | `qr_code` | String | 二维码 |
| `memo` | `memo` | String | 备注 |
| `innercode` | `innercode` | String | 内部编码 |
| `sysid` | `sysid` | String | 系统标识 |
| `id` | `id` | String | ID |
| `path` | `path` | String | 路径 |
| `pk_group` | `pk_group` | String | 集团 |
| `gatewayid` | `gatewayid` | String | 网关主键 |
| `erpcode` | `erpcode` | String | erp系统编码 |
| `erpid` | `erpid` | String | erp系统主键 |
| `pk_org_v` | `pk_org_v` | String | 资产组织 |

### 引用字段 (12个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `pk_org` | `pk_org` | 14302233-1394-4a70-94e1-bed51636f312 | 资产组织 |
| `fk_parent` | `fk_parent` | 169a916d-6125-4f85-b67a-ba82a4cb6008 | 父位置 |
| `pk_icorg` | `pk_icorg` | e18e914b-4518-4e8c-ac21-783145fe7da1 | 库存组织 |
| `pk_warehouse` | `pk_warehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | 仓库 |
| `pk_cost_center` | `pk_cost_center` | 872630ba-e8f4-4080-817d-8fc9a6958733 | 成本中心 |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 最后修改人 |
| `pk_sealer` | `pk_sealer` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 启用人 |
| `tenantid` | `tenantid` | 5d1b0fb2-2218-4eaa-abc9-1c23516b6596 | 租户 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |
| `parent_id` | `parent_id` | 169a916d-6125-4f85-b67a-ba82a4cb6008 | 父位置 |
| `gis_operator` | `gis_operator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | GIS关联操作人 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `isEnd` | Boolean | 是否末级 |
| `gis_flag` | `gis_flag` | Boolean | 关联GIS标识 |

### 整数 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `level` | `level` | Integer | 层级 |
| `sort_num` | `sort_num` | Integer | 排序号 |

### 短整数 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `location_type` | `location_type` | Short | 位置类型 |
| `install_limit` | `install_limit` | Short | 安装限制 |
| `enablestate` | `enablestate` | Short | 启用状态 |
| `dr` | `dr` | Short | 逻辑删除标识 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `location_name` | `location_name` | String | 位置名称 |
| `location_global` | `location_global` | String | 全级次位置 |

### timestamp (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `creationtime` | `creationtime` | DateTime | 创建时间 |
| `modifiedtime` | `modifiedtime` | DateTime | 最后修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |
| `seal_time` | `seal_time` | DateTime | 启用时间 |
| `gis_relation_time` | `gis_relation_time` | DateTime | GIS关联时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `user_defines` | `user_defines` | 024ea1b0-a2b7-4cca-96e1-288c0bc7ca99 | 位置自定义项 |

### other (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | 660e6b6c-3c03-46dd-af3b-c985d90835c6 | 位置自定义项 |
| `` | `` | c547f7ce-4315-42aa-918c-3cec80b8a930 | 测量点 |
