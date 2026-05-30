# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7550.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_informer | pk_informer | pk_informer | char(20) | √ |
| 2 | associateflag | associateflag | associateflag | char(1) |
| 3 | bankaccdate | bankaccdate | bankaccdate | char(19) |
| 4 | bankaccflag | bankaccflag | bankaccflag | varchar2(50) |
| 5 | bankaccount | bankaccount | bankaccount | varchar2(50) |
| 6 | bankname | bankname | bankname | varchar2(100) |
| 7 | bankrelated_code | bankrelated_code | bankrelated_code | varchar2(100) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | claimdate | claimdate | claimdate | char(19) |
| 10 | consignagreement | consignagreement | consignagreement | varchar2(20) |  |  | '~' |
| 11 | creditorreference | creditorreference | creditorreference | varchar2(200) |
| 12 | direction | direction | direction | varchar2(50) |
| 13 | domain | domain | domain | varchar2(20) |  |  | '~' |
| 14 | doperatedate | doperatedate | doperatedate | char(19) |
| 15 | doperatetime | doperatetime | doperatetime | char(19) |
| 16 | failurereason | failurereason | failurereason | varchar2(181) |
| 17 | family | family | family | varchar2(20) |  |  | '~' |
| 18 | generateflag | generateflag | generateflag | varchar2(50) |
| 19 | glcmoney | glcmoney | glcmoney | number(28, 8) |
| 20 | glcrate | glcrate | glcrate | number(15, 8) |
| 21 | gllcmoney | gllcmoney | gllcmoney | number(28, 8) |
| 22 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 23 | infodate | infodate | infodate | char(19) |
| 24 | infodatetime | infodatetime | infodatetime | char(8) |
| 25 | invoiceno | invoiceno | invoiceno | varchar2(140) |
| 26 | lowerbilltype | lowerbilltype | lowerbilltype | varchar2(50) |
| 27 | memo | memo | memo | varchar2(181) |
| 28 | moneyy | moneyy | moneyy | number(28, 8) |
| 29 | note_no | note_no | note_no | varchar2(35) |
| 30 | olcmoney | olcmoney | olcmoney | number(28, 8) |
| 31 | olcrate | olcrate | olcrate | number(15, 8) |
| 32 | oper_flag | oper_flag | oper_flag | varchar2(50) |
| 33 | oppbankaccount | oppbankaccount | oppbankaccount | varchar2(50) |
| 34 | oppinout | oppinout | oppinout | varchar2(15) |
| 35 | oppunitname | oppunitname | oppunitname | varchar2(100) |
| 36 | oppunittype | oppunittype | oppunittype | varchar2(15) |
| 37 | payreason | payreason | payreason | varchar2(181) |
| 38 | pk_acc_sub | pk_acc_sub | pk_acc_sub | varchar2(20) |  |  | '~' |
| 39 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 40 | pk_bank | pk_bank | pk_bank | varchar2(20) |  |  | '~' |
| 41 | pk_bankacc | pk_bankacc | pk_bankacc | varchar2(20) |  |  | '~' |
| 42 | pk_bankaccer | pk_bankaccer | pk_bankaccer | varchar2(20) |  |  | '~' |
| 43 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |  |  | '~' |
| 44 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 45 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(50) |
| 46 | pk_claimer | pk_claimer | pk_claimer | varchar2(20) |  |  | '~' |
| 47 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 48 | pk_fundtype | pk_fundtype | pk_fundtype | varchar2(20) |  |  | '~' |
| 49 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 50 | pk_lower | pk_lower | pk_lower | varchar2(500) |
| 51 | pk_oppacc | pk_oppacc | pk_oppacc | varchar2(50) |
| 52 | pk_oppacc_sub | pk_oppacc_sub | pk_oppacc_sub | varchar2(21) |
| 53 | pk_oppbank | pk_oppbank | pk_oppbank | varchar2(50) |
| 54 | pk_oppbanktype | pk_oppbanktype | pk_oppbanktype | varchar2(20) |  |  | '~' |
| 55 | pk_oppunit | pk_oppunit | pk_oppunit | varchar2(50) |
| 56 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 57 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 58 | pk_src | pk_src | pk_src | varchar2(21) |
| 59 | pk_vouch | pk_vouch | pk_vouch | varchar2(20) |  |  | '~' |
| 60 | recpay_fundorg | recpay_fundorg | recpay_fundorg | varchar2(20) |  |  | '~' |
| 61 | recpay_fundplansubj | recpay_fundplansubj | recpay_fundplansubj | varchar2(20) |  |  | '~' |
| 62 | recpay_inneracc | recpay_inneracc | recpay_inneracc | varchar2(20) |  |  | '~' |
| 63 | recpay_org | recpay_org | recpay_org | varchar2(20) |  |  | '~' |
| 64 | recpay_orgplansubj | recpay_orgplansubj | recpay_orgplansubj | varchar2(20) |  |  | '~' |
| 65 | release_org | release_org | release_org | varchar2(20) |  |  | '~' |
| 66 | sddreversalflag | sddreversalflag | sddreversalflag | char(1) |
| 67 | structuredstandard | structuredstandard | structuredstandard | varchar2(50) |
| 68 | styleflag | styleflag | styleflag | varchar2(2) |
| 69 | subfamily | subfamily | subfamily | varchar2(20) |  |  | '~' |
| 70 | syscode | syscode | syscode | varchar2(50) |
| 71 | taxrate | taxrate | taxrate | number(28, 8) |
| 72 | transerial | transerial | transerial | varchar2(50) |
| 73 | usemoney | usemoney | usemoney | number(28, 8) |
| 74 | vbillno | vbillno | vbillno | varchar2(50) |
| 75 | vouchdate | vouchdate | vouchdate | char(19) |
| 76 | vouchflag | vouchflag | vouchflag | varchar2(50) |
| 77 | creationtime | creationtime | creationtime | char(19) |
| 78 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 79 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 80 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 81 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 82 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |