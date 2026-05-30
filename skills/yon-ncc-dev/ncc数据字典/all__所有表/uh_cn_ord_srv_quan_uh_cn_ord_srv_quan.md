# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12528.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordsrvquan | pk_ordsrvquan | pk_ordsrvquan | char(20) | √ |
| 2 | date_ex | date_ex | date_ex | char(19) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_ord | pk_ord | pk_ord | varchar2(20) |  |  | '~' |
| 5 | pk_ordsrv | pk_ordsrv | pk_ordsrv | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | quan_ex | quan_ex | quan_ex | number(14, 2) |
| 8 | sortno | sortno | sortno | number(38, 0) |
| 9 | time_ex | time_ex | time_ex | char(8) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |