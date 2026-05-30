# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11378.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_system_doc_write | pk_system_doc_write | pk_system_doc_write | char(20) | √ |
| 2 | file_id | file_id | file_id | varchar2(50) | √ |
| 3 | file_name | file_name | file_name | varchar2(200) |
| 4 | file_path | file_path | file_path | varchar2(500) |
| 5 | file_type | file_type | file_type | varchar2(50) |
| 6 | pk_systemreport_write | pk_systemreport_write | pk_systemreport_write | char(20) | √ |
| 7 | pk_system_doc | pk_system_doc | pk_system_doc | varchar2(20) |
| 8 | regulation_id | regulation_id | regulation_id | varchar2(50) | √ |
| 9 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 10 | upload_time | upload_time | upload_time | char(19) |
| 11 | vmemo | vmemo | vmemo | varchar2(1024) |
| 12 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 13 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 14 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 15 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 16 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 17 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 18 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 19 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 20 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 21 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |