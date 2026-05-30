# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8777.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_org_budget_sub | pk_org_budget_sub | pk_org_budget_sub | char(20) | √ |
| 2 | budget_actual | budget_actual | budget_actual | number(38, 0) |
| 3 | budget_includeact | budget_includeact | budget_includeact | number(38, 0) |  |  | 0 |
| 4 | budget_includesub | budget_includesub | budget_includesub | number(38, 0) |  |  | 0 |
| 5 | budget_leftover | budget_leftover | budget_leftover | number(38, 0) |
| 6 | budget_self | budget_self | budget_self | number(38, 0) |
| 7 | crictrl_flag | crictrl_flag | crictrl_flag | char(1) |
| 8 | pk_add_org | pk_add_org | pk_add_org | char(20) |
| 9 | pk_dimensiondef | pk_dimensiondef | pk_dimensiondef | char(20) |
| 10 | pk_org_budget | pk_org_budget | pk_org_budget | char(20) |
| 11 | remark | remark | remark | varchar2(512) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |