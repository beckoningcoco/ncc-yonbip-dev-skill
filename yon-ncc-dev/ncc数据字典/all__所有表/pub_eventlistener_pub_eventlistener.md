# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10916.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_eventlistener | pk_eventlistener | pk_eventlistener | char(20) | √ |
| 2 | comp | comp | comp | varchar2(50) |
| 3 | enabled | enabled | enabled | char(1) | √ |
| 4 | implclassname | implclassname | implclassname | varchar2(200) | √ |
| 5 | industrytype | industrytype | industrytype | varchar2(20) |  |  | '~' |
| 6 | listenertype | listenertype | listenertype | char(1) |
| 7 | localtype | localtype | localtype | varchar2(20) |  |  | '~' |
| 8 | name | name | name | varchar2(200) |
| 9 | name2 | name2 | name2 | varchar2(200) |
| 10 | name3 | name3 | name3 | varchar2(200) |
| 11 | name4 | name4 | name4 | varchar2(200) |
| 12 | name5 | name5 | name5 | varchar2(200) |
| 13 | name6 | name6 | name6 | varchar2(200) |
| 14 | note | note | note | varchar2(1024) |
| 15 | operindex | operindex | operindex | number(38, 0) |
| 16 | owner | owner | owner | varchar2(40) | √ |
| 17 | pk_eventtype | pk_eventtype | pk_eventtype | varchar2(20) | √ |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |