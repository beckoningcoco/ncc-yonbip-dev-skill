# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10994.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_systemplate | pk_systemplate | pk_systemplate | char(20) | √ |
| 2 | appcode | appcode | appcode | varchar2(60) |
| 3 | devorg | devorg | devorg | varchar2(20) |
| 4 | funnode | funnode | funnode | varchar2(50) | √ |
| 5 | layer | layer | layer | number(38, 0) |
| 6 | moduleid | moduleid | moduleid | varchar2(10) | √ |
| 7 | nodekey | nodekey | nodekey | varchar2(50) |
| 8 | pk_country | pk_country | pk_country | varchar2(20) |
| 9 | pk_industry | pk_industry | pk_industry | varchar2(20) |
| 10 | templateid | templateid | templateid | char(20) | √ |
| 11 | tempstyle | tempstyle | tempstyle | number(38, 0) | √ |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |