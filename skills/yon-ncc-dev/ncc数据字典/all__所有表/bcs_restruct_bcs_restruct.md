# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6674.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | canmodifiedtime | canmodifiedtime | canmodifiedtime | char(19) |
| 3 | canmodifier | canmodifier | canmodifier | varchar2(20) |  |  | '~' |
| 4 | exeperiods | exeperiods | exeperiods | varchar2(200) |
| 5 | isedit | isedit | isedit | char(1) |
| 6 | key1 | key1 | key1 | varchar2(50) |
| 7 | key2 | key2 | key2 | varchar2(50) |
| 8 | key3 | key3 | key3 | varchar2(50) |
| 9 | key4 | key4 | key4 | varchar2(50) |
| 10 | key5 | key5 | key5 | varchar2(50) |
| 11 | key6 | key6 | key6 | varchar2(50) |
| 12 | key7 | key7 | key7 | varchar2(50) |
| 13 | key8 | key8 | key8 | varchar2(50) |
| 14 | key9 | key9 | key9 | varchar2(50) |
| 15 | key10 | key10 | key10 | varchar2(50) |
| 16 | pk_curr | pk_curr | pk_curr | varchar2(20) |  |  | '~' |
| 17 | pk_entity_front | pk_entity_front | pk_entity_front | varchar2(36) |  |  | '~' |
| 18 | pk_entity_temp | pk_entity_temp | pk_entity_temp | varchar2(36) | √ |  | '~' |
| 19 | pk_hbscheme | pk_hbscheme | pk_hbscheme | varchar2(20) | √ |
| 20 | pk_sheets | pk_sheets | pk_sheets | blob |
| 21 | predate | predate | predate | varchar2(50) |
| 22 | startdate | startdate | startdate | char(19) |
| 23 | targetperiods | targetperiods | targetperiods | varchar2(200) |
| 24 | creationtime | creationtime | creationtime | char(19) |
| 25 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 28 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |