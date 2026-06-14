---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clmContractFileConfigDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同文件配置明细 (`CLM.clmContract.clmContractFileConfigDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_contractfile_config_detail` | domain：`yonbip-ec-contract` | 应用：`CLM` | 业务对象ID：`cd7562fe-0c1c-4faf-96e3-c77e0009a106`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同文件配置明细 |
| 物理表 | `clm_contractfile_config_detail` |
| domain/服务域 | `yonbip-ec-contract` |
| schema | `yonbip_clm_contract` |
| 所属应用 | `CLM` |
| 直连字段 | 18 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `clmContractFilePhaseDetailList` | `CLM.clmContract.clmContractFilePhaseDetail` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `clmContractFileConfig_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `basefile_bussinessid` | `basefile_bussinessid` | `basefileBussinessid` | 基准文件业务id |
| `basefile_fileid` | `basefile_fileid` | `basefileFileid` | 基准文件文件id |
| `doc_def_class` | `doc_def_class` | `docDefClass` | 文件性质 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clmContractFileConfig_id` | `clmContractFileConfig_id` | `clmContractFileConfig_id` | 合同文本对象配置 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `attachment_class` | `attachment_class` | `attachmentClass` | 正文附件分类 |
| `file_class` | `file_class` | `fileClass` | 文件分类 |
| `file_make_way` | `file_make_way` | `fileMakeWay` | 文件生成方式 |
| `must_upload` | `must_upload` | `mustUpload` | 是否必传 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `clmContractFilePhaseDetailList` | 合同文件配置阶段明细 |

### multipleOption (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `file_extention` | `file_extention` | `fileExtention` | 文件后缀 |
