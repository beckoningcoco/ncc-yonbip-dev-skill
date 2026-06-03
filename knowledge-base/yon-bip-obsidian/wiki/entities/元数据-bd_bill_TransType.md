---
tags: [BIP, 元数据, 数据字典, bd.bill.TransType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 交易类型 (`bd.bill.TransType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_transtype` | domain：`transtype` | 应用：`BMMMM` | 业务对象ID：`aefe4c36-9779-4347-90af-d8fdd765b446`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 交易类型 |
| 物理表 | `bd_transtype` |
| 数据库 schema | `transtype` |
| 所属应用 | `BMMMM` |
| 直连字段 | 38 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `billtype_id` | `transtype.bd_labelapp_billtype_ref` |

## 继承接口 (5个, 9字段)

- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 38 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源id |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `datatype` | `datatype` | `datatype` | 数据类型 |
| `service_code_mobile` | `service_code_mobile` | `serviceCodeMobile` | 服务编码-移动端 |
| `extend_attrs_json` | `extend_attrs_json` | `extend_attrs_json` | 扩展字段属性 |
| `log` | `log` | `log` | 操作日志 |
| `sourceid` | `sourceid` | `sourceid` | 交易类型源id |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `code` | `code` | `code` | 交易类型编码 |
| `service_code` | `service_code` | `service_code` | 原子服务编码 |
| `default` | `default` | `default` | 默认交易类型 |
| `id` | `id` | `id` | ID |
| `micro_service_code` | `micro_service_code` | `microServiceCode` | 微服务编码 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billtype_id` | `billtype_id` | `billtype_id` | 单据类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |
| `enable` | `enable` | `enable` | 启用状态 |
| `is_nosupport_transtypadd` | `is_nosupport_transtypadd` | `is_nosupport_transtypadd` | 交易类型引用不支持新增标志 |
| `is_nosupport_transtypdel` | `is_nosupport_transtypdel` | `is_nosupport_transtypdel` | 交易类型不支持删除标志 |
| `is_nosupport_transtypmodify` | `is_nosupport_transtypmodify` | `is_nosupport_transtypmodify` | 交易类型不支持修改标志 |
| `is_nosupport_transtyprefmodify` | `is_nosupport_transtyprefmodify` | `is_nosupport_transtyprefmodify` | 交易类型不支持被引用修改 |
| `is_support_publish_menu_mobile` | `is_support_publish_menu_mobile` | `isSupportPublishMenuMobile` | 支持菜单发布-移动端 |
| `is_publish` | `is_publish` | `is_publish` | 是否发布 |
| `is_publish_mobile` | `is_publish_mobile` | `isPublishMobile` | 是否发布-移动端 |
| `is_support_publish_menu` | `is_support_publish_menu` | `is_support_publish_menu` | 是否支持发布菜单 |
| `print_after_approval` | `print_after_approval` | `printAfterApproval` | 是否审核后打印 |
| `is_support_workflow` | `is_support_workflow` | `is_support_workflow` | 流程支持 |
| `preset` | `preset` | `preset` | 预置数据 |
| `share_type` | `share_type` | `shareType` | 共享类型 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 交易类型名称 |
| `memo` | `memo` | `memo` | 备注 |
