---
tags: [BIP, 元数据, 数据字典, vc.variantconfigcts.VariantConfigCts]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 特征选配单表头 (`vc.variantconfigcts.VariantConfigCts`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`vc_variantconfigcts` | domain：`engineeringdata` | 应用：`ED` | 业务对象ID：`0a5f0dce-2e3d-4301-8bba-72c559542683`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 特征选配单表头 |
| 物理表 | `vc_variantconfigcts` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 直连字段 | 38 个 |
| 子表 | 1 个 |
| 关联引用 | 14 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `vcBomDetail` | `vc.variantconfigcts.VariantConfigBomDetail` | composition |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `conf_id` | `` |
| `vc_option_cts` | `` |
| `iAgentId` | `productcenter.aa_merchantref ` |
| `product_id` | `productcenter.productref` |
| `reserveid` | `` |
| `ytenant_id` | `` |
| `vc_defined_cts` | `` |
| `` | `` |
| `org_id` | `ucf-org-center.bd_inventoryorg_na` |
| `src_org_id` | `` |
| `vc_top_config_id` | `` |
| `tenant_id` | `` |

## 继承接口 (6个, 13字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **预留对象相关** (`st.reservation.IReservationID`)
  - `` → ``
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``

## 字段列表（按类型分组）

> 共 38 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source_src_doc_id` | `source_src_doc_id` | `sourceSrcDocId` | 来源单据id |
| `source_code` | `source_code` | `sourceCode` | 来源单据编码 |
| `source_line_no` | `source_line_no` | `sourceLineNo` | 来源单据行号 |
| `memo` | `memo` | `memo` | 备注 |
| `code` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `src_doc_form_id` | `src_doc_form_id` | `srcDocFormId` | 来源表单号 |
| `version` | `version` | `version` | 版本 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_id` | `org_id` | `orgId` | 库存组织id |
| `product_id` | `product_id` | `productId` | 物料id |
| `iAgentId` | `iAgentId` | `agentId` | 客户id |
| `conf_id` | `conf_id` | `confId` | 配置号 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `reserveid` | `reserveid` | `reserveid` | 跟踪线索id |
| `src_org_id` | `src_org_id` | `srcOrgId` | 来源单据组织 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vc_top_config_id` | `vc_top_config_id` | `vcTopConfigId` | 来源单据物料对应选配参数文件ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source_src_doc_type` | `source_src_doc_type` | `sourceSrcDocType` | 来源单据类型 |
| `src_doc_type` | `src_doc_type` | `srcDocType` | 创建类型 |

### 短整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `order_bom_flag` | `order_bom_flag` | `orderBomFlag` | 已生成订单BOM标识 |
| `derived_material_flag` | `derived_material_flag` | `derivedMaterialFlag` | 已匹配派生物料标识 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `status` | `status` | `status` | 审核状态 |
| `vc_type` | `vc_type` | `vcType` | 选配类型 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `src_doc_id` | `src_doc_id` | `srcDocId` | 来源单据 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vc_defined_cts` | `vc_defined_cts` | `vcDefinedCts` | 自定义项特征组 |

### OptionCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vc_option_cts` | `vc_option_cts` | `vcOptionCts` | 选配项特征组 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vc_config_date` | `vc_config_date` | `vcConfigDate` | 选配日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `vcBomDetail` | 特征选配单物料表体 |
