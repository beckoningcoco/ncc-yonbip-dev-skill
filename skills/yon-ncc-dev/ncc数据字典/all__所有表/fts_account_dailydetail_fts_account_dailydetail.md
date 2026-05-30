# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8381.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dailydetail | pk_dailydetail | pk_dailydetail | char(20) | √ |
| 2 | busdate | busdate | busdate | char(10) |
| 3 | creditnum | creditnum | creditnum | number(38, 0) |
| 4 | debitnum | debitnum | debitnum | number(38, 0) |
| 5 | detailtype | detailtype | detailtype | varchar2(30) |
| 6 | glcinmoney | glcinmoney | glcinmoney | number(28, 8) |
| 7 | glcoutmoney | glcoutmoney | glcoutmoney | number(28, 8) |
| 8 | glcrealinmoney | glcrealinmoney | glcrealinmoney | number(28, 8) |
| 9 | glcrealoutmoney | glcrealoutmoney | glcrealoutmoney | number(28, 8) |
| 10 | gllcinmoney | gllcinmoney | gllcinmoney | number(28, 8) |
| 11 | gllcoutmoney | gllcoutmoney | gllcoutmoney | number(28, 8) |
| 12 | gllcrealinmoney | gllcrealinmoney | gllcrealinmoney | number(28, 8) |
| 13 | gllcrealoutmoney | gllcrealoutmoney | gllcrealoutmoney | number(28, 8) |
| 14 | inmoney | inmoney | inmoney | number(28, 8) |
| 15 | olcinmoney | olcinmoney | olcinmoney | number(28, 8) |
| 16 | olcoutmoney | olcoutmoney | olcoutmoney | number(28, 8) |
| 17 | olcrealinmoney | olcrealinmoney | olcrealinmoney | number(28, 8) |
| 18 | olcrealoutmoney | olcrealoutmoney | olcrealoutmoney | number(28, 8) |
| 19 | outmoney | outmoney | outmoney | number(28, 8) |
| 20 | pk_account | pk_account | pk_account | varchar2(20) |  |  | '~' |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 24 | realinmoney | realinmoney | realinmoney | number(28, 8) |
| 25 | realinnum | realinnum | realinnum | number(38, 0) |
| 26 | realoutmoney | realoutmoney | realoutmoney | number(28, 8) |
| 27 | realoutnum | realoutnum | realoutnum | number(38, 0) |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |