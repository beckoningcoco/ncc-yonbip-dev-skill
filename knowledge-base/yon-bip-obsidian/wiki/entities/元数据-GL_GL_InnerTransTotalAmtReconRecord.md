---
tags: [BIP, 元数据, 数据字典, GL.GL.InnerTransTotalAmtReconRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 总额对账历史 (`GL.GL.InnerTransTotalAmtReconRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_inner_trans_total_amt_recon_record` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`63914267-0811-4324-9f3c-56bd6f3ede91`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 总额对账历史 |
| 物理表 | `gl_inner_trans_total_amt_recon_record` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 48 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `ori_currency` | `ucfbasedoc.bd_currencytenantref` |
| `own_accsubject` | `fiepub.fiepub_accsubjectref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `executor` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `opp_accbook` | `fiepub.fiepub_accountbookref` |
| `opp_accsubject` | `fiepub.fiepub_accsubjectref` |
| `own_accbook` | `fiepub.fiepub_accountbookref` |
| `ytenant_id` | `` |

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

> 共 48 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `summary_id` | `summary_id` | `summaryId` | 查询条件维度key |
| `opp_aux_name` | `opp_aux_name` | `oppAuxName` | 对方辅助核算名称 |
| `own_aux_name` | `own_aux_name` | `ownAuxName` | 本方辅助核算名称 |
| `remark` | `remark` | `remark` | 对符失败原因 |
| `matched_id` | `matched_id` | `matchedId` | 批次号 |
| `own_make_time_start` | `own_make_time_start` | `ownMakeTimeStart` | 本方制单开始日期 |
| `own_make_time_end` | `own_make_time_end` | `ownMakeTimeEnd` | 本方制单结束日期 |
| `opp_make_time_start` | `opp_make_time_start` | `oppMakeTimeStart` | 对方制单开始日期 |
| `opp_make_time_end` | `opp_make_time_end` | `oppMakeTimeEnd` | 对方制单结束日期 |
| `rule_id` | `rule_id` | `ruleId` | 对账规则 |
| `own_aux_key` | `own_aux_key` | `ownAuxKey` | 本方辅助项 |
| `opp_aux_key` | `opp_aux_key` | `oppAuxKey` | 对方辅助项 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `executor` | `executor` | `executor` | 执行人 |
| `ori_currency` | `ori_currency` | `oriCurrency` | 原币币种 |
| `own_accbook` | `own_accbook` | `ownAccbook` | 本方账簿 |
| `own_accsubject` | `own_accsubject` | `ownAccsubject` | 本方科目 |
| `opp_accbook` | `opp_accbook` | `oppAccbook` | 对方账簿 |
| `opp_accsubject` | `opp_accsubject` | `oppAccsubject` | 对方科目 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `execute_time` | `execute_time` | `executeTime` | 执行时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contain_un_tally` | `contain_un_tally` | `containUnTally` | 是否包含未记账 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `match_status` | `match_status` | `matchStatus` | 对符状态 |
| `recon_direction` | `recon_direction` | `reconDirection` | 对账方向 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `own_close_bal_qty` | `own_close_bal_qty` | `ownCloseBalQty` | 本方期末数量 |
| `own_close_bal_ori` | `own_close_bal_ori` | `ownCloseBalOri` | 本方期末原币金额 |
| `own_close_bal_org` | `own_close_bal_org` | `ownCloseBalOrg` | 本方期末组织币金额 |
| `own_close_bal_local` | `own_close_bal_local` | `ownCloseBalLocal` | 本方期末本币金额 |
| `own_close_bal_group` | `own_close_bal_group` | `ownCloseBalGroup` | 本方期末集团币金额 |
| `own_close_bal_global` | `own_close_bal_global` | `ownCloseBalGlobal` | 本方期末全局币金额 |
| `opp_close_bal_qty` | `opp_close_bal_qty` | `oppCloseBalQty` | 对方期末数量 |
| `opp_close_bal_ori` | `opp_close_bal_ori` | `oppCloseBalOri` | 对方期末原币金额 |
| `opp_close_bal_org` | `opp_close_bal_org` | `oppCloseBalOrg` | 对方期末组织币金额 |
| `opp_close_bal_local` | `opp_close_bal_local` | `oppCloseBalLocal` | 对方期末本币金额 |
| `opp_close_bal_group` | `opp_close_bal_group` | `oppCloseBalGroup` | 对方期末集团币金额 |
| `opp_close_bal_global` | `opp_close_bal_global` | `oppCloseBalGlobal` | 对方期末全局币金额 |
| `close_qty_diff` | `close_qty_diff` | `closeQtyDiff` | 期末数量差异 |
| `close_bal_ori_diff` | `close_bal_ori_diff` | `closeBalOriDiff` | 期末原币金额差异 |
| `close_bal_org_diff` | `close_bal_org_diff` | `closeBalOrgDiff` | 期末组织币金额差异 |
| `close_bal_local_diff` | `close_bal_local_diff` | `closeBalLocalDiff` | 期末本币金额差异 |
| `close_bal_group_diff` | `close_bal_group_diff` | `closeBalGroupDiff` | 期末集团币金额差异 |
| `close_bal_global_diff` | `close_bal_global_diff` | `closeBalGlobalDiff` | 期末全局币金额差异 |
