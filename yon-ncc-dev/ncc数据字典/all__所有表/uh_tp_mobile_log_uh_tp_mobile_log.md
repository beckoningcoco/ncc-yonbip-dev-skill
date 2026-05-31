# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12806.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_log | pk_log | pk_log | char(20) | √ |
| 2 | cndv_idnf_no | cndv_idnf_no | cndv_idnf_no | varchar2(50) |
| 3 | cndv_os_cd | cndv_os_cd | cndv_os_cd | varchar2(2) |
| 4 | input | input | input | varchar2(256) |
| 5 | note | note | note | varchar2(256) |
| 6 | oper_code | oper_code | oper_code | varchar2(50) |
| 7 | oper_date | oper_date | oper_date | char(19) |
| 8 | oper_result_code | oper_result_code | oper_result_code | varchar2(2) |
| 9 | output | output | output | varchar2(4000) |
| 10 | pat_telno | pat_telno | pat_telno | varchar2(20) |
| 11 | pk_acc | pk_acc | pk_acc | varchar2(50) |
| 12 | pk_group | pk_group | pk_group | varchar2(50) |
| 13 | pk_org | pk_org | pk_org | varchar2(50) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |