# |<<

**部门月度预算计划 (hrp_budget_deptperiod / nc.vo.hrp.wadeptbudget.BudDeptperiodVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2728.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budget_deptperiod | 部门月度预算计划主键 | pk_budget_deptperiod | char(20) | √ | 主键 (UFID) |
| 2 | pk_dept | 部门主键 | pk_dept | char(20) | √ | 主键 (UFID) |
| 3 | deptyear | 年度 | deptyear | char(4) |  | 主键 (UFID) |
| 4 | period | 取期间 | period | char(2) |  | 主键 (UFID) |
| 5 | isreleased | 发布 | isreleased | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | pk_org | 薪资组织 | pk_org | char(20) | √ | 组织 (org) |
| 7 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 8 | pk_vid | 部门版本 | pk_vid | varchar(20) |  | HR部门版本信息 (hrdept_v) |
| 9 | pk_fathermember | 直接上级部门 | pk_fathermember | varchar(50) |  | 字符串 (String) |
| 10 | dept_version | 版本 | dept_version | int |  | 整数 (Integer) |
| 11 | datasource | 数据来源 | datasource | int |  | 数据来源 (Datasource) |  | 0=人力资本规划; |