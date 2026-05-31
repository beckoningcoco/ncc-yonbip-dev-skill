# |<<

**单据项目 (fip_billitem / nc.vo.fip.billitem.BillItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2221.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billitem | 对象标识 | pk_billitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | attrcode | 单据项目编码 | attrcode | varchar(50) |  | 字符串 (String) |
| 5 | attrname | 单据项目名称 | attrname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | position | 位置 | position | int |  | 位置 (position) |  | 1=表头; |