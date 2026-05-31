# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12505.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ciphertext | ciphertext | ciphertext | varchar2(2000) |
| 2 | eu_status_ord | eu_status_ord | eu_status_ord | number(38, 0) |
| 3 | orginaltext | orginaltext | orginaltext | varchar2(4000) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |
| 5 | pk_ord | pk_ord | pk_ord | varchar2(20) |
| 6 | pk_ord_ca | pk_ord_ca | pk_ord_ca | varchar2(20) | √ |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |
| 8 | pk_psn_phy | pk_psn_phy | pk_psn_phy | varchar2(20) |
| 9 | publickey | publickey | publickey | blob |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |