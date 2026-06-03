---
tags: [BIP, 元数据, 数据字典, iuap-apcom-contract.iuap-apcom-contract.fileMessage]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 文件信息表 (`iuap-apcom-contract.iuap-apcom-contract.fileMessage`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`file_message` | domain：`iuap-apcom-contract` | 应用：`iuap-apcom-contract` | 业务对象ID：`a318d25e-b5e4-4ac0-95f1-7b9bbc04db7e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 文件信息表 |
| 物理表 | `file_message` |
| 数据库 schema | `iuap-apcom-contract` |
| 所属应用 | `iuap-apcom-contract` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `tenant_id` | `` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `file_id` | `file_id` | `fileId` | 协同文件id |
| `file_key` | `file_key` | `fileKey` | 主键id |
| `file_name` | `file_name` | `fileName` | 文件名称 |
| `file_path` | `file_path` | `filePath` | 文件地址 |
| `file_storage_mode` | `file_storage_mode` | `fileStorageMode` | 文件存储方式 |
| `operator` | `operator` | `operator` | 操作人id |
| `provider_file_key` | `provider_file_key` | `providerFileKey` | 第三方文件key |
| `provider_id` | `provider_id` | `providerId` | 运营商标识 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenantId` | 租户id |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `ts` | 时间戳 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `total_page` | `total_page` | `totalPage` | 总页数 |
