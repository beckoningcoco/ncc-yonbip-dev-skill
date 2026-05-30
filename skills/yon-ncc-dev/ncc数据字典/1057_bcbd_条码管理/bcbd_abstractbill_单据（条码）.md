# |<<

**单据（条码） (bcbd_abstractbill / nc.vo.bcbd.abstractbill.AbstractBillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/250.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bill | 单据主表主键 | pk_bill | char(20) | √ | 主键 (UFID) |
| 2 | vbillcode | 单据号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 3 | billtype | 单据类型 | billtype | varchar(20) |  | 单据类型 (BilltypeVO) |