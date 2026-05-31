# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12630.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hostreat | pk_hostreat | pk_hostreat | char(20) | √ |
| 2 | cate_fee | cate_fee | cate_fee | varchar2(3) |
| 3 | cate_pay | cate_pay | cate_pay | varchar2(3) |
| 4 | code_pinyin | code_pinyin | code_pinyin | varchar2(8) |
| 5 | code_wubi | code_wubi | code_wubi | varchar2(8) |
| 6 | date_report | date_report | date_report | char(19) |
| 7 | hpcode | hpcode | hpcode | varchar2(50) |
| 8 | maxprice | maxprice | maxprice | varchar2(8) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_hp | pk_hp | pk_hp | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | psn_oper | psn_oper | psn_oper | varchar2(20) |
| 13 | srv_code | srv_code | srv_code | varchar2(20) |
| 14 | srv_name | srv_name | srv_name | varchar2(100) |
| 15 | status_report | status_report | status_report | number(38, 0) |
| 16 | unit | unit | unit | varchar2(10) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |