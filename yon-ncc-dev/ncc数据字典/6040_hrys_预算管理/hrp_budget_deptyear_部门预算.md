# |<<

**部门预算 (hrp_budget_deptyear / nccloud.hrys.vo.wadeptbudget.BudDeptyearVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2729.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budget_deptyear | 部门年度预算主键 | pk_budget_deptyear | char(20) | √ | 主键 (UFID) |
| 2 | pk_dept | 部门主键 | pk_dept | char(20) | √ | 组织_部门 (dept) |
| 3 | deptyear | 年度 | deptyear | char(4) |  | 主键 (UFID) |
| 4 | isreleased | 发布 | isreleased | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | month_control | 月度控制 | month_control | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | sum_control | 累积控制 | sum_control | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | year_control | 年度控制 | year_control | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 9 | pk_org | 薪资组织 | pk_org | char(20) | √ | 组织 (org) |
| 10 | pk_vid | 部门版本 | pk_vid | varchar(20) |  | HR部门版本信息 (hrdept_v) |
| 11 | pk_fathermember | 直接上级部门 | pk_fathermember | varchar(50) |  | 字符串 (String) |
| 12 | dept_version | 版本 | dept_version | int |  | 整数 (Integer) |
| 13 | datasource | 数据来源 | datasource | int |  | 数据来源 (Datasource) | 0 | 0=人力资本规划; |