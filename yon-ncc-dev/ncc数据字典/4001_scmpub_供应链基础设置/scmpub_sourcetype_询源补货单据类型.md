# |<<

**询源补货单据类型 (scmpub_sourcetype / nc.vo.scmf.sourcing.entity.SourBillTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5242.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sourcing | 询源主键 | pk_sourcing | varchar(20) | √ | 主键 (UFID) |
| 2 | transtype | 分销补货件默认补货单据 | transtype | varchar(2) |  | 分销件补货单据 (TransEnum) | 0 | 0=调入申请; |