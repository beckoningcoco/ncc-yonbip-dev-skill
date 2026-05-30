# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10956.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pluginitem | pk_pluginitem | pk_pluginitem | char(20) | √ |
| 2 | industrytype | industrytype | industrytype | varchar2(20) |  |  | '~' |
| 3 | iorder | iorder | iorder | number(38, 0) |
| 4 | localtype | localtype | localtype | varchar2(20) |  |  | '~' |
| 5 | vcomponentname | vcomponentname | vcomponentname | varchar2(100) |
| 6 | vdescription | vdescription | vdescription | varchar2(1000) |
| 7 | veventtype | veventtype | veventtype | varchar2(100) |
| 8 | vextendmodule | vextendmodule | vextendmodule | varchar2(100) |
| 9 | vextendpointname | vextendpointname | vextendpointname | varchar2(100) |
| 10 | vextendtype | vextendtype | vextendtype | varchar2(100) |
| 11 | vmodulename | vmodulename | vmodulename | varchar2(100) |
| 12 | vruleclass | vruleclass | vruleclass | varchar2(100) |
| 13 | vtargetclass | vtargetclass | vtargetclass | varchar2(100) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |