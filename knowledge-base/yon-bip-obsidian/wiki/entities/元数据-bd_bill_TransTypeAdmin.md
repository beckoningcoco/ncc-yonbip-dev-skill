---
tags: [BIP, 元数据, 数据字典, bd.bill.TransTypeAdmin]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 交易类型运营 (`bd.bill.TransTypeAdmin`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_transtype` | domain：`transtype` | 应用：`BMMMM` | 业务对象ID：`be7f8c4a-378f-4051-9167-7f547bf056ec`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 交易类型运营 |
| 物理表 | `bd_transtype` |
| 数据库 schema | `transtype` |
| 所属应用 | `BMMMM` |
| 直连字段 | 30 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `tenantid` | `` |
| `billtype_id` | `` |

## 字段列表（按类型分组）

> 共 30 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `name_resid` | `name_resid` | `nameResid` | 多语词条 |
| `code` | `code` | `code` | 交易类型编码 |
| `service_code` | `service_code` | `service_code` | 服务编码 |
| `default` | `default` | `default` | 默认交易类型 |
| `extend_attrs_json` | `extend_attrs_json` | `extend_attrs_json` | 扩展字段属性 |
| `log` | `log` | `log` | 操作日志 |
| `micro_service_code` | `micro_service_code` | `microServiceCode` | 微服务编码 |
| `service_code_mobile` | `service_code_mobile` | `serviceCodeMobile` | 移动端服务编码 |
| `sourceid` | `sourceid` | `sourceid` | 交易类型源id |
| `sysid` | `sysid` | `sysid` | 应用编码 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billtype_id` | `billtype_id` | `billtype_id` | 单据类型主键 |
| `tenantid` | `tenantid` | `tenantid` | 租户id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `share_type` | `share_type` | `shareType` | 共享类型 |
| `is_support_publish_menu` | `is_support_publish_menu` | `is_support_publish_menu` | 支持菜单发布-web端 |
| `print_after_approval` | `print_after_approval` | `printAfterApproval` | 是否审核后打印 |
| `is_support_publish_menu_mobile` | `is_support_publish_menu_mobile` | `isSupportPublishMenuMobile` | 支持菜单发布-移动端 |
| `is_support_workflow` | `is_support_workflow` | `is_support_workflow` | 支持流程 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |
| `enable` | `enable` | `enable` | 启用状态 |
| `is_nosupport_transtypadd` | `is_nosupport_transtypadd` | `is_nosupport_transtypadd` | 交易类型引用不支持新增标志 |
| `is_nosupport_transtypdel` | `is_nosupport_transtypdel` | `is_nosupport_transtypdel` | 交易类型不支持删除标志 |
| `is_nosupport_transtypmodify` | `is_nosupport_transtypmodify` | `is_nosupport_transtypmodify` | 交易类型不支持修改标志 |
| `is_nosupport_transtyprefmodify` | `is_nosupport_transtyprefmodify` | `is_nosupport_transtyprefmodify` | 交易类型不支持被引用修改 |
| `preset` | `preset` | `preset` | 是否手工预置数据 |
| `upgrade_data_type` | `upgrade_data_type` | `upgradeDataType` | upgradeDataType |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 交易类型名称 |
| `memo` | `memo` | `memo` | 备注 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
