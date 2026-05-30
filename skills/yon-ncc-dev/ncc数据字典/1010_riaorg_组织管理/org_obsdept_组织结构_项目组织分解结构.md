# |<<

**组织结构_项目组织分解结构 (org_obsdept / nc.vo.corg.OBSDeptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4103.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obsdept | 主键 | pk_obsdept | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属业务单元 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | pk_fatherdept | 上级部门 | pk_fatherdept | varchar(20) |  | 组织结构_项目组织分解结构 (obsdept) |
| 5 | code | 编码 | code | varchar(40) | √ | 字符串 (String) |
| 6 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 7 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | innercode | 内部码 | innercode | varchar(200) |  | 字符串 (String) |
| 9 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 10 | createdate | 部门成立时间 | createdate | char(19) |  | 日期 (UFDate) |
| 11 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |