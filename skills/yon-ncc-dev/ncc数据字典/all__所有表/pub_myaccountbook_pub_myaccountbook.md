# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10949.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | guid | guid | guid | varchar2(32) | √ |
| 2 | display | display | display | varchar2(64) |
| 3 | id | id | id | varchar2(64) |
| 4 | kind | kind | kind | varchar2(16) |
| 5 | node_code | node_code | node_code | varchar2(65) |
| 6 | parentguid | parentguid | parentguid | varchar2(32) |
| 7 | pk_corp | pk_corp | pk_corp | char(4) |
| 8 | pk_glorgbook | pk_glorgbook | pk_glorgbook | char(20) |
| 9 | pk_operator | pk_operator | pk_operator | char(20) |
| 10 | prop | prop | prop | blob |
| 11 | type | type | type | number(38, 0) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |