---
tags: [BIP, 元数据, 数据字典, ia.interfaceregister.InterfaceRegister]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 接口注册 (`ia.interfaceregister.InterfaceRegister`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_interface_register` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：`b7eb4463-6459-46c1-80ba-5d8aab7eb340`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 接口注册 |
| 物理表 | `ssc_ia_interface_register` |
| domain/服务域 | `yonbip-mid-sscia` |
| schema | `intelligent_audit` |
| 所属应用 | `ZNSH` |
| 直连字段 | 33 个 |
| 子表 | 2 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `interfaceRetRegisters` | `ia.interfaceregister.InterfaceRetRegister` | composition |
| `interfaceParamRegisters` | `ia.interfaceregister.InterfaceParamRegister` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |

## 字段列表（按类型分组）

> 共 33 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `api_protocol` | `api_protocol` | `apiProtocol` | 接口协议 |
| `applicable_scenarios_new` | `applicable_scenarios_new` | `applicableScenarios` | 适用场景 1-智能审核 2-智能巡检 3-风险项检查 |
| `bill_type` | `bill_type` | `billType` | 单据类型 |
| `business_obj` | `business_obj` | `businessObj` | 业务对象 |
| `code` | `code` | `code` | 接口编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `domain` | `domain` | `domain` | 领域 |
| `domain_name_resId` | `domain_name_resId` | `domainNameResId` | 领域名称多语资源 |
| `id` | `id` | `id` | 主键id |
| `` | `modifier` | `modifier` | 修改人名称 |
| `name_resId` | `name_resId` | `nameResId` | 接口名多语资源 |
| `remark` | `remark` | `remark` | 接口描述 |
| `url` | `url` | `url` | 接口地址 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_async` | `is_async` | `isAsync` | 是否异步,默认0同步,异步为1 |
| `preset_tag` | `preset_tag` | `presetTag` | 预置标记 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `err_strategy` | `err_strategy` | `errStrategy` | 异常处理策略 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `retry` | `retry` | `retry` | 重试次数 |
| `timeout` | `timeout` | `timeout` | 超时时间 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `domain_name` | `domain_name` | `domainName` | 领域名称 |
| `name` | `name` | `name` | 接口名称 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `interfaceParamRegisters` | 接口入参 |
| `` | `` | `interfaceRetRegisters` | 接口返回值 |
