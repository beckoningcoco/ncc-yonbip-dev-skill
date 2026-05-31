# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12865.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_datacost | pk_wa_datacost | pk_wa_datacost | char(20) | √ |
| 2 | billdate | billdate | billdate | char(10) |
| 3 | billmaker | billmaker | billmaker | char(20) |
| 4 | billno | billno | billno | varchar2(30) | √ |
| 5 | cperiod | cperiod | cperiod | char(2) | √ |
| 6 | currid | currid | currid | char(20) | √ |
| 7 | cyear | cyear | cyear | char(4) | √ |
| 8 | pk_billtype | pk_billtype | pk_billtype | varchar2(2) |
| 9 | pk_clerkclass | pk_clerkclass | pk_clerkclass | char(20) |
| 10 | pk_corp | pk_corp | pk_corp | char(4) | √ |
| 11 | pk_deptdoc | pk_deptdoc | pk_deptdoc | char(20) | √ |
| 12 | pk_psnbasdoc | pk_psnbasdoc | pk_psnbasdoc | char(20) |
| 13 | pk_psncl | pk_psncl | pk_psncl | char(20) | √ |
| 14 | pk_psndoc | pk_psndoc | pk_psndoc | char(20) | √ |
| 15 | pk_wa_amotype | pk_wa_amotype | pk_wa_amotype | char(20) | √ |
| 16 | pk_wa_class | pk_wa_class | pk_wa_class | char(20) | √ |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |