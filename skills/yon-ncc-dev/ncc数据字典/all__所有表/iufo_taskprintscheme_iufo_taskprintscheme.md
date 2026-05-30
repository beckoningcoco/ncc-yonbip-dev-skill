# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9705.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskprintscheme | pk_taskprintscheme | pk_taskprintscheme | char(20) | √ |
| 2 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 3 | defaultscheme | defaultscheme | defaultscheme | char(1) |
| 4 | name | name | name | varchar2(300) | √ |
| 5 | name2 | name2 | name2 | varchar2(300) |
| 6 | name3 | name3 | name3 | varchar2(300) |
| 7 | name4 | name4 | name4 | varchar2(300) |
| 8 | name5 | name5 | name5 | varchar2(300) |
| 9 | name6 | name6 | name6 | varchar2(300) |
| 10 | org | org | org | varchar2(50) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_task | pk_task | pk_task | varchar2(50) |
| 14 | printset | printset | printset | varchar2(1024) |
| 15 | printsetcontent | printsetcontent | printsetcontent | blob |
| 16 | scheme_type | scheme_type | scheme_type | number(38, 0) |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |