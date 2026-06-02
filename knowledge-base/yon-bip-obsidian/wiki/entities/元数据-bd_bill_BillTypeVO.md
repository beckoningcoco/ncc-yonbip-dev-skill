---
tags: [BIP, 元数据, 数据字典, bd, bd.bill.BillTypeVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 单据类型 (`bd.bill.BillTypeVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_billtype` | 应用: `BMMMM`

## 全部属性（37 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `busiobjCode` | busiobj编码 | `busiobj_code` | String | `text` | false | true |
| 2 | `busiprocess` | busiprocess | `busiprocess` | String | `text` | false | true |
| 3 | `class_id` | class_id | `class_id` | String | `text` | false | true |
| 4 | `code` | 编码 | `code` | String | `text` | false | true |
| 5 | `dr` | dr | `dr` | Integer | `int` | false | true |
| 6 | `form_id` | form_id | `form_id` | String | `text` | false | true |
| 7 | `id` | 主键ID | `id` | String | `text` | false | true |
| 8 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` | false | true |
| 9 | `is_core_bill` | 是否_core_bill | `is_core_bill` | Integer | `int` | false | true |
| 10 | `is_nosupport_transtypadd` | 是否_nosupport_transtypadd | `is_nosupport_transtypadd` | Integer | `int` | false | true |
| 11 | `is_nosupport_transtypdel` | 是否_nosupport_transtypdel | `is_nosupport_transtypdel` | Integer | `int` | false | true |
| 12 | `is_nosupport_transtypmodify` | 是否_nosupport_transtypmodify | `is_nosupport_transtypmodify` | Integer | `int` | false | true |
| 13 | `is_support_multi_org` | 是否_support_multi_org | `is_support_multi_org` | Integer | `int` | false | true |
| 14 | `is_support_transtype` | 是否_support_transtype | `is_support_transtype` | Integer | `int` | false | true |
| 15 | `is_support_workflow` | 是否_support_workflow | `is_support_workflow` | Integer | `int` | false | true |
| 16 | `istranstype` | 是否transtype | `istranstype` | String | `text` | false | true |
| 17 | `level` | level | `level` | Integer | `int` | false | true |
| 18 | `log` | log | `log` | String | `text` | false | true |
| 19 | `meta_type` | meta_type | `meta_type` | String | `text` | false | true |
| 20 | `microServiceCode` | microService编码 | `micro_service_code` | String | `text` | false | true |
| 21 | `name` | 名称 | `name` | String | `multiLanguage` | false | true |
| 22 | `parent` | parent | `parent_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` | false | true |
| 23 | `path` | path | `path` | String | `text` | false | true |
| 24 | `printAfterApproval` | printAfterApproval | `print_after_approval` | Integer | `int` | false | true |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` | false | true |
| 26 | `serviceCodeMobile` | serviceCodeMobile | `service_code_mobile` | String | `text` | false | true |
| 27 | `service_code` | service_code | `service_code` | String | `text` | false | true |
| 28 | `shareType` | shareType | `share_type` | Integer | `int` | false | true |
| 29 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |  | true |
| 30 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |  | true |
| 31 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |  | true |
| 32 | `sort` | sort | `sort_num` | Integer | `int` |  | true |
| 33 | `sort_num` | sort_num | `sort_num` | Integer | `int` | false | true |
| 34 | `sysid` | sysid | `sysid` | String | `text` | false | true |
| 35 | `tenant` | tenant | `tenantid` | String | `text` | false | true |
| 36 | `tenantid` | tenantid | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | false | true |
| 37 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |

## 关联属性（3 个）

- `parent` -> `bd.bill.BillTypeVO` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `tenantid` -> `yht.tenant.YhtTenant` ()

```sql
SELECT busiobj_code, busiprocess, class_id, code, dr, form_id FROM bd_billtype
```