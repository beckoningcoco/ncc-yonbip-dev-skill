# |<<

**银行授信及使用 (batm_bankprotocol / nc.vo.batm.ccvo.BankprotocolVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/208.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bankprotocol | 主键 | pk_bankprotocol | char(20) | √ | 主键 (UFID) |
| 2 | ctrlmethod | 控制方式 | ctrlmethod | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 4 | pk_org | 财务组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 5 | protocolcode | 协议编码 | protocolcode | varchar(50) |  | 字符串 (String) |
| 6 | protocoltype | 协议类型 | protocoltype | varchar(50) |  | 字符串 (String) |
| 7 | pk_creditbank | 授信银行 | pk_creditbank | varchar(50) |  | 字符串 (String) |
| 8 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 9 | cctype | 授信类别 | cctype | varchar(50) |  | 字符串 (String) |
| 10 | quotaorg | 授信额度使用单位 | quotaorg | varchar(50) |  | 字符串 (String) |
| 11 | cdtlnamt | 授信额度 | cdtlnamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | olccdtlnamt | 组织本币授信额度 | olccdtlnamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | glccdtlnamt | 集团本币授信额度 | glccdtlnamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | gllccdtlnamt | 全局本币授信额度 | gllccdtlnamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | appusdcdtlnamt | 已使用授信额度 | appusdcdtlnamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | olcappusdcdtlnamt | 组织本币已使用授信额度 | olcappusdcdtlnamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | glcappusdcdtlnamt | 集团本币已使用授信额度 | glcappusdcdtlnamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | gllcappusdcdtlnamt | 全局本币已使用授信额度 | gllcappusdcdtlnamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | availcdtlnamt | 未使用授信额度 | availcdtlnamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | olcavailcdtlnamt | 组织本币未使用授信额度 | olcavailcdtlnamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | glcavailcdtlnamt | 集团本币未使用授信额度 | glcavailcdtlnamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | gllcavailcdtlnamt | 全局本币未使用授信额度 | gllcavailcdtlnamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | billmakedate | 制单日期 | billmakedate | char(19) |  | 日期 (UFDate) |
| 24 | begindate | 起始日期 | begindate | varchar(50) |  | 字符串 (String) |
| 25 | enddate | 结束日期 | enddate | varchar(50) |  | 字符串 (String) |
| 26 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |