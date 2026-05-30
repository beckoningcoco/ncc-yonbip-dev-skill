# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10701.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_servprice | pk_servprice | pk_servprice | char(20) | √ |
| 2 | buysellflag | buysellflag | buysellflag | number(38, 0) |
| 3 | code | code | code | varchar2(40) |
| 4 | last_v_flag | last_v_flag | last_v_flag | char(1) |  |  | 'Y' |
| 5 | meomo | meomo | meomo | varchar2(200) |
| 6 | name | name | name | varchar2(300) |
| 7 | name2 | name2 | name2 | varchar2(300) |
| 8 | name3 | name3 | name3 | varchar2(300) |
| 9 | name4 | name4 | name4 | varchar2(300) |
| 10 | name5 | name5 | name5 | varchar2(300) |
| 11 | name6 | name6 | name6 | varchar2(300) |
| 12 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_rececountry | pk_rececountry | pk_rececountry | varchar2(20) |  |  | '~' |
| 16 | pk_sendcountry | pk_sendcountry | pk_sendcountry | varchar2(20) |  |  | '~' |
| 17 | pk_taxcountry | pk_taxcountry | pk_taxcountry | varchar2(20) |  |  | '~' |
| 18 | pk_up_version | pk_up_version | pk_up_version | varchar2(20) |
| 19 | triatradeflag | triatradeflag | triatradeflag | char(1) |
| 20 | validate_date | validate_date | validate_date | char(19) |
| 21 | version | version | version | number(38, 0) |  |  | 1 |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |