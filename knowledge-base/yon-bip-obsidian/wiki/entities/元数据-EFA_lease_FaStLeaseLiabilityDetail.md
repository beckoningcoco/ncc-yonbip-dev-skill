---
tags: [BIP, 元数据, 数据字典, EFA.lease.FaStLeaseLiabilityDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计提短期租赁负债明细 (`EFA.lease.FaStLeaseLiabilityDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_st_lease_liability_dtl` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`d7635db3-f8d9-47c1-9c5f-2ef5b51638b7`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计提短期租赁负债明细 |
| 物理表 | `fa_st_lease_liability_dtl` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 30 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ori_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `ytenant_id` | `` |
| `acc_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `fa_st_lease_liability_id` | `` |
| `lessor_id` | `yssupplier.aa_vendor` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 30 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_post_failure_reason` | `busi_post_failure_reason` | `busiPostFailureReason` | 过账失败原因 |
| `contract_no` | `contract_no` | `contractNo` | 合同号 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_currtype_id` | `acc_currtype_id` | `accCurrtypeId` | 本币币种 |
| `asset_id` | `asset_id` | `assetId` | 固定资产卡片 |
| `fa_st_lease_liability_id` | `fa_st_lease_liability_id` | `faStLeaseLiabilityId` | 计提短期租赁负债主表ID |
| `lessor_id` | `lessor_id` | `lessorId` | 出租方 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币币种 |
| `ori_currtype_id` | `ori_currtype_id` | `oriCurrtypeId` | 原币币种 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_rate_ops` | `acc_rate_ops` | `accRateOps` | 本币汇率折算方式 |
| `org_rate_ops` | `org_rate_ops` | `orgRateOps` | 组织币汇率折算方式 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_post_status` | `busi_post_status` | `busiPostStatus` | 过账状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_rate` | `acc_rate` | `accRate` | 本币汇率 |
| `acc_rent_amount` | `acc_rent_amount` | `accRentAmount` | 本币租金合计 |
| `acc_st_rent_amount` | `acc_st_rent_amount` | `accStRentAmount` | 本币短期租金合计 |
| `acc_unre_financing_charge` | `acc_unre_financing_charge` | `accUnreFinancingCharge` | 本币短期未确认融资费用 |
| `org_rate` | `org_rate` | `orgRate` | 组织币汇率 |
| `org_rent_amount` | `org_rent_amount` | `orgRentAmount` | 组织币租金合计 |
| `org_st_rent_amount` | `org_st_rent_amount` | `orgStRentAmount` | 组织币短期租金合计 |
| `org_unre_financing_charge` | `org_unre_financing_charge` | `orgUnreFinancingCharge` | 组织币短期未确认融资费用 |
| `ori_rent_amount` | `ori_rent_amount` | `oriRentAmount` | 原币租金合计 |
| `ori_st_rent_amount` | `ori_st_rent_amount` | `oriStRentAmount` | 原币短期租金合计 |
| `ori_unre_financing_charge` | `ori_unre_financing_charge` | `oriUnreFinancingCharge` | 原币短期未确认融资费用 |
