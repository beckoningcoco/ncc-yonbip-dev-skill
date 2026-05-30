# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9821.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | versiontype | versiontype | versiontype | number(38, 0) | √ |
| 3 | createtime | createtime | createtime | char(19) |
| 4 | description | description | description | varchar2(512) |
| 5 | displayname | displayname | displayname | varchar2(90) |
| 6 | help | help | help | varchar2(1024) |
| 7 | isactive | isactive | isactive | char(1) |
| 8 | modifytime | modifytime | modifytime | char(19) |
| 9 | name | name | name | varchar2(50) | √ |
| 10 | parentmoduleid | parentmoduleid | parentmoduleid | varchar2(50) |
| 11 | resid | resid | resid | varchar2(90) |
| 12 | resmodule | resmodule | resmodule | varchar2(90) |
| 13 | creator | creator | creator | varchar2(30) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifier | modifier | modifier | varchar2(30) |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |