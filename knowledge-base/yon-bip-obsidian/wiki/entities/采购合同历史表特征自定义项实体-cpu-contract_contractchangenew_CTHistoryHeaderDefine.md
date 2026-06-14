---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contractchangenew.CTHistoryHeaderDefine"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购合同历史表特征自定义项实体 (`cpu-contract.contractchangenew.CTHistoryHeaderDefine`)

> ycContractManagement | 物理表：`cpu_ct_history_header_define`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购合同历史表特征自定义项实体 |
| 物理表 | `cpu_ct_history_header_define` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycContractManagement` |
| 构建时间 | `2026-06-04 23:44:18.1620` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `FJTZ` | 附件特征 | `vcol53` | String |
| 2 | `Test002` | Test | `vcol3` | b9dcc421-d980-4ecd-81b0-7952a682055a |
| 3 | `Test01` | Test01 | `bcol1` | Boolean |
| 4 | `Test05` | Test文本 | `vcol4` | Test01 |
| 5 | `Test06` | Test员工 | `vcol5` | 5d917a02-153f-4482-b3dc-b445e7639ca3 |
| 6 | `YYJTEST001` | 合同类型yyj | `vcol6` | cdcd6c71-c57f-4d69-923a-04f2806aca60 |
| 7 | `cgbm0001` | 使用部门 | `vcol2` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 8 | `cstz001` | 测试特征字段 | `vcol54` | String |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `id` | ID | `id` | String |
| 11 | `jylx_memo` | 交易类型备注 | `vcol1` | String |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `tzbbb` | cb合同备注 | `vcol55` | String |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `Test06` | Test员工 | `bd.customerdoc_0004.0004` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `cgbm0001` | 使用部门 | `bd.adminOrg.AdminOrgVO` | Service |  |
| 4 | `YYJTEST001` | 合同类型yyj | `bd.customerdoc_YYJTEST001.YYJTEST001` | Service |  |
| 5 | `Test002` | Test | `bd.customerdoc_11.11` | Service |  |
