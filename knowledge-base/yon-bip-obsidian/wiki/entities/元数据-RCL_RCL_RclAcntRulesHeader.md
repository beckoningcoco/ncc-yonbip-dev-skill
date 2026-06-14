---
tags: [BIP, 元数据, 数据字典, RCL.RCL.RclAcntRulesHeader]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收入规则基本信息 (`RCL.RCL.RclAcntRulesHeader`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_acntrules_h` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`dc2e82e5-19c3-46cf-b569-a7b4515b32fc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收入规则基本信息 |
| 物理表 | `rcl_acntrules_h` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 28 个 |
| 子表 | 2 个 |
| 关联引用 | 19 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `RclAcntRulesBodyList` | `RCL.RCL.RclAcntRulesBody` | composition |
| `RclAcntRulesHeader_acntFactorsList` | `RCL.RCL.RclAcntRulesHeader_acntFactors` | composition |

## 关联引用 (19个)

| 字段名 | 引用类型 |
|--------|---------|
| `rcl_acntfactor_id2` | `yonbip-fi-ercl.RefTable_373b9c4267` |
| `rcl_acntfactor_id1` | `yonbip-fi-ercl.RefTable_373b9c4267` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `rcl_acntfactor_id6` | `yonbip-fi-ercl.RefTable_373b9c4267` |
| `rcl_acntfactor_id5` | `yonbip-fi-ercl.RefTable_373b9c4267` |
| `rcl_acntfactor_id4` | `yonbip-fi-ercl.RefTable_373b9c4267` |
| `rcl_acntfactor_id10` | `yonbip-fi-ercl.RefTable_373b9c4267` |
| `rcl_acntfactor_id3` | `yonbip-fi-ercl.RefTable_373b9c4267` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `acc_book_id` | `fiepub.fiepub_accountbooktreeref` |
| `rcl_acntfactor_id9` | `yonbip-fi-ercl.RefTable_373b9c4267` |
| `rcl_acntfactor_id8` | `yonbip-fi-ercl.RefTable_373b9c4267` |
| `rcl_acntfactor_id7` | `yonbip-fi-ercl.RefTable_373b9c4267` |
| `acnt_factors` | `yonbip-fi-ercl.RefTable_373b9c4267` |

## 继承接口 (4个, 9字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`

## 字段列表（按类型分组）

> 共 28 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 账簿 |
| `rcl_acntfactor_id1` | `rcl_acntfactor_id1` | `acntFactorsid1` | 影响因素1 |
| `rcl_acntfactor_id10` | `rcl_acntfactor_id10` | `acntFactorsid10` | 影响因素10 |
| `rcl_acntfactor_id2` | `rcl_acntfactor_id2` | `acntFactorsid2` | 影响因素2 |
| `rcl_acntfactor_id3` | `rcl_acntfactor_id3` | `acntFactorsid3` | 影响因素3 |
| `rcl_acntfactor_id4` | `rcl_acntfactor_id4` | `acntFactorsid4` | 影响因素4 |
| `rcl_acntfactor_id5` | `rcl_acntfactor_id5` | `acntFactorsid5` | 影响因素5 |
| `rcl_acntfactor_id6` | `rcl_acntfactor_id6` | `acntFactorsid6` | 影响因素6 |
| `rcl_acntfactor_id7` | `rcl_acntfactor_id7` | `acntFactorsid7` | 影响因素7 |
| `rcl_acntfactor_id8` | `rcl_acntfactor_id8` | `acntFactorsid8` | 影响因素8 |
| `rcl_acntfactor_id9` | `rcl_acntfactor_id9` | `acntFactorsid9` | 影响因素9 |
| `creator` | `creator` | `creator` | 创建人 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体(系统) |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contact_attribute` | `contact_attribute` | `ctAttribute` | 履约义务属性 |
| `enable` | `enable` | `enable` | 档案状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `RclAcntRulesBodyList` | 收入规则明细信息 |
| `` | `` | `RclAcntRulesHeader_acntFactorsList` | 收入规则基本信息与影响因素关联 |

### quoteList (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acnt_factors` | `acnt_factors` | `acntFactors` | 影响因素 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |
