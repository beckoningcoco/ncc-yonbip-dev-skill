# |<<

**通讯薄组明细表 (pub_addr_gpdetail / nc.message.addressbook.vo.VOAddrGpDetail)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4692.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pkid | PKID | pkid | char(20) | √ | 主键 (UFID) |
| 2 | ruleid | 规则ID | ruleid | varchar(20) |  | 通讯薄规则表 (VOAddrRule) |
| 3 | ruleorder | 规则顺序 | ruleorder | int |  | 整数 (Integer) |
| 4 | parameterorder | 参数顺序 | parameterorder | int |  | 整数 (Integer) |
| 5 | parametervalue | 参数值 | parametervalue | varchar(200) |  | 字符串 (String) |
| 6 | directions | 说明 | directions | varchar(200) |  | 字符串 (String) |