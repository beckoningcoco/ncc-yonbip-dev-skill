# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6456.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_prop | pk_prop | pk_prop | char(20) | √ |
| 2 | expression | expression | expression | varchar2(1000) |
| 3 | extfield | extfield | extfield | varchar2(2000) |
| 4 | pk_measure | pk_measure | pk_measure | char(20) | √ |
| 5 | propid | propid | propid | varchar2(100) | √ |
| 6 | propname | propname | propname | varchar2(200) |
| 7 | propvalue | propvalue | propvalue | varchar2(100) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |