# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10991.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sysinittemp | pk_sysinittemp | pk_sysinittemp | char(20) | √ |
| 2 | afterclass | afterclass | afterclass | varchar2(50) |
| 3 | apptag | apptag | apptag | varchar2(20) |
| 4 | checkclass | checkclass | checkclass | varchar2(100) |
| 5 | checkregex | checkregex | checkregex | varchar2(2000) |
| 6 | dataclass | dataclass | dataclass | varchar2(50) |
| 7 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 8 | datasvaeclass | datasvaeclass | datasvaeclass | varchar2(2000) |
| 9 | defaultvalue | defaultvalue | defaultvalue | varchar2(500) |
| 10 | domainflag | domainflag | domainflag | varchar2(30) |
| 11 | editcomponentctrlclass | editcomponentctrlclass | editcomponentctrlclass | varchar2(100) |
| 12 | editvaluepath | editvaluepath | editvaluepath | varchar2(200) |
| 13 | groupcode | groupcode | groupcode | varchar2(20) |
| 14 | groupname | groupname | groupname | varchar2(375) |
| 15 | initcode | initcode | initcode | varchar2(50) |
| 16 | initname | initname | initname | varchar2(768) |
| 17 | mainflag | mainflag | mainflag | char(1) | √ |
| 18 | meta | meta | meta | varchar2(1000) |
| 19 | mutexflag | mutexflag | mutexflag | number(38, 0) |
| 20 | orgtypeconvertmode | orgtypeconvertmode | orgtypeconvertmode | varchar2(50) | √ |  | '0' |
| 21 | paratype | paratype | paratype | varchar2(20) |
| 22 | pk_orgtype | pk_orgtype | pk_orgtype | varchar2(20) | √ |
| 23 | pk_refinfo | pk_refinfo | pk_refinfo | varchar2(20) |
| 24 | refpath | refpath | refpath | varchar2(200) |
| 25 | ref_condclass | ref_condclass | ref_condclass | varchar2(1000) |
| 26 | ref_namemapping | ref_namemapping | ref_namemapping | varchar2(1000) |
| 27 | remark | remark | remark | varchar2(750) |
| 28 | showflag | showflag | showflag | char(1) | √ |
| 29 | stateflag | stateflag | stateflag | number(38, 0) | √ |
| 30 | sysflag | sysflag | sysflag | char(1) | √ |
| 31 | sysindex | sysindex | sysindex | number(38, 0) | √ |
| 32 | valuelist | valuelist | valuelist | varchar2(600) |
| 33 | valuetype | valuetype | valuetype | number(38, 0) | √ |
| 34 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 35 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |