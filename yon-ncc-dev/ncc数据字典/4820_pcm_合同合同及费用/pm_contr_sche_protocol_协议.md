# |<<

**协议 (pm_contr_sche_protocol / nc.vo.pcm.contractschedule.ContractScheProtocolVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4440.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_protocol | 协议主键 | pk_protocol | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | account_number | 账期号 | account_number | int |  | 整数 (Integer) |
| 6 | bal_taxmny | 含税结算额 | bal_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | effectdate | 起算日期 | effectdate | char(19) |  | 日期 (UFDate) |
| 8 | paymentday | 账期天数 | paymentday | int |  | 整数 (Integer) |
| 9 | deadline | 账期到期日 | deadline | char(19) |  | 日期 (UFDate) |
| 10 | last_bal_mny | 剩余结算额 | last_bal_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | curr_expe_mny | 预付款本次冲销 | curr_expe_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | sched_taxmny | 含税进度款 | sched_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | src_bill_type | 来源单据类型 | src_bill_type | varchar(4) |  | 字符串 (String) |
| 14 | src_bill_code | 来源单据编码 | src_bill_code | varchar(20) |  | 字符串 (String) |
| 15 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(40) |  | 字符串 (String) |
| 16 | pk_contr_pay | 付款协议 | pk_contr_pay | varchar(20) |  | 字符串 (String) |
| 17 | oprnum | 操作次数 | oprnum | int |  | 整数 (Integer) | 0 |
| 18 | verify_mny | 核销金额 | verify_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | bdef1 | 自定义项1 | bdef1 | varchar(101) |  | 自定义项 (Custom) |
| 20 | bdef2 | 自定义项2 | bdef2 | varchar(101) |  | 自定义项 (Custom) |
| 21 | bdef3 | 自定义项3 | bdef3 | varchar(101) |  | 自定义项 (Custom) |
| 22 | bdef4 | 自定义项4 | bdef4 | varchar(101) |  | 自定义项 (Custom) |
| 23 | bdef5 | 自定义项5 | bdef5 | varchar(101) |  | 自定义项 (Custom) |
| 24 | bdef6 | 自定义项6 | bdef6 | varchar(101) |  | 自定义项 (Custom) |
| 25 | bdef7 | 自定义项7 | bdef7 | varchar(101) |  | 自定义项 (Custom) |
| 26 | bdef8 | 自定义项8 | bdef8 | varchar(101) |  | 自定义项 (Custom) |
| 27 | bdef9 | 自定义项9 | bdef9 | varchar(101) |  | 自定义项 (Custom) |
| 28 | bdef10 | 自定义项10 | bdef10 | varchar(101) |  | 自定义项 (Custom) |
| 29 | bdef11 | 自定义项11 | bdef11 | varchar(101) |  | 自定义项 (Custom) |
| 30 | bdef12 | 自定义项12 | bdef12 | varchar(101) |  | 自定义项 (Custom) |
| 31 | bdef13 | 自定义项13 | bdef13 | varchar(101) |  | 自定义项 (Custom) |
| 32 | bdef14 | 自定义项14 | bdef14 | varchar(101) |  | 自定义项 (Custom) |
| 33 | bdef15 | 自定义项15 | bdef15 | varchar(101) |  | 自定义项 (Custom) |
| 34 | bdef16 | 自定义项16 | bdef16 | varchar(101) |  | 自定义项 (Custom) |
| 35 | bdef17 | 自定义项17 | bdef17 | varchar(101) |  | 自定义项 (Custom) |
| 36 | bdef18 | 自定义项18 | bdef18 | varchar(101) |  | 自定义项 (Custom) |
| 37 | bdef19 | 自定义项19 | bdef19 | varchar(101) |  | 自定义项 (Custom) |
| 38 | bdef20 | 自定义项20 | bdef20 | varchar(101) |  | 自定义项 (Custom) |