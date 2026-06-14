---
tags: [BIP, 元数据, 数据字典, les.carrier.carrier]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 承运商 (`les.carrier.carrier`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ils_les_carrier` | domain：`IMP-ILSBD` | 应用：`DPMSI` | 业务对象ID：`a1ea1c31-600f-4f13-a7eb-021464cf5252`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 承运商 |
| 物理表 | `ils_les_carrier` |
| domain/服务域 | `IMP-ILSBD` |
| schema | `ils_les` |
| 所属应用 | `DPMSI` |
| 直连字段 | 34 个 |
| 子表 | 2 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `carrierRelationList` | `les.carrier.carrierRelation` | composition |
| `defines` | `les.carrier.carrierDefine` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `supplier` | `yssupplier.aa_vendor` |
| `definect` | `` |

## 继承接口 (1个, 9字段)

- **承运商扩展接口** (`les.carrier.carrierExtand`)
  - `dangerouslicence` → `dangerouslicence`
  - `email` → `email`
  - `endbill` → `endbill`
  - `fax` → `fax`
  - `generatebill` → `generatebill`
  - `shortname` → `shortname`
  - `startbill` → `startbill`
  - `taxpayerlicence` → `taxpayerlicence`
  - `transportlicence` → `transportlicence`

## 字段列表（按类型分组）

> 共 34 个直连字段

### 文本字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `name` | `name` | `name` | 名称 |
| `shortname` | `shortname` | `shortname` | 简称 |
| `license` | `license` | `license` | 营业执照 |
| `legalperson` | `legalperson` | `legalperson` | 法人 |
| `ymsenc_legalpersonIdentity` | `ymsenc_legalpersonIdentity` | `ymsenc_legalpersonIdentity` | 法人身份证 |
| `contacts` | `contacts` | `contacts` | 联系人 |
| `ymsenc_contactsphone` | `ymsenc_contactsphone` | `ymsenc_contactsphone` | 联系电话 |
| `email` | `email` | `email` | 邮箱 |
| `fax` | `fax` | `fax` | 传真 |
| `address` | `address` | `address` | 地址 |
| `benable` | `benable` | `benable` | 启用状态 |
| `remark` | `remark` | `remark` | 备注 |
| `transportlicence` | `transportlicence` | `transportlicence` | 运输经营许可证 |
| `dangerouslicence` | `dangerouslicence` | `dangerouslicence` | 危险货物运输许可证 |
| `taxpayerlicence` | `taxpayerlicence` | `taxpayerlicence` | 一般纳税人证 |
| `contactsphone` | `contactsphone` | `contactsphone` | 联系电话(废弃) |
| `legalpersonIdentity` | `legalpersonIdentity` | `legalpersonIdentity` | 法人身份证(废弃) |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `supplier` | `supplier` | `supplier` | 关联供应商 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `startbill` | `startbill` | `startbill` | 账单开始日 |
| `endbill` | `endbill` | `endbill` | 账单结束日 |
| `generatebill` | `generatebill` | `generatebill` | 账单生成日 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 删除状态 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 承运商自定义项 |
| `` | `` | `carrierRelationList` | 承运关系 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `definect` | `definect` | `definect` | 自定义项特征组 |
