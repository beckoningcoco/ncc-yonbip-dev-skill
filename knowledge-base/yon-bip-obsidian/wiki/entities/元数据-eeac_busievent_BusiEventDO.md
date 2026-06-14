---
tags: [BIP, 元数据, 数据字典, eeac.busievent.BusiEventDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务事项 (`eeac.busievent.BusiEventDO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`eac_busi_event` | domain：`yonbip-fi-eeac` | 应用：`EVNT` | 业务对象ID：`acac3431-08e5-4a67-bf49-d6eeb619abae`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务事项 |
| 物理表 | `eac_busi_event` |
| domain/服务域 | `yonbip-fi-eeac` |
| schema | `fieeac` |
| 所属应用 | `EVNT` |
| 直连字段 | 44 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `BusiEventUncompleteDOList` | `eeac.busievent.BusiEventUncompleteDO` | composition |
| `BusiEventDailyDOList` | `eeac.busievent.BusiEventDailyDO` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `trans_type_id` | `ucfbasedoc.bd_billtyperef` |
| `app_id` | `fiepub.fiepub_sourceapplicationref` |
| `bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `ytenant_id` | `` |

## 继承接口 (4个, 9字段)

- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 44 个直连字段

### 文本字段 (24个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `bill_no` | `bill_no` | String | 单据编码 |
| `bill_num` | `bill_num` | String | 单据编码,拉取用 |
| `busi_obj_code` | `busi_obj_code` | String | 业务对象编码 |
| `busi_obj_meta_uri` | `busi_obj_meta_uri` | String | 关联业务对象的uri |
| `business_unit` | `business_unit` | String | 业务单元 |
| `code` | `code` | String | 编码 |
| `domain_code` | `domain_code` | String | 领域编码 |
| `fetch_date` | `fetch_date` | String | 拉取日期 |
| `fetch_switch` | `fetch_switch` | String | 拉取开关 |
| `industry_id` | `industry_id` | String | 所属行业 |
| `micro_service_code` | `micro_service_code` | String | 微服务编码 |
| `reverse_mode` | `reverse_mode` | String | 逆向模式 |
| `service_code` | `service_code` | String | 服务编码 |
| `social_srcid` | `social_srcid` | String | 社会化来源id |
| `social_tenantid` | `social_tenantid` | String | 社会化来源租户 |
| `src_org_id` | `src_org_id` | String | 来源组织 |
| `sys_id` | `sys_id` | String | 关联0租户预置数据的id |
| `using_status` | `using_status` | String | 对预置数据的使用控制 |
| `write_off_field_bill_no` | `write_off_field_bill_no` | String | 冲销映射-单据号 |
| `write_off_field_enable` | `write_off_field_enable` | String | 冲销映射-冲销开关 |
| `write_off_field_mapping` | `write_off_field_mapping` | String | 冲销映射字段 |
| `write_off_field_reason` | `write_off_field_reason` | String | 冲销映射-冲销原因 |
| `write_off_field_sourceid` | `write_off_field_sourceid` | String | 冲销映射-单据id |
| `id` | `id` | String | 主键 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `app_id` | `app_id` | d5737052-9d1e-4cfa-9cab-bee31d88dd8b | 所属应用 |
| `bill_type_id` | `bill_type_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 | 单据类型 |
| `parent_id` | `parent_id` | 2440bd9e-542c-47ea-9070-dbfcaf3eed65 | 上级 |
| `trans_type_id` | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | 交易类型 |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `pubts` | `pubts` | DateTime | 时间戳 |
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `bln_trans_type_preset` | `bln_trans_type_preset` | Boolean | 交易类型是否是预置数据 |
| `bln_user_def` | `bln_user_def` | Boolean | 是否自定义 |

### 整数 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `order_no` | `order_no` | Integer | 序号 |
| `push_type` | `push_type` | Integer | 推送方式 |
| `social_mctype` | `social_mctype` | Integer | 社会化管控类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dr` | `dr` | Short | 逻辑删除标记 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 名称 |
| `remarks` | `remarks` | String | 备注 |

### other (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | b2d0e889-07dd-4cec-8c8a-6fe4ccc30681 | 业务事项拉取日常发生数据参数 |
| `` | `` | a8aebb91-bbb9-4fd0-bb90-110527ea90a0 | 业务事项关结账数据参数 |
