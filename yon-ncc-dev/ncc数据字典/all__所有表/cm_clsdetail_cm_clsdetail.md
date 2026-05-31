# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7602.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cclsdetailid | cclsdetailid | cclsdetailid | char(20) | √ |
| 2 | cmarcostclassid | cmarcostclassid | cmarcostclassid | varchar2(20) |  |  | '~' |
| 3 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 4 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 5 | cperiod | cperiod | cperiod | char(7) |
| 6 | dbusinessdate | dbusinessdate | dbusinessdate | char(19) |
| 7 | nbeginblncmoney | nbeginblncmoney | nbeginblncmoney | number(28, 8) |
| 8 | nbeginblncnum | nbeginblncnum | nbeginblncnum | number(20, 8) |
| 9 | nblncmoney | nblncmoney | nblncmoney | number(28, 8) |
| 10 | nblncnum | nblncnum | nblncnum | number(20, 8) |
| 11 | notherinmoney | notherinmoney | notherinmoney | number(28, 8) |
| 12 | notherinnum | notherinnum | notherinnum | number(20, 8) |
| 13 | notheroutmoney | notheroutmoney | notheroutmoney | number(28, 8) |
| 14 | notheroutnum | notheroutnum | notheroutnum | number(20, 8) |
| 15 | nproductinmoney | nproductinmoney | nproductinmoney | number(28, 8) |
| 16 | nproductinnum | nproductinnum | nproductinnum | number(20, 8) |
| 17 | nproductoutmoney | nproductoutmoney | nproductoutmoney | number(28, 8) |
| 18 | nproductoutnum | nproductoutnum | nproductoutnum | number(20, 8) |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 22 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 23 | vnote | vnote | vnote | varchar2(181) |
| 24 | creationtime | creationtime | creationtime | char(19) |
| 25 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 28 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |