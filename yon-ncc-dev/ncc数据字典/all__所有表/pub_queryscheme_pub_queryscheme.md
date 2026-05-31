# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10976.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_queryscheme | pk_queryscheme | pk_queryscheme | char(20) | √ |
| 2 | cuserid | cuserid | cuserid | varchar2(20) |
| 3 | funcode | funcode | funcode | varchar2(60) | √ |
| 4 | isautorun | isautorun | isautorun | char(1) |
| 5 | iscomplete | iscomplete | iscomplete | char(1) |
| 6 | isdefault | isdefault | isdefault | char(1) |
| 7 | isdeleted | isdeleted | isdeleted | char(1) |
| 8 | ismodified | ismodified | ismodified | char(1) |
| 9 | isprepared | isprepared | isprepared | char(1) |
| 10 | isquickqs | isquickqs | isquickqs | char(1) |
| 11 | modulename | modulename | modulename | varchar2(50) |
| 12 | name | name | name | varchar2(300) |
| 13 | name2 | name2 | name2 | varchar2(300) |
| 14 | name3 | name3 | name3 | varchar2(300) |
| 15 | name4 | name4 | name4 | varchar2(300) |
| 16 | name5 | name5 | name5 | varchar2(300) |
| 17 | name6 | name6 | name6 | varchar2(300) |
| 18 | parentid | parentid | parentid | varchar2(20) |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |
| 20 | pk_template | pk_template | pk_template | varchar2(20) | √ |
| 21 | qsobject | qsobject | qsobject | blob |
| 22 | sequenc | sequenc | sequenc | number(38, 0) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |