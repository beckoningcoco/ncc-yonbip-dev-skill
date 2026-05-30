# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10792.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stockps_fd | pk_stockps_fd | pk_stockps_fd | char(20) | √ |
| 2 | ndistbymny | ndistbymny | ndistbymny | number(28, 8) |
| 3 | ndistbynum | ndistbynum | ndistbynum | number(28, 8) |
| 4 | ndistmny | ndistmny | ndistmny | number(28, 8) |
| 5 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |
| 6 | pk_distbybill | pk_distbybill | pk_distbybill | varchar2(20) |
| 7 | pk_distbybill_b | pk_distbybill_b | pk_distbybill_b | varchar2(20) |
| 8 | pk_iasrc_b | pk_iasrc_b | pk_iasrc_b | varchar2(20) |
| 9 | pk_stockps_fee | pk_stockps_fee | pk_stockps_fee | char(20) | √ |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |