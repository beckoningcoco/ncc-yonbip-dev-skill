---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectioncenter.ic_project"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验项目 (`QMSDFM.inspectioncenter.ic_project`)

> QIC | 物理表：`qms_dfm_ic_project`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验项目 |
| 物理表 | `qms_dfm_ic_project` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:47:09.0440` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户ID | `tenant_id` | String |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | String |
| 4 | `inspectioncenter` | 检测室id | `pk_inspectioncenter` | 3e356da1-f619-432f-8cac-5aef30828e76 |
| 5 | `rownum` | 行号 | `row_num` | Integer |
| 6 | `inspectItemDetailId` | 检验项目主表id | `inspectitem_detail_id` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |
| 7 | `project` | 检验项目 | `pk_project` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `definect_c` | 自定义项特征组 | `definect_c` | 329a7299-4ef8-40f6-a5b1-adaae6603cdb |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `inspectItemDetailId` | 检验项目主表id | `QMSDFM.checkProject.checkProjectDetail` | None |  |
| 3 | `definect_c` | 自定义项特征组 | `QMSDFM.inspectioncenter.IcProjectDefineCharacter` | None |  |
| 4 | `project` | 检验项目 | `QMSDFM.checkProject.checkProject` | None |  |
| 5 | `inspectioncenter` | 检测室id | `QMSDFM.inspectioncenter.inspectioncenter` | None | true |
