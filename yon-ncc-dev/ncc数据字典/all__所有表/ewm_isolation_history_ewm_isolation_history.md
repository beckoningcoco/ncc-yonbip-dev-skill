# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8003.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_iso_history | pk_iso_history | pk_iso_history | char(20) | √ |
| 2 | memo | memo | memo | varchar2(200) |
| 3 | operate_status | operate_status | operate_status | number(38, 0) |
| 4 | operate_time | operate_time | operate_time | char(19) |
| 5 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 6 | pk_isolation | pk_isolation | pk_isolation | char(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |