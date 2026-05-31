# |<<

**票据帐明细 (fbm_billacc_detail / nc.vo.fbm.billacc.BillAccDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2114.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billacc_detail | 主键 | pk_billacc_detail | char(20) | √ | 主键 (UFID) |
| 2 | pk_sourcebill | 来源票据pk | pk_sourcebill | varchar(20) |  | 票据登记 (fbm_register) |
| 3 | fbmbillno | 票据编号 | fbmbillno | varchar(50) |  | 字符串 (String) |
| 4 | billtype | 来源单据类型 | billtype | varchar(10) |  | 字符串 (String) |
| 5 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 6 | vbillno | 来源单据号 | vbillno | varchar(50) |  | 字符串 (String) |
| 7 | sfflag | 借贷标记 | sfflag | int |  | 整数 (Integer) |
| 8 | lendermoney | 贷方额度 | lendermoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | glllendermoney | 全局本币贷方额度 | glllendermoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | glclendermoney | 集团本币贷方额度 | glclendermoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | olclendermoney | 组织本币贷方额度 | olclendermoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | debitmoney | 借方额度 | debitmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | glldebitmoney | 全局本币借方额度 | glldebitmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | glcdebitmoney | 集团本币借方额度 | glcdebitmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | olcdebitmoney | 组织本币借方额度 | olcdebitmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | billclass | 票据大类 | billclass | int |  | 票据大类 (noteclass) |  | 1=支票; |