# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7342.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assigncls | pk_assigncls | pk_assigncls | char(20) | √ |
| 2 | classid | classid | classid | varchar2(20) | √ |
| 3 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 4 | pk_sourcecls | pk_sourcecls | pk_sourcecls | varchar2(20) | √ |
| 5 | startperiod | startperiod | startperiod | char(2) | √ |
| 6 | startyear | startyear | startyear | char(4) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |