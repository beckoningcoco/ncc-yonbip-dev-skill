# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11617.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_passwordsec | pk_passwordsec | pk_passwordsec | char(20) | √ |
| 2 | alertdays | alertdays | alertdays | number(38, 0) |
| 3 | code | code | code | varchar2(20) | √ |
| 4 | complexity | complexity | complexity | varchar2(101) | √ |
| 5 | errorloginthreshold | errorloginthreshold | errorloginthreshold | number(38, 0) |
| 6 | invalidatelock | invalidatelock | invalidatelock | char(1) |
| 7 | isautolock | isautolock | isautolock | char(1) |
| 8 | minimumlength | minimumlength | minimumlength | number(38, 0) |
| 9 | name | name | name | varchar2(20) | √ |
| 10 | name2 | name2 | name2 | varchar2(20) |
| 11 | name3 | name3 | name3 | varchar2(20) |
| 12 | name4 | name4 | name4 | varchar2(20) |
| 13 | name5 | name5 | name5 | varchar2(20) |
| 14 | name6 | name6 | name6 | varchar2(20) |
| 15 | remembercount | remembercount | remembercount | number(38, 0) |
| 16 | similaritydegree | similaritydegree | similaritydegree | varchar2(20) |
| 17 | starttime | starttime | starttime | char(19) |
| 18 | unlocktime | unlocktime | unlocktime | number(38, 0) |
| 19 | validatedays | validatedays | validatedays | number(38, 0) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |