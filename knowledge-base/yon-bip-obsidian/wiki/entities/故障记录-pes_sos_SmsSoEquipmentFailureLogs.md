---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.sos.SmsSoEquipmentFailureLogs"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 故障记录 (`pes.sos.SmsSoEquipmentFailureLogs`)

> IMP_PES | 物理表：`sms_so_equipment_failure_logs`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 故障记录 |
| 物理表 | `sms_so_equipment_failure_logs` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:20:08.6150` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `categoryId` | 故障分类 | `category_id` | e47c578a-b780-4988-aa12-97132d21f153 |
| 2 | `cause` | 故障原因 | `cause` | String |
| 3 | `causeId` | 故障原因ID | `cause_id` | 9570bc86-5dde-4ed9-8e03-a4d3816338e9 |
| 4 | `discoveryId` | 发现途径 | `discovery_id` | d4bc442d-75d5-4b4c-acf3-08da47ad8da3 |
| 5 | `failureEndAt` | 故障结束时间 | `failure_end_at` | String |
| 6 | `failureStartAt` | 故障发生时间 | `failure_start_at` | String |
| 7 | `id` | ID | `id` | String |
| 8 | `measure` | 故障措施 | `measure` | String |
| 9 | `measureId` | 故障措施 | `measure_id` | a1c0b4a2-6a45-4ec3-a7a8-c7e2ed23d182 |
| 10 | `memo` | 说明 | `memo` | String |
| 11 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 12 | `phenomena` | 故障现象 | `phenomena` | String |
| 13 | `phenomenaId` | 故障现象ID | `phenomena_id` | 65e98554-367c-4e88-b6f9-cd54b8d800f8 |
| 14 | `soEquipmentId` | 工单设备子表ID | `so_equipment_id` | 25487918-5ce6-4ec1-ac75-96ac434f137f |
| 15 | `soId` | 工单Id | `so_id` | 18332b41-ebd3-4301-90af-714dfea07d9f |
| 16 | `uploadStatus` | 上传状态 | `upload_status` | String |
| 17 | `UserDefineCharacter` | 自定义项特征 | `user_define_character` | dbef7720-f318-4637-853f-e986c1639beb |
| 18 | `createTimeStr` | 创建时间 | `create_time` | String |
| 19 | `tenant` | 租户ID | `tenant_id` | String |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 21 | `dr` | 逻辑删除 | `dr` | Integer |
| 22 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 23 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 24 | `createUser` | 创建者 | `create_user` | String |
| 25 | `ts` | 版本号 | `ts` | String |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `discoveryId` | 发现途径 | `pes.kmsDiscovery.KmsDiscoveryVO` | None |  |
| 2 | `measureId` | 故障措施 | `pes.kmsMeasures.KmsMeasuresVO` | None |  |
| 3 | `causeId` | 故障原因ID | `pes.kmsCauses.KmsCausesVO` | None |  |
| 4 | `soId` | 工单Id | `pes.sos.SmsSos` | None |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `UserDefineCharacter` | 自定义项特征 | `pes.sos.SmsSoEquipmentFailureLogsDefineCharacter` | None |  |
| 7 | `soEquipmentId` | 工单设备子表ID | `pes.sos.SmsSosEquipment` | None | true |
| 8 | `categoryId` | 故障分类 | `pes.kmsCategoryTree.KmsCategoryTreeVO` | None |  |
| 9 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
| 10 | `phenomenaId` | 故障现象ID | `PES.kmsPhenomena.KmsPhenomenaVO` | None |  |
