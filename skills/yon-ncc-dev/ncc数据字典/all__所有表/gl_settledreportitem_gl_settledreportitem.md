# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8556.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settledreportitem | pk_settledreportitem | pk_settledreportitem | char(20) | √ |
| 2 | checkresult | checkresult | checkresult | varchar2(200) |
| 3 | finishstate | finishstate | finishstate | number(38, 0) |
| 4 | finishtime | finishtime | finishtime | char(19) |
| 5 | isfinished | isfinished | isfinished | number(38, 0) |
| 6 | pk_settledreport | pk_settledreport | pk_settledreport | varchar2(20) |  |  | '~' |
| 7 | pk_settledrule | pk_settledrule | pk_settledrule | varchar2(20) |  |  | '~' |
| 8 | requiretime | requiretime | requiretime | char(19) |
| 9 | tasktype | tasktype | tasktype | number(38, 0) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |