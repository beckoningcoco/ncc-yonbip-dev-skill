# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6431.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | type | type | type | varchar2(50) | √ |
| 2 | sn | sn | sn | number(38, 0) | √ |
| 3 | updatetime | updatetime | updatetime | char(19) | √ |
| 4 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 5 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |