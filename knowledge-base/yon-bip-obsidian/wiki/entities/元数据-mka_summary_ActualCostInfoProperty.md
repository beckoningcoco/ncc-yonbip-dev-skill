---
tags: [BIP, 元数据, 数据字典, mka.summary.ActualCostInfoProperty]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 实际费用子表填报明细 (`mka.summary.ActualCostInfoProperty`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_actual_cost_info_property` | domain：`yycrm` | 应用：`MKA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 实际费用子表填报明细 |
| 物理表 | `mka_actual_cost_info_property` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `MKA` |
| 直连字段 | 184 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `id` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 182字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **单据自定义项接口** (`crmc.base.PropertyInfo`)
  - `propertyValue1` → `propertyValue1`
  - `propertyValue10` → `propertyValue10`
  - `propertyValue100` → `propertyValue100`
  - `propertyValue101` → `propertyValue101`
  - `propertyValue102` → `propertyValue102`
  - `propertyValue103` → `propertyValue103`
  - `propertyValue104` → `propertyValue104`
  - `propertyValue105` → `propertyValue105`
  - `propertyValue106` → `propertyValue106`
  - `propertyValue107` → `propertyValue107`
  - `propertyValue108` → `propertyValue108`
  - `propertyValue109` → `propertyValue109`
  - `propertyValue11` → `propertyValue11`
  - `propertyValue110` → `propertyValue110`
  - `propertyValue111` → `propertyValue111`
  - `propertyValue112` → `propertyValue112`
  - `propertyValue113` → `propertyValue113`
  - `propertyValue114` → `propertyValue114`
  - `propertyValue115` → `propertyValue115`
  - `propertyValue116` → `propertyValue116`
  - `propertyValue117` → `propertyValue117`
  - `propertyValue118` → `propertyValue118`
  - `propertyValue119` → `propertyValue119`
  - `propertyValue12` → `propertyValue12`
  - `propertyValue120` → `propertyValue120`
  - `propertyValue121` → `propertyValue121`
  - `propertyValue122` → `propertyValue122`
  - `propertyValue123` → `propertyValue123`
  - `propertyValue124` → `propertyValue124`
  - `propertyValue125` → `propertyValue125`
  - `propertyValue126` → `propertyValue126`
  - `propertyValue127` → `propertyValue127`
  - `propertyValue128` → `propertyValue128`
  - `propertyValue129` → `propertyValue129`
  - `propertyValue13` → `propertyValue13`
  - `propertyValue130` → `propertyValue130`
  - `propertyValue131` → `propertyValue131`
  - `propertyValue132` → `propertyValue132`
  - `propertyValue133` → `propertyValue133`
  - `propertyValue134` → `propertyValue134`
  - `propertyValue135` → `propertyValue135`
  - `propertyValue136` → `propertyValue136`
  - `propertyValue137` → `propertyValue137`
  - `propertyValue138` → `propertyValue138`
  - `propertyValue139` → `propertyValue139`
  - `propertyValue14` → `propertyValue14`
  - `propertyValue140` → `propertyValue140`
  - `propertyValue141` → `propertyValue141`
  - `propertyValue142` → `propertyValue142`
  - `propertyValue143` → `propertyValue143`
  - `propertyValue144` → `propertyValue144`
  - `propertyValue145` → `propertyValue145`
  - `propertyValue146` → `propertyValue146`
  - `propertyValue147` → `propertyValue147`
  - `propertyValue148` → `propertyValue148`
  - `propertyValue149` → `propertyValue149`
  - `propertyValue15` → `propertyValue15`
  - `propertyValue150` → `propertyValue150`
  - `propertyValue151` → `propertyValue151`
  - `propertyValue152` → `propertyValue152`
  - `propertyValue153` → `propertyValue153`
  - `propertyValue154` → `propertyValue154`
  - `propertyValue155` → `propertyValue155`
  - `propertyValue156` → `propertyValue156`
  - `propertyValue157` → `propertyValue157`
  - `propertyValue158` → `propertyValue158`
  - `propertyValue159` → `propertyValue159`
  - `propertyValue16` → `propertyValue16`
  - `propertyValue160` → `propertyValue160`
  - `propertyValue161` → `propertyValue161`
  - `propertyValue162` → `propertyValue162`
  - `propertyValue163` → `propertyValue163`
  - `propertyValue164` → `propertyValue164`
  - `propertyValue165` → `propertyValue165`
  - `propertyValue166` → `propertyValue166`
  - `propertyValue167` → `propertyValue167`
  - `propertyValue168` → `propertyValue168`
  - `propertyValue169` → `propertyValue169`
  - `propertyValue17` → `propertyValue17`
  - `propertyValue170` → `propertyValue170`
  - `propertyValue171` → `propertyValue171`
  - `propertyValue172` → `propertyValue172`
  - `propertyValue173` → `propertyValue173`
  - `propertyValue174` → `propertyValue174`
  - `propertyValue175` → `propertyValue175`
  - `propertyValue176` → `propertyValue176`
  - `propertyValue177` → `propertyValue177`
  - `propertyValue178` → `propertyValue178`
  - `propertyValue179` → `propertyValue179`
  - `propertyValue18` → `propertyValue18`
  - `propertyValue180` → `propertyValue180`
  - `propertyValue19` → `propertyValue19`
  - `propertyValue2` → `propertyValue2`
  - `propertyValue20` → `propertyValue20`
  - `propertyValue21` → `propertyValue21`
  - `propertyValue22` → `propertyValue22`
  - `propertyValue23` → `propertyValue23`
  - `propertyValue24` → `propertyValue24`
  - `propertyValue25` → `propertyValue25`
  - `propertyValue26` → `propertyValue26`
  - `propertyValue27` → `propertyValue27`
  - `propertyValue28` → `propertyValue28`
  - `propertyValue29` → `propertyValue29`
  - `propertyValue3` → `propertyValue3`
  - `propertyValue30` → `propertyValue30`
  - `propertyValue31` → `propertyValue31`
  - `propertyValue32` → `propertyValue32`
  - `propertyValue33` → `propertyValue33`
  - `propertyValue34` → `propertyValue34`
  - `propertyValue35` → `propertyValue35`
  - `propertyValue36` → `propertyValue36`
  - `propertyValue37` → `propertyValue37`
  - `propertyValue38` → `propertyValue38`
  - `propertyValue39` → `propertyValue39`
  - `propertyValue4` → `propertyValue4`
  - `propertyValue40` → `propertyValue40`
  - `propertyValue41` → `propertyValue41`
  - `propertyValue42` → `propertyValue42`
  - `propertyValue43` → `propertyValue43`
  - `propertyValue44` → `propertyValue44`
  - `propertyValue45` → `propertyValue45`
  - `propertyValue46` → `propertyValue46`
  - `propertyValue47` → `propertyValue47`
  - `propertyValue48` → `propertyValue48`
  - `propertyValue49` → `propertyValue49`
  - `propertyValue5` → `propertyValue5`
  - `propertyValue50` → `propertyValue50`
  - `propertyValue51` → `propertyValue51`
  - `propertyValue52` → `propertyValue52`
  - `propertyValue53` → `propertyValue53`
  - `propertyValue54` → `propertyValue54`
  - `propertyValue55` → `propertyValue55`
  - `propertyValue56` → `propertyValue56`
  - `propertyValue57` → `propertyValue57`
  - `propertyValue58` → `propertyValue58`
  - `propertyValue59` → `propertyValue59`
  - `propertyValue6` → `propertyValue6`
  - `propertyValue60` → `propertyValue60`
  - `propertyValue61` → `propertyValue61`
  - `propertyValue62` → `propertyValue62`
  - `propertyValue63` → `propertyValue63`
  - `propertyValue64` → `propertyValue64`
  - `propertyValue65` → `propertyValue65`
  - `propertyValue66` → `propertyValue66`
  - `propertyValue67` → `propertyValue67`
  - `propertyValue68` → `propertyValue68`
  - `propertyValue69` → `propertyValue69`
  - `propertyValue7` → `propertyValue7`
  - `propertyValue70` → `propertyValue70`
  - `propertyValue71` → `propertyValue71`
  - `propertyValue72` → `propertyValue72`
  - `propertyValue73` → `propertyValue73`
  - `propertyValue74` → `propertyValue74`
  - `propertyValue75` → `propertyValue75`
  - `propertyValue76` → `propertyValue76`
  - `propertyValue77` → `propertyValue77`
  - `propertyValue78` → `propertyValue78`
  - `propertyValue79` → `propertyValue79`
  - `propertyValue8` → `propertyValue8`
  - `propertyValue80` → `propertyValue80`
  - `propertyValue81` → `propertyValue81`
  - `propertyValue82` → `propertyValue82`
  - `propertyValue83` → `propertyValue83`
  - `propertyValue84` → `propertyValue84`
  - `propertyValue85` → `propertyValue85`
  - `propertyValue86` → `propertyValue86`
  - `propertyValue87` → `propertyValue87`
  - `propertyValue88` → `propertyValue88`
  - `propertyValue89` → `propertyValue89`
  - `propertyValue9` → `propertyValue9`
  - `propertyValue90` → `propertyValue90`
  - `propertyValue91` → `propertyValue91`
  - `propertyValue92` → `propertyValue92`
  - `propertyValue93` → `propertyValue93`
  - `propertyValue94` → `propertyValue94`
  - `propertyValue95` → `propertyValue95`
  - `propertyValue96` → `propertyValue96`
  - `propertyValue97` → `propertyValue97`
  - `propertyValue98` → `propertyValue98`
  - `propertyValue99` → `propertyValue99`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 184 个直连字段

### 文本字段 (180个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `propertyValue1` | `propertyValue1` | `propertyValue1` | 属性值1 |
| `propertyValue10` | `propertyValue10` | `propertyValue10` | 属性值10 |
| `propertyValue100` | `propertyValue100` | `propertyValue100` | 属性值100 |
| `propertyValue101` | `propertyValue101` | `propertyValue101` | 属性值101 |
| `propertyValue102` | `propertyValue102` | `propertyValue102` | 属性值102 |
| `propertyValue103` | `propertyValue103` | `propertyValue103` | 属性值103 |
| `propertyValue104` | `propertyValue104` | `propertyValue104` | 属性值104 |
| `propertyValue105` | `propertyValue105` | `propertyValue105` | 属性值105 |
| `propertyValue106` | `propertyValue106` | `propertyValue106` | 属性值106 |
| `propertyValue107` | `propertyValue107` | `propertyValue107` | 属性值107 |
| `propertyValue108` | `propertyValue108` | `propertyValue108` | 属性值108 |
| `propertyValue109` | `propertyValue109` | `propertyValue109` | 属性值109 |
| `propertyValue11` | `propertyValue11` | `propertyValue11` | 属性值11 |
| `propertyValue110` | `propertyValue110` | `propertyValue110` | 属性值110 |
| `propertyValue111` | `propertyValue111` | `propertyValue111` | 属性值111 |
| `propertyValue112` | `propertyValue112` | `propertyValue112` | 属性值112 |
| `propertyValue113` | `propertyValue113` | `propertyValue113` | 属性值113 |
| `propertyValue114` | `propertyValue114` | `propertyValue114` | 属性值114 |
| `propertyValue115` | `propertyValue115` | `propertyValue115` | 属性值115 |
| `propertyValue116` | `propertyValue116` | `propertyValue116` | 属性值116 |
| `propertyValue117` | `propertyValue117` | `propertyValue117` | 属性值117 |
| `propertyValue118` | `propertyValue118` | `propertyValue118` | 属性值118 |
| `propertyValue119` | `propertyValue119` | `propertyValue119` | 属性值119 |
| `propertyValue12` | `propertyValue12` | `propertyValue12` | 属性值12 |
| `propertyValue120` | `propertyValue120` | `propertyValue120` | 属性值120 |
| `propertyValue121` | `propertyValue121` | `propertyValue121` | 属性值121 |
| `propertyValue122` | `propertyValue122` | `propertyValue122` | 属性值122 |
| `propertyValue123` | `propertyValue123` | `propertyValue123` | 属性值123 |
| `propertyValue124` | `propertyValue124` | `propertyValue124` | 属性值124 |
| `propertyValue125` | `propertyValue125` | `propertyValue125` | 属性值125 |
| `propertyValue126` | `propertyValue126` | `propertyValue126` | 属性值126 |
| `propertyValue127` | `propertyValue127` | `propertyValue127` | 属性值127 |
| `propertyValue128` | `propertyValue128` | `propertyValue128` | 属性值128 |
| `propertyValue129` | `propertyValue129` | `propertyValue129` | 属性值129 |
| `propertyValue13` | `propertyValue13` | `propertyValue13` | 属性值13 |
| `propertyValue130` | `propertyValue130` | `propertyValue130` | 属性值130 |
| `propertyValue131` | `propertyValue131` | `propertyValue131` | 属性值131 |
| `propertyValue132` | `propertyValue132` | `propertyValue132` | 属性值132 |
| `propertyValue133` | `propertyValue133` | `propertyValue133` | 属性值133 |
| `propertyValue134` | `propertyValue134` | `propertyValue134` | 属性值134 |
| `propertyValue135` | `propertyValue135` | `propertyValue135` | 属性值135 |
| `propertyValue136` | `propertyValue136` | `propertyValue136` | 属性值136 |
| `propertyValue137` | `propertyValue137` | `propertyValue137` | 属性值137 |
| `propertyValue138` | `propertyValue138` | `propertyValue138` | 属性值138 |
| `propertyValue139` | `propertyValue139` | `propertyValue139` | 属性值139 |
| `propertyValue14` | `propertyValue14` | `propertyValue14` | 属性值14 |
| `propertyValue140` | `propertyValue140` | `propertyValue140` | 属性值140 |
| `propertyValue141` | `propertyValue141` | `propertyValue141` | 属性值141 |
| `propertyValue142` | `propertyValue142` | `propertyValue142` | 属性值142 |
| `propertyValue143` | `propertyValue143` | `propertyValue143` | 属性值143 |
| `propertyValue144` | `propertyValue144` | `propertyValue144` | 属性值144 |
| `propertyValue145` | `propertyValue145` | `propertyValue145` | 属性值145 |
| `propertyValue146` | `propertyValue146` | `propertyValue146` | 属性值146 |
| `propertyValue147` | `propertyValue147` | `propertyValue147` | 属性值147 |
| `propertyValue148` | `propertyValue148` | `propertyValue148` | 属性值148 |
| `propertyValue149` | `propertyValue149` | `propertyValue149` | 属性值149 |
| `propertyValue15` | `propertyValue15` | `propertyValue15` | 属性值15 |
| `propertyValue150` | `propertyValue150` | `propertyValue150` | 属性值150 |
| `propertyValue151` | `propertyValue151` | `propertyValue151` | 属性值151 |
| `propertyValue152` | `propertyValue152` | `propertyValue152` | 属性值152 |
| `propertyValue153` | `propertyValue153` | `propertyValue153` | 属性值153 |
| `propertyValue154` | `propertyValue154` | `propertyValue154` | 属性值154 |
| `propertyValue155` | `propertyValue155` | `propertyValue155` | 属性值155 |
| `propertyValue156` | `propertyValue156` | `propertyValue156` | 属性值156 |
| `propertyValue157` | `propertyValue157` | `propertyValue157` | 属性值157 |
| `propertyValue158` | `propertyValue158` | `propertyValue158` | 属性值158 |
| `propertyValue159` | `propertyValue159` | `propertyValue159` | 属性值159 |
| `propertyValue16` | `propertyValue16` | `propertyValue16` | 属性值16 |
| `propertyValue160` | `propertyValue160` | `propertyValue160` | 属性值160 |
| `propertyValue161` | `propertyValue161` | `propertyValue161` | 属性值161 |
| `propertyValue162` | `propertyValue162` | `propertyValue162` | 属性值162 |
| `propertyValue163` | `propertyValue163` | `propertyValue163` | 属性值163 |
| `propertyValue164` | `propertyValue164` | `propertyValue164` | 属性值164 |
| `propertyValue165` | `propertyValue165` | `propertyValue165` | 属性值165 |
| `propertyValue166` | `propertyValue166` | `propertyValue166` | 属性值166 |
| `propertyValue167` | `propertyValue167` | `propertyValue167` | 属性值167 |
| `propertyValue168` | `propertyValue168` | `propertyValue168` | 属性值168 |
| `propertyValue169` | `propertyValue169` | `propertyValue169` | 属性值169 |
| `propertyValue17` | `propertyValue17` | `propertyValue17` | 属性值17 |
| `propertyValue170` | `propertyValue170` | `propertyValue170` | 属性值170 |
| `propertyValue171` | `propertyValue171` | `propertyValue171` | 属性值171 |
| `propertyValue172` | `propertyValue172` | `propertyValue172` | 属性值172 |
| `propertyValue173` | `propertyValue173` | `propertyValue173` | 属性值173 |
| `propertyValue174` | `propertyValue174` | `propertyValue174` | 属性值174 |
| `propertyValue175` | `propertyValue175` | `propertyValue175` | 属性值175 |
| `propertyValue176` | `propertyValue176` | `propertyValue176` | 属性值176 |
| `propertyValue177` | `propertyValue177` | `propertyValue177` | 属性值177 |
| `propertyValue178` | `propertyValue178` | `propertyValue178` | 属性值178 |
| `propertyValue179` | `propertyValue179` | `propertyValue179` | 属性值179 |
| `propertyValue18` | `propertyValue18` | `propertyValue18` | 属性值18 |
| `propertyValue180` | `propertyValue180` | `propertyValue180` | 属性值180 |
| `propertyValue19` | `propertyValue19` | `propertyValue19` | 属性值19 |
| `propertyValue2` | `propertyValue2` | `propertyValue2` | 属性值2 |
| `propertyValue20` | `propertyValue20` | `propertyValue20` | 属性值20 |
| `propertyValue21` | `propertyValue21` | `propertyValue21` | 属性值21 |
| `propertyValue22` | `propertyValue22` | `propertyValue22` | 属性值22 |
| `propertyValue23` | `propertyValue23` | `propertyValue23` | 属性值23 |
| `propertyValue24` | `propertyValue24` | `propertyValue24` | 属性值24 |
| `propertyValue25` | `propertyValue25` | `propertyValue25` | 属性值25 |
| `propertyValue26` | `propertyValue26` | `propertyValue26` | 属性值26 |
| `propertyValue27` | `propertyValue27` | `propertyValue27` | 属性值27 |
| `propertyValue28` | `propertyValue28` | `propertyValue28` | 属性值28 |
| `propertyValue29` | `propertyValue29` | `propertyValue29` | 属性值29 |
| `propertyValue3` | `propertyValue3` | `propertyValue3` | 属性值3 |
| `propertyValue30` | `propertyValue30` | `propertyValue30` | 属性值30 |
| `propertyValue31` | `propertyValue31` | `propertyValue31` | 属性值31 |
| `propertyValue32` | `propertyValue32` | `propertyValue32` | 属性值32 |
| `propertyValue33` | `propertyValue33` | `propertyValue33` | 属性值33 |
| `propertyValue34` | `propertyValue34` | `propertyValue34` | 属性值34 |
| `propertyValue35` | `propertyValue35` | `propertyValue35` | 属性值35 |
| `propertyValue36` | `propertyValue36` | `propertyValue36` | 属性值36 |
| `propertyValue37` | `propertyValue37` | `propertyValue37` | 属性值37 |
| `propertyValue38` | `propertyValue38` | `propertyValue38` | 属性值38 |
| `propertyValue39` | `propertyValue39` | `propertyValue39` | 属性值39 |
| `propertyValue4` | `propertyValue4` | `propertyValue4` | 属性值4 |
| `propertyValue40` | `propertyValue40` | `propertyValue40` | 属性值40 |
| `propertyValue41` | `propertyValue41` | `propertyValue41` | 属性值41 |
| `propertyValue42` | `propertyValue42` | `propertyValue42` | 属性值42 |
| `propertyValue43` | `propertyValue43` | `propertyValue43` | 属性值43 |
| `propertyValue44` | `propertyValue44` | `propertyValue44` | 属性值44 |
| `propertyValue45` | `propertyValue45` | `propertyValue45` | 属性值45 |
| `propertyValue46` | `propertyValue46` | `propertyValue46` | 属性值46 |
| `propertyValue47` | `propertyValue47` | `propertyValue47` | 属性值47 |
| `propertyValue48` | `propertyValue48` | `propertyValue48` | 属性值48 |
| `propertyValue49` | `propertyValue49` | `propertyValue49` | 属性值49 |
| `propertyValue5` | `propertyValue5` | `propertyValue5` | 属性值5 |
| `propertyValue50` | `propertyValue50` | `propertyValue50` | 属性值50 |
| `propertyValue51` | `propertyValue51` | `propertyValue51` | 属性值51 |
| `propertyValue52` | `propertyValue52` | `propertyValue52` | 属性值52 |
| `propertyValue53` | `propertyValue53` | `propertyValue53` | 属性值53 |
| `propertyValue54` | `propertyValue54` | `propertyValue54` | 属性值54 |
| `propertyValue55` | `propertyValue55` | `propertyValue55` | 属性值55 |
| `propertyValue56` | `propertyValue56` | `propertyValue56` | 属性值56 |
| `propertyValue57` | `propertyValue57` | `propertyValue57` | 属性值57 |
| `propertyValue58` | `propertyValue58` | `propertyValue58` | 属性值58 |
| `propertyValue59` | `propertyValue59` | `propertyValue59` | 属性值59 |
| `propertyValue6` | `propertyValue6` | `propertyValue6` | 属性值6 |
| `propertyValue60` | `propertyValue60` | `propertyValue60` | 属性值60 |
| `propertyValue61` | `propertyValue61` | `propertyValue61` | 属性值61 |
| `propertyValue62` | `propertyValue62` | `propertyValue62` | 属性值62 |
| `propertyValue63` | `propertyValue63` | `propertyValue63` | 属性值63 |
| `propertyValue64` | `propertyValue64` | `propertyValue64` | 属性值64 |
| `propertyValue65` | `propertyValue65` | `propertyValue65` | 属性值65 |
| `propertyValue66` | `propertyValue66` | `propertyValue66` | 属性值66 |
| `propertyValue67` | `propertyValue67` | `propertyValue67` | 属性值67 |
| `propertyValue68` | `propertyValue68` | `propertyValue68` | 属性值68 |
| `propertyValue69` | `propertyValue69` | `propertyValue69` | 属性值69 |
| `propertyValue7` | `propertyValue7` | `propertyValue7` | 属性值7 |
| `propertyValue70` | `propertyValue70` | `propertyValue70` | 属性值70 |
| `propertyValue71` | `propertyValue71` | `propertyValue71` | 属性值71 |
| `propertyValue72` | `propertyValue72` | `propertyValue72` | 属性值72 |
| `propertyValue73` | `propertyValue73` | `propertyValue73` | 属性值73 |
| `propertyValue74` | `propertyValue74` | `propertyValue74` | 属性值74 |
| `propertyValue75` | `propertyValue75` | `propertyValue75` | 属性值75 |
| `propertyValue76` | `propertyValue76` | `propertyValue76` | 属性值76 |
| `propertyValue77` | `propertyValue77` | `propertyValue77` | 属性值77 |
| `propertyValue78` | `propertyValue78` | `propertyValue78` | 属性值78 |
| `propertyValue79` | `propertyValue79` | `propertyValue79` | 属性值79 |
| `propertyValue8` | `propertyValue8` | `propertyValue8` | 属性值8 |
| `propertyValue80` | `propertyValue80` | `propertyValue80` | 属性值80 |
| `propertyValue81` | `propertyValue81` | `propertyValue81` | 属性值81 |
| `propertyValue82` | `propertyValue82` | `propertyValue82` | 属性值82 |
| `propertyValue83` | `propertyValue83` | `propertyValue83` | 属性值83 |
| `propertyValue84` | `propertyValue84` | `propertyValue84` | 属性值84 |
| `propertyValue85` | `propertyValue85` | `propertyValue85` | 属性值85 |
| `propertyValue86` | `propertyValue86` | `propertyValue86` | 属性值86 |
| `propertyValue87` | `propertyValue87` | `propertyValue87` | 属性值87 |
| `propertyValue88` | `propertyValue88` | `propertyValue88` | 属性值88 |
| `propertyValue89` | `propertyValue89` | `propertyValue89` | 属性值89 |
| `propertyValue9` | `propertyValue9` | `propertyValue9` | 属性值9 |
| `propertyValue90` | `propertyValue90` | `propertyValue90` | 属性值90 |
| `propertyValue91` | `propertyValue91` | `propertyValue91` | 属性值91 |
| `propertyValue92` | `propertyValue92` | `propertyValue92` | 属性值92 |
| `propertyValue93` | `propertyValue93` | `propertyValue93` | 属性值93 |
| `propertyValue94` | `propertyValue94` | `propertyValue94` | 属性值94 |
| `propertyValue95` | `propertyValue95` | `propertyValue95` | 属性值95 |
| `propertyValue96` | `propertyValue96` | `propertyValue96` | 属性值96 |
| `propertyValue97` | `propertyValue97` | `propertyValue97` | 属性值97 |
| `propertyValue98` | `propertyValue98` | `propertyValue98` | 属性值98 |
| `propertyValue99` | `propertyValue99` | `propertyValue99` | 属性值99 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 实际费用 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
