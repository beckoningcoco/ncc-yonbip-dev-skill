# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10874.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_async_result | pk_async_result | pk_async_result | char(20) | √ |
| 2 | count | count | count | number(38, 0) |
| 3 | endtime | endtime | endtime | char(19) | √ |
| 4 | exec_result | exec_result | exec_result | blob |
| 5 | pk_async | pk_async | pk_async | char(20) | √ |
| 6 | server | server | server | varchar2(32) |
| 7 | starttime | starttime | starttime | char(19) | √ |
| 8 | timecost | timecost | timecost | number(38, 0) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |