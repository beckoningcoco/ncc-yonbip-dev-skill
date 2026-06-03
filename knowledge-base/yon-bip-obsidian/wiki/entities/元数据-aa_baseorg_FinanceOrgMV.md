---
tags: [BIP, 元数据, 数据字典, aa.baseorg.FinanceOrgMV]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会计主体 (`aa.baseorg.FinanceOrgMV`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_fin` | domain：`ucf-org-center` | 应用：`GZTORG` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 会计主体 |
| 物理表 | `org_fin` |
| 数据库 schema | `ucf-org-center` |
| 所属应用 | `GZTORG` |
| 直连字段 | 49 个 |
| 子表 | 0 个 |
| 关联引用 | 10 个 |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `principal` | `` |
| `parentid` | `` |
| `orgid` | `` |
| `ytenant_id` | `` |
| `exchangerate` | `` |
| `periodschema` | `` |
| `currency` | `` |
| `id` | `` |

## 继承接口 (2个, 2字段)

- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 49 个直连字段

### 文本字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accountingcalendar` | `accountingcalendar` | `accountingcalendar` | 会计日历 |
| `code` | `code` | `code` | 编码 |
| `currency` | `currency` | `coder0e0` | 币种简称 |
| `creator` | `creator` | `creator` | 创建人 |
| `currency` | `currency` | `currencyCode` | 币种编码 |
| `currency` | `currency` | `currencyName` | 币种名称 |
| `tenantid` | `tenantid` | `eaiCode` | EAI编码 |
| `tenantid` | `tenantid` | `erpCode` | erp编码 |
| `localtaxregnum` | `localtaxregnum` | `localtaxregnum` | 地税登记号 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `tenantid` | `tenantid` | `orgFunc` | 组织职能 |
| `orglevel` | `orglevel` | `orglevel` | 组织级别 |
| `parentid` | `parentid` | `parentorgid` | 上级组织ID |
| `id` | `id` | `path` | 路径 |
| `region` | `region` | `region` | 行政区划 |
| `statetaxregnum` | `statetaxregnum` | `statetaxregnum` | 国税登记号 |
| `taxpayerid` | `taxpayerid` | `taxpayerid` | 纳税人识别号 |
| `tenantid` | `tenantid` | `tenant` | 租户标识 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `currency` | `currency` | `currency` | 币种 |
| `exchangerate` | `exchangerate` | `exchangerate` | 汇率类型 |
| `id` | `id` | `id` | 主键 |
| `orgid` | `orgid` | `org` | 基础组织ID |
| `orgid` | `orgid` | `orgid` | 关联组织主键 |
| `parentid` | `parentid` | `parent` | 上级节点ID |
| `parentid` | `parentid` | `parentid` | 上级节点 |
| `periodschema` | `periodschema` | `periodschema` | 期间方案 |
| `principal` | `principal` | `principal` | 负责人 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `createDate` | 创建日期 |
| `modifiedtime` | `modifiedtime` | `modifyDate` | 修改日期 |

### 整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source_type` | `source_type` | `sourcetype` | 数据来源类型 |
| `dr` | `dr` | `customerId` | 客户ID |
| `displayorder` | `displayorder` | `displayorder` | 显示顺序 |
| `external_org` | `external_org` | `externalorg` | 外部组织标识 |
| `isEnd` | `isEnd` | `isEnd` | 是否全局 |
| `isEnd` | `isEnd` | `isGlobal` | 是否全局 |
| `level` | `level` | `level` | 层级 |
| `displayorder` | `displayorder` | `sort` | 排序号 |
| `enable` | `enable` | `stopstatus` | 停用状态 |
| `taxpayertype` | `taxpayertype` | `taxPayingCategories` | 纳税类别 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标识 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `modifiedtime` | `modifiedtime` | `stoptime` | 停用时间 |
| `ts` | `ts` | `ts` | 时间戳 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `fullname` | 名称 |
| `name` | `name` | `name` | 名称 |
| `currency` | `currency` | `namer0e0` | 币种名称 |
