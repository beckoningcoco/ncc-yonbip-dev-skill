# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9812.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | industry | industry | industry | varchar2(50) | √ |
| 3 | versiontype | versiontype | versiontype | number(38, 0) | √ |
| 4 | accessorclassname | accessorclassname | accessorclassname | varchar2(256) |
| 5 | bizitfimpclassname | bizitfimpclassname | bizitfimpclassname | varchar2(256) |
| 6 | classtype | classtype | classtype | number(38, 0) |
| 7 | componentid | componentid | componentid | varchar2(50) |
| 8 | createtime | createtime | createtime | char(19) |
| 9 | defaulttablename | defaulttablename | defaulttablename | varchar2(50) |
| 10 | description | description | description | varchar2(512) |
| 11 | displayname | displayname | displayname | varchar2(90) |
| 12 | fixedlength | fixedlength | fixedlength | char(1) |
| 13 | fullclassname | fullclassname | fullclassname | varchar2(256) |
| 14 | help | help | help | varchar2(1024) |
| 15 | isactive | isactive | isactive | char(1) |
| 16 | isauthen | isauthen | isauthen | char(1) |
| 17 | iscreatesql | iscreatesql | iscreatesql | char(1) |
| 18 | isextendbean | isextendbean | isextendbean | char(1) |
| 19 | isprimary | isprimary | isprimary | char(1) |
| 20 | keyattribute | keyattribute | keyattribute | varchar2(50) |
| 21 | modifytime | modifytime | modifytime | char(19) |
| 22 | modinfoclassname | modinfoclassname | modinfoclassname | varchar2(256) |
| 23 | name | name | name | varchar2(50) | √ |
| 24 | parentclassid | parentclassid | parentclassid | varchar2(50) |
| 25 | precise | precise | precise | number(38, 0) |
| 26 | refmodelname | refmodelname | refmodelname | varchar2(768) |
| 27 | resid | resid | resid | varchar2(90) |
| 28 | returntype | returntype | returntype | varchar2(50) |
| 29 | stereotype | stereotype | stereotype | varchar2(256) |
| 30 | userdefclassname | userdefclassname | userdefclassname | varchar2(256) |
| 31 | creator | creator | creator | varchar2(30) |
| 32 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 33 | modifier | modifier | modifier | varchar2(30) |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |