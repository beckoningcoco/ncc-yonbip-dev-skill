# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7552.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | associateflag | associateflag | associateflag | char(1) |
| 2 | bankaccdate | bankaccdate | bankaccdate | char(19) |
| 3 | bankaccflag | bankaccflag | bankaccflag | varchar2(50) |
| 4 | bankaccount | bankaccount | bankaccount | varchar2(50) |
| 5 | bankname | bankname | bankname | varchar2(100) |
| 6 | bankrelated_code | bankrelated_code | bankrelated_code | varchar2(100) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | claimdate | claimdate | claimdate | char(19) |
| 9 | consignagreement | consignagreement | consignagreement | varchar2(20) |  |  | '~' |
| 10 | creditorreference | creditorreference | creditorreference | varchar2(200) |
| 11 | direction | direction | direction | varchar2(50) |
| 12 | domain | domain | domain | varchar2(20) |  |  | '~' |
| 13 | doperatedate | doperatedate | doperatedate | char(19) |
| 14 | doperatetime | doperatetime | doperatetime | char(19) |
| 15 | failurereason | failurereason | failurereason | varchar2(181) |
| 16 | family | family | family | varchar2(20) |  |  | '~' |
| 17 | generateflag | generateflag | generateflag | varchar2(50) |
| 18 | glcmoney | glcmoney | glcmoney | number(28, 8) |
| 19 | glcrate | glcrate | glcrate | number(15, 8) |
| 20 | gllcmoney | gllcmoney | gllcmoney | number(28, 8) |
| 21 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 22 | infodate | infodate | infodate | char(19) |
| 23 | infodatetime | infodatetime | infodatetime | char(8) |
| 24 | invoiceno | invoiceno | invoiceno | varchar2(140) |
| 25 | lowerbilltype | lowerbilltype | lowerbilltype | varchar2(50) |
| 26 | ly_money | ly_money | ly_money | number(28, 8) |  |  | 0 |
| 27 | memo | memo | memo | varchar2(181) |
| 28 | moneyy | moneyy | moneyy | number(28, 8) |
| 29 | note_no | note_no | note_no | varchar2(35) |
| 30 | olcmoney | olcmoney | olcmoney | number(28, 8) |
| 31 | olcrate | olcrate | olcrate | number(15, 8) |
| 32 | oppbankaccount | oppbankaccount | oppbankaccount | varchar2(50) |
| 33 | oppinout | oppinout | oppinout | varchar2(15) |
| 34 | oppunitname | oppunitname | oppunitname | varchar2(100) |
| 35 | oppunittype | oppunittype | oppunittype | varchar2(15) |
| 36 | payreason | payreason | payreason | varchar2(181) |
| 37 | pk_acc_sub | pk_acc_sub | pk_acc_sub | varchar2(20) |  |  | '~' |
| 38 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 39 | pk_bank | pk_bank | pk_bank | varchar2(20) |  |  | '~' |
| 40 | pk_bankacc | pk_bankacc | pk_bankacc | varchar2(20) |  |  | '~' |
| 41 | pk_bankaccer | pk_bankaccer | pk_bankaccer | varchar2(20) |  |  | '~' |
| 42 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |  |  | '~' |
| 43 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 44 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(50) |
| 45 | pk_claimer | pk_claimer | pk_claimer | varchar2(20) |  |  | '~' |
| 46 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 47 | pk_fundtype | pk_fundtype | pk_fundtype | varchar2(20) |  |  | '~' |
| 48 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 49 | pk_informer | pk_informer | pk_informer | varchar2(20) |  |  | '~' |
| 50 | pk_informerrelease | pk_informerrelease | pk_informerrelease | char(20) | √ |
| 51 | pk_informorg | pk_informorg | pk_informorg | varchar2(20) |  |  | '~' |
| 52 | pk_informorg_v | pk_informorg_v | pk_informorg_v | varchar2(20) |  |  | '~' |
| 53 | pk_lower | pk_lower | pk_lower | varchar2(21) |
| 54 | pk_operator | pk_operator | pk_operator | varchar2(20) |  |  | '~' |
| 55 | pk_oppacc | pk_oppacc | pk_oppacc | varchar2(50) |
| 56 | pk_oppacc_sub | pk_oppacc_sub | pk_oppacc_sub | varchar2(21) |
| 57 | pk_oppbank | pk_oppbank | pk_oppbank | varchar2(50) |
| 58 | pk_oppbanktype | pk_oppbanktype | pk_oppbanktype | varchar2(20) |  |  | '~' |
| 59 | pk_oppunit | pk_oppunit | pk_oppunit | varchar2(50) |
| 60 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 61 | pk_receiver | pk_receiver | pk_receiver | varchar2(20) |  |  | '~' |
| 62 | pk_releaser | pk_releaser | pk_releaser | varchar2(20) |  |  | '~' |
| 63 | pk_src | pk_src | pk_src | varchar2(21) |
| 64 | pk_vouch | pk_vouch | pk_vouch | varchar2(20) |  |  | '~' |
| 65 | recpay_fundorg | recpay_fundorg | recpay_fundorg | varchar2(20) |  |  | '~' |
| 66 | recpay_fundplansubj | recpay_fundplansubj | recpay_fundplansubj | varchar2(20) |  |  | '~' |
| 67 | recpay_inneracc | recpay_inneracc | recpay_inneracc | varchar2(20) |  |  | '~' |
| 68 | recpay_org | recpay_org | recpay_org | varchar2(20) |  |  | '~' |
| 69 | recpay_orgplansubj | recpay_orgplansubj | recpay_orgplansubj | varchar2(20) |  |  | '~' |
| 70 | releasedate | releasedate | releasedate | char(19) |
| 71 | release_org | release_org | release_org | varchar2(20) |  |  | '~' |
| 72 | sddreversalflag | sddreversalflag | sddreversalflag | char(1) |
| 73 | src_flag | src_flag | src_flag | varchar2(50) |
| 74 | structuredstandard | structuredstandard | structuredstandard | varchar2(50) |
| 75 | styleflag | styleflag | styleflag | varchar2(2) |
| 76 | subfamily | subfamily | subfamily | varchar2(20) |  |  | '~' |
| 77 | syscode | syscode | syscode | varchar2(50) |
| 78 | taxrate | taxrate | taxrate | number(28, 8) |
| 79 | transerial | transerial | transerial | varchar2(50) |
| 80 | vbillno | vbillno | vbillno | varchar2(50) |
| 81 | vouchdate | vouchdate | vouchdate | char(19) |
| 82 | vouchflag | vouchflag | vouchflag | varchar2(50) |
| 83 | creationtime | creationtime | creationtime | char(19) |
| 84 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 85 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 86 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 87 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 88 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |