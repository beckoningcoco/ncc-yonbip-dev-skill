# |<<

**调剂回单明细 (cfbm_redeployback_b / nc.vo.cfbm.redeployback.FbRedeployBackBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1427.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_redeployback_b | 主键 | pk_redeployback_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 4 | pk_org_v | 资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 5 | vrowno | 行号 | vrowno | varchar(50) |  | 字符串 (String) |
| 6 | pk_register | 票据编号 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 7 | fbmbillno | 票据编号 | fbmbillno | varchar(50) |  | 字符串 (String) |
| 8 | pk_outorg | 调出组织 | pk_outorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | pk_outorg_v | 调出组织版本 | pk_outorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | pk_outorg_inneracc | 调出组织活期账户 | pk_outorg_inneracc | varchar(20) |  | 内部账户 (bd_accid) |
| 11 | pk_outpayorg_inneracc | 调出清算账户 | pk_outpayorg_inneracc | varchar(20) |  | 内部账户 (bd_accid) |
| 12 | billamount | 票据金额 | billamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | reckonamount | 清算金额 | reckonamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | reckoninterest | 清算利息 | reckoninterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | olcbillamount | 票据金额组织本币金额 | olcbillamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | glcbillamount | 票据金额集团本币金额 | glcbillamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | gllcbillamount | 票据金额全局本币金额 | gllcbillamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | olcreckonamount | 清算金额组织本币金额 | olcreckonamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | glcreckonamount | 清算金额集团本币金额 | glcreckonamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | gllcreckonamount | 清算金额全局本币金额 | gllcreckonamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | olcreckoninterest | 清算利息组织本币金额 | olcreckoninterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | glcreckoninterest | 清算利息集团本币金额 | glcreckoninterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | gllcreckoninterest | 清算利息全局本币金额 | gllcreckoninterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | baseinfostatus | 票据状态 | baseinfostatus | varchar(50) |  | 字符串 (String) |
| 25 | enddate | 到期日期 | enddate | char(19) |  | 日期 (UFDate) |
| 26 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |