# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6432.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | uri | uri | uri | varchar2(200) | √ |
| 2 | fspath | fspath | fspath | varchar2(100) | √ |
| 3 | updatetime | updatetime | updatetime | number(38, 0) | √ |
| 4 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 5 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |