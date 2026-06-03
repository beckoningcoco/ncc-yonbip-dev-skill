---
tags: [BIP, 元数据, 数据字典, cust.custoperateinfo.CustTechnologyDepartment]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户部门 (`cust.custoperateinfo.CustTechnologyDepartment`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_technology_depart` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：`ba744977-0dc5-48f7-97fe-e5d9a256a1bb`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户部门 |
| 物理表 | `cust_technology_depart` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CUST` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 12 个 |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `iParentId` | `` |
| `org` | `ucf-org-center.bd_salesorg` |
| `ytenant_id` | `` |
| `department_head` | `` |
| `` | `` |
| `salearea` | `productcenter.aa_salearearef` |
| `dept` | `ucf-org-center.bd_dept_list_ref` |
| `cust_technology_depart_define_character` | `` |
| `bustype` | `` |
| `customer` | `cust_customerref` |

## 继承接口 (3个, 10字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `department` | `department` | `department` | 部门名称 |
| `parent_department` | `parent_department` | `parentDepart` | 上级部门或公司 |
| `code` | `code` | `code` | 部门编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `path` | `path` | `path` | 上级部门路径 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org` | `org` | `org` | 销售组织ID |
| `salearea` | `salearea` | `saleArea` | 销售区域ID |
| `dept` | `dept` | `dept` | 部门ID |
| `ower` | `ower` | `ower` | 负责人ID |
| `customer` | `customer` | `customer` | 客户ID |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `department_head` | `department_head` | `departmentHead` | 部门负责人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `iParentId` | `iParentId` | `parent` | 上级部门 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `num` | `num` | `num` | 人数 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cust_technology_depart_define_character` | `cust_technology_depart_define_character` | `custTechnologyDepartDefineCharacter` | 客户部门自定义特征 |
