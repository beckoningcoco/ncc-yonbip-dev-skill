# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9827.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | industry | industry | industry | varchar2(50) | √ |
| 3 | versiontype | versiontype | versiontype | number(38, 0) | √ |
| 4 | accessorclassname | accessorclassname | accessorclassname | varchar2(256) |
| 5 | accesspower | accesspower | accesspower | char(1) |
| 6 | accesspowergroup | accesspowergroup | accesspowergroup | varchar2(256) |
| 7 | attrlength | attrlength | attrlength | number(38, 0) |
| 8 | attrmaxvalue | attrmaxvalue | attrmaxvalue | varchar2(50) |
| 9 | attrminvalue | attrminvalue | attrminvalue | varchar2(50) |
| 10 | attrsequence | attrsequence | attrsequence | number(38, 0) |
| 11 | calculation | calculation | calculation | char(1) |
| 12 | classid | classid | classid | varchar2(50) |
| 13 | createindustry | createindustry | createindustry | varchar2(50) |
| 14 | createtime | createtime | createtime | char(19) |
| 15 | customattr | customattr | customattr | char(1) |
| 16 | datatype | datatype | datatype | varchar2(50) |
| 17 | datatypestyle | datatypestyle | datatypestyle | number(38, 0) |
| 18 | defaultvalue | defaultvalue | defaultvalue | varchar2(512) |
| 19 | description | description | description | varchar2(512) |
| 20 | displayname | displayname | displayname | varchar2(90) |
| 21 | dynamicattr | dynamicattr | dynamicattr | char(1) |
| 22 | dynamictable | dynamictable | dynamictable | varchar2(50) |
| 23 | fixedlength | fixedlength | fixedlength | char(1) |
| 24 | help | help | help | varchar2(1024) |
| 25 | hided | hided | hided | char(1) |
| 26 | isactive | isactive | isactive | char(1) |
| 27 | isauthen | isauthen | isauthen | char(1) |
| 28 | modifytime | modifytime | modifytime | char(19) |
| 29 | name | name | name | varchar2(50) | √ |
| 30 | notserialize | notserialize | notserialize | char(1) |
| 31 | nullable | nullable | nullable | char(1) |
| 32 | precise | precise | precise | number(38, 0) |
| 33 | readonly | readonly | readonly | char(1) |
| 34 | refmodelname | refmodelname | refmodelname | varchar2(256) |
| 35 | resid | resid | resid | varchar2(90) |
| 36 | visibility | visibility | visibility | number(38, 0) |
| 37 | creator | creator | creator | varchar2(30) |
| 38 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 39 | modifier | modifier | modifier | varchar2(30) |
| 40 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |