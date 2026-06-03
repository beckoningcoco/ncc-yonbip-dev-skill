---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clm_contract_change_payterm]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同变更付款协议 (`CLM.clmContract.clm_contract_change_payterm`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_contract_change_payterm` | domain：`yonbip-ec-contract` | 应用：`CLM` | 业务对象ID：`18dc7fea-15f6-41e0-9ab9-b14c3e510b5f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同变更付款协议 |
| 物理表 | `clm_contract_change_payterm` |
| 数据库 schema | `yonbip-ec-contract` |
| 所属应用 | `CLM` |
| 直连字段 | 43 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `change_feature` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `clm_contract_change_id` | `yonbip-ec-contract.ClmContractChangeRef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `settle_method` | `productcenter.aa_settlemethodref` |
| `type` | `finbd.bd_paymenttyperef` |
| `pay_start_base` | `ucfbasedoc.bd_paystartbaseref` |

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

> 共 43 个直连字段

### 文本字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `clm_contract_id` | `clm_contract_id` | `contractId` | 合同信息 |
| `feature` | `feature` | `feature` | 原合同特征 |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `id` | `id` | `id` | 主键 |
| `memo` | `memo` | `memo` | 备注 |
| `pay_condition` | `pay_condition` | `payCondition` | 付款条件 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clm_contract_change_id` | `clm_contract_change_id` | `clmContractChange_id` | 合同变更 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `pay_start_base` | `pay_start_base` | `payStartBase` | 起效日期 |
| `settle_method` | `settle_method` | `settleMethod` | 结算方式 |
| `type` | `type` | `type` | 款项类型 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expire_date` | `expire_date` | `expireDate` | 到期日期 |
| `pay_date` | `pay_date` | `payDate` | 实际付款日期 |
| `plan_pay_date` | `plan_pay_date` | `planPayDate` | 计划付款日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `account_unit` | `account_unit` | `accountUnit` | 账期单位 |
| `is_deposit` | `is_deposit` | `isDeposit` | 是否质保金 |
| `is_pre_pay` | `is_pre_pay` | `isPrePay` | 是否预付款 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `account_days` | `account_days` | `accountDays` | 账期天数 |
| `issue_no` | `issue_no` | `issueNo` | 期号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ori_pay_money` | `ori_pay_money` | `oriPayMoney` | 原币实际付款金额 |
| `ori_plan_pay_money` | `ori_plan_pay_money` | `oriPlanPayMoney` | 原币计划付款金额 |
| `pay_money` | `pay_money` | `payMoney` | 本币实际付款金额 |
| `pay_ratio` | `pay_ratio` | `payRatio` | 付款比例 |
| `plan_pay_money` | `plan_pay_money` | `planPayMoney` | 本币计划付款金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_feature` | `change_feature` | `changeFeature` | 变更自定义项 |
