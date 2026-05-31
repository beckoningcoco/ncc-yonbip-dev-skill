# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8775.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_org_budget | pk_org_budget | pk_org_budget | char(20) | √ |
| 2 | budget_actual | budget_actual | budget_actual | number(38, 0) |
| 3 | budget_fte | budget_fte | budget_fte | number(16, 2) |
| 4 | budget_includeact | budget_includeact | budget_includeact | number(38, 0) |  |  | 0 |
| 5 | budget_includefte | budget_includefte | budget_includefte | number(16, 2) |
| 6 | budget_includesub | budget_includesub | budget_includesub | number(38, 0) |
| 7 | budget_leftover | budget_leftover | budget_leftover | number(38, 0) |
| 8 | budget_mode | budget_mode | budget_mode | number(38, 0) |
| 9 | budget_self | budget_self | budget_self | number(38, 0) |
| 10 | budget_version | budget_version | budget_version | number(38, 0) |
| 11 | budget_year | budget_year | budget_year | char(4) |
| 12 | crictrl_flag | crictrl_flag | crictrl_flag | char(1) |
| 13 | datasource | datasource | datasource | number(38, 0) |
| 14 | pk_dimension | pk_dimension | pk_dimension | char(20) |
| 15 | pk_fatherhrorg | pk_fatherhrorg | pk_fatherhrorg | char(20) |
| 16 | pk_group | pk_group | pk_group | char(20) |
| 17 | pk_hrorg | pk_hrorg | pk_hrorg | char(20) |
| 18 | pk_org | pk_org | pk_org | char(20) |
| 19 | pk_vid | pk_vid | pk_vid | char(20) |
| 20 | publish_state | publish_state | publish_state | number(38, 0) |
| 21 | remark | remark | remark | varchar2(512) |
| 22 | creationtime | creationtime | creationtime | char(19) | √ |
| 23 | creator | creator | creator | char(20) | √ |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | char(20) |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |