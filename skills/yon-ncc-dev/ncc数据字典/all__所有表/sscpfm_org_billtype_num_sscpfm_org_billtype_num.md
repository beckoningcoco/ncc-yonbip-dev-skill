# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11844.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_org_billtype_num | pk_org_billtype_num | pk_org_billtype_num | varchar2(50) | √ |
| 2 | num_date | num_date | num_date | char(19) |
| 3 | num_deal | num_deal | num_deal | number(38, 0) |
| 4 | num_receive | num_receive | num_receive | number(38, 0) |
| 5 | pk_billtype | pk_billtype | pk_billtype | varchar2(1024) |
| 6 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(1024) |
| 7 | pk_org | pk_org | pk_org | varchar2(1024) |
| 8 | sscunit | sscunit | sscunit | varchar2(1024) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |