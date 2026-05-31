# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9512.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dis_list | pk_dis_list | pk_dis_list | char(20) | √ |
| 2 | datasource | datasource | datasource | varchar2(50) |
| 3 | org | org | org | varchar2(50) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | synchrotime | synchrotime | synchrotime | char(19) |
| 7 | task | task | task | varchar2(50) |
| 8 | taskname | taskname | taskname | varchar2(50) |
| 9 | creationtime | creationtime | creationtime | varchar2(50) |
| 10 | creator | creator | creator | varchar2(50) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | varchar2(50) |
| 13 | modifier | modifier | modifier | varchar2(50) |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |