# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9751.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_event | pk_event | pk_event | char(20) | √ |
| 2 | event_code | event_code | event_code | varchar2(50) |
| 3 | industrytype | industrytype | industrytype | varchar2(20) |  |  | '~' |
| 4 | localtype | localtype | localtype | varchar2(20) |  |  | '~' |
| 5 | note | note | note | varchar2(200) |
| 6 | operindex | operindex | operindex | number(38, 0) |
| 7 | pk_doc | pk_doc | pk_doc | char(20) |
| 8 | pk_eventlistener | pk_eventlistener | pk_eventlistener | varchar2(20) |
| 9 | pk_eventtype | pk_eventtype | pk_eventtype | varchar2(20) |
| 10 | pluginclass | pluginclass | pluginclass | varchar2(200) |
| 11 | pluginname | pluginname | pluginname | varchar2(300) |
| 12 | pluginname2 | pluginname2 | pluginname2 | varchar2(300) |
| 13 | pluginname3 | pluginname3 | pluginname3 | varchar2(300) |
| 14 | pluginname4 | pluginname4 | pluginname4 | varchar2(300) |
| 15 | pluginname5 | pluginname5 | pluginname5 | varchar2(300) |
| 16 | pluginname6 | pluginname6 | pluginname6 | varchar2(300) |
| 17 | pluginonwer | pluginonwer | pluginonwer | varchar2(20) |  |  | '~' |
| 18 | publishstatus | publishstatus | publishstatus | number(38, 0) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |