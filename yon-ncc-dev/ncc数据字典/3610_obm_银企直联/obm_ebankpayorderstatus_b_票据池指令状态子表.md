# |<<

**票据池指令状态子表 (obm_ebankpayorderstatus_b / nc.vo.obm.ebankpayorderstatus.Ebankpayorderstatus_bVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3921.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crowno | 行号 | crowno | varchar(50) |  | 字符串 (String) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | payordertype | 支付指令类型 | payordertype | int |  | 支付指令类型 (payordertype) |  | 0=收票登记; |