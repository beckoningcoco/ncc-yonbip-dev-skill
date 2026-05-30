# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6914.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrtempsecdg | pk_emrtempsecdg | pk_emrtempsecdg | char(20) | √ |
| 2 | flagactive | flagactive | flagactive | char(1) |
| 3 | pk_emrdg | pk_emrdg | pk_emrdg | varchar2(50) |
| 4 | pk_emrtempsec | pk_emrtempsec | pk_emrtempsec | varchar2(20) |  |  | '~' |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 7 | sortno | sortno | sortno | number(38, 0) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |