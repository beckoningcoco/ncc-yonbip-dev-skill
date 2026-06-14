---
tags: [BIP, 元数据, 数据字典, egl.voucher.AuxiliaryBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 辅助核算项 (`egl.voucher.AuxiliaryBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_auxiliary` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`1bb925c0-6ded-4ee6-8431-67123091b280`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 辅助核算项 |
| 物理表 | `fi_auxiliary` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 117 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `accbook` | `fiepub.fiepub_accountbookref` |
| `pk_org` | `finbd.bd_allaccbodyref` |
| `voucherBodyId` | `` |
| `ytenant_id` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 117 个直连字段

### 文本字段 (107个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `aux_key` | `aux_key` | `auxKey` | 辅助核算维度 |
| `creator` | `creator` | `creator` | 创建人 |
| `description` | `description` | `description` | 描述信息 |
| `id` | `id` | `id` | 主键id |
| `modifier` | `modifier` | `modifier` | 最后修改人 |
| `period` | `period` | `period` | 期间 |
| `pk_group` | `pk_group` | `pkGroup` | 集团 |
| `def1` | `def1` | `vr1` | 部门 |
| `def10` | `def10` | `vr10` | 利润中心 |
| `def100` | `def100` | `vr100` | 自定义项100 |
| `def11` | `def11` | `vr11` | 业务活动类型 |
| `def12` | `def12` | `vr12` | 自定义项12 |
| `def13` | `def13` | `vr13` | 自定义项13 |
| `def14` | `def14` | `vr14` | 自定义项14 |
| `def15` | `def15` | `vr15` | 自定义项15 |
| `def16` | `def16` | `vr16` | 自定义项16 |
| `def17` | `def17` | `vr17` | 自定义项17 |
| `def18` | `def18` | `vr18` | 自定义项18 |
| `def19` | `def19` | `vr19` | 自定义项19 |
| `def2` | `def2` | `vr2` | 项目 |
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
| `def3` | `def3` | `vr3` | 人员 |
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
| `def4` | `def4` | `vr4` | 供应商 |
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
| `def5` | `def5` | `vr5` | 客户 |
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
| `def6` | `def6` | `vr6` | 物料 |
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
| `def7` | `def7` | `vr7` | 物料分类 |
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
| `def8` | `def8` | `vr8` | 成本中心 |
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
| `def9` | `def9` | `vr9` | 业务伙伴 |
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

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook` | `accbook` | `accBook` | 账簿 |
| `pk_org` | `pk_org` | `pkOrg` | 组织 |
| `voucherBodyId` | `voucherBodyId` | `voucherBody` | 凭证分录 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `creationtime` | `creationtime` | `creationTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `ts` | `ts` | `pubts` | 时间戳 |
| `ts` | `ts` | `ts` | 表最后修改时间 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标识 |
