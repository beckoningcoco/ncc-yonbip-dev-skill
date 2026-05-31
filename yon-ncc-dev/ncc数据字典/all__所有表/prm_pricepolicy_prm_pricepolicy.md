# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10833.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pricepolicy | pk_pricepolicy | pk_pricepolicy | char(20) | √ |
| 2 | bpromotepriceflag | bpromotepriceflag | bpromotepriceflag | char(1) |
| 3 | bstopedflag | bstopedflag | bstopedflag | char(1) |
| 4 | cpricetypeid | cpricetypeid | cpricetypeid | varchar2(20) |
| 5 | csrcpricepolicyid | csrcpricepolicyid | csrcpricepolicyid | varchar2(20) |  |  | '~' |
| 6 | csrcsaleorgid | csrcsaleorgid | csrcsaleorgid | varchar2(20) |  |  | '~' |
| 7 | fbasediscountflag | fbasediscountflag | fbasediscountflag | number(38, 0) |  |  | 1 |
| 8 | fbatchlevelflag | fbatchlevelflag | fbatchlevelflag | char(1) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 10 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 11 | pk_priceprocess | pk_priceprocess | pk_priceprocess | varchar2(20) |  |  | '~' |
| 12 | pk_tariffdef | pk_tariffdef | pk_tariffdef | varchar2(20) |  |  | '~' |
| 13 | vcode | vcode | vcode | varchar2(30) |
| 14 | vname | vname | vname | varchar2(114) |
| 15 | vname2 | vname2 | vname2 | varchar2(114) |
| 16 | vname3 | vname3 | vname3 | varchar2(114) |
| 17 | vname4 | vname4 | vname4 | varchar2(114) |
| 18 | vname5 | vname5 | vname5 | varchar2(114) |
| 19 | vname6 | vname6 | vname6 | varchar2(114) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |