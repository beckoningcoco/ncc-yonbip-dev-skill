# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7748.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_recvplan | pk_ct_recvplan | pk_ct_recvplan | char(20) | √ |
| 2 | bpreflag | bpreflag | bpreflag | char(1) |
| 3 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |
| 4 | dbegindate | dbegindate | dbegindate | char(19) |
| 5 | denddate | denddate | denddate | char(19) |
| 6 | dinsideenddate | dinsideenddate | dinsideenddate | char(19) |
| 7 | feffdatetype | feffdatetype | feffdatetype | varchar2(50) |
| 8 | iaccounttermno | iaccounttermno | iaccounttermno | number(38, 0) |
| 9 | iitermdays | iitermdays | iitermdays | number(38, 0) |
| 10 | norigmny | norigmny | norigmny | number(28, 8) |
| 11 | nrate | nrate | nrate | number(28, 8) |
| 12 | ntotalorigmny | ntotalorigmny | ntotalorigmny | number(28, 8) |
| 13 | pk_ct_sale | pk_ct_sale | pk_ct_sale | char(20) | √ |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |