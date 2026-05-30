# |<<

**部门编制 (hrp_deptbudget / nc.vo.hrp.psndeptbudget.DeptBudgetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2734.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dept_budget | 部门编制主键 | pk_dept_budget | char(20) | √ | 主键 (UFID) |
| 2 | pk_org_budget | 单位编制主键 | pk_org_budget | varchar(20) |  | 单位编制 (orgbudget) |
| 3 | pk_hrorg | 所属HR组织 | pk_hrorg | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 4 | budget_year | 年度 | budget_year | char(4) |  | 字符串 (String) |
| 5 | budget_version | 版本 | budget_version | int |  | 整数 (Integer) |
| 6 | pk_group | 集团主键 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 业务单元主键 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_dept | 部门主键 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 9 | budget_includesub | 含下级编制 | budget_includesub | int |  | 整数 (Integer) |
| 10 | budget_self | 本部门编制 | budget_self | int |  | 整数 (Integer) |
| 11 | budget_actual | 本部门占编人数 | budget_actual | int |  | 整数 (Integer) |
| 12 | budget_leftover | 本部门超（缺）编人数 | budget_leftover | int |  | 整数 (Integer) |
| 13 | pk_vid | 部门版本主键 | pk_vid | varchar(20) |  | HR部门版本信息 (hrdept_v) |
| 14 | pk_dimension | 分类方式 | pk_dimension | varchar(20) |  | 编制维度 (Dimension) |
| 15 | budget_actualsub | 含下级占编人数 | budget_actualsub | int |  | 整数 (Integer) |
| 16 | budget_leftoversub | 含下级超（缺）编人数 | budget_leftoversub | int |  | 整数 (Integer) |
| 17 | budget_fte | 计划FTE | budget_fte | decimal(16, 2) |  | 数值 (UFDouble) | 0.00 |
| 18 | budget_includefte | 含下级FTE | budget_includefte | decimal(16, 2) |  | 数值 (UFDouble) | 0.00 |
| 19 | datasource | 数据来源 | datasource | int |  | 数据来源 (Datasource) | 0 | 0=人力资本规划; |