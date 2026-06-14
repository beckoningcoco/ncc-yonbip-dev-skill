---
tags: [BIP, 元数据, 数据字典, epub.subject.AccSubject]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会计科目 (`epub.subject.AccSubject`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_accsubject` | domain：`fiepub` | 应用：`FP` | 业务对象ID：`82ad9aec-4b7f-49e2-a43e-29c2920dccb4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 会计科目 |
| 物理表 | `epub_accsubject` |
| domain/服务域 | `fiepub` |
| schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 285 个 |
| 关联引用 | 18 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodies` | `epub.subject.AccSubjectMultiDimensionExt` | composition |
| `accSubjectCostFactor` | `epub.subject.AccSubjectCostFactor` | composition |
| `services` | `epub.subject.AccSubjectCtrService` | composition |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `` |
| `parentid` | `fiepub.fiepub_accsubjectref` |
| `parentchart` | `` |
| `accproperty` | `fiepub.epub_accproperty_ref` |
| `ytenant_id` | `` |
| `exchangerate` | `fiepub.fiepub_accsubjectref` |
| `` | `` |
| `creatorId` | `` |
| `modifierId` | `` |
| `accsubject_character` | `` |
| `accsubjectchartSource` | `` |
| `accelement` | `` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `measuredoc` | `productcenter.pc_unitref` |
| `accsubjectchart` | `fiepub.epub_accsubjectchartref` |
| `tenant_id` | `` |

## 继承接口 (6个, 23字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **树型结构** (`base.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 285 个直连字段

### 文本字段 (32个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | String | 会计科目手工码 |
| `code` | `code` | String | 科目编码 |
| `accpropertycode` | `accpropertycode` | String | 一级会计要素编码 |
| `controlway` | `controlway` | String | 余额控制方式 |
| `creator` | `creator` | String | 创建人名称 |
| `def1` | `def1` | String | 社会化征用 |
| `def2` | `def2` | String | 社会化核心已下发标识 |
| `description` | `description` | String | 描述 |
| `social_srcid` | `social_srcid` | String | 社会化来源id |
| `social_tenantid` | `social_tenantid` | String | 社会化来源租户 |
| `accsubjectchart_vid` | `accsubjectchart_vid` | String | 科目表主键 |
| `accsubjectchart_oid` | `accsubjectchart_oid` | String | 科目表初始版本id |
| `accsubject_vid` | `accsubject_vid` | String | 科目主键 |
| `accsubject_oid` | `accsubject_oid` | String | 科目初始版本id |
| `effective_date` | `effective_date` | String | 生效日期 |
| `expiration_date` | `expiration_date` | String | 失效日期 |
| `mnemoniccode` | `mnemoniccode` | String | 助记码 |
| `modifier` | `modifier` | String | 修改人名称 |
| `objid` | `objid` | String | 友企连id |
| `srccoreid` | `srccoreid` | String | 核心租户的数据id |
| `subject_name_separator` | `subject_name_separator` | String | 科目名称分隔符 |
| `sysid` | `sysid` | String | 来源主键 |
| `subjectcoderule` | `subjectcoderule` | String | 科目编码规则 |
| `deficitcheckstrategy` | `deficitcheckstrategy` | String | 余额赤字检查 |
| `cashcategory` | `cashcategory` | String | 现金分类 |
| `direction` | `direction` | String | 余额方向 |
| `extenditem` | `extenditem` | String | 辅助核算项 |
| `extendservice` | `extendservice` | String | 受控应用 |
| `extendbank` | `extendbank` | String | 凭证必填设置 |
| `glbalance` | `glbalance` | String | 总账账表余额双向显示 |
| `internal_code` | `internal_code` | String | 内码 |
| `path` | `path` | String | 路径 |

### 引用字段 (14个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `accsubjectchart` | `accsubjectchart` | 85ed5168-72ae-41c2-a5a5-51f3fc7b1bc0 | 科目表 |
| `accelement` | `accelement` | 92f73981-1599-41c6-af3a-b107a0d99a80 | 会计要素表 |
| `creatorId` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `modifierId` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `parentchart` | `parentchart` | 85ed5168-72ae-41c2-a5a5-51f3fc7b1bc0 | 父科目表 |
| `parentid` | `parentid` | b56c7f52-183c-4cea-a310-d6ee902365af | 上级科目id |
| `accproperty` | `accproperty` | ea32e071-8dd9-47c2-a3b8-b2ac5f32d159 | 会计要素id |
| `measuredoc` | `measuredoc` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | 默认计量单位id |
| `currency` | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 币种id |
| `exchangerate` | `exchangerate` | b56c7f52-183c-4cea-a310-d6ee902365af | 汇率重估id |
| `accsubjectchartSource` | `accsubjectchartSource` | 85ed5168-72ae-41c2-a5a5-51f3fc7b1bc0 | 所属科目表 |
| `country` | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | 国家地区 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_date` | `create_date` | Date | 创建日期 |
| `modify_date` | `modify_date` | Date | 修改日期 |

### 布尔字段 (223个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `bbalancecontrol` | `bbalancecontrol` | Boolean | 余额方向控制 |
| `bbalancedisplay` | `bbalancedisplay` | Boolean | 账簿余额双向显示 |
| `boutchart` | `boutchart` | Boolean | 是否表外科目 |
| `bsharesub` | `bsharesub` | Boolean | 共享下级 |
| `bsystem` | `bsystem` | Boolean | 是否预制 |
| `hasnum` | `hasnum` | Boolean | 数量必填 |
| `leaf` | `leaf` | Boolean | 末级标识 |
| `parentleaf` | `parentleaf` | Boolean | 父科目表末级标识 |
| `vr1` | `vr1` | Boolean | 辅助段1 |
| `vr10` | `vr10` | Boolean | 辅助段10 |
| `vr100` | `vr100` | Boolean | 辅助段100 |
| `vr11` | `vr11` | Boolean | 辅助段11 |
| `vr12` | `vr12` | Boolean | 辅助段12 |
| `vr13` | `vr13` | Boolean | 辅助段13 |
| `vr14` | `vr14` | Boolean | 辅助段14 |
| `vr15` | `vr15` | Boolean | 辅助段15 |
| `vr16` | `vr16` | Boolean | 辅助段16 |
| `vr17` | `vr17` | Boolean | 辅助段17 |
| `vr18` | `vr18` | Boolean | 辅助段18 |
| `vr19` | `vr19` | Boolean | 辅助段19 |
| `vr2` | `vr2` | Boolean | 辅助段2 |
| `vr20` | `vr20` | Boolean | 辅助段20 |
| `vr21` | `vr21` | Boolean | 辅助段21 |
| `vr22` | `vr22` | Boolean | 辅助段22 |
| `vr23` | `vr23` | Boolean | 辅助段23 |
| `vr24` | `vr24` | Boolean | 辅助段24 |
| `vr25` | `vr25` | Boolean | 辅助段25 |
| `vr26` | `vr26` | Boolean | 辅助段26 |
| `vr27` | `vr27` | Boolean | 辅助段27 |
| `vr28` | `vr28` | Boolean | 辅助段28 |
| `vr29` | `vr29` | Boolean | 辅助段29 |
| `vr3` | `vr3` | Boolean | 辅助段3 |
| `vr30` | `vr30` | Boolean | 辅助段30 |
| `vr31` | `vr31` | Boolean | 辅助段31 |
| `vr32` | `vr32` | Boolean | 辅助段32 |
| `vr33` | `vr33` | Boolean | 辅助段33 |
| `vr34` | `vr34` | Boolean | 辅助段34 |
| `vr35` | `vr35` | Boolean | 辅助段35 |
| `vr36` | `vr36` | Boolean | 辅助段36 |
| `vr37` | `vr37` | Boolean | 辅助段37 |
| `vr38` | `vr38` | Boolean | 辅助段38 |
| `vr39` | `vr39` | Boolean | 辅助段39 |
| `vr4` | `vr4` | Boolean | 辅助段4 |
| `vr40` | `vr40` | Boolean | 辅助段40 |
| `vr41` | `vr41` | Boolean | 辅助段41 |
| `vr42` | `vr42` | Boolean | 辅助段42 |
| `vr43` | `vr43` | Boolean | 辅助段43 |
| `vr44` | `vr44` | Boolean | 辅助段44 |
| `vr45` | `vr45` | Boolean | 辅助段45 |
| `vr46` | `vr46` | Boolean | 辅助段46 |
| `vr47` | `vr47` | Boolean | 辅助段47 |
| `vr48` | `vr48` | Boolean | 辅助段48 |
| `vr49` | `vr49` | Boolean | 辅助段49 |
| `vr5` | `vr5` | Boolean | 辅助段5 |
| `vr50` | `vr50` | Boolean | 辅助段50 |
| `vr51` | `vr51` | Boolean | 辅助段51 |
| `vr52` | `vr52` | Boolean | 辅助段52 |
| `vr53` | `vr53` | Boolean | 辅助段53 |
| `vr54` | `vr54` | Boolean | 辅助段54 |
| `vr55` | `vr55` | Boolean | 辅助段55 |
| `vr56` | `vr56` | Boolean | 辅助段56 |
| `vr57` | `vr57` | Boolean | 辅助段57 |
| `vr58` | `vr58` | Boolean | 辅助段58 |
| `vr59` | `vr59` | Boolean | 辅助段59 |
| `vr6` | `vr6` | Boolean | 辅助段6 |
| `vr60` | `vr60` | Boolean | 辅助段60 |
| `vr61` | `vr61` | Boolean | 辅助段61 |
| `vr62` | `vr62` | Boolean | 辅助段62 |
| `vr63` | `vr63` | Boolean | 辅助段63 |
| `vr64` | `vr64` | Boolean | 辅助段64 |
| `vr65` | `vr65` | Boolean | 辅助段65 |
| `vr66` | `vr66` | Boolean | 辅助段66 |
| `vr67` | `vr67` | Boolean | 辅助段67 |
| `vr68` | `vr68` | Boolean | 辅助段68 |
| `vr69` | `vr69` | Boolean | 辅助段69 |
| `vr7` | `vr7` | Boolean | 辅助段7 |
| `vr70` | `vr70` | Boolean | 辅助段70 |
| `vr71` | `vr71` | Boolean | 辅助段71 |
| `vr72` | `vr72` | Boolean | 辅助段72 |
| `vr73` | `vr73` | Boolean | 辅助段73 |
| `vr74` | `vr74` | Boolean | 辅助段74 |
| `vr75` | `vr75` | Boolean | 辅助段75 |
| `vr76` | `vr76` | Boolean | 辅助段76 |
| `vr77` | `vr77` | Boolean | 辅助段77 |
| `vr78` | `vr78` | Boolean | 辅助段78 |
| `vr79` | `vr79` | Boolean | 辅助段79 |
| `vr8` | `vr8` | Boolean | 辅助段8 |
| `vr80` | `vr80` | Boolean | 辅助段80 |
| `vr81` | `vr81` | Boolean | 辅助段81 |
| `vr82` | `vr82` | Boolean | 辅助段82 |
| `vr83` | `vr83` | Boolean | 辅助段83 |
| `vr84` | `vr84` | Boolean | 辅助段84 |
| `vr85` | `vr85` | Boolean | 辅助段85 |
| `vr86` | `vr86` | Boolean | 辅助段86 |
| `vr87` | `vr87` | Boolean | 辅助段87 |
| `vr88` | `vr88` | Boolean | 辅助段88 |
| `vr89` | `vr89` | Boolean | 辅助段89 |
| `vr9` | `vr9` | Boolean | 辅助段9 |
| `vr90` | `vr90` | Boolean | 辅助段90 |
| `vr91` | `vr91` | Boolean | 辅助段91 |
| `vr92` | `vr92` | Boolean | 辅助段92 |
| `vr93` | `vr93` | Boolean | 辅助段93 |
| `vr94` | `vr94` | Boolean | 辅助段94 |
| `vr95` | `vr95` | Boolean | 辅助段95 |
| `vr96` | `vr96` | Boolean | 辅助段96 |
| `vr97` | `vr97` | Boolean | 辅助段97 |
| `vr98` | `vr98` | Boolean | 辅助段98 |
| `vr99` | `vr99` | Boolean | 辅助段99 |
| `bnumcheck` | `bnumcheck` | Boolean | 数量核算 |
| `isrevaluation` | `isrevaluation` | Boolean | 汇兑损益 |
| `enabled` | `enabled` | Boolean | 状态 |
| `bstrongctrl` | `bstrongctrl` | Boolean | 强管控 |
| `baccrualcontrol` | `baccrualcontrol` | Boolean | 发生额方向控制 |
| `hasbvr` | `hasbvr` | Boolean | 辅助核算 |
| `hasfactor` | `hasfactor` | Boolean | 成本要素 |
| `controlledservice` | `controlledservice` | Boolean | 受控应用 |
| `settlementmode` | `settlementmode` | Boolean | 结算方式 |
| `billtime` | `billtime` | Boolean | 票据日期 |
| `billno` | `billno` | Boolean | 票据号 |
| `bankverifycode` | `bankverifycode` | Boolean | 银行对账码 |
| `bln_verify` | `bln_verify` | Boolean | 往来科目 |
| `` | `isEnd` | Boolean | 是否末级 |
| `stopstatus` | `stopstatus` | Boolean | 停用状态 |
| `vr101` | `vr101` | Boolean | 辅助段101 |
| `vr102` | `vr102` | Boolean | 辅助段102 |
| `vr103` | `vr103` | Boolean | 辅助段103 |
| `vr104` | `vr104` | Boolean | 辅助段104 |
| `vr105` | `vr105` | Boolean | 辅助段105 |
| `vr106` | `vr106` | Boolean | 辅助段106 |
| `vr107` | `vr107` | Boolean | 辅助段107 |
| `vr108` | `vr108` | Boolean | 辅助段108 |
| `vr109` | `vr109` | Boolean | 辅助段109 |
| `vr110` | `vr110` | Boolean | 辅助段110 |
| `vr111` | `vr111` | Boolean | 辅助段111 |
| `vr112` | `vr112` | Boolean | 辅助段112 |
| `vr113` | `vr113` | Boolean | 辅助段113 |
| `vr114` | `vr114` | Boolean | 辅助段114 |
| `vr115` | `vr115` | Boolean | 辅助段115 |
| `vr116` | `vr116` | Boolean | 辅助段116 |
| `vr117` | `vr117` | Boolean | 辅助段117 |
| `vr118` | `vr118` | Boolean | 辅助段118 |
| `vr119` | `vr119` | Boolean | 辅助段119 |
| `vr120` | `vr120` | Boolean | 辅助段120 |
| `vr121` | `vr121` | Boolean | 辅助段121 |
| `vr122` | `vr122` | Boolean | 辅助段122 |
| `vr123` | `vr123` | Boolean | 辅助段123 |
| `vr124` | `vr124` | Boolean | 辅助段124 |
| `vr125` | `vr125` | Boolean | 辅助段125 |
| `vr126` | `vr126` | Boolean | 辅助段126 |
| `vr127` | `vr127` | Boolean | 辅助段127 |
| `vr128` | `vr128` | Boolean | 辅助段128 |
| `vr129` | `vr129` | Boolean | 辅助段129 |
| `vr130` | `vr130` | Boolean | 辅助段130 |
| `vr131` | `vr131` | Boolean | 辅助段131 |
| `vr132` | `vr132` | Boolean | 辅助段132 |
| `vr133` | `vr133` | Boolean | 辅助段133 |
| `vr134` | `vr134` | Boolean | 辅助段134 |
| `vr135` | `vr135` | Boolean | 辅助段135 |
| `vr136` | `vr136` | Boolean | 辅助段136 |
| `vr137` | `vr137` | Boolean | 辅助段137 |
| `vr138` | `vr138` | Boolean | 辅助段138 |
| `vr139` | `vr139` | Boolean | 辅助段139 |
| `vr140` | `vr140` | Boolean | 辅助段140 |
| `vr141` | `vr141` | Boolean | 辅助段141 |
| `vr142` | `vr142` | Boolean | 辅助段142 |
| `vr143` | `vr143` | Boolean | 辅助段143 |
| `vr144` | `vr144` | Boolean | 辅助段144 |
| `vr145` | `vr145` | Boolean | 辅助段145 |
| `vr146` | `vr146` | Boolean | 辅助段146 |
| `vr147` | `vr147` | Boolean | 辅助段147 |
| `vr148` | `vr148` | Boolean | 辅助段148 |
| `vr149` | `vr149` | Boolean | 辅助段149 |
| `vr150` | `vr150` | Boolean | 辅助段150 |
| `vr151` | `vr151` | Boolean | 辅助段151 |
| `vr152` | `vr152` | Boolean | 辅助段152 |
| `vr153` | `vr153` | Boolean | 辅助段153 |
| `vr154` | `vr154` | Boolean | 辅助段154 |
| `vr155` | `vr155` | Boolean | 辅助段155 |
| `vr156` | `vr156` | Boolean | 辅助段156 |
| `vr157` | `vr157` | Boolean | 辅助段157 |
| `vr158` | `vr158` | Boolean | 辅助段158 |
| `vr159` | `vr159` | Boolean | 辅助段159 |
| `vr160` | `vr160` | Boolean | 辅助段160 |
| `vr161` | `vr161` | Boolean | 辅助段161 |
| `vr162` | `vr162` | Boolean | 辅助段162 |
| `vr163` | `vr163` | Boolean | 辅助段163 |
| `vr164` | `vr164` | Boolean | 辅助段164 |
| `vr165` | `vr165` | Boolean | 辅助段165 |
| `vr166` | `vr166` | Boolean | 辅助段166 |
| `vr167` | `vr167` | Boolean | 辅助段167 |
| `vr168` | `vr168` | Boolean | 辅助段168 |
| `vr169` | `vr169` | Boolean | 辅助段169 |
| `vr170` | `vr170` | Boolean | 辅助段170 |
| `vr171` | `vr171` | Boolean | 辅助段171 |
| `vr172` | `vr172` | Boolean | 辅助段172 |
| `vr173` | `vr173` | Boolean | 辅助段173 |
| `vr174` | `vr174` | Boolean | 辅助段174 |
| `vr175` | `vr175` | Boolean | 辅助段175 |
| `vr176` | `vr176` | Boolean | 辅助段176 |
| `vr177` | `vr177` | Boolean | 辅助段177 |
| `vr178` | `vr178` | Boolean | 辅助段178 |
| `vr179` | `vr179` | Boolean | 辅助段179 |
| `vr180` | `vr180` | Boolean | 辅助段180 |
| `vr181` | `vr181` | Boolean | 辅助段181 |
| `vr182` | `vr182` | Boolean | 辅助段182 |
| `vr183` | `vr183` | Boolean | 辅助段183 |
| `vr184` | `vr184` | Boolean | 辅助段184 |
| `vr185` | `vr185` | Boolean | 辅助段185 |
| `vr186` | `vr186` | Boolean | 辅助段186 |
| `vr187` | `vr187` | Boolean | 辅助段187 |
| `vr188` | `vr188` | Boolean | 辅助段188 |
| `vr189` | `vr189` | Boolean | 辅助段189 |
| `vr190` | `vr190` | Boolean | 辅助段190 |
| `vr191` | `vr191` | Boolean | 辅助段191 |
| `vr192` | `vr192` | Boolean | 辅助段192 |
| `vr193` | `vr193` | Boolean | 辅助段193 |
| `vr194` | `vr194` | Boolean | 辅助段194 |
| `vr195` | `vr195` | Boolean | 辅助段195 |
| `vr196` | `vr196` | Boolean | 辅助段196 |
| `vr197` | `vr197` | Boolean | 辅助段197 |
| `vr198` | `vr198` | Boolean | 辅助段198 |
| `vr199` | `vr199` | Boolean | 辅助段199 |
| `vr200` | `vr200` | Boolean | 辅助段200 |

### 整数 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `social_mctype` | `social_mctype` | Integer | 社会化管控类型 |
| `subjectlevel` | `subjectlevel` | Integer | 科目层级 |
| `level` | `level` | Integer | 层级 |
| `sort_num` | `sort_num` | Integer | 排序号 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 科目名称 |
| `displayname` | `displayname` | String | 显示名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |
| `stop_time` | `stop_time` | DateTime | 停用时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `accsubject_character` | `accsubject_character` | 567f4f62-b138-4df7-b2a3-03ef0cd7cc94 | 会计科目特征属性 |

### other (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | 1d42054e-3660-4122-ae41-148993bd42cd | 科目成本要素 |
| `` | `` | 22518ad5-99d4-470b-9f35-e28e7fde33d5 | 科目辅助项 |
| `` | `` | 430c7821-e769-42e9-b7c9-48f6b18b4ff5 | 科目受控应用 |
