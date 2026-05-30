# |<<

**欧洲银行指令xml表 (ebank_europ_xml / nc.vo.obm.europ.xml.EuropxmlVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1768.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebank_europxml | 主键 | pk_ebank_europxml | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | transnum | 交易总笔数 | transnum | int |  | 整数 (Integer) |
| 6 | totalmny | 交易总金额 | totalmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | xmlinfo | 生成xml记录 | xmlinfo | image |  | BLOB (BLOB) |
| 8 | func | 指令类型 | func | varchar(50) |  | 指令类型 (FuncEnum) |  | credittrans=贷记转账; |