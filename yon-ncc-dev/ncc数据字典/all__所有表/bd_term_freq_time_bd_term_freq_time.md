# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7117.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_freqtime | pk_freqtime | pk_freqtime | char(20) | √ |
| 2 | crowno | crowno | crowno | varchar2(50) |
| 3 | no | no | no | number(38, 0) | √ |
| 4 | pk_freq_time | pk_freq_time | pk_freq_time | char(20) | √ |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | timescope | timescope | timescope | number(38, 0) | √ |
| 8 | time_bill | time_bill | time_bill | char(19) |
| 9 | time_exec | time_exec | time_exec | char(8) | √ |
| 10 | weekno | weekno | weekno | number(38, 0) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |