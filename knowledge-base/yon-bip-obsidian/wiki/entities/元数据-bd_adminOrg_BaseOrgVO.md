---
tags: [BIP, 元数据, 数据字典, bd.adminOrg.BaseOrgVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 组织 (`bd.adminOrg.BaseOrgVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_orgs` | domain：`ucf-org-center` | 应用：`GZTORG` | 业务对象ID：`32f32e76-80fe-4d57-b3f8-59595691b2b8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 组织 |
| 物理表 | `org_orgs` |
| domain/服务域 | `ucf-org-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `GZTORG` |
| 直连字段 | 67 个 |
| 子表 | 8 个 |
| 关联引用 | 18 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `adminOrgViewOrg` | `bd.adminOrg.AdminOrgViewOrg` | composition |
| `deptOrgVO` | `bd.adminOrg.DeptOrgVO` | composition |
| `inventoryOrgVO` | `bd.adminOrg.InventoryOrgVO` | composition |
| `financeOrgVO` | `bd.adminOrg.FinanceOrgVO` | composition |
| `purchaseOrgVO` | `bd.adminOrg.PurchaseOrgVO` | composition |
| `adminOrgViewDept` | `bd.adminOrg.AdminOrgViewDept` | composition |
| `factoryOrgVO` | `bd.adminOrg.FactoryOrgVO` | composition |
| `salesOrgVO` | `bd.adminOrg.SalesOrgVO` | composition |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `parentid` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `orgid` | `` |
| `principal` | `ucf-staff-center.bd_staff_ref` |
| `branchleader` | `ucf-staff-center.bd_staff_ref` |
| `companytype` | `customerdoc_listref` |
| `parentorgid` | `` |
| `id` | `` |
| `tenantid` | `` |

## 继承接口 (7个, 11字段)

- **树型结构** (`basedoc.basedocItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **时间轴档案** (`hred.itf.ITimeLineDoc`)
  - `end_time` → `end_time`
  - `start_time` → `start_time`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 67 个直连字段

### 文本字段 (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `code` | `code` | `code` | 编码 |
| `innercode` | `innercode` | `innercode` | 内部码 |
| `address` | `address` | `address` | 公司注册地址 |
| `contact` | `contact` | `contact` | 联系人 |
| `telephone` | `telephone` | `telephone` | 联系电话 |
| `timezone` | `timezone` | `timezone` | 时区 |
| `objid` | `objid` | `objid` | 外部系统主键 |
| `countryzone` | `countryzone` | `countryzone` | 国家地区 |
| `sourceid` | `sourceid` | `sourceid` | 来源入口 |
| `tenantid` | `tenantid` | `tenantid` | 租户标识 |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `path` | `path` | `path` | 上级路径(废弃) |
| `businessid` | `businessid` | `businessid` | 友企联同步业务主键 |
| `description2` | `description2` | `description2` | 备注(多语备用) |
| `description3` | `description3` | `description3` | 备注(多语备用) |
| `description4` | `description4` | `description4` | 备注(多语备用) |
| `description5` | `description5` | `description5` | 备注(多语备用) |
| `description6` | `description6` | `description6` | 备注(多语备用) |
| `name2` | `name2` | `name2` | 名称(多语备用) |
| `name3` | `name3` | `name3` | 名称(多语备用) |
| `name4` | `name4` | `name4` | 名称(多语备用) |
| `name5` | `name5` | `name5` | 名称(多语备用) |
| `name6` | `name6` | `name6` | 名称(多语备用) |
| `shortname2` | `shortname2` | `shortname2` | 简称(多语备用) |
| `shortname3` | `shortname3` | `shortname3` | 简称(多语备用) |
| `shortname4` | `shortname4` | `shortname4` | 简称(多语备用) |
| `shortname5` | `shortname5` | `shortname5` | 简称(多语备用) |
| `shortname6` | `shortname6` | `shortname6` | 简称(多语备用) |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `companytype` | `companytype` | `companytype` | 组织形态 |
| `parentid` | `parentid` | `parent` | 上级节点 |
| `parentid` | `parentid` | `parentid` | 上级业务单元 |
| `parentorgid` | `parentorgid` | `parentorgid` | 所属行政组织 |
| `principal` | `principal` | `principal` | 负责人 |
| `branchleader` | `branchleader` | `branchleader` | 分管领导 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `orgid` | `orgid` | `orgid` | 业务单元主键(废弃) |
| `id` | `id` | `AdminOrgVO` | 部门 |

### 整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_biz_unit` | `is_biz_unit` | `is_biz_unit` | 是否业务单元 |
| `is_biz_unit` | `is_biz_unit` | `isbizunit` | 是否业务单元 |
| `orgtype` | `orgtype` | `orgtype` | 是否部门 |
| `level` | `level` | `level` | 组织层级 |
| `displayorder` | `displayorder` | `displayorder` | 排序号 |
| `displayorder` | `displayorder` | `sort` | 排序号 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级节点 |
| `enable` | `enable` | `enable` | 状态 |
| `external_org` | `external_org` | `externalorg` | 外部组织 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标识 |
| `dept_nature` | `dept_nature` | `deptnature` | 部门类型 |

### other (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `deptOrgVO` | 行政部门 |
| `` | `` | `purchaseOrgVO` | 采购组织(废弃) |
| `` | `` | `financeOrgVO` | 会计主体(废弃) |
| `` | `` | `adminOrgViewDept` | 行政部门视图 |
| `` | `` | `adminOrgViewOrg` | 行政组织视图参照 |
| `` | `` | `inventoryOrgVO` | 库存组织(废弃) |
| `` | `` | `salesOrgVO` | 销售组织(废弃) |
| `` | `` | `factoryOrgVO` | 工厂组织(废弃) |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `shortname` | `shortname` | `shortname` | 简称 |
| `description` | `description` | `description` | 备注 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `start_time` | `start_time` | `starttime` | 生效日期 |
| `effectivedate` | `effectivedate` | `effectivedate` | 生效日期 |
| `end_time` | `end_time` | `endtime` | 失效日期 |
| `expirationdate` | `expirationdate` | `expirationdate` | 失效日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `synchts` | `synchts` | `synchts` | 友企联同步时间戳 |
