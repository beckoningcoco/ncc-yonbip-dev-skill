# |<<

**单位月度预算 (hrp_budget_corpperiod / nc.vo.hrp.waorgbudget.BudCorpmonthVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2726.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budget_corpperiod | 单位月度预算计划主键 | pk_budget_corpperiod | char(20) | √ | 主键 (UFID) |
| 2 | pk_corp | 公司主键 | pk_corp | char(20) | √ | 主键 (UFID) |
| 3 | corpyear | 年度 | corpyear | varchar(4) |  | 字符串 (String) |
| 4 | period | 月度 | period | varchar(2) |  | 字符串 (String) |
| 5 | isreleased | 发布 | isreleased | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | isapproved | 是否审批 | isapproved | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 8 | pk_org | 薪资组织 | pk_org | char(20) | √ | 组织 (org) |
| 9 | pk_fatherorg | 上级组织 | pk_fatherorg | varchar(50) |  | 字符串 (String) |
| 10 | pk_hrorg | 所属HR组织 | pk_hrorg | varchar(50) |  | 字符串 (String) |
| 11 | pk_vid | 组织版本 | pk_vid | varchar(20) |  | 组织版本信息HR (hrorginfo_v) |
| 12 | pk_fathermember | 直接上级行政组织 | pk_fathermember | varchar(50) |  | 字符串 (String) |
| 13 | corp_version | 版本 | corp_version | int |  | 整数 (Integer) |
| 14 | datasource | 数据来源 | datasource | int |  | 数据来源 (Datasource) | 0 | 0=人力资本规划; |