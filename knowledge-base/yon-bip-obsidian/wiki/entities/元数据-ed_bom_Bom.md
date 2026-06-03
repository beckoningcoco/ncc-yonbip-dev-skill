---
tags: [BIP, 元数据, 数据字典, ed.bom.Bom]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成品信息 (`ed.bom.Bom`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ed_bom` | domain：`engineeringdata` | 应用：`ED` | 业务对象ID：`f17dc38c-af3c-4f1e-aca9-95b3aa38b0c9`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成品信息 |
| 物理表 | `ed_bom` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 直连字段 | 106 个 |
| 子表 | 6 个 |
| 关联引用 | 30 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bomApplyrange` | `ed.bom.BomApplyrange` | composition |
| `bomByproduct` | `ed.bom.BomByproduct` | composition |
| `bomAttrextItem` | `ed.bom.BomAttrextItem` | composition |
| `bomUserdefItem` | `ed.bom.BomUserdefItem` | composition |
| `bomComponentRuleDetail` | `ed.bom.BomComponentRuleDetail` | composition |
| `bomComponent` | `ed.bom.BomComponent` | composition |

## 关联引用 (30个)

| 字段名 | 引用类型 |
|--------|---------|
| `produce_unit_id` | `productcenter.pc_productassitunitsref` |
| `submitter` | `` |
| `agent_id` | `` |
| `` | `` |
| `wbs` | `` |
| `subcontract_vendor_id` | `` |
| `org_id` | `ucf-org-center.bd_factoryorg` |
| `bom_unit_id` | `` |
| `variantconfigcts_id` | `` |
| `bom_free_cts` | `` |
| `withdrawpp` | `` |
| `trans_type_id` | `` |
| `sku_id` | `productcenter.productskuref` |
| `tenant_id` | `` |
| `product_id` | `` |
| `ytenant_id` | `` |
| `bom_sensitive` | `` |
| `use_type` | `engineeringdata.ed_use_type_ref` |
| `bom_define_character` | `` |
| `admin_org_id` | `` |

## 继承接口 (1个, 1字段)

- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 106 个直连字段

### 文本字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `engineering_draw_number` | `engineering_draw_number` | `engineeringDrawNumber` | 工程图号 |
| `source_code` | `source_code` | `sourceCode` | 来源单据编码 |
| `source_line_no` | `source_line_no` | `sourceLineNo` | 来源单据行号 |
| `source_src_doc_id` | `source_src_doc_id` | `sourceSrcDocId` | 来源单据ID |
| `from_src_doc_id` | `from_src_doc_id` | `fromSrcDocId` | 来源单据ID |
| `from_code` | `from_code` | `fromCode` | 来源单据编码 |
| `from_line_no` | `from_line_no` | `fromLineNo` | 来源单据行号 |
| `config_no` | `config_no` | `configNo` | 配置号 |
| `variantconfigcts_version` | `variantconfigcts_version` | `variantconfigctsVersion` | 选配结果清单版本 |
| `code` | `code` | `code` | code |
| `erpcode` | `erpcode` | `erpCode` | erpCode |
| `sensitive_uid` | `sensitive_uid` | `sensitiveUID` | BOM敏感域唯一性ID |
| `substitute_flag` | `substitute_flag` | `substituteFlag` | 替代标识 |
| `substitute_description` | `substitute_description` | `substituteDescription` | 替代说明 |
| `remark` | `remark` | `remark` | 备注 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 最后修改人 |
| `` | `auditor` | `auditor` | 审核人 |
| `version_code` | `version_code` | `versionCode` | 版本号 |
| `source_id` | `source_id` | `sourceId` | 来源Id |
| `receive_statu` | `receive_statu` | `receiveStatu` | 接收状态 |
| `version` | `version` | `version` | 版本代号 |
| `version_memo` | `version_memo` | `versionMemo` | 版本说明 |
| `ecn_order_code` | `ecn_order_code` | `ecnOrderCode` | 工程变更单据号 |

### 引用字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `product_id` | `product_id` | `productId` | 物料 |
| `variantconfigcts_id` | `variantconfigcts_id` | `variantconfigctsId` | 选配结果清单ID |
| `trans_type_id` | `trans_type_id` | `transTypeId` | 交易类型 |
| `wbs` | `wbs` | `wbs` | wbs |
| `agent_id` | `agent_id` | `agentId` | 客户id |
| `admin_org_id` | `admin_org_id` | `adminOrgId` | 管理组织 |
| `subcontract_vendor_id` | `subcontract_vendor_id` | `vendorAuth` | 委外供应商权限 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `subcontract_vendor_id` | `subcontract_vendor_id` | `subcontractVendorId` | 委外供应商 |
| `org_id` | `org_id` | `orgId` | 组织id |
| `produce_unit_id` | `produce_unit_id` | `produceUnit` | 生产单位 |
| `sku_id` | `sku_id` | `skuId` | 母件SKUid |
| `bom_unit_id` | `bom_unit_id` | `bomUnit` | 主计量单位id |
| `use_type` | `use_type` | `useTypeId` | 用途ID |
| `product_id` | `product_id` | `productAuth` | 物料权限 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `submitter` | `submitter` | `submitter` | 提交人 |
| `withdrawpp` | `withdrawpp` | `withdrawpp` | 撤回提交的人 |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `vouchdate` | `vouchdate` | `vouchdate` | 单据日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |
| `withdraw_time` | `withdraw_time` | `withdrawTime` | 撤回提交时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quantity_control` | `quantity_control` | `quantityControl` | 按数量控制 |
| `bom_classify` | `bom_classify` | `bomClassify` | bom类别 |
| `is_whole_send` | `is_whole_send` | `isWholeSend` | 整单齐套发料 |
| `rollup` | `rollup` | `rollup` | 默认卷积 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source_src_doc_type` | `source_src_doc_type` | `sourceSrcDocType` | 来源单据类型 |
| `bom_type` | `bom_type` | `bomType` | BOM类别 |
| `printCount` | `printCount` | `printCount` | 打印次数 |

### 短整数 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_process` | `is_process` | `isProcess` | 是否过程中bom |
| `is_revising` | `is_revising` | `isRevising` | 是否展示 |
| `is_change` | `is_change` | `isChange` | 变更中 |
| `change_type` | `change_type` | `changeType` | 换算方式 |
| `newest_ver` | `newest_ver` | `newestVer` | 是否最新版本 |
| `` | `status` | `status` | 状态 |
| `is_whole_report` | `is_whole_report` | `isWholeReport` | 齐套分析 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `source_type` | `source_type` | `sourceType` | 来源类型 |
| `is_revised` | `is_revised` | `isRevised` | 是否经过修订 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allocation_source_id` | `allocation_source_id` | `allocationSourceId` | 分配来源Id |
| `original_id` | `original_id` | `originalId` | 修订源 |
| `id` | `id` | `id` | 母件信息表关联标识 |
| `material_id` | `material_id` | `materialId` | 母件id |
| `` | `tplid` | `tplid` | 模板id |
| `ecn_order_id` | `ecn_order_id` | `ecnOrderId` | 工程变更单id |
| `ecn_order_detail_id` | `ecn_order_detail_id` | `ecnOrderDetailId` | 变更明细id  |
| `parent_id` | `parent_id` | `parentId` | 公用BOMId |
| `activity` | `activity` | `activity` | 项目活动id |

### 数值字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `from_quantity` | `from_quantity` | `fromQuantity` | 从数量 |
| `to_quantity` | `to_quantity` | `toQuantity` | 到数量 |
| `change_rate` | `change_rate` | `changeRate` | 换算率 |
| `produce_batch` | `produce_batch` | `produceBatch` | 生产单位批量 |
| `scrap` | `scrap` | `scrap` | 废品率(%) |
| `batch` | `batch` | `batch` | 批量 |
| `ecn_line_no` | `ecn_line_no` | `ecnLineNo` | 工厂变更单行号 |
| `change_rate_den` | `change_rate_den` | `changeRateDen` | 换算率分母 |
| `change_rate_num` | `change_rate_num` | `changeRateNum` | 换算率分子 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_define_character` | `bom_define_character` | `bomDefineCharacter` | 自定义项特征属性组 |

### FreeCT (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_free_cts` | `bom_free_cts` | `bomFreeCts` | BOM自由项特征组自定义项实体 |
| `bom_sensitive` | `bom_sensitive` | `bomSensitive` | BOM敏感域自定义项实体 |

### timestamp (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 最后修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审核时间 |
| `effective_date` | `effective_date` | `effectiveDate` | 生效时间 |
| `expiry_date` | `expiry_date` | `expiryDate` | 失效时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bomApplyrange` | BOM适用范围 |
| `` | `` | `bomAttrextItem` | 表头自由自定义项 |
| `` | `` | `bomByproduct` | 产出品 |
| `` | `` | `bomComponent` | 子件信息 |
| `` | `` | `bomComponentRuleDetail` | BOM子件规则明细 |
| `` | `` | `bomUserdefItem` | 表头固定自定义项 |
