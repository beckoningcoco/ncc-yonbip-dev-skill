# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9832.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | createtime | createtime | createtime | char(19) |
| 3 | databaseid | databaseid | databaseid | varchar2(50) |
| 4 | description | description | description | varchar2(512) |
| 5 | displayname | displayname | displayname | varchar2(90) |
| 6 | fromsourcebmf | fromsourcebmf | fromsourcebmf | char(1) |
| 7 | help | help | help | varchar2(1024) |
| 8 | industry | industry | industry | varchar2(50) |
| 9 | isactive | isactive | isactive | char(1) |
| 10 | isextendtable | isextendtable | isextendtable | char(1) |
| 11 | modifytime | modifytime | modifytime | char(19) |
| 12 | name | name | name | varchar2(50) | √ |
| 13 | parenttable | parenttable | parenttable | varchar2(50) |
| 14 | resid | resid | resid | varchar2(90) |
| 15 | resmodule | resmodule | resmodule | varchar2(50) |
| 16 | versiontype | versiontype | versiontype | number(38, 0) | √ |
| 17 | creator | creator | creator | varchar2(30) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifier | modifier | modifier | varchar2(30) |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |