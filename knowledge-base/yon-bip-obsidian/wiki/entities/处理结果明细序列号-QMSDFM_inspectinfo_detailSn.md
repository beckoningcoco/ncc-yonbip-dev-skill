---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectinfo.detailSn"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 处理结果明细序列号 (`QMSDFM.inspectinfo.detailSn`)

> QIC | 物理表：`qms_dfm_inspect_result_sn`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 处理结果明细序列号 |
| 物理表 | `qms_dfm_inspect_result_sn` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:48:23.6640` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 行号 |

---

## 直接属性（58个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `detailId` | 处理结果明细id | `detail_id` | 4c689e62-6856-4782-8816-ed511f092e68 |
| 4 | `snCharacter` | 序列号自由项特征组 | `sn_characteristics` | a1d53ad5-dd25-4b3a-8c83-8d129c05e088 |
| 5 | `insres_sourceID_sn` | 检验结果来源id | `insres_source_id` | String |
| 6 | `insres_sourceBodyID_sn` | 检验结果来源行id | `insres_sourcebody_id` | String |
| 7 | `insres_sourcetype_sn` | 检验结果来源单据类型 | `insres_sourcetype` | String |
| 8 | `insres_sourcenum_sn` | 检验结果来源单据号 | `insres_sourcenum` | String |
| 9 | `source_incominspect_id_sn` | 源头检验单id | `source_incominspect_id` | String |
| 10 | `source_incominspect_billcode_sn` | 源头检验单号 | `source_incominspect_billcode` | String |
| 11 | `inspectDate_sn` | 检验日期 | `inspectDate` | Date |
| 12 | `checkApplyCode_sn` | 检验申请单号 | `checkapply_code` | String |
| 13 | `checkApplyID_sn` | 检验申请ID | `checkapply_id` | String |
| 14 | `attachmentId_sn` | 附件 | `attachmentId` | String |
| 15 | `main_num_sn` | 主数量 | `main_num` | Decimal |
| 16 | `nnumber_sn` | 件数 | `nnumber` | Decimal |
| 17 | `stock_num_sn` | 库存件数 | `stock_num` | Decimal |
| 18 | `pkDfmCheckRecord` | 检验记录id | `check_record_id` | Long |
| 19 | `define1` | 自定义项1 | `define1` | String |
| 20 | `define2` | 自定义项2 | `define2` | String |
| 21 | `define3` | 自定义项3 | `define3` | String |
| 22 | `define4` | 自定义项4 | `define4` | String |
| 23 | `define5` | 自定义项5 | `define5` | String |
| 24 | `define6` | 自定义项6 | `define6` | String |
| 25 | `define7` | 自定义项7 | `define7` | String |
| 26 | `define8` | 自定义项8 | `define8` | String |
| 27 | `define9` | 自定义项9 | `define9` | String |
| 28 | `define10` | 自定义项10 | `define10` | String |
| 29 | `define11` | 自定义项11 | `define11` | String |
| 30 | `define12` | 自定义项12 | `define12` | String |
| 31 | `define13` | 自定义项13 | `define13` | String |
| 32 | `define14` | 自定义项14 | `define14` | String |
| 33 | `define15` | 自定义项15 | `define15` | String |
| 34 | `define16` | 自定义项16 | `define16` | String |
| 35 | `define17` | 自定义项17 | `define17` | String |
| 36 | `define18` | 自定义项18 | `define18` | String |
| 37 | `define19` | 自定义项19 | `define19` | String |
| 38 | `define20` | 自定义项20 | `define20` | String |
| 39 | `define21` | 自定义项21 | `define21` | String |
| 40 | `define22` | 自定义项22 | `define22` | String |
| 41 | `define23` | 自定义项23 | `define23` | String |
| 42 | `define24` | 自定义项24 | `define24` | String |
| 43 | `define25` | 自定义项25 | `define25` | String |
| 44 | `define26` | 自定义项26 | `define26` | String |
| 45 | `define27` | 自定义项27 | `define27` | String |
| 46 | `define28` | 自定义项28 | `define28` | String |
| 47 | `define29` | 自定义项29 | `define29` | String |
| 48 | `define30` | 自定义项30 | `define30` | String |
| 49 | `dr` | 逻辑删除标记 | `dr` | Short |
| 50 | `sn` | 序列号 | `csn_code` | String |
| 51 | `updatecount` | 序列号更新次数 | `iUpdateCount` | Integer |
| 52 | `presnstate` | 序列号上一状态 | `creSNstate` | String |
| 53 | `snstate` | 序列号状态 | `cSNstate` | String |
| 54 | `sourcebillsnid` | 来源序列号行id | `iSourceBillSNId` | Long |
| 55 | `makebillsign` | 生单标识 | `cMakeBillSign` | String |
| 56 | `rowno` | 行号 | `rowno` | Integer |
| 57 | `pubts` | 时间戳 | `pubts` | DateTime |
| 58 | `resSourceRowID` | 检验结果源单行ID | `ressource_row_id` | String |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `snCharacter` | 序列号自由项特征组 | `QMSDFM.inspectinfo.SnCharacteristicsFree` | None |  |
| 3 | `detailId` | 处理结果明细id | `QMSDFM.inspectinfo.inspectresultdetail` | None | true |
