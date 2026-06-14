---
tags: [BIP, 元数据, 数据字典, fa.faadjust.DeprSubjectChangeBill]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 科目分配变动 (`fa.faadjust.DeprSubjectChangeBill`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_adjust_calc_subject` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`29c21e74-f625-40f2-8c1a-4d479ecc37ab`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 科目分配变动 |
| 物理表 | `fa_bill_adjust_calc_subject` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 29 个 |
| 子表 | 0 个 |
| 关联引用 | 21 个 |

## 关联引用 (21个)

| 字段名 | 引用类型 |
|--------|---------|
| `accum_imp_subject_id` | `fiepub.fiepub_accsubjectref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `add_depr_subject_id` | `fiepub.fiepub_accsubjectref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `accum_depr_subject_id` | `fiepub.fiepub_accsubjectref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `calculate_id` | `` |
| `disposal_gain_subject_id` | `fiepub.fiepub_accsubjectref` |
| `subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `ytenant_id` | `` |
| `adjustbase_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `accsubject_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `disposal_loss_subject_id` | `fiepub.fiepub_accsubjectref` |
| `disposal_subject_id` | `fiepub.fiepub_accsubjectref` |
| `clean_cost_subject_id` | `fiepub.fiepub_accsubjectref` |
| `imp_loss_subject_id` | `fiepub.fiepub_accsubjectref` |
| `add_tax_subject_id` | `fiepub.fiepub_accsubjectref` |
| `ori_amount_subject_id` | `fiepub.fiepub_accsubjectref` |
| `add_reserve_subject_id` | `fiepub.fiepub_accsubjectref` |
| `clean_income_subject_id` | `fiepub.fiepub_accsubjectref` |

## 字段列表（按类型分组）

> 共 29 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `direction` | `direction` | `direction` | 方向 |
| `src_accsubject_id` | `src_accsubject_id` | `srcDeprSubjectId` | 来源固定资产科目分配ID |
| `asset_calc_id` | `asset_calc_id` | `srcCalculateId` | 来源固定资产核算信息ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `adjustbase_id` | `adjustbase_id` | `adjustbaseId` | 基本信息调整主表 |
| `calculate_id` | `calculate_id` | `calculateId` | 核算信息ID |
| `subject_vid` | `subject_vid` | `subjectVid` | 折旧费用科目 |
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `add_depr_subject_id` | `add_depr_subject_id` | `adddeprSubjectId` | 附加折旧费用科目 |
| `add_reserve_subject_id` | `add_reserve_subject_id` | `addreserveSubjectId` | 附加准备金科目 |
| `clean_cost_subject_id` | `clean_cost_subject_id` | `cleancostSubjectId` | 清理费用科目 |
| `clean_income_subject_id` | `clean_income_subject_id` | `cleanincomeSubjectId` | 清理收入科目 |
| `creator` | `creator` | `creator` | 创建人 |
| `accum_depr_subject_id` | `accum_depr_subject_id` | `deprSubjectId` | 累计折旧科目 |
| `disposal_subject_id` | `disposal_subject_id` | `disposalSubjectId` | 清理科目 |
| `disposal_gain_subject_id` | `disposal_gain_subject_id` | `disposalgainSubjectId` | 处置收益科目 |
| `disposal_loss_subject_id` | `disposal_loss_subject_id` | `disposallossSubjectId` | 处置损失科目 |
| `accum_imp_subject_id` | `accum_imp_subject_id` | `impSubjectId` | 累计减值科目 |
| `imp_loss_subject_id` | `imp_loss_subject_id` | `implossSubjectId` | 减值损失科目 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ori_amount_subject_id` | `ori_amount_subject_id` | `orivalueSubjectId` | 原值科目 |
| `accsubject_id` | `accsubject_id` | `subjectId` | 折旧费用科目-原始版本 |
| `add_tax_subject_id` | `add_tax_subject_id` | `taxSubjectId` | 增值税科目 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
