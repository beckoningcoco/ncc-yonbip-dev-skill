# |<<

**单位预算 (hrp_budget_corpyear / nccloud.hrys.vo.waorgbudget.BudCorpYearSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2727.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budget_corpyear | 单位年度预算计划主键 | pk_budget_corpyear | char(20) | √ | 主键 (UFID) |
| 2 | pk_corp | 公司主键 | pk_corp | char(20) | √ | 主键 (UFID) |
| 3 | corpyear | 年度 | corpyear | char(4) |  | 主键 (UFID) |
| 4 | isreleased | 发布 | isreleased | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | month_control | 月度控制 | month_control | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | sum_control | 累积控制 | sum_control | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | year_control | 年度控制 | year_control | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | isapproved | 是否审批 | isapproved | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 10 | pk_org | 薪资组织 | pk_org | char(20) | √ | 组织 (org) |
| 11 | pk_vid | 组织版本 | pk_vid | varchar(20) |  | 组织版本信息HR (hrorginfo_v) |
| 12 | pk_fatherorg | 上级HR组织PK | pk_fatherorg | varchar(50) |  | 字符串 (String) |
| 13 | pk_hrorg | 所属HR组织pk | pk_hrorg | varchar(50) |  | 字符串 (String) |
| 14 | pk_fathermember | 行政体系上级组织pK | pk_fathermember | varchar(50) |  | 字符串 (String) |
| 15 | corp_version | 版本 | corp_version | int |  | 整数 (Integer) |
| 16 | datasource | 数据来源 | datasource | int |  | 数据来源 (Datasource) | 0 | 0=人力资本规划; |