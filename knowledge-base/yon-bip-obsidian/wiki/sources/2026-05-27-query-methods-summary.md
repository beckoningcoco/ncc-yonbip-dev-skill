---
tags: [查询方法, QuerySchema, IBillQueryRepository, IYmsJdbcApi, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-query-methods-summary.md]
---

# 旗舰版查询方法汇总

> 后端 Java 代码查询 BIP 数据的完整方法集：客开单据、交易类型、币种、业务单元、项目、部门、人员、客户、供应商、自定义档案、费用项目等。

## 两种查询方式

1. **IYmsJdbcApi**（直接 SQL）：`ymsJdbcApi.queryForList(sql, new BeanListProcessor(...))`
2. **IBillQueryRepository + QuerySchema**（ORM 方式）：`billQueryRepository.queryBySchema(uri, schema, domain)`

## 常用查询表

| 查询目标 | 实体 URI | 域 |
|----------|----------|-----|
| 交易类型 | `bd.bill.TransType` | transtype |
| 币种 | `bd.currencytenant.CurrencyTenantVO` | ucfbasedoc |
| 业务单元 | `org.func.BaseOrg` | ucf-org-center |
| 成本中心 | `bd.costcenter.CostCenter` | finbd |
| 项目 | `bd.project.ProjectVO` | ucfbasedoc |
| 部门 | `bd.adminOrg.AdminOrgVO` | ucf-org-center |
| 人员 | `bd.staff.StaffNew` | ucf-staff-center |
| 客户 | `aa.merchant.Merchant` | productcenter |
| 供应商 | `aa.vendor.Vendor` | yssupplier |
| 费用项目 | `bd.expenseitem.ExpenseItem` | finbd |

## 关键概念

- [[QuerySchema]]
- [[IBillQueryRepository]]
- [[IYmsJdbcApi]]
