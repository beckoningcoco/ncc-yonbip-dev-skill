# |<<

**签证信息 (pcm_contr_visa / nc.vo.pcm.contract.ContrVisaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4352.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contr_visa | 签证信息主键 | pk_contr_visa | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_src_visa | 来源签证主键 | pk_src_visa | varchar(50) |  | 字符串 (String) |
| 7 | src_code | 签证确认单号 | src_code | varchar(50) |  | 字符串 (String) |
| 8 | visa_taxmny | 签证含税金额 | visa_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 10 | billmaketime | 制单日期 | billmaketime | char(19) |  | 日期 (UFDate) |
| 11 | bdef1 | 自定义项1 | bdef1 | varchar(101) |  | 自定义项 (Custom) |
| 12 | bdef2 | 自定义项2 | bdef2 | varchar(101) |  | 自定义项 (Custom) |
| 13 | bdef3 | 自定义项3 | bdef3 | varchar(101) |  | 自定义项 (Custom) |
| 14 | bdef4 | 自定义项4 | bdef4 | varchar(101) |  | 自定义项 (Custom) |
| 15 | bdef5 | 自定义项5 | bdef5 | varchar(101) |  | 自定义项 (Custom) |
| 16 | bdef6 | 自定义项6 | bdef6 | varchar(101) |  | 自定义项 (Custom) |
| 17 | bdef7 | 自定义项7 | bdef7 | varchar(101) |  | 自定义项 (Custom) |
| 18 | bdef8 | 自定义项8 | bdef8 | varchar(101) |  | 自定义项 (Custom) |
| 19 | bdef9 | 自定义项9 | bdef9 | varchar(101) |  | 自定义项 (Custom) |
| 20 | bdef10 | 自定义项10 | bdef10 | varchar(101) |  | 自定义项 (Custom) |
| 21 | bdef11 | 自定义项11 | bdef11 | varchar(101) |  | 自定义项 (Custom) |
| 22 | bdef12 | 自定义项12 | bdef12 | varchar(101) |  | 自定义项 (Custom) |
| 23 | bdef13 | 自定义项13 | bdef13 | varchar(101) |  | 自定义项 (Custom) |
| 24 | bdef14 | 自定义项14 | bdef14 | varchar(101) |  | 自定义项 (Custom) |
| 25 | bdef15 | 自定义项15 | bdef15 | varchar(101) |  | 自定义项 (Custom) |
| 26 | bdef16 | 自定义项16 | bdef16 | varchar(101) |  | 自定义项 (Custom) |
| 27 | bdef17 | 自定义项17 | bdef17 | varchar(101) |  | 自定义项 (Custom) |
| 28 | bdef18 | 自定义项18 | bdef18 | varchar(101) |  | 自定义项 (Custom) |
| 29 | bdef19 | 自定义项19 | bdef19 | varchar(101) |  | 自定义项 (Custom) |
| 30 | bdef20 | 自定义项20 | bdef20 | varchar(101) |  | 自定义项 (Custom) |