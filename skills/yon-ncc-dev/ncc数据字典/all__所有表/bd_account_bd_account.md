# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6724.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_account | pk_account | pk_account | char(20) | √ |
| 2 | acclev | acclev | acclev | number(38, 0) |
| 3 | accproperty | accproperty | accproperty | number(38, 0) | √ |  | 0 |
| 4 | balancetype | balancetype | balancetype | char(1) |
| 5 | balanflag | balanflag | balanflag | char(1) |
| 6 | balanorient | balanorient | balanorient | number(38, 0) | √ |  | 0 |
| 7 | bankacc | bankacc | bankacc | char(1) |
| 8 | billdate | billdate | billdate | char(1) |
| 9 | billnumber | billnumber | billnumber | char(1) |
| 10 | billtype | billtype | billtype | char(1) |
| 11 | bothorient | bothorient | bothorient | char(1) |
| 12 | cashtype | cashtype | cashtype | number(38, 0) | √ |  | 0 |
| 13 | code | code | code | varchar2(40) | √ |
| 14 | combineform | combineform | combineform | char(1) |
| 15 | currency | currency | currency | varchar2(20) |  |  | '~' |
| 16 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 17 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 18 | fimgrprop | fimgrprop | fimgrprop | number(38, 0) | √ |  | 0 |
| 19 | incurflag | incurflag | incurflag | char(1) |
| 20 | inneracc | inneracc | inneracc | char(1) |
| 21 | innercode | innercode | innercode | varchar2(200) |
| 22 | innerinfo | innerinfo | innerinfo | char(1) |
| 23 | name | name | name | varchar2(300) |  |  | '~' |
| 24 | name2 | name2 | name2 | varchar2(300) |
| 25 | name3 | name3 | name3 | varchar2(300) |
| 26 | name4 | name4 | name4 | varchar2(300) |
| 27 | name5 | name5 | name5 | varchar2(300) |
| 28 | name6 | name6 | name6 | varchar2(300) |
| 29 | nparallelaccounts | nparallelaccounts | nparallelaccounts | char(1) | √ |  | 'N' |
| 30 | outflag | outflag | outflag | char(1) |
| 31 | parallelaccounts | parallelaccounts | parallelaccounts | char(1) | √ |  | 'N' |
| 32 | pid | pid | pid | varchar2(20) |  |  | '~' |
| 33 | pk_accchart | pk_accchart | pk_accchart | char(20) | √ |
| 34 | pk_acctype | pk_acctype | pk_acctype | char(20) | √ |
| 35 | pk_originalaccount | pk_originalaccount | pk_originalaccount | varchar2(20) |
| 36 | price | price | price | char(1) |
| 37 | quantity | quantity | quantity | char(1) |
| 38 | remcode | remcode | remcode | varchar2(50) |
| 39 | sumprint_level | sumprint_level | sumprint_level | number(38, 0) |  |  | 0 |
| 40 | unit | unit | unit | varchar2(20) |  |  | '~' |
| 41 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 42 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |