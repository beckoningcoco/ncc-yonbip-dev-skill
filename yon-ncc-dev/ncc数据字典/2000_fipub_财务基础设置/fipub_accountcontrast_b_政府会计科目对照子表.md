# |<<

**政府会计科目对照子表 (fipub_accountcontrast_b / nc.vo.fipub.accountcontrast.AccountContrastBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2265.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accountcontrast_b | 子表主键 | pk_accountcontrast_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | source | 来源科目编码 | source | varchar(20) |  | 会计科目 (accasoa) |
| 4 | pripose | 目的科目编码 | pripose | varchar(20) |  | 会计科目 (accasoa) |
| 5 | valuemessage | 取值信息 | valuemessage | int |  | 取值信息 (valuemessage) | 3 | 1=对照科目; |