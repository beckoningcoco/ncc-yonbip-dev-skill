# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12853.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assigncls | pk_assigncls | pk_assigncls | char(20) | √ |
| 2 | classid | classid | classid | varchar2(20) | √ |
| 3 | moduleflag | moduleflag | moduleflag | number(38, 0) | √ |
| 4 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 5 | pk_sourcecls | pk_sourcecls | pk_sourcecls | varchar2(20) | √ |
| 6 | startperiod | startperiod | startperiod | char(2) | √ |
| 7 | startyear | startyear | startyear | char(4) | √ |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |