# |<<

**通讯薄规则表 (pub_addr_rule / nc.message.addressbook.vo.VOAddrRule)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4694.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | PKID | pk_id | varchar(50) | √ | 字符串 (String) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | name2 | 名称2 | name2 | varchar(50) |  | 字符串 (String) |
| 5 | name3 | 名称3 | name3 | varchar(50) |  | 字符串 (String) |
| 6 | name4 | 名称4 | name4 | varchar(50) |  | 字符串 (String) |
| 7 | name5 | 名称5 | name5 | varchar(50) |  | 字符串 (String) |
| 8 | name6 | 名称6 | name6 | varchar(50) |  | 字符串 (String) |
| 9 | classpath | 实现类路径 | classpath | varchar(100) |  | 字符串 (String) |
| 10 | parametercount | 参数个数 | parametercount | varchar(50) |  | 字符串 (String) |
| 11 | directions | 说明 | directions | varchar(200) |  | 备注 (Memo) |
| 12 | parentid | 上级节点ID | parentid | varchar(20) |  | 通讯薄规则表 (VOAddrRule) |