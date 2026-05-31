# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8453.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrast | pk_contrast | pk_contrast | char(20) | √ |
| 2 | batchnumber | batchnumber | batchnumber | varchar2(14) |
| 3 | cavdate | cavdate | cavdate | char(19) |
| 4 | cavman | cavman | cavman | varchar2(50) |
| 5 | contrastcode | contrastcode | contrastcode | char(20) |
| 6 | contrastdate | contrastdate | contrastdate | char(19) |
| 7 | contrastman | contrastman | contrastman | varchar2(50) |
| 8 | corpdate | corpdate | corpdate | char(19) |
| 9 | fk_detail | fk_detail | fk_detail | char(20) |
| 10 | isdebit | isdebit | isdebit | char(1) |
| 11 | memo | memo | memo | varchar2(272) |
| 12 | memo1 | memo1 | memo1 | varchar2(150) |
| 13 | memo2 | memo2 | memo2 | varchar2(150) |
| 14 | memo3 | memo3 | memo3 | varchar2(150) |
| 15 | money | money | money | number(28, 8) |
| 16 | pk_accountlink | pk_accountlink | pk_accountlink | varchar2(20) |
| 17 | pk_ass | pk_ass | pk_ass | varchar2(20) |
| 18 | pk_bankreceipt | pk_bankreceipt | pk_bankreceipt | varchar2(20) |  |  | '~' |
| 19 | pk_contrastaccount | pk_contrastaccount | pk_contrastaccount | varchar2(20) |  |  | '~' |
| 20 | pk_subject | pk_subject | pk_subject | varchar2(20) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |