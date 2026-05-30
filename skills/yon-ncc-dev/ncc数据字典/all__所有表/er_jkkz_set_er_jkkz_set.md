# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7975.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_control | pk_control | pk_control | char(20) | √ |
| 2 | bbcontrol | bbcontrol | bbcontrol | number(38, 0) | √ |
| 3 | controlattr | controlattr | controlattr | varchar2(50) | √ |
| 4 | controlstyle | controlstyle | controlstyle | number(38, 0) |
| 5 | currency | currency | currency | char(20) |
| 6 | paracode | paracode | paracode | varchar2(20) | √ |
| 7 | paraname | paraname | paraname | varchar2(80) | √ |
| 8 | pk_group | pk_group | pk_group | char(20) | √ |
| 9 | pk_org | pk_org | pk_org | char(20) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |