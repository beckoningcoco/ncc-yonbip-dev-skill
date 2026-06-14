---
tags: [BIP, metadata, CLM, contract, clmContractIntegrateConfig]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同集成配置 (CLM.clmConfigure.clmContractIntegrateConfig)

> Platform: BIP V5 | CLM | Table: clm_contract_integrate_config | Schema: yonbip-ec-contract

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 合同集成配置 |
| uri | CLM.clmConfigure.clmContractIntegrateConfig |
| tableName | clm_contract_integrate_config |
| domain | yonbip-ec-contract |
| schema | `yonbip_clm_contract` |
| applicationCode | CLM |
| superUri | iuap.busiObj.BizObject |
| isBusinessObject | true |

## Key/Code/Name

| Role | Column |
|------|--------|
| key | id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 逻辑删除 (LogicDelete) | iuap.busiObj.LogicDelete |
| 2 | 统一租户接口 (IYTenant) | iuap.busiObj.IYTenant |
| 3 | 审计信息 (IAuditInfo) | iuap.busiObj.IAuditInfo |
| 4 | 档案状态 (IEnable) | iuap.busiObj.IEnable |

---

## All Fields (16)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | billtype | 单据类型 | billtype | quote | bd.bill.BillTypeVO |  |  | isExtenal,nullable |
| 2 | bustype | 交易类型 | bustype | quote | bd.bill.TransType |  |  | isExtenal,nullable |
| 3 | clmContractIntegrateOptionList | 合同集成配置项 | - | - | CLM.clmConfigure.clmContractIntegrateOption |  |  |  |
| 4 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 5 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 6 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 7 | dr | 逻辑删除 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 8 | enable | 档案状态 | enable | singleOption | bd.systemEnum.sys_intboolean |  |  | nullable,uiDesign |
| 9 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 10 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 11 | mixProduct | 融合产品 | mix_product | singleOption | unitfyEnum.CLM.clmContractIntegrateProduct |  |  | isExtenal,nullable |
| 12 | mixProductBilltype | 融合产品的单据类型 | mix_product_billtype | singleOption | unitfyEnum.CLM.clmContractlntegrateProductBilltype |  |  | isExtenal,nullable |
| 13 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 14 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 15 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 16 | ytenantId | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | billtype | 单据类型 | billtype | bd.bill.BillTypeVO |
| 2 | bustype | 交易类型 | bustype | bd.bill.TransType |
| 3 | creator | 创建人 | creator | base.user.BipUser |
| 4 | modifier | 修改人 | modifier | base.user.BipUser |
| 5 | ytenantId | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Enum Fields (3)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | enable | 档案状态 | enable | bd.systemEnum.sys_intboolean |
| 2 | mixProduct | 融合产品 | mix_product | clmContractIntegrateProduct |
| 3 | mixProductBilltype | 融合产品的单据类型 | mix_product_billtype | clmContractlntegrateProductBilltype |

---

## Number Fields (1)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | dr | 逻辑删除 | dr | short |

---

## Date Fields (5)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | createTime | 创建时间 | create_time | dateTime |
| 2 | disablets | 停用时间 | disablets | dateTime |
| 3 | enablets | 启用时间 | enablets | dateTime |
| 4 | modifyTime | 修改时间 | modify_time | dateTime |
| 5 | pubts | 时间戳 | pubts | dateTime |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | clmContractIntegrateOptionList | 合同集成配置项 | CLM.clmConfigure.clmContractIntegrateOption |

---

## Enum Value Details

### 档案状态 (enable) -> enable
> Enum: bd.systemEnum.sys_intboolean

| code | value | name |
|------|-------|------|
| 0 | 0 | 停用 |
| 1 | 1 | 启用 |

### 融合产品 (mixProduct) -> mix_product
> Enum: unitfyEnum.CLM.clmContractIntegrateProduct

| code | value | name |
|------|-------|------|
| 1 | 1 | 高级版 |

### 融合产品的单据类型 (mixProductBilltype) -> mix_product_billtype
> Enum: unitfyEnum.CLM.clmContractlntegrateProductBilltype

| code | value | name |
|------|-------|------|
| Z2 | Z2 | 采购合同 |
| Z3 | Z3 | 销售合同 |
| FCT1 | FCT1 | 付款合同 |
| FCT2 | FCT2 | 收款合同 |
