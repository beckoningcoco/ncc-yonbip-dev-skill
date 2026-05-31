# |<<

**结账参数实体 (cmp_param / nc.vo.cmp.settleaccount.SettleAccountParamVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1570.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_param | 主键 | pk_param | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | param_code | 参数编码 | param_code | varchar(100) |  | 字符串 (String) |
| 4 | param_name | 参数名 | param_name | varchar(100) |  | 字符串 (String) |
| 5 | param_value | 参数值 | param_value | varchar(100) |  | 字符串 (String) |