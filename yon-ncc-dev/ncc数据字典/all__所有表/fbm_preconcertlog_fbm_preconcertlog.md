# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8208.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_preconcertlog | pk_preconcertlog | pk_preconcertlog | char(20) | √ |
| 2 | fbmbillno | fbmbillno | fbmbillno | varchar2(100) |
| 3 | memo | memo | memo | varchar2(181) |
| 4 | operatetype | operatetype | operatetype | varchar2(50) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 8 | preconcertdate | preconcertdate | preconcertdate | char(19) |
| 9 | preconcertsystem | preconcertsystem | preconcertsystem | varchar2(50) |
| 10 | preconcertuser | preconcertuser | preconcertuser | varchar2(20) |  |  | '~' |
| 11 | voperator | voperator | voperator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |