---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.baseinspectorder.qms_qit_baseinspectorder_sourcelist"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验单源单信息公共 (`QMSQIT.baseinspectorder.qms_qit_baseinspectorder_sourcelist`)

> QMSQIT | 物理表：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验单源单信息公共 |
| 物理表 | `` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:47:39.4790` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `applycheckastnum` | 请检数量 | `applycheckastnum` | Decimal |
| 2 | `applychecknum` | 请检主数量 | `applychecknum` | Decimal |
| 3 | `busiDate` | 业务日期 | `busiDate` | DateTime |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `id` | ID | `id` | String |
| 6 | `orderbilltype` | 请检源头单据类型 | `orderbilltype` | String |
| 7 | `pk_inspectorder_h` | 检验单 | `pk_inspectorder_h` | 30720069-2233-4271-8edb-a442eaab5e38 |
| 8 | `pk_orderbill` | 请检源头单据id | `pk_orderbill` | String |
| 9 | `pk_sourcebill` | 请检来源单据id | `pk_sourcebill` | String |
| 10 | `pk_sourcebill_b` | 请检来源单据行id | `pk_sourcebill_b` | String |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `qms_qit_baseinspectorder_resultList` | 检验单处理结果公共 | `` | a4551546-cd42-4ba5-adb1-c8f055098517 |
| 13 | `sastunitid` | 单位 | `sastunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 14 | `schangerate` | 换算率 | `schangerate` | String |
| 15 | `sourcebilltype` | 请检来源单据类型 | `sourcebilltype` | String |
| 16 | `sourcerowno` | 请检来源单据行号 | `sourcerowno` | String |
| 17 | `sunitid` | 主单位 | `sunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 18 | `tenant` | 租户ID | `tenant_id` | String |
| 19 | `vordercode` | 请检源头单据号 | `vordercode` | String |
| 20 | `vorderrowno` | 请检源头行号 | `vorderrowno` | String |
| 21 | `vsourcecode` | 请检来源单据号 | `vsourcecode` | String |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `qms_qit_baseinspectorder_resultList` | 检验单处理结果公共 | `QMSQIT.baseinspectorder.qms_qit_baseinspectorder_result` | None | true |
| 2 | `sunitid` | 主单位 | `pc.unit.Unit` | Service |  |
| 3 | `sastunitid` | 单位 | `pc.unit.Unit` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `pk_inspectorder_h` | 检验单 | `QMSQIT.baseinspectorder.qms_qit_baseinspectorder_h` | None | true |
