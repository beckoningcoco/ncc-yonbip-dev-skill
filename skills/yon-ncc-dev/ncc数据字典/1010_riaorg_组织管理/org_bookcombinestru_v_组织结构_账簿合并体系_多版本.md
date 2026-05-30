# |<<

**组织结构_账簿合并体系_多版本 (org_bookcombinestru_v / nc.vo.vorg.BookCombineStruVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4009.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | 体系版本主键 | pk_vid | char(20) | √ | 主键 (UFID) |
| 2 | pk_bookcombinestru | 账簿合并体系主键 | pk_bookcombinestru | varchar(20) | √ | 组织结构_账簿合并体系 (bookcombinestru) |
| 3 | code | 编码 | code | varchar(40) | √ | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 1 | 1=未启用; |