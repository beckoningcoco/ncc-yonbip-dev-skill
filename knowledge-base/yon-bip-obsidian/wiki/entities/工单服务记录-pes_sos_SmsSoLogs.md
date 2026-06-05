---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.sos.SmsSoLogs"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工单服务记录 (`pes.sos.SmsSoLogs`)

> IMP_PES | 物理表：`sms_so_logs`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工单服务记录 |
| 物理表 | `sms_so_logs` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:38.1970` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（30个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `content` | 日志内容(异常说明/汇报内容/签到位置/评价得分) | `content` | String |
| 2 | `currNode` | 当前环节 | `curr_node` | String |
| 3 | `endReportDate` | 汇报结束时间 | `end_reportdate` | String |
| 4 | `fileList` | 附件 | `file_list` | String |
| 5 | `handlePersonId` | 处理人 | `handle_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 6 | `handlePersonName` | 处理人名称 | `handle_person_name` | String |
| 7 | `handlePersonPhone` | 处理人电话 | `handle_person_phone` | String |
| 8 | `handleTime` | 处理时间 | `handle_time` | String |
| 9 | `handleType` | 处理类型 | `handle_type` | String |
| 10 | `id` | ID | `id` | String |
| 11 | `installDetailId` | 安装计划明细id | `install_detail_id` | String |
| 12 | `memo` | 备注 | `memo` | String |
| 13 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 14 | `posId` | 服务点 | `pos_id` | c685b8cd-eb64-47a1-b5a2-fcf3296b3c7d |
| 15 | `prevNode` | 上一环节 | `prev_node` | String |
| 16 | `reportContent` | 汇报内容 | `report_content` | String |
| 17 | `reportType` | 汇报类型 | `report_type` | String |
| 18 | `seId` | 服务工程师 | `se_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 19 | `sequence` | 环节顺序 | `sequence` | String |
| 20 | `soId` | 服务工单ID | `so_id` | 18332b41-ebd3-4301-90af-714dfea07d9f |
| 21 | `startReportDate` | 汇报开始时间 | `start_reportdate` | String |
| 22 | `createTimeStr` | 创建时间 | `create_time` | String |
| 23 | `tenant` | 租户ID | `tenant_id` | String |
| 24 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 25 | `dr` | 逻辑删除 | `dr` | Integer |
| 26 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 27 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 28 | `createUser` | 创建者 | `create_user` | String |
| 29 | `ts` | 版本号 | `ts` | String |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `posId` | 服务点 | `pes.pos.Pos` | None |  |
| 2 | `handlePersonId` | 处理人 | `bd.staff.Staff` | Service |  |
| 3 | `soId` | 服务工单ID | `pes.sos.SmsSos` | None | true |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `seId` | 服务工程师 | `bd.staff.Staff` | Service |  |
| 6 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
