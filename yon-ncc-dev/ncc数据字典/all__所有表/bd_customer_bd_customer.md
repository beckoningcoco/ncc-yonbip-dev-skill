# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6851.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_customer | pk_customer | pk_customer | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | corpaddress | corpaddress | corpaddress | varchar2(20) |  |  | '~' |
| 4 | custprop | custprop | custprop | number(38, 0) | √ |  | 0 |
| 5 | custstate | custstate | custstate | number(38, 0) | √ |  | 1 |
| 6 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 7 | deletestate | deletestate | deletestate | number(38, 0) |
| 8 | delperson | delperson | delperson | varchar2(20) |  |  | '~' |
| 9 | deltime | deltime | deltime | char(19) |
| 10 | ecotypesincevfive | ecotypesincevfive | ecotypesincevfive | varchar2(20) |  |  | '~' |
| 11 | email | email | email | varchar2(50) |
| 12 | enablestate | enablestate | enablestate | number(38, 0) | √ |  | 2 |
| 13 | ename | ename | ename | varchar2(200) |
| 14 | fax1 | fax1 | fax1 | varchar2(50) |
| 15 | fax2 | fax2 | fax2 | varchar2(50) |
| 16 | frozenflag | frozenflag | frozenflag | char(1) | √ |  | 'N' |
| 17 | innerprofitcenter | innerprofitcenter | innerprofitcenter | char(1) | √ |  | 'N' |
| 18 | isfreecust | isfreecust | isfreecust | char(1) | √ |  | 'N' |
| 19 | ismobilecoopertive | ismobilecoopertive | ismobilecoopertive | char(1) | √ |  | 'N' |
| 20 | isretailstore | isretailstore | isretailstore | char(1) |  |  | 'N' |
| 21 | issupplier | issupplier | issupplier | char(1) | √ |  | 'N' |
| 22 | isvat | isvat | isvat | char(1) |  |  | 'N' |
| 23 | legalbody | legalbody | legalbody | varchar2(200) |
| 24 | memo | memo | memo | varchar2(1536) |
| 25 | mnecode | mnecode | mnecode | varchar2(50) |
| 26 | name | name | name | varchar2(300) | √ |
| 27 | name2 | name2 | name2 | varchar2(300) |
| 28 | name3 | name3 | name3 | varchar2(300) |
| 29 | name4 | name4 | name4 | varchar2(300) |
| 30 | name5 | name5 | name5 | varchar2(300) |
| 31 | name6 | name6 | name6 | varchar2(300) |
| 32 | pk_areacl | pk_areacl | pk_areacl | varchar2(20) |  |  | '~' |
| 33 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |  |  | '~' |
| 34 | pk_country | pk_country | pk_country | char(20) | √ |
| 35 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 36 | pk_custclass | pk_custclass | pk_custclass | char(20) | √ |
| 37 | pk_customerpf | pk_customerpf | pk_customerpf | char(20) |
| 38 | pk_customer_main | pk_customer_main | pk_customer_main | varchar2(20) |  |  | '~' |
| 39 | pk_custtaxes | pk_custtaxes | pk_custtaxes | varchar2(20) |
| 40 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 41 | pk_format | pk_format | pk_format | char(20) | √ |
| 42 | pk_group | pk_group | pk_group | char(20) | √ |
| 43 | pk_org | pk_org | pk_org | char(20) | √ |
| 44 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) | √ |  | '~' |
| 45 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 46 | pk_timezone | pk_timezone | pk_timezone | char(20) | √ |
| 47 | registerfund | registerfund | registerfund | number(14, 2) |
| 48 | shortname | shortname | shortname | varchar2(300) |
| 49 | source | source | source | number(38, 0) | √ |  | 0 |
| 50 | taxpayerid | taxpayerid | taxpayerid | varchar2(20) |
| 51 | tel1 | tel1 | tel1 | varchar2(50) |
| 52 | tel2 | tel2 | tel2 | varchar2(50) |
| 53 | tel3 | tel3 | tel3 | varchar2(50) |
| 54 | trade | trade | trade | varchar2(20) |  |  | '~' |
| 55 | url | url | url | varchar2(60) |
| 56 | vatcode | vatcode | vatcode | varchar2(50) |
| 57 | def1 | def1 | def1 | varchar2(101) |
| 58 | def2 | def2 | def2 | varchar2(101) |
| 59 | def3 | def3 | def3 | varchar2(101) |
| 60 | def4 | def4 | def4 | varchar2(101) |
| 61 | def5 | def5 | def5 | varchar2(101) |
| 62 | def6 | def6 | def6 | varchar2(101) |
| 63 | def7 | def7 | def7 | varchar2(101) |
| 64 | def8 | def8 | def8 | varchar2(101) |
| 65 | def9 | def9 | def9 | varchar2(101) |
| 66 | def10 | def10 | def10 | varchar2(101) |
| 67 | def11 | def11 | def11 | varchar2(101) |
| 68 | def12 | def12 | def12 | varchar2(101) |
| 69 | def13 | def13 | def13 | varchar2(101) |
| 70 | def14 | def14 | def14 | varchar2(101) |
| 71 | def15 | def15 | def15 | varchar2(101) |
| 72 | def16 | def16 | def16 | varchar2(101) |
| 73 | def17 | def17 | def17 | varchar2(101) |
| 74 | def18 | def18 | def18 | varchar2(101) |
| 75 | def19 | def19 | def19 | varchar2(101) |
| 76 | def20 | def20 | def20 | varchar2(101) |
| 77 | def21 | def21 | def21 | varchar2(101) |
| 78 | def22 | def22 | def22 | varchar2(101) |
| 79 | def23 | def23 | def23 | varchar2(101) |
| 80 | def24 | def24 | def24 | varchar2(101) |
| 81 | def25 | def25 | def25 | varchar2(101) |
| 82 | def26 | def26 | def26 | varchar2(101) |
| 83 | def27 | def27 | def27 | varchar2(101) |
| 84 | def28 | def28 | def28 | varchar2(101) |
| 85 | def29 | def29 | def29 | varchar2(101) |
| 86 | def30 | def30 | def30 | varchar2(101) |
| 87 | creationtime | creationtime | creationtime | char(19) |
| 88 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 89 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 90 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 91 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 92 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |