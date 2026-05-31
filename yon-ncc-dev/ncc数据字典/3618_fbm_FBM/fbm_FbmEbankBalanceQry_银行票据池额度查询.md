# |<<

**银行票据池额度查询 (fbm_FbmEbankBalanceQry / nc.vo.pfbm.efbm.fbmebankbalanceqry.FBMEbankBalanceQryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2135.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebank_balance | 主键 | pk_ebank_balance | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | banktype | 银行类型 | banktype | varchar(60) |  | 字符串 (String) |
| 4 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 5 | billnumber | 票据池编号 | billnumber | varchar(50) |  | 字符串 (String) |
| 6 | usedquota | 已使用额度 | usedquota | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | allocatedquota | 现已分配额度 | allocatedquota | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | pledgequota | 质押票据额度 | pledgequota | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | margin | 保证金额度 | margin | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | availablequota | 可用额度 | availablequota | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | curdate | 余额日期 | curdate | varchar(19) |  | 日期(开始) (UFDateBegin) |
| 12 | fbmdef1 | 自定义项1 | fbmdef1 | varchar(101) |  | 自定义项 (Custom) |
| 13 | fbmdef2 | 自定义项2 | fbmdef2 | varchar(101) |  | 自定义项 (Custom) |
| 14 | fbmdef3 | 自定义项3 | fbmdef3 | varchar(101) |  | 自定义项 (Custom) |
| 15 | fbmdef4 | 自定义项4 | fbmdef4 | varchar(101) |  | 自定义项 (Custom) |
| 16 | fbmdef5 | 自定义项5 | fbmdef5 | varchar(101) |  | 自定义项 (Custom) |
| 17 | fbmdef6 | 自定义项6 | fbmdef6 | varchar(101) |  | 自定义项 (Custom) |
| 18 | fbmdef7 | 自定义项7 | fbmdef7 | varchar(101) |  | 自定义项 (Custom) |
| 19 | fbmdef8 | 自定义项8 | fbmdef8 | varchar(101) |  | 自定义项 (Custom) |
| 20 | fbmdef9 | 自定义项9 | fbmdef9 | varchar(101) |  | 自定义项 (Custom) |
| 21 | fbmdef10 | 自定义项10 | fbmdef10 | varchar(101) |  | 自定义项 (Custom) |