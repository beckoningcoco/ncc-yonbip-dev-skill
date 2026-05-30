# |<<

**组织结构_库存统计体系成员 (org_sssmember / nc.vo.corg.StockStatStruMemberVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4175.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sssmember | 库存统计体系成员主键 | pk_sssmember | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(40) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | reltype | 成员类型 | reltype | int | √ | 库存统计体系成员组织类型 (stockstatstrumemberorgtype) |  | 0=虚组织; |