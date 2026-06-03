---
tags: [BIP, 元数据, 数据字典, prjc.projectapply.ProjectApplyDeliveryList]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 立项单交付清单 (`prjc.projectapply.ProjectApplyDeliveryList`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prjc_projectapply_deliverylist` | domain：`yonbip-pm-projectme` | 应用：`PRJC` | 业务对象ID：`4a03f6c9-5bfa-45cf-999a-ece9d5154b9d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 立项单交付清单 |
| 物理表 | `prjc_projectapply_deliverylist` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `PRJC` |
| 直连字段 | 42 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `product_id` | `productcenter.baseProductRef` |
| `deliverylist_define_character` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `sale_order_id` | `udinghuo.voucher_orderlistref` |
| `ytenant_id` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref_na` |
| `project_apply_id` | `` |
| `define_characteristics` | `` |
| `sale_order_object_id` | `developplatform.RefTable_5f2b718276` |
| `contract_id` | `developplatform.XXHT` |
| `tax_rate_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `fin_org_id` | `ucf-org-center.bd_financeorgtreeref_na` |
| `sku_id` | `productcenter.productskuref` |
| `cqt_unit_id` | `productcenter.pc_unitref_new` |

## 继承接口 (5个, 19字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 42 个直连字段

### 文本字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_object_id` | `contract_object_id` | `contractObjectId` | 合同标的ID |
| `memo` | `memo` | `memo` | 备注 |
| `id` | `id` | `id` | 主键 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_id` | `contract_id` | `contractId` | 合同ID |
| `cqt_unit_id` | `cqt_unit_id` | `cqtUnitId` | 计价单位 |
| `fin_org_id` | `fin_org_id` | `finOrgId` | 开票组织 |
| `org_id` | `org_id` | `orgId` | 立项企业 |
| `product_id` | `product_id` | `productId` | 产品 |
| `project_apply_id` | `project_apply_id` | `projectApplyId` | 立项申请单 |
| `sale_order_id` | `sale_order_id` | `saleOrderId` | 销售订单 |
| `sale_order_object_id` | `sale_order_object_id` | `saleOrderObjectId` | 销售订单详情 |
| `sku_id` | `sku_id` | `skuId` | SKU |
| `tax_rate_id` | `tax_rate_id` | `taxRateId` | 税率id |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `e_order_relate_pm_flag` | `e_order_relate_pm_flag` | `eOrderRelatePmFlag` | 销售订单关联标识 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `qty` | `qty` | `qty` | 数量 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |
| `total_mny` | `total_mny` | `totalMny` | 无税总价 |
| `total_tax_mny` | `total_tax_mny` | `totalTaxMny` | 含税总价 |
| `unit_price` | `unit_price` | `unitPrice` | 无税单价 |
| `unit_tax_price` | `unit_tax_price` | `unitTaxPrice` | 含税单价 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_characteristics` | `define_characteristics` | `defineCharacteristics` | 交付清单自定义项特征组属性 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `deliverylist_define_character` | `deliverylist_define_character` | `deliveryListBillDefineCharacter` | 交付清单自定义项特征属性 |
