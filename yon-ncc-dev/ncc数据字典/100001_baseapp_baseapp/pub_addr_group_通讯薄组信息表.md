# |<<

**通讯薄组信息表 (pub_addr_group / nc.message.addressbook.vo.VOAddrGroup)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4693.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | PKID | pk_id | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | name2 | 名称2 | name2 | varchar(50) |  | 字符串 (String) |
| 5 | name3 | 名称3 | name3 | varchar(50) |  | 字符串 (String) |
| 6 | name4 | 名称4 | name4 | varchar(50) |  | 字符串 (String) |
| 7 | name5 | 名称5 | name5 | varchar(50) |  | 字符串 (String) |
| 8 | name6 | 名称6 | name6 | varchar(50) |  | 字符串 (String) |
| 9 | nodetype | 节点类型 | nodetype | varchar(50) |  | 字符串 (String) |
| 10 | parentid | 上级节点ID | parentid | varchar(20) |  | 通讯薄组信息表 (VOAddrGroup) |
| 11 | grouptype | 组类型 | grouptype | varchar(50) |  | 字符串 (String) |
| 12 | sourcepk | 来源PK | sourcepk | varchar(50) |  | 字符串 (String) |
| 13 | description | 描述 | description | varchar(200) |  | 字符串 (String) |