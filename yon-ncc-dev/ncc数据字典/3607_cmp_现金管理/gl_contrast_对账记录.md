# |<<

**对账记录 (gl_contrast / nc.vo.cmp.contrast.contrast)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2370.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrast | 银行对账Oid | pk_contrast | char(20) | √ | 主键 (UFID) |
| 2 | pk_contrastaccount | 对帐账户Oid | pk_contrastaccount | varchar(20) |  | 对账账户实体 (contrastaccount) |
| 3 | fk_detail | 分录Oid | fk_detail | char(20) |  | 主键 (UFID) |
| 4 | pk_bankreceipt | 对帐单Oid | pk_bankreceipt | varchar(20) |  | 银行对账单 (bankreceipt) |
| 5 | contrastcode | 对帐序号 | contrastcode | char(20) |  | 主键 (UFID) |
| 6 | contrastdate | 对帐日期 | contrastdate | char(19) |  | 日期 (UFDate) |
| 7 | cavdate | 核销日期 | cavdate | char(19) |  | 日期 (UFDate) |
| 8 | corpdate | 分录日期 | corpdate | char(19) |  | 日期 (UFDate) |
| 9 | memo | 备注 | memo | varchar(181) |  | 主键 (UFID) |
| 10 | contrastman | 勾对人 | contrastman | varchar(50) |  | 字符串 (String) |
| 11 | cavman | 核销人 | cavman | varchar(50) |  | 字符串 (String) |
| 12 | memo1 | 备用1 | memo1 | varchar(100) |  | 字符串 (String) |
| 13 | memo2 | 备用2 | memo2 | varchar(100) |  | 字符串 (String) |
| 14 | memo3 | 备用3 | memo3 | varchar(100) |  | 字符串 (String) |
| 15 | batchnumber | 批次号 | batchnumber | varchar(14) |  | 字符串 (String) |
| 16 | money | 金额 | money | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | isdebit | 是否借方 | isdebit | char(1) |  | 布尔类型 (UFBoolean) |