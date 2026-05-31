# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7082.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supplier | pk_supplier | pk_supplier | char(20) | √ |
| 2 | blacklist | blacklist | blacklist | char(1) | √ |  | 'N' |
| 3 | blacklistdate | blacklistdate | blacklistdate | char(19) |
| 4 | blacklistuser | blacklistuser | blacklistuser | varchar2(20) | √ |  | '~' |
| 5 | buslicensenum | buslicensenum | buslicensenum | varchar2(200) |
| 6 | code | code | code | varchar2(40) | √ |
| 7 | corcustomer | corcustomer | corcustomer | varchar2(20) |  |  | '~' |
| 8 | corpaddress | corpaddress | corpaddress | varchar2(20) |  |  | '~' |
| 9 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 10 | deletestate | deletestate | deletestate | number(38, 0) |
| 11 | delperson | delperson | delperson | varchar2(20) |  |  | '~' |
| 12 | deltime | deltime | deltime | char(19) |
| 13 | ecotypesincevfive | ecotypesincevfive | ecotypesincevfive | varchar2(20) |  |  | '~' |
| 14 | email | email | email | varchar2(50) |
| 15 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 16 | ename | ename | ename | varchar2(200) |
| 17 | establishdate | establishdate | establishdate | char(19) |
| 18 | fax1 | fax1 | fax1 | varchar2(50) |
| 19 | fax2 | fax2 | fax2 | varchar2(50) |
| 20 | innerprofitcenter | innerprofitcenter | innerprofitcenter | char(1) | √ |  | 'N' |
| 21 | iscarrier | iscarrier | iscarrier | char(1) |  |  | 'N' |
| 22 | iscustomer | iscustomer | iscustomer | char(1) |  |  | 'N' |
| 23 | isfreecust | isfreecust | isfreecust | char(1) |  |  | 'N' |
| 24 | ismobilecoopertive | ismobilecoopertive | ismobilecoopertive | char(1) | √ |  | 'N' |
| 25 | isoutcheck | isoutcheck | isoutcheck | char(1) |  |  | 'N' |
| 26 | isvat | isvat | isvat | char(1) |  |  | 'N' |
| 27 | legalbody | legalbody | legalbody | varchar2(200) |
| 28 | memo | memo | memo | varchar2(1536) |
| 29 | mnecode | mnecode | mnecode | varchar2(50) |
| 30 | name | name | name | varchar2(300) | √ |
| 31 | name2 | name2 | name2 | varchar2(300) |
| 32 | name3 | name3 | name3 | varchar2(300) |
| 33 | name4 | name4 | name4 | varchar2(300) |
| 34 | name5 | name5 | name5 | varchar2(300) |
| 35 | name6 | name6 | name6 | varchar2(300) |
| 36 | pk_areacl | pk_areacl | pk_areacl | varchar2(20) |  |  | '~' |
| 37 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |  |  | '~' |
| 38 | pk_country | pk_country | pk_country | varchar2(20) |  |  | '~' |
| 39 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 40 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 41 | pk_format | pk_format | pk_format | varchar2(20) |  |  | '~' |
| 42 | pk_group | pk_group | pk_group | char(20) | √ |
| 43 | pk_oldsupplier | pk_oldsupplier | pk_oldsupplier | char(20) | √ |  | '~' |
| 44 | pk_org | pk_org | pk_org | char(20) | √ |
| 45 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) | √ |  | '~' |
| 46 | pk_supplierclass | pk_supplierclass | pk_supplierclass | char(20) | √ |
| 47 | pk_supplier_main | pk_supplier_main | pk_supplier_main | varchar2(20) |  |  | '~' |
| 48 | pk_supplier_pf | pk_supplier_pf | pk_supplier_pf | char(20) |
| 49 | pk_suptaxes | pk_suptaxes | pk_suptaxes | varchar2(20) |
| 50 | pk_timezone | pk_timezone | pk_timezone | varchar2(20) |  |  | '~' |
| 51 | registerfund | registerfund | registerfund | number(14, 2) |
| 52 | shortname | shortname | shortname | varchar2(300) |
| 53 | source | source | source | number(38, 0) | √ |  | 0 |
| 54 | supprop | supprop | supprop | number(38, 0) | √ |  | 0 |
| 55 | supstate | supstate | supstate | number(38, 0) |  |  | 1 |
| 56 | taxpayerid | taxpayerid | taxpayerid | varchar2(20) |
| 57 | tel1 | tel1 | tel1 | varchar2(50) |
| 58 | tel2 | tel2 | tel2 | varchar2(50) |
| 59 | tel3 | tel3 | tel3 | varchar2(50) |
| 60 | trade | trade | trade | varchar2(20) |  |  | '~' |
| 61 | updatetime | updatetime | updatetime | char(19) |
| 62 | url | url | url | varchar2(60) |
| 63 | vatcode | vatcode | vatcode | varchar2(50) |
| 64 | zipcode | zipcode | zipcode | char(6) |
| 65 | def1 | def1 | def1 | varchar2(101) |
| 66 | def2 | def2 | def2 | varchar2(101) |
| 67 | def3 | def3 | def3 | varchar2(101) |
| 68 | def4 | def4 | def4 | varchar2(101) |
| 69 | def5 | def5 | def5 | varchar2(101) |
| 70 | def6 | def6 | def6 | varchar2(101) |
| 71 | def7 | def7 | def7 | varchar2(101) |
| 72 | def8 | def8 | def8 | varchar2(101) |
| 73 | def9 | def9 | def9 | varchar2(101) |
| 74 | def10 | def10 | def10 | varchar2(101) |
| 75 | def11 | def11 | def11 | varchar2(101) |
| 76 | def12 | def12 | def12 | varchar2(101) |
| 77 | def13 | def13 | def13 | varchar2(101) |
| 78 | def14 | def14 | def14 | varchar2(101) |
| 79 | def15 | def15 | def15 | varchar2(101) |
| 80 | def16 | def16 | def16 | varchar2(101) |
| 81 | def17 | def17 | def17 | varchar2(101) |
| 82 | def18 | def18 | def18 | varchar2(101) |
| 83 | def19 | def19 | def19 | varchar2(101) |
| 84 | def20 | def20 | def20 | varchar2(101) |
| 85 | def21 | def21 | def21 | varchar2(101) |
| 86 | def22 | def22 | def22 | varchar2(101) |
| 87 | def23 | def23 | def23 | varchar2(101) |
| 88 | def24 | def24 | def24 | varchar2(101) |
| 89 | def25 | def25 | def25 | varchar2(101) |
| 90 | def26 | def26 | def26 | varchar2(101) |
| 91 | def27 | def27 | def27 | varchar2(101) |
| 92 | def28 | def28 | def28 | varchar2(101) |
| 93 | def29 | def29 | def29 | varchar2(101) |
| 94 | def30 | def30 | def30 | varchar2(101) |
| 95 | creationtime | creationtime | creationtime | char(19) |
| 96 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 97 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 98 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 99 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 100 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |