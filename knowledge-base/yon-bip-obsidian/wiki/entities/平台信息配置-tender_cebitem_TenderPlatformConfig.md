---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "tender.cebitem.TenderPlatformConfig"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 平台信息配置 (`tender.cebitem.TenderPlatformConfig`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_tender_platform`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 平台信息配置 |
| 物理表 | `cpu_tender_platform` |
| 数据库 schema | `yonbip-cpu-bcsourcing` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:17:03.9580` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2026-01-23 23:56:13:000

## 依赖接口（2个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（25个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `apiUrl` | 地址 | `api_url` | String |
| 2 | `appid` | 招标系统账号 | `app_id` | String |
| 3 | `businessObjList` | 招标业务对象 | `` | 3b4519f0-4aa4-4cdc-89e6-31e6af87c908 |
| 4 | `caCode` | CA证书编号 | `ca_code` | String |
| 5 | `cebOpenRecord` | 租户开通记录 | `ceb_open_record` | String |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `examinerCode` | 交易平台数据验证责任人证件号码 | `examiner_code` | String |
| 8 | `examinerCodeType` | 交易平台数据验证责任人证件类型 | `examiner_code_type` | String |
| 9 | `examinerName` | 交易平台数据验证责任人姓名 | `examiner_name` | String |
| 10 | `id` | ID | `id` | Long |
| 11 | `infoReporterCode` | 信息申报责任人证件号码 | `inforeporter_code` | String |
| 12 | `infoReporterCodeType` | 信息申报责任人证件类型 | `inforeporter_code_type` | String |
| 13 | `infoReporterContactNumber` | 信息申报责任人联系电话 | `inforeporter_contact_number` | String |
| 14 | `infoReporterName` | 信息申报责任人姓名 | `inforeporter_name` | String |
| 15 | `platformCode` | 自定义编码 | `platform_code` | String |
| 16 | `platformName` | 平台名称 | `platform_name` | String |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `remark` | 备注 | `remark` | String |
| 19 | `schemaVer` | schema版本号 | `schema_ver` | String |
| 20 | `sourceSystemId` | 平台账号 | `source_system_id` | String |
| 21 | `systemToken` | token令牌 | `system_token` | String |
| 22 | `tenderSerialNumber` | 项目序列号 | `tender_serial_number` | String |
| 23 | `typeFlag` | 数据录入类型 | `type_flag` | String |
| 24 | `verifyTime` | 交易平台数据验证时间 | `verify_time` | String |
| 25 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `businessObjList` | 招标业务对象 | `tender.cebitem.TenderBusinessObject` | None | true |
