# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7541.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashaccrule | pk_cashaccrule | pk_cashaccrule | char(20) | √ |
| 2 | highmnycontrolsche | highmnycontrolsche | highmnycontrolsche | varchar2(10) |
| 3 | highmoney | highmoney | highmoney | number(28, 8) |
| 4 | ishighmnycontrol | ishighmnycontrol | ishighmnycontrol | char(1) |
| 5 | islowmnycontrol | islowmnycontrol | islowmnycontrol | char(1) |
| 6 | lowmnycontrolsche | lowmnycontrolsche | lowmnycontrolsche | varchar2(10) |
| 7 | lowmoney | lowmoney | lowmoney | number(28, 8) |
| 8 | pk_cashaccount | pk_cashaccount | pk_cashaccount | varchar2(20) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |