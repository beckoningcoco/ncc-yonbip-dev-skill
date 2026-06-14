---
tags: [BIP, 元数据, 数据字典, aa.baseorg.OrgAndFuncMV]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 组织职能关系 (`aa.baseorg.OrgAndFuncMV`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_typ_lnk` | domain：`ucf-org-center` | 应用：`GZTORG` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 组织职能关系 |
| 物理表 | `org_typ_lnk` |
| domain/服务域 | `ucf-org-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `GZTORG` |
| 直连字段 | 6 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `orgtypeid` | `` |
| `orgid` | `` |
| `ytenant_id` | `` |
| `tenantid` | `` |

## 继承接口 (2个, 2字段)

- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 6 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `tenantid` | `tenantid` | `tenantid` | 租户标识 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `orgid` | `orgid` | `org` | 所属组织 |
| `orgtypeid` | `orgtypeid` | `orgFunc` | 组织职能 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
