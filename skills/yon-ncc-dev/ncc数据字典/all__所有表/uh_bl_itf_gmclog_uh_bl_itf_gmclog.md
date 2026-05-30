# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12402.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_log | pk_log | pk_log | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | apptype | apptype | apptype | varchar2(10) |
| 4 | date_request | date_request | date_request | char(19) |
| 5 | date_response | date_response | date_response | char(19) |
| 6 | name_psn_pay | name_psn_pay | name_psn_pay | varchar2(100) |
| 7 | pk_dept_pay | pk_dept_pay | pk_dept_pay | varchar2(20) |
| 8 | pk_pati | pk_pati | pk_pati | varchar2(20) |
| 9 | pk_psn_pay | pk_psn_pay | pk_psn_pay | varchar2(20) |
| 10 | request_str | request_str | request_str | varchar2(4000) |
| 11 | response_str | response_str | response_str | varchar2(4000) |
| 12 | trans | trans | trans | varchar2(10) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |