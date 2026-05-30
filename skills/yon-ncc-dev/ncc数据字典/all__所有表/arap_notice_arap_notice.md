# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6585.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_notice | pk_notice | pk_notice | varchar2(20) | √ |
| 2 | beizhu | beizhu | beizhu | varchar2(100) |
| 3 | code | code | code | varchar2(28) |
| 4 | name | name | name | varchar2(50) |
| 5 | pk_curr | pk_curr | pk_curr | varchar2(20) |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |
| 7 | pk_timecontrol | pk_timecontrol | pk_timecontrol | varchar2(20) |
| 8 | type | type | type | varchar2(1) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |