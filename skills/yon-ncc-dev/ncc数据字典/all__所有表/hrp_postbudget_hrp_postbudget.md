# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8778.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post_budget | pk_post_budget | pk_post_budget | char(20) | √ |
| 2 | budget_actual | budget_actual | budget_actual | number(38, 0) |
| 3 | budget_leftover | budget_leftover | budget_leftover | number(38, 0) |
| 4 | budget_self | budget_self | budget_self | number(38, 0) |
| 5 | budget_version | budget_version | budget_version | number(38, 0) |
| 6 | budget_year | budget_year | budget_year | char(4) |
| 7 | crictrl_flag | crictrl_flag | crictrl_flag | char(1) |
| 8 | pk_dept_budget | pk_dept_budget | pk_dept_budget | char(20) |
| 9 | pk_post | pk_post | pk_post | char(20) |
| 10 | remark | remark | remark | varchar2(512) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |