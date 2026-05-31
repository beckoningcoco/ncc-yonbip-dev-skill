# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10526.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_progress | pk_progress | pk_progress | char(20) | √ |
| 2 | fin_item_num | fin_item_num | fin_item_num | number(38, 0) |
| 3 | last_plan | last_plan | last_plan | char(19) |
| 4 | last_record | last_record | last_record | char(19) |
| 5 | last_sum | last_sum | last_sum | char(19) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 9 | pk_plan | pk_plan | pk_plan | varchar2(20) |  |  | '~' |
| 10 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 11 | real_duration | real_duration | real_duration | number(38, 0) |
| 12 | real_end_date | real_end_date | real_end_date | char(19) |
| 13 | real_start_date | real_start_date | real_start_date | char(19) |
| 14 | sum_progress | sum_progress | sum_progress | number(28, 8) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |