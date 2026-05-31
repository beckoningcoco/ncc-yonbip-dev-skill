# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11123.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sampleplan_b | pk_sampleplan_b | pk_sampleplan_b | char(20) | √ |
| 2 | crowno | crowno | crowno | varchar2(20) |
| 3 | nacceptnum1 | nacceptnum1 | nacceptnum1 | number(38, 0) |
| 4 | nacceptnum2 | nacceptnum2 | nacceptnum2 | number(38, 0) |
| 5 | nacceptnum3 | nacceptnum3 | nacceptnum3 | number(38, 0) |
| 6 | nbatchnum | nbatchnum | nbatchnum | number(38, 0) |
| 7 | nrejectnum1 | nrejectnum1 | nrejectnum1 | number(38, 0) |
| 8 | nrejectnum2 | nrejectnum2 | nrejectnum2 | number(38, 0) |
| 9 | nrejectnum3 | nrejectnum3 | nrejectnum3 | number(38, 0) |
| 10 | nsamplenum1 | nsamplenum1 | nsamplenum1 | number(38, 0) |
| 11 | nsamplenum2 | nsamplenum2 | nsamplenum2 | number(38, 0) |
| 12 | nsamplenum3 | nsamplenum3 | nsamplenum3 | number(38, 0) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_sampleplan | pk_sampleplan | pk_sampleplan | char(20) | √ |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |