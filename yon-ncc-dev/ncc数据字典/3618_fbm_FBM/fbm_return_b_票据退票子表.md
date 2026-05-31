# |<<

**票据退票子表 (fbm_return_b / nc.vo.fbm.returnbill.ReturnBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2156.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_return_b | 主键 | pk_return_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_return | 主表主键 | pk_return | char(20) |  | 主键 (UFID) |
| 3 | pk_register | 登记表主键 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 4 | fbmbillno | 票据编号 | fbmbillno | varchar(100) |  | 主键 (UFID) |