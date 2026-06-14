---
tags: [BIP, 元数据, 数据字典, DZHTFW.econtract.physicalStamp]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物理印章 (`DZHTFW.econtract.physicalStamp`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_physical_stamp` | domain：`iuap-apcom-contract` | 应用：`DZHTFW` | 业务对象ID：`387914af-47fa-4cfb-89a2-b08a44dda7a3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物理印章 |
| 物理表 | `clm_physical_stamp` |
| domain/服务域 | `iuap-apcom-contract` |
| schema | `iuap_apcom_contract` |
| 所属应用 | `DZHTFW` |
| 直连字段 | 26 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `feature` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `mana_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `manager_id` | `ucf-staff-center.bd_staff_all_ref` |
| `ytenant_id` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |

## 继承接口 (6个, 11字段)

- **主组织** (`iuap.busiObj.OrgItf`)
  - `org_id` → `org_id`
- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 26 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `manager_contact_type` | `manager_contact_type` | `managerContactType` | 保管人联系方式 |
| `seal_mark` | `seal_mark` | `sealMark` | 公章防伪识别码 |
| `secret_level` | `secret_level` | `secretLevel` | 密级 |
| `secret_limit` | `secret_limit` | `secretLimit` | 保密期限	 |
| `id` | `id` | `id` | 主键 |
| `code` | `code` | `code` | 编码 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mana_dept_id` | `mana_dept_id` | `manaDeptId` | 管理部门 |
| `manager_id` | `manager_id` | `managerId` | 印章保管人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `org_id` | `org_id` | `orgId` | 主组织 |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `seal_droped` | `seal_droped` | `sealDroped` | 印章是否已销毁 |
| `seal_type` | `seal_type` | `sealType` | 印章类型 |
| `enable` | `enable` | `enable` | 档案状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `feature` | `feature` | `feature` | 自定义特征 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `memo` | `memo` | `memo` | 备注 |
| `name` | `name` | `name` | 印章名称 |
| `seal_yt` | `seal_yt` | `sealYt` | 印章用途 |

### attachment (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `seal_image` | `seal_image` | `sealImage` | 印章留样图片 |
