# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8321.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_messagelog | pk_messagelog | pk_messagelog | varchar2(50) | √ |
| 2 | busidate | busidate | busidate | char(19) |
| 3 | defdoc1 | defdoc1 | defdoc1 | varchar2(101) |
| 4 | defdoc2 | defdoc2 | defdoc2 | varchar2(101) |
| 5 | defdoc3 | defdoc3 | defdoc3 | varchar2(101) |
| 6 | freedef1 | freedef1 | freedef1 | varchar2(200) |
| 7 | freedef2 | freedef2 | freedef2 | varchar2(200) |
| 8 | freedef3 | freedef3 | freedef3 | varchar2(200) |
| 9 | freedef4 | freedef4 | freedef4 | varchar2(200) |
| 10 | freedef5 | freedef5 | freedef5 | varchar2(200) |
| 11 | messagetype | messagetype | messagetype | number(38, 0) |
| 12 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_operator | pk_operator | pk_operator | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_system | pk_system | pk_system | varchar2(50) |
| 17 | relationid | relationid | relationid | varchar2(50) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |