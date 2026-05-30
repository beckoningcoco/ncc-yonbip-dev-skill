# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7428.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rulesection | pk_rulesection | pk_rulesection | char(20) | √ |
| 2 | accountassitem | accountassitem | accountassitem | varchar2(20) |  |  | '~' |
| 3 | accountdirect | accountdirect | accountdirect | number(38, 0) |
| 4 | allocruletype | allocruletype | allocruletype | number(38, 0) |
| 5 | cfactoridgrp | cfactoridgrp | cfactoridgrp | varchar2(20) |  |  | '~' |
| 6 | code | code | code | varchar2(50) |
| 7 | fetchdir | fetchdir | fetchdir | number(38, 0) |
| 8 | fetchfunc | fetchfunc | fetchfunc | number(38, 0) |
| 9 | idx | idx | idx | varchar2(50) |
| 10 | miunscontrol | miunscontrol | miunscontrol | number(38, 0) |
| 11 | name | name | name | varchar2(300) |
| 12 | name2 | name2 | name2 | varchar2(300) |
| 13 | name3 | name3 | name3 | varchar2(300) |
| 14 | name4 | name4 | name4 | varchar2(300) |
| 15 | name5 | name5 | name5 | varchar2(300) |
| 16 | name6 | name6 | name6 | varchar2(300) |
| 17 | periodoffset | periodoffset | periodoffset | number(38, 0) |
| 18 | periodtype | periodtype | periodtype | number(38, 0) |
| 19 | pk_accasoa | pk_accasoa | pk_accasoa | varchar2(20) |  |  | '~' |
| 20 | pk_accasoagrp | pk_accasoagrp | pk_accasoagrp | varchar2(50) |
| 21 | pk_acceptaccasoa | pk_acceptaccasoa | pk_acceptaccasoa | varchar2(20) |  |  | '~' |
| 22 | pk_accperiodmonth | pk_accperiodmonth | pk_accperiodmonth | varchar2(20) |  |  | '~' |
| 23 | pk_acptaccitem | pk_acptaccitem | pk_acptaccitem | varchar2(20) |  |  | '~' |
| 24 | pk_acptbaccount | pk_acptbaccount | pk_acptbaccount | varchar2(20) |  |  | '~' |
| 25 | pk_acptsummary | pk_acptsummary | pk_acptsummary | varchar2(300) |  |  | '~' |
| 26 | pk_acptvouchtype | pk_acptvouchtype | pk_acptvouchtype | varchar2(50) |
| 27 | pk_allocruleset | pk_allocruleset | pk_allocruleset | varchar2(20) |  |  | '~' |
| 28 | pk_cfactorid | pk_cfactorid | pk_cfactorid | varchar2(20) |  |  | '~' |
| 29 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 30 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 31 | pk_sendaccitem | pk_sendaccitem | pk_sendaccitem | varchar2(20) |  |  | '~' |
| 32 | pk_sendbaccount | pk_sendbaccount | pk_sendbaccount | varchar2(20) |  |  | '~' |
| 33 | pk_sendorg | pk_sendorg | pk_sendorg | varchar2(20) |  |  | '~' |
| 34 | pk_sendsummary | pk_sendsummary | pk_sendsummary | varchar2(300) |  |  | '~' |
| 35 | pk_sendvouchtype | pk_sendvouchtype | pk_sendvouchtype | varchar2(50) |
| 36 | rate | rate | rate | number(28, 8) |
| 37 | receiverule | receiverule | receiverule | number(38, 0) |
| 38 | rulesectiontype | rulesectiontype | rulesectiontype | number(38, 0) |
| 39 | samewithsend | samewithsend | samewithsend | char(1) |
| 40 | sendrule | sendrule | sendrule | number(38, 0) |
| 41 | creationtime | creationtime | creationtime | char(19) |
| 42 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 43 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 44 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 45 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 46 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |