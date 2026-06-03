---
tags: [BIP, 元数据, 数据字典, GL.GL.InnerTransTotalAmtRecon]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 内部交易总额对账 (`GL.GL.InnerTransTotalAmtRecon`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_inner_trans_total_amt_recon_tb` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`87c30aa5-5071-4312-8440-227d5ce4d4d9`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 内部交易总额对账 |
| 物理表 | `gl_inner_trans_total_amt_recon_tb` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 301 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `u8c-auth.bip_user_ref` |
| `ori_currency` | `ucfbasedoc.bd_currencytenantref` |
| `opp_inner_org` | `ucf-org-center.org_pure_tree_ref` |
| `own_inner_org` | `ucf-org-center.org_pure_tree_ref` |
| `modifier` | `u8c-auth.bip_user_ref` |
| `opp_accbook` | `fiepub.fiepub_accountbooktreeref` |
| `local_currency` | `ucfbasedoc.bd_currencytenantref` |
| `opp_accsubject` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `own_accbook` | `fiepub.fiepub_accountbooktreeref` |
| `ytenant_id` | `u8c-auth.bip_user_ref` |
| `own_accsubject` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `group_currency` | `ucfbasedoc.bd_currencytenantref` |
| `org_currency` | `ucfbasedoc.bd_currencytenantref` |
| `global_currency` | `ucfbasedoc.bd_currencytenantref` |
| `rule_id` | `yonbip-fi-egl.RefTable_7406dde875` |

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

> 共 301 个直连字段

### 文本字段 (220个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `match_scope` | `match_scope` | `matchScope` | 对符范围 |
| `opp_end_time` | `opp_end_time` | `oppEndTime` | 对方制单日期结束时间 |
| `opp_start_time` | `opp_start_time` | `oppStartTime` | 对方制单日期开始时间 |
| `own_end_time` | `own_end_time` | `ownEndTime` | 本方制单日期结束时间 |
| `own_start_time` | `own_start_time` | `ownStartTime` | 本方制单日期开始时间 |
| `opp_aux_name` | `opp_aux_name` | `oppAuxName` | 对方辅助核算显示名称 |
| `own_aux_name` | `own_aux_name` | `ownAuxName` | 本方辅助核算显示名称 |
| `opp_accsubject_code` | `opp_accsubject_code` | `oppAccsubjectCode` | 对方科目编码 |
| `own_accsubject_code` | `own_accsubject_code` | `ownAccsubjectCode` | 本方科目编码 |
| `own_supplier` | `own_supplier` | `ownSupplier` | 本方供应商 |
| `own_customer` | `own_customer` | `ownCustomer` | 本方客户 |
| `own_biz_partner` | `own_biz_partner` | `ownBizPartner` | 本方业务伙伴 |
| `opp_supplier` | `opp_supplier` | `oppSupplier` | 对方供应商 |
| `opp_customer` | `opp_customer` | `oppCustomer` | 对方客户 |
| `opp_biz_partner` | `opp_biz_partner` | `oppBizPartner` | 对方业务伙伴 |
| `def1` | `def1` | `vr1` | 部门 |
| `def2` | `def2` | `vr2` | 项目 |
| `def3` | `def3` | `vr3` | 人员 |
| `def4` | `def4` | `vr4` | 供应商 |
| `def5` | `def5` | `vr5` | 客户 |
| `def6` | `def6` | `vr6` | 物料 |
| `def7` | `def7` | `vr7` | 物料分类 |
| `def8` | `def8` | `vr8` | 成本中心 |
| `def9` | `def9` | `vr9` | 业务伙伴 |
| `def10` | `def10` | `vr10` | 利润中心 |
| `def11` | `def11` | `vr11` | 业务活动类型 |
| `def12` | `def12` | `vr12` | 自定义项12 |
| `def13` | `def13` | `vr13` | 自定义项13 |
| `def14` | `def14` | `vr14` | 自定义项14 |
| `def15` | `def15` | `vr15` | 自定义项15 |
| `def16` | `def16` | `vr16` | 自定义项16 |
| `def17` | `def17` | `vr17` | 自定义项17 |
| `def18` | `def18` | `vr18` | 自定义项18 |
| `def19` | `def19` | `vr19` | 自定义项19 |
| `def20` | `def20` | `vr20` | 自定义项20 |
| `def21` | `def21` | `vr21` | 自定义项21 |
| `def22` | `def22` | `vr22` | 自定义项22 |
| `def23` | `def23` | `vr23` | 自定义项23 |
| `def24` | `def24` | `vr24` | 自定义项24 |
| `def25` | `def25` | `vr25` | 自定义项25 |
| `def26` | `def26` | `vr26` | 自定义项26 |
| `def27` | `def27` | `vr27` | 自定义项27 |
| `def28` | `def28` | `vr28` | 自定义项28 |
| `def29` | `def29` | `vr29` | 自定义项29 |
| `def30` | `def30` | `vr30` | 自定义项30 |
| `def31` | `def31` | `vr31` | 自定义项31 |
| `def32` | `def32` | `vr32` | 自定义项32 |
| `def33` | `def33` | `vr33` | 自定义项33 |
| `def34` | `def34` | `vr34` | 自定义项34 |
| `def35` | `def35` | `vr35` | 自定义项35 |
| `def36` | `def36` | `vr36` | 自定义项36 |
| `def37` | `def37` | `vr37` | 自定义项37 |
| `def38` | `def38` | `vr38` | 自定义项38 |
| `def39` | `def39` | `vr39` | 自定义项39 |
| `def40` | `def40` | `vr40` | 自定义项40 |
| `def41` | `def41` | `vr41` | 自定义项41 |
| `def42` | `def42` | `vr42` | 自定义项42 |
| `def43` | `def43` | `vr43` | 自定义项43 |
| `def44` | `def44` | `vr44` | 自定义项44 |
| `def45` | `def45` | `vr45` | 自定义项45 |
| `def46` | `def46` | `vr46` | 自定义项46 |
| `def47` | `def47` | `vr47` | 自定义项47 |
| `def48` | `def48` | `vr48` | 自定义项48 |
| `def49` | `def49` | `vr49` | 自定义项49 |
| `def50` | `def50` | `vr50` | 自定义项50 |
| `def51` | `def51` | `vr51` | 自定义项51 |
| `def52` | `def52` | `vr52` | 自定义项52 |
| `def53` | `def53` | `vr53` | 自定义项53 |
| `def54` | `def54` | `vr54` | 自定义项54 |
| `def55` | `def55` | `vr55` | 自定义项55 |
| `def56` | `def56` | `vr56` | 自定义项56 |
| `def57` | `def57` | `vr57` | 自定义项57 |
| `def58` | `def58` | `vr58` | 自定义项58 |
| `def59` | `def59` | `vr59` | 自定义项59 |
| `def60` | `def60` | `vr60` | 自定义项60 |
| `def61` | `def61` | `vr61` | 自定义项61 |
| `def62` | `def62` | `vr62` | 自定义项62 |
| `def63` | `def63` | `vr63` | 自定义项63 |
| `def64` | `def64` | `vr64` | 自定义项64 |
| `def65` | `def65` | `vr65` | 自定义项65 |
| `def66` | `def66` | `vr66` | 自定义项66 |
| `def67` | `def67` | `vr67` | 自定义项67 |
| `def68` | `def68` | `vr68` | 自定义项68 |
| `def69` | `def69` | `vr69` | 自定义项69 |
| `def70` | `def70` | `vr70` | 自定义项70 |
| `def71` | `def71` | `vr71` | 自定义项71 |
| `def72` | `def72` | `vr72` | 自定义项72 |
| `def73` | `def73` | `vr73` | 自定义项73 |
| `def74` | `def74` | `vr74` | 自定义项74 |
| `def75` | `def75` | `vr75` | 自定义项75 |
| `def76` | `def76` | `vr76` | 自定义项76 |
| `def77` | `def77` | `vr77` | 自定义项77 |
| `def78` | `def78` | `vr78` | 自定义项78 |
| `def79` | `def79` | `vr79` | 自定义项79 |
| `def80` | `def80` | `vr80` | 自定义项80 |
| `def81` | `def81` | `vr81` | 自定义项81 |
| `def82` | `def82` | `vr82` | 自定义项82 |
| `def83` | `def83` | `vr83` | 自定义项83 |
| `def84` | `def84` | `vr84` | 自定义项84 |
| `def85` | `def85` | `vr85` | 自定义项85 |
| `def86` | `def86` | `vr86` | 自定义项86 |
| `def87` | `def87` | `vr87` | 自定义项87 |
| `def88` | `def88` | `vr88` | 自定义项88 |
| `def89` | `def89` | `vr89` | 自定义项89 |
| `def90` | `def90` | `vr90` | 自定义项90 |
| `def91` | `def91` | `vr91` | 自定义项91 |
| `def92` | `def92` | `vr92` | 自定义项92 |
| `def93` | `def93` | `vr93` | 自定义项93 |
| `def94` | `def94` | `vr94` | 自定义项94 |
| `def95` | `def95` | `vr95` | 自定义项95 |
| `def96` | `def96` | `vr96` | 自定义项96 |
| `def97` | `def97` | `vr97` | 自定义项97 |
| `def98` | `def98` | `vr98` | 自定义项98 |
| `def99` | `def99` | `vr99` | 自定义项99 |
| `def100` | `def100` | `vr100` | 自定义项100 |
| `def101` | `def101` | `vr101` | 自定义项101 |
| `def102` | `def102` | `vr102` | 自定义项102 |
| `def103` | `def103` | `vr103` | 自定义项103 |
| `def104` | `def104` | `vr104` | 自定义项104 |
| `def105` | `def105` | `vr105` | 自定义项105 |
| `def106` | `def106` | `vr106` | 自定义项106 |
| `def107` | `def107` | `vr107` | 自定义项107 |
| `def108` | `def108` | `vr108` | 自定义项108 |
| `def109` | `def109` | `vr109` | 自定义项109 |
| `def110` | `def110` | `vr110` | 自定义项110 |
| `def111` | `def111` | `vr111` | 自定义项111 |
| `def112` | `def112` | `vr112` | 自定义项112 |
| `def113` | `def113` | `vr113` | 自定义项113 |
| `def114` | `def114` | `vr114` | 自定义项114 |
| `def115` | `def115` | `vr115` | 自定义项115 |
| `def116` | `def116` | `vr116` | 自定义项116 |
| `def117` | `def117` | `vr117` | 自定义项117 |
| `def118` | `def118` | `vr118` | 自定义项118 |
| `def119` | `def119` | `vr119` | 自定义项119 |
| `def120` | `def120` | `vr120` | 自定义项120 |
| `def121` | `def121` | `vr121` | 自定义项121 |
| `def122` | `def122` | `vr122` | 自定义项122 |
| `def123` | `def123` | `vr123` | 自定义项123 |
| `def124` | `def124` | `vr124` | 自定义项124 |
| `def125` | `def125` | `vr125` | 自定义项125 |
| `def126` | `def126` | `vr126` | 自定义项126 |
| `def127` | `def127` | `vr127` | 自定义项127 |
| `def128` | `def128` | `vr128` | 自定义项128 |
| `def129` | `def129` | `vr129` | 自定义项129 |
| `def130` | `def130` | `vr130` | 自定义项130 |
| `def131` | `def131` | `vr131` | 自定义项131 |
| `def132` | `def132` | `vr132` | 自定义项132 |
| `def133` | `def133` | `vr133` | 自定义项133 |
| `def134` | `def134` | `vr134` | 自定义项134 |
| `def135` | `def135` | `vr135` | 自定义项135 |
| `def136` | `def136` | `vr136` | 自定义项136 |
| `def137` | `def137` | `vr137` | 自定义项137 |
| `def138` | `def138` | `vr138` | 自定义项138 |
| `def139` | `def139` | `vr139` | 自定义项139 |
| `def140` | `def140` | `vr140` | 自定义项140 |
| `def141` | `def141` | `vr141` | 自定义项141 |
| `def142` | `def142` | `vr142` | 自定义项142 |
| `def143` | `def143` | `vr143` | 自定义项143 |
| `def144` | `def144` | `vr144` | 自定义项144 |
| `def145` | `def145` | `vr145` | 自定义项145 |
| `def146` | `def146` | `vr146` | 自定义项146 |
| `def147` | `def147` | `vr147` | 自定义项147 |
| `def148` | `def148` | `vr148` | 自定义项148 |
| `def149` | `def149` | `vr149` | 自定义项149 |
| `def150` | `def150` | `vr150` | 自定义项150 |
| `def151` | `def151` | `vr151` | 自定义项151 |
| `def152` | `def152` | `vr152` | 自定义项152 |
| `def153` | `def153` | `vr153` | 自定义项153 |
| `def154` | `def154` | `vr154` | 自定义项154 |
| `def155` | `def155` | `vr155` | 自定义项155 |
| `def156` | `def156` | `vr156` | 自定义项156 |
| `def157` | `def157` | `vr157` | 自定义项157 |
| `def158` | `def158` | `vr158` | 自定义项158 |
| `def159` | `def159` | `vr159` | 自定义项159 |
| `def160` | `def160` | `vr160` | 自定义项160 |
| `def161` | `def161` | `vr161` | 自定义项161 |
| `def162` | `def162` | `vr162` | 自定义项162 |
| `def163` | `def163` | `vr163` | 自定义项163 |
| `def164` | `def164` | `vr164` | 自定义项164 |
| `def165` | `def165` | `vr165` | 自定义项165 |
| `def166` | `def166` | `vr166` | 自定义项166 |
| `def167` | `def167` | `vr167` | 自定义项167 |
| `def168` | `def168` | `vr168` | 自定义项168 |
| `def169` | `def169` | `vr169` | 自定义项169 |
| `def170` | `def170` | `vr170` | 自定义项170 |
| `def171` | `def171` | `vr171` | 自定义项171 |
| `def172` | `def172` | `vr172` | 自定义项172 |
| `def173` | `def173` | `vr173` | 自定义项173 |
| `def174` | `def174` | `vr174` | 自定义项174 |
| `def175` | `def175` | `vr175` | 自定义项175 |
| `def176` | `def176` | `vr176` | 自定义项176 |
| `def177` | `def177` | `vr177` | 自定义项177 |
| `def178` | `def178` | `vr178` | 自定义项178 |
| `def179` | `def179` | `vr179` | 自定义项179 |
| `def180` | `def180` | `vr180` | 自定义项180 |
| `def181` | `def181` | `vr181` | 自定义项181 |
| `def182` | `def182` | `vr182` | 自定义项182 |
| `def183` | `def183` | `vr183` | 自定义项183 |
| `def184` | `def184` | `vr184` | 自定义项184 |
| `def185` | `def185` | `vr185` | 自定义项185 |
| `def186` | `def186` | `vr186` | 自定义项186 |
| `def187` | `def187` | `vr187` | 自定义项187 |
| `def188` | `def188` | `vr188` | 自定义项188 |
| `def189` | `def189` | `vr189` | 自定义项189 |
| `def190` | `def190` | `vr190` | 自定义项190 |
| `def191` | `def191` | `vr191` | 自定义项191 |
| `def192` | `def192` | `vr192` | 自定义项192 |
| `def193` | `def193` | `vr193` | 自定义项193 |
| `def194` | `def194` | `vr194` | 自定义项194 |
| `def195` | `def195` | `vr195` | 自定义项195 |
| `def196` | `def196` | `vr196` | 自定义项196 |
| `def197` | `def197` | `vr197` | 自定义项197 |
| `def198` | `def198` | `vr198` | 自定义项198 |
| `def199` | `def199` | `vr199` | 自定义项199 |
| `def200` | `def200` | `vr200` | 自定义项200 |
| `summary_id` | `summary_id` | `summaryId` | 查询汇总ID |
| `inner_match_type` | `inner_match_type` | `innerMatchType` | 内部辅助核算匹配类型 |
| `own_aux_id` | `own_aux_id` | `ownAuxId` | 本方辅助核算 |
| `opp_aux_id` | `opp_aux_id` | `oppAuxId` | 对方辅助核算 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `global_currency` | `global_currency` | `globalCurrency` | 全局币币种 |
| `group_currency` | `group_currency` | `groupCurrency` | 集团币币种 |
| `org_currency` | `org_currency` | `orgCurrency` | 组织币币种 |
| `local_currency` | `local_currency` | `localCurrency` | 本币币种 |
| `rule_id` | `rule_id` | `ruleId` | 对账规则 |
| `ori_currency` | `ori_currency` | `oriCurrency` | 原币币种 |
| `own_inner_org` | `own_inner_org` | `ownInnerOrg` | 本方内部组织 |
| `own_accbook` | `own_accbook` | `ownAccbook` | 本方账簿 |
| `own_accsubject` | `own_accsubject` | `ownAccsubject` | 本方科目 |
| `opp_inner_org` | `opp_inner_org` | `oppInnerOrg` | 对方内部组织 |
| `opp_accbook` | `opp_accbook` | `oppAccbook` | 对方账簿 |
| `opp_accsubject` | `opp_accsubject` | `oppAccsubject` | 对方科目 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `opp_max_pubts` | `opp_max_pubts` | `oppMaxPubts` | 对方最大修改时间戳 |
| `own_max_pubts` | `own_max_pubts` | `ownMaxPubts` | 本方最大修改时间戳 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `recon_direction` | `recon_direction` | `reconDirection` | 对账方向 |
| `voucher_scope` | `voucher_scope` | `voucherScope` | 凭证范围（是否包含未记账） |
| `own_direction` | `own_direction` | `ownDirection` | 本方方向 |
| `opp_direction` | `opp_direction` | `oppDirection` | 对方方向 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `opp_total_detail_count` | `opp_total_detail_count` | `oppTotalDetailCount` | 对方明细总数 |
| `own_total_detail_count` | `own_total_detail_count` | `ownTotalDetailCount` | 本方明细总数 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (54个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `own_debit_qty` | `own_debit_qty` | `ownDebitQty` | 本方借方发生数量 |
| `own_debit_ori` | `own_debit_ori` | `ownDebitOri` | 本方借方发生原币金额 |
| `own_debit_org` | `own_debit_org` | `ownDebitOrg` | 本方借方发生组织币金额 |
| `own_debit_local` | `own_debit_local` | `ownDebitLocal` | 本方借方发生本币金额 |
| `own_debit_group` | `own_debit_group` | `ownDebitGroup` | 本方借方发生集团币金额 |
| `own_debit_global` | `own_debit_global` | `ownDebitGlobal` | 本方借方发生全局币金额 |
| `own_credit_qty` | `own_credit_qty` | `ownCreditQty` | 本方贷方发生数量 |
| `own_credit_ori` | `own_credit_ori` | `ownCreditOri` | 本方贷方发生原币金额 |
| `own_credit_org` | `own_credit_org` | `ownCreditOrg` | 本方贷方发生组织币金额 |
| `own_credit_local` | `own_credit_local` | `ownCreditLocal` | 本方贷方发生本币金额 |
| `own_credit_group` | `own_credit_group` | `ownCreditGroup` | 本方贷方发生集团币金额 |
| `own_credit_global` | `own_credit_global` | `ownCreditGlobal` | 本方贷方发生全局币金额 |
| `own_close_bal_qty` | `own_close_bal_qty` | `ownCloseBalQty` | 本方期末数量 |
| `own_close_bal_ori` | `own_close_bal_ori` | `ownCloseBalOri` | 本方期末原币金额 |
| `own_close_bal_org` | `own_close_bal_org` | `ownCloseBalOrg` | 本方期末组织币金额 |
| `own_close_bal_local` | `own_close_bal_local` | `ownCloseBalLocal` | 本方期末本币金额 |
| `own_close_bal_group` | `own_close_bal_group` | `ownCloseBalGroup` | 本方期末集团币金额 |
| `own_close_bal_global` | `own_close_bal_global` | `ownCloseBalGlobal` | 本方期末全局币金额 |
| `opp_debit_qty` | `opp_debit_qty` | `oppDebitQty` | 对方借方发生数量 |
| `opp_debit_ori` | `opp_debit_ori` | `oppDebitOri` | 对方借方发生原币金额 |
| `opp_debit_org` | `opp_debit_org` | `oppDebitOrg` | 对方借方发生组织币金额 |
| `opp_debit_local` | `opp_debit_local` | `oppDebitLocal` | 对方借方发生本币金额 |
| `opp_debit_group` | `opp_debit_group` | `oppDebitGroup` | 对方借方发生集团币金额 |
| `opp_debit_global` | `opp_debit_global` | `oppDebitGlobal` | 对方借方发生全局币金额 |
| `opp_credit_qty` | `opp_credit_qty` | `oppCreditQty` | 对方贷方发生数量 |
| `opp_credit_ori` | `opp_credit_ori` | `oppCreditOri` | 对方贷方发生原币金额 |
| `opp_credit_org` | `opp_credit_org` | `oppCreditOrg` | 对方贷方发生组织币金额 |
| `opp_credit_local` | `opp_credit_local` | `oppCreditLocal` | 对方贷方发生本币金额 |
| `opp_credit_group` | `opp_credit_group` | `oppCreditGroup` | 对方贷方发生集团币金额 |
| `opp_credit_global` | `opp_credit_global` | `oppCreditGlobal` | 对方贷方发生全局币金额 |
| `opp_close_bal_qty` | `opp_close_bal_qty` | `oppCloseBalQty` | 对方期末数量 |
| `opp_close_bal_ori` | `opp_close_bal_ori` | `oppCloseBalOri` | 对方期末原币金额 |
| `opp_close_bal_org` | `opp_close_bal_org` | `oppCloseBalOrg` | 对方期末组织币金额 |
| `opp_close_bal_local` | `opp_close_bal_local` | `oppCloseBalLocal` | 对方期末本币金额 |
| `opp_close_bal_group` | `opp_close_bal_group` | `oppCloseBalGroup` | 对方期末集团币金额 |
| `opp_close_bal_global` | `opp_close_bal_global` | `oppCloseBalGlobal` | 对方期末全局币金额 |
| `debit_qty_diff` | `debit_qty_diff` | `debitQtyDiff` | 借方发生数量差异 |
| `debit_ori_diff` | `debit_ori_diff` | `debitOriDiff` | 借方发生原币金额差异 |
| `debit_org_diff` | `debit_org_diff` | `debitOrgDiff` | 借方发生组织币金额差异 |
| `debit_local_diff` | `debit_local_diff` | `debitLocalDiff` | 借方发生本币金额差异 |
| `debit_group_diff` | `debit_group_diff` | `debitGroupDiff` | 借方发生集团币金额差异 |
| `debit_global_diff` | `debit_global_diff` | `debitGlobalDiff` | 借方发生全局币金额差异 |
| `credit_qty_diff` | `credit_qty_diff` | `creditQtyDiff` | 贷方发生数量差异 |
| `credit_ori_diff` | `credit_ori_diff` | `creditOriDiff` | 贷方发生原币金额差异 |
| `credit_org_diff` | `credit_org_diff` | `creditOrgDiff` | 贷方发生组织币金额差异 |
| `credit_local_diff` | `credit_local_diff` | `creditLocalDiff` | 贷方发生本币金额差异 |
| `credit_group_diff` | `credit_group_diff` | `creditGroupDiff` | 贷方发生集团币金额差异 |
| `credit_global_diff` | `credit_global_diff` | `creditGlobalDiff` | 贷方发生全局币金额差异 |
| `close_qty_diff` | `close_qty_diff` | `closeQtyDiff` | 期末数量差异 |
| `close_bal_ori_diff` | `close_bal_ori_diff` | `closeBalOriDiff` | 期末原币金额差异 |
| `close_bal_org_diff` | `close_bal_org_diff` | `closeBalOrgDiff` | 期末组织币金额差异 |
| `close_bal_local_diff` | `close_bal_local_diff` | `closeBalLocalDiff` | 期末本币金额差异 |
| `close_bal_group_diff` | `close_bal_group_diff` | `closeBalGroupDiff` | 期末集团币金额差异 |
| `close_bal_global_diff` | `close_bal_global_diff` | `closeBalGlobalDiff` | 期末全局币金额差异 |
