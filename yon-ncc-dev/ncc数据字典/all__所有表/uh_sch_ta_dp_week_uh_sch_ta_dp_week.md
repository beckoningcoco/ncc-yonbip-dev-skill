# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12793.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tadpweek | pk_tadpweek | pk_tadpweek | char(20) | √ |
| 2 | eu_tapsn_plan | eu_tapsn_plan | eu_tapsn_plan | char(50) |
| 3 | name_schtatype | name_schtatype | name_schtatype | varchar2(50) |
| 4 | pk_dateslot | pk_dateslot | pk_dateslot | varchar2(20) |  |  | '~' |
| 5 | pk_group | pk_group | pk_group | varchar2(50) |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_schtatype | pk_schtatype | pk_schtatype | varchar2(50) |
| 8 | pk_tadp | pk_tadp | pk_tadp | char(20) | √ |
| 9 | weekno | weekno | weekno | varchar2(50) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |