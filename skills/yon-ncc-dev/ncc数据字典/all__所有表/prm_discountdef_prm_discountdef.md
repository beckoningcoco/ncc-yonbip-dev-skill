# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10821.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_basediscountdef | pk_basediscountdef | pk_basediscountdef | char(20) | √ |
| 2 | cbelongsaleorgid | cbelongsaleorgid | cbelongsaleorgid | varchar2(20) | √ |
| 3 | csrcdiscountdefid | csrcdiscountdefid | csrcdiscountdefid | varchar2(20) |
| 4 | csrcsaleorgid | csrcsaleorgid | csrcsaleorgid | varchar2(20) |  |  | '~' |
| 5 | dcreatedate | dcreatedate | dcreatedate | char(19) | √ |
| 6 | dimensionposinfo | dimensionposinfo | dimensionposinfo | varchar2(100) |
| 7 | faffectflag | faffectflag | faffectflag | number(38, 0) | √ |
| 8 | fbalatypeflag | fbalatypeflag | fbalatypeflag | number(38, 0) |
| 9 | fbasepriceaddflag | fbasepriceaddflag | fbasepriceaddflag | number(38, 0) |
| 10 | fbasepricefactorflag | fbasepricefactorflag | fbasepricefactorflag | number(38, 0) |
| 11 | fbasepriceflag | fbasepriceflag | fbasepriceflag | number(38, 0) |
| 12 | fbrandflag | fbrandflag | fbrandflag | number(38, 0) |
| 13 | fchanneltypeflag | fchanneltypeflag | fchanneltypeflag | number(38, 0) |
| 14 | fcurrencyflag | fcurrencyflag | fcurrencyflag | number(38, 0) |
| 15 | fcustclassflag | fcustclassflag | fcustclassflag | number(38, 0) |
| 16 | fcustomerflag | fcustomerflag | fcustomerflag | number(38, 0) |
| 17 | fcustsaleclassflag | fcustsaleclassflag | fcustsaleclassflag | number(38, 0) |
| 18 | ffree1flag | ffree1flag | ffree1flag | number(38, 0) |
| 19 | ffree2flag | ffree2flag | ffree2flag | number(38, 0) |
| 20 | ffree3flag | ffree3flag | ffree3flag | number(38, 0) |
| 21 | ffree4flag | ffree4flag | ffree4flag | number(38, 0) |
| 22 | ffree5flag | ffree5flag | ffree5flag | number(38, 0) |
| 23 | ffree6flag | ffree6flag | ffree6flag | number(38, 0) |
| 24 | ffree7flag | ffree7flag | ffree7flag | number(38, 0) |
| 25 | ffree8flag | ffree8flag | ffree8flag | number(38, 0) |
| 26 | ffree9flag | ffree9flag | ffree9flag | number(38, 0) |
| 27 | ffree10flag | ffree10flag | ffree10flag | number(38, 0) |
| 28 | finvclassflag | finvclassflag | finvclassflag | number(38, 0) |
| 29 | finventoryflag | finventoryflag | finventoryflag | number(38, 0) |
| 30 | finvsaleclassflag | finvsaleclassflag | finvsaleclassflag | number(38, 0) |
| 31 | fpriceflag | fpriceflag | fpriceflag | number(38, 0) |
| 32 | fprodlineflag | fprodlineflag | fprodlineflag | number(38, 0) |
| 33 | fqualitylevelflag | fqualitylevelflag | fqualitylevelflag | number(38, 0) |
| 34 | freceiveareaflag | freceiveareaflag | freceiveareaflag | number(38, 0) |
| 35 | fsaleordertypeflag | fsaleordertypeflag | fsaleordertypeflag | number(38, 0) |
| 36 | fsendtypeflag | fsendtypeflag | fsendtypeflag | number(38, 0) |
| 37 | funitflag | funitflag | funitflag | number(38, 0) |
| 38 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 39 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 40 | pk_tariffdef | pk_tariffdef | pk_tariffdef | varchar2(20) | √ |
| 41 | creator | creator | creator | varchar2(20) | √ |
| 42 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 43 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |