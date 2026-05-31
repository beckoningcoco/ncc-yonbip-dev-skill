# |<<

**担保信息 (cdmc_repprcpl_grt / nc.vo.cdmc.cdm.repayprcpl.RepayPrcplGrtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1402.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repprcpl_grt | 主键 | pk_repprcpl_grt | char(20) | √ | 主键 (UFID) |
| 2 | pk_repayprcpl | 还本主表主键 | pk_repayprcpl | char(20) |  | 主键 (UFID) |
| 3 | pk_grtcontract | 担保合同 | pk_grtcontract | varchar(20) |  | 担保合同 (GuaContractVO) |
| 4 | releasegrtmny | 释放担保金额 | releasegrtmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | releasegrtolcmny | 释放担保组织本币 | releasegrtolcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | releasegrtglcmny | 释放担保集团本币 | releasegrtglcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | releasegrtgllcmny | 释放担保全局本币 | releasegrtgllcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | pk_grtcurrtype | 担保币种 | pk_grtcurrtype | varchar(20) |  | 币种 (currtype) |
| 9 | grtratio | 担保比例% | grtratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | contractstartdate | 合同开始日期 | contractstartdate | char(19) |  | 日期 (UFDate) |
| 11 | contractenddate | 合同结束日期 | contractenddate | char(19) |  | 日期 (UFDate) |
| 12 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |