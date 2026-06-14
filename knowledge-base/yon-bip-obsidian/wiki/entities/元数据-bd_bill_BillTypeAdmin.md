---
tags: [BIP, 元数据, 数据字典, bd.bill.BillTypeAdmin]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 单据类型运营 (`bd.bill.BillTypeAdmin`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_billtype` | domain：`transtype` | 应用：`BMMMM` | 业务对象ID：`5a67ced1-559e-4302-a0d0-cde9569a0656`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 单据类型运营 |
| 物理表 | `bd_billtype` |
| domain/服务域 | `transtype` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `BMMMM` |
| 直连字段 | 42 个 |
| 子表 | 6 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `billTplGroupExtList` | `bd.bill.BillTplGroupExt` | composition |
| `billItemExtList` | `bd.bill.BillItemExt` | composition |
| `billTypeRuleAdminList` | `bd.bill.BillTypeRuleAdmin` | composition |
| `interactiveList` | `bd.bill.Interactive` | composition |
| `transTypeAdminList` | `bd.bill.TransTypeAdmin` | composition |
| `billTypeActionAdminList` | `bd.bill.BillTypeActionAdmin` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `parent_id` | `` |
| `ytenant_id` | `` |
| `tenantid` | `` |

## 继承接口 (2个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)

## 字段列表（按类型分组）

> 共 42 个直连字段

### 文本字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `name_resid` | `name_resid` | `nameResid` | 名称多语词条 |
| `micro_service_code` | `micro_service_code` | `microServiceCode` | 微服务编码 |
| `code` | `code` | `code` | 单据类型编码 |
| `sysid` | `sysid` | `sysid` | 应用编码 |
| `busiobj_code` | `busiobj_code` | `busiobjCode` | 业务对象编码 |
| `form_id` | `form_id` | `form_id` | 表单ID(form_id) |
| `log` | `log` | `log` | 操作日志 |
| `service_code` | `service_code` | `service_code` | web端服务编码 |
| `service_code_mobile` | `service_code_mobile` | `serviceCodeMobile` | 移动端服务编码 |
| `class_id` | `class_id` | `class_id` | 元数据ID |
| `meta_type` | `meta_type` | `meta_type` | 元数据类型 |
| `busiprocess` | `busiprocess` | `busiprocess` | 业务流程 |
| `istranstype` | `istranstype` | `istranstype` | 单据是否是交易类型 |
| `datatype` | `datatype` | `datatype` | 数据类型 |
| `path` | `path` | `path` | 路径 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `tenantid` | `tenantid` | `tenantid` | 租户id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `print_after_approval` | `print_after_approval` | `printAfterApproval` | 是否审核后打印 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sort_num` | `sort_num` | `sort_num` | 排序号 |
| `is_core_bill` | `is_core_bill` | `is_core_bill` | 核心单据 |
| `is_support_workflow` | `is_support_workflow` | `is_support_workflow` | 支持流程 |
| `share_type` | `share_type` | `shareType` | 共享类型 |
| `is_support_transtype` | `is_support_transtype` | `is_support_transtype` | 支持交易类型 |
| `is_support_multi_org` | `is_support_multi_org` | `is_support_multi_org` | 支持单组织 |
| `is_nosupport_transtypdel` | `is_nosupport_transtypdel` | `is_nosupport_transtypdel` | 支持交易类型删除 |
| `is_nosupport_transtypadd` | `is_nosupport_transtypadd` | `is_nosupport_transtypadd` | 支持交易类型新增 |
| `is_nosupport_transtypmodify` | `is_nosupport_transtypmodify` | `is_nosupport_transtypmodify` | 支持交易类型修改 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |
| `level` | `level` | `level` | 层级 |
| `upgrade_data_type` | `upgrade_data_type` | `upgradeDataType` | 升级类型 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 单据类型名称 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `billItemExtList` | 表单属性拓展 |
| `` | `` | `billTplGroupExtList` | 表单属性拓展分组 |
| `` | `` | `billTypeActionAdminList` | 单据动作运营 |
| `` | `` | `billTypeRuleAdminList` | 单据规则运营 |
| `` | `` | `interactiveList` | 交互规则中间表 |
| `` | `` | `transTypeAdminList` | 交易类型运营 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
