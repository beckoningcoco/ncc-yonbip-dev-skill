# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8086.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | amount | amount | amount | number(28, 8) |
| 2 | assid | assid | assid | varchar2(20) |
| 3 | creditamount | creditamount | creditamount | number(28, 8) |
| 4 | creditquantity | creditquantity | creditquantity | number(28, 8) |
| 5 | debitamount | debitamount | debitamount | number(28, 8) |
| 6 | debitquantity | debitquantity | debitquantity | number(28, 8) |
| 7 | globallocal | globallocal | globallocal | number(28, 8) |
| 8 | globallocalcredit | globallocalcredit | globallocalcredit | number(28, 8) |
| 9 | globallocaldebit | globallocaldebit | globallocaldebit | number(28, 8) |
| 10 | grouplocal | grouplocal | grouplocal | number(28, 8) |
| 11 | grouplocalcredit | grouplocalcredit | grouplocalcredit | number(28, 8) |
| 12 | grouplocaldebit | grouplocaldebit | grouplocaldebit | number(28, 8) |
| 13 | istally | istally | istally | char(1) |
| 14 | orglocal | orglocal | orglocal | number(28, 8) |
| 15 | orglocalcredit | orglocalcredit | orglocalcredit | number(28, 8) |
| 16 | orglocaldebit | orglocaldebit | orglocaldebit | number(28, 8) |
| 17 | periodv | periodv | periodv | char(2) |
| 18 | pk_accsubj | pk_accsubj | pk_accsubj | char(20) |
| 19 | pk_corp | pk_corp | pk_corp | char(20) |
| 20 | pk_currtype | pk_currtype | pk_currtype | char(20) |
| 21 | pk_fiorgbook | pk_fiorgbook | pk_fiorgbook | char(20) |
| 22 | quantity | quantity | quantity | number(28, 8) |
| 23 | yearv | yearv | yearv | char(4) |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |