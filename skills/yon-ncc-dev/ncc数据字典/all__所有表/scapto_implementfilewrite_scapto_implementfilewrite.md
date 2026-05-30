# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11321.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_implementfilewrite | pk_implementfilewrite | pk_implementfilewrite | char(20) | √ |
| 2 | execution_id | execution_id | execution_id | varchar2(50) | √ |
| 3 | file_id | file_id | file_id | varchar2(50) | √ |
| 4 | file_name | file_name | file_name | varchar2(200) |
| 5 | file_path | file_path | file_path | varchar2(500) |
| 6 | file_type | file_type | file_type | varchar2(50) |
| 7 | pk_implementwrite | pk_implementwrite | pk_implementwrite | char(20) | √ |
| 8 | pk_system_doc | pk_system_doc | pk_system_doc | varchar2(20) |
| 9 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 10 | upload_time | upload_time | upload_time | char(19) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |