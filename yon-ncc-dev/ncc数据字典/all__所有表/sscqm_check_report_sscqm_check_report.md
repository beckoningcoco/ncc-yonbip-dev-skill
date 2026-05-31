# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11861.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | reportid | reportid | reportid | char(20) | √ |
| 2 | actual_sample_quantity | actual_sample_quantity | actual_sample_quantity | number(38, 0) |
| 3 | actual_sample_rate | actual_sample_rate | actual_sample_rate | varchar2(50) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approve_time | approve_time | approve_time | char(19) |
| 6 | assess | assess | assess | varchar2(50) |
| 7 | autochecknumber | autochecknumber | autochecknumber | varchar2(50) |
| 8 | autocheckproblembillnumber | autocheckproblembillnumber | autocheckproblembillnumber | varchar2(50) |
| 9 | autocheckrate | autocheckrate | autocheckrate | varchar2(50) |
| 10 | checked_quantity | checked_quantity | checked_quantity | number(38, 0) |
| 11 | general_problem_quantity | general_problem_quantity | general_problem_quantity | number(38, 0) |
| 12 | instructions | instructions | instructions | varchar2(2000) |
| 13 | measure | measure | measure | varchar2(2000) |
| 14 | more_serious_problem_quantity | more_serious_problem_quantity | more_serious_problem_quantity | number(38, 0) |
| 15 | more_slight_problem_quantity | more_slight_problem_quantity | more_slight_problem_quantity | number(38, 0) |
| 16 | problem_quantity | problem_quantity | problem_quantity | number(38, 0) |
| 17 | problem_rate | problem_rate | problem_rate | varchar2(50) |
| 18 | processor | processor | processor | varchar2(1000) |
| 19 | reporter | reporter | reporter | varchar2(20) |  |  | '~' |
| 20 | report_code | report_code | report_code | varchar2(50) |
| 21 | report_date | report_date | report_date | char(19) |
| 22 | report_status | report_status | report_status | varchar2(50) |
| 23 | sample_quantity | sample_quantity | sample_quantity | number(38, 0) |
| 24 | sample_rate | sample_rate | sample_rate | varchar2(50) |
| 25 | score | score | score | varchar2(50) |
| 26 | serious_level | serious_level | serious_level | varchar2(50) |
| 27 | serious_problem_quantity | serious_problem_quantity | serious_problem_quantity | number(38, 0) |
| 28 | slight_problem_quantity | slight_problem_quantity | slight_problem_quantity | number(38, 0) |
| 29 | sscorgid | sscorgid | sscorgid | varchar2(20) |  |  | '~' |
| 30 | taskid | taskid | taskid | varchar2(20) |  |  | '~' |
| 31 | task_name | task_name | task_name | varchar2(50) |
| 32 | task_property | task_property | task_property | varchar2(50) |
| 33 | total_target | total_target | total_target | number(38, 0) |
| 34 | un_sample_quantity | un_sample_quantity | un_sample_quantity | number(38, 0) |
| 35 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 36 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |