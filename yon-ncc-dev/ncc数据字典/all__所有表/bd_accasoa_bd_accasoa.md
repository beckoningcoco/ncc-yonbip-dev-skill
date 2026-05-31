# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6707.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accasoa | pk_accasoa | pk_accasoa | char(20) | √ |
| 2 | allowclose | allowclose | allowclose | char(1) |
| 3 | balancetype | balancetype | balancetype | char(1) | √ |  | 'N' |
| 4 | balanflag | balanflag | balanflag | char(1) |
| 5 | bankacc | bankacc | bankacc | char(1) | √ |  | 'N' |
| 6 | billdate | billdate | billdate | char(1) | √ |  | 'N' |
| 7 | billnumber | billnumber | billnumber | char(1) | √ |  | 'N' |
| 8 | billtype | billtype | billtype | char(1) | √ |  | 'N' |
| 9 | bothorient | bothorient | bothorient | char(1) |
| 10 | ctrlmodules | ctrlmodules | ctrlmodules | varchar2(500) |
| 11 | currency | currency | currency | varchar2(20) |  |  | '~' |
| 12 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 13 | dispname | dispname | dispname | varchar2(1500) |
| 14 | dispname2 | dispname2 | dispname2 | varchar2(1500) |
| 15 | dispname3 | dispname3 | dispname3 | varchar2(1500) |
| 16 | dispname4 | dispname4 | dispname4 | varchar2(1500) |
| 17 | dispname5 | dispname5 | dispname5 | varchar2(1500) |
| 18 | dispname6 | dispname6 | dispname6 | varchar2(1500) |
| 19 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 20 | endflag | endflag | endflag | char(1) | √ |
| 21 | incurflag | incurflag | incurflag | char(1) |
| 22 | innerinfo | innerinfo | innerinfo | char(1) |
| 23 | name | name | name | varchar2(300) | √ |
| 24 | name2 | name2 | name2 | varchar2(300) |
| 25 | name3 | name3 | name3 | varchar2(300) |
| 26 | name4 | name4 | name4 | varchar2(300) |
| 27 | name5 | name5 | name5 | varchar2(300) |
| 28 | name6 | name6 | name6 | varchar2(300) |
| 29 | pk_accchart | pk_accchart | pk_accchart | char(20) | √ |
| 30 | pk_account | pk_account | pk_account | char(20) | √ |
| 31 | price | price | price | char(1) | √ |  | 'N' |
| 32 | quantity | quantity | quantity | char(1) | √ |  | 'N' |
| 33 | remcode | remcode | remcode | varchar2(50) |
| 34 | sumprint_level | sumprint_level | sumprint_level | number(38, 0) | √ |  | 0 |
| 35 | unit | unit | unit | varchar2(20) |  |  | '~' |
| 36 | usedesc | usedesc | usedesc | varchar2(600) |
| 37 | def1 | def1 | def1 | varchar2(101) |
| 38 | def2 | def2 | def2 | varchar2(101) |
| 39 | def3 | def3 | def3 | varchar2(101) |
| 40 | def4 | def4 | def4 | varchar2(101) |
| 41 | def5 | def5 | def5 | varchar2(101) |
| 42 | creationtime | creationtime | creationtime | char(19) |
| 43 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 44 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 45 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 46 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 47 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |