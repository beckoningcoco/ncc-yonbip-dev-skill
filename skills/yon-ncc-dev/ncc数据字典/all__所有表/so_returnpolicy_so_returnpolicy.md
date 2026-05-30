# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11727.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_returnpolicy | pk_returnpolicy | pk_returnpolicy | char(20) | √ |
| 2 | denddate | denddate | denddate | char(19) |
| 3 | dstartdate | dstartdate | dstartdate | char(19) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | vexpresscode | vexpresscode | vexpresscode | varchar2(50) |
| 7 | vexpressname | vexpressname | vexpressname | varchar2(50) |
| 8 | vpolicycode | vpolicycode | vpolicycode | varchar2(40) |
| 9 | vpolicydetail | vpolicydetail | vpolicydetail | varchar2(181) |
| 10 | vpolicyname | vpolicyname | vpolicyname | varchar2(300) |
| 11 | vpolicyname2 | vpolicyname2 | vpolicyname2 | varchar2(300) |
| 12 | vpolicyname3 | vpolicyname3 | vpolicyname3 | varchar2(300) |
| 13 | vpolicyname4 | vpolicyname4 | vpolicyname4 | varchar2(300) |
| 14 | vpolicyname5 | vpolicyname5 | vpolicyname5 | varchar2(300) |
| 15 | vpolicyname6 | vpolicyname6 | vpolicyname6 | varchar2(300) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |