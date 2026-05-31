# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6428.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ruleid | ruleid | ruleid | char(20) | √ |
| 2 | addenable | addenable | addenable | char(1) | √ |  | 'Y' |
| 3 | deleteenable | deleteenable | deleteenable | char(1) | √ |  | 'Y' |
| 4 | extrule | extrule | extrule | varchar2(2000) |
| 5 | overrideenable | overrideenable | overrideenable | char(1) | √ |  | 'Y' |
| 6 | restypeid | restypeid | restypeid | varchar2(20) |  |  | '~' |
| 7 | updateenable | updateenable | updateenable | char(1) | √ |  | 'Y' |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |