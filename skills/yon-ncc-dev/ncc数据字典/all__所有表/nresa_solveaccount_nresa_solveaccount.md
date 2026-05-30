# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10070.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_solveaccount | pk_solveaccount | pk_solveaccount | char(20) | √ |
| 2 | cancelsolver | cancelsolver | cancelsolver | varchar2(20) |  |  | '~' |
| 3 | cancelsolvetime | cancelsolvetime | cancelsolvetime | char(19) |
| 4 | issolveaccount | issolveaccount | issolveaccount | char(1) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_liabilitybook | pk_liabilitybook | pk_liabilitybook | varchar2(20) |  |  | '~' |
| 7 | pk_relorg | pk_relorg | pk_relorg | varchar2(20) |  |  | '~' |
| 8 | solveaccounter | solveaccounter | solveaccounter | varchar2(20) |  |  | '~' |
| 9 | solveaccounttime | solveaccounttime | solveaccounttime | char(19) |
| 10 | speriod | speriod | speriod | varchar2(4) |
| 11 | syear | syear | syear | varchar2(4) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |