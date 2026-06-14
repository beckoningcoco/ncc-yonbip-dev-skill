---
tags: [BIP, 元数据, 数据字典, epub.subjectversion.AccsubjectVersion]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 科目多版本 (`epub.subjectversion.AccsubjectVersion`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_accsubject_version` | domain：`fiepub` | 应用：`FP` | 业务对象ID：`bc77fa6b-576b-4186-8f32-b78d0d7266ca`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 科目多版本 |
| 物理表 | `epub_accsubject_version` |
| domain/服务域 | `fiepub` |
| schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 285 个 |
| 关联引用 | 18 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodies` | `epub.subjectversion.AccSubjectMultiDimensionExtVersion` | composition |
| `accSubjectCostFactor` | `epub.subjectversion.AccSubjectCostFactorVersion` | composition |
| `services` | `epub.subjectversion.AccSubjectCtrServiceVersion` | composition |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `` |
| `parentid` | `` |
| `parentchart` | `` |
| `accproperty` | `` |
| `ytenant_id` | `` |
| `exchangerate` | `` |
| `` | `` |
| `creatorId` | `` |
| `modifierId` | `` |
| `accsubject_character` | `` |
| `accsubjectchartSource` | `` |
| `accelement` | `` |
| `currency` | `` |
| `measuredoc` | `` |
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
| `subjectcoderule` | `subjectcoderule` | String | 科目编码规则 |
| `path` | `path` | String | 路径 |
| `objid` | `objid` | String | 友企连id |
| `cashcategory` | `cashcategory` | String | 现金分类 |
| `extendbank` | `extendbank` | String | 扩展银行对账码 |
| `id` | `id` | String | ID |
| `accsubject_vid` | `accsubject_vid` | String | 科目主键 |
| `sysid` | `sysid` | String | 来源主键 |
| `social_srcid` | `social_srcid` | String | 社会化来源id |
| `subject_name_separator` | `subject_name_separator` | String | 科目名称分隔符 |
| `social_tenantid` | `social_tenantid` | String | 社会化来源租户 |
| `accpropertycode` | `accpropertycode` | String | 一级会计要素编码 |
| `creator` | `creator` | String | 创建人名称 |
| `extendservice` | `extendservice` | String | 扩展受控应用 |
| `extenditem` | `extenditem` | String | 扩展辅助核算 |
| `effective_date` | `effective_date` | String | 生效日期 |
| `modifier` | `modifier` | String | 修改人名称 |
| `controlway` | `controlway` | String | 余额控制方式 |
| `srccoreid` | `srccoreid` | String | 核心租户的数据id |
| `accsubjectchart_vid` | `accsubjectchart_vid` | String | 科目表主键 |
| `accsubject_oid` | `accsubject_oid` | String | 科目初始版本id |
| `deficitcheckstrategy` | `deficitcheckstrategy` | String | 赤字检查策略 |
| `code` | `code` | String | 编码 |
| `description` | `description` | String | 描述 |
| `mnemoniccode` | `mnemoniccode` | String | 助记码 |
| `accsubjectchart_oid` | `accsubjectchart_oid` | String | 科目表初始版本id |
| `direction` | `direction` | String | 余额方向 |
| `expiration_date` | `expiration_date` | String | 失效日期 |
| `def1` | `def1` | String | 社会化征用 |
| `def2` | `def2` | String | 社会化核心已下发标识 |
| `glbalance` | `glbalance` | String | 总账账表余额双向显示 |
| `internal_code` | `internal_code` | String | 内码 |

### 引用字段 (14个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `parentid` | `parentid` | ce8d451a-3779-4a48-ba8b-894e68a87fed | 上级科目 |
| `accproperty` | `accproperty` | ea32e071-8dd9-47c2-a3b8-b2ac5f32d159 | 会计要素 |
| `modifierId` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `accelement` | `accelement` | 92f73981-1599-41c6-af3a-b107a0d99a80 | 会计要素表 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `measuredoc` | `measuredoc` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | 计量单位 |
| `currency` | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 币种 |
| `parentchart` | `parentchart` | d1cfa8d9-100d-444f-9b8a-b0a43afab2c0 | 父科目表 |
| `exchangerate` | `exchangerate` | ce8d451a-3779-4a48-ba8b-894e68a87fed | 汇兑损益对方科目 |
| `creatorId` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `accsubjectchart` | `accsubjectchart` | d1cfa8d9-100d-444f-9b8a-b0a43afab2c0 | 科目表 |
| `accsubjectchartSource` | `accsubjectchartSource` | d1cfa8d9-100d-444f-9b8a-b0a43afab2c0 | 所属科目表 |
| `country` | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | 国家地区 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_date` | `create_date` | Date | 创建日期 |
| `modify_date` | `modify_date` | Date | 修改日期 |

### 布尔字段 (223个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `vr100` | `vr100` | Boolean | 辅助段100 |
| `vr47` | `vr47` | Boolean | 辅助段47 |
| `vr46` | `vr46` | Boolean | 辅助段46 |
| `vr45` | `vr45` | Boolean | 辅助段45 |
| `vr44` | `vr44` | Boolean | 辅助段44 |
| `vr43` | `vr43` | Boolean | 辅助段43 |
| `vr42` | `vr42` | Boolean | 辅助段42 |
| `vr41` | `vr41` | Boolean | 辅助段41 |
| `vr40` | `vr40` | Boolean | 辅助段40 |
| `vr39` | `vr39` | Boolean | 辅助段39 |
| `boutchart` | `boutchart` | Boolean | 是否表外科目 |
| `vr38` | `vr38` | Boolean | 辅助段38 |
| `vr37` | `vr37` | Boolean | 辅助段37 |
| `settlementmode` | `settlementmode` | Boolean | 结算方式 |
| `vr36` | `vr36` | Boolean | 辅助段36 |
| `vr35` | `vr35` | Boolean | 辅助段35 |
| `vr34` | `vr34` | Boolean | 辅助段34 |
| `vr33` | `vr33` | Boolean | 辅助段33 |
| `vr32` | `vr32` | Boolean | 辅助段32 |
| `vr31` | `vr31` | Boolean | 辅助段31 |
| `bsystem` | `bsystem` | Boolean | 是否预制 |
| `vr30` | `vr30` | Boolean | 辅助段30 |
| `vr29` | `vr29` | Boolean | 辅助段29 |
| `vr28` | `vr28` | Boolean | 辅助段28 |
| `vr27` | `vr27` | Boolean | 辅助段27 |
| `vr26` | `vr26` | Boolean | 辅助段26 |
| `billno` | `billno` | Boolean | 票据号 |
| `vr61` | `vr61` | Boolean | 辅助段61 |
| `vr60` | `vr60` | Boolean | 辅助段60 |
| `billtime` | `billtime` | Boolean | 票据日期 |
| `vr69` | `vr69` | Boolean | 辅助段69 |
| `vr68` | `vr68` | Boolean | 辅助段68 |
| `vr67` | `vr67` | Boolean | 辅助段67 |
| `isrevaluation` | `isrevaluation` | Boolean | 汇兑损益 |
| `vr66` | `vr66` | Boolean | 辅助段66 |
| `vr65` | `vr65` | Boolean | 辅助段65 |
| `vr64` | `vr64` | Boolean | 辅助段64 |
| `vr63` | `vr63` | Boolean | 辅助段63 |
| `enabled` | `enabled` | Boolean | 是否启用 |
| `vr62` | `vr62` | Boolean | 辅助段62 |
| `bstrongctrl` | `bstrongctrl` | Boolean | 是否强管控 |
| `vr59` | `vr59` | Boolean | 辅助段59 |
| `bbalancecontrol` | `bbalancecontrol` | Boolean | 余额方向控制 |
| `stopstatus` | `stopstatus` | Boolean | 停用状态 |
| `vr50` | `vr50` | Boolean | 辅助段50 |
| `vr58` | `vr58` | Boolean | 辅助段58 |
| `vr57` | `vr57` | Boolean | 辅助段57 |
| `vr56` | `vr56` | Boolean | 辅助段56 |
| `vr55` | `vr55` | Boolean | 辅助段55 |
| `leaf` | `leaf` | Boolean | 末级标识 |
| `vr54` | `vr54` | Boolean | 辅助段54 |
| `vr53` | `vr53` | Boolean | 辅助段53 |
| `vr52` | `vr52` | Boolean | 辅助段52 |
| `vr51` | `vr51` | Boolean | 辅助段51 |
| `bnumcheck` | `bnumcheck` | Boolean | 数量核算 |
| `vr49` | `vr49` | Boolean | 辅助段49 |
| `hasfactor` | `hasfactor` | Boolean | 是否含有成本要素 |
| `vr48` | `vr48` | Boolean | 辅助段48 |
| `parentleaf` | `parentleaf` | Boolean | 父科目表末级标识 |
| `vr83` | `vr83` | Boolean | 辅助段83 |
| `vr82` | `vr82` | Boolean | 辅助段82 |
| `vr81` | `vr81` | Boolean | 辅助段81 |
| `vr80` | `vr80` | Boolean | 辅助段80 |
| `vr89` | `vr89` | Boolean | 辅助段89 |
| `vr88` | `vr88` | Boolean | 辅助段88 |
| `vr87` | `vr87` | Boolean | 辅助段87 |
| `vr86` | `vr86` | Boolean | 辅助段86 |
| `vr85` | `vr85` | Boolean | 辅助段85 |
| `vr84` | `vr84` | Boolean | 辅助段84 |
| `vr72` | `vr72` | Boolean | 辅助段72 |
| `vr71` | `vr71` | Boolean | 辅助段71 |
| `controlledservice` | `controlledservice` | Boolean | 受控应用 |
| `vr70` | `vr70` | Boolean | 辅助段70 |
| `hasnum` | `hasnum` | Boolean | 数量必填 |
| `vr79` | `vr79` | Boolean | 辅助段79 |
| `vr78` | `vr78` | Boolean | 辅助段78 |
| `vr77` | `vr77` | Boolean | 辅助段77 |
| `vr76` | `vr76` | Boolean | 辅助段76 |
| `` | `isEnd` | Boolean | 是否末级 |
| `vr75` | `vr75` | Boolean | 辅助段75 |
| `vr74` | `vr74` | Boolean | 辅助段74 |
| `vr73` | `vr73` | Boolean | 辅助段73 |
| `bsharesub` | `bsharesub` | Boolean | 共享下级 |
| `hasbvr` | `hasbvr` | Boolean | 是否含有辅助核算 |
| `baccrualcontrol` | `baccrualcontrol` | Boolean | 发生额方向控制 |
| `vr25` | `vr25` | Boolean | 辅助段25 |
| `vr24` | `vr24` | Boolean | 辅助段24 |
| `vr23` | `vr23` | Boolean | 辅助段23 |
| `vr22` | `vr22` | Boolean | 辅助段22 |
| `vr21` | `vr21` | Boolean | 辅助段21 |
| `vr20` | `vr20` | Boolean | 辅助段20 |
| `bankverifycode` | `bankverifycode` | Boolean | 银行对账码 |
| `vr19` | `vr19` | Boolean | 辅助段19 |
| `vr18` | `vr18` | Boolean | 辅助段18 |
| `vr17` | `vr17` | Boolean | 辅助段17 |
| `vr16` | `vr16` | Boolean | 辅助段16 |
| `vr15` | `vr15` | Boolean | 辅助段15 |
| `vr94` | `vr94` | Boolean | 辅助段94 |
| `vr93` | `vr93` | Boolean | 辅助段93 |
| `vr92` | `vr92` | Boolean | 辅助段92 |
| `vr91` | `vr91` | Boolean | 辅助段91 |
| `vr90` | `vr90` | Boolean | 辅助段90 |
| `vr14` | `vr14` | Boolean | 辅助段14 |
| `vr13` | `vr13` | Boolean | 辅助段13 |
| `vr12` | `vr12` | Boolean | 辅助段12 |
| `vr11` | `vr11` | Boolean | 辅助段11 |
| `vr99` | `vr99` | Boolean | 辅助段99 |
| `vr10` | `vr10` | Boolean | 辅助段10 |
| `vr98` | `vr98` | Boolean | 辅助段98 |
| `vr97` | `vr97` | Boolean | 辅助段97 |
| `bbalancedisplay` | `bbalancedisplay` | Boolean | 账簿余额双向显示 |
| `vr96` | `vr96` | Boolean | 辅助段96 |
| `vr95` | `vr95` | Boolean | 辅助段95 |
| `vr1` | `vr1` | Boolean | 辅助段1 |
| `vr3` | `vr3` | Boolean | 辅助段3 |
| `vr2` | `vr2` | Boolean | 辅助段2 |
| `vr5` | `vr5` | Boolean | 辅助段5 |
| `vr4` | `vr4` | Boolean | 辅助段4 |
| `vr7` | `vr7` | Boolean | 辅助段7 |
| `vr6` | `vr6` | Boolean | 辅助段6 |
| `vr9` | `vr9` | Boolean | 辅助段9 |
| `vr8` | `vr8` | Boolean | 辅助段8 |
| `bln_verify` | `bln_verify` | Boolean | 往来科目 |
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
| `subjectlevel` | `subjectlevel` | Integer | subjectlevel |
| `social_mctype` | `social_mctype` | Integer | 社会化管控类型 |
| `level` | `level` | Integer | 层级 |
| `sort_num` | `sort_num` | Integer | 排序号 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `accsubject_character` | `accsubject_character` | 567f4f62-b138-4df7-b2a3-03ef0cd7cc94 | 会计科目特征属性 |

### timestamp (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `pubts` | `pubts` | DateTime | 时间戳 |
| `create_time` | `create_time` | DateTime | 创建时间 |
| `stop_time` | `stop_time` | DateTime | 停用时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `displayname` | `displayname` | String | 显示名称 |
| `name` | `name` | String | 名称 |

### other (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | 8518535c-cd89-477a-ae67-f328b39eb08c | 科目成本要素多版本 |
| `` | `` | 4a5f3d46-6884-4bba-b190-c36baf9c98f9 | 科目辅助项多版本 |
| `` | `` | 81acc825-f9e9-48ef-8766-b9f471447ce4 | 科目受控应用多版本 |
