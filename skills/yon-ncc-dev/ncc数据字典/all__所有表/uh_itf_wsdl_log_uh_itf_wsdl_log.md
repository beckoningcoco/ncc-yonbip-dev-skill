# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12641.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | code_psn | code_psn | code_psn | varchar2(20) |
| 2 | date_input | date_input | date_input | char(19) |
| 3 | date_output | date_output | date_output | char(19) |
| 4 | errormsg | errormsg | errormsg | varchar2(400) |
| 5 | inputstr | inputstr | inputstr | clob |
| 6 | methond | methond | methond | varchar2(200) |
| 7 | outputstr | outputstr | outputstr | clob |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |
| 10 | pk_pati | pk_pati | pk_pati | varchar2(20) |
| 11 | pk_psn | pk_psn | pk_psn | varchar2(20) |
| 12 | pk_type | pk_type | pk_type | varchar2(20) |
| 13 | pk_wslog | pk_wslog | pk_wslog | char(20) | √ |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |