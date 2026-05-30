# |<<

**岗位编制 (hrp_postbudget / nc.vo.hrp.psndeptbudget.PostBudgetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2744.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post_budget | 岗位编制主键 | pk_post_budget | char(20) | √ | 主键 (UFID) |
| 2 | pk_dept_budget | 部门编制主键 | pk_dept_budget | char(20) |  | 主键 (UFID) |
| 3 | pk_post | 岗位主键 | pk_post | varchar(20) |  | 人力资源管理_岗位 (post) |
| 4 | budget_self | 岗位编制 | budget_self | int |  | 整数 (Integer) |
| 5 | budget_actual | 占编人数 | budget_actual | int |  | 整数 (Integer) |
| 6 | budget_leftover | 超（缺）编人数 | budget_leftover | int |  | 整数 (Integer) |
| 7 | budget_year | 年度 | budget_year | char(4) |  | 字符串 (String) |
| 8 | budget_version | 版本 | budget_version | int |  | 整数 (Integer) |
| 9 | crictrl_flag | 是否严格控制 | crictrl_flag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 10 | remark | 备注 | remark | varchar(512) |  | 字符串 (String) |