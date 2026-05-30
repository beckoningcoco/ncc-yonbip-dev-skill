# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8449.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_combinscheme | pk_combinscheme | pk_combinscheme | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | combintype | combintype | combintype | varchar2(50) | √ |
| 4 | detailorder | detailorder | detailorder | varchar2(50) | √ |
| 5 | iscombindifdirection | iscombindifdirection | iscombindifdirection | char(1) |  |  | 'N' |
| 6 | iscombindifexp | iscombindifexp | iscombindifexp | char(1) |
| 7 | iscombindifprice | iscombindifprice | iscombindifprice | char(1) |
| 8 | iscombinsameacc | iscombinsameacc | iscombinsameacc | char(1) |
| 9 | isorderbycode | isorderbycode | isorderbycode | char(1) |
| 10 | name | name | name | varchar2(300) |
| 11 | name2 | name2 | name2 | varchar2(300) |
| 12 | name3 | name3 | name3 | varchar2(300) |
| 13 | name4 | name4 | name4 | varchar2(300) |
| 14 | name5 | name5 | name5 | varchar2(300) |
| 15 | name6 | name6 | name6 | varchar2(300) |
| 16 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(50) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |