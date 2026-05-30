# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12693.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paticont | pk_paticont | pk_paticont | char(20) | √ |
| 2 | addr | addr | addr | varchar2(50) |
| 3 | dt_conttype | dt_conttype | dt_conttype | varchar2(50) |
| 4 | mobileno | mobileno | mobileno | varchar2(50) |
| 5 | name_cont | name_cont | name_cont | varchar2(50) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_pati | pk_pati | pk_pati | varchar2(50) |
| 9 | postcode | postcode | postcode | varchar2(50) |
| 10 | sortno | sortno | sortno | number(38, 0) |
| 11 | teleno | teleno | teleno | varchar2(50) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |