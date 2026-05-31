# |<<

**清算回单明细 (cfbm_reckonback_b / nc.vo.cfbm.reckonback.ReckonBackBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1423.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reckonback_b | 清算回单明细主键 | pk_reckonback_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_register | 票据编号 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 3 | fbmbillno | 票据编号 | fbmbillno | varchar(50) |  | 字符串 (String) |
| 4 | fbmbilltype | 票据类型 | fbmbilltype | varchar(20) |  | 票据类型 (notetype) |
| 5 | srcbusiness | 清算来源业务 | srcbusiness | int |  | 来源业务 (SrcBusiness) |  | 1=内部转让; |