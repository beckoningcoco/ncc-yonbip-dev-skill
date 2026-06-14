---
tags: [BIP, 元数据, 数据字典, cam.agreement.Agreement_b]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 授信明细 (`cam.agreement.Agreement_b`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_agreement_b` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 授信明细 |
| 物理表 | `cam_agreement_b` |
| domain/服务域 | `yonbip-fi-ctmcam` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `CAM` |
| 直连字段 | 44 个 |
| 子表 | 2 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `agreementDetailOrg` | `cam.agreement.AgreementDetailOrg` | composition |
| `defines` | `cam.agreement.Agreement_bDefine` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `finProducts` | `` |
| `ytenant_id` | `` |
| `agreement_b_character_def` | `` |
| `useEnterprise` | `ucf-org-center.bd_fundsorg_na` |
| `applicationcreditb` | `cam_applicationcreditDet_Ref` |
| `mainid` | `` |
| `creditVarieties` | `cam_creditvariety_ref` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 44 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isOwnAdd` | `isOwnAdd` | `isOwnAdd` | 是否手动添加 |
| `backup` | `backup` | `backup` | 备注 |
| `backup13` | `backup13` | `backup13` | 备用13 |
| `backup14` | `backup14` | `backup14` | 备用14 |
| `backup15` | `backup15` | `backup15` | 备用15 |
| `controlMode` | `controlMode` | `controlMode` | 控制方式 |
| `application_credit_id` | `application_credit_id` | `applicationCreditId` | 授信额度申请id |
| `backup11` | `backup11` | `backup11` | backup11 |
| `backup12` | `backup12` | `backup12` | backup12 |
| `freeze_reason` | `freeze_reason` | `freezeReason` | 冻结原因 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `applicationcreditb` | `applicationcreditb` | `applicationCreditB` | 额度申请单id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `mainid` | `mainid` | `mainid` | 合同id |
| `useEnterprise` | `useEnterprise` | `useEnterprise` | 使用企业id |
| `creditVarieties` | `creditVarieties` | `creditVarieties` | 授信类别id |
| `finProducts` | `finProducts` | `finProducts` | 金融产品id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `freeze` | `freeze` | `freeze` | 冻结 |
| `exclusive` | `exclusive` | `exclusive` | 是否专享 |
| `freeze_type` | `freeze_type` | `freezeType` | 冻结类型 |
| `isAssignable` | `isAssignable` | `isAssignable` | 是否可分配 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 子表id |

### 数值字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `finUnReleaseAmt` | `finUnReleaseAmt` | `finUnReleaseAmt` | 金融产品未释放额度(授信币种) |
| `creditVarietyActualAvailableAmt` | `creditVarietyActualAvailableAmt` | `creditVarietyActualAvailableAmt` | 授信类别实际剩余可用额度 |
| `creditLimitConversion` | `creditLimitConversion` | `creditLimitConversion` | 授信类别限额(折算币种) |
| `creditOccupyAmtConversion` | `creditOccupyAmtConversion` | `creditOccupyAmtConversion` | 类别已用额度(折算币种) |
| `creditRemainingConversion` | `creditRemainingConversion` | `creditRemainingConversion` | 类别剩余额度(折算币种) |
| `finLimitConversion` | `finLimitConversion` | `finLimitConversion` | 金融产品限额(折算币种) |
| `finOccupyAmtConversion` | `finOccupyAmtConversion` | `finOccupyAmtConversion` | 金融已用额度(折算币种) |
| `finRemainingConversion` | `finRemainingConversion` | `finRemainingConversion` | 金融剩余可用额度(折算币种) |
| `finActualConversion` | `finActualConversion` | `finActualConversion` | 金融实际剩余额度(折算币种) |
| `creditVarietiesLimit` | `creditVarietiesLimit` | `creditVarietiesLimit` | 授信类别限额 |
| `creditOccupyAmt` | `creditOccupyAmt` | `creditOccupyAmt` | 已占用额度 |
| `creditRemainingAvailableAmt` | `creditRemainingAvailableAmt` | `creditRemainingAvailableAmt` | 剩余可用额度 |
| `finProductsLimit` | `finProductsLimit` | `finProductsLimit` | 金融产品限额 |
| `finRemainingActualAvailableAmt` | `finRemainingActualAvailableAmt` | `finRemainingActualAvailableAmt` | 金融产品实际剩余可用额度 |
| `finOccupyAmt` | `finOccupyAmt` | `finOccupyAmt` | 已占用额度 |
| `finRemainingAvailableAmt` | `finRemainingAvailableAmt` | `finRemainingAvailableAmt` | 剩余可用额度 |
| `freeze_amt` | `freeze_amt` | `freezeAmt` | 冻结金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agreement_b_character_def` | `agreement_b_character_def` | `agreementBCharacterDef` | 授信合同明细特征 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `agreementDetailOrg` | 授信明细分配组织 |
| `` | `` | `defines` | 授信合同明细自定义项 |
