# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11919.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ranking | pk_ranking | pk_ranking | varchar2(50) | √ |
| 2 | istop | istop | istop | char(1) |  |  | 'N' |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | pk_priority | pk_priority | pk_priority | varchar2(50) |
| 6 | pk_ssctask | pk_ssctask | pk_ssctask | varchar2(50) |
| 7 | pk_sscunit | pk_sscunit | pk_sscunit | varchar2(20) |
| 8 | pk_workinggroup | pk_workinggroup | pk_workinggroup | varchar2(50) |
| 9 | sequence | sequence | sequence | varchar2(50) |
| 10 | upgradetime | upgradetime | upgradetime | char(19) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |