# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9835.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | columnid | columnid | columnid | varchar2(50) | √ |
| 2 | tableid | tableid | tableid | varchar2(50) | √ |
| 3 | viewid | viewid | viewid | varchar2(50) | √ |
| 4 | vcsequence | vcsequence | vcsequence | number(38, 0) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |