# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11857.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | amount | amount | amount | varchar2(50) |
| 3 | billno | billno | billno | varchar2(50) |
| 4 | bill_date | bill_date | bill_date | char(19) |
| 5 | bill_maker | bill_maker | bill_maker | varchar2(20) |  |  | '~' |
| 6 | bill_type_code | bill_type_code | bill_type_code | varchar2(50) |
| 7 | bill_type_id | bill_type_id | bill_type_id | varchar2(20) |  |  | '~' |
| 8 | checkno | checkno | checkno | varchar2(50) |
| 9 | check_result | check_result | check_result | varchar2(50) |
| 10 | check_status | check_status | check_status | varchar2(50) |
| 11 | check_time | check_time | check_time | char(19) |
| 12 | improve_desc | improve_desc | improve_desc | varchar2(500) |
| 13 | isautocheck | isautocheck | isautocheck | char(1) |
| 14 | pk_bill | pk_bill | pk_bill | varchar2(20) |
| 15 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_sscgroup | pk_sscgroup | pk_sscgroup | varchar2(20) |  |  | '~' |
| 19 | pk_sscgroup2 | pk_sscgroup2 | pk_sscgroup2 | varchar2(20) |  |  | '~' |
| 20 | problem_desc | problem_desc | problem_desc | varchar2(500) |
| 21 | processor | processor | processor | varchar2(20) |  |  | '~' |
| 22 | rectify_status | rectify_status | rectify_status | varchar2(50) |
| 23 | remarks | remarks | remarks | varchar2(100) |
| 24 | sampler | sampler | sampler | varchar2(20) |  |  | '~' |
| 25 | severity | severity | severity | varchar2(50) |
| 26 | ssc_end_time | ssc_end_time | ssc_end_time | char(19) |
| 27 | ssc_start_time | ssc_start_time | ssc_start_time | char(19) |
| 28 | taskid | taskid | taskid | varchar2(50) |
| 29 | taskname | taskname | taskname | varchar2(200) |
| 30 | trade_type_code | trade_type_code | trade_type_code | varchar2(50) |
| 31 | trade_type_id | trade_type_id | trade_type_id | varchar2(20) |  |  | '~' |
| 32 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 33 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |