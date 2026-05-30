# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11278.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkreport | pk_checkreport | pk_checkreport | char(20) | √ |
| 2 | ccostcenterid | ccostcenterid | ccostcenterid | varchar2(20) |  |  | '~' |
| 3 | ccostcomponentid | ccostcomponentid | ccostcomponentid | varchar2(20) |  |  | '~' |
| 4 | checkitem | checkitem | checkitem | varchar2(50) |
| 5 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 6 | cperiod | cperiod | cperiod | varchar2(20) |  |  | '~' |
| 7 | description | description | description | varchar2(50) |
| 8 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_co | pk_org_co | pk_org_co | varchar2(20) |  |  | '~' |
| 12 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 13 | vmocode | vmocode | vmocode | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |