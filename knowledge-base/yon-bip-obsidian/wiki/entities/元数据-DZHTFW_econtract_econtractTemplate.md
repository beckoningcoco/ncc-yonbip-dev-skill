---
tags: [BIP, 元数据, 数据字典, DZHTFW.econtract.econtractTemplate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 电子合同模板 (`DZHTFW.econtract.econtractTemplate`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`contract_template` | domain：`iuap-apcom-contract` | 应用：`DZHTFW` | 业务对象ID：`d4386dba-a059-4f45-923b-65eddf4d1374`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子合同模板 |
| 物理表 | `contract_template` |
| domain/服务域 | `iuap-apcom-contract` |
| schema | `iuap_apcom_contract` |
| 所属应用 | `DZHTFW` |
| 直连字段 | 27 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

## 继承接口 (2个, 5字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name_generate_rule` | `name_generate_rule` | `nameGenerateRule` | 文件名称生成规则 |
| `app_code` | `app_code` | `appCode` | 应用code |
| `code` | `code` | `code` | 模板编码 |
| `contract_object_code` | `contract_object_code` | `contractObjectCode` | 合同对象编码 |
| `create_file_type` | `create_file_type` | `createFileType` | 文件创建类型pdf、word |
| `domain` | `domain` | `domain` | 领域 |
| `org_id` | `org_id` | `orgId` | 组织ID |
| `secret_level` | `secret_level` | `secretLevel` | 密级 |
| `secret_limit` | `secret_limit` | `secretLimit` | 保密期限	 |
| `source_file_key` | `source_file_key` | `sourceFileKey` | 源合同模板文件key |
| `temp_source` | `temp_source` | `tempSource` | 模板来源 |
| `template_category` | `template_category` | `templateCategory` | 模板分类 |
| `template_desc` | `template_desc` | `templateDesc` | 描述 |
| `thumbnail_file_key` | `thumbnail_file_key` | `thumbnailFileKey` | 缩略图key |
| `version_id` | `version_id` | `versionId` | 模板最新版本id |
| `id` | `id` | `id` | 主键 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `template_status` | `template_status` | `templatetatus` | 模板状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_sample` | `is_sample` | `isSample` | 是否范本 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `design_mode` | `design_mode` | `designMode` | 设计模式 0 线上 1线下 |

### attachment (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `file_key` | `file_key` | `fileKey` | 文件key |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | pubts |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `template_name` | `template_name` | `templateName` | 模板名称 |
