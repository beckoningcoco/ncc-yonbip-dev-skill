---
tags: [BIP, 元数据, 数据字典, eeac.fievent.FiEventVouchParamsDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 凭证生成参数 (`eeac.fievent.FiEventVouchParamsDO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`eac_fi_event_voucher_params` | domain：`yonbip-fi-eeac` | 应用：`EVNT` | 业务对象ID：`a5ab97f9-622b-4324-b08d-cff08fa99aea`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 凭证生成参数 |
| 物理表 | `eac_fi_event_voucher_params` |
| domain/服务域 | `yonbip-fi-eeac` |
| schema | `fieeac` |
| 所属应用 | `EVNT` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `fi_event_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |

## 继承接口 (3个, 6字段)

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

> 共 15 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accpurpose_id` | `accpurpose_id` | `accpurposeId` | 核算目的 |
| `bln_gen_voucher` | `bln_gen_voucher` | `blnGenVoucher` | 处理方式 |
| `condition` | `condition` | `condition` | 条件 |
| `id` | `id` | `id` | 主键 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源id |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `fi_event_id` | `fi_event_id` | `fiEventId` | 会计事务 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
