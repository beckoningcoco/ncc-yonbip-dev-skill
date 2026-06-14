---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clmContractFileDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同文本对象明细 (`CLM.clmContract.clmContractFileDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_contractfile_detail` | domain：`yonbip-ec-contract` | 应用：`CLM` | 业务对象ID：`90e8f765-9e16-49e4-8e6a-bda0de99e9a6`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同文本对象明细 |
| 物理表 | `clm_contractfile_detail` |
| domain/服务域 | `yonbip-ec-contract` |
| schema | `yonbip_clm_contract` |
| 所属应用 | `CLM` |
| 直连字段 | 24 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `clmphaseDetail_id` | `` |
| `contract_template_id` | `iuap-apcom-contract.econtractTemplateRef` |
| `clmContractFile_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `clmconfigDetail_id` | `` |
| `ytenant_id` | `` |
| `extraction_result_id` | `` |

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

> 共 24 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_sample_id` | `contract_sample_id` | `contractSampleId` | 合同范本id |
| `contract_template_version_id` | `contract_template_version_id` | `contractTemplateVersionId` | 模板版本id |
| `doc_def_class` | `doc_def_class` | `docDefClass` | 文件性质 |
| `file_bussinessid` | `file_bussinessid` | `fileBussinessid` | 协同文件业务id |
| `file_name` | `file_name` | `fileName` | 文件名称 |
| `fileid` | `fileid` | `fileid` | 协同文件id |
| `id` | `id` | `id` | 主键 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clmContractFile_id` | `clmContractFile_id` | `clmContractFile_id` | 合同文本对象 |
| `clmconfigDetail_id` | `clmconfigDetail_id` | `clmconfigDetail_id` | 配置明细 |
| `clmphaseDetail_id` | `clmphaseDetail_id` | `clmphaseDetail_id` | 阶段明细 |
| `contract_template_id` | `contract_template_id` | `contractTemplateId` | 模板id |
| `extraction_result_id` | `extraction_result_id` | `extractionResultId` | 抽取结果id |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `attachment_class` | `attachment_class` | `attachmentClass` | 正文附件分类 |
| `file_class` | `file_class` | `fileClass` | 文件分类 |
| `file_extention` | `file_extention` | `fileExtention` | 文件后缀 |
| `file_make_way` | `file_make_way` | `fileMakeWay` | 生成方式 |
| `file_phase` | `file_phase` | `filePhase` | 文件阶段 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
