---
tags: [BIP, 元数据, 数据字典, GL.rulevoucher.fiVtHead]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 规则凭证主表 (`GL.rulevoucher.fiVtHead`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_vt_head` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`7b4c8f89-c22b-45b7-beca-0834bdafea6a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 规则凭证主表 |
| 物理表 | `fi_vt_head` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 133 个 |
| 子表 | 6 个 |
| 关联引用 | 16 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `fiVtLinkList` | `GL.rulevoucher.fiVtLink` | composition |
| `fiVtCashflowList` | `GL.rulevoucher.fiVtCashflow` | composition |
| `fiVtBodyList` | `GL.rulevoucher.fiVtBody` | composition |
| `fiRulevoucherDistributeList` | `GL.rulevoucher.fiRulevoucherDistribute` | composition |
| `fiVtAmortizeList` | `GL.rulevoucher.fiVtAmortize` | composition |
| `fiVtAuxList` | `GL.rulevoucher.fiVtAux` | composition |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `` | `` |
| `accbook` | `` |
| `modifier` | `` |
| `ytenant_id` | `` |
| `accbody` | `` |
| `effectperiodid` | `` |
| `vouchertype` | `` |
| `rulevouchersort` | `` |
| `accstandard` | `` |
| `accsubjectchart` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 133 个直连字段

### 文本字段 (99个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `accperiodscheme` | `accperiodscheme` | `accperiodscheme` | 会计期间方案 |
| `category` | `category` | `category` | 类型 |
| `code` | `code` | `code` | 编码 |
| `carrytype` | `carrytype` | `carrytype` | 结转方式 |
| `amortize_mode` | `amortize_mode` | `amortizeMode` | 待摊方式 |
| `businesstype` | `businesstype` | `businesstype` | 业务类型 |
| `pk_group` | `pk_group` | `pkGroup` | 集团 |
| `pk_org` | `pk_org` | `pkOrg` | 会计主体 |
| `profitaccsubject` | `profitaccsubject` | `profitaccsubject` | 本年利润科目 |
| `settlestrategy` | `settlestrategy` | `settlestrategy` | 结账检查策略 |
| `srctplid` | `srctplid` | `srctplid` | 基准库ID |
| `template_type` | `template_type` | `templateType` | 模板类型 |
| `periodtype` | `periodtype` | `periodtype` | 期间类型 |
| `effectperiod` | `effectperiod` | `effectperiod` | 开始期间 |
| `expiryperiod` | `expiryperiod` | `expiryperiod` | 结束期间 |
| `description` | `description` | `description` | 描述 |
| `description2` | `description2` | `description2` | 描述多语扩展列2 |
| `description3` | `description3` | `description3` | 描述多语扩展列3 |
| `description4` | `description4` | `description4` | 描述多语扩展列4 |
| `description5` | `description5` | `description5` | 描述多语扩展列5 |
| `description6` | `description6` | `description6` | 描述多语扩展列6 |
| `vdescription2` | `vdescription2` | `vdescription2` | 摘要(多语) |
| `vdescription3` | `vdescription3` | `vdescription3` | 摘要(多语) |
| `vdescription4` | `vdescription4` | `vdescription4` | 摘要(多语) |
| `vdescription5` | `vdescription5` | `vdescription5` | 摘要(多语) |
| `vdescription6` | `vdescription6` | `vdescription6` | 摘要(多语) |
| `name2` | `name2` | `name2` | 规则凭证分类名称多语扩展列2 |
| `name3` | `name3` | `name3` | 规则凭证分类名称多语扩展列3 |
| `name4` | `name4` | `name4` | 规则凭证分类名称多语扩展列4 |
| `name5` | `name5` | `name5` | 规则凭证分类名称多语扩展列5 |
| `name6` | `name6` | `name6` | 规则凭证分类名称多语扩展列6 |
| `parmk1` | `parmk1` | `parmk1` | 预留公式变量 |
| `parmk2` | `parmk2` | `parmk2` | 预留公式变量 |
| `parmk3` | `parmk3` | `parmk3` | 预留公式变量 |
| `parmk4` | `parmk4` | `parmk4` | 预留公式变量 |
| `parmk5` | `parmk5` | `parmk5` | 预留公式变量 |
| `parmk6` | `parmk6` | `parmk6` | 预留公式变量 |
| `parmk7` | `parmk7` | `parmk7` | 预留公式变量 |
| `parmk8` | `parmk8` | `parmk8` | 预留公式变量 |
| `parmk9` | `parmk9` | `parmk9` | 预留公式变量 |
| `parmk10` | `parmk10` | `parmk10` | 预留公式变量 |
| `parmk11` | `parmk11` | `parmk11` | 预留公式变量 |
| `parmk12` | `parmk12` | `parmk12` | 预留公式变量 |
| `parmk13` | `parmk13` | `parmk13` | 预留公式变量 |
| `parmk14` | `parmk14` | `parmk14` | 预留公式变量 |
| `parmk15` | `parmk15` | `parmk15` | 预留公式变量 |
| `parmk16` | `parmk16` | `parmk16` | 预留公式变量 |
| `parmk17` | `parmk17` | `parmk17` | 预留公式变量 |
| `parmk18` | `parmk18` | `parmk18` | 预留公式变量 |
| `parmk19` | `parmk19` | `parmk19` | 预留公式变量 |
| `parmk20` | `parmk20` | `parmk20` | 预留公式变量 |
| `parmt1` | `parmt1` | `parmt1` | 预留公式变量 |
| `parmt2` | `parmt2` | `parmt2` | 预留公式变量 |
| `parmt3` | `parmt3` | `parmt3` | 预留公式变量 |
| `parmt4` | `parmt4` | `parmt4` | 预留公式变量 |
| `parmt5` | `parmt5` | `parmt5` | 预留公式变量 |
| `parmt6` | `parmt6` | `parmt6` | 预留公式变量 |
| `parmt7` | `parmt7` | `parmt7` | 预留公式变量 |
| `parmt8` | `parmt8` | `parmt8` | 预留公式变量 |
| `parmt9` | `parmt9` | `parmt9` | 预留公式变量 |
| `parmt10` | `parmt10` | `parmt10` | 预留公式变量 |
| `parmt11` | `parmt11` | `parmt11` | 预留公式变量 |
| `parmt12` | `parmt12` | `parmt12` | 预留公式变量 |
| `parmt13` | `parmt13` | `parmt13` | 预留公式变量 |
| `parmt14` | `parmt14` | `parmt14` | 预留公式变量 |
| `parmt15` | `parmt15` | `parmt15` | 预留公式变量 |
| `parmt16` | `parmt16` | `parmt16` | 预留公式变量 |
| `parmt17` | `parmt17` | `parmt17` | 预留公式变量 |
| `parmt18` | `parmt18` | `parmt18` | 预留公式变量 |
| `parmt19` | `parmt19` | `parmt19` | 预留公式变量 |
| `parmt20` | `parmt20` | `parmt20` | 预留公式变量 |
| `parmv1` | `parmv1` | `parmv1` | 预留公式变量 |
| `parmv2` | `parmv2` | `parmv2` | 预留公式变量 |
| `parmv3` | `parmv3` | `parmv3` | 预留公式变量 |
| `parmv4` | `parmv4` | `parmv4` | 预留公式变量 |
| `parmv5` | `parmv5` | `parmv5` | 预留公式变量 |
| `parmv6` | `parmv6` | `parmv6` | 预留公式变量 |
| `parmv7` | `parmv7` | `parmv7` | 预留公式变量 |
| `parmv8` | `parmv8` | `parmv8` | 预留公式变量 |
| `parmv9` | `parmv9` | `parmv9` | 预留公式变量 |
| `parmv10` | `parmv10` | `parmv10` | 预留公式变量 |
| `parmv11` | `parmv11` | `parmv11` | 预留公式变量 |
| `parmv12` | `parmv12` | `parmv12` | 预留公式变量 |
| `parmv13` | `parmv13` | `parmv13` | 预留公式变量 |
| `parmv14` | `parmv14` | `parmv14` | 预留公式变量 |
| `parmv15` | `parmv15` | `parmv15` | 预留公式变量 |
| `parmv16` | `parmv16` | `parmv16` | 预留公式变量 |
| `parmv17` | `parmv17` | `parmv17` | 预留公式变量 |
| `parmv18` | `parmv18` | `parmv18` | 预留公式变量 |
| `parmv19` | `parmv19` | `parmv19` | 预留公式变量 |
| `parmv20` | `parmv20` | `parmv20` | 预留公式变量 |
| `outserviceimpl` | `outserviceimpl` | `outserviceimpl` | 外部服务 |
| `outserviceparams` | `outserviceparams` | `outserviceparams` | 外部服务参数 |
| `vtlevel` | `vtlevel` | `vtlevel` | 模板级别 |
| `ts` | `ts` | `ts` | 最新修改时间 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
| `tenantid` | `tenantid` | `tenantid` | 租户id |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbody` | `accbody` | `accbody` | 会计主体 |
| `accbook` | `accbook` | `accbook` | 账簿id |
| `accsubjectchart` | `accsubjectchart` | `accsubjectchart` | 科目表 |
| `accstandard` | `accstandard` | `accstandard` | 会计准则 |
| `rulevouchersort` | `rulevouchersort` | `rulevouchersort` | 所属分类 |
| `effectperiodid` | `effectperiodid` | `effectperiodid` | 开始期间id |
| `vouchertype` | `vouchertype` | `vouchertype` | 凭证类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 整数 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `currencycarry` | `currencycarry` | `currencycarry` | 币种 |
| `backflush` | `backflush` | `backflush` | 是否下月回冲标识 |
| `profitaloss` | `profitaloss` | `profitaloss` | 损益结转标识 |
| `share` | `share` | `share` | 是否共享标识 |
| `showorder` | `showorder` | `showorder` | 显示顺序 |
| `terminal` | `terminal` | `terminal` | 期末处理 |
| `times` | `times` | `times` | 执行次数 |
| `cycleNum` | `cycleNum` | `cyclenum` | 周期个数 |
| `dr` | `dr` | `dr` | 逻辑删除 |
| `enable` | `enable` | `enable` | 是否启用标志 |
| `from_accbook` | `from_accbook` | `fromAccbook` | 是否随账簿创建 |
| `hascashflow` | `hascashflow` | `hascashflow` | 是否包含现金流量定义标识 |
| `hasgetline` | `hasgetline` | `hasgetline` | 是否包含行间取数标识 |
| `ismachine` | `ismachine` | `ismachine` | 是否机器人 |

### multiLineText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `manualaccsubject` | `manualaccsubject` | `manualaccsubject` | 会计科目 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vdescription` | `vdescription` | `vdescription` | 摘要 |
| `name` | `name` | `name` | 名称 |
| `voucher_abstract` | `voucher_abstract` | `voucherAbstract` | 凭证摘要 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `fiRulevoucherDistributeList` | 规则凭证共享关系表 |
| `` | `` | `fiVtAmortizeList` | 规则凭证摊销辅助记录 |
| `` | `` | `fiVtAuxList` | 规则凭证辅助核算子表 |
| `` | `` | `fiVtBodyList` | 规则凭证分录子表 |
| `` | `` | `fiVtCashflowList` | 规则凭证现金流量定义子表 |
| `` | `` | `fiVtLinkList` | 规则凭证生成凭证关联表 |
