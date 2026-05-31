# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13045.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | busibill | busibill | busibill | varchar2(500) |
| 3 | correct | correct | correct | char(1) |
| 4 | doc_destination | doc_destination | doc_destination | varchar2(500) |
| 5 | doc_dscpt | doc_dscpt | doc_dscpt | varchar2(1000) |
| 6 | doc_id | doc_id | doc_id | varchar2(50) |
| 7 | doc_source | doc_source | doc_source | varchar2(50) |
| 8 | doc_time | doc_time | doc_time | char(19) |
| 9 | doc_type | doc_type | doc_type | varchar2(50) |
| 10 | fileid | fileid | fileid | varchar2(50) |
| 11 | filename | filename | filename | varchar2(500) |
| 12 | indocpath | indocpath | indocpath | varchar2(500) |
| 13 | starttime | starttime | starttime | char(19) |
| 14 | transdocpath | transdocpath | transdocpath | varchar2(500) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |