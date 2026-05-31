# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7175.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mspfa | pk_mspfa | pk_mspfa | char(20) | √ |
| 2 | code_fa | code_fa | code_fa | varchar2(30) | √ |
| 3 | crowno | crowno | crowno | varchar2(50) |
| 4 | dt_farole | dt_farole | dt_farole | varchar2(50) |
| 5 | note | note | note | varchar2(256) |
| 6 | pk_farole | pk_farole | pk_farole | varchar2(20) | √ |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_msp | pk_msp | pk_msp | char(20) | √ |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |