---
tags: [BIP, 元数据, 数据字典, GL.rulevoucher.fiVtCashflow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 规则凭证现金流量定义子表 (`GL.rulevoucher.fiVtCashflow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_vt_cashflow` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`7b4c8f89-c22b-45b7-beca-0834bdafea6a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 规则凭证现金流量定义子表 |
| 物理表 | `fi_vt_cashflow` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 19 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `vthead` | `` |
| `creator` | `` |
| `modifier` | `` |
| `ytenant_id` | `` |
| `vtbody` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `innerorg` | `innerorg` | `innerorg` | 内部单位 |
| `cashflowitem_m` | `cashflowitem_m` | `cashflowitemM` | 主表项目 |
| `cashflowitem_s` | `cashflowitem_s` | `cashflowitemS` | 附表项目 |
| `amountsource` | `amountsource` | `amountsource` | 取值金额来源 |
| `sourcetype` | `sourcetype` | `sourcetype` | 来源类型 |
| `srctplid` | `srctplid` | `srctplid` | 来源id |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
| `tenantid` | `tenantid` | `tenantid` | 租户id |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vthead` | `vthead` | `vthead` | 辅助子表id |
| `vtbody` | `vtbody` | `vtbody` | 辅助子表id |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `ts` | 最新修改时间 |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amountorg` | `amountorg` | `amountorg` | 本币金额 |
| `amountoriginal` | `amountoriginal` | `amountoriginal` | 原币金额 |
| `rate` | `rate` | `rate` | 百分比 |
