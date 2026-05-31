# |<<

**结算付款协议 (pm_contr_bal_p / nc.vo.pcm.contractbalance.ContractBalancePayVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4434.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contr_bal_p | 结算付款协议主键 | pk_contr_bal_p | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(50) |  | 字符串 (String) |
| 6 | src_bill_code | 来源单据编码 | src_bill_code | varchar(50) |  | 字符串 (String) |
| 7 | src_billtype | 来源单据类型 | src_billtype | varchar(50) |  | 字符串 (String) |
| 8 | ntot_sched_mny | 累计进度款 | ntot_sched_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | bal_taxmny | 含税结算额 | bal_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | bal_dif_taxmny | 含税结算差异 | bal_dif_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 12 | bdef1 | 自定义项1 | bdef1 | varchar(101) |  | 自定义项 (Custom) |
| 13 | bdef2 | 自定义项2 | bdef2 | varchar(101) |  | 自定义项 (Custom) |
| 14 | bdef3 | 自定义项3 | bdef3 | varchar(101) |  | 自定义项 (Custom) |
| 15 | bdef4 | 自定义项4 | bdef4 | varchar(101) |  | 自定义项 (Custom) |
| 16 | bdef5 | 自定义项5 | bdef5 | varchar(101) |  | 自定义项 (Custom) |
| 17 | bdef6 | 自定义项6 | bdef6 | varchar(101) |  | 自定义项 (Custom) |
| 18 | bdef7 | 自定义项7 | bdef7 | varchar(101) |  | 自定义项 (Custom) |
| 19 | bdef8 | 自定义项8 | bdef8 | varchar(101) |  | 自定义项 (Custom) |
| 20 | bdef9 | 自定义项9 | bdef9 | varchar(101) |  | 自定义项 (Custom) |
| 21 | bdef10 | 自定义项10 | bdef10 | varchar(101) |  | 自定义项 (Custom) |
| 22 | bdef11 | 自定义项11 | bdef11 | varchar(101) |  | 自定义项 (Custom) |
| 23 | bdef12 | 自定义项12 | bdef12 | varchar(101) |  | 自定义项 (Custom) |
| 24 | bdef13 | 自定义项13 | bdef13 | varchar(101) |  | 自定义项 (Custom) |
| 25 | bdef14 | 自定义项14 | bdef14 | varchar(101) |  | 自定义项 (Custom) |
| 26 | bdef15 | 自定义项15 | bdef15 | varchar(101) |  | 自定义项 (Custom) |
| 27 | bdef16 | 自定义项16 | bdef16 | varchar(101) |  | 自定义项 (Custom) |
| 28 | bdef17 | 自定义项17 | bdef17 | varchar(101) |  | 自定义项 (Custom) |
| 29 | bdef18 | 自定义项18 | bdef18 | varchar(101) |  | 自定义项 (Custom) |
| 30 | bdef19 | 自定义项19 | bdef19 | varchar(101) |  | 自定义项 (Custom) |
| 31 | bdef20 | 自定义项20 | bdef20 | varchar(101) |  | 自定义项 (Custom) |