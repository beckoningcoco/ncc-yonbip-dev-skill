---
tags: [BIP, 元数据, 数据字典, bd.bill.BillTypeVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 单据类型 (`bd.bill.BillTypeVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_billtype` | domain：`transtype` | 应用：`BMMMM` | 业务对象ID：`19600445-becc-4d81-8321-4676c8ea23c9`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 单据类型 |
| 物理表 | `bd_billtype` |
| 数据库 schema | `transtype` |
| 所属应用 | `BMMMM` |
| 直连字段 | 37 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `bd_billtypetreeref` |
| `ytenant_id` | `` |
| `tenantid` | `` |

## 继承接口 (5个, 20字段)

- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **树型结构** (`base.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **树型结构** (`basedoc.basedocItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 37 个直连字段

### 文本字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busiobj_code` | `busiobj_code` | `busiobjCode` | 业务对象编码 |
| `busiprocess` | `busiprocess` | `busiprocess` | 业务流程 |
| `class_id` | `class_id` | `class_id` | 元数据主键 |
| `code` | `code` | `code` | 单据类型编码 |
| `form_id` | `form_id` | `form_id` | 单据元数据编码uri |
| `id` | `id` | `id` | 主键 |
| `istranstype` | `istranstype` | `istranstype` | 单据是否是交易类型 |
| `log` | `log` | `log` | 操作日志 |
| `meta_type` | `meta_type` | `meta_type` | 元数据类型 |
| `micro_service_code` | `micro_service_code` | `microServiceCode` | 微服务编码 |
| `path` | `path` | `path` | 路径 |
| `service_code_mobile` | `service_code_mobile` | `serviceCodeMobile` | 移动端服务编码 |
| `service_code` | `service_code` | `service_code` | 原子服务编码 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源id |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `tenantid` | `tenantid` | `tenant` | 租户废弃 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `tenantid` | `tenantid` | `tenantid` | 租户id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isEnd` | `isEnd` | `isEnd` | 排序号 |

### 整数 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标识 |
| `is_core_bill` | `is_core_bill` | `is_core_bill` | 是否是核心单据 |
| `is_nosupport_transtypadd` | `is_nosupport_transtypadd` | `is_nosupport_transtypadd` | 关联交易类型不支持新增标志 |
| `is_nosupport_transtypdel` | `is_nosupport_transtypdel` | `is_nosupport_transtypdel` | 关联交易类型不支持删除标志 |
| `is_nosupport_transtypmodify` | `is_nosupport_transtypmodify` | `is_nosupport_transtypmodify` | 关联交易类型不支持修改标志 |
| `is_support_multi_org` | `is_support_multi_org` | `is_support_multi_org` | 是否支持单多组织 |
| `is_support_transtype` | `is_support_transtype` | `is_support_transtype` | 是否支持交易类型 |
| `is_support_workflow` | `is_support_workflow` | `is_support_workflow` | 是否支持流程 |
| `level` | `level` | `level` | 层级 |
| `print_after_approval` | `print_after_approval` | `printAfterApproval` | 是否审核后打印 |
| `share_type` | `share_type` | `shareType` | 共享类型 |
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |
| `sort_num` | `sort_num` | `sort` | 排序号 |
| `sort_num` | `sort_num` | `sort_num` | 排序号 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 单据类型名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
