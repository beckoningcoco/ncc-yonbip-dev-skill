# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10839.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tariffdef | pk_tariffdef | pk_tariffdef | char(20) | √ |
| 2 | csrcsaleorgid | csrcsaleorgid | csrcsaleorgid | varchar2(20) |
| 3 | csrctariffdefid | csrctariffdefid | csrctariffdefid | varchar2(20) |
| 4 | dcreatedate | dcreatedate | dcreatedate | char(19) | √ |
| 5 | dimensionposinfo | dimensionposinfo | dimensionposinfo | varchar2(100) |
| 6 | fbalatypeflag | fbalatypeflag | fbalatypeflag | number(38, 0) |  |  | 3 |
| 7 | fchanneltypeflag | fchanneltypeflag | fchanneltypeflag | number(38, 0) |  |  | 3 |
| 8 | fcurrencyflag | fcurrencyflag | fcurrencyflag | number(38, 0) |  |  | 2 |
| 9 | fcustclassflag | fcustclassflag | fcustclassflag | number(38, 0) |  |  | 3 |
| 10 | fcustomerflag | fcustomerflag | fcustomerflag | number(38, 0) |  |  | 3 |
| 11 | fcustsaleclassflag | fcustsaleclassflag | fcustsaleclassflag | number(38, 0) |  |  | 3 |
| 12 | fdefaultunitflag | fdefaultunitflag | fdefaultunitflag | number(38, 0) |
| 13 | ffree1flag | ffree1flag | ffree1flag | number(38, 0) |
| 14 | ffree2flag | ffree2flag | ffree2flag | number(38, 0) |
| 15 | ffree3flag | ffree3flag | ffree3flag | number(38, 0) |
| 16 | ffree4flag | ffree4flag | ffree4flag | number(38, 0) |
| 17 | ffree5flag | ffree5flag | ffree5flag | number(38, 0) |
| 18 | ffree6flag | ffree6flag | ffree6flag | number(38, 0) |
| 19 | ffree7flag | ffree7flag | ffree7flag | number(38, 0) |
| 20 | ffree8flag | ffree8flag | ffree8flag | number(38, 0) |
| 21 | ffree9flag | ffree9flag | ffree9flag | number(38, 0) |
| 22 | ffree10flag | ffree10flag | ffree10flag | number(38, 0) |
| 23 | finvclassflag | finvclassflag | finvclassflag | number(38, 0) |  |  | 3 |
| 24 | finventoryflag | finventoryflag | finventoryflag | number(38, 0) |  |  | 2 |
| 25 | finvsaleclassflag | finvsaleclassflag | finvsaleclassflag | number(38, 0) |  |  | 3 |
| 26 | fqualitylevelflag | fqualitylevelflag | fqualitylevelflag | number(38, 0) |  |  | 3 |
| 27 | freceiveareaflag | freceiveareaflag | freceiveareaflag | number(38, 0) |  |  | 3 |
| 28 | fsaleordertypeflag | fsaleordertypeflag | fsaleordertypeflag | number(38, 0) |
| 29 | fsendtypeflag | fsendtypeflag | fsendtypeflag | number(38, 0) |
| 30 | funitflag | funitflag | funitflag | number(38, 0) |  |  | 2 |
| 31 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 32 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 33 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 34 | pk_unit | pk_unit | pk_unit | varchar2(20) |  |  | '~' |
| 35 | vcode | vcode | vcode | varchar2(30) | √ |
| 36 | vname | vname | vname | varchar2(114) | √ |
| 37 | vname2 | vname2 | vname2 | varchar2(114) |
| 38 | vname3 | vname3 | vname3 | varchar2(114) |
| 39 | vname4 | vname4 | vname4 | varchar2(114) |
| 40 | vname5 | vname5 | vname5 | varchar2(114) |
| 41 | vname6 | vname6 | vname6 | varchar2(114) |
| 42 | creator | creator | creator | varchar2(20) | √ |
| 43 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 44 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |