# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9704.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskmsgsel | pk_taskmsgsel | pk_taskmsgsel | char(20) | √ |
| 2 | msgtemp | msgtemp | msgtemp | varchar2(50) |
| 3 | pk_org | pk_org | pk_org | varchar2(20) |
| 4 | pk_task | pk_task | pk_task | varchar2(20) |  |  | '~' |
| 5 | temptype | temptype | temptype | varchar2(50) |
| 6 | type | type | type | number(38, 0) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |