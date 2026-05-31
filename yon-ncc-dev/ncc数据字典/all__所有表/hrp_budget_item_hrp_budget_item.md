# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8765.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budget_item | pk_budget_item | pk_budget_item | char(20) | √ |
| 2 | budget_item_code | budget_item_code | budget_item_code | varchar2(28) |
| 3 | budget_item_name | budget_item_name | budget_item_name | varchar2(128) |
| 4 | budget_item_name2 | budget_item_name2 | budget_item_name2 | varchar2(128) |
| 5 | budget_item_name3 | budget_item_name3 | budget_item_name3 | varchar2(128) |
| 6 | budget_item_name4 | budget_item_name4 | budget_item_name4 | varchar2(128) |
| 7 | budget_item_name5 | budget_item_name5 | budget_item_name5 | varchar2(128) |
| 8 | budget_item_name6 | budget_item_name6 | budget_item_name6 | varchar2(128) |
| 9 | budget_item_year | budget_item_year | budget_item_year | char(4) |
| 10 | budget_type | budget_type | budget_type | number(38, 0) |
| 11 | compute_order | compute_order | compute_order | number(38, 0) |
| 12 | cumulate_alarm | cumulate_alarm | cumulate_alarm | char(1) |
| 13 | deptmonth | deptmonth | deptmonth | number(38, 0) |
| 14 | deptmonth_formula | deptmonth_formula | deptmonth_formula | varchar2(1500) |
| 15 | deptquarter | deptquarter | deptquarter | number(38, 0) |
| 16 | deptquarter_formula | deptquarter_formula | deptquarter_formula | varchar2(1500) |
| 17 | deptyear | deptyear | deptyear | number(38, 0) |
| 18 | deptyear_formula | deptyear_formula | deptyear_formula | varchar2(1500) |
| 19 | displayseq | displayseq | displayseq | number(38, 0) |  |  | 0 |
| 20 | item_attr | item_attr | item_attr | number(38, 0) |
| 21 | month_alarm | month_alarm | month_alarm | char(1) |
| 22 | month_control | month_control | month_control | char(1) |
| 23 | month_flag | month_flag | month_flag | char(1) |
| 24 | orgmonth | orgmonth | orgmonth | number(38, 0) |
| 25 | orgmonth_formula | orgmonth_formula | orgmonth_formula | varchar2(1500) |
| 26 | orgquarter | orgquarter | orgquarter | number(38, 0) |
| 27 | orgquarter_formula | orgquarter_formula | orgquarter_formula | varchar2(1500) |
| 28 | orgyear | orgyear | orgyear | number(38, 0) |
| 29 | orgyear_formula | orgyear_formula | orgyear_formula | varchar2(1500) |
| 30 | pk_group | pk_group | pk_group | char(20) |
| 31 | pk_item_doc | pk_item_doc | pk_item_doc | char(20) |
| 32 | pk_org | pk_org | pk_org | char(20) |
| 33 | publish_state | publish_state | publish_state | number(38, 0) |
| 34 | quarter_alarm | quarter_alarm | quarter_alarm | char(1) |
| 35 | quarter_alarm_time | quarter_alarm_time | quarter_alarm_time | number(7, 2) |
| 36 | quarter_control | quarter_control | quarter_control | char(1) |
| 37 | quarter_cumulate_alarm | quarter_cumulate_alarm | quarter_cumulate_alarm | char(1) |
| 38 | quarter_flag | quarter_flag | quarter_flag | char(1) |
| 39 | strong_control | strong_control | strong_control | char(1) |
| 40 | year_alarm | year_alarm | year_alarm | char(1) |
| 41 | year_alarm_time | year_alarm_time | year_alarm_time | number(7, 2) |
| 42 | year_flag | year_flag | year_flag | char(1) |
| 43 | creationtime | creationtime | creationtime | char(19) | √ |
| 44 | creator | creator | creator | char(20) | √ |
| 45 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 46 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 47 | modifier | modifier | modifier | char(20) |
| 48 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |