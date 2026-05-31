# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11136.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportpublish | pk_reportpublish | pk_reportpublish | char(20) | √ |
| 2 | markstatus | markstatus | markstatus | varchar2(50) | √ |
| 3 | marktime | marktime | marktime | char(19) |  |  | '~' |
| 4 | pk_destorg | pk_destorg | pk_destorg | varchar2(20) | √ |
| 5 | pk_destrole | pk_destrole | pk_destrole | varchar2(20) | √ |
| 6 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 7 | pk_report | pk_report | pk_report | varchar2(20) | √ |
| 8 | pk_reportclass | pk_reportclass | pk_reportclass | varchar2(20) | √ |
| 9 | publishtime | publishtime | publishtime | char(19) | √ |
| 10 | userid | userid | userid | varchar2(20) | √ |
| 11 | usetime | usetime | usetime | char(19) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |