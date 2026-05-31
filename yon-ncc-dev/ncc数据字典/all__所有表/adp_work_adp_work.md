# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6444.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | wid | wid | wid | varchar2(50) | √ |
| 2 | argument | argument | argument | varchar2(4000) |
| 3 | argument2 | argument2 | argument2 | varchar2(4000) |
| 4 | argument3 | argument3 | argument3 | varchar2(4000) |
| 5 | busicode | busicode | busicode | varchar2(500) |
| 6 | createtime | createtime | createtime | char(19) | √ |
| 7 | sn | sn | sn | number(38, 0) | √ |
| 8 | subject | subject | subject | varchar2(200) | √ |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |