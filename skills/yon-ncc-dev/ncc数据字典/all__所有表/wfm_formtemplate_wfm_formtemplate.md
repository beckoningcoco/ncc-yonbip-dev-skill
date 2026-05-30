# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13032.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_formtemplate | pk_formtemplate | pk_formtemplate | char(20) | √ |
| 2 | isused | isused | isused | char(1) |
| 3 | newversion | newversion | newversion | char(1) |
| 4 | pk_device | pk_device | pk_device | varchar2(20) |  |  | '~' |
| 5 | pk_formdef | pk_formdef | pk_formdef | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_parent | pk_parent | pk_parent | varchar2(20) |  |  | '~' |
| 9 | templatecode | templatecode | templatecode | varchar2(50) |
| 10 | templatename | templatename | templatename | varchar2(300) |
| 11 | templatename2 | templatename2 | templatename2 | varchar2(300) |
| 12 | templatename3 | templatename3 | templatename3 | varchar2(300) |
| 13 | templatename4 | templatename4 | templatename4 | varchar2(300) |
| 14 | templatename5 | templatename5 | templatename5 | varchar2(300) |
| 15 | templatename6 | templatename6 | templatename6 | varchar2(300) |
| 16 | version | version | version | varchar2(50) |
| 17 | xmluimeta | xmluimeta | xmluimeta | varchar2(50) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |