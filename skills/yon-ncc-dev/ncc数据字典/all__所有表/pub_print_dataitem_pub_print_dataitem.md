# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10965.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_varitem | pk_varitem | pk_varitem | char(20) | √ |
| 2 | appcode | appcode | appcode | varchar2(60) |
| 3 | idatatype | idatatype | idatatype | number(38, 0) |
| 4 | itype | itype | itype | number(38, 0) |
| 5 | pk_corp | pk_corp | pk_corp | varchar2(20) |  |  | '~' |
| 6 | prepare1 | prepare1 | prepare1 | varchar2(20) |
| 7 | resid | resid | resid | varchar2(30) |
| 8 | userdefflag | userdefflag | userdefflag | char(1) |
| 9 | vnodecode | vnodecode | vnodecode | varchar2(60) |
| 10 | vtablecode | vtablecode | vtablecode | varchar2(50) |
| 11 | vtablename | vtablename | vtablename | varchar2(75) |
| 12 | vvarexpress | vvarexpress | vvarexpress | varchar2(150) |
| 13 | vvarname | vvarname | vvarname | varchar2(75) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |