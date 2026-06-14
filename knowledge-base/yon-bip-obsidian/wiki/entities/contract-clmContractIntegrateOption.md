---
tags: [BIP, metadata, CLM, contract, clmContractIntegrateOption]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同集成配置项 (CLM.clmConfigure.clmContractIntegrateOption)

> Platform: BIP V5 | CLM | Table: clm_contract_integrate_option | Schema: yonbip-ec-contract

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 合同集成配置项 |
| uri | CLM.clmConfigure.clmContractIntegrateOption |
| tableName | clm_contract_integrate_option |
| domain | yonbip-ec-contract |
| schema | `yonbip_clm_contract` |
| applicationCode | CLM |
| superUri | iuap.busiObj.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 逻辑删除 (LogicDelete) | iuap.busiObj.LogicDelete |
| 2 | 统一租户接口 (IYTenant) | iuap.busiObj.IYTenant |
| 3 | 审计信息 (IAuditInfo) | iuap.busiObj.IAuditInfo |

---

## All Fields (11)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | action | 动作 | action | singleOption | unitfyEnum.CLM.clmContractIntegrateConfigAction |  |  | isExtenal,nullable |
| 2 | clmContractIntegrateConfigId | 合同集成配置 | clm_contract_integrate_config_id | quote | CLM.clmConfigure.clmContractIntegrateConfig |  |  | isExtenal,isFk,nullable |
| 3 | code | 集成方案编码 | code | text | String |  |  | isExtenal,nullable |
| 4 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 5 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 6 | dr | 逻辑删除 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 7 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 8 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 9 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 10 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 11 | ytenantId | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | clmContractIntegrateConfigId | 合同集成配置 | clm_contract_integrate_config_id | CLM.clmConfigure.clmContractIntegrateConfig |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | modifier | 修改人 | modifier | base.user.BipUser |
| 4 | ytenantId | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Enum Fields (1)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | action | 动作 | action | clmContractIntegrateConfigAction |

---

## Enum Value Details

### 动作 (action) -> action
> Enum: unitfyEnum.CLM.clmContractIntegrateConfigAction

| code | value | name |
|------|-------|------|
| 1 | 1 | 保存 |
| 2 | 2 | 仅生效 |
| 3 | 3 | 状态变更 |
| 4 | 4 | 生效推单 |
| 5 | 5 | 采购订单 |
| 6 | 6 | 采购发票 |
| 7 | 7 | 销售订单 |
| 8 | 8 | 销售发票 |
| 9 | 9 | 应收单 |
| 10 | 10 | 应付单 |
