# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9814.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | industry | industry | industry | varchar2(50) | √ |
| 3 | versiontype | versiontype | versiontype | number(38, 0) | √ |
| 4 | createtime | createtime | createtime | char(19) |
| 5 | description | description | description | varchar2(512) |
| 6 | displayname | displayname | displayname | varchar2(90) |
| 7 | fromsourcebmf | fromsourcebmf | fromsourcebmf | char(1) |
| 8 | help | help | help | varchar2(1024) |
| 9 | isbizmodel | isbizmodel | isbizmodel | char(1) |
| 10 | modifytime | modifytime | modifytime | char(19) |
| 11 | name | name | name | varchar2(50) | √ |
| 12 | namespace | namespace | namespace | varchar2(512) |
| 13 | ownmodule | ownmodule | ownmodule | varchar2(50) |
| 14 | preload | preload | preload | char(1) |
| 15 | resid | resid | resid | varchar2(90) |
| 16 | resmodule | resmodule | resmodule | varchar2(90) |
| 17 | version | version | version | varchar2(512) |
| 18 | creator | creator | creator | varchar2(30) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifier | modifier | modifier | varchar2(30) |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |