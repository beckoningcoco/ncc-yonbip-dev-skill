# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11541.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | itemid | itemid | itemid | char(20) | √ |
| 2 | command | command | command | varchar2(2000) |
| 3 | iconpath | iconpath | iconpath | varchar2(2000) |
| 4 | itemhint | itemhint | itemhint | varchar2(1500) |
| 5 | itemname | itemname | itemname | varchar2(300) |
| 6 | typecode | typecode | typecode | varchar2(300) |
| 7 | userid | userid | userid | varchar2(20) |  |  | '~' |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |