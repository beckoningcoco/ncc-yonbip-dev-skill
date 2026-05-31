# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10871.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_systemplate | pk_systemplate | pk_systemplate | char(20) | √ |
| 2 | devorg | devorg | devorg | varchar2(20) |
| 3 | layer | layer | layer | number(38, 0) |
| 4 | moduleid | moduleid | moduleid | varchar2(20) |  |  | '~' |
| 5 | nodekey | nodekey | nodekey | varchar2(50) |
| 6 | pagecode | pagecode | pagecode | varchar2(50) | √ |
| 7 | pk_country | pk_country | pk_country | varchar2(20) |  |  | '~' |
| 8 | pk_industry | pk_industry | pk_industry | varchar2(20) |  |  | '~' |
| 9 | templateid | templateid | templateid | char(20) | √ |
| 10 | templatename | templatename | templatename | varchar2(50) |
| 11 | tempstyle | tempstyle | tempstyle | varchar2(50) | √ |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |