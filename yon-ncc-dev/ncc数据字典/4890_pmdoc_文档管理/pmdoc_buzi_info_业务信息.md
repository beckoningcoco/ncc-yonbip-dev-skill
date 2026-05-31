# |<<

**业务信息 (pmdoc_buzi_info / nc.vo.pmdoc.buziinfo.DocBuziInfoHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4570.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_buzi_info | 业务信息主键 | pk_buzi_info | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_bill | 业务单据主键 | pk_bill | varchar(50) |  | 字符串 (String) |
| 4 | bill_type | 业务单据类型 | bill_type | varchar(50) |  | 字符串 (String) |
| 5 | transi_type | 业务单据交易类型 | transi_type | varchar(50) |  | 字符串 (String) |
| 6 | bill_code | 业务单据编码 | bill_code | varchar(300) |  | 字符串 (String) |
| 7 | billinfo | 业务单据信息 | billinfo | varchar(500) |  | 字符串 (String) |
| 8 | filenum | 附件数量 | filenum | int |  | 整数 (Integer) |
| 9 | billmaker | 业务单据制单人 | billmaker | varchar(50) |  | 字符串 (String) |
| 10 | billmaketime | 业务单据制单时间 | billmaketime | varchar(50) |  | 字符串 (String) |
| 11 | hdef1 | 自定义项1 | hdef1 | varchar(101) |  | 自定义项 (Custom) |
| 12 | hdef2 | 自定义项2 | hdef2 | varchar(101) |  | 自定义项 (Custom) |
| 13 | hdef3 | 自定义项3 | hdef3 | varchar(101) |  | 自定义项 (Custom) |
| 14 | hdef4 | 自定义项4 | hdef4 | varchar(101) |  | 自定义项 (Custom) |
| 15 | hdef5 | 自定义项5 | hdef5 | varchar(101) |  | 自定义项 (Custom) |
| 16 | hdef6 | 自定义项6 | hdef6 | varchar(101) |  | 自定义项 (Custom) |
| 17 | hdef7 | 自定义项7 | hdef7 | varchar(101) |  | 自定义项 (Custom) |
| 18 | hdef8 | 自定义项8 | hdef8 | varchar(101) |  | 自定义项 (Custom) |
| 19 | hdef9 | 自定义项9 | hdef9 | varchar(101) |  | 自定义项 (Custom) |
| 20 | hdef10 | 自定义项10 | hdef10 | varchar(101) |  | 自定义项 (Custom) |
| 21 | hdef11 | 自定义项11 | hdef11 | varchar(101) |  | 自定义项 (Custom) |
| 22 | hdef12 | 自定义项12 | hdef12 | varchar(101) |  | 自定义项 (Custom) |
| 23 | hdef13 | 自定义项13 | hdef13 | varchar(101) |  | 自定义项 (Custom) |
| 24 | hdef14 | 自定义项14 | hdef14 | varchar(101) |  | 自定义项 (Custom) |
| 25 | hdef15 | 自定义项15 | hdef15 | varchar(101) |  | 自定义项 (Custom) |
| 26 | hdef16 | 自定义项16 | hdef16 | varchar(101) |  | 自定义项 (Custom) |
| 27 | hdef17 | 自定义项17 | hdef17 | varchar(101) |  | 自定义项 (Custom) |
| 28 | hdef18 | 自定义项18 | hdef18 | varchar(101) |  | 自定义项 (Custom) |
| 29 | hdef19 | 自定义项19 | hdef19 | varchar(101) |  | 自定义项 (Custom) |
| 30 | hdef20 | 自定义项20 | hdef20 | varchar(101) |  | 自定义项 (Custom) |
| 31 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 32 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |