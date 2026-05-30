# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10508.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_progress | pk_progress | pk_progress | char(20) | √ |
| 2 | exec_status | exec_status | exec_status | number(38, 0) |
| 3 | fin_item_num | fin_item_num | fin_item_num | number(38, 0) |
| 4 | last_plan | last_plan | last_plan | char(19) |
| 5 | last_record | last_record | last_record | char(19) |
| 6 | last_sum | last_sum | last_sum | char(19) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 10 | pk_plan | pk_plan | pk_plan | varchar2(20) |  |  | '~' |
| 11 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 12 | pk_project_reg | pk_project_reg | pk_project_reg | varchar2(20) |  |  | '~' |
| 13 | real_end_date | real_end_date | real_end_date | char(19) |
| 14 | real_start_date | real_start_date | real_start_date | char(19) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |